package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkLinkWebViewScrollHandler.kt */
/* loaded from: classes6.dex */
public final class n2v0 implements lfh0, r160 {
    public final /* synthetic */ l6v0 b;
    public int c;
    public int d;
    public final int[] e = new int[2];
    public final int[] f = new int[2];

    public n2v0(l6v0 l6v0Var) {
        this.b = l6v0Var;
    }

    @Override // xsna.lfh0
    public final boolean a(MotionEvent motionEvent, js00 js00Var) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = obtain.getActionMasked();
        int y = (int) obtain.getY();
        if (actionMasked == 0) {
            this.d = 0;
        }
        obtain.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d);
        l6v0 l6v0Var = this.b;
        if (actionMasked == 0) {
            boolean booleanValue = ((Boolean) js00Var.invoke(obtain)).booleanValue();
            this.c = y;
            l6v0Var.startNestedScroll(2);
            return booleanValue;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.c - y;
                int[] iArr = this.f;
                int[] iArr2 = this.e;
                if (l6v0Var.dispatchNestedPreScroll(0, i, iArr, iArr2)) {
                    i -= iArr[1];
                    int i2 = iArr2[1];
                    this.c = y - i2;
                    obtain.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i2);
                    this.d += iArr2[1];
                }
                boolean booleanValue2 = ((Boolean) js00Var.invoke(obtain)).booleanValue();
                if (l6v0Var.dispatchNestedScroll(0, iArr2[1], 0, i, iArr2)) {
                    obtain.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iArr2[1]);
                    int i3 = this.d;
                    int i4 = iArr2[1];
                    this.d = i3 + i4;
                    this.c -= i4;
                }
                return booleanValue2;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        boolean booleanValue3 = ((Boolean) js00Var.invoke(obtain)).booleanValue();
        l6v0Var.stopNestedScroll();
        return booleanValue3;
    }
}
