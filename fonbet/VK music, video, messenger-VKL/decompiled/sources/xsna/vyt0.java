package xsna;

import androidx.lifecycle.e0;

/* compiled from: ViewModelProviderImpl.kt */
/* loaded from: classes.dex */
public final class vyt0 {
    public final wyt0 a;
    public final e0.c b;
    public final qbk c;
    public final bbq d = new bbq();

    public vyt0(wyt0 wyt0Var, e0.c cVar, qbk qbkVar) {
        this.a = wyt0Var;
        this.b = cVar;
        this.c = qbkVar;
    }

    public final nyt0 a(String str, rfc rfcVar) {
        nyt0 nyt0Var;
        nyt0 a;
        synchronized (this.d) {
            try {
                nyt0Var = (nyt0) this.a.a.get(str);
                if (rfcVar.c(nyt0Var)) {
                    Object obj = this.b;
                    if (obj instanceof e0.e) {
                        ((e0.e) obj).d(nyt0Var);
                    }
                } else {
                    fg50 fg50Var = new fg50(this.c);
                    fg50Var.a(androidx.lifecycle.e0.b, str);
                    e0.c cVar = this.b;
                    try {
                        try {
                            a = cVar.b(rfcVar, fg50Var);
                        } catch (AbstractMethodError unused) {
                            a = cVar.a(rfcVar.a());
                        }
                    } catch (AbstractMethodError unused2) {
                        a = cVar.c(rfcVar.a(), fg50Var);
                    }
                    nyt0Var = a;
                    nyt0 nyt0Var2 = (nyt0) this.a.a.put(str, nyt0Var);
                    if (nyt0Var2 != null) {
                        nyt0Var2.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nyt0Var;
    }
}
