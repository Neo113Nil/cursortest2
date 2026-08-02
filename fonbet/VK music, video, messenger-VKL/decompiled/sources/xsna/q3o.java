package xsna;

import xsna.tlo0;

/* compiled from: DonutTeaserPatch.kt */
/* loaded from: classes4.dex */
public interface q3o extends xl50 {

    /* compiled from: DonutTeaserPatch.kt */
    public static final class a implements q3o {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 411816217;
        }

        public final String toString() {
            return "Loaded";
        }
    }

    /* compiled from: DonutTeaserPatch.kt */
    public static final class b implements q3o {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2126584936;
        }

        public final String toString() {
            return "ResetToDefaultText";
        }
    }

    /* compiled from: DonutTeaserPatch.kt */
    public static final class c implements q3o {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetLoadingState(isLoading="), this.b, ')');
        }
    }

    /* compiled from: DonutTeaserPatch.kt */
    public static final class d implements q3o {
        public final tlo0.f b;

        public d(tlo0.f fVar) {
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b.equals(((d) obj).b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a);
        }

        public final String toString() {
            return pr.b(new StringBuilder("ShowError(errorTextSource="), this.b, ')');
        }
    }

    /* compiled from: DonutTeaserPatch.kt */
    public static final class e implements q3o {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1866792068;
        }

        public final String toString() {
            return "ShowLoader";
        }
    }

    /* compiled from: DonutTeaserPatch.kt */
    public static final class f implements q3o {
        public final String b;
        public final long c;

        public f(String str, long j) {
            this.b = str;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && qko0.b(this.c, fVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = str == null ? 0 : str.hashCode();
            int i = qko0.c;
            return Long.hashCode(this.c) + (hashCode * 31);
        }

        public final String toString() {
            return "UpdateTeaserText(text=" + this.b + ", selection=" + ((Object) qko0.h(this.c)) + ')';
        }
    }
}
