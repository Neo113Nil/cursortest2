package xsna;

import xsna.fve;

/* compiled from: ClipsPlaylistsSmallFoldersViewState.kt */
/* loaded from: classes16.dex */
public final class kve implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipsPlaylistsSmallFoldersViewState.kt */
    public interface a<T extends fve> extends fm50<fve> {

        /* compiled from: ClipsPlaylistsSmallFoldersViewState.kt */
        /* renamed from: xsna.kve$a$a, reason: collision with other inner class name */
        public static final class C3209a implements a<fve.a> {
            public static final C3209a a = new C3209a();
        }

        /* compiled from: ClipsPlaylistsSmallFoldersViewState.kt */
        public static final class b implements a<fve.b> {
            public final yzt0<wow<mue>> a;
            public final yzt0<Boolean> b;
            public final yzt0<Boolean> c;
            public final yzt0<Boolean> d;
            public final yzt0<Boolean> e;

            public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loaded(items=");
                sb.append(this.a);
                sb.append(", isOwner=");
                sb.append(this.b);
                sb.append(", hasNext=");
                sb.append(this.c);
                sb.append(", hasTopPadding=");
                sb.append(this.d);
                sb.append(", createEnabled=");
                return tr.c(sb, this.e, ')');
            }
        }

        /* compiled from: ClipsPlaylistsSmallFoldersViewState.kt */
        public static final class c implements a<fve.c> {
            public static final c a = new c();
        }
    }

    public kve(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
