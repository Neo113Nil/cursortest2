package xsna;

import java.util.ArrayList;

/* compiled from: VoipSelectMoviePatch.kt */
/* loaded from: classes7.dex */
public abstract class kzw0 implements xl50 {

    /* compiled from: VoipSelectMoviePatch.kt */
    public static final class a extends kzw0 {
        public static final a b = new a();
    }

    /* compiled from: VoipSelectMoviePatch.kt */
    public static final class b extends kzw0 {
        public final set0 b;

        public b(set0 set0Var) {
            this.b = set0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FiltersChanged(filters=" + this.b + ')';
        }
    }

    /* compiled from: VoipSelectMoviePatch.kt */
    public static abstract class c extends kzw0 {

        /* compiled from: VoipSelectMoviePatch.kt */
        public static final class a extends c {
            public final CharSequence b;
            public final set0 c;
            public final Throwable d;

            public a(CharSequence charSequence, set0 set0Var, Throwable th) {
                this.b = charSequence;
                this.c = set0Var;
                this.d = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(query=");
                sb.append((Object) this.b);
                sb.append(", filters=");
                sb.append(this.c);
                sb.append(", throwable=");
                return oq.c(sb, this.d, ')');
            }
        }

        /* compiled from: VoipSelectMoviePatch.kt */
        public static final class b extends c {
            public final CharSequence b;
            public final set0 c;
            public final ArrayList d;
            public final int e;

            public b(CharSequence charSequence, set0 set0Var, ArrayList arrayList, int i) {
                this.b = charSequence;
                this.c = set0Var;
                this.d = arrayList;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + qr.a(this.d, (this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(query=");
                sb.append((Object) this.b);
                sb.append(", filters=");
                sb.append(this.c);
                sb.append(", items=");
                sb.append(this.d);
                sb.append(", count=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: VoipSelectMoviePatch.kt */
        /* renamed from: xsna.kzw0$c$c, reason: collision with other inner class name */
        public static final class C3221c extends c {
            public final CharSequence b;
            public final set0 c;

            public C3221c(CharSequence charSequence, set0 set0Var) {
                this.b = charSequence;
                this.c = set0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3221c)) {
                    return false;
                }
                C3221c c3221c = (C3221c) obj;
                return epx.f(this.b, c3221c.b) && epx.f(this.c, c3221c.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Start(query=" + ((Object) this.b) + ", filters=" + this.c + ')';
            }
        }
    }

    /* compiled from: VoipSelectMoviePatch.kt */
    public static abstract class d extends kzw0 {

        /* compiled from: VoipSelectMoviePatch.kt */
        public static final class a extends d {
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipSelectMoviePatch.kt */
        public static final class b extends d {
            public final ArrayList b;
            public final int c;

            public b(ArrayList arrayList, int i) {
                this.b = arrayList;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(items=");
                sb.append(this.b);
                sb.append(", count=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: VoipSelectMoviePatch.kt */
        public static final class c extends d {
            public static final c b = new c();
        }
    }

    /* compiled from: VoipSelectMoviePatch.kt */
    public static final class e extends kzw0 {
        public final p3x0 b;

        public e(p3x0 p3x0Var) {
            this.b = p3x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            p3x0 p3x0Var = this.b;
            if (p3x0Var == null) {
                return 0;
            }
            return p3x0Var.hashCode();
        }

        public final String toString() {
            return "MovieChanged(movie=" + this.b + ')';
        }
    }
}
