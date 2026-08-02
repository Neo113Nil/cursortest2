package xsna;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AudioExtractor.kt */
/* loaded from: classes3.dex */
public final class pn4 {
    public final qn4 a;
    public final izs<Float, s3q0> b;
    public MediaMuxer c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public pn4(qn4 qn4Var, izs<? super Float, s3q0> izsVar) {
        this.a = qn4Var;
        this.b = izsVar;
    }

    public final void a() {
        try {
            qn4 qn4Var = this.a;
            File file = qn4Var.a;
            File file2 = qn4Var.b;
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int trackCount = mediaExtractor.getTrackCount();
            this.c = new MediaMuxer(file2.getAbsolutePath(), 0);
            HashMap<Integer, Integer> hashMap = new HashMap<>(trackCount);
            int b = b(trackCount, mediaExtractor, hashMap);
            if (b < 0) {
                b = 8192;
            }
            c(b, mediaExtractor, hashMap);
        } finally {
            MediaMuxer mediaMuxer = this.c;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
            }
            MediaMuxer mediaMuxer2 = this.c;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
            this.c = null;
        }
    }

    public final int b(int i, MediaExtractor mediaExtractor, HashMap<Integer, Integer> hashMap) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
            String string = trackFormat.getString("mime");
            if (string != null && brm0.B(string, "audio/", false)) {
                mediaExtractor.selectTrack(i3);
                MediaMuxer mediaMuxer = this.c;
                if (mediaMuxer == null) {
                    return -1;
                }
                hashMap.put(Integer.valueOf(i3), Integer.valueOf(mediaMuxer.addTrack(trackFormat)));
                if (trackFormat.containsKey("max-input-size")) {
                    i2 = Math.max(i2, trackFormat.getInteger("max-input-size"));
                }
            }
        }
        return i2;
    }

    public final void c(int i, MediaExtractor mediaExtractor, HashMap<Integer, Integer> hashMap) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaMuxer mediaMuxer = this.c;
        if (mediaMuxer != null) {
            mediaMuxer.start();
        }
        while (!this.d.get()) {
            bufferInfo.offset = 0;
            int readSampleData = mediaExtractor.readSampleData(allocate, 0);
            bufferInfo.size = readSampleData;
            if (readSampleData < 0) {
                bufferInfo.size = 0;
                return;
            }
            bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
            bufferInfo.flags = mediaExtractor.getSampleFlags();
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            MediaMuxer mediaMuxer2 = this.c;
            if (mediaMuxer2 != null) {
                Integer num = hashMap.get(Integer.valueOf(sampleTrackIndex));
                if (num == null) {
                    throw new NullPointerException("Pointing to null at track index map");
                }
                mediaMuxer2.writeSampleData(num.intValue(), allocate, bufferInfo);
            }
            mediaExtractor.advance();
            float millis = TimeUnit.MICROSECONDS.toMillis(mediaExtractor.getSampleTime()) / this.a.c;
            if (millis > 1.0f) {
                millis = 1.0f;
            }
            this.b.invoke(Float.valueOf(millis));
        }
    }
}
