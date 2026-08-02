package xsna;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.nix;
import xsna.oqx0;

/* compiled from: InternalModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class uw20 extends y8i {
    public gzs<s3q0> f;
    public xx20 g;
    public final View h;
    public final sw20 i;

    /* compiled from: InternalModalBottomSheet.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: InternalModalBottomSheet.kt */
    public static final class b extends m180 {
        public b() {
            super(true);
        }

        @Override // xsna.m180
        public final void handleOnBackPressed() {
            uw20 uw20Var = uw20.this;
            if (uw20Var.g.b.invoke().booleanValue()) {
                uw20Var.f.invoke();
            }
        }
    }

    /* compiled from: InternalModalBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uw20(gzs<s3q0> gzsVar, xx20 xx20Var, View view, LayoutDirection layoutDirection, azl azlVar, UUID uuid, if2<Float, sq2> if2Var, yvj yvjVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f = gzsVar;
        this.g = xx20Var;
        this.h = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ppx0.b(window, false);
        sw20 sw20Var = new sw20(getContext(), window, this.g.b, this.f, if2Var, yvjVar);
        sw20Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        sw20Var.setClipChildren(false);
        sw20Var.setElevation(azlVar.I0(f));
        sw20Var.setOutlineProvider(new a());
        this.i = sw20Var;
        setContentView(sw20Var);
        gqo.f(sw20Var, gqo.e(view));
        ro.o(sw20Var, ro.h(view));
        lyd.h(sw20Var, lyd.f(view));
        h(this.f, this.g, layoutDirection);
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.f(false);
        fVar.e(false);
        getOnBackPressedDispatcher().a(this, new b());
    }

    public final void h(gzs<s3q0> gzsVar, xx20 xx20Var, LayoutDirection layoutDirection) {
        this.f = gzsVar;
        this.g = xx20Var;
        SecureFlagPolicy secureFlagPolicy = xx20Var.a;
        float f = nix.a;
        ViewGroup.LayoutParams layoutParams = this.h.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = nix.b.$EnumSwitchMapping$1[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            z = false;
        } else if (i2 == 2) {
            z = true;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int i3 = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.i.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
