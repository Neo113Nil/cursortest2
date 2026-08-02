package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class hui implements vpr {
    public final /* synthetic */ DeliveryTrackingModalView a;

    public hui(DeliveryTrackingModalView deliveryTrackingModalView) {
        this.a = deliveryTrackingModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        iui binding;
        ViewGroup bottomSheet;
        iui binding2;
        int intValue = ((Number) obj).intValue();
        DeliveryTrackingModalView deliveryTrackingModalView = this.a;
        if (intValue > 0) {
            binding2 = deliveryTrackingModalView.getBinding();
            FrameLayout frameLayout = binding2.b;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return null;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = m810.b(c.j(8, deliveryTrackingModalView)) + intValue;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            binding = deliveryTrackingModalView.getBinding();
            FrameLayout frameLayout2 = binding.b;
            ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return null;
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToTop = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
            frameLayout2.setLayoutParams(layoutParams4);
        }
        bottomSheet = deliveryTrackingModalView.getBottomSheet();
        bottomSheet.requestLayout();
        return zy11.a;
    }
}
