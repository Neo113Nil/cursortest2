package org.webrtc.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.fp;
import xsna.odj;
import xsna.tj0;

/* loaded from: classes9.dex */
class WebRtcSilenceProvider {
    private static final String TAG = "WebRtcSilenceProvider";
    private final int audioFormat;
    private final long bufferDurationNs;
    private final int channelCount;
    private long lastReadTimeNs;
    private final int sampleRate;
    private final byte[] silenceBytes;
    private final Statistics statistics = new Statistics(0);

    public static class Statistics {
        private static final long LOG_INTERVAL = TimeUnit.SECONDS.toNanos(15);
        private long lastLogTimeNs;
        private int readCount;
        private long totalReadTimeNs;
        private long totalSleepTimeMs;

        public /* synthetic */ Statistics(int i) {
            this();
        }

        private void reset() {
            this.totalSleepTimeMs = 0L;
            this.totalReadTimeNs = 0L;
            this.readCount = 0;
        }

        public void trackRead(long j, long j2, long j3) {
            int i = this.readCount + 1;
            this.readCount = i;
            if (j3 > 0) {
                this.totalSleepTimeMs += j3;
            }
            long j4 = (j2 - j) + this.totalReadTimeNs;
            this.totalReadTimeNs = j4;
            long j5 = j2 - this.lastLogTimeNs;
            long j6 = LOG_INTERVAL;
            if (j5 > j6) {
                long j7 = this.totalSleepTimeMs / i;
                long millis = TimeUnit.NANOSECONDS.toMillis(j4 / i);
                this.lastLogTimeNs = j2;
                int i2 = this.readCount;
                StringBuilder b = fp.b(j6, "Log interval: ", "ns, log delta: ");
                b.append(j5);
                b.append("ns, reads: ");
                b.append(i2);
                tj0.d(b, ", read time: ", millis, "ms, suspend time: ");
                b.append(j7);
                b.append(UcumUtils.UCUM_MILLISECODS);
                Logging.d(WebRtcSilenceProvider.TAG, b.toString());
                reset();
            }
        }

        private Statistics() {
        }
    }

    public WebRtcSilenceProvider(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.sampleRate = i2;
        this.audioFormat = i;
        this.channelCount = i3;
        long nanos = (i4 * TimeUnit.SECONDS.toNanos(1L)) / i2;
        this.bufferDurationNs = nanos;
        if (bArr == null || i5 != bArr.length) {
            bArr = new byte[i5 < 0 ? 0 : i5];
        }
        this.silenceBytes = bArr;
        long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
        int length = bArr.length;
        StringBuilder a = odj.a(i2, i4, "Silence provider initialized, sampleRate=", ", framesPerBuffer=", ", bufferDuration=");
        a.append(millis);
        a.append("ms, bufferCapacity=");
        a.append(length);
        Logging.d(TAG, a.toString());
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannelCount() {
        return this.channelCount;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int read(ByteBuffer byteBuffer, int i) {
        int min = Math.min(i, byteBuffer.capacity());
        int i2 = 0;
        while (i2 < min) {
            int min2 = Math.min(byteBuffer.remaining(), this.silenceBytes.length);
            if (min2 == 0) {
                break;
            }
            byteBuffer.put(this.silenceBytes, byteBuffer.position(), min2);
            i2 += min2;
        }
        long nanoTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(this.bufferDurationNs - (nanoTime - this.lastReadTimeNs));
        if (millis > 0) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException unused) {
                Logging.d(TAG, "Interrupted while waiting for frame duration, return immediately");
            }
        }
        long nanoTime2 = System.nanoTime();
        this.lastReadTimeNs = nanoTime2;
        this.statistics.trackRead(nanoTime, nanoTime2, millis);
        return i2;
    }
}
