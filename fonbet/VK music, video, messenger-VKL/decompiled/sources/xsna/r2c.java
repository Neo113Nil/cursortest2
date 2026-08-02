package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;

/* compiled from: CheckoutAction.kt */
/* loaded from: classes18.dex */
public interface r2c extends kj50 {

    /* compiled from: CheckoutAction.kt */
    public static final class a implements r2c {
    }

    /* compiled from: CheckoutAction.kt */
    public static final class b implements r2c {
        public final FieldKey b;

        public b(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CheckBoxUpdated(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class c implements r2c {
        public final FieldKey b;

        public c(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickActionButton(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class d implements r2c {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1686324830;
        }

        public final String toString() {
            return "ClickBack";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class e implements r2c {
        public final FieldKey b;

        public e(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickBannerShowMore(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class f implements r2c {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 882360072;
        }

        public final String toString() {
            return "ClickContinueBuy";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class g implements r2c {
        public final FieldKey b;

        public g(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickDeliveryPointSelect(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class h implements r2c {
        public final FieldKey b;

        public h(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickDropdown(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class i implements r2c {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ClickLink(url="), this.b, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class j implements r2c {
        public final FieldKey b;

        public j(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickNextInputField(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class k implements r2c {
        public final FieldKey b;

        public k(FieldKey fieldKey) {
            this.b = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickPrompt(key=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class l implements r2c {
        public final FieldKey b;
        public final String c;

        public l(FieldKey fieldKey, String str) {
            this.b = fieldKey;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickRadioOption(key=");
            sb.append(this.b);
            sb.append(", selectedOption=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class m implements r2c {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 496595304;
        }

        public final String toString() {
            return "ClickSuccessCheckoutAction";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class n implements r2c {
        public final ActionField.Type b;

        public n(ActionField.Type type) {
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Complete(type=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class o implements r2c {
        public final CourierAddress b;

        public o(CourierAddress courierAddress) {
            this.b = courierAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CourierAddressSelected(address=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class p implements r2c {
        public final String b;

        public p(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CustomAddressSelected(address="), this.b, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class q implements r2c {
        public final DeliveryPoint b;

        public q(DeliveryPoint deliveryPoint) {
            this.b = deliveryPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "DeliveryPointSelected(point=" + this.b + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class r implements r2c {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 200471521;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public interface s extends r2c {

        /* compiled from: CheckoutAction.kt */
        public static final class a implements s {
            public final FieldKey b;
            public final long c;

            public a(FieldKey fieldKey, long j) {
                this.b = fieldKey;
                this.c = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Click(key=");
                sb.append(this.b);
                sb.append(", productId=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: CheckoutAction.kt */
        public static final class b implements s {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1374446137;
            }

            public final String toString() {
                return "Load";
            }
        }

        /* compiled from: CheckoutAction.kt */
        public static final class c implements s {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -336580683;
            }

            public final String toString() {
                return "Retry";
            }
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class t implements r2c {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1379747434;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class u implements r2c {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 1927704055;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class v implements r2c {
        public final int b;
        public final String c;
        public final FieldKey d;

        public v(int i, String str, FieldKey fieldKey) {
            this.b = i;
            this.c = str;
            this.d = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.b == vVar.b && epx.f(this.c, vVar.c) && epx.f(this.d, vVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            return "SelectCity(cityId=" + this.b + ", cityName=" + this.c + ", key=" + this.d + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class w implements r2c {
        public final String b;
        public final FieldKey c;

        public w(FieldKey fieldKey, String str) {
            this.b = str;
            this.c = fieldKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.b, wVar.b) && epx.f(this.c, wVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "SelectDropdownOption(optionId=" + this.b + ", key=" + this.c + ')';
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class x implements r2c {
        public final boolean b;

        public x(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.b == ((x) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowSuccessCheckout(isPaidOrder="), this.b, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    public static final class y implements r2c {
    }

    /* compiled from: CheckoutAction.kt */
    public static final class z implements r2c {
        public final FieldKey b;
        public final String c;
        public final a d;

        /* compiled from: CheckoutAction.kt */
        public static abstract class a {

            /* compiled from: CheckoutAction.kt */
            /* renamed from: xsna.r2c$z$a$a, reason: collision with other inner class name */
            public static final class C3592a extends a {
                public static final C3592a a = new C3592a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3592a);
                }

                public final int hashCode() {
                    return 1800007206;
                }

                public final String toString() {
                    return "Cleared";
                }
            }

            /* compiled from: CheckoutAction.kt */
            public static final class b extends a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1318841001;
                }

                public final String toString() {
                    return "DoneActionClicked";
                }
            }

            /* compiled from: CheckoutAction.kt */
            public static final class c extends a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 708799285;
                }

                public final String toString() {
                    return "Updated";
                }
            }
        }

        public z(FieldKey fieldKey, String str, a aVar) {
            this.b = fieldKey;
            this.c = str;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && epx.f(this.c, zVar.c) && epx.f(this.d, zVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "UpdateInputField(key=" + this.b + ", updatedValue=" + this.c + ", reason=" + this.d + ')';
        }
    }
}
