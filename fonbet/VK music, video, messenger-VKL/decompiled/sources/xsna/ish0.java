package xsna;

import com.vk.search.params.api.SearchParams;
import java.util.List;

/* compiled from: SearchFeatureSideEffect.kt */
/* loaded from: classes5.dex */
public interface ish0 {

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class a implements ish0 {
        public final List<ish0> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends ish0> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Batch(sideEffects="), this.a);
        }
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class b implements c {
        public static final b a = new b();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public interface c extends ish0 {
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class d implements l {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ChangeQueryViewHint(hint=null)";
        }
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class e implements c {
        public static final e a = new e();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class f implements k {
        public final SearchParams a;

        public f(SearchParams searchParams) {
            this.a = searchParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ConfigParams(currentParams=" + this.a + ')';
        }
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class g implements c {
        public static final g a = new g();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class h implements l {
        public static final h a = new h();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public interface i extends ish0 {
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class j implements i {
        public static final j a = new j();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public interface k extends ish0 {
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public interface l extends ish0 {
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class m implements n {
        public static final m a = new m();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public interface n extends c {
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class o implements c {
        public final yqh0 a;

        public o(yqh0 yqh0Var) {
            this.a = yqh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RestoreCatalogToSnapshot(snapshot=" + this.a + ')';
        }
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class p implements l {
        public static final p a = new p();
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class q implements n {
        public final boolean a;

        public q(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a == ((q) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Sync(scrollToTopOnSync="), this.a, ')');
        }
    }

    /* compiled from: SearchFeatureSideEffect.kt */
    public static final class r implements c {
        public final dsh0 a;

        public r(dsh0 dsh0Var) {
            this.a = dsh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateSearchRequest(request=" + this.a + ')';
        }
    }
}
