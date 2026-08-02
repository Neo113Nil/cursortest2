package xsna;

import java.util.Map;

/* compiled from: CatalogBadgeInfoUpdate.kt */
/* loaded from: classes6.dex */
public final class f1a {
    public final Object a;

    public f1a(Map<String, Integer> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1a) && this.a.equals(((f1a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("CatalogBadgeInfoUpdate(data="), this.a, ')');
    }
}
