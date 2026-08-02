package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.core.impl.utils.executor.b;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class jh3 implements ih3 {
    public fh3 A;
    public b B;
    public long C;
    public AudioManager.AudioRecordingCallback D;
    public AudioRecord a;
    public final m34 b;
    public final int y;
    public final int z;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean w = new AtomicBoolean(false);
    public final AtomicReference x = new AtomicReference(null);
    public boolean E = false;

    public jh3(m34 m34Var, Context context) {
        int i = m34Var.b;
        int i2 = m34Var.d;
        int i3 = m34Var.e;
        if (i > 0 && i2 > 0) {
            if (AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3) > 0) {
                try {
                    new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2 == 1 ? 16 : 12).setEncoding(i3).build();
                    this.b = m34Var;
                    this.z = m34Var.a();
                    int minBufferSize = AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
                    d6z.y(null, minBufferSize > 0);
                    int i4 = minBufferSize * 2;
                    this.y = i4;
                    AudioRecord b = b(i4, m34Var, context);
                    this.a = b;
                    if (b.getState() == 1) {
                        return;
                    }
                    b.release();
                    throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static AudioRecord b(int i, m34 m34Var, Context context) {
        AudioFormat build = new AudioFormat.Builder().setSampleRate(m34Var.b).setChannelMask(m34Var.d == 1 ? 16 : 12).setEncoding(m34Var.e).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            vm2.h(builder, context);
        }
        builder.setAudioSource(m34Var.a);
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e) {
            yci0.r(e);
            return null;
        }
    }

    public final void a() {
        d6z.y("AudioStream has been released.", !this.c.get());
    }

    public final void c(boolean z) {
        b bVar = this.B;
        fh3 fh3Var = this.A;
        if (bVar == null || fh3Var == null || Objects.equals(this.x.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        bVar.execute(new androidx.camera.video.internal.audio.b(fh3Var, z, 2));
    }

    public final void d() {
        a();
        AtomicBoolean atomicBoolean = this.w;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (vbj.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream$AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.a.startRecording();
        if (this.a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException("Unable to start AudioRecord with state: " + this.a.getRecordingState());
        }
        this.C = 0L;
        this.E = false;
        this.x.set(null);
        AudioRecordingConfiguration activeRecordingConfiguration = this.a.getActiveRecordingConfiguration();
        c(activeRecordingConfiguration != null && activeRecordingConfiguration.isClientSilenced());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    @Override // defpackage.ih3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p34 read(ByteBuffer byteBuffer) {
        a();
        d6z.y("AudioStream has not been started.", this.w.get());
        int read = this.a.read(byteBuffer, this.y);
        if (read > 0) {
            byteBuffer.limit(read);
            if (!this.E) {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.a.getTimestamp(audioTimestamp, 0) == 0) {
                    int i = this.b.b;
                    long j = this.C;
                    d6z.m("sampleRate must be greater than 0.", ((long) i) > 0);
                    d6z.m("framePosition must be no less than 0.", j >= 0);
                    long a = audioTimestamp.nanoTime + m1b1.a(i, j - audioTimestamp.framePosition);
                    r1 = a >= 0 ? a : 0L;
                    if (Math.abs(r1 - System.nanoTime()) > 500000000) {
                        this.E = true;
                    }
                    if (r1 == -1) {
                        r1 = System.nanoTime();
                    }
                    this.C = m1b1.d(this.z, read) + this.C;
                } else {
                    sgb1.g(5, "AudioStreamImpl");
                }
            }
            r1 = -1;
            if (r1 == -1) {
            }
            this.C = m1b1.d(this.z, read) + this.C;
        }
        return new p34(read, r1);
    }
}
