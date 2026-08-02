package xsna;

import java.util.List;

/* compiled from: ChannelPayoutViewState.kt */
/* loaded from: classes16.dex */
public final class g8b implements ao50 {
    public final fi50 a;

    /* compiled from: ChannelPayoutViewState.kt */
    public static final class a implements fm50<e8b> {
        public final yzt0<C2922a> a;

        /* compiled from: ChannelPayoutViewState.kt */
        /* renamed from: xsna.g8b$a$a, reason: collision with other inner class name */
        public static final class C2922a {
            public final boolean a;
            public final InterfaceC2923a b;
            public final List<u7b> c;
            public final boolean d;

            /* compiled from: ChannelPayoutViewState.kt */
            /* renamed from: xsna.g8b$a$a$a, reason: collision with other inner class name */
            public interface InterfaceC2923a {

                /* compiled from: ChannelPayoutViewState.kt */
                /* renamed from: xsna.g8b$a$a$a$a, reason: collision with other inner class name */
                public static final class C2924a implements InterfaceC2923a {
                    public static final C2924a a = new C2924a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C2924a);
                    }

                    public final int hashCode() {
                        return 1940272061;
                    }

                    public final String toString() {
                        return "Bankcard";
                    }
                }

                /* compiled from: ChannelPayoutViewState.kt */
                /* renamed from: xsna.g8b$a$a$a$b */
                public static final class b implements InterfaceC2923a {
                    public static final b a = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return 1706122923;
                    }

                    public final String toString() {
                        return "Loading";
                    }
                }

                /* compiled from: ChannelPayoutViewState.kt */
                /* renamed from: xsna.g8b$a$a$a$c */
                public static final class c implements InterfaceC2923a {
                    public static final c a = new c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    public final int hashCode() {
                        return -404767006;
                    }

                    public final String toString() {
                        return "VkPay";
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2922a(boolean z, InterfaceC2923a interfaceC2923a, List<? extends u7b> list, boolean z2) {
                this.a = z;
                this.b = interfaceC2923a;
                this.c = list;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2922a)) {
                    return false;
                }
                C2922a c2922a = (C2922a) obj;
                return this.a == c2922a.a && epx.f(this.b, c2922a.b) && epx.f(this.c, c2922a.c) && this.d == c2922a.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + fw3.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(isLoading=");
                sb.append(this.a);
                sb.append(", topBar=");
                sb.append(this.b);
                sb.append(", itemList=");
                sb.append(this.c);
                sb.append(", hasChange=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public g8b(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
