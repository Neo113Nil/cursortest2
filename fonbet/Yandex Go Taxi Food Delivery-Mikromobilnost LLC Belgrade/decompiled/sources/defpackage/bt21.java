package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.authorized.j;

/* loaded from: classes15.dex */
public final /* synthetic */ class bt21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct21 b;

    public /* synthetic */ bt21(ct21 ct21Var, int i) {
        this.a = i;
        this.b = ct21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ct21 ct21Var = this.b;
        switch (i) {
            case 0:
                j jVar = ct21Var.y;
                z83.g(null, jVar.a.get(), Looper.myLooper());
                ct21Var.c = ((el21) jVar.b.get()).f(ct21Var);
                break;
            case 1:
                z83.g(null, ct21Var.y.a.get(), Looper.myLooper());
                if (ct21Var.w != null) {
                    ct21Var.a.k();
                    e1k e1kVar = ct21Var.w;
                    if (e1kVar != null) {
                        e1kVar.close();
                    }
                    ct21Var.w = null;
                }
                xi3 xi3Var = ct21Var.c;
                if (xi3Var != null) {
                    xi3Var.close();
                }
                ct21Var.c = null;
                break;
            default:
                ct21Var.a.close();
                break;
        }
    }
}
