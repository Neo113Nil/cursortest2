package xsna;

import xsna.g2y;

/* compiled from: RequestAuthToken.kt */
/* loaded from: classes6.dex */
public final class g7g0 {

    /* compiled from: RequestAuthToken.kt */
    public static final class a {
        public final long a;
        public final String b;
        public final io.reactivex.rxjava3.disposables.b c;
        public final g2y.a d;
        public final boolean e;
        public final boolean f;

        public a(long j, String str, io.reactivex.rxjava3.disposables.b bVar, g2y.a aVar, boolean z, boolean z2) {
            this.a = j;
            this.b = str;
            this.c = bVar;
            this.d = aVar;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            int a = urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
            io.reactivex.rxjava3.disposables.b bVar = this.c;
            return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + ((a + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(appId=");
            sb.append(this.a);
            sb.append(", scope=");
            sb.append(this.b);
            sb.append(", disposables=");
            sb.append(this.c);
            sb.append(", callbacks=");
            sb.append(this.d);
            sb.append(", skipConsent=");
            sb.append(this.e);
            sb.append(", useLocalToken=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: RequestAuthToken.kt */
    public static final class b {
        public final String a;
        public final Long b;

        public b(String str, Long l) {
            this.a = str;
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Long l = this.b;
            return (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        }

        public final String toString() {
            return "TokenResult(accessToken=" + this.a + ", accessTokenExpiresAt=" + this.b + ", localToken=null)";
        }
    }

    /* compiled from: RequestAuthToken.kt */
    public static final class c {
        public final yfx0 a;
        public final ztz b;

        public c(yfx0 yfx0Var, ztz ztzVar) {
            this.a = yfx0Var;
            this.b = ztzVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ztz ztzVar = this.b;
            return hashCode + (ztzVar == null ? 0 : ztzVar.hashCode());
        }

        public final String toString() {
            return "ZippedTokenResult(token=" + this.a + ", localToken=" + this.b + ')';
        }
    }
}
