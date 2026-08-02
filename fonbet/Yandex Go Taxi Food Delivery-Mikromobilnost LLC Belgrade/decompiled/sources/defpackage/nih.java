package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class nih implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;

    public /* synthetic */ nih(tls tlsVar, boolean z, int i) {
        this.a = i;
        this.c = tlsVar;
        this.b = z;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        tls tlsVar = this.c;
        switch (i) {
            case 0:
                tlsVar.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                if (!z) {
                    tlsVar.invoke(vh30.a);
                    break;
                } else {
                    tlsVar.invoke(rh30.a);
                    break;
                }
            case 2:
                if (z) {
                    tlsVar.invoke(udg0.a);
                    break;
                }
                break;
            case 3:
                tlsVar.invoke(Boolean.valueOf(!z));
                break;
            case 4:
                tlsVar.invoke(Boolean.valueOf(!z));
                break;
            default:
                tlsVar.invoke(Boolean.valueOf(!z));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ nih(boolean z, tls tlsVar, int i) {
        this.a = i;
        this.b = z;
        this.c = tlsVar;
    }
}
