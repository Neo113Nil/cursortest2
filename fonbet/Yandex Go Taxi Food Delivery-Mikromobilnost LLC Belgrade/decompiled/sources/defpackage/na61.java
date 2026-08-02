package defpackage;

import android.view.View;
import com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class na61 implements zo31 {
    public final TsarButtonView a;
    public final YbButtonView b;

    public na61(TsarButtonView tsarButtonView, YbButtonView ybButtonView) {
        this.a = tsarButtonView;
        this.b = ybButtonView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
