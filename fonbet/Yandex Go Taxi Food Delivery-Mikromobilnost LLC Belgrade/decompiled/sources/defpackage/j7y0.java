package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;

/* loaded from: classes14.dex */
public final class j7y0 implements t52 {
    public final /* synthetic */ TaxiOrderTrackingView a;

    public j7y0(TaxiOrderTrackingView taxiOrderTrackingView) {
        this.a = taxiOrderTrackingView;
    }

    @Override // defpackage.t52
    public final void d(int i, boolean z) {
        this.a.onBottomSheetStateChanged(i, z);
    }

    @Override // defpackage.t52
    public final void f(View view, float f, boolean z, View view2) {
        this.a.onSlideOffsetChanged(f, z, view2);
    }
}
