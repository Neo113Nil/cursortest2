package defpackage;

/* loaded from: classes12.dex */
public final /* synthetic */ class ifa implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wj90 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ifa(wj90 wj90Var, tls tlsVar, int i) {
        this.a = i;
        this.b = wj90Var;
        this.c = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        wj90 wj90Var = this.b;
        switch (i) {
            case 0:
                ila ilaVar = wj90Var.c;
                if (ilaVar != null) {
                    tlsVar.invoke(ilaVar);
                    break;
                }
                break;
            case 1:
                ila ilaVar2 = wj90Var.c;
                if (ilaVar2 != null) {
                    tlsVar.invoke(new tha(ilaVar2));
                    break;
                }
                break;
            case 2:
                ila ilaVar3 = wj90Var.c;
                if (ilaVar3 != null) {
                    tlsVar.invoke(ilaVar3);
                    break;
                }
                break;
            case 3:
                ila ilaVar4 = wj90Var.c;
                if (ilaVar4 != null) {
                    tlsVar.invoke(ilaVar4);
                    break;
                }
                break;
            default:
                ila ilaVar5 = wj90Var.c;
                if (ilaVar5 != null) {
                    tlsVar.invoke(ilaVar5);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
