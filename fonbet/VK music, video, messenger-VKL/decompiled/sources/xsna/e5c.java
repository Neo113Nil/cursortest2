package xsna;

import com.vk.ecomm.cart.impl.common.models.CourierAddress;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r2c;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class e5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ r2c.p f;

    public e5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, r2c.p pVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = pVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.i iVar = (com.vk.ecomm.cart.impl.checkout.feature.state.i) (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.i) ? null : b7rVar2);
        if (iVar == null) {
            return b7rVar2;
        }
        this.b.element = z4c.U(this.c, iVar, this.d);
        com.vk.ecomm.cart.impl.checkout.feature.state.i d = com.vk.ecomm.cart.impl.checkout.feature.state.i.d(iVar, new CourierAddress(this.f.b, true, null, 4, null), null, 59);
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(d);
        return d;
    }
}
