package defpackage;

import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.preselect.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mtf implements vpr {
    public final /* synthetic */ DKPreselectFragment a;

    public mtf(DKPreselectFragment dKPreselectFragment) {
        this.a = dKPreselectFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        itf itfVar;
        itf itfVar2;
        itf itfVar3;
        awe0 awe0Var = (awe0) obj;
        boolean z = awe0Var instanceof yve0;
        DKPreselectFragment dKPreselectFragment = this.a;
        if (z) {
            itfVar3 = dKPreselectFragment.callbacks;
            ((a) (itfVar3 != null ? itfVar3 : null)).p(((yve0) awe0Var).a);
        } else if (awe0Var instanceof zve0) {
            itfVar2 = dKPreselectFragment.callbacks;
            zve0 zve0Var = (zve0) awe0Var;
            ((a) (itfVar2 != null ? itfVar2 : null)).z(new TextRes.IntRes(zve0Var.a), new Integer(zve0Var.b));
        } else {
            if (!(awe0Var instanceof xve0)) {
                w511.b();
                return null;
            }
            itfVar = dKPreselectFragment.callbacks;
            itf itfVar4 = itfVar != null ? itfVar : null;
            PaymentMethod paymentMethod = ((xve0) awe0Var).a;
            ((a) itfVar4).getClass();
            o3a0.e.a(paymentMethod);
        }
        return zy11.a;
    }
}
