package defpackage;

import android.view.View;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TransfersDashboardButtonView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class ia61 implements zo31 {
    public final TransfersDashboardButtonView a;
    public final YbButtonView b;

    public ia61(TransfersDashboardButtonView transfersDashboardButtonView, YbButtonView ybButtonView) {
        this.a = transfersDashboardButtonView;
        this.b = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
