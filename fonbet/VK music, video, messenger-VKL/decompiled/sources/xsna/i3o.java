package xsna;

import ru.ok.android.commons.http.Http;

/* compiled from: DonutTeaserAction.kt */
/* loaded from: classes4.dex */
public interface i3o extends kj50 {

    /* compiled from: DonutTeaserAction.kt */
    public static final class a implements i3o {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1294532882;
        }

        public final String toString() {
            return Http.Header.ACCEPT;
        }
    }

    /* compiled from: DonutTeaserAction.kt */
    public static final class b implements i3o {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 598075566;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DonutTeaserAction.kt */
    public static final class c implements i3o {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2058736742;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: DonutTeaserAction.kt */
    public static final class d implements i3o {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1748595553;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    /* compiled from: DonutTeaserAction.kt */
    public static final class e implements i3o {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1294971074;
        }

        public final String toString() {
            return "ResetToDefaultTeaserText";
        }
    }

    /* compiled from: DonutTeaserAction.kt */
    public static final class f implements i3o {
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
            int hashCode = this.b.hashCode() * 31;
            int i = qko0.c;
            return Long.hashCode(this.c) + hashCode;
        }

        public final String toString() {
            return "TeaserTextChanged(text=" + this.b + ", selection=" + ((Object) qko0.h(this.c)) + ')';
        }
    }
}
