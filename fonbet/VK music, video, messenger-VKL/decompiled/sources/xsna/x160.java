package xsna;

import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: NestedViewPagerDelegate.kt */
/* loaded from: classes17.dex */
public final class x160 {
    public final ViewPager a;
    public final a b;
    public float c;
    public float d;

    /* compiled from: NestedViewPagerDelegate.kt */
    public interface a {
        boolean a(MotionEvent motionEvent);
    }

    public x160(ViewPager viewPager, a aVar) {
        this.a = viewPager;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000f, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewPager2 a() {
        View view;
        Object parent = this.a.getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            if (view instanceof ViewPager2) {
                return (ViewPager2) view;
            }
            return null;
        }
        view = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r0 != 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r2.canScrollHorizontally(1) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        if (r2.canScrollVertically(1) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent) {
        ViewPager2 a2 = a();
        a aVar = this.b;
        if (a2 == null) {
            return aVar.a(motionEvent);
        }
        int action = motionEvent.getAction();
        ViewPager viewPager = this.a;
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    ViewPager2 a3 = a();
                    Object valueOf = a3 != null ? Integer.valueOf(a3.getOrientation()) : Boolean.TRUE;
                    if (valueOf.equals(0)) {
                        if (!viewPager.canScrollHorizontally(-1)) {
                        }
                        if (valueOf.equals(1)) {
                            viewPager.getParent().requestDisallowInterceptTouchEvent(!z);
                        } else {
                            viewPager.getParent().requestDisallowInterceptTouchEvent(!z);
                        }
                    } else {
                        if (!valueOf.equals(1)) {
                            throw new IllegalArgumentException();
                        }
                        if (!viewPager.canScrollVertically(-1)) {
                        }
                        if (valueOf.equals(1)) {
                        }
                    }
                }
            }
            viewPager.getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            viewPager.getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.c = motionEvent.getX();
        this.d = motionEvent.getY();
        return aVar.a(motionEvent);
    }
}
