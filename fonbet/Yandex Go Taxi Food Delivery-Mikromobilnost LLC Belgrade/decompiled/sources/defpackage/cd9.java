package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodDivVariable;
import com.ybsdk.feature.change.payment.method.internal.ui.c;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cd9 implements vpr {
    public final /* synthetic */ c a;

    public cd9(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        ab0 ab0Var = (ab0) obj;
        boolean z = ab0Var instanceof za0;
        c cVar = this.a;
        if (z) {
            cVar.Z(new dd9(ChangePaymentMethodDivVariable.TRUST_ID.getVariableName(), ((za0) ab0Var).a));
        } else if (jl40.l(ab0Var, ya0.a)) {
            cVar.Z(new ed9(new n0t0(new Text.Resource(dzh0.ybsdk_deposit_card_bind_failed), Text.Empty.INSTANCE)));
        } else if (!jl40.l(ab0Var, xa0.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
