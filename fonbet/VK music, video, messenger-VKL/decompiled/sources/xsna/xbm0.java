package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vkontakte.android.R;

/* compiled from: StoryRepostStyleDialog.kt */
/* loaded from: classes16.dex */
public final class xbm0 extends tyl0<Object> {
    public final zbm0 f;
    public final iz8 g;
    public ViewGroup h;
    public StoryStylePickerView i;
    public final ybm0 j;

    public xbm0(Context context, rbm0 rbm0Var, v3l0 v3l0Var, zbm0 zbm0Var, iz8 iz8Var) {
        super(LayoutInflater.from(context).inflate(R.layout.story_repost_dialog, (ViewGroup) null), true, v3l0Var);
        this.f = zbm0Var;
        this.g = iz8Var;
        this.j = new ybm0(this, rbm0Var);
    }

    public static ValueAnimator f(nxt0 nxt0Var, izs izsVar) {
        nxt0Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        nxt0Var.setVisibility(0);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(100L);
        duration.addUpdateListener(new p6n(nxt0Var, 2));
        duration.addListener(new tbm0(izsVar));
        return duration;
    }

    @Override // xsna.tyl0
    public final void b(ViewGroup viewGroup) {
        bwt0.h0(this, (ImageView) viewGroup.findViewById(R.id.story_repost_close));
        this.h = (ViewGroup) viewGroup.findViewById(R.id.story_repost_sticker);
        this.i = (StoryStylePickerView) viewGroup.findViewById(R.id.repost_style_picker);
    }

    @Override // xsna.dc6
    public final cc6 getPresenter() {
        return this.j;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ybm0 ybm0Var = this.j;
        if (ybm0Var != null) {
            ybm0Var.c.a(null);
            ybm0Var.b.dismiss();
        }
    }

    @Override // xsna.tyl0, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        ybm0 ybm0Var = this.j;
        if (valueOf != null && valueOf.intValue() == R.id.story_repost_close) {
            if (ybm0Var != null) {
                ybm0Var.c.a(null);
                ybm0Var.b.dismiss();
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.story_dialog_done || ybm0Var == null) {
            return;
        }
        ybm0Var.k();
    }
}
