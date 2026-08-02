package xsna;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;

/* compiled from: PopupBottomSheetDialog.kt */
/* loaded from: classes7.dex */
public final class fwb0 {
    public final Activity a;
    public final akd0 b;
    public View c;

    public fwb0(Activity activity, akd0 akd0Var) {
        this.a = activity;
        this.b = akd0Var;
    }

    public static void a(ViewGroup viewGroup) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.bottom_sheet);
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        BottomSheetBehavior bottomSheetBehavior = obj instanceof BottomSheetBehavior ? (BottomSheetBehavior) obj : null;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(5);
            new Handler(Looper.getMainLooper()).postDelayed(new tsk(bottomSheetBehavior, 7), 1000L);
        }
    }

    public final void b() {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"FloatingBottomSheetDialog", "Closing dialog."});
        }
        this.c = null;
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(android.R.id.content);
        View findViewById = viewGroup.findViewById(R.id.floating_bottom_sheet_root);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
            l.getClass();
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{"FloatingBottomSheetDialog", "Dialog removed from view hierarchy."});
        }
    }

    public final void c(View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.bottom_sheet);
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        Object obj = fVar != null ? fVar.a : null;
        BottomSheetBehavior bottomSheetBehavior = obj instanceof BottomSheetBehavior ? (BottomSheetBehavior) obj : null;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.V(true);
            bottomSheetBehavior.X(5);
            bottomSheetBehavior.D(new a());
        }
    }

    /* compiled from: PopupBottomSheetDialog.kt */
    public final class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                fwb0 fwb0Var = fwb0.this;
                fwb0Var.b.invoke();
                fwb0Var.b();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
        }
    }
}
