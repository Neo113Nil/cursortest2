package xsna;

import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipHandAnalyticsDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class epw0 implements kdw0<b>, jdw0.b {
    public static final a b = new a();
    public final b3x0 a;

    /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
        public static final class a implements b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return -1959326194;
            }

            public final String toString() {
                return "OnAdminAllHandLowered(screen=" + ((Object) VoipAnalyticsEventScreen.d("participants_manager")) + ')';
            }
        }

        /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
        /* renamed from: xsna.epw0$b$b, reason: collision with other inner class name */
        public static final class C2832b implements b {
            public static final C2832b a = new C2832b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2832b);
            }

            public final int hashCode() {
                return -341336999;
            }

            public final String toString() {
                return "OnAdminUserHandLowered";
            }
        }

        /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 261027172;
            }

            public final String toString() {
                return "OnUserHandLowered";
            }
        }

        /* compiled from: VoipHandAnalyticsDelegateImpl.kt */
        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 28314484;
            }

            public final String toString() {
                return "OnUserHandRaised";
            }
        }
    }

    public epw0(b3x0 b3x0Var) {
        this.a = b3x0Var;
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof b)) {
            return false;
        }
        b((b) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(b bVar) {
        boolean z = bVar instanceof b.d;
        b3x0 b3x0Var = this.a;
        if (z) {
            b3x0Var.t();
            return;
        }
        if (bVar instanceof b.c) {
            b3x0Var.s();
            return;
        }
        if (bVar instanceof b.C2832b) {
            b3x0Var.r();
        } else {
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((b.a) bVar).getClass();
            b3x0Var.q("participants_manager");
        }
    }
}
