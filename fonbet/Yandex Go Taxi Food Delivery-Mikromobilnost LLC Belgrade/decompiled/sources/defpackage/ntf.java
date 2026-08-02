package defpackage;

import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.preselect.a;
import com.yandex.payment.divkit.select.PlusCardTopUpState;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ntf implements vpr {
    public final /* synthetic */ DKPreselectFragment a;

    public ntf(DKPreselectFragment dKPreselectFragment) {
        this.a = dKPreselectFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        itf itfVar;
        zry0 textProvider;
        itf itfVar2;
        int i = a.a[((PlusCardTopUpState) obj).ordinal()];
        DKPreselectFragment dKPreselectFragment = this.a;
        if (i == 1) {
            itfVar = dKPreselectFragment.callbacks;
            itf itfVar3 = itfVar != null ? itfVar : null;
            textProvider = dKPreselectFragment.getTextProvider();
            ((com.yandex.payment.sdk.ui.preselect.a) itfVar3).q(true, new TextRes.IntRes(textProvider.d));
        } else if (i == 2) {
            itfVar2 = dKPreselectFragment.callbacks;
            PreselectActivity preselectActivity = ((com.yandex.payment.sdk.ui.preselect.a) (itfVar2 != null ? itfVar2 : null)).a;
            preselectActivity.hideLoading$paymentsdk_release();
            preselectActivity.removeFragment$paymentsdk_release(j9h0.loading_fragment_container);
        }
        return zy11.a;
    }
}
