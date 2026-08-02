package xsna;

import java.util.LinkedHashMap;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public abstract class qbk {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    public static final class a extends qbk {
        public static final a b = new a();
    }

    /* compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qbk) {
            return epx.f(this.a, ((qbk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
