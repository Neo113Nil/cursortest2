package xsna;

import xsna.yjq0;

/* compiled from: UserEditProfileViewState.kt */
/* loaded from: classes5.dex */
public final class zjq0 implements ao50 {
    public final fi50 a;

    /* compiled from: UserEditProfileViewState.kt */
    public interface a extends fm50<yjq0> {

        /* compiled from: UserEditProfileViewState.kt */
        /* renamed from: xsna.zjq0$a$a, reason: collision with other inner class name */
        public static final class C4181a implements a {
            public static final C4181a a = new C4181a();
        }

        /* compiled from: UserEditProfileViewState.kt */
        public static final class b implements a {
            public final yzt0<Boolean> a;
            public final yzt0<Boolean> b;
            public final yzt0<Boolean> c;
            public final yzt0<ir5> d;
            public final yzt0<o2k> e;
            public final yzt0<String> f;
            public final yzt0<String> g;
            public final yzt0<yjq0.e> h;
            public final yzt0<String> i;
            public final yzt0<Boolean> j;
            public final yzt0<yjq0.b> k;
            public final yzt0<yjq0.d> l;
            public final yzt0<Boolean> m;
            public final yzt0<Boolean> n;
            public final yzt0<yjq0.c> o;
            public final yzt0<yjq0.f> p;

            public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
                this.j = h0u0Var10;
                this.k = h0u0Var11;
                this.l = h0u0Var12;
                this.m = h0u0Var13;
                this.n = h0u0Var14;
                this.o = h0u0Var15;
                this.p = h0u0Var16;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p);
            }

            public final int hashCode() {
                return this.p.hashCode() + sr.a(this.o, sr.a(this.n, sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Main(isLoading=");
                sb.append(this.a);
                sb.append(", isSaving=");
                sb.append(this.b);
                sb.append(", isRefreshing=");
                sb.append(this.c);
                sb.append(", avatar=");
                sb.append(this.d);
                sb.append(", cover=");
                sb.append(this.e);
                sb.append(", fullName=");
                sb.append(this.f);
                sb.append(", nickname=");
                sb.append(this.g);
                sb.append(", nicknameSwitch=");
                sb.append(this.h);
                sb.append(", description=");
                sb.append(this.i);
                sb.append(", showResetChangesDialog=");
                sb.append(this.j);
                sb.append(", avatarSettingsPopup=");
                sb.append(this.k);
                sb.append(", nicknamePopup=");
                sb.append(this.l);
                sb.append(", showRemoveCoverDialog=");
                sb.append(this.m);
                sb.append(", showFollowersModeSettings=");
                sb.append(this.n);
                sb.append(", followersModeSettings=");
                sb.append(this.o);
                sb.append(", profilePhotoUpdateBanner=");
                return tr.c(sb, this.p, ')');
            }
        }
    }

    public zjq0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
