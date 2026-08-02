package defpackage;

/* loaded from: classes15.dex */
public final class bcg implements xvf0 {
    public final /* synthetic */ int a;
    public final vbb b;

    public /* synthetic */ bcg(vbb vbbVar, int i) {
        this.a = i;
        this.b = vbbVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        vbb vbbVar = this.b;
        switch (i) {
            case 0:
                return ((p8g) vbbVar.b).p();
            case 1:
                iv21 iv21Var = (iv21) ((p8g) vbbVar.b).B0.get();
                q5z.h(iv21Var);
                return iv21Var;
            default:
                wk31 wk31Var = (wk31) ((p8g) vbbVar.b).I1.get();
                q5z.h(wk31Var);
                return wk31Var;
        }
    }
}
