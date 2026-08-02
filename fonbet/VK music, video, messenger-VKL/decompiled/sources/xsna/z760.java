package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.ui.tooltip.types.TooltipType;

/* compiled from: NewKzSubTooltip.kt */
/* loaded from: classes3.dex */
public final class z760 extends i960 {
    public final Context d;
    public final hvr0 e;

    public z760(Context context, hvr0 hvr0Var) {
        super(TooltipType.KZ_SUB, HintId.INFO_VIDEO_KAZ_LANG.getId());
        this.d = context;
        this.e = hvr0Var;
    }

    @Override // xsna.zkt0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        Hint b = pla.e().b().b(this.b);
        if (b == null) {
            return;
        }
        Tooltip.l(new Tooltip(this.d, null, b.c, null, null, new nj20(prq0Var, 1), null, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, new nit(wmd0Var, 9), 2000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(16), null, null, null, null, -1098909736, 15), this.d, new RectF((Rect) this.e.invoke()), false, false, false, false, 236);
    }
}
