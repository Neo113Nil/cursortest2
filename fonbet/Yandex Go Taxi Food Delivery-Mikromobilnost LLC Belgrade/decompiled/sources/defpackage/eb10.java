package defpackage;

/* loaded from: classes10.dex */
public abstract class eb10 {
    public final Object a;
    public boolean b;
    public boolean c;
    public int d;

    public eb10(Object obj) {
        this.a = obj;
    }

    public final boolean a() {
        return this.b || this.c;
    }

    public void b() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
    }

    public abstract void c();

    public final void d() {
        if (this.b || this.c) {
            yci0.t(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
        } else {
            this.b = true;
            c();
        }
    }
}
