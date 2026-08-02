package xsna;

import java.util.List;

/* compiled from: StartStopToken.kt */
/* loaded from: classes.dex */
public final class dpn0 {
    public final uqk0 a;
    public final Object b = new Object();

    public dpn0(uqk0 uqk0Var) {
        this.a = uqk0Var;
    }

    public final boolean a(svx0 svx0Var) {
        boolean containsKey;
        synchronized (this.b) {
            containsKey = this.a.a.containsKey(svx0Var);
        }
        return containsKey;
    }

    public final List<tqk0> b(String str) {
        List<tqk0> a;
        synchronized (this.b) {
            a = this.a.a(str);
        }
        return a;
    }

    public final tqk0 c(svx0 svx0Var) {
        tqk0 b;
        synchronized (this.b) {
            b = this.a.b(svx0Var);
        }
        return b;
    }

    public final tqk0 d(svx0 svx0Var) {
        tqk0 c;
        synchronized (this.b) {
            c = this.a.c(svx0Var);
        }
        return c;
    }
}
