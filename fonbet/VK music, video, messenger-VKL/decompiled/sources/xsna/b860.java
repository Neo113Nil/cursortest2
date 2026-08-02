package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: NewMultiAudioTooltip.kt */
/* loaded from: classes3.dex */
public final class b860 extends i960 {
    public final Context d;
    public final tfm0 e;

    public b860(Context context, tfm0 tfm0Var) {
        super(TooltipType.MULTI_AUDIO, HintId.INFO_VIDEO_MULTIPLE_VOLUME.getId());
        this.d = context;
        this.e = tfm0Var;
    }

    @Override // xsna.zkt0
    public final void b(final prq0 prq0Var, wmd0 wmd0Var) {
        Hint b = pla.e().b().b(this.b);
        if (b == null) {
            return;
        }
        String str = b.c;
        e3m.a aVar = e3m.a;
        Context context = this.d;
        Tooltip.l(new Tooltip(context, null, str, null, null, new DialogInterface.OnShowListener() { // from class: xsna.a860
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                prq0.this.invoke();
            }
        }, null, -1, context.getColor(R.color.vk_gray_800), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, new oyr(wmd0Var, 11), 2000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(16), null, null, null, null, -1098910120, 15), this.d, new RectF((Rect) this.e.invoke()), false, false, false, false, 236);
    }
}
