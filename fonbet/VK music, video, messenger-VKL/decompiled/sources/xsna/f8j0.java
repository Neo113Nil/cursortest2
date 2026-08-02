package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.log.L;

/* compiled from: ShareStoryBottomSheet.kt */
/* loaded from: classes16.dex */
public final class f8j0 extends ModalBottomSheetBehavior.d {
    public final Context a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final int f;
    public final /* synthetic */ g440 g;
    public final /* synthetic */ e8j0 h;
    public final /* synthetic */ r8j0 i;

    public f8j0(y440 y440Var, e8j0 e8j0Var, r8j0 r8j0Var) {
        this.g = y440Var;
        this.h = e8j0Var;
        this.i = r8j0Var;
        y440Var.getClass();
        Context context = y440Var.getContext();
        this.a = context;
        int p = iah0.p(context);
        this.b = p;
        this.c = p - bwt0.C(y440Var.getStickersDrawingView()).bottom;
        this.d = y440Var.getWidth() / (p - r4);
        this.e = bwt0.C(y440Var.getStickersDrawingView()).top;
        this.f = iah0.a(60);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        try {
            int J = ModalBottomSheetBehavior.H(view).J();
            g440 g440Var = this.g;
            g440Var.im();
            r8j0 r8j0Var = this.i;
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                g440Var.n7(1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                g440Var.setDecorationVisibility(true);
                ((FrameLayout) g440Var.b()).removeView(r8j0Var);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) g440Var.b();
            if (frameLayout.indexOfChild(r8j0Var) == -1) {
                frameLayout.addView(r8j0Var);
            }
            g440Var.setDecorationVisibility(false);
            int i = this.b;
            float f2 = (i - J) * f;
            float f3 = this.c;
            if (f2 < f3) {
                g440Var.n7(1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            float f4 = i;
            float f5 = f4 - f2;
            float f6 = (f2 - f3) / (r12 - r13);
            int i2 = this.f;
            int i3 = this.e;
            float f7 = f5 - ((i2 + i3) * f6);
            g440Var.n7(f7 / (i - r13), (this.d * f7) / iah0.z(this.a), (-((((i2 - i3) * f6) + (f4 - f5)) - f3)) / 2);
            r8j0Var.getBottomContainer().setTranslationY(-f2);
            bwt0.p0(r8j0Var.getBottomContainer(), true);
            r8j0Var.getBottomContainer().setAlpha(f6);
        } catch (Throwable th) {
            L.i(th);
        }
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        if (i == 5) {
            e8j0 e8j0Var = this.h;
            fqd fqdVar = e8j0Var.A1;
            if (fqdVar != null) {
                fqdVar.invoke();
            }
            e8j0Var.A1 = null;
        }
    }
}
