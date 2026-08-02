package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DefaultWebViewScrollHandler.kt */
/* loaded from: classes6.dex */
public final class qrl implements lfh0, r160 {
    public final /* synthetic */ l6v0 b;
    public final l6v0 c;
    public final int[] d = new int[2];
    public final int[] e = new int[2];
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    public qrl(l6v0 l6v0Var, l6v0 l6v0Var2) {
        this.b = l6v0Var2;
        this.c = l6v0Var;
    }

    @Override // xsna.lfh0
    public final boolean a(MotionEvent motionEvent, js00 js00Var) {
        boolean booleanValue;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int y = (int) motionEvent.getY();
        int x = (int) motionEvent.getX();
        int i2 = this.g - x;
        int i3 = this.h - y;
        this.g = x;
        this.h = y;
        if (actionMasked == 0) {
            this.i = 0;
            this.f = y;
            this.l = false;
            this.m = false;
            this.n = true;
        }
        if (this.l) {
            return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
        }
        if (actionMasked == 2) {
            if (!this.k && Math.abs(this.f - y) < 2) {
                return true;
            }
            this.k = true;
            if (this.c.getScrollY() > 0 && this.i == 0) {
                return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
            }
        }
        motionEvent.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.i);
        if (actionMasked == 0) {
            return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
        }
        l6v0 l6v0Var = this.b;
        if (actionMasked == 1) {
            l6v0Var.stopNestedScroll();
            this.k = false;
            if (this.i == 0) {
                return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
            }
            this.i = 0;
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return false;
            }
            this.k = false;
            this.i = 0;
            l6v0Var.stopNestedScroll();
            return true;
        }
        if (Math.abs(i2) > Math.abs(i3) && !this.m) {
            this.m = true;
            this.l = true;
            return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
        }
        this.m = true;
        if (i3 > 2 && this.n) {
            l6v0Var.startNestedScroll(2);
        }
        this.n = false;
        int[] iArr = this.e;
        int[] iArr2 = this.d;
        if (l6v0Var.dispatchNestedPreScroll(i2, i3, iArr, iArr2)) {
            int i4 = i3 - iArr[1];
            this.h = y - iArr2[1];
            motionEvent.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -r2);
            this.i += iArr2[1];
            this.j = true;
            i = i4;
            booleanValue = true;
        } else {
            if (this.i != 0) {
                this.j = true;
                booleanValue = ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
            } else {
                if (this.j) {
                    this.j = false;
                    this.h = y;
                    this.i = 0;
                    float f = x;
                    float f2 = 1;
                    motionEvent.setLocation(f + f2, y + f2);
                    return ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
                }
                booleanValue = ((Boolean) js00Var.invoke(motionEvent)).booleanValue();
            }
            i = i3;
        }
        if (l6v0Var.dispatchNestedScroll(0, iArr2[1], 0, i, iArr2)) {
            motionEvent.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iArr2[1]);
            int i5 = this.i;
            int i6 = iArr2[1];
            this.i = i5 + i6;
            this.h -= i6;
        }
        return booleanValue;
    }
}
