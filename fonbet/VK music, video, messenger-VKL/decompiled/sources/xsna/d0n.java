package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: DisableableViewPager.kt */
/* loaded from: classes.dex */
public class d0n extends ViewPager implements c0n {
    public boolean b;

    public d0n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.b) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.b) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // xsna.c0n
    public void setTouchEnabled(boolean z) {
        this.b = z;
    }
}
