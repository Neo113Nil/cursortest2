package defpackage;

/* loaded from: classes13.dex */
public final /* synthetic */ class bve implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ cve c;

    public /* synthetic */ bve(Runnable runnable, cve cveVar, int i) {
        this.a = i;
        this.b = runnable;
        this.c = cveVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cve cveVar = this.c;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                cveVar.a();
                break;
            default:
                runnable.run();
                cveVar.a();
                break;
        }
        return zy11Var;
    }
}
