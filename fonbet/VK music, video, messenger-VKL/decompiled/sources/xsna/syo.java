package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.vk.log.L;

/* compiled from: EdgeViewPager.kt */
/* loaded from: classes17.dex */
public class syo extends ViewPager {
    public a b;
    public float c;

    /* compiled from: EdgeViewPager.kt */
    public interface a {
    }

    public syo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final a getEdgeCallback() {
        return this.b;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getPointerCount() == 1) {
                this.c = motionEvent.getX();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            boolean z = motionEvent.getX() < this.c;
            if (((com.vk.story.viewer.impl.presentation.stories.b) this.b).J() && z) {
                return false;
            }
            if (((com.vk.story.viewer.impl.presentation.stories.b) this.b).H() && !z) {
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            L.i(e);
            return false;
        }
    }

    public final void setEdgeCallback(a aVar) {
        this.b = aVar;
    }
}
