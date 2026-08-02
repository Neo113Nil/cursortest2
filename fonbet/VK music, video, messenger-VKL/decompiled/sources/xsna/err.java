package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import kotlin.Result;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: FloatingActionButtonInjector.kt */
/* loaded from: classes4.dex */
public final class err {
    public static final int d = iah0.a(48);
    public static final Object e = new Object();
    public final y84 a;
    public FrameLayout b;
    public boolean c;

    public err(y84 y84Var) {
        this.a = y84Var;
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2, 262696, -2);
        layoutParams.setTitle("OverlayMenuTriggerButton");
        int i = d;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 51;
        v290 v290Var = x290.i;
        och0 och0Var = (och0) v290Var.d.getValue(v290Var, v290.e[2]);
        g(layoutParams, (int) (e() * och0Var.a), (int) (d() * och0Var.b));
        return layoutParams;
    }

    public static int d() {
        x290 x290Var = x290.a;
        Activity b = x290.b();
        if (b != null) {
            return b.getResources().getDisplayMetrics().heightPixels;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static int e() {
        x290 x290Var = x290.a;
        Activity b = x290.b();
        if (b != null) {
            return b.getResources().getDisplayMetrics().widthPixels;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static void g(WindowManager.LayoutParams layoutParams, int i, int i2) {
        int i3 = d;
        int i4 = (-i3) / 2;
        int i5 = i3 / 2;
        layoutParams.x = swe0.g(i, i4, e() - i5);
        layoutParams.y = swe0.g(i2, i4, d() - i5);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final FrameLayout a() {
        h();
        x290 x290Var = x290.a;
        Context b = x290.b();
        if (b == null && (b = x290.h) == null) {
            b = null;
        }
        final FrameLayout frameLayout = new FrameLayout(b);
        VkButton vkButton = new VkButton(b, null, 6, 0);
        vkButton.setSize(VkButton.Size.Large);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_bug_outline_28));
        vkButton.setIconTint(R.attr.vk_ui_icon_contrast);
        vkButton.setBackgroundResource(R.drawable.trigger_button_background);
        vkButton.setCornerRadius(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        int b2 = cn70.b(10);
        vkButton.setPadding(b2, b2, b2, b2);
        vkButton.setAlpha(0.3f);
        vkButton.setOnClickListener(new bn1(this, 4));
        vkButton.setOnLongClickListener(new arr(0, this, vkButton));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        vkButton.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.brr
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                err errVar = err.this;
                if (action == 4) {
                    errVar.h();
                    errVar.f();
                    return true;
                }
                if (!errVar.c) {
                    return false;
                }
                int action2 = motionEvent.getAction();
                Ref$IntRef ref$IntRef3 = ref$IntRef;
                FrameLayout frameLayout2 = frameLayout;
                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                Ref$FloatRef ref$FloatRef4 = ref$FloatRef2;
                if (action2 == 0) {
                    ref$IntRef3.element = ((WindowManager.LayoutParams) frameLayout2.getLayoutParams()).x;
                    ref$IntRef4.element = ((WindowManager.LayoutParams) frameLayout2.getLayoutParams()).y;
                    ref$FloatRef3.element = motionEvent.getRawX();
                    ref$FloatRef4.element = motionEvent.getRawY();
                    return true;
                }
                if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    errVar.h();
                    errVar.f();
                    return true;
                }
                x290 x290Var2 = x290.a;
                Activity b3 = x290.b();
                WindowManager windowManager = b3 != null ? b3.getWindowManager() : null;
                if (windowManager == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                WindowManager.LayoutParams b4 = err.b();
                err.g(b4, ref$IntRef3.element + ((int) (motionEvent.getRawX() - ref$FloatRef3.element)), ref$IntRef4.element + ((int) (motionEvent.getRawY() - ref$FloatRef4.element)));
                windowManager.updateViewLayout(frameLayout2, b4);
                return true;
            }
        });
        frameLayout.addView(vkButton);
        crr crrVar = new crr(b);
        crrVar.setBackgroundResource(R.drawable.trigger_button_background_dnd);
        bwt0.p0(crrVar, false);
        crrVar.setTag(e);
        frameLayout.addView(crrVar);
        frameLayout.setTag(37742015, rte0.n);
        return frameLayout;
    }

    public final void c(Activity activity, boolean z) {
        Object failure;
        FrameLayout frameLayout;
        WindowManager windowManager;
        if (activity == null) {
            x290 x290Var = x290.a;
            activity = x290.b();
        }
        FrameLayout frameLayout2 = this.b;
        if ((frameLayout2 != null ? frameLayout2.getParent() : null) != null) {
            try {
                frameLayout = this.b;
                windowManager = activity != null ? activity.getWindowManager() : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (windowManager == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (z) {
                windowManager.removeViewImmediate(frameLayout);
            } else {
                windowManager.removeView(frameLayout);
            }
            this.b = null;
            failure = s3q0.a;
            Throwable a = Result.a(failure);
            if (a != null) {
                l370 l370Var = x290.k;
                (l370Var != null ? l370Var : null).v(a);
            }
        }
    }

    public final void f() {
        FrameLayout frameLayout = this.b;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if ((layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null) == null) {
            return;
        }
        x290.i.a(new och0(r1.x / e(), r1.y / d()));
    }

    public final void h() {
        View view;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            int i = 0;
            while (true) {
                if (!(i < frameLayout.getChildCount())) {
                    view = null;
                    break;
                }
                int i2 = i + 1;
                view = frameLayout.getChildAt(i);
                if (view == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (epx.f(view.getTag(), e)) {
                    break;
                } else {
                    i = i2;
                }
            }
            if (view != null) {
                bwt0.p0(view, false);
            }
        }
        this.c = false;
    }
}
