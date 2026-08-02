package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.InputField;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.r2c;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class j5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ r2c.z f;

    public j5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, r2c.z zVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = zVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        InputField inputField = (InputField) (!(b7rVar2 instanceof InputField) ? null : b7rVar2);
        if (inputField == null) {
            return b7rVar2;
        }
        this.b.element = z4c.U(this.c, inputField, this.d);
        InputField d = InputField.d(inputField, this.f.c, null, 15487);
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(d);
        return d;
    }
}
