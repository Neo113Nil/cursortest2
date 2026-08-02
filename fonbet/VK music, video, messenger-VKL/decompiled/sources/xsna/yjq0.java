package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.collections.EmptyList;
import xsna.e4s;
import xsna.ir5;
import xsna.o2k;

/* compiled from: UserEditProfileState.kt */
/* loaded from: classes5.dex */
public final class yjq0 implements km50 {
    public static final yjq0 v;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ir5 e;
    public final o2k f;
    public final String g;
    public final String h;
    public final e i;
    public final String j;
    public final a k;
    public final boolean l;
    public final boolean m;
    public final b n;
    public final d o;
    public final ExtendedUserProfile p;
    public final boolean q;
    public final c r;
    public final boolean s;
    public final boolean t;
    public final f u;

    /* compiled from: UserEditProfileState.kt */
    public static final class a {
        public static final a b = new a(0);
        public final boolean a;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return n23.b(new StringBuilder("AcceptButton(isEnabled="), this.a, ", isLoading=false)");
        }

        public a(int i) {
            this.a = true;
        }
    }

    /* compiled from: UserEditProfileState.kt */
    public static final class c {
        public static final c d = new c(0);
        public final boolean a;
        public final boolean b;
        public final e4s.a c;

        public c() {
            this(0);
        }

        public static c a(c cVar, boolean z, boolean z2, e4s.a aVar, int i) {
            if ((i & 1) != 0) {
                z = cVar.a;
            }
            if ((i & 2) != 0) {
                z2 = cVar.b;
            }
            if ((i & 4) != 0) {
                aVar = cVar.c;
            }
            cVar.getClass();
            return new c(z, z2, aVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "FollowersModeSettings(switchChecked=" + this.a + ", switchEnabled=" + this.b + ", description=" + this.c + ')';
        }

        public c(boolean z, boolean z2, e4s.a aVar) {
            this.a = z;
            this.b = z2;
            this.c = aVar;
        }

        public /* synthetic */ c(int i) {
            this(false, true, e4s.a.C2777a.b);
        }
    }

    /* compiled from: UserEditProfileState.kt */
    public static final class e {
        public static final e c = new e(0);
        public final boolean a;
        public final boolean b;

        public e() {
            this(0);
        }

        public static e a(e eVar, boolean z, int i) {
            if ((i & 1) != 0) {
                z = eVar.a;
            }
            boolean z2 = (i & 2) != 0 ? eVar.b : false;
            eVar.getClass();
            return new e(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NicknameSwitch(isChecked=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ e(int i) {
            this(false, true);
        }

        public e(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: UserEditProfileState.kt */
    public static final class f {
        public static final f d = new f(7);
        public final boolean a;
        public final String b;
        public final String c;

        public f() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilePhotoUpdateBanner(isAllowed=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", buttonText=");
            return ho8.a(sb, this.c, ')');
        }

        public /* synthetic */ f(int i) {
            this(false, "", "");
        }

        public f(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }
    }

    static {
        ir5.a aVar = new ir5.a(0);
        c cVar = c.d;
        v = new yjq0(true, false, false, aVar, o2k.a.a, "", "", e.c, "", a.b, false, false, new b(), new d(), null, false, cVar, false, false, f.d);
    }

    public yjq0(boolean z, boolean z2, boolean z3, ir5 ir5Var, o2k o2kVar, String str, String str2, e eVar, String str3, a aVar, boolean z4, boolean z5, b bVar, d dVar, ExtendedUserProfile extendedUserProfile, boolean z6, c cVar, boolean z7, boolean z8, f fVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = ir5Var;
        this.f = o2kVar;
        this.g = str;
        this.h = str2;
        this.i = eVar;
        this.j = str3;
        this.k = aVar;
        this.l = z4;
        this.m = z5;
        this.n = bVar;
        this.o = dVar;
        this.p = extendedUserProfile;
        this.q = z6;
        this.r = cVar;
        this.s = z7;
        this.t = z8;
        this.u = fVar;
    }

    public static yjq0 a(yjq0 yjq0Var, boolean z, boolean z2, ir5 ir5Var, o2k o2kVar, String str, String str2, e eVar, String str3, a aVar, boolean z3, boolean z4, b bVar, d dVar, ExtendedUserProfile extendedUserProfile, boolean z5, c cVar, boolean z6, boolean z7, f fVar, int i) {
        boolean z8 = (i & 1) != 0 ? yjq0Var.b : false;
        boolean z9 = (i & 2) != 0 ? yjq0Var.c : z;
        boolean z10 = (i & 4) != 0 ? yjq0Var.d : z2;
        ir5 ir5Var2 = (i & 8) != 0 ? yjq0Var.e : ir5Var;
        o2k o2kVar2 = (i & 16) != 0 ? yjq0Var.f : o2kVar;
        String str4 = (i & 32) != 0 ? yjq0Var.g : str;
        String str5 = (i & 64) != 0 ? yjq0Var.h : str2;
        e eVar2 = (i & 128) != 0 ? yjq0Var.i : eVar;
        String str6 = (i & 256) != 0 ? yjq0Var.j : str3;
        a aVar2 = (i & 512) != 0 ? yjq0Var.k : aVar;
        boolean z11 = (i & 1024) != 0 ? yjq0Var.l : z3;
        boolean z12 = (i & 2048) != 0 ? yjq0Var.m : z4;
        b bVar2 = (i & 4096) != 0 ? yjq0Var.n : bVar;
        d dVar2 = (i & 8192) != 0 ? yjq0Var.o : dVar;
        boolean z13 = z8;
        ExtendedUserProfile extendedUserProfile2 = (i & 16384) != 0 ? yjq0Var.p : extendedUserProfile;
        boolean z14 = (i & 32768) != 0 ? yjq0Var.q : z5;
        c cVar2 = (i & 65536) != 0 ? yjq0Var.r : cVar;
        boolean z15 = (i & 131072) != 0 ? yjq0Var.s : z6;
        boolean z16 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? yjq0Var.t : z7;
        f fVar2 = (i & 524288) != 0 ? yjq0Var.u : fVar;
        yjq0Var.getClass();
        yjq0Var.getClass();
        return new yjq0(z13, z9, z10, ir5Var2, o2kVar2, str4, str5, eVar2, str6, aVar2, z11, z12, bVar2, dVar2, extendedUserProfile2, z14, cVar2, z15, z16, fVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjq0)) {
            return false;
        }
        yjq0 yjq0Var = (yjq0) obj;
        return this.b == yjq0Var.b && this.c == yjq0Var.c && this.d == yjq0Var.d && epx.f(this.e, yjq0Var.e) && epx.f(this.f, yjq0Var.f) && epx.f(this.g, yjq0Var.g) && epx.f(this.h, yjq0Var.h) && epx.f(this.i, yjq0Var.i) && epx.f(this.j, yjq0Var.j) && epx.f(this.k, yjq0Var.k) && this.l == yjq0Var.l && this.m == yjq0Var.m && epx.f(this.n, yjq0Var.n) && epx.f(this.o, yjq0Var.o) && epx.f(this.p, yjq0Var.p) && this.q == yjq0Var.q && epx.f(this.r, yjq0Var.r) && this.s == yjq0Var.s && this.t == yjq0Var.t && epx.f(this.u, yjq0Var.u);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + ((this.n.hashCode() + qoy.b(qoy.b((this.k.hashCode() + urd0.a((this.i.hashCode() + urd0.a(urd0.a((this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j)) * 31, 31, this.l), 31, this.m)) * 31)) * 31;
        ExtendedUserProfile extendedUserProfile = this.p;
        return (this.u.hashCode() + qoy.b(qoy.b((this.r.hashCode() + qoy.b((hashCode + (extendedUserProfile == null ? 0 : extendedUserProfile.hashCode())) * 31, 31, this.q)) * 31, 31, this.s), 31, this.t)) * 31;
    }

    public final String toString() {
        return "UserEditProfileState(isLoading=" + this.b + ", isSaving=" + this.c + ", isRefreshing=" + this.d + ", avatar=" + this.e + ", cover=" + this.f + ", fullName=" + this.g + ", nickname=" + this.h + ", nicknameSwitch=" + this.i + ", description=" + this.j + ", acceptButton=" + this.k + ", showResetChangesDialog=" + this.l + ", showRemoveCoverDialog=" + this.m + ", avatarDialog=" + this.n + ", nicknamePopup=" + this.o + ", extendedUserProfile=" + this.p + ", showFollowersModeSettings=" + this.q + ", followersModeSettings=" + this.r + ", isProfileClosed=" + this.s + ", isSilentModeEnabled=" + this.t + ", profilePhotoUpdateBanner=" + this.u + ", screenSource=null)";
    }

    /* compiled from: UserEditProfileState.kt */
    public static final class d {
        public static final d c = new d();
        public final Object a;
        public final boolean b;

        public d() {
            this(EmptyList.b, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (qow.a(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NicknamePopup(choices=");
            sb.append((Object) qow.b(this.a));
            sb.append(", isShow=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public d(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }
    }

    /* compiled from: UserEditProfileState.kt */
    public static final class b {
        public static final b c = new b();
        public final Object a;
        public final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        public static b a(b bVar) {
            Object obj = bVar.a;
            bVar.getClass();
            return new b(obj, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (qow.a(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarSettingsPopup(choices=");
            sb.append((Object) qow.b(this.a));
            sb.append(", isShow=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b() {
            this(EmptyList.b, false);
        }
    }
}
