package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public final /* synthetic */ class gwu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hwu b;

    public /* synthetic */ gwu(hwu hwuVar, int i) {
        this.a = i;
        this.b = hwuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        hwu hwuVar = this.b;
        switch (i) {
            case 0:
                h0w h0wVar = hwuVar.k;
                kgx[] kgxVarArr = hwu.l;
                kgx kgxVar = kgxVarArr[0];
                yf7 yf7Var = (yf7) ((AtomicReference) h0wVar.c).get();
                if (yf7Var != null) {
                    yf7Var.cancel();
                }
                h0wVar.setValue(hwuVar, kgxVarArr[0], null);
                break;
            case 1:
                hwuVar.a();
                break;
            default:
                hwuVar.a();
                break;
        }
    }
}
