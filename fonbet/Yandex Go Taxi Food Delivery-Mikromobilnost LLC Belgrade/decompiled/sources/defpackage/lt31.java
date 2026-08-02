package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes5.dex */
public abstract class lt31 extends e890 {
    @Override // defpackage.e890
    public final void a(ViewPager viewPager, int i, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // defpackage.e890
    public final Object d(ViewPager viewPager, int i) {
        q4g m = m(viewPager);
        l(m, i);
        View view = (View) m.b;
        viewPager.addView(view);
        return view;
    }

    @Override // defpackage.e890
    public final boolean e(View view, Object obj) {
        return view.equals(obj);
    }

    public abstract void l(q4g q4gVar, int i);

    public abstract q4g m(ViewPager viewPager);
}
