package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

/* loaded from: classes14.dex */
public final class l7y0 implements zo31 {
    public final TaxiOrderTrackingView a;
    public final GoFrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final LinearLayout f;
    public final ViewStub g;
    public final FloatButtonHolderLayout h;
    public final LinearLayout i;

    public l7y0(TaxiOrderTrackingView taxiOrderTrackingView, GoFrameLayout goFrameLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout, ViewStub viewStub, FloatButtonHolderLayout floatButtonHolderLayout, LinearLayout linearLayout2) {
        this.a = taxiOrderTrackingView;
        this.b = goFrameLayout;
        this.c = frameLayout;
        this.d = frameLayout2;
        this.e = frameLayout3;
        this.f = linearLayout;
        this.g = viewStub;
        this.h = floatButtonHolderLayout;
        this.i = linearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
