package xsna;

import com.google.gson.Gson;
import xsna.m0q;

/* compiled from: StateWrapper.kt */
/* loaded from: classes5.dex */
public final class wuk0 {
    public static final Gson c = new Gson();
    public final m0q.a a;
    public final m0q.a b;

    /* compiled from: StateWrapper.kt */
    public static final class a {
        public static wuk0 a(x9y x9yVar) {
            return (wuk0) wuk0.c.fromJson((b9y) x9yVar, wuk0.class);
        }

        public static String b(wuk0 wuk0Var) {
            return wuk0.c.toJson(wuk0Var);
        }
    }

    public wuk0() {
        this(null, null);
    }

    public final m0q a() {
        m0q m0qVar = new m0q();
        m0qVar.b = this.a;
        m0qVar.c = this.b;
        return m0qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuk0)) {
            return false;
        }
        wuk0 wuk0Var = (wuk0) obj;
        return epx.f(this.a, wuk0Var.a) && epx.f(this.b, wuk0Var.b);
    }

    public final int hashCode() {
        m0q.a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        m0q.a aVar2 = this.b;
        return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "StateWrapper(lastState=" + this.a + ", lastNavState=" + this.b + ')';
    }

    public wuk0(m0q.a aVar, m0q.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }
}
