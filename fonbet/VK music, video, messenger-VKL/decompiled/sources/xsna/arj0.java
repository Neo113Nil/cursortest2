package xsna;

/* compiled from: SimpleImageTranscoderFactory.java */
/* loaded from: classes12.dex */
public final class arj0 implements gmw {
    public final int a;

    public arj0(int i) {
        this.a = i;
    }

    @Override // xsna.gmw
    public final fmw createImageTranscoder(siw siwVar, boolean z) {
        return new zqj0(z, this.a);
    }
}
