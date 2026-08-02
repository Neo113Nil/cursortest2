package xsna;

import java.util.ArrayList;

/* compiled from: AboutAppPatch.kt */
/* loaded from: classes6.dex */
public interface b2 extends xl50 {

    /* compiled from: AboutAppPatch.kt */
    public static final class a implements b2 {
        public static final a b = new a();
    }

    /* compiled from: AboutAppPatch.kt */
    public static final class b implements b2 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Init(isShowUnverified="), this.b, ')');
        }
    }

    /* compiled from: AboutAppPatch.kt */
    public static final class c implements b2 {
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;
        public final boolean f;
        public final long g;
        public final String h;
        public final String i;
        public final String j;
        public final boolean k;
        public final String l;
        public final String m;

        public c(String str, String str2, String str3, ArrayList arrayList, boolean z, long j, String str4, String str5, String str6, boolean z2, String str7, String str8) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = arrayList;
            this.f = z;
            this.g = j;
            this.h = str4;
            this.i = str5;
            this.j = str6;
            this.k = z2;
            this.l = str7;
            this.m = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c.equals(cVar.c) && epx.f(this.d, cVar.d) && this.e.equals(cVar.e) && this.f == cVar.f && this.g == cVar.g && this.h.equals(cVar.h) && this.i.equals(cVar.i) && this.j.equals(cVar.j) && this.k == cVar.k && this.l.equals(cVar.l) && this.m.equals(cVar.m);
        }

        public final int hashCode() {
            return this.m.hashCode() + urd0.a(qoy.b(urd0.a(urd0.a(urd0.a(bh10.a(qoy.b(qr.a(this.e, urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(title=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", screenshots=");
            sb.append(this.e);
            sb.append(", hasCommunity=");
            sb.append(this.f);
            sb.append(", communityId=");
            sb.append(this.g);
            sb.append(", communityAvatar=");
            sb.append(this.h);
            sb.append(", communityTitle=");
            sb.append(this.i);
            sb.append(", communityDescription=");
            sb.append(this.j);
            sb.append(", communityIsVerified=");
            sb.append(this.k);
            sb.append(", privacyPolicy=");
            sb.append(this.l);
            sb.append(", terms=");
            return ho8.a(sb, this.m, ')');
        }
    }
}
