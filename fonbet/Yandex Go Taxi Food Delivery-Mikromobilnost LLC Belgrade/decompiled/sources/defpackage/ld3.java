package defpackage;

/* loaded from: classes4.dex */
public final class ld3 extends o2 {
    public final /* synthetic */ int a;
    public o2 b;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        switch (this.a) {
            case 0:
                return (zvf) this.b;
            case 1:
                c2 c2Var = new c2(2);
                c2Var.a((e4x0) this.b);
                return new jqf(c2Var);
            default:
                c2 c2Var2 = new c2(2);
                c2Var2.a((d79) this.b);
                return new jqf(c2Var2);
        }
    }
}
