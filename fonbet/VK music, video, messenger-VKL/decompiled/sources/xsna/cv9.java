package xsna;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: CarouselPhotoGestureProvider.kt */
/* loaded from: classes18.dex */
public final class cv9 {
    public final qor a;
    public final xor b;
    public View d;
    public final int c = ViewConfiguration.getLongPressTimeout();
    public a e = a.NONE;
    public final bv9 f = new bv9(this, 0);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CarouselPhotoGestureProvider.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DRAGGING;
        public static final a NONE;

        static {
            a aVar = new a("DRAGGING", 0);
            DRAGGING = aVar;
            a aVar2 = new a("NONE", 1);
            NONE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public cv9(qor qorVar, xor xorVar) {
        this.a = qorVar;
        this.b = xorVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        if (this.e == a.DRAGGING) {
            xor xorVar = this.b;
            qor qorVar = xorVar.b;
            if (xorVar.q == null || xorVar.e < 0) {
                return;
            }
            mkc0 mkc0Var = xorVar.d;
            xorVar.a(true);
            View view = xorVar.q;
            if (view == null) {
                return;
            }
            xorVar.r.removeCallbacks(xorVar.s);
            int b = xorVar.b(xorVar.j, xorVar.k);
            float f = xorVar.j;
            char c = 2;
            if (qorVar.getChildAt(b) != null && f - r7.getLeft() >= r7.getWidth() / 2) {
                c = 0;
            }
            if (b == -1) {
                i = -1;
            } else if (xorVar.e < b) {
                if (c != 0 && c != 1) {
                    i = b - 1;
                    if (i >= 0) {
                        i = 0;
                    } else if (i >= qorVar.getChildCount()) {
                        i = qorVar.getChildCount() - 1;
                    }
                }
                i = b;
                if (i >= 0) {
                }
            } else {
                if (c == 0 || c == 1) {
                    i = b + 1;
                    if (i >= 0) {
                    }
                }
                i = b;
                if (i >= 0) {
                }
            }
            if (b < 0 || b == xorVar.e) {
                mkc0Var.getClass();
                mkc0Var.f(pkc0.a(view), true);
                qorVar.invalidate();
            } else {
                ViewPropertyAnimator viewPropertyAnimator = xorVar.p;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                View childAt = qorVar.getChildAt(b);
                if (childAt != null) {
                    childAt.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    childAt.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                float translationX = view.getTranslationX() + view.getLeft();
                float translationY = view.getTranslationY() + view.getTop();
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                xorVar.c.a(translationX, translationY, xorVar.e, i);
            }
            View[] d = awt0.d(qorVar);
            ArrayList arrayList = new ArrayList();
            for (View view2 : d) {
                if (!epx.f(view2, view)) {
                    arrayList.add(view2);
                }
            }
            mkc0Var.e(arrayList);
            xorVar.q = null;
            xorVar.e = -1;
            xorVar.f = -1;
            qorVar.requestDisallowInterceptTouchEvent(false);
        }
    }
}
