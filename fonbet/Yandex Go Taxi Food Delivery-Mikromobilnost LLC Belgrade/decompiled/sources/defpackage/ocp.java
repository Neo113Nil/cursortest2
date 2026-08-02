package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class ocp implements uis0 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object w;

    public ocp(xtu xtuVar) {
        this.w = xtuVar;
        this.c = new ias(((ici0) xtuVar.c.w).a.timeout());
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                try {
                    ((uis0) obj).close();
                    break;
                } catch (IOException e) {
                    this.b = true;
                    ((d8) obj2).invoke(e);
                    return;
                }
            default:
                xtu xtuVar = (xtu) obj2;
                if (!this.b) {
                    this.b = true;
                    ias iasVar = (ias) obj;
                    ydz0 ydz0Var = iasVar.e;
                    iasVar.e = ydz0.d;
                    ydz0Var.a();
                    ydz0Var.b();
                    xtuVar.d = 3;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                try {
                    ((uis0) this.c).flush();
                    break;
                } catch (IOException e) {
                    this.b = true;
                    ((d8) obj).invoke(e);
                    return;
                }
            default:
                if (!this.b) {
                    ((ici0) ((xtu) obj).c.w).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        switch (this.a) {
            case 0:
                return ((uis0) this.c).timeout();
            default:
                return (ias) this.c;
        }
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        int i = this.a;
        Object obj = this.w;
        switch (i) {
            case 0:
                if (this.b) {
                    yp6Var.skip(j);
                    break;
                } else {
                    try {
                        ((uis0) this.c).write(yp6Var, j);
                        break;
                    } catch (IOException e) {
                        this.b = true;
                        ((d8) obj).invoke(e);
                        return;
                    }
                }
            default:
                if (!this.b) {
                    yf61.a(yp6Var.b, 0L, j);
                    ((ici0) ((xtu) obj).c.w).write(yp6Var, j);
                    break;
                } else {
                    ny61.r("closed");
                    break;
                }
        }
    }

    public ocp(uis0 uis0Var, d8 d8Var) {
        this.c = uis0Var;
        this.w = d8Var;
    }
}
