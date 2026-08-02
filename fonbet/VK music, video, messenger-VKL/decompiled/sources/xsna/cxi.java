package xsna;

/* compiled from: Config.kt */
/* loaded from: classes7.dex */
public abstract class cxi {

    /* compiled from: Config.kt */
    public static final class a extends cxi {
        public static final a a = new a();
    }

    /* compiled from: Config.kt */
    public static final class b extends cxi {
        public final String A;
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final String p;
        public final String q;
        public final String r;
        public final String s;
        public final String t;
        public final String u;
        public final String v;
        public final long w;
        public final String x;
        public final String y;
        public final String z;

        public b(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, long j, String str22, String str23, String str24, String str25) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
            this.k = str10;
            this.l = str11;
            this.m = str12;
            this.n = str13;
            this.o = str14;
            this.p = str15;
            this.q = str16;
            this.r = str17;
            this.s = str18;
            this.t = str19;
            this.u = str20;
            this.v = str21;
            this.w = j;
            this.x = str22;
            this.y = str23;
            this.z = str24;
            this.A = str25;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && epx.f(this.q, bVar.q) && epx.f(this.r, bVar.r) && epx.f(this.s, bVar.s) && epx.f(this.t, bVar.t) && epx.f(this.u, bVar.u) && epx.f(this.v, bVar.v) && this.w == bVar.w && epx.f(this.x, bVar.x) && epx.f(this.y, bVar.y) && epx.f(this.z, bVar.z) && epx.f(this.A, bVar.A);
        }

        public final int hashCode() {
            return this.A.hashCode() + urd0.a(urd0.a(urd0.a(bh10.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Enabled(interactionId=");
            sb.append(this.a);
            sb.append(", buttonGradientStartColor=");
            sb.append(this.b);
            sb.append(", buttonGradientEndColor=");
            sb.append(this.c);
            sb.append(", isRequestButtonVisible=");
            sb.append(this.d);
            sb.append(", requestButtonText=");
            sb.append(this.e);
            sb.append(", requestHintTitle=");
            sb.append(this.f);
            sb.append(", requestHintMessage=");
            sb.append(this.g);
            sb.append(", hideButtonText=");
            sb.append(this.h);
            sb.append(", outgoingRequestMessage=");
            sb.append(this.i);
            sb.append(", incomingRequestMessage=");
            sb.append(this.j);
            sb.append(", opponentSuccessText=");
            sb.append(this.k);
            sb.append(", successText=");
            sb.append(this.l);
            sb.append(", cancelOutgoingButtonText=");
            sb.append(this.m);
            sb.append(", cancelIncomingButtonText=");
            sb.append(this.n);
            sb.append(", acceptButtonText=");
            sb.append(this.o);
            sb.append(", acceptButtonIconUrl=");
            sb.append(this.p);
            sb.append(", acceptWithVideoButtonText=");
            sb.append(this.q);
            sb.append(", acceptWithVideoButtonIconUrl=");
            sb.append(this.r);
            sb.append(", declinedText=");
            sb.append(this.s);
            sb.append(", stopButtonText=");
            sb.append(this.t);
            sb.append(", burgerMenuActionText=");
            sb.append(this.u);
            sb.append(", burgerMenuIconUrl=");
            sb.append(this.v);
            sb.append(", vibrationDurationMs=");
            sb.append(this.w);
            sb.append(", actionType=");
            sb.append(this.x);
            sb.append(", actionValue=");
            sb.append(this.y);
            sb.append(", enableCameraToRequestInteractionTitle=");
            sb.append(this.z);
            sb.append(", enableCameraToRequestInteractionMessage=");
            return ho8.a(sb, this.A, ')');
        }
    }
}
