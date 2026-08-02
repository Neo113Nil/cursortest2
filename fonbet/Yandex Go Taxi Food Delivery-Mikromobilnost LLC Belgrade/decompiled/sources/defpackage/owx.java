package defpackage;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lowx;", "Llwj0;", "Companion", "d", "f", "g", "h", "a", "e", "c", "b", "lwx", "pwx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class owx extends lwj0 {
    public static final pwx Companion = new pwx();
    public static final i3y[] G;
    public final e A;
    public final List B;
    public final UltimaModeResponse C;
    public final String D;
    public final String E;
    public final xa7 F;
    public final boolean a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final s36 n;
    public final boolean o;
    public final h p;
    public final List q;
    public final int r;
    public final a s;
    public final a1t t;
    public final boolean u;
    public final List v;
    public final f w;
    public final int x;
    public final jl90 y;
    public final List z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        G = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new aww(23)), null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new aww(24)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new aww(25)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new aww(26)), kotlin.a.b(lazyThreadSafetyMode, new aww(27)), null, null, kotlin.a.b(lazyThreadSafetyMode, new aww(28)), null, kotlin.a.b(lazyThreadSafetyMode, new aww(29)), null, null, null, null};
    }

    public owx(int i, boolean z, List list, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, List list2, String str6, String str7, String str8, s36 s36Var, boolean z4, h hVar, List list3, int i2, a aVar, a1t a1tVar, boolean z5, List list4, f fVar, int i3, jl90 jl90Var, List list5, e eVar, List list6, UltimaModeResponse ultimaModeResponse, String str9, String str10, xa7 xa7Var) {
        a1t a1tVar2;
        jl90 jl90Var2;
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        int i4 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i4 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str8;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = s36Var;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = hVar;
        }
        if ((65536 & i) == 0) {
            this.q = emptyList;
        } else {
            this.q = list3;
        }
        if ((131072 & i) == 0) {
            this.r = 0;
        } else {
            this.r = i2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = aVar;
        }
        if ((524288 & i) == 0) {
            a1t.Companion.getClass();
            a1tVar2 = a1t.f;
        } else {
            a1tVar2 = a1tVar;
        }
        this.t = a1tVar2;
        this.u = (1048576 & i) == 0 ? true : z5;
        if ((2097152 & i) == 0) {
            this.v = emptyList;
        } else {
            this.v = list4;
        }
        this.w = (4194304 & i) == 0 ? f.d : fVar;
        if ((8388608 & i) == 0) {
            this.x = 0;
        } else {
            this.x = i3;
        }
        if ((16777216 & i) == 0) {
            jl90.Companion.getClass();
            jl90Var2 = jl90.e;
        } else {
            jl90Var2 = jl90Var;
        }
        this.y = jl90Var2;
        if ((33554432 & i) == 0) {
            this.z = emptyList;
        } else {
            this.z = list5;
        }
        this.A = (67108864 & i) == 0 ? new e(0) : eVar;
        if ((134217728 & i) == 0) {
            this.B = emptyList;
        } else {
            this.B = list6;
        }
        this.C = (268435456 & i) == 0 ? new UltimaModeResponse(0) : ultimaModeResponse;
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = str9;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = str10;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = xa7Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e */
    public final zn11 getG() {
        xa7 xa7Var = this.F;
        if (xa7Var != null) {
            return xa7Var.c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owx)) {
            return false;
        }
        owx owxVar = (owx) obj;
        return this.a == owxVar.a && jl40.l(this.b, owxVar.b) && this.c == owxVar.c && this.d == owxVar.d && jl40.l(this.e, owxVar.e) && jl40.l(this.f, owxVar.f) && jl40.l(this.g, owxVar.g) && jl40.l(this.h, owxVar.h) && jl40.l(this.i, owxVar.i) && jl40.l(this.j, owxVar.j) && jl40.l(this.k, owxVar.k) && jl40.l(this.l, owxVar.l) && jl40.l(this.m, owxVar.m) && jl40.l(this.n, owxVar.n) && this.o == owxVar.o && jl40.l(this.p, owxVar.p) && jl40.l(this.q, owxVar.q) && this.r == owxVar.r && jl40.l(this.s, owxVar.s) && jl40.l(this.t, owxVar.t) && this.u == owxVar.u && jl40.l(this.v, owxVar.v) && jl40.l(this.w, owxVar.w) && this.x == owxVar.x && jl40.l(this.y, owxVar.y) && jl40.l(this.z, owxVar.z) && jl40.l(this.A, owxVar.A) && jl40.l(this.B, owxVar.B) && jl40.l(this.C, owxVar.C) && jl40.l(this.D, owxVar.D) && jl40.l(this.E, owxVar.E) && jl40.l(this.F, owxVar.F);
    }

    public final int hashCode() {
        int e2 = unr0.e(unr0.e(unr0.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.j;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.k;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        s36 s36Var = this.n;
        int e3 = unr0.e((hashCode9 + (s36Var == null ? 0 : s36Var.hashCode())) * 31, 31, this.o);
        h hVar = this.p;
        int b2 = oyr.b(this.r, unr0.c((e3 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.q), 31);
        a aVar = this.s;
        int hashCode10 = (this.C.hashCode() + unr0.c(unr0.c(unr0.c((this.y.hashCode() + oyr.b(this.x, (this.w.hashCode() + unr0.c(unr0.e((this.t.hashCode() + ((b2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.u), 31, this.v)) * 31, 31)) * 31, 31, this.z), 31, this.A.a), 31, this.B)) * 31;
        String str9 = this.D;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.E;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        xa7 xa7Var = this.F;
        return hashCode12 + (xa7Var != null ? xa7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchResponse(isAuthorized=");
        sb.append(this.a);
        sb.append(", paymentStatusesFilters=");
        sb.append(this.b);
        sb.append(", isLoyal=");
        nnm.v(", canGenerateReferrals=", ", serverTime=", sb, this.c, this.d);
        g8e.D(sb, this.e, ", uuid=", this.f, ", id=");
        g8e.D(sb, this.g, ", phoneId=", this.h, ", personalPhoneId=");
        tse0.x(this.i, ", info=", ", name=", sb, this.j);
        g8e.D(sb, this.k, ", phone=", this.l, ", deviceId=");
        sb.append(this.m);
        sb.append(", blocked=");
        sb.append(this.n);
        sb.append(", isTokenValid=");
        sb.append(this.o);
        sb.append(", versionInfo=");
        sb.append(this.p);
        sb.append(", experiments=");
        sb.append(this.q);
        sb.append(", minDistanceMeOrderPoint=");
        sb.append(this.r);
        sb.append(", chat=");
        sb.append(this.s);
        sb.append(", geoSharingConfig=");
        sb.append(this.t);
        sb.append(", showSmsMenuSettings=");
        sb.append(this.u);
        sb.append(", acceptance=");
        sb.append(this.v);
        sb.append(", parameters=");
        sb.append(this.w);
        sb.append(", orderForOtherDialogInitDistance=");
        sb.append(this.x);
        sb.append(", passengerProfile=");
        sb.append(this.y);
        sb.append(", sharedOrders=");
        sb.append(this.z);
        sb.append(", newZoneDefaultTariffSettings=");
        sb.append(this.A);
        sb.append(", familyInvites=");
        sb.append(this.B);
        sb.append(", ultimaMode=");
        sb.append(this.C);
        sb.append(", clientNotifyService=");
        sb.append(this.D);
        sb.append(", xivaService=");
        sb.append(this.E);
        sb.append(", cacheAwareTypedExperiments=");
        sb.append(this.F);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$f;", "", "Companion", "zwx", "a", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0(with = a.class)
    public static final /* data */ class f {
        public static final zwx Companion = new zwx();
        public static final f d = new f(0);
        public final boolean a;
        public final g b;
        public final kotlinx.serialization.json.b c;

        public static final class a extends vfx {
            public final SerialDescriptor a = kotlinx.serialization.json.c.Companion.serializer().getDescriptor();

            @Override // defpackage.vfx
            public final Object a(ncx ncxVar) {
                Boolean f;
                kotlinx.serialization.json.b t = ncxVar.t();
                if (!(t instanceof kotlinx.serialization.json.c)) {
                    return f.d;
                }
                kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) t;
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("disable_background_data_sync");
                boolean booleanValue = (bVar == null || (f = qcx.f(qcx.n(bVar))) == null) ? false : f.booleanValue();
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar.get("regional_policy");
                return new f(booleanValue, bVar2 != null ? (g) ncxVar.d().a(g.Companion.serializer(), bVar2) : null, cVar);
            }

            @Override // defpackage.vfx
            public final void b(vcx vcxVar, Object obj) {
                kotlinx.serialization.json.b bVar = ((f) obj).c;
                if (bVar == null) {
                    bVar = JsonNull.INSTANCE;
                }
                vcxVar.p(bVar);
            }

            @Override // defpackage.myi
            public final SerialDescriptor getDescriptor() {
                return this.a;
            }
        }

        public f(boolean z, g gVar, kotlinx.serialization.json.c cVar) {
            this.a = z;
            this.b = gVar;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            g gVar = this.b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.a.hashCode())) * 31;
            kotlinx.serialization.json.b bVar = this.c;
            return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "Parameters(disableBackgroundDataSync=" + this.a + ", regionalPolicy=" + this.b + ", originalJson=" + this.c + Extension.C_BRAKE;
        }

        public f() {
            this(0);
        }

        public /* synthetic */ f(int i) {
            this(false, null, null);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$e;", "", "Companion", "xwx", "ywx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e {
        public static final ywx Companion = new ywx();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wwx(0))};
        public final List a;

        public /* synthetic */ e(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("NewZoneDefaultTariffSettings(groups=", Extension.C_BRAKE, this.a);
        }

        public e(int i) {
            this.a = EmptyList.a;
        }

        public e() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$g;", "", "Companion", "axx", "bxx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class g {
        public static final bxx Companion = new bxx();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vix(21))};
        public final List a;

        public /* synthetic */ g(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jl40.l(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("RegionalPolicy(urlGroups=", Extension.C_BRAKE, this.a);
        }

        public g() {
            this.a = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$a;", "", "Companion", "mwx", "nwx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final nwx Companion = new nwx();
        public final int a;
        public final String b;

        public /* synthetic */ a(int i, int i2, String str) {
            this.a = (i & 1) == 0 ? 0 : i2;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return oyr.l(this.a, "Chat(newChatMessages=", ", supportTimestamp=", this.b, Extension.C_BRAKE);
        }

        public a() {
            this.a = 0;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$h;", "", "Companion", "cxx", "dxx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class h {
        public static final dxx Companion = new dxx();
        public final String a;
        public final long b;

        public /* synthetic */ h(long j, int i, String str) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = 0L;
            } else {
                this.b = j;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return jl40.l(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder l = x4e.l("VersionInfo(currentVersion=", this.a, ", updateNotificationInterval=", this.b);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public h() {
            this.a = null;
            this.b = 0L;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$d;", "", "Companion", "uwx", "vwx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class d {
        public static final vwx Companion = new vwx();
        public final String a;
        public final String b;

        public /* synthetic */ d(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public static final /* synthetic */ void a(d dVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || dVar.a != null) {
                yjdVar.g(serialDescriptor, 0, auu0.a, dVar.a);
            }
            if (!yjdVar.F() && dVar.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, auu0.a, dVar.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("Info(message=", this.a, ", header=", this.b, Extension.C_BRAKE);
        }

        public d() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$b;", "", "Companion", "qwx", "rwx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final rwx Companion = new rwx();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ b(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("FamilyInfo(title=", this.a, ", subtitle=", this.b, ", avatarImageUrl="), this.c, Extension.C_BRAKE);
        }

        public b() {
            this.a = "";
            this.b = "";
            this.c = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lowx$c;", "", "Companion", "twx", "swx", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final twx Companion = new twx();
        public static final c g = new c(0);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final b f;

        public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, b bVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = bVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            b bVar = this.f;
            return b2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("FamilyInvite(id=", this.a, ", deeplink=", this.b, ", imageTag=");
            g8e.D(v, this.c, ", text=", this.d, ", buttonText=");
            v.append(this.e);
            v.append(", familyInfo=");
            v.append(this.f);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public c(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
            this.e = "";
            this.f = null;
        }

        public c() {
            this(0);
        }
    }

    public owx() {
        a1t.Companion.getClass();
        a1t a1tVar = a1t.f;
        jl90.Companion.getClass();
        jl90 jl90Var = jl90.e;
        e eVar = new e(0);
        UltimaModeResponse ultimaModeResponse = new UltimaModeResponse(0);
        this.a = false;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = null;
        this.q = emptyList;
        this.r = 0;
        this.s = null;
        this.t = a1tVar;
        this.u = true;
        this.v = emptyList;
        this.w = f.d;
        this.x = 0;
        this.y = jl90Var;
        this.z = emptyList;
        this.A = eVar;
        this.B = emptyList;
        this.C = ultimaModeResponse;
        this.D = null;
        this.E = null;
        this.F = null;
    }
}
