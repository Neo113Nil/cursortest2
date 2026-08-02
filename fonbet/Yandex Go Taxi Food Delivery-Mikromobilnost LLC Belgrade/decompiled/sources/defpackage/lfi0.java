package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodStatusEntity;
import com.ybsdk.widgets.common.k;

/* loaded from: classes3.dex */
public final class lfi0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        gfi0 gfi0Var = (gfi0) obj;
        return new kfi0(gfi0Var.a == RebindPaymentMethodStatusEntity.PENDING ? null : gfi0Var.b, new k(pc70.a, unr0.h(Text.Companion, dzh0.ybsdk_reports_reports_processing_title), null, null, null, null, null, 252));
    }
}
