package xsna;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: AudioChannelMixProcessor.kt */
/* loaded from: classes3.dex */
public final class zl4 extends qc4 {
    public final SparseArray<yl4> i = new SparseArray<>();
    public final AudioPcm j;
    public zq4 k;

    public zl4() {
        AudioPcm audioPcm = new AudioPcm(Integer.MIN_VALUE, Integer.MIN_VALUE, AudioPcm.EncodingType.UNSET);
        this.j = audioPcm;
        this.k = new zq4(audioPcm, audioPcm);
    }

    @Override // xsna.qt4
    public final void queueInput(ByteBuffer byteBuffer) {
        char c;
        yl4 yl4Var;
        float f;
        float f2;
        yl4 yl4Var2 = this.i.get(this.c.b);
        int remaining = byteBuffer.remaining() / this.c.e;
        int i = this.d.e * remaining;
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        this.h = byteBuffer2;
        zq4 zq4Var = this.k;
        AudioPcm audioPcm = zq4Var.b;
        AudioPcm audioPcm2 = zq4Var.a;
        boolean z = audioPcm2.d;
        AudioPcm.EncodingType encodingType = audioPcm2.c;
        if (!z) {
            throw new IllegalStateException(("AudioMixer inputAudioFormat is not valid: " + audioPcm2).toString());
        }
        boolean z2 = audioPcm.d;
        AudioPcm.EncodingType encodingType2 = audioPcm.c;
        if (!z2) {
            throw new IllegalStateException(("AudioMixer mixAudioFormat is not valid: " + audioPcm).toString());
        }
        AudioPcm.EncodingType encodingType3 = AudioPcm.EncodingType.PCM_16BIT;
        boolean z3 = encodingType == encodingType3;
        boolean z4 = encodingType2 == encodingType3;
        int i2 = yl4Var2.a;
        int i3 = yl4Var2.b;
        float[] fArr = new float[i2];
        float[] fArr2 = new float[i3];
        for (int i4 = 0; i4 < remaining; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                if (z3 && z3) {
                    f2 = byteBuffer.getShort();
                } else if (z3) {
                    float f3 = byteBuffer.getFloat();
                    f2 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.max(-32768.0f, Math.min(f3 * 32768.0f, 32767.0f)) : Math.max(-32768.0f, Math.min(f3 * 32767.0f, 32767.0f));
                } else if (z3) {
                    short s = byteBuffer.getShort();
                    f2 = s < 0 ? s / 32768.0f : s / 32767.0f;
                } else {
                    f2 = byteBuffer.getFloat();
                }
                fArr[i5] = f2;
            }
            int i6 = 0;
            while (i6 < i3) {
                int i7 = 0;
                while (i7 < i2) {
                    float f4 = fArr[i7];
                    float f5 = fArr2[i6];
                    float f6 = yl4Var2.c[(i7 * i3) + i6] * f4;
                    float a = zq4.a(f5, encodingType2);
                    float a2 = zq4.a(f6, encodingType);
                    int i8 = i6;
                    if (a >= 0.5f || a2 >= 0.5f) {
                        yl4Var = yl4Var2;
                        float f7 = 2;
                        f = (((a + a2) * f7) - ((f7 * a) * a2)) - 1;
                    } else {
                        f = a * a2 * 2;
                        yl4Var = yl4Var2;
                    }
                    fArr2[i8] = encodingType2 == AudioPcm.EncodingType.PCM_16BIT ? f >= 0.5f ? (f - 0.5f) * 2 * OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND : pm0.a(f, 2, 1.0f, -32768) : (f * 2.0f) - 1.0f;
                    i7++;
                    yl4Var2 = yl4Var;
                    i6 = i8;
                }
                int i9 = i6;
                yl4 yl4Var3 = yl4Var2;
                if (z4) {
                    c = 65024;
                    byteBuffer2.putShort((short) Math.max(-32768.0f, Math.min(fArr2[i9], 32767.0f)));
                } else {
                    c = 65024;
                    byteBuffer2.putFloat(Math.max(-1.0f, Math.min(fArr2[i9], 1.0f)));
                }
                fArr2[i9] = 0.0f;
                i6 = i9 + 1;
                yl4Var2 = yl4Var3;
            }
        }
        byteBuffer2.flip();
    }
}
