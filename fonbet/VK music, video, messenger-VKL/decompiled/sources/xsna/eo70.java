package xsna;

import com.vk.silentauth.SilentAuthInfo;

/* compiled from: OAuthProvider.kt */
/* loaded from: classes15.dex */
public abstract class eo70 {

    /* compiled from: OAuthProvider.kt */
    public static final class a extends eo70 {
    }

    /* compiled from: OAuthProvider.kt */
    public static final class b extends eo70 {
        public static final b a = new b();
    }

    /* compiled from: OAuthProvider.kt */
    public static final class c extends eo70 {
        public final a a;

        /* compiled from: OAuthProvider.kt */
        public interface a {

            /* compiled from: OAuthProvider.kt */
            /* renamed from: xsna.eo70$c$a$a, reason: collision with other inner class name */
            public static final class C2827a implements a {
                public final String a;

                public C2827a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2827a) && epx.f(this.a, ((C2827a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("AnotherAccount(sid="), this.a, ')');
                }
            }

            /* compiled from: OAuthProvider.kt */
            public static final class b implements a {
                public final String a;
                public final String b;

                public b(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AnotherWay(login=");
                    sb.append(this.a);
                    sb.append(", sid=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: OAuthProvider.kt */
            /* renamed from: xsna.eo70$c$a$c, reason: collision with other inner class name */
            public static final class C2828c implements a {
                public static final C2828c a = new C2828c();
            }

            /* compiled from: OAuthProvider.kt */
            public static final class d implements a {
                public final String a;

                public d(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Restore(sid="), this.a, ')');
                }
            }
        }

        public c(a aVar) {
            this.a = aVar;
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
            return "HandleRedirectAction(status=" + this.a + ')';
        }
    }

    /* compiled from: OAuthProvider.kt */
    public static final class d extends eo70 {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: OAuthProvider.kt */
    public static final class e extends eo70 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public e(String str, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }
    }

    /* compiled from: OAuthProvider.kt */
    public static final class f extends eo70 {
        public final SilentAuthInfo a;
        public final String b;

        public f(SilentAuthInfo silentAuthInfo, String str) {
            this.a = silentAuthInfo;
            this.b = str;
        }
    }
}
