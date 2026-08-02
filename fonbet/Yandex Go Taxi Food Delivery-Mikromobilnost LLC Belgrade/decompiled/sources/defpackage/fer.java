package defpackage;

/* loaded from: classes12.dex */
public final class fer implements h62 {
    public final /* synthetic */ fwi a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wg6 c;
    public final /* synthetic */ m3u0 d;

    public fer(fwi fwiVar, boolean z, wg6 wg6Var, m3u0 m3u0Var) {
        this.a = fwiVar;
        this.b = z;
        this.c = wg6Var;
        this.d = m3u0Var;
    }

    @Override // defpackage.h62
    public final float getHeight() {
        return this.a.w0(((y7m) this.d.getValue()).a) + (this.b ? this.c.C.getIntValue() : 0);
    }
}
