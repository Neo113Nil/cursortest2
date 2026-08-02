package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class q6q implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6q(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View findViewByPosition;
        switch (this.b) {
            case 0:
                ((androidx.media3.exoplayer.d) this.d).y.Z(this.c);
                return;
            default:
                hzt0 hzt0Var = (hzt0) this.d;
                LinearLayoutManager a = hzt0Var.a();
                if (a == null || (findViewByPosition = a.findViewByPosition(this.c)) == null) {
                    return;
                }
                findViewByPosition.measure(View.MeasureSpec.makeMeasureSpec(findViewByPosition.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewPager2 viewPager2 = hzt0Var.d;
                ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = findViewByPosition.getMeasuredHeight();
                viewPager2.setLayoutParams(marginLayoutParams);
                return;
        }
    }
}
