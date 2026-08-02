package xsna;

import xsna.d6x0;

/* compiled from: VoipVmojiViewState.kt */
/* loaded from: classes7.dex */
public final class h6x0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;
    public final fi50 f;
    public final fi50 g;

    /* compiled from: VoipVmojiViewState.kt */
    public static final class a implements fm50<d6x0.a> {
        public static final a a = new a();
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class b implements fm50<d6x0.b> {
        public static final b a = new b();
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class c implements fm50<d6x0.c> {
        public static final c a = new c();
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class d implements fm50<d6x0.d> {
        public static final d a = new d();
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class e implements fm50<d6x0.e> {
        public final yzt0<a> a;
        public final yzt0<Boolean> b;

        /* compiled from: VoipVmojiViewState.kt */
        public static final class a {
            public final w5w0 a;
            public final String b;

            public a(w5w0 w5w0Var, String str) {
                this.a = w5w0Var;
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
                StringBuilder sb = new StringBuilder("Details(avatar=");
                sb.append(this.a);
                sb.append(", svg=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public e(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VmojiFound(avatar=");
            sb.append(this.a);
            sb.append(", enabled=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class f implements fm50<d6x0.f> {
        public static final f a = new f();
    }

    /* compiled from: VoipVmojiViewState.kt */
    public static final class g implements fm50<d6x0.g> {
        public static final g a = new g();
    }

    public h6x0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5, fi50 fi50Var6, fi50 fi50Var7) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
        this.f = fi50Var6;
        this.g = fi50Var7;
    }
}
