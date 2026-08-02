package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipOpenScreenAnalyticsDelegateImpl.kt */
/* loaded from: classes7.dex */
public final class jtw0 extends ldw0<a> {
    public final bpn0 d;
    public final String e = "VoipOpenScreenAnalyticsDelegateImpl";

    /* compiled from: VoipOpenScreenAnalyticsDelegateImpl.kt */
    public interface a extends ndw0 {

        /* compiled from: VoipOpenScreenAnalyticsDelegateImpl.kt */
        /* renamed from: xsna.jtw0$a$a, reason: collision with other inner class name */
        public static final class C3146a implements a {
            public static final C3146a a = new C3146a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3146a);
            }

            public final int hashCode() {
                return 1068029119;
            }

            public final String toString() {
                return "OnLinkQRCodeOpen";
            }
        }
    }

    public jtw0(bpn0 bpn0Var) {
        this.d = bpn0Var;
    }

    @Override // xsna.ldw0
    public final String b() {
        return this.e;
    }

    @Override // xsna.ldw0
    public final void d(a aVar) {
        if (!aVar.equals(a.C3146a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((ktw0) this.d.getValue()).m();
    }
}
