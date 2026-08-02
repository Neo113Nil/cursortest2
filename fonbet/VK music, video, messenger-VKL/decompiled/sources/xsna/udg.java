package xsna;

/* compiled from: CommentsActionsMenuConfig.kt */
/* loaded from: classes3.dex */
public final class udg {
    public final boolean a;

    public udg() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udg) && this.a == ((udg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CommentsActionsMenuConfig(isGeoBlocked="), this.a, ')');
    }

    public udg(boolean z) {
        this.a = z;
    }
}
