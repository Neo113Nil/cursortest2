package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.avatars.StackAvatarView;
import xsna.bsb;

/* compiled from: ChatInviteVC.kt */
/* loaded from: classes2.dex */
public final class isb {
    public final Context a;
    public u230 b;
    public final b25 c;
    public View d;
    public View e;
    public View f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public View l;
    public StackAvatarView m;
    public View n;
    public ImageView o;
    public bsb.b p;

    public isb(Context context, u230 u230Var, b25 b25Var) {
        this.a = context;
        this.b = u230Var;
        this.c = b25Var;
    }

    public final void a(float f, float f2, o600 o600Var, gzs gzsVar) {
        View view = this.e;
        if (view == null) {
            view = null;
        }
        view.setTranslationY(f);
        View view2 = this.e;
        if (view2 == null) {
            view2 = null;
        }
        view2.setAlpha(1.0f);
        View view3 = this.e;
        (view3 != null ? view3 : null).animate().alpha(1.0f).translationY(f2).setDuration(200L).setInterpolator(o600Var).setListener(new hsb(gzsVar)).start();
    }

    public final void b(gzs<s3q0> gzsVar) {
        final ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(102);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        view.setBackground(colorDrawable);
        ValueAnimator duration = ValueAnimator.ofInt(102, 0).setDuration(200L);
        duration.setInterpolator(new hlq());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.gsb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                colorDrawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        duration.start();
        a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.a(370), new hlq(), gzsVar);
    }
}
