package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.fb5;
import defpackage.g18;
import defpackage.js4;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes6.dex */
public final class fb5 implements eb5 {
    public final /* synthetic */ BaseSummaryTooltipPopup a;

    public fb5(BaseSummaryTooltipPopup baseSummaryTooltipPopup) {
        this.a = baseSummaryTooltipPopup;
    }

    @Override // defpackage.eb5
    public final void dismiss() {
        try {
            this.a.dismiss();
        } catch (Exception e) {
            jst.e.k(e, "Cannot dismiss tooltip view");
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, ec3] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, dai] */
    @Override // defpackage.eb5
    public final void t8(final long j, final Runnable runnable) {
        final View view;
        BaseSummaryTooltipPopup baseSummaryTooltipPopup = this.a;
        view = baseSummaryTooltipPopup.anchorView;
        if (view != null) {
            Rect rect = xw31.a;
            int visibility = view.getVisibility();
            if (visibility == 8 || visibility == 4 || baseSummaryTooltipPopup.isShowing()) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = g18.u1;
            final boolean z = true;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.tooltips.BaseSummaryTooltipPopup$SummaryTooltipMvpView$show$$inlined$doOnPreDrawCancelable$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int i;
                    int i2;
                    TooltipView tooltipView;
                    fb5 fb5Var = this;
                    View view2 = view;
                    long j2 = j;
                    Runnable runnable2 = runnable;
                    BaseSummaryTooltipPopup baseSummaryTooltipPopup2 = fb5Var.a;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    i = baseSummaryTooltipPopup2.horizontalOffset;
                    i2 = baseSummaryTooltipPopup2.verticalOffset;
                    baseSummaryTooltipPopup2.showAbove(view2, i, i2);
                    if (j2 != -1) {
                        tooltipView = baseSummaryTooltipPopup2.tooltip;
                        tooltipView.postDelayed(new js4(8, baseSummaryTooltipPopup2), j2);
                    }
                    ((g18) Ref$ObjectRef.this.element).cancel();
                    return z;
                }
            };
            ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, view, 1);
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            baseSummaryTooltipPopup.anchorPreDrawCancellable = (g18) ref$ObjectRef.element;
        }
    }
}
