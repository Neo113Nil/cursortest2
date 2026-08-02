package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import java.util.ArrayList;

/* compiled from: EcosystemMultiAccountSideEffects.kt */
/* loaded from: classes6.dex */
public interface rxo {

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class a implements rxo {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 987172639;
        }

        public final String toString() {
            return "CloseSwitcher";
        }
    }

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class b implements rxo {
        public final MultiAccountEntryPoint a;

        public b(MultiAccountEntryPoint multiAccountEntryPoint) {
            this.a = multiAccountEntryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenAuth(from=" + this.a + ')';
        }
    }

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class c implements rxo {
        public final ArrayList a;
        public final MultiAccountEntryPoint b;

        public c(ArrayList arrayList, MultiAccountEntryPoint multiAccountEntryPoint) {
            this.a = arrayList;
            this.b = multiAccountEntryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenAuthOrCarousel(userIds=" + this.a + ", from=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class d implements rxo {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1887921978;
        }

        public final String toString() {
            return "OpenLogoutMainUserDialog";
        }
    }

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class e implements rxo {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenPinCode(clickedUser="), this.a, ')');
        }
    }

    /* compiled from: EcosystemMultiAccountSideEffects.kt */
    public static final class f implements rxo {
        public final SwitcherLaunchMode.SwitcherCallbackMode a;
        public final com.vk.superapp.multiaccount.api.f b;

        public f(SwitcherLaunchMode.SwitcherCallbackMode switcherCallbackMode, com.vk.superapp.multiaccount.api.f fVar) {
            this.a = switcherCallbackMode;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendCallbackUserClicked(launchMode=" + this.a + ", clickedUser=" + this.b + ')';
        }
    }
}
