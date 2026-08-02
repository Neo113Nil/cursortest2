package xsna;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.j7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class mfz0 implements j7z0.a {
    public final j7z0 b;
    public final aiz0 c;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends ViewOutlineProvider {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.a;
            outline.setRoundRect(0, 0, width, height + i, i);
            view.setClipToOutline(true);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class b {
        public final Context a;

        public b(mfz0 mfz0Var, qnk qnkVar, Context context) {
            this.a = context;
        }
    }

    public mfz0(String str, qnk qnkVar, Context context) {
        this.c = new aiz0(str, new waz0(new b(this, qnkVar, context)), new lfz0(), context);
        this.b = new j7z0(this, context);
    }

    public static void a(String str, qnk qnkVar, Context context) {
        try {
            new mfz0(str, qnkVar, context).b.show();
        } catch (Throwable unused) {
            gu8.e(null, "WebFormView: Unable to start WebForm dialog");
        }
    }

    @Override // xsna.j7z0.a
    public final void c(j7z0 j7z0Var, FrameLayout frameLayout) {
        frameLayout.setBackground(new ColorDrawable(1711276032));
        frameLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout.animate().alpha(1.0f).setDuration(300L).start();
        DisplayMetrics displayMetrics = frameLayout.getContext().getResources().getDisplayMetrics();
        a aVar = new a((int) TypedValue.applyDimension(1, 16.0f, displayMetrics));
        aiz0 aiz0Var = this.c;
        aiz0Var.setOutlineProvider(aVar);
        frameLayout.addView(aiz0Var, -1, -1);
        View zcz0Var = new zcz0(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, displayMetrics), (int) TypedValue.applyDimension(1, 36.0f, displayMetrics));
        layoutParams.gravity = 8388661;
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics);
        layoutParams.setMargins(0, applyDimension, applyDimension, 0);
        frameLayout.addView(zcz0Var, layoutParams);
        zcz0Var.setOnClickListener(new q01(this, 19));
        TranslateAnimation translateAnimation = new TranslateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aiz0Var.getContext().getResources().getDisplayMetrics().heightPixels, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        aiz0Var.startAnimation(translateAnimation);
        aiz0Var.b(aiz0Var.d);
    }

    @Override // xsna.j7z0.a
    public final void m() {
    }

    @Override // xsna.j7z0.a
    public final void b(boolean z) {
    }
}
