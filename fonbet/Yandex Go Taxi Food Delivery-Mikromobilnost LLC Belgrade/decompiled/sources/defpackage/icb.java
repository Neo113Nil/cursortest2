package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class icb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kcb b;
    public final /* synthetic */ lcb c;

    public /* synthetic */ icb(kcb kcbVar, lcb lcbVar, int i) {
        this.a = i;
        this.b = kcbVar;
        this.c = lcbVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lcb lcbVar = this.c;
        kcb kcbVar = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                kcbVar.c.c(oll0Var, lcbVar);
                break;
            default:
                kcbVar.b.d(oll0Var, lcbVar);
                break;
        }
        return zy11Var;
    }
}
