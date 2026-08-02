package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: ErrorAction.kt */
/* loaded from: classes8.dex */
public interface xup {

    /* compiled from: ErrorAction.kt */
    public static final class a implements xup {
        public final String a;
        public final sht0 b;

        public a(String str, sht0 sht0Var) {
            this.a = str;
            this.b = sht0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ChangeHost(host=" + this.a + ", newSource=" + this.b + ")";
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class b implements xup {
    }

    /* compiled from: ErrorAction.kt */
    public static final class c implements xup {
        public final sht0 a;

        public c(sht0 sht0Var) {
            this.a = sht0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ChangeSource(newSource=" + this.a + ")";
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class d implements xup {
        public final dbn a;

        public d(dbn dbnVar) {
            this.a = dbnVar;
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class e implements xup {
        public final String a;

        public e(String str) {
            this.a = str;
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class f implements xup {
    }

    /* compiled from: ErrorAction.kt */
    public static final class g implements xup {
        public final long a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g() {
            this(eoo.e(0, DurationUnit.MILLISECONDS));
            zno.a aVar = zno.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zno.d(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            zno.a aVar = zno.c;
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return zr.a("Retry(delay=", zno.m(this.a), ")");
        }

        public g(long j) {
            this.a = j;
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class h implements xup {
        public final long a;

        public h(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return qlb0.a(this.a, "SeekForward(seekForwardMs=", ")");
        }
    }

    /* compiled from: ErrorAction.kt */
    public static final class i implements xup {
    }
}
