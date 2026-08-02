package xsna;

/* compiled from: AutoClearFocusBehavior.android.kt */
@vby
/* loaded from: classes11.dex */
public final class we5 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof we5) {
            return this.a == ((we5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return uqi.a("AutoClearFocusBehavior(value=", this.a, ')');
    }
}
