package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class b5h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ uwy c;
    public final /* synthetic */ he10 w;

    public /* synthetic */ b5h(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = uwyVar;
        this.w = he10Var;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        he10 he10Var = this.w;
        uwy uwyVar = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onLoadCanceled(h42Var, uwyVar, he10Var);
                break;
            default:
                j42Var.onLoadCompleted(h42Var, uwyVar, he10Var);
                break;
        }
    }
}
