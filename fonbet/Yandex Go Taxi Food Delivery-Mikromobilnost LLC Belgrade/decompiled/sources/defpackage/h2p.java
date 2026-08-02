package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class h2p implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcn b;

    public /* synthetic */ h2p(gcn gcnVar, int i) {
        this.a = i;
        this.b = gcnVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gcn gcnVar = this.b;
        switch (i) {
            case 0:
                gcnVar.a(new ck7(zy11Var, null));
                break;
            case 1:
                fmr0.Companion.getClass();
                gcnVar.a(new ck7(new fmr0(true), null));
                break;
            case 2:
                fmr0.Companion.getClass();
                gcnVar.a(new ck7(new fmr0(false), null));
                break;
            case 3:
                ckr0.Companion.getClass();
                gcnVar.a(new ck7(new ckr0(true), null));
                break;
            default:
                ckr0.Companion.getClass();
                gcnVar.a(new ck7(new ckr0(false), null));
                break;
        }
        return zy11Var;
    }
}
