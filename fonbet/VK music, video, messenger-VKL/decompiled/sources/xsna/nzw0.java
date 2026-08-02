package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VoipSelectMovieState.kt */
/* loaded from: classes7.dex */
public abstract class nzw0 implements km50 {

    /* compiled from: VoipSelectMovieState.kt */
    public static abstract class a extends nzw0 {

        /* compiled from: VoipSelectMovieState.kt */
        /* renamed from: xsna.nzw0$a$a, reason: collision with other inner class name */
        public static final class C3429a extends a {
            public final CharSequence b;
            public final p3x0 c;
            public final boolean d;
            public final set0 e;
            public final List<p3x0> f;
            public final a990<Integer> g;

            public C3429a(CharSequence charSequence, p3x0 p3x0Var, boolean z, set0 set0Var, List<p3x0> list, a990<Integer> a990Var) {
                this.b = charSequence;
                this.c = p3x0Var;
                this.d = z;
                this.e = set0Var;
                this.f = list;
                this.g = a990Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static C3429a m(C3429a c3429a, p3x0 p3x0Var, boolean z, set0 set0Var, ArrayList arrayList, a990 a990Var, int i) {
                p3x0 p3x0Var2 = p3x0Var;
                CharSequence charSequence = c3429a.b;
                if ((i & 2) != 0) {
                    p3x0Var2 = c3429a.c;
                }
                if ((i & 4) != 0) {
                    z = c3429a.d;
                }
                if ((i & 8) != 0) {
                    set0Var = c3429a.e;
                }
                List list = arrayList;
                if ((i & 16) != 0) {
                    list = c3429a.f;
                }
                if ((i & 32) != 0) {
                    a990Var = c3429a.g;
                }
                a990 a990Var2 = a990Var;
                c3429a.getClass();
                List list2 = list;
                set0 set0Var2 = set0Var;
                return new C3429a(charSequence, p3x0Var2, z, set0Var2, list2, a990Var2);
            }

            @Override // xsna.nzw0
            public final p3x0 a() {
                return this.c;
            }

            @Override // xsna.nzw0
            public final boolean b() {
                return this.d;
            }

            @Override // xsna.nzw0
            public final set0 c() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3429a)) {
                    return false;
                }
                C3429a c3429a = (C3429a) obj;
                return epx.f(this.b, c3429a.b) && epx.f(this.c, c3429a.c) && this.d == c3429a.d && epx.f(this.e, c3429a.e) && epx.f(this.f, c3429a.f) && epx.f(this.g, c3429a.g);
            }

            @Override // xsna.nzw0.a
            public final CharSequence h() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                p3x0 p3x0Var = this.c;
                return this.g.hashCode() + fw3.a((this.e.hashCode() + qoy.b((hashCode + (p3x0Var == null ? 0 : p3x0Var.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
            }

            public final String toString() {
                return "Content(query=" + ((Object) this.b) + ", activeVideo=" + this.c + ", canControlVideo=" + this.d + ", filters=" + this.e + ", items=" + this.f + ", pageContent=" + this.g + ')';
            }
        }

        /* compiled from: VoipSelectMovieState.kt */
        public static final class b extends a {
            public final CharSequence b;
            public final p3x0 c;
            public final boolean d;
            public final set0 e;
            public final Throwable f;

            public b(CharSequence charSequence, p3x0 p3x0Var, boolean z, set0 set0Var, Throwable th) {
                this.b = charSequence;
                this.c = p3x0Var;
                this.d = z;
                this.e = set0Var;
                this.f = th;
            }

            public static b m(b bVar, p3x0 p3x0Var, boolean z, set0 set0Var, int i) {
                CharSequence charSequence = bVar.b;
                if ((i & 2) != 0) {
                    p3x0Var = bVar.c;
                }
                p3x0 p3x0Var2 = p3x0Var;
                if ((i & 4) != 0) {
                    z = bVar.d;
                }
                boolean z2 = z;
                if ((i & 8) != 0) {
                    set0Var = bVar.e;
                }
                Throwable th = bVar.f;
                bVar.getClass();
                return new b(charSequence, p3x0Var2, z2, set0Var, th);
            }

            @Override // xsna.nzw0
            public final p3x0 a() {
                return this.c;
            }

            @Override // xsna.nzw0
            public final boolean b() {
                return this.d;
            }

            @Override // xsna.nzw0
            public final set0 c() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
            }

            @Override // xsna.nzw0.a
            public final CharSequence h() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                p3x0 p3x0Var = this.c;
                return this.f.hashCode() + ((this.e.hashCode() + qoy.b((hashCode + (p3x0Var == null ? 0 : p3x0Var.hashCode())) * 31, 31, this.d)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(query=");
                sb.append((Object) this.b);
                sb.append(", activeVideo=");
                sb.append(this.c);
                sb.append(", canControlVideo=");
                sb.append(this.d);
                sb.append(", filters=");
                sb.append(this.e);
                sb.append(", error=");
                return oq.c(sb, this.f, ')');
            }
        }

        /* compiled from: VoipSelectMovieState.kt */
        public static final class c extends a {
            public final CharSequence b;
            public final p3x0 c;
            public final boolean d;
            public final set0 e;

            public c(CharSequence charSequence, p3x0 p3x0Var, boolean z, set0 set0Var) {
                this.b = charSequence;
                this.c = p3x0Var;
                this.d = z;
                this.e = set0Var;
            }

            public static c m(c cVar, p3x0 p3x0Var, boolean z, set0 set0Var, int i) {
                CharSequence charSequence = cVar.b;
                if ((i & 2) != 0) {
                    p3x0Var = cVar.c;
                }
                if ((i & 4) != 0) {
                    z = cVar.d;
                }
                if ((i & 8) != 0) {
                    set0Var = cVar.e;
                }
                cVar.getClass();
                return new c(charSequence, p3x0Var, z, set0Var);
            }

            @Override // xsna.nzw0
            public final p3x0 a() {
                return this.c;
            }

            @Override // xsna.nzw0
            public final boolean b() {
                return this.d;
            }

            @Override // xsna.nzw0
            public final set0 c() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && epx.f(this.e, cVar.e);
            }

            @Override // xsna.nzw0.a
            public final CharSequence h() {
                return this.b;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                p3x0 p3x0Var = this.c;
                return this.e.hashCode() + qoy.b((hashCode + (p3x0Var == null ? 0 : p3x0Var.hashCode())) * 31, 31, this.d);
            }

            public final String toString() {
                return "Loading(query=" + ((Object) this.b) + ", activeVideo=" + this.c + ", canControlVideo=" + this.d + ", filters=" + this.e + ')';
            }
        }

        public abstract CharSequence h();
    }

    /* compiled from: VoipSelectMovieState.kt */
    public static final class b extends nzw0 {
        public final p3x0 b;
        public final boolean c;
        public final set0 d;

        public b(p3x0 p3x0Var, boolean z, set0 set0Var) {
            this.b = p3x0Var;
            this.c = z;
            this.d = set0Var;
        }

        @Override // xsna.nzw0
        public final p3x0 a() {
            return this.b;
        }

        @Override // xsna.nzw0
        public final boolean b() {
            throw null;
        }

        @Override // xsna.nzw0
        public final set0 c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            p3x0 p3x0Var = this.b;
            return this.d.hashCode() + qoy.b((p3x0Var == null ? 0 : p3x0Var.hashCode()) * 31, 31, this.c);
        }

        public final String toString() {
            return "VideoTabs(activeVideo=" + this.b + ", canControlVideo=" + this.c + ", filters=" + this.d + ')';
        }
    }

    public abstract p3x0 a();

    public abstract boolean b();

    public abstract set0 c();
}
