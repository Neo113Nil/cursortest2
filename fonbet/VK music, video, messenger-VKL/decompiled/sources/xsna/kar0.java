package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;

/* compiled from: VKBottomSheetDialog.java */
/* loaded from: classes17.dex */
public class kar0 extends b33 implements m0q0, dcn, too0 {
    public VkBottomSheetBehavior<ViewGroup> h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Handler l;
    public Toolbar m;
    public final String n;
    public final int o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public View t;
    public FrameLayout u;
    public View v;
    public ViewGroup w;
    public CoordinatorLayout x;
    public final xyp0 y;
    public final b z;

    /* compiled from: VKBottomSheetDialog.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            kar0 kar0Var = kar0.this;
            kar0Var.n(kar0Var.s);
        }
    }

    /* compiled from: VKBottomSheetDialog.java */
    public class b extends VkBottomSheetBehavior.a {
        public final /* synthetic */ c83 a;

        public b(c83 c83Var) {
            this.a = c83Var;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void i(@NonNull View view, float f) {
            c83 c83Var = this.a;
            if (f < 0.8f || c83Var.n.isEmpty()) {
                c83Var.m.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c83Var.m.setVisibility(4);
            } else {
                c83Var.m.setAlpha((f - 0.8f) / 0.19999999f);
                c83Var.m.setVisibility(0);
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
        public final void j(int i, @NonNull View view) {
            c83 c83Var = this.a;
            int i2 = c83Var.r;
            if (i2 <= 0) {
                i2 = 5;
            }
            if (i == i2) {
                c83Var.cancel();
            }
            if (i == 4 || i == 5) {
                view.requestLayout();
                view.invalidate();
            }
        }
    }

    public kar0(@NonNull Context context) {
        super(context, R.style.VkFullScreenBottomSheetTheme);
        this.i = true;
        this.j = true;
        this.l = new Handler();
        this.n = "";
        this.o = -1;
        this.p = -1;
        this.q = 5;
        this.r = -1;
        this.s = 4;
        this.y = new xyp0(false);
        this.z = new b((c83) this);
        m(1);
    }

    public void Ng() {
        Toolbar toolbar = this.m;
        if (toolbar != null) {
            g3p0.c(toolbar);
            bwt0.Z(R.attr.vk_ui_background_modal, this.m);
        }
    }

    @Override // xsna.b33, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.y.c();
    }

    public final void n(int i) {
        this.q = i;
        this.h.J(i);
    }

    public final CoordinatorLayout o(View view, int i, ViewGroup.LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), R.layout.dialog_bottom_sheet, null);
        this.x = coordinatorLayout;
        Toolbar toolbar = (Toolbar) coordinatorLayout.findViewById(R.id.toolbar);
        this.m = toolbar;
        int i2 = this.p;
        if (i2 != -1) {
            toolbar.setTitleTextColor(i2);
        }
        this.m.setNavigationIcon(new BitmapDrawable(getContext().getResources(), BitmapFactory.decodeResource(getContext().getResources(), R.drawable.vk_icon_cancel_20)));
        this.m.setNavigationContentDescription(R.string.accessibility_close);
        this.m.getNavigationIcon().setColorFilter(this.m.getContext().getColor(R.color.picker_dark_icon), PorterDuff.Mode.MULTIPLY);
        this.m.setNavigationOnClickListener(new nar0(this));
        this.m.setTitle(this.n);
        this.m.setVisibility(4);
        g3p0.c(this.m);
        bwt0.Z(R.attr.vk_ui_background_modal, this.m);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) this.x, false);
        }
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(R.id.design_bottom_sheet);
        this.w = viewGroup;
        this.v = viewGroup.findViewById(R.id.header_background);
        this.t = this.w.findViewById(R.id.header_shadow);
        this.u = (FrameLayout) this.x.findViewById(R.id.fl_container);
        int c = dhr0.t.c(R.attr.vk_ui_background_content);
        this.v.setBackgroundColor(c);
        if (view.getBackground() == null) {
            this.u.setBackgroundColor(c);
        }
        VkBottomSheetBehavior<ViewGroup> F = VkBottomSheetBehavior.F(this.w);
        this.h = F;
        F.J(this.q);
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.h;
        vkBottomSheetBehavior.q = this.z;
        vkBottomSheetBehavior.h = this.i;
        int i3 = this.o;
        if (i3 > 0) {
            TypedValue typedValue = new TypedValue();
            this.h.I(i3 + (getContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getContext().getResources().getDisplayMetrics()) : 0));
        }
        if (layoutParams == null) {
            this.u.addView(view, 0);
        } else {
            this.u.addView(view, 0, layoutParams);
        }
        this.x.findViewById(R.id.touch_outside).setOnClickListener(new lar0(this));
        iut0.q(this.w, new mar0(this));
        return this.x;
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onBackPressed() {
        int i = this.r;
        if (i <= 0) {
            i = 5;
        }
        n(i);
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setGravity(1);
        }
    }

    @Override // xsna.y8i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.h;
        if (vkBottomSheetBehavior != null) {
            vkBottomSheetBehavior.J(this.q);
            if (this.q == 5) {
                this.l.postDelayed(new a(), 300L);
            }
        }
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void onStop() {
        VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.h;
        if (vkBottomSheetBehavior != null) {
            this.q = vkBottomSheetBehavior.i;
        }
        super.onStop();
    }

    public void sb(VKTheme vKTheme) {
        Ng();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.i != z) {
            this.i = z;
            VkBottomSheetBehavior<ViewGroup> vkBottomSheetBehavior = this.h;
            if (vkBottomSheetBehavior != null) {
                vkBottomSheetBehavior.h = z;
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.i) {
            this.i = true;
        }
        this.j = z;
        this.k = true;
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(o(null, i, null));
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.x.findViewById(R.id.touch_outside).animate().setStartDelay(150L).alpha(1.0f).setDuration(300L).setInterpolator(qq2.f).start();
        this.y.d();
    }

    @Override // xsna.m0q0
    @SuppressLint({"MissingSuperCall"})
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.y.y(uiTrackingScreen);
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(o(view, 0, null));
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(view, 0, layoutParams));
    }
}
