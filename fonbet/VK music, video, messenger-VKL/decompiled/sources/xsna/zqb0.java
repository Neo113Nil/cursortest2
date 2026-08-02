package xsna;

import xsna.xrb0;

/* compiled from: PollPatch.kt */
/* loaded from: classes6.dex */
public interface zqb0 extends xl50 {

    /* compiled from: PollPatch.kt */
    public interface a extends zqb0 {
        xrb0.a h();
    }

    /* compiled from: PollPatch.kt */
    public static final class b implements zqb0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1165076929;
        }

        public final String toString() {
            return "AutoClose";
        }
    }

    /* compiled from: PollPatch.kt */
    public static final class c implements zqb0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2009691923;
        }

        public final String toString() {
            return "End";
        }
    }

    /* compiled from: PollPatch.kt */
    public static final class d implements zqb0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2123799621;
        }

        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: PollPatch.kt */
    public static final class e implements zqb0 {
        public final xrb0.d b;

        public e(xrb0.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "PresetAnswers(action=" + this.b + ')';
        }
    }
}
