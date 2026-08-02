package xsna;

/* compiled from: LinkViewModel.kt */
/* loaded from: classes7.dex */
public final class ddz {
    public final b a;
    public final a b;

    /* compiled from: LinkViewModel.kt */
    public static abstract class a {

        /* compiled from: LinkViewModel.kt */
        /* renamed from: xsna.ddz$a$a, reason: collision with other inner class name */
        public static final class C2723a extends a {
            public final Throwable a;

            public C2723a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2723a) && epx.f(this.a, ((C2723a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: LinkViewModel.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: LinkViewModel.kt */
        public static final class c extends a {
            public final boolean a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final Boolean g;

            public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool) {
                this.a = z;
                this.b = z2;
                this.c = z3;
                this.d = z4;
                this.e = z5;
                this.f = z6;
                this.g = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && epx.f(this.g, cVar.g);
            }

            public final int hashCode() {
                int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
                Boolean bool = this.g;
                return b + (bool == null ? 0 : bool.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Info(isAnonJoinForbidden=");
                sb.append(this.a);
                sb.append(", canModifyLink=");
                sb.append(this.b);
                sb.append(", waitingRoomFeatureActivated=");
                sb.append(this.c);
                sb.append(", waitingRoomEnabled=");
                sb.append(this.d);
                sb.append(", feedbackFeatureActivated=");
                sb.append(this.e);
                sb.append(", feedbackEnabled=");
                sb.append(this.f);
                sb.append(", isServiceChatEnabled=");
                return tn.a(sb, this.g, ')');
            }
        }

        /* compiled from: LinkViewModel.kt */
        public static final class d extends a {
            public static final d a = new d();
        }
    }

    /* compiled from: LinkViewModel.kt */
    public static abstract class b {

        /* compiled from: LinkViewModel.kt */
        public static final class a extends b {
            public final Throwable a;
            public final String b;

            public a(Throwable th, String str) {
                this.a = th;
                this.b = str;
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
                StringBuilder sb = new StringBuilder("Error(error=");
                sb.append(this.a);
                sb.append(", requestCode=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: LinkViewModel.kt */
        /* renamed from: xsna.ddz$b$b, reason: collision with other inner class name */
        public static final class C2724b extends b {
            public static final C2724b a = new C2724b();
        }

        /* compiled from: LinkViewModel.kt */
        public static final class c extends b {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("None(isJustInited="), this.a, ')');
            }
        }

        /* compiled from: LinkViewModel.kt */
        public static final class d extends b {
            public final String a;
            public final String b;

            public d(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Ready(link=");
                sb.append(this.a);
                sb.append(", requestCode=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    public ddz(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddz)) {
            return false;
        }
        ddz ddzVar = (ddz) obj;
        return epx.f(this.a, ddzVar.a) && epx.f(this.b, ddzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkViewModel(linkState=" + this.a + ", callState=" + this.b + ')';
    }
}
