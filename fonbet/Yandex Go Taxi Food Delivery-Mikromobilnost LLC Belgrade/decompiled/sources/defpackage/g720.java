package defpackage;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes15.dex */
public abstract class g720 {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final Map b;

    static {
        z620 z620Var = z620.d;
    }

    public g720(String str) {
        this.a = str;
        this.b = g8e.z("source", str);
    }

    public Map a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public String c() {
        i3y i3yVar = vjt0.a;
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        g720 g720Var = obj instanceof g720 ? (g720) obj : null;
        return g720Var != null && getClass().equals(g720Var.getClass()) && this.a.equals(g720Var.a) && jl40.l(a(), ((g720) obj).a());
    }

    public int hashCode() {
        return Objects.hash(this.a, a());
    }
}
