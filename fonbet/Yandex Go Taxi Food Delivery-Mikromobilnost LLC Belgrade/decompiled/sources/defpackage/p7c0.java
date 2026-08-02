package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.places.base.ui.modals.PlacesExpandedTopScrimView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes13.dex */
public final class p7c0 {
    public final FrameLayout a;
    public final sls b;
    public final sls c;
    public final PlacesExpandedTopScrimView d;
    public boolean e;
    public float f;

    public p7c0(SlideableBindingModalView slideableBindingModalView, sls slsVar, sls slsVar2) {
        this.a = slideableBindingModalView;
        this.b = slsVar;
        this.c = slsVar2;
        PlacesExpandedTopScrimView placesExpandedTopScrimView = new PlacesExpandedTopScrimView(slideableBindingModalView.getContext(), null, 0, 6, null);
        placesExpandedTopScrimView.setAlpha(0.0f);
        placesExpandedTopScrimView.setVisibility(8);
        this.d = placesExpandedTopScrimView;
    }

    public final void a() {
        this.d.setScrimColor(((Number) this.c.invoke()).intValue());
    }

    public final void b() {
        boolean z = this.e;
        PlacesExpandedTopScrimView placesExpandedTopScrimView = this.d;
        FrameLayout frameLayout = this.a;
        if (!z) {
            frameLayout.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            frameLayout.addView(placesExpandedTopScrimView, new FrameLayout.LayoutParams(-1, -2, 48));
            this.e = true;
        }
        frameLayout.bringChildToFront(placesExpandedTopScrimView);
    }

    public final void c(float f) {
        if (this.f == f) {
            return;
        }
        PlacesExpandedTopScrimView placesExpandedTopScrimView = this.d;
        boolean z = placesExpandedTopScrimView.getVisibility() == 0;
        boolean z2 = f > 0.0f;
        this.f = f;
        placesExpandedTopScrimView.setAlpha(f);
        placesExpandedTopScrimView.setVisibility(z2 ? 0 : 8);
        if (z || !z2) {
            return;
        }
        this.a.bringChildToFront(placesExpandedTopScrimView);
    }

    public final void d(t1w t1wVar) {
        int i = t1wVar.b;
        PlacesExpandedTopScrimView placesExpandedTopScrimView = this.d;
        placesExpandedTopScrimView.setTopWindowInsetHeight(i);
        placesExpandedTopScrimView.setCornerRadius(((Number) this.b.invoke()).intValue());
        placesExpandedTopScrimView.setTranslationY(-t1wVar.b);
    }

    public final void e(float f) {
        c(y6i0.c(f, 0.0f, 1.0f));
    }

    public final void f(int i) {
        c((i == 3 || i == 7) ? 1.0f : 0.0f);
    }
}
