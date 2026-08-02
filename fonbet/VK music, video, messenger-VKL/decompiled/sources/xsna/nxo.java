package xsna;

import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import java.util.ArrayList;

/* compiled from: EcosystemMultiAccountPatch.kt */
/* loaded from: classes6.dex */
public interface nxo extends xl50 {

    /* compiled from: EcosystemMultiAccountPatch.kt */
    public static final class a implements nxo {
        public static final a b = new a();
    }

    /* compiled from: EcosystemMultiAccountPatch.kt */
    public static abstract class b implements nxo {

        /* compiled from: EcosystemMultiAccountPatch.kt */
        public static final class a extends b {
            public final int b;
            public final exo c;

            public a(int i) {
                exo exoVar = exo.c;
                this.b = i;
                this.c = exoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                aVar.getClass();
                return this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.a.hashCode() + shy.a(this.b, Boolean.hashCode(false) * 31, 31);
            }

            public final String toString() {
                return "Shimmers(isBlocking=false, usersCount=" + this.b + ", ecoplateLoadingVisibleFieldsConfig=" + this.c + ')';
            }
        }

        /* compiled from: EcosystemMultiAccountPatch.kt */
        /* renamed from: xsna.nxo$b$b, reason: collision with other inner class name */
        public static final class C3423b extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3423b)) {
                    return false;
                }
                ((C3423b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "Spinner(isBlocking=true)";
            }
        }
    }

    /* compiled from: EcosystemMultiAccountPatch.kt */
    public static final class c implements nxo {
        public final ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b.equals(((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetUsers(usersList="), this.b);
        }
    }

    /* compiled from: EcosystemMultiAccountPatch.kt */
    public static final class d implements nxo {
        public final SwitcherUiMode b;

        public d(SwitcherUiMode switcherUiMode) {
            this.b = switcherUiMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateConfiguration(switcherUiMode=" + this.b + ')';
        }
    }
}
