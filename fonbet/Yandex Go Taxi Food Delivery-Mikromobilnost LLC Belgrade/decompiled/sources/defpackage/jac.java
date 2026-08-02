package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class jac implements hxy {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1k b;

    public /* synthetic */ jac(g1k g1kVar, int i) {
        this.a = i;
        this.b = g1kVar;
    }

    @Override // defpackage.hxy
    public final void cancel() {
        int i = this.a;
        g1k g1kVar = this.b;
        switch (i) {
            case 0:
                g1kVar.dispose();
                break;
            case 1:
                g1kVar.dispose();
                break;
            case 2:
                g1kVar.dispose();
                break;
            case 3:
                g1kVar.dispose();
                break;
            default:
                g1kVar.dispose();
                break;
        }
    }
}
