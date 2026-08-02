package xsna;

/* compiled from: SmartCropAction.kt */
/* loaded from: classes7.dex */
public interface d4k0 extends lj50 {

    /* compiled from: SmartCropAction.kt */
    public interface a extends d4k0 {

        /* compiled from: SmartCropAction.kt */
        /* renamed from: xsna.d4k0$a$a, reason: collision with other inner class name */
        public static final class C2704a implements a {
            public static final C2704a b = new C2704a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2704a);
            }

            public final int hashCode() {
                return -74303868;
            }

            public final String toString() {
                return "ButtonAbortClick";
            }
        }

        /* compiled from: SmartCropAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 737633890;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: SmartCropAction.kt */
        public static final class c implements a {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -742365232;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class b implements d4k0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 383649184;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class c implements d4k0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -691960342;
        }

        public final String toString() {
            return "BottomBarButtonClick";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public interface d extends d4k0 {

        /* compiled from: SmartCropAction.kt */
        public static final class a implements d {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -744377284;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: SmartCropAction.kt */
        public static final class b implements d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1841685608;
            }

            public final String toString() {
                return "ButtonExitClick";
            }
        }

        /* compiled from: SmartCropAction.kt */
        public static final class c implements d {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 79650346;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class e implements d4k0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1236561233;
        }

        public final String toString() {
            return "FragmentOnDestroy";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class f implements d4k0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2141066598;
        }

        public final String toString() {
            return "ProgressModalDismiss";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class g implements d4k0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1980101660;
        }

        public final String toString() {
            return "PublishClipScreenResultError";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class h implements d4k0, uj50 {
        public final boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SmartCropChanged(isChecked="), this.b, ')');
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class i implements d4k0 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1766724407;
        }

        public final String toString() {
            return "SnackbarDismiss";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public static final class j implements d4k0 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -800924921;
        }

        public final String toString() {
            return "TopBarBackClick";
        }
    }

    /* compiled from: SmartCropAction.kt */
    public interface k extends d4k0 {

        /* compiled from: SmartCropAction.kt */
        public static final class a implements k, uj50 {
            public final q500 b;
            public final long c;

            public a(long j, q500 q500Var) {
                this.b = q500Var;
                this.c = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DragFinished(newBoundsMs=");
                sb.append(this.b);
                sb.append(", newThumbsOffsetMs=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: SmartCropAction.kt */
        public static final class b implements k, uj50 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1750426395;
            }

            public final String toString() {
                return "DragStarted";
            }
        }
    }
}
