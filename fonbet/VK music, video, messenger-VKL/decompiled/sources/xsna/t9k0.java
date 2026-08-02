package xsna;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SnapHorizontalScrollHelper.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class t9k0 {
    public final yfc0 a;
    public final qor b;
    public boolean c;
    public final fot d;

    /* compiled from: SnapHorizontalScrollHelper.kt */
    public static final class a implements e00 {
        public a() {
        }

        @Override // xsna.e00
        public final void a(MotionEvent motionEvent) {
            t9k0.this.d.a(motionEvent);
        }
    }

    /* compiled from: SnapHorizontalScrollHelper.kt */
    public static final class b {
        public b() {
        }
    }

    public t9k0(yfc0 yfc0Var, qor qorVar) {
        this.a = yfc0Var;
        this.b = qorVar;
        b bVar = new b();
        lot lotVar = new lot(qorVar.getContext());
        this.d = new fot(yfc0Var.getContext(), lotVar, null);
        yfc0Var.setActionDownListener(new a());
        lotVar.c = bVar;
        yfc0Var.setOnTouchListener(new bvs(this, 1));
    }

    public final Float a(boolean z) {
        yfc0 yfc0Var;
        qor qorVar = this.b;
        if (qorVar.getChildCount() != 0) {
            int childCount = qorVar.getChildCount();
            int i = Integer.MIN_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = 0;
            View view = null;
            View view2 = null;
            while (true) {
                yfc0Var = this.a;
                if (i3 >= childCount) {
                    break;
                }
                View childAt = qorVar.getChildAt(i3);
                if (childAt != null) {
                    int measuredWidth = (int) (((childAt.getMeasuredWidth() / 2.0f) + childAt.getX()) - ((yfc0Var.getMeasuredWidth() / 2.0f) + yfc0Var.getScrollX()));
                    if (measuredWidth <= 0 && measuredWidth > i) {
                        i = measuredWidth;
                        view2 = childAt;
                    }
                    if (measuredWidth >= 0 && measuredWidth < i2) {
                        i2 = measuredWidth;
                        view = childAt;
                    }
                }
                i3++;
            }
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z && view != null) {
                float x = view.getX() - ((yfc0Var.getMeasuredWidth() - view.getMeasuredWidth()) / 2);
                if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = x;
                }
                return Float.valueOf(f);
            }
            if (!z && view2 != null) {
                float x2 = view2.getX() - ((yfc0Var.getMeasuredWidth() - view2.getMeasuredWidth()) / 2);
                if (x2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = x2;
                }
                return Float.valueOf(f);
            }
        }
        return null;
    }

    public final void b(int i) {
        qor qorVar = this.b;
        View childAt = qorVar.getChildAt(i);
        if (childAt != null) {
            this.a.smoothScrollTo((int) (childAt.getX() - ((iah0.f().widthPixels - (qorVar.getChildAt(0) != null ? r0.getWidth() : 0)) / 2)), 0);
        }
    }
}
