package xsna;

/* compiled from: StoryBoxGifSticker.kt */
/* loaded from: classes5.dex */
public final class uzl0 extends g4m0 implements c0m0 {
    public final Object v;
    public final boolean w;

    public uzl0(wk2 wk2Var, String str, String str2, Object obj, boolean z) {
        super(wk2Var, str, str2);
        this.v = obj;
        this.w = z;
    }

    @Override // xsna.g4m0, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new uzl0(this.h, this.i, this.j, this.v, false));
    }

    @Override // xsna.c0m0
    public final Object g() {
        return this.v;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerLayerType() {
        return this.w ? 2 : 6;
    }
}
