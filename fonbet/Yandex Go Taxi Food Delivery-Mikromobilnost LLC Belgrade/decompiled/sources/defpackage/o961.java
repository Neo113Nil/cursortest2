package defpackage;

import android.view.View;
import com.ybsdk.feature.transfer.internal.screens.common.widgets.TransferErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class o961 implements zo31 {
    public final TransferErrorView a;
    public final YbButtonView b;

    public o961(TransferErrorView transferErrorView, YbButtonView ybButtonView) {
        this.a = transferErrorView;
        this.b = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
