package xsna;

/* compiled from: NetworkCommonExperiment.kt */
/* loaded from: classes11.dex */
public final class s260 {
    public static final a b = new a();
    public final boolean a;

    /* compiled from: NetworkCommonExperiment.kt */
    public static final class a {
    }

    public s260() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s260) && this.a == ((s260) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("NetworkCommonExperiment(shouldUseStatExecutor="), this.a, ')');
    }

    public s260(boolean z) {
        this.a = z;
    }
}
