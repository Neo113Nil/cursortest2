package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class ejw extends hjw {
    public final List a;

    public ejw(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejw) && this.a.equals(((ejw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
