package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.metrics.trackers.CriticalException;

/* compiled from: CartRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class ey9 {
    public final yd10 a;
    public final k9q0 b;
    public final m0 c;

    /* compiled from: CartRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Cart.Type.values().length];
            try {
                iArr[Cart.Type.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ey9(yd10 yd10Var, k9q0 k9q0Var, m0 m0Var) {
        this.a = yd10Var;
        this.b = k9q0Var;
        this.c = m0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId) {
        return rsg0.w0(yfb.x(this.a.q(userId))).l(new z7(new pt(12), 10));
    }

    public final io.reactivex.rxjava3.core.x<Boolean> b(a.C0919a c0919a, int i) {
        if (i < 1 || i > 1000) {
            CriticalException criticalException = new CriticalException(tgw.b(i, "Unable to remove product from cart. Quantity: `", "` not in 1..1000 range"));
            com.vk.metrics.eventtracking.b.a.a(criticalException);
            return io.reactivex.rxjava3.core.x.i(criticalException);
        }
        UserId userId = c0919a.c;
        return rsg0.w0(yfb.x(this.a.z((int) c0919a.a, userId, i))).l(new e8(new oc0(10), 8));
    }
}
