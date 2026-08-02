package xsna;

import com.vk.media.pipeline.audio.AudioPcm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AudioBaseProcessor.kt */
/* loaded from: classes3.dex */
public abstract class qc4 implements qt4 {
    public final ByteBuffer a;
    public final AudioPcm b;
    public AudioPcm c;
    public AudioPcm d;
    public AudioPcm e;
    public AudioPcm f;
    public ByteBuffer g;
    public ByteBuffer h;

    public qc4() {
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        this.a = order;
        AudioPcm audioPcm = new AudioPcm(Integer.MIN_VALUE, Integer.MIN_VALUE, AudioPcm.EncodingType.UNSET);
        this.b = audioPcm;
        this.c = audioPcm;
        this.d = audioPcm;
        this.e = audioPcm;
        this.f = audioPcm;
        this.g = order;
        this.h = order;
    }

    @Override // xsna.qt4
    public final AudioPcm a(AudioPcm audioPcm) {
        if (!audioPcm.d) {
            throw new IllegalArgumentException(("Wrong audio format=" + audioPcm).toString());
        }
        this.e = audioPcm;
        zl4 zl4Var = (zl4) this;
        if (audioPcm.c != AudioPcm.EncodingType.PCM_16BIT) {
            throw new IllegalArgumentException(("Wrong audio format=" + audioPcm).toString());
        }
        yl4 yl4Var = zl4Var.i.get(audioPcm.b);
        AudioPcm a = yl4Var.d ? zl4Var.j : AudioPcm.a(audioPcm, 0, yl4Var.b, 5);
        this.f = a;
        return a.d ? a : this.b;
    }

    @Override // xsna.qt4
    public final void flush() {
        this.h = this.a;
        this.c = this.e;
        this.d = this.f;
        zl4 zl4Var = (zl4) this;
        zl4Var.k = new zq4(zl4Var.c, zl4Var.d);
    }

    @Override // xsna.qt4
    public final ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.h;
        this.h = this.a;
        return byteBuffer;
    }
}
