package xsna;

import java.util.List;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class lwf0 extends n3a {
    public final List<String> a;

    public lwf0(List<String> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwf0) && epx.f(this.a, ((lwf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("RemoveBlocksWithIdsCmd(blockIdsToRemove="), this.a);
    }
}
