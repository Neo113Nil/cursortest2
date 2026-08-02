package defpackage;

import io.appmetrica.analytics.impl.AbstractC0364gg;

/* loaded from: classes.dex */
public final /* synthetic */ class c82 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ c82(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                slsVar.invoke();
                break;
            case 1:
                slsVar.invoke();
                break;
            case 2:
                slsVar.invoke();
                break;
            case 3:
                slsVar.invoke();
                break;
            case 4:
                slsVar.invoke();
                break;
            case 5:
                slsVar.invoke();
                break;
            case 6:
                slsVar.invoke();
                break;
            default:
                AbstractC0364gg.b(slsVar);
                break;
        }
    }
}
