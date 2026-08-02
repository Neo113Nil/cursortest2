package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final class l7t0 implements t52 {
    public final /* synthetic */ SolidSummaryView a;

    public l7t0(SolidSummaryView solidSummaryView) {
        this.a = solidSummaryView;
    }

    @Override // defpackage.t52
    public final void d(int i, boolean z) {
        SolidSummaryView solidSummaryView = this.a;
        solidSummaryView.updateFrameBackground();
        solidSummaryView.onBehaviorStateChanged(i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r7 == r8) goto L25;
     */
    @Override // defpackage.t52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(float f, boolean z, View view) {
        qr31 qr31Var;
        boolean z2;
        t7t0 t7t0Var;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior2;
        int i;
        t7t0 t7t0Var2;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior3;
        SolidSummaryView solidSummaryView = this.a;
        qr31Var = solidSummaryView.viewGroupBubbleContainer;
        pr31 pr31Var = qr31Var.e;
        if (pr31Var != null) {
            pr31Var.a();
        }
        z2 = solidSummaryView.firstAnimateToAnchored;
        float f2 = 0.0f;
        if (!z2 || f >= 0.0f) {
            t7t0Var = solidSummaryView.binding;
            t7t0Var.h.setTranslationY(0.0f);
        } else {
            t7t0Var2 = solidSummaryView.binding;
            LinearLayout linearLayout = t7t0Var2.h;
            anchorBottomSheetBehavior3 = solidSummaryView.summaryAnchorBehavior;
            linearLayout.setTranslationY((-f) * anchorBottomSheetBehavior3.a);
        }
        anchorBottomSheetBehavior = solidSummaryView.summaryAnchorBehavior;
        float x = anchorBottomSheetBehavior.x();
        float max = Float.compare(x, 1.0f) == 0 ? 0.0f : (float) Math.max(0.0d, (f - x) / (1.0f - x));
        if (Float.compare(f, x) <= 0 || Float.compare(x, 1.0f) != 0) {
            if (z) {
                anchorBottomSheetBehavior2 = solidSummaryView.summaryAnchorBehavior;
                int y = anchorBottomSheetBehavior2.y();
                SolidSummaryView.Companion.getClass();
                i = SolidSummaryView.BEHAVIOR_SUMMARY_COLLAPSED;
            }
            f2 = max;
        } else {
            f2 = 1.0f;
        }
        solidSummaryView.onContentAlphaChanged(f2);
        solidSummaryView.updateTopContainerElevation(f2);
        solidSummaryView.onExpandedSummarySlideChanged(f2);
    }
}
