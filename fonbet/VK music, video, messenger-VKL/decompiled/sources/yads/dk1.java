package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public final class dk1 {
    public final sh1 a;
    public final Object b = new Object();
    public String c;

    public dk1(sh1 sh1Var) {
        this.a = sh1Var;
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = ((uh1) this.a).c("YmadMauid");
                }
                str = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.b) {
            this.c = str;
            ((uh1) this.a).a("YmadMauid", str);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
