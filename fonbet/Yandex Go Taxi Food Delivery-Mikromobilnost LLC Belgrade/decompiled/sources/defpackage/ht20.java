package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.b;

/* loaded from: classes3.dex */
public final class ht20 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final qbg c;

    public /* synthetic */ ht20(n3w n3wVar, qbg qbgVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = qbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        qbg qbgVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new MobilePaymentSelectContactFragment((kt20) n3wVar.a, (ug01) qbgVar.get());
            default:
                return new TransferPhoneInputFragment((b) n3wVar.a, (ug01) qbgVar.get());
        }
    }
}
