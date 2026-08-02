package defpackage;

import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j3b {
    public final long A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final String N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final long h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final Long u;
    public final Long v;
    public final long w;
    public final int x;
    public final long y;
    public final long z;

    public j3b(long j, String str, String str2, int i, String str3, Long l, Integer num, long j2, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7, boolean z8, String str4, boolean z9, Long l2, Long l3, long j3, int i4, long j4, long j5, long j6, boolean z10) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = l;
        this.g = num;
        this.h = j2;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = i3;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = str4;
        this.t = z9;
        this.u = l2;
        this.v = l3;
        this.w = j3;
        this.x = i4;
        this.y = j4;
        this.z = j5;
        this.A = j6;
        this.B = z10;
        boolean a = ChatFlags.a(j2, 1L);
        this.C = a;
        boolean a2 = ChatFlags.a(j2, 4L);
        this.D = a2;
        boolean a3 = ChatFlags.a(j2, 128L);
        this.E = a3;
        this.F = ChatFlags.a(j2, 256L);
        boolean a4 = ChatFlags.a(j2, 8L);
        this.G = a4;
        this.H = ChatFlags.a(j2, 16L);
        this.I = ChatNamespaces.b(str);
        boolean z11 = l3 != null;
        this.J = z11;
        this.K = ChatFlags.a(j2, 64L);
        boolean z12 = z3 || z5;
        this.L = z12;
        this.M = ChatNamespaces.a(str);
        String str5 = "thread";
        if (!z11) {
            if (a4) {
                str5 = "saved messages";
            } else if (a2) {
                str5 = "bot";
            } else if (a) {
                str5 = "personal";
            } else if (!ChatId.Companion.f(str)) {
                str5 = ChatNamespaces.b(str) ? "channel" : "group";
            }
        }
        this.N = str5;
        this.O = ChatId.Companion.b(str);
        boolean z13 = j4 > 0 && j5 != -1 && z12;
        this.P = z13 && i == 0;
        this.Q = z13 && i > 0;
        z83.c(null, z3 && z5);
        if (a3) {
            z83.i();
        }
    }

    public final i3b a() {
        Long l;
        Long l2 = this.u;
        if (l2 == null || (l = this.v) == null) {
            return null;
        }
        return new i3b(l2.longValue(), l.longValue(), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3b)) {
            return false;
        }
        j3b j3bVar = (j3b) obj;
        return this.a == j3bVar.a && jl40.l(this.b, j3bVar.b) && jl40.l(this.c, j3bVar.c) && this.d == j3bVar.d && jl40.l(this.e, j3bVar.e) && jl40.l(this.f, j3bVar.f) && jl40.l(this.g, j3bVar.g) && this.h == j3bVar.h && this.i == j3bVar.i && this.j == j3bVar.j && this.k == j3bVar.k && this.l == j3bVar.l && this.m == j3bVar.m && this.n == j3bVar.n && this.o == j3bVar.o && this.p == j3bVar.p && this.q == j3bVar.q && this.r == j3bVar.r && jl40.l(this.s, j3bVar.s) && this.t == j3bVar.t && jl40.l(this.u, j3bVar.u) && jl40.l(this.v, j3bVar.v) && this.w == j3bVar.w && this.x == j3bVar.x && this.y == j3bVar.y && this.z == j3bVar.z && this.A == j3bVar.A && this.B == j3bVar.B;
    }

    public final int hashCode() {
        int b = unr0.b(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int b2 = oyr.b(this.d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        int e = unr0.e(unr0.e(unr0.e(oyr.b(this.o, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.i, qv10.c((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r);
        String str3 = this.s;
        int e2 = unr0.e((e + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.t);
        Long l2 = this.u;
        int hashCode3 = (e2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.v;
        return Boolean.hashCode(this.B) + qv10.c(qv10.c(qv10.c(oyr.b(this.x, qv10.c((hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.w), 31), 31, this.y), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder k = x4e.k("ChatInfo(chatInternalId=", this.a, ", chatId=", this.b);
        k.append(", url=");
        k.append(this.c);
        k.append(", unseenCount=");
        k.append(this.d);
        k.append(", addresseeId=");
        k.append(this.e);
        k.append(", averageResponseTime=");
        k.append(this.f);
        k.append(", firstUnseenPosition=");
        k.append(this.g);
        k.append(", flags=");
        vfc.y(k, this.h, ", rights=", this.i);
        n.z(", mute=", ", muteMentions=", k, this.j, this.k);
        n.z(", isMember=", ", blocked=", k, this.l, this.m);
        k.append(", isSubscriber=");
        k.append(this.n);
        k.append(", participantsCount=");
        k.append(this.o);
        n.z(", canCall=", ", isAdmin=", k, this.p, this.q);
        k.append(", isPhoneRequiredForWrite=");
        k.append(this.r);
        k.append(", currentProfileId=");
        k.append(this.s);
        k.append(", isTransient=");
        k.append(this.t);
        k.append(", parentInternalId=");
        k.append(this.u);
        k.append(", parentMessageTimestamp=");
        k.append(this.v);
        k.append(", minMessageTimestamp=");
        vfc.y(k, this.w, ", totalCount=", this.x);
        x4e.A(this.y, ", lastSeqNo=", ", lastMessageTimestamp=", k);
        k.append(this.z);
        x4e.A(this.A, ", supportedEvents=", ", hasGuests=", k);
        return x4e.i(k, this.B, Extension.C_BRAKE);
    }
}
