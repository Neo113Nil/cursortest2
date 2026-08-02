package xsna;

import android.view.MotionEvent;
import com.vk.clips.viewer.impl.grid.NestedScrollViewPager;
import xsna.x160;

/* compiled from: NestedScrollViewPager.kt */
/* loaded from: classes17.dex */
public final class o160 implements x160.a {
    public final /* synthetic */ NestedScrollViewPager b;

    public o160(NestedScrollViewPager nestedScrollViewPager) {
        this.b = nestedScrollViewPager;
    }

    @Override // xsna.x160.a
    public final boolean a(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent;
        onInterceptTouchEvent = super/*androidx.viewpager.widget.ViewPager*/.onInterceptTouchEvent(motionEvent);
        return onInterceptTouchEvent;
    }
}
