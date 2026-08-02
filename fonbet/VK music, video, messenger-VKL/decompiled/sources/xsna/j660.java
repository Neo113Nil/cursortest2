package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.core.tips.Tooltip;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: NeuroTooltip.kt */
/* loaded from: classes3.dex */
public final class j660 implements zkt0 {
    public final Context a;
    public final ViewGroup b;
    public final TooltipType c = TooltipType.NEURO;

    public j660(Context context, LinearLayout linearLayout) {
        this.a = context;
        this.b = linearLayout;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        gpt0 gpt0Var = gpt0.a;
        return !Preference.v("video_tooltip_prefs", "tooltip_video_neuro");
    }

    @Override // xsna.zkt0
    public final void b(final prq0 prq0Var, wmd0 wmd0Var) {
        View view;
        ViewGroup viewGroup = this.b;
        if (viewGroup == null || (view = (View) rl3.O(awt0.d(viewGroup))) == null) {
            return;
        }
        e3m.a aVar = e3m.a;
        Context context = this.a;
        View c = new Tooltip(context, context.getString(R.string.video_quality_neuro_subtitle_two_lines), null, null, null, new DialogInterface.OnShowListener() { // from class: xsna.i660
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                prq0.this.invoke();
            }
        }, null, -1, context.getColor(R.color.vk_black), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, new pp00(this, 12), null, null, null, null, null, new ac20(wmd0Var, 5), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -2, null, false, 0, null, null, null, null, -75628968, 15).c(context, bwt0.G(view));
        c.measure(0, 0);
        view.measure(0, 0);
        int measuredWidth = (c.getMeasuredWidth() - view.getMeasuredWidth()) / 2;
        Drawable background = c.getBackground();
        q1i0 q1i0Var = background instanceof q1i0 ? (q1i0) background : null;
        if (q1i0Var != null) {
            q1i0Var.c(measuredWidth);
        }
        viewGroup.addView(c, new ViewGroup.LayoutParams(-2, -2));
        gpt0 gpt0Var = gpt0.a;
        if (Preference.v("video_tooltip_prefs", "tooltip_video_neuro")) {
            return;
        }
        Preference.I("video_tooltip_prefs", "tooltip_video_neuro", true);
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.c;
    }
}
