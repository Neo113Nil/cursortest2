package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: CoverChooseAction.kt */
/* loaded from: classes7.dex */
public interface f0k extends lj50 {

    /* compiled from: CoverChooseAction.kt */
    public static final class a implements f0k {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -184783530;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: CoverChooseAction.kt */
    public interface b extends f0k {

        /* compiled from: CoverChooseAction.kt */
        public static final class a implements b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("DrawError(t="), this.b, ')');
            }
        }

        /* compiled from: CoverChooseAction.kt */
        /* renamed from: xsna.f0k$b$b, reason: collision with other inner class name */
        public static final class C2843b implements b {
            public final Rect b;

            public C2843b(Rect rect) {
                this.b = rect;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2843b) && epx.f(this.b, ((C2843b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return yq.c(new StringBuilder("Init(coverRect="), this.b, ')');
            }
        }

        /* compiled from: CoverChooseAction.kt */
        public static final class c implements b {
            public final Matrix b;

            public c(Matrix matrix) {
                this.b = matrix;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MatrixUpdate(matrix=" + this.b + ')';
            }
        }
    }

    /* compiled from: CoverChooseAction.kt */
    public static final class c implements f0k {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1098365186;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }

    /* compiled from: CoverChooseAction.kt */
    public interface d extends f0k {

        /* compiled from: CoverChooseAction.kt */
        public static final class a implements d {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1497930537;
            }

            public final String toString() {
                return "ButtonBackClick";
            }
        }

        /* compiled from: CoverChooseAction.kt */
        public static final class b implements d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1187500260;
            }

            public final String toString() {
                return "ButtonDoneClick";
            }
        }
    }
}
