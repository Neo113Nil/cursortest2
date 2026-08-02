package defpackage;

/* loaded from: classes6.dex */
public final class ebm implements g18 {
    public final /* synthetic */ int a = 0;
    public final sls b;
    public final Object c;

    public ebm(lbm lbmVar, sls slsVar) {
        this.c = lbmVar;
        this.b = slsVar;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        Object obj = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                lbm lbmVar = (lbm) obj;
                ((nac) lbmVar).g = true;
                try {
                    ((nac) lbmVar).a();
                    slsVar.invoke();
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                slsVar.invoke();
                ((sey) obj).b.remove(this);
                break;
        }
    }

    public ebm(sls slsVar, sey seyVar) {
        this.b = slsVar;
        this.c = seyVar;
    }
}
