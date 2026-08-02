package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AudioProcessor.java */
/* loaded from: classes3.dex */
public final class st4 {
    public final byte[] a;
    public final androidx.media3.common.audio.e b;
    public final ByteBuffer c;
    public ByteBuffer d;
    public boolean e;

    public st4(float f, float f2, int i, int i2, int i3) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException();
        }
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException();
        }
        this.a = new byte[i3];
        androidx.media3.common.audio.e eVar = new androidx.media3.common.audio.e(false);
        eVar.f(f);
        eVar.e(f2);
        eVar.c = -1;
        try {
            eVar.b(new AudioProcessor.a(i, i2, 2));
            eVar.a(AudioProcessor.b.b);
        } catch (Exception unused) {
            eVar = null;
        }
        this.b = eVar;
        this.c = eVar != null ? ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder()) : null;
        this.d = eVar != null ? eVar.getOutput() : null;
    }

    @Nullable
    public static st4 a(float f, float f2, int i, int i2, int i3) {
        if (f == 1.0f && f2 == 1.0f) {
            return null;
        }
        return new st4(f, f2, i, i2, i3);
    }

    public final int b() {
        androidx.media3.common.audio.e eVar = this.b;
        if (eVar == null) {
            return 0;
        }
        if (!this.d.hasRemaining()) {
            ByteBuffer output = eVar.getOutput();
            this.d = output;
            if (!output.hasRemaining()) {
                return 0;
            }
        }
        int remaining = this.d.remaining();
        byte[] bArr = this.a;
        int min = Math.min(remaining, bArr.length);
        this.d.get(bArr, 0, min);
        return min;
    }

    public final void c(int i, @NonNull byte[] bArr) {
        androidx.media3.common.audio.e eVar = this.b;
        if (eVar != null) {
            ByteBuffer byteBuffer = this.c;
            byteBuffer.clear();
            byteBuffer.put(bArr, 0, i);
            byteBuffer.flip();
            eVar.queueInput(byteBuffer);
            if (byteBuffer.hasRemaining()) {
                tv4.b("data remained", com.vk.metrics.eventtracking.b.a);
            }
        }
    }
}
