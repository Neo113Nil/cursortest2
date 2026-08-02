package xsna;

/* compiled from: OneLogNewDomainNewStatConfig.kt */
/* loaded from: classes11.dex */
public final class zi80 {
    public static final a b = new a();
    public final boolean a;

    /* compiled from: OneLogNewDomainNewStatConfig.kt */
    public static final class a {
    }

    public zi80() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi80) && this.a == ((zi80) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("OneLogNewDomainNewStatConfig(isOldStatDisabled="), this.a, ')');
    }

    public zi80(boolean z) {
        this.a = z;
    }
}
