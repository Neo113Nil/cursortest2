package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: EcosystemMultiAccountViewState.kt */
/* loaded from: classes6.dex */
public final class uxo implements ao50 {
    public final fi50 a;

    /* compiled from: EcosystemMultiAccountViewState.kt */
    public static final class a implements fm50<sxo> {
        public final yzt0<InterfaceC3850a> a;

        /* compiled from: EcosystemMultiAccountViewState.kt */
        /* renamed from: xsna.uxo$a$a, reason: collision with other inner class name */
        public interface InterfaceC3850a {

            /* compiled from: EcosystemMultiAccountViewState.kt */
            /* renamed from: xsna.uxo$a$a$a, reason: collision with other inner class name */
            public static final class C3851a implements InterfaceC3850a {
                public static final C3851a a = new C3851a();
            }

            /* compiled from: EcosystemMultiAccountViewState.kt */
            /* renamed from: xsna.uxo$a$a$b */
            public static abstract class b implements InterfaceC3850a {

                /* compiled from: EcosystemMultiAccountViewState.kt */
                /* renamed from: xsna.uxo$a$a$b$a, reason: collision with other inner class name */
                public static final class C3852a extends b {
                    public final List<znn0> a;

                    public C3852a(ListBuilder listBuilder) {
                        this.a = listBuilder;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3852a)) {
                            return false;
                        }
                        C3852a c3852a = (C3852a) obj;
                        c3852a.getClass();
                        return epx.f(this.a, c3852a.a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
                    }

                    public final String toString() {
                        return ms9.a(')', new StringBuilder("ShimmersLoadingState(blockDialog=false, shimmerItems="), this.a);
                    }
                }

                /* compiled from: EcosystemMultiAccountViewState.kt */
                /* renamed from: xsna.uxo$a$a$b$b, reason: collision with other inner class name */
                public static final class C3853b extends b {
                    public final boolean a;

                    public C3853b(boolean z) {
                        this.a = z;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C3853b) && this.a == ((C3853b) obj).a;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.a);
                    }

                    public final String toString() {
                        return defpackage.q0.a(new StringBuilder("SpinnerLoadingState(blockDialog="), this.a, ')');
                    }
                }
            }

            /* compiled from: EcosystemMultiAccountViewState.kt */
            /* renamed from: xsna.uxo$a$a$c */
            public static final class c implements InterfaceC3850a {
                public final List<xnn0> a;

                public c(ListBuilder listBuilder) {
                    this.a = listBuilder;
                }
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("SwitcherSceneRender(content="), this.a, ')');
        }
    }

    public uxo(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
