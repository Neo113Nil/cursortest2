package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.List;

/* compiled from: CheckoutNavigationPatch.kt */
/* loaded from: classes18.dex */
public interface g6c {

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class a implements g6c {
        public static final a a = new a();
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class b implements g6c {
        public final UserId a;
        public final Long b;

        public b(UserId userId, Long l) {
            this.a = userId;
            this.b = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Long l = this.b;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyOrderCreated(groupId=");
            sb.append(this.a);
            sb.append(", itemId=");
            return iq.b(sb, this.b, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class c implements g6c {
        public final String a;
        public final long b;
        public final UserId c;

        public c(long j, UserId userId, String str) {
            this.a = str;
            this.b = j;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChat(orderId=");
            sb.append(this.a);
            sb.append(", contactId=");
            sb.append(this.b);
            sb.append(", groupId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class d implements g6c {
        public final Address a;

        public d(Address address) {
            this.a = address;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenCourierMap(address=" + this.a + ')';
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class e implements g6c {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenCustomAddressInput(address="), this.a, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class f implements g6c {
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
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class g implements g6c {
        public final UserId a;
        public final City b;
        public final Coordinates c;
        public final List<Integer> d;
        public final DeliveryPoint e;

        public g(UserId userId, City city, Coordinates coordinates, List<Integer> list, DeliveryPoint deliveryPoint) {
            this.a = userId;
            this.b = city;
            this.c = coordinates;
            this.d = list;
            this.e = deliveryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
            Coordinates coordinates = this.c;
            int a = fw3.a((hashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31, 31, this.d);
            DeliveryPoint deliveryPoint = this.e;
            return a + (deliveryPoint != null ? deliveryPoint.hashCode() : 0);
        }

        public final String toString() {
            return "OpenNewDeliveryPointsMap(groupId=" + this.a + ", city=" + this.b + ", cityCoordinates=" + this.c + ", serviceIds=" + this.d + ", selectedPoint=" + this.e + ')';
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class h implements g6c {
        public final xw80 a;

        public h(xw80 xw80Var) {
            this.a = xw80Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenOrderProduct(product=" + this.a + ')';
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class i implements g6c {
        public final UserId a;

        public i(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenOrders(groupId="), this.a, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class j implements g6c {
        public final OrderPaymentParameters a;
        public final UserId b;

        public j(OrderPaymentParameters orderPaymentParameters, UserId userId) {
            this.a = orderPaymentParameters;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPaymentFlow(paymentParameters=");
            sb.append(this.a);
            sb.append(", groupId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class k implements g6c {
        public final com.vk.ecomm.cart.impl.checkout.feature.state.e a;
        public final FieldKey b;

        public k(com.vk.ecomm.cart.impl.checkout.feature.state.e eVar, FieldKey fieldKey) {
            this.a = eVar;
            this.b = fieldKey;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowDropdownOptionsDialog(dropdownField=" + this.a + ", dropdownFieldKey=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class l implements g6c {
        public final Integer a;
        public final FieldKey b;

        public l(Integer num, FieldKey fieldKey) {
            this.a = num;
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "ShowSelectCityDialog(selectedCityId=" + this.a + ", cityFieldKey=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutNavigationPatch.kt */
    public static final class m implements g6c {
        public final u8k0 a;

        public m(u8k0 u8k0Var) {
            this.a = u8k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowSnackbar(snackbarModel=" + this.a + ')';
        }
    }
}
