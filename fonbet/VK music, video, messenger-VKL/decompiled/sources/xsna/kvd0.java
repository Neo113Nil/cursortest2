package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ProfileContentViewPagerHeightControllerImpl.kt */
/* loaded from: classes5.dex */
public final class kvd0 implements ivd0 {
    public final ViewPager2 a;
    public final jvd0 b = new jvd0(this, 0);
    public int c;
    public int d;
    public int e;
    public int f;

    public kvd0(ViewPager2 viewPager2) {
        this.a = viewPager2;
        boolean z = viewPager2.s;
        this.c = -1;
        this.d = -1;
    }

    public static int e(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(view.getWidth(), 1073741823)), 1073741824), tr.a(0, 1073741823, 0, 0));
        return view.getMeasuredHeight();
    }

    @Override // xsna.ivd0
    public final void a(float f, int i) {
        c();
        int i2 = i + 1;
        if (this.c != i && this.d != i2) {
            this.c = i;
            this.d = i2;
        }
        View d = d(this.c);
        View d2 = d(this.d);
        int e = e(d);
        int e2 = e(d2);
        if (e != this.e || e2 != this.f) {
            this.e = e;
            this.f = e2;
        }
        f4m.n((int) ((this.f * f) + (this.e * (1 - f))), this.a);
    }

    @Override // xsna.ivd0
    public final void b(int i) {
        c();
        View d = d(i);
        if (d != null) {
            int e = e(d);
            ViewPager2 viewPager2 = this.a;
            if (viewPager2.getLayoutParams().height != e) {
                f4m.n(e, viewPager2);
            }
        }
    }

    public final void c() {
        ViewTreeObserver viewTreeObserver;
        int offscreenPageLimit = this.a.getOffscreenPageLimit();
        for (int i = 0; i < offscreenPageLimit; i++) {
            View d = d(i);
            if (d != null && (viewTreeObserver = d.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.b);
            }
        }
    }

    public final View d(int i) {
        RecyclerView.o layoutManager = ((RecyclerView) awt0.l(this.a, new xpt(20))).getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.findViewByPosition(i);
        }
        return null;
    }
}
