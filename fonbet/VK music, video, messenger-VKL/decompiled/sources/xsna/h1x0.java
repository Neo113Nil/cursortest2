package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipShareInfoAnalyticsDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class h1x0 extends ldw0<a> {
    public final bpn0 d;
    public final String e = "VoipShareAnalyticsDelegateImpl";

    /* compiled from: VoipShareInfoAnalyticsDelegateImpl.kt */
    public interface a extends ndw0 {

        /* compiled from: VoipShareInfoAnalyticsDelegateImpl.kt */
        /* renamed from: xsna.h1x0$a$a, reason: collision with other inner class name */
        public static final class C2969a implements a {
            public static final C2969a a = new C2969a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2969a);
            }

            public final int hashCode() {
                return 1429856790;
            }

            public final String toString() {
                return "OnLinkQRCodeShare";
            }
        }

        /* compiled from: VoipShareInfoAnalyticsDelegateImpl.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -191976054;
            }

            public final String toString() {
                return "OnShortLinkShare";
            }
        }
    }

    public h1x0(bpn0 bpn0Var) {
        this.d = bpn0Var;
    }

    @Override // xsna.ldw0
    public final String b() {
        return this.e;
    }

    @Override // xsna.ldw0
    public final void d(a aVar) {
        a aVar2 = aVar;
        boolean equals = aVar2.equals(a.b.a);
        bpn0 bpn0Var = this.d;
        if (equals) {
            ((i1x0) bpn0Var.getValue()).f();
        } else {
            if (!aVar2.equals(a.C2969a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((i1x0) bpn0Var.getValue()).c();
        }
    }
}
