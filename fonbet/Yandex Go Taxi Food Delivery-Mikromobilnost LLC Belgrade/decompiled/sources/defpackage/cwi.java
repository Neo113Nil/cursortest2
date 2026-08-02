package defpackage;

/* loaded from: classes14.dex */
public final class cwi implements awi {
    public final fif a;
    public l30 b;
    public int c;

    public cwi(fif fifVar) {
        this.a = fifVar;
    }

    public final void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            l30 l30Var = this.b;
            if (l30Var != null) {
                l30Var.cancel();
            }
            this.b = null;
        }
        if (this.c < 0) {
            jgz jgzVar = jgz.a;
            jgz.c(new IllegalStateException("Zone mode cancelled more times than provided"));
        }
    }

    public final void b() {
        if (this.c == 0) {
            this.b = this.a.c(new ydf(1));
        }
        this.c++;
    }
}
