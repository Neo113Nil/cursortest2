package defpackage;

/* loaded from: classes11.dex */
public final class mx40 implements h62 {
    public final /* synthetic */ tx40 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wg6 c;

    public mx40(tx40 tx40Var, boolean z, wg6 wg6Var) {
        this.a = tx40Var;
        this.b = z;
        this.c = wg6Var;
    }

    @Override // defpackage.h62
    public final float getHeight() {
        return this.a.getFloatValue() + (this.b ? this.c.C.getIntValue() : 0);
    }
}
