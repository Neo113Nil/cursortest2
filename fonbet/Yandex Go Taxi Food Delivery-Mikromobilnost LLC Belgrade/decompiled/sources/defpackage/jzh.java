package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class jzh implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ lzh b;

    public /* synthetic */ jzh(lzh lzhVar, int i) {
        this.a = i;
        this.b = lzhVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        lzh lzhVar = this.b;
        switch (i) {
            case 0:
                ghg ghgVar = (ghg) obj;
                lzhVar.A((m950) ((yvf0) lzhVar.F).get(), new wvi(ghgVar.a), new kzh(0, ghgVar));
                break;
            default:
                ifa0 ifa0Var = (ifa0) obj;
                a5i a5iVar = (a5i) lzhVar.H;
                if (a5iVar.b(ifa0Var)) {
                    a5iVar.a(ifa0Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
