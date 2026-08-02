package xsna;

/* compiled from: VkStatEvent.kt */
/* loaded from: classes5.dex */
public final class slv0 {
    public static final Object f = new Object();
    public static int g;
    public static slv0 h;
    public String b;
    public slv0 d;
    public volatile boolean e;
    public String a = "";
    public final al3 c = new al3();

    public final void a(Object obj, String str) {
        al3 al3Var = this.c;
        synchronized (al3Var.c) {
            try {
                if (al3Var.b + 1 < al3Var.a.size()) {
                    al3Var.a.set(al3Var.b, str);
                    al3Var.a.set(al3Var.b + 1, obj);
                } else {
                    al3Var.a.add(str);
                    al3Var.a.add(obj);
                }
                al3Var.b += 2;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.e) {
            synchronized (f) {
                if (this.e) {
                    this.e = false;
                    al3 al3Var = this.c;
                    synchronized (al3Var.c) {
                        al3Var.b = 0;
                        s3q0 s3q0Var = s3q0.a;
                    }
                    int i = g;
                    if (i < 32) {
                        this.d = h;
                        h = this;
                        g = i + 1;
                    }
                }
            }
        }
    }
}
