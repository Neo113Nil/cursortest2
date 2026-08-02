package xsna;

/* compiled from: OneLogNewDomainOldStatConfig.kt */
/* loaded from: classes11.dex */
public final class aj80 {
    public static final a b = new a();
    public final boolean a;

    /* compiled from: OneLogNewDomainOldStatConfig.kt */
    public static final class a {
    }

    public aj80() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj80) && this.a == ((aj80) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("OneLogNewDomainOldStatConfig(isOldDomainOldStatDisabled="), this.a, ')');
    }

    public aj80(boolean z) {
        this.a = z;
    }
}
