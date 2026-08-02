package defpackage;

import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes14.dex */
public final class e1y0 implements z0y0 {
    public final /* synthetic */ TaxiOrderFeedView a;

    public e1y0(TaxiOrderFeedView taxiOrderFeedView) {
        this.a = taxiOrderFeedView;
    }

    @Override // defpackage.z0y0
    public final void Hd(int i, boolean z) {
        m7y0 m7y0Var;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        m7y0 m7y0Var2;
        m7y0 m7y0Var3;
        m7y0 m7y0Var4;
        TaxiOrderFeedView taxiOrderFeedView = this.a;
        m7y0Var = taxiOrderFeedView.delegate;
        anchorBottomSheetBehavior = ((k7y0) m7y0Var).a.bottomSheetBehavior;
        if (anchorBottomSheetBehavior.E == i) {
            return;
        }
        if (i == 3) {
            m7y0Var2 = taxiOrderFeedView.delegate;
            ((k7y0) m7y0Var2).a.setBehaviourState(i);
        } else if (i == 4) {
            m7y0Var3 = taxiOrderFeedView.delegate;
            ((k7y0) m7y0Var3).a.setBehaviourState(i);
        } else if (i == 6) {
            m7y0Var4 = taxiOrderFeedView.delegate;
            ((k7y0) m7y0Var4).a.setBehaviourState(i);
        }
        if (z) {
            qke.E(taxiOrderFeedView.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
        }
    }

    @Override // defpackage.z0y0
    public final void La(boolean z) {
        m7y0 m7y0Var;
        m7y0Var = this.a.delegate;
        ((k7y0) m7y0Var).a.setCanDrag(z);
    }
}
