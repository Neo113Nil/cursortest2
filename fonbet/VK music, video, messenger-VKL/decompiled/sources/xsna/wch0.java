package xsna;

/* compiled from: ScreenSpinnerState.kt */
/* loaded from: classes17.dex */
public interface wch0 {

    /* compiled from: ScreenSpinnerState.kt */
    public static final class a implements wch0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 183949777;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: ScreenSpinnerState.kt */
    public interface b extends wch0 {

        /* compiled from: ScreenSpinnerState.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 776443635;
            }

            public final String toString() {
                return "FullVideoLoading";
            }
        }

        /* compiled from: ScreenSpinnerState.kt */
        /* renamed from: xsna.wch0$b$b, reason: collision with other inner class name */
        public static final class C3927b implements b {
            public final boolean a;
            public final boolean b;

            public C3927b(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3927b)) {
                    return false;
                }
                C3927b c3927b = (C3927b) obj;
                return this.a == c3927b.a && this.b == c3927b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PinnedChange(isPinAction=");
                sb.append(this.a);
                sb.append(", isSuccess=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }
}
