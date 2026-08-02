package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class kn41 {
    public final Set a;

    public kn41(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn41) && this.a.equals(((kn41) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + unr0.e(g8e.e(this.a, -182582931, 31), 31, true);
    }

    public final String toString() {
        return vfc.q(new StringBuilder("Url(key=available_features, value="), this.a, ", exclusive=true, overrideOriginalParam=false)");
    }
}
