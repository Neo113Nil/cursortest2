package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.dialog.CartCommunityMenuAction;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: CartNavigationPatch.kt */
/* loaded from: classes18.dex */
public abstract class lx9 {

    /* compiled from: CartNavigationPatch.kt */
    public static final class a extends lx9 {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ConfirmClearCart(communityId="), this.a, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class b extends lx9 {
        public final a.C0919a a;
        public final boolean b;

        public b(a.C0919a c0919a, boolean z) {
            this.a = c0919a;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmProductRemove(id=");
            sb.append(this.a);
            sb.append(", moveToFavoriteAvailable=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class c extends lx9 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 11880460;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class d extends lx9 {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenCheckout(communityId="), this.a, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class e extends lx9 {
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
            return gp.b(new StringBuilder("OpenCommunityShop(communityId="), this.a, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class f extends lx9 {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class g extends lx9 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1985845565;
        }

        public final String toString() {
            return "OpenMarket";
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class h extends lx9 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1913309844;
        }

        public final String toString() {
            return "OpenOrders";
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class i extends lx9 {
        public final String a;
        public final UserId b;

        public i(String str, UserId userId) {
            this.a = str;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenOzonCheckout(url=");
            sb.append(this.a);
            sb.append(", communityId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class j extends lx9 {
        public final a.C0919a a;

        public j(a.C0919a c0919a) {
            this.a = c0919a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenProductFullPage(id=" + this.a + ')';
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class k extends lx9 {
        public final UserId a;
        public final List<CartCommunityMenuAction> b;

        public k(UserId userId, ListBuilder listBuilder) {
            this.a = userId;
            this.b = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowCommunityMenu(communityId=");
            sb.append(this.a);
            sb.append(", actions=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class l extends lx9 {
        public final b7k0 a;

        public l(b7k0 b7k0Var) {
            this.a = b7k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(snackbarAction=" + this.a + ')';
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class m extends lx9 {
        public final a.C0919a a;
        public final boolean b;

        public m(a.C0919a c0919a, boolean z) {
            this.a = c0919a;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.a, mVar.a) && this.b == mVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleFavorite(id=");
            sb.append(this.a);
            sb.append(", isFavorite=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CartNavigationPatch.kt */
    public static final class n extends lx9 {
        public final int a;

        public n(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("WriteToSeller(contactId="), this.a, ')');
        }
    }
}
