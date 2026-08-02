package xsna;

import org.json.JSONObject;

/* compiled from: Subscriber.kt */
/* loaded from: classes5.dex */
public final class zwm0<T> {
    public final dre0<T> a;
    public final String b;
    public final Object c;
    public final ig d;
    public final kr50 e;
    public final ggk f;
    public final zyb0 g;
    public final ci6 h;

    public zwm0(dre0 dre0Var, String str, Object obj, ig igVar, kr50 kr50Var, ggk ggkVar, zyb0 zyb0Var, ci6 ci6Var) {
        this.a = dre0Var;
        this.b = str;
        this.c = obj;
        this.d = igVar;
        this.e = kr50Var;
        this.f = ggkVar;
        this.g = zyb0Var;
        this.h = ci6Var;
    }

    public final Object a() {
        return this.c;
    }

    public final void b(JSONObject jSONObject) {
        dre0<T> dre0Var = this.a;
        try {
            this.f.invoke(dre0Var.a(jSONObject));
        } catch (Throwable th) {
            sdy.j(true);
            if (th instanceof InterruptedException) {
                throw th;
            }
            i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + dre0Var.b(), th));
        }
    }

    public final void c(Exception exc) {
        try {
            this.h.invoke(exc);
        } catch (Throwable th) {
            sdy.j(true);
            if (th instanceof InterruptedException) {
                throw th;
            }
            i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + this.a.b(), th));
        }
    }
}
