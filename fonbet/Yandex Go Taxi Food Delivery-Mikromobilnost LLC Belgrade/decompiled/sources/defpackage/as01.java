package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final /* synthetic */ class as01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Text b;

    public /* synthetic */ as01(Text text, int i) {
        this.a = i;
        this.b = text;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        YbButtonView.a actionButtonText$lambda$17$lambda$16;
        YbButtonView.a actionButtonText$lambda$17$lambda$15$lambda$14;
        int i = this.a;
        Text text = this.b;
        YbButtonView.a aVar = (YbButtonView.a) obj;
        switch (i) {
            case 0:
                actionButtonText$lambda$17$lambda$16 = TransferResultFragment.setActionButtonText$lambda$17$lambda$16(text, aVar);
                return actionButtonText$lambda$17$lambda$16;
            default:
                actionButtonText$lambda$17$lambda$15$lambda$14 = TransferResultFragment.setActionButtonText$lambda$17$lambda$15$lambda$14(text, aVar);
                return actionButtonText$lambda$17$lambda$15$lambda$14;
        }
    }
}
