package defpackage;

/* loaded from: classes12.dex */
public abstract class py9 {
    public by9 a;

    public final cy9 a(Throwable th) {
        cy9 b = b(th);
        if (b != null) {
            return b;
        }
        by9 by9Var = this.a;
        if (by9Var != null) {
            return by9Var.a(th);
        }
        return null;
    }

    public abstract cy9 b(Throwable th);
}
