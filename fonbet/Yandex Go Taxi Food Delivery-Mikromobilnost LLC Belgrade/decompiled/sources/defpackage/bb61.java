package defpackage;

import android.view.View;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.views.SavingsDivCardView;
import com.ybsdk.widgets.common.ImageViewWithCustomScaleTypes;

/* loaded from: classes3.dex */
public final class bb61 implements zo31 {
    public final SavingsDivCardView a;
    public final YbDivView b;
    public final ImageViewWithCustomScaleTypes c;

    public bb61(SavingsDivCardView savingsDivCardView, YbDivView ybDivView, ImageViewWithCustomScaleTypes imageViewWithCustomScaleTypes) {
        this.a = savingsDivCardView;
        this.b = ybDivView;
        this.c = imageViewWithCustomScaleTypes;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
