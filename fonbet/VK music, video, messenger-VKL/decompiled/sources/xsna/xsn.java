package xsna;

/* compiled from: DoNotKillRootFragmentsConfig.kt */
/* loaded from: classes11.dex */
public final class xsn {
    public static final a b = new a();
    public static final xsn c = new xsn(false);
    public final boolean a;

    /* compiled from: DoNotKillRootFragmentsConfig.kt */
    public static final class a {
    }

    public xsn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsn) && this.a == ((xsn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("DoNotKillRootFragmentsConfig(rootHistoryAllowsDuplicates="), this.a, ')');
    }
}
