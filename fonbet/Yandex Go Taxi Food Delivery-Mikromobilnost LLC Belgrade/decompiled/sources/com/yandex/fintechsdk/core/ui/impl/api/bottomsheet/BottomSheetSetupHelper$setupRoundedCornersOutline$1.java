package com.yandex.fintechsdk.core.ui.impl.api.bottomsheet;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yandex/fintechsdk/core/ui/impl/api/bottomsheet/BottomSheetSetupHelper$setupRoundedCornersOutline$1", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomSheetSetupHelper$setupRoundedCornersOutline$1 extends ViewOutlineProvider {
    final /* synthetic */ float $cornerRadius;

    public BottomSheetSetupHelper$setupRoundedCornersOutline$1(float f) {
        this.$cornerRadius = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.$cornerRadius);
    }
}
