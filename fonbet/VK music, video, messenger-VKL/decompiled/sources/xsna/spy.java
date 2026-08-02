package xsna;

import java.util.LinkedHashMap;

/* compiled from: ConstraintLayoutBaseScope.kt */
/* loaded from: classes11.dex */
public abstract class spy {
    public final Object a;

    public spy(Object obj) {
        this.a = obj;
        new LinkedHashMap();
    }

    public Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof spy) && epx.f(a(), ((spy) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
