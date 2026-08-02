package defpackage;

/* loaded from: classes11.dex */
public final class ffb0 implements gy31 {
    public final String a;

    public ffb0(String str) {
        this.a = str;
    }

    @Override // defpackage.gy31
    public final vw01 b(kk2 kk2Var) {
        String str = kk2Var.b;
        String h = vi91.h(str, this.a);
        return new vw01(new kk2(h), new p370(28, str, this, h));
    }
}
