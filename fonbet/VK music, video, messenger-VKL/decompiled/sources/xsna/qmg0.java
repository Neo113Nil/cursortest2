package xsna;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.SeekBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.home.HomeFragment2;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.story.viewer.impl.presentation.stories.view.ScrollerCustomDuration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import xsna.iut0;
import xsna.nx50;

/* compiled from: RootViewPager.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class qmg0 extends ni80 {
    public final nx50.h c;
    public final nx50.i d;
    public final yy80 e;
    public final Handler f;
    public final gpx0 g;

    /* compiled from: RootViewPager.kt */
    public interface a {
    }

    public qmg0(NavigationDelegateActivity navigationDelegateActivity, nx50.h hVar, nx50.i iVar, yy80 yy80Var) {
        super(navigationDelegateActivity);
        this.c = hVar;
        this.d = iVar;
        this.e = yy80Var;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new gpx0(this);
        setFitsSystemWindows(false);
        setOffscreenPageLimit(2);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("sInterpolator");
            declaredField2.setAccessible(true);
            declaredField.set(this, new ScrollerCustomDuration(getContext(), (Interpolator) declaredField2.get(null)));
        } catch (Throwable th) {
            L.l(ms9.b("error=", th));
        }
        pmg0 pmg0Var = new pmg0(this);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(this, pmg0Var);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z2 = view instanceof SeekBar;
        if (view instanceof SelectRangeWaveFormView) {
            z2 = true;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) recyclerView.getLayoutManager()).canScrollHorizontally()) {
                z2 = z2 || view.canScrollHorizontally(-i);
            }
        }
        boolean z3 = z2;
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                if (-1 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && (i5 = i3 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    z3 = true;
                    break;
                }
                childCount--;
            }
        }
        if (!z3) {
            if (z) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view.canScrollHorizontally(-i)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // xsna.ni80
    public int getAllowedSwipeDirection() {
        return this.c.a.C0();
    }

    public final yy80 getOrientationLocker() {
        return this.e;
    }

    public final a getSwipeInfo() {
        return this.c;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            this.c.a();
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.a.q0();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        List<?> list;
        PagerAdapter adapter;
        Method method;
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        gpx0 gpx0Var = this.g;
        qmg0 qmg0Var = gpx0Var.a;
        if (measuredWidth != 0 && size != measuredWidth && (list = gpx0Var.b) != null && (adapter = qmg0Var.getAdapter()) != null && (method = gpx0Var.c) != null && !gpx0Var.g && list.size() > 1) {
            try {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        Field field = gpx0Var.d;
                        if (field == null) {
                            field = next.getClass().getDeclaredField("object");
                            field.setAccessible(true);
                            gpx0Var.d = field;
                        }
                        Object obj = field.get(next);
                        Field field2 = gpx0Var.e;
                        if (field2 == null) {
                            field2 = next.getClass().getDeclaredField(X3.i.L);
                            field2.setAccessible(true);
                            gpx0Var.e = field2;
                        }
                        float pageWidth = adapter.getPageWidth(((Integer) field2.get(next)).intValue());
                        Field field3 = gpx0Var.f;
                        if (field3 == null) {
                            field3 = next.getClass().getDeclaredField("widthFactor");
                            field3.setAccessible(true);
                            gpx0Var.f = field3;
                        }
                        field3.set(next, Float.valueOf(pageWidth));
                        View view = obj instanceof View ? (View) obj : null;
                        if (view != null) {
                            view.setLayoutParams(new ViewPager.g());
                        }
                    }
                }
                method.invoke(qmg0Var, null);
            } catch (Exception e) {
                L.l("error=" + e);
                gpx0Var.g = true;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f.post(new zir(this, 2));
        }
    }

    @Override // xsna.ni80, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.c.a();
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // xsna.ni80, android.view.View
    public final void scrollTo(int i, int i2) {
        FragmentImpl m;
        nx50.h hVar = this.c;
        if (!hVar.a.K0() || (m = hVar.a.y0().m()) == null || m.isHidden()) {
            return;
        }
        m.getClass().equals(HomeFragment2.class);
    }
}
