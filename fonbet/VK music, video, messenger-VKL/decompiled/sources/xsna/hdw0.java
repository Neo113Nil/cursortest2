package xsna;

import xsna.tlo0;

/* compiled from: VoipAdminChangeNameViewState.kt */
/* loaded from: classes7.dex */
public final class hdw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipAdminChangeNameViewState.kt */
    public static abstract class a {

        /* compiled from: VoipAdminChangeNameViewState.kt */
        /* renamed from: xsna.hdw0$a$a, reason: collision with other inner class name */
        public static final class C2987a {
            public final String a;
            public final tlo0.h b;
            public final String c;
            public final AbstractC2988a d;

            /* compiled from: VoipAdminChangeNameViewState.kt */
            /* renamed from: xsna.hdw0$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC2988a {

                /* compiled from: VoipAdminChangeNameViewState.kt */
                /* renamed from: xsna.hdw0$a$a$a$a, reason: collision with other inner class name */
                public static final class C2989a extends AbstractC2988a {
                    public static final C2989a a = new C2989a();
                }

                /* compiled from: VoipAdminChangeNameViewState.kt */
                /* renamed from: xsna.hdw0$a$a$a$b */
                public static final class b extends AbstractC2988a {
                    public static final b a = new b();
                }
            }

            public C2987a(String str, tlo0.h hVar, String str2, AbstractC2988a abstractC2988a) {
                this.a = str;
                this.b = hVar;
                this.c = str2;
                this.d = abstractC2988a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2987a)) {
                    return false;
                }
                C2987a c2987a = (C2987a) obj;
                return epx.f(this.a, c2987a.a) && this.b.equals(c2987a.b) && epx.f(this.c, c2987a.c) && epx.f(this.d, c2987a.d);
            }

            public final int hashCode() {
                String str = this.a;
                return this.d.hashCode() + urd0.a(u11.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a), 31, this.c);
            }

            public final String toString() {
                return "ChangeNameBlock(name=" + this.a + ", hintText=" + this.b + ", changeNameBlockDescriptionName=" + this.c + ", changeNameValidationError=" + this.d + ')';
            }
        }

        /* compiled from: VoipAdminChangeNameViewState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: VoipAdminChangeNameViewState.kt */
        public static final class c extends a {
            public final C2987a a;
            public final boolean b;

            public c(C2987a c2987a, boolean z) {
                this.a = c2987a;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(changeNameBlock=");
                sb.append(this.a);
                sb.append(", isLoading=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: VoipAdminChangeNameViewState.kt */
    public static final class b implements fm50<gdw0> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public hdw0(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdw0) && this.a.equals(((hdw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipAdminChangeNameViewState(scene="), this.a, ')');
    }
}
