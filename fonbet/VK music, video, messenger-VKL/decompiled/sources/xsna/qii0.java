package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import xsna.nii0;
import xsna.xn50;

/* compiled from: SendStoryUsersBottomSheet.kt */
/* loaded from: classes16.dex */
public final class qii0 extends ModalBottomSheetBehavior.d {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final /* synthetic */ pii0 i;
    public final /* synthetic */ g440 j;

    public qii0(pii0 pii0Var, g440 g440Var) {
        this.i = pii0Var;
        this.j = g440Var;
        int p = iah0.p(pii0Var.i1);
        this.a = p;
        StickersDrawingViewGroup stickersDrawingView = g440Var.getStickersDrawingView();
        this.b = p - stickersDrawingView.getHeight();
        this.c = bwt0.C(stickersDrawingView).top;
        this.d = g440Var.b().getWidth() / (p - r1);
        this.e = stickersDrawingView.getScaleY() * stickersDrawingView.getHeight();
        this.f = stickersDrawingView.getScaleY();
        this.g = stickersDrawingView.getScaleX();
        this.h = stickersDrawingView.getTranslationY();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        g440 g440Var = this.j;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g440Var.b().setAlpha(1 - f);
            return;
        }
        g440Var.im();
        g440Var.b().setAlpha(1.0f);
        float f2 = 1 + f;
        float f3 = this.a;
        float f4 = f3 - ((0.75f * f3) * f2);
        float f5 = this.c;
        float f6 = this.e + f5;
        boolean z = f4 > f6;
        float f7 = f4 - f5;
        float f8 = 0.25f * f3;
        g440Var.n7(z ? this.f : f7 / (r11 - r6), z ? this.g : (this.d * f7) / iah0.z(this.i.i1), z ? this.h : (-(((f5 / (3 + ((f4 - f8) / (f6 - f8)))) + (f3 - f4)) - this.b)) / 2);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        pii0 pii0Var = this.i;
        if (i == 1) {
            xn50.a.c(pii0Var, nii0.b.b);
        } else {
            if (i != 3) {
                return;
            }
            xn50.a.c(pii0Var, nii0.a.b);
        }
    }
}
