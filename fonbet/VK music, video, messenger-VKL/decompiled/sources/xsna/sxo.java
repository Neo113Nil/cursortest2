package xsna;

import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import java.util.ArrayList;

/* compiled from: EcosystemMultiAccountState.kt */
/* loaded from: classes6.dex */
public final class sxo implements km50 {
    public final a b;
    public final SwitcherUiMode c;

    /* compiled from: EcosystemMultiAccountState.kt */
    public static abstract class a {

        /* compiled from: EcosystemMultiAccountState.kt */
        /* renamed from: xsna.sxo$a$a, reason: collision with other inner class name */
        public static final class C3701a extends a {
            public static final C3701a a = new C3701a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3701a);
            }

            public final int hashCode() {
                return 560332627;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: EcosystemMultiAccountState.kt */
        public static abstract class b extends a {

            /* compiled from: EcosystemMultiAccountState.kt */
            /* renamed from: xsna.sxo$a$b$a, reason: collision with other inner class name */
            public static final class C3702a extends b {
                public final int a;
                public final exo b;

                public C3702a(int i, exo exoVar) {
                    this.a = i;
                    this.b = exoVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3702a)) {
                        return false;
                    }
                    C3702a c3702a = (C3702a) obj;
                    c3702a.getClass();
                    return this.a == c3702a.a && epx.f(this.b, c3702a.b);
                }

                public final int hashCode() {
                    return this.b.a.hashCode() + shy.a(this.a, Boolean.hashCode(false) * 31, 31);
                }

                public final String toString() {
                    return "ShimmersLoadingState(isBlocking=false, usersCount=" + this.a + ", ecoplateLoadingVisibleFieldsConfig=" + this.b + ')';
                }
            }

            /* compiled from: EcosystemMultiAccountState.kt */
            /* renamed from: xsna.sxo$a$b$b, reason: collision with other inner class name */
            public static final class C3703b extends b {
                public final boolean a = true;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3703b) && this.a == ((C3703b) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("SpinnerLoadingState(isBlocking="), this.a, ')');
                }
            }
        }

        /* compiled from: EcosystemMultiAccountState.kt */
        public static final class c extends a {
            public final ArrayList a;

            public c(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetUsers(usersList="), this.a);
            }
        }
    }

    public sxo(a aVar, SwitcherUiMode switcherUiMode) {
        this.b = aVar;
        this.c = switcherUiMode;
    }

    public static sxo a(sxo sxoVar, a aVar, SwitcherUiMode switcherUiMode, int i) {
        if ((i & 1) != 0) {
            aVar = sxoVar.b;
        }
        if ((i & 2) != 0) {
            switcherUiMode = sxoVar.c;
        }
        sxoVar.getClass();
        return new sxo(aVar, switcherUiMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxo)) {
            return false;
        }
        sxo sxoVar = (sxo) obj;
        return epx.f(this.b, sxoVar.b) && epx.f(this.c, sxoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "EcosystemMultiAccountState(sceneState=" + this.b + ", switcherConfiguration=" + this.c + ')';
    }
}
