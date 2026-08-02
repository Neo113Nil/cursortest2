package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r2c;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class i5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ r2c.z f;

    public i5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, r2c.z zVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = zVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.h hVar = (com.vk.ecomm.cart.impl.checkout.feature.state.h) (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h) ? null : b7rVar2);
        if (hVar == null) {
            return b7rVar2;
        }
        this.b.element = z4c.U(this.c, hVar, this.d);
        com.vk.ecomm.cart.impl.checkout.feature.state.h d = com.vk.ecomm.cart.impl.checkout.feature.state.h.d(hVar, InputField.d(hVar.e, this.f.c, null, 15487), 15);
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(d);
        return d;
    }
}
