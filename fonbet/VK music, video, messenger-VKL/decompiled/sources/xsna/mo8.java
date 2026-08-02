package xsna;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: BusinessNotificationsRouterImpl.kt */
/* loaded from: classes18.dex */
public final class mo8 implements iz20, lb9 {
    public final Object b;

    public /* synthetic */ mo8(Object obj) {
        this.b = obj;
    }

    public synchronized void a(Object obj) {
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            ((suk0) it.next()).a(obj);
        }
    }

    @Override // xsna.iz20
    public void n(dw20 dw20Var) {
        ((u0q0) this.b).c();
    }

    @Override // xsna.lb9
    public void onFailure(okhttp3.d dVar, IOException iOException) {
        ((lzi0) this.b).l(iOException);
    }

    @Override // xsna.lb9
    public void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
        ((lzi0) this.b).k(uVar);
    }

    public mo8(int i) {
        switch (i) {
            case 8:
                this.b = new HashSet();
                break;
            default:
                this.b = new HashMap();
                new HashMap();
                break;
        }
    }

    public mo8(String str, int i) {
        this.b = (i & 1) != 0 ? null : str;
    }
}
