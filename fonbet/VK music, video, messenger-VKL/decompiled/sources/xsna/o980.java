package xsna;

import java.util.Set;

/* compiled from: DialogsListLoaderUpdate.kt */
/* loaded from: classes18.dex */
public final class o980 implements zsm {
    public final Set<Long> a;

    public o980(Set<Long> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o980) && epx.f(this.a, ((o980) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("OnMsgUpdate(dialogIds="), this.a, ')');
    }
}
