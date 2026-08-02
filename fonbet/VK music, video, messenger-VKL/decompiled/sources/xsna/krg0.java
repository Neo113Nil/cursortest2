package xsna;

import java.util.Collections;
import java.util.Set;

/* compiled from: RuStorePushOverrideConfig.kt */
/* loaded from: classes6.dex */
public final class krg0 {
    public static final a c = new a();
    public static final Set<String> d;
    public static final krg0 e;
    public final boolean a;
    public final Set<String> b;

    /* compiled from: RuStorePushOverrideConfig.kt */
    public static final class a {
        public static krg0 a() {
            return krg0.e;
        }
    }

    static {
        Set<String> singleton = Collections.singleton("any");
        d = singleton;
        e = new krg0(singleton, false);
    }

    public krg0(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krg0)) {
            return false;
        }
        krg0 krg0Var = (krg0) obj;
        return this.a == krg0Var.a && epx.f(this.b, krg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuStorePushOverrideConfig(enabled=");
        sb.append(this.a);
        sb.append(", overrideEngine=");
        return ur.c(sb, this.b, ')');
    }
}
