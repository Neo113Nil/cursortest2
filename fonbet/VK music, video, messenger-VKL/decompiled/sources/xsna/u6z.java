package xsna;

/* compiled from: LikesBehaviorConfig.kt */
/* loaded from: classes16.dex */
public final class u6z {
    public final boolean a;

    public u6z() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6z) && this.a == ((u6z) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("LikesBehaviorConfig(isRemoveLikeAllowed="), this.a, ')');
    }

    public u6z(boolean z) {
        this.a = z;
    }
}
