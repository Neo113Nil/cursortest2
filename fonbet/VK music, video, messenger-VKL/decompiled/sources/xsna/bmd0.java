package xsna;

/* compiled from: ProductCardPatch.kt */
/* loaded from: classes18.dex */
public final class bmd0 implements xld0 {
    public final boolean a;

    public bmd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmd0) && this.a == ((bmd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("UpdateReviewInProgress(isReviewInProgress="), this.a, ')');
    }
}
