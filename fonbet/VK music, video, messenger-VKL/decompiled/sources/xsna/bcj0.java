package xsna;

/* compiled from: AnalyticsActionProvider.kt */
/* loaded from: classes5.dex */
public final class bcj0 extends r9l {
    public jbj0 b;
    public String c;

    @Override // xsna.r9l
    public final synchronized void a(String str) {
        try {
            jbj0 jbj0Var = this.b;
            if (jbj0Var == null) {
                this.c = str;
            } else {
                jbj0Var.invoke(Integer.valueOf(this.a), str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.r9l
    public final synchronized void b(jbj0 jbj0Var) {
        try {
            if (epx.f(this.c, "NO_EXTRAS")) {
                this.b = jbj0Var;
            } else {
                jbj0Var.invoke(Integer.valueOf(this.a), this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
