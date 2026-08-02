package xsna;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: BottomSheetViewer.kt */
/* loaded from: classes17.dex */
public final class d98 {
    public final b a;
    public final WindowManager b;

    @SuppressLint({"InflateParams"})
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final BottomSheetBehaviourExt<View> g;
    public final Rect h;
    public ValueAnimator i;
    public int j;

    /* compiled from: BottomSheetViewer.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            d98.this.a.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            d98.this.a.i();
        }
    }

    /* compiled from: BottomSheetViewer.kt */
    public interface b {
        void B0(float f);

        int C0();

        void D0();

        void E0(FrameLayout frameLayout);

        void F0(FrameLayout frameLayout);

        int G0();

        boolean H0();

        void a();

        void h();

        void i();

        void j();

        WindowManager.LayoutParams k();
    }

    public d98(Activity activity, b bVar) {
        this.a = bVar;
        this.b = activity.getWindowManager();
        View inflate = activity.getLayoutInflater().inflate(R.layout.modal_viewer_layout, (ViewGroup) null);
        this.c = inflate;
        this.h = new Rect();
        View findViewById = inflate.findViewById(R.id.bv_dim);
        this.d = findViewById;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.bv_bottom_sheet_container);
        this.f = frameLayout;
        bVar.F0(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.bv_controls);
        this.e = frameLayout2;
        bVar.E0(frameLayout2);
        int i = BottomSheetBehaviourExt.k0;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = fVar.a;
        BottomSheetBehavior bottomSheetBehavior = cVar instanceof BottomSheetBehavior ? (BottomSheetBehavior) cVar : null;
        if (bottomSheetBehavior == null) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = (BottomSheetBehaviourExt) bottomSheetBehavior;
        this.g = bottomSheetBehaviourExt;
        bottomSheetBehaviourExt.V(true);
        bottomSheetBehaviourExt.X(5);
        int i2 = 9;
        final v9 v9Var = new v9(this, i2);
        Rect rect = ywt0.a;
        inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.ivt0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                Rect rect2 = ywt0.a;
                rect2.set(windowInsets.getStableInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                v9.this.invoke(rect2);
                return windowInsets;
            }
        });
        f4m.a(inflate, new u40(this, 8));
        inflate.addOnAttachStateChangeListener(new a());
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        awt0.h(inflate, new v40(this, i2), false);
        findViewById.setOnClickListener(new c98(this, 0));
        e98 e98Var = new e98(this);
        ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehaviourExt.Z;
        arrayList.clear();
        arrayList.add(e98Var);
    }

    public final void a() {
        BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = this.g;
        if (bottomSheetBehaviourExt.M == 4) {
            this.a.B0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            bottomSheetBehaviourExt.X(4);
        }
    }

    public final boolean b() {
        return this.h.bottom > iah0.a((float) 100);
    }

    public final void c(boolean z) {
        View view = this.c;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (z) {
            layoutParams.flags &= -131073;
        } else {
            layoutParams.flags |= 131072;
        }
        this.b.updateViewLayout(view, layoutParams);
        this.g.j0 = b();
    }

    public final void d() {
        b bVar = this.a;
        WindowManager.LayoutParams k = bVar.k();
        WindowManager windowManager = this.b;
        View view = this.c;
        windowManager.addView(view, k);
        bVar.a();
        we0 we0Var = new we0(this, 9);
        Rect rect = ywt0.a;
        view.addOnLayoutChangeListener(new kwt0(view, we0Var));
    }

    public final void e(boolean z) {
        this.g.j0 = (b() && (((WindowManager.LayoutParams) this.c.getLayoutParams()).flags & 131072) == 0) || z;
    }
}
