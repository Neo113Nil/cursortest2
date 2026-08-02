package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class u37 implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u37(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((yok0) this.b).b(null);
                break;
            default:
                vw20 vw20Var = (vw20) this.b;
                vw20Var.dismiss();
                vw20Var.j.s();
                break;
        }
    }
}
