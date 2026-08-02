package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class epy0 extends FrameLayout {
    public final int b;
    public final BitmapDrawable c;
    public final int d;
    public final int e;
    public final int f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public final Rect j;
    public a k;
    public boolean l;
    public boolean m;
    public int n;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void b();
    }

    public epy0(Context context) {
        super(context);
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.n = 8388661;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(ywy0.a((int) tj0.a(1, 30, context)));
        this.c = bitmapDrawable;
        bitmapDrawable.setState(FrameLayout.EMPTY_STATE_SET);
        bitmapDrawable.setCallback(this);
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.d = c1z0.d(50, context);
        this.e = c1z0.d(30, context);
        this.f = c1z0.d(8, context);
        setWillNotDraw(false);
    }

    public final boolean a(int i, int i2, int i3) {
        Rect rect = this.h;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = this.l;
        BitmapDrawable bitmapDrawable = this.c;
        if (z) {
            this.l = false;
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.g;
            rect.set(0, 0, width, height);
            int i = this.d;
            int i2 = this.n;
            Rect rect2 = this.h;
            Gravity.apply(i2, i, i, rect, rect2);
            Rect rect3 = this.j;
            rect3.set(rect2);
            int i3 = this.f;
            rect3.inset(i3, i3);
            int i4 = this.e;
            int i5 = this.n;
            Rect rect4 = this.i;
            Gravity.apply(i5, i4, i4, rect3, rect4);
            bitmapDrawable.setBounds(rect4);
        }
        if (bitmapDrawable.isVisible()) {
            bitmapDrawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.c.isVisible() || !a(x, y, this.b)) {
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = true;
            return true;
        }
        if (action != 1) {
            if (action == 3) {
                this.m = false;
                return true;
            }
        } else if (this.m) {
            playSoundEffect(0);
            a aVar = this.k;
            if (aVar != null) {
                aVar.b();
            }
            this.m = false;
        }
        return true;
    }

    public void setCloseBounds(@NonNull Rect rect) {
        this.h.set(rect);
    }

    public void setCloseGravity(int i) {
        this.n = i;
    }

    public void setCloseVisible(boolean z) {
        String str = z ? "close_button" : "closeable_layout";
        setContentDescription(str);
        c1z0.n(this, str);
        if (this.c.setVisible(z, false)) {
            invalidate(this.h);
        }
    }

    public void setOnCloseListener(@Nullable a aVar) {
        this.k = aVar;
    }
}
