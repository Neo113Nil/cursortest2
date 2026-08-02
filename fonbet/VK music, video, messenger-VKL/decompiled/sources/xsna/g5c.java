package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.c;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r2c;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class g5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ r2c.v f;

    public g5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, r2c.v vVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = vVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.c cVar = (com.vk.ecomm.cart.impl.checkout.feature.state.c) (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.c) ? null : b7rVar2);
        if (cVar == null) {
            return b7rVar2;
        }
        this.b.element = z4c.U(this.c, cVar, this.d);
        r2c.v vVar = this.f;
        com.vk.ecomm.cart.impl.checkout.feature.state.c d = com.vk.ecomm.cart.impl.checkout.feature.state.c.d(cVar, new c.a(vVar.b, vVar.c, null), null, 251);
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(d);
        return d;
    }
}
