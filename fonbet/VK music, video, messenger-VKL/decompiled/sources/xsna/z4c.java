package xsna;

import com.ironsource.C4572u;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.c;
import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import xsna.a7f0;
import xsna.aw9;
import xsna.g6c;
import xsna.r2c;
import xsna.xcq0;

/* compiled from: CheckoutFeature.kt */
/* loaded from: classes18.dex */
public final class z4c extends wk50<o9c, w8c, r2c, aw9> {
    public final mzp0 f;
    public final f4z g;
    public final f4z h;
    public final c8c i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;

    /* compiled from: CheckoutFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionField.Type.values().length];
            try {
                iArr[ActionField.Type.OPEN_SELF_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionField.Type.OPEN_COURIER_MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public z4c(w7c w7cVar, mzp0 mzp0Var) {
        super(null, w7cVar);
        this.f = mzp0Var;
        this.g = new f4z();
        this.h = new f4z();
        this.i = new c8c(new yd10());
        this.j = new bpn0(new zg(this, 21));
        this.k = new bpn0(new ah(this, 16));
        this.l = new bpn0(new cb(this, 12));
    }

    public static final boolean U(z4c z4cVar, b7r b7rVar, xcq0 xcq0Var) {
        z4cVar.getClass();
        if (xcq0Var instanceof xcq0.c) {
            return true;
        }
        if (xcq0Var instanceof xcq0.a) {
            return b7rVar.b();
        }
        if (xcq0Var instanceof xcq0.b) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void V(z4c z4cVar, boolean z, UserId userId, Long l, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar2, r2c r2cVar) {
        bpn0 bpn0Var = z4cVar.j;
        if (z) {
            z4cVar.T(new aw9.j(fVar));
            ((lbq0) bpn0Var.getValue()).a(userId, l, fVar, new hb(z4cVar, 24), new cp9(z4cVar, fVar2, r2cVar, 1));
        } else {
            z4cVar.T(new aw9.b(fVar, false));
            ((lbq0) bpn0Var.getValue()).c.onNext(new Triple<>(userId, l, fVar));
        }
    }

    public static c.a X(w8c w8cVar) {
        com.vk.ecomm.cart.impl.checkout.feature.state.c cVar;
        b7r b7rVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = w8cVar.g;
        FieldKey fieldKey = new FieldKey(C4572u.g, "city_id", null, null, 12, null);
        LinkedHashMap<String, b7r> b = fVar.b(fieldKey.b);
        if (b == null || (b7rVar = b.get(fieldKey.c)) == null) {
            cVar = null;
        } else if (b7rVar instanceof ppg0) {
            b7r b7rVar2 = ((ppg0) b7rVar).c.get(fieldKey.d);
            if (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.c)) {
                b7rVar2 = null;
            }
            cVar = (com.vk.ecomm.cart.impl.checkout.feature.state.c) b7rVar2;
        } else {
            if (!(b7rVar instanceof com.vk.ecomm.cart.impl.checkout.feature.state.c)) {
                b7rVar = null;
            }
            cVar = (com.vk.ecomm.cart.impl.checkout.feature.state.c) b7rVar;
        }
        if (cVar != null) {
            return cVar.c;
        }
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xsna.wk50
    public final void N(xsna.w8c r26, xsna.r2c r27) {
        /*
            Method dump skipped, instructions count: 2818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.z4c.N(xsna.km50, xsna.kj50):void");
    }

    public final void W(w8c w8cVar, boolean z) {
        mzp0 mzp0Var;
        T(aw9.c.b.b);
        if (z && (mzp0Var = this.f) != null) {
            mzp0Var.a();
        }
        int i = 1;
        C(r2c.s.b.b);
        UserId userId = w8cVar.b;
        Long l = w8cVar.c;
        c8c c8cVar = this.i;
        c8cVar.a.getClass();
        tfx tfxVar = new tfx("market.getCheckoutSettings", new fq(18), new gq(24));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (l != null) {
            tfx.m(tfxVar, "item_id", l.longValue(), 0L, 8);
        }
        a7f0.a.f(this, c8cVar.c(tfxVar), new uw9(z, w8cVar, this, i), new a8(this, 22), 1);
    }

    public final void Y(w8c w8cVar, CourierAddress courierAddress) {
        Coordinates coordinates;
        c.a X = X(w8cVar);
        if (X != null) {
            String str = X.b;
            int i = X.a;
            if (i != 0) {
                City city = new City(str, i);
                if ((courierAddress != null ? courierAddress.b : null) != null && !courierAddress.c) {
                    str = courierAddress.b;
                }
                boolean z = (courierAddress == null || courierAddress.c || courierAddress.b.length() <= 0) ? false : true;
                if (courierAddress == null || (coordinates = courierAddress.d) == null) {
                    coordinates = X.c;
                }
                this.g.b(new g6c.d(new Address(city, str, z, coordinates)));
                return;
            }
        }
        b0();
    }

    public final void Z(w8c w8cVar, List<Integer> list, DeliveryPoint deliveryPoint) {
        int i;
        c.a X = X(w8cVar);
        if (X == null || (i = X.a) == 0) {
            b0();
        } else {
            this.g.b(new g6c.g(w8cVar.b, new City(X.b, i), X.c, list, deliveryPoint));
        }
    }

    public final void b0() {
        this.g.b(new g6c.m(new u8k0(tq.h(tlo0.Companion, R.string.ecomm_checkout_select_city), null)));
    }

    public final void c0(Throwable th, r2c r2cVar) {
        u8k0 a2 = l4c.a(th);
        f4z f4zVar = this.g;
        if (a2 != null) {
            f4zVar.b(new g6c.m(a2));
        } else {
            f4zVar.b(new g6c.m(new u8k0(tq.h(tlo0.Companion, R.string.ecomm_cart_error_abstract), r2cVar)));
        }
    }
}
