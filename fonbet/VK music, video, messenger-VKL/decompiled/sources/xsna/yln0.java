package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.ps8;

/* compiled from: SwipeHelper.kt */
/* loaded from: classes6.dex */
public final class yln0 {
    public final float a;
    public ps8 c;
    public final float b = 0.25f;
    public final a d = new a();

    /* compiled from: SwipeHelper.kt */
    public static final class a implements ps8.a {
        public boolean b;
        public int c;

        public a() {
        }

        @Override // xsna.ps8.a
        public final void a(int i, int i2, View view) {
            int i3 = i2 - i;
            if (i3 != 0) {
                this.b = true;
            }
            this.c = Integer.signum(i3);
        }

        @Override // xsna.ps8.a
        public final void c() {
            if (this.b) {
                int i = 0;
                this.b = false;
                int i2 = this.c;
                yln0 yln0Var = yln0.this;
                final ps8 ps8Var = yln0Var.c;
                if (ps8Var == null || ps8Var.getMeasuredWidth() == 0) {
                    return;
                }
                float f = yln0Var.b;
                final int initialScrollOffset = ps8Var.getInitialScrollOffset();
                int scrollX = initialScrollOffset - ps8Var.getScrollX();
                if (scrollX > 0) {
                    i = ps8Var.getStartMeasuredWidth();
                } else if (scrollX < 0) {
                    i = ps8Var.getEndMeasuredWidth();
                }
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i != 0) {
                    float f3 = i;
                    f2 = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.abs(scrollX) - yln0Var.a), f3) / f3;
                }
                if (scrollX <= 0 ? i2 >= 0 : i2 < 0) {
                    f = 1.0f - f;
                }
                if (f2 >= f) {
                    if (scrollX > 0) {
                        initialScrollOffset = ps8Var.getMaxStartScrollOffset();
                    } else if (scrollX < 0) {
                        initialScrollOffset = ps8Var.getMaxEndScrollOffset();
                    }
                }
                Runnable runnable = new Runnable() { // from class: xsna.xln0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ps8.this.smoothScrollTo(initialScrollOffset, 0);
                    }
                };
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                ps8Var.postOnAnimation(runnable);
            }
        }
    }

    public yln0(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
