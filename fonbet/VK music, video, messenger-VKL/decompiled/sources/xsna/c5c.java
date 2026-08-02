package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentOptionsField;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r2c;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class c5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ r2c.l f;

    public c5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, r2c.l lVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = lVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        this.b.element = z4c.U(this.c, b7rVar2, this.d);
        boolean z = b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.d;
        r2c.l lVar = this.f;
        if (z) {
            b7rVar2 = com.vk.ecomm.cart.impl.checkout.feature.state.d.d((com.vk.ecomm.cart.impl.checkout.feature.state.d) b7rVar2, lVar.c);
        } else if (b7rVar2 instanceof PaymentOptionsField) {
            PaymentOptionsField.Option.Type.a aVar = PaymentOptionsField.Option.Type.Companion;
            String str2 = lVar.c;
            aVar.getClass();
            b7rVar2 = PaymentOptionsField.d((PaymentOptionsField) b7rVar2, PaymentOptionsField.Option.Type.a.a(str2));
        }
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(b7rVar2);
        return b7rVar2;
    }
}
