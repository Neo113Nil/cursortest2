package xsna;

/* compiled from: AlbumDetailsSkeleton.kt */
/* loaded from: classes4.dex */
public final class yxj0 {
    public final boolean a;

    public yxj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxj0) && this.a == ((yxj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("Skeleton(showHeader="), this.a, ')');
    }
}
