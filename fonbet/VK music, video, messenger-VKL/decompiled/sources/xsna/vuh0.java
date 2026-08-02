package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: SearchHistoryConfig.kt */
/* loaded from: classes3.dex */
public final class vuh0 {
    public final long a;

    public vuh0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuh0) && this.a == ((vuh0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("Default(cachedItemsLifetimeMs="));
    }

    public vuh0(int i) {
        this.a = TimeUnit.HOURS.toMillis(1L);
    }
}
