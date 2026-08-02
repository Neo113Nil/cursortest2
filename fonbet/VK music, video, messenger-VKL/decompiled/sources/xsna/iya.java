package xsna;

import xsna.tlo0;

/* compiled from: ChannelDonutSupportViewState.kt */
/* loaded from: classes16.dex */
public final class iya implements ao50 {
    public final fi50 a;

    /* compiled from: ChannelDonutSupportViewState.kt */
    public static final class a implements fm50<hya> {
        public final yzt0<C3087a> a;

        /* compiled from: ChannelDonutSupportViewState.kt */
        /* renamed from: xsna.iya$a$a, reason: collision with other inner class name */
        public static final class C3087a {
            public final boolean a;
            public final boolean b;
            public final String c;
            public final String d;
            public final tlo0.g e;
            public final tlo0.g f;
            public final tlo0 g;
            public final tlo0 h;
            public final boolean i;

            public C3087a(boolean z, boolean z2, String str, String str2, tlo0.g gVar, tlo0.g gVar2, tlo0 tlo0Var, tlo0.g gVar3, boolean z3) {
                this.a = z;
                this.b = z2;
                this.c = str;
                this.d = str2;
                this.e = gVar;
                this.f = gVar2;
                this.g = tlo0Var;
                this.h = gVar3;
                this.i = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3087a)) {
                    return false;
                }
                C3087a c3087a = (C3087a) obj;
                return this.a == c3087a.a && this.b == c3087a.b && epx.f(this.c, c3087a.c) && this.d.equals(c3087a.d) && this.e.equals(c3087a.e) && this.f.equals(c3087a.f) && epx.f(this.g, c3087a.g) && epx.f(this.h, c3087a.h) && this.i == c3087a.i;
            }

            public final int hashCode() {
                int hashCode = (this.f.hashCode() + ((this.e.hashCode() + urd0.a(urd0.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
                tlo0 tlo0Var = this.g;
                int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                tlo0 tlo0Var2 = this.h;
                return Boolean.hashCode(this.i) + ((hashCode2 + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(isGlobalLoading=");
                sb.append(this.a);
                sb.append(", isOperationLoading=");
                sb.append(this.b);
                sb.append(", nameLevel=");
                sb.append(this.c);
                sb.append(", price=");
                sb.append(this.d);
                sb.append(", priceHint=");
                sb.append(this.e);
                sb.append(", nameCounter=");
                sb.append(this.f);
                sb.append(", nameError=");
                sb.append(this.g);
                sb.append(", priceError=");
                sb.append(this.h);
                sb.append(", isButtonEnabled=");
                return defpackage.q0.a(sb, this.i, ')');
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public iya(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
