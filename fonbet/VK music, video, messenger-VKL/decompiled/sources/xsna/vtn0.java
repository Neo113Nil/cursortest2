package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.button.VkButton;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: TabbarHiddenTabsHintDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class vtn0 implements utn0 {
    public final k820 a;
    public final int b = cn70.b(PsExtractor.VIDEO_STREAM_MASK);
    public com.vk.core.tips.b c;
    public RectF d;
    public RectF e;
    public RectF f;
    public final Integer g;
    public final Integer h;
    public final List<Integer> i;

    public vtn0(k820 k820Var) {
        this.a = k820Var;
        this.g = k820Var.e("PROFILE");
        this.h = k820Var.e("OVERVIEW");
        this.i = e43.l(k820Var.e(Privacy.FRIENDS), k820Var.e("GROUPS"), k820Var.e("MUSIC"), k820Var.e("CLIPS"), k820Var.e(SignalingProtocol.MEDIA_OPTION_VIDEO), k820Var.e("GAMES"));
    }

    @Override // xsna.utn0
    public final void a(NavigationDelegateActivity navigationDelegateActivity, RectF rectF, RectF rectF2, RectF rectF3, ArrayList arrayList) {
        RectF rectF4;
        RectF rectF5;
        RectF rectF6 = null;
        if (rectF != null) {
            PointF pointF = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 12.0f);
            rectF4 = new RectF(rectF);
            rectF4.offset(pointF.x, pointF.y);
        } else {
            rectF4 = null;
        }
        this.d = rectF4;
        if (rectF2 != null) {
            PointF pointF2 = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 12.0f);
            rectF5 = new RectF(rectF2);
            rectF5.offset(pointF2.x, pointF2.y);
        } else {
            rectF5 = null;
        }
        this.e = rectF5;
        if ((rectF3 != null ? rectF3.bottom : 0.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF3 != null) {
            PointF pointF3 = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 1.0f);
            rectF6 = new RectF(rectF3);
            rectF6.offset(pointF3.x, pointF3.y);
        }
        this.f = rectF6;
        e(navigationDelegateActivity, arrayList);
    }

    public final void b() {
        com.vk.core.tips.b bVar = this.c;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.c = null;
    }

    public final SpannableStringBuilder c(Context context, Integer num) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (num != null) {
            int intValue = num.intValue();
            k820 k820Var = this.a;
            ylw ylwVar = new ylw(k820Var.c(intValue));
            ylwVar.c(cn70.b(20));
            ylwVar.a();
            ylw.e(ylwVar);
            spannableStringBuilder.append((CharSequence) ylwVar.b(context));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) context.getString(k820Var.f(num.intValue())));
            spannableStringBuilder.setSpan(new ipk0(cn70.b(22)), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final View d(Context context, boolean z, CharSequence charSequence, String str, List<Integer> list) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.superapp_tabbar_tooltip, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title_text_view);
        View findViewById = inflate.findViewById(R.id.separator_view);
        TextView textView2 = (TextView) inflate.findViewById(R.id.items_list_text_view);
        TextView textView3 = (TextView) inflate.findViewById(R.id.subtitle_text_view);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.next_button);
        VkButton vkButton2 = (VkButton) inflate.findViewById(R.id.finish_button);
        bwt0.p0(textView, z);
        bwt0.p0(findViewById, z);
        textView2.setText(charSequence);
        textView3.setText(str);
        if (!p4g.b(list, this.i) || this.d == null) {
            List<Integer> list2 = list;
            if ((!j5g.P(list2, this.h) || this.e == null) && (!j5g.P(list2, this.g) || this.f == null)) {
                f4m.j(vkButton);
                vkButton2.setVisibility(0);
                bwt0.i0(vkButton2, new ece0(this, 12));
                return inflate;
            }
        }
        f4m.j(vkButton2);
        vkButton.setVisibility(0);
        bwt0.i0(vkButton, new s62(this, context, list, 7));
        return inflate;
    }

    public final void e(Context context, List<Integer> list) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        b();
        boolean b = p4g.b(list, this.i);
        int i = this.b;
        if (b && (rectF3 = this.d) != null) {
            if (rectF3 == null) {
                return;
            }
            this.c = Tooltip.l(new Tooltip(context, null, null, Tooltip.WindowStyle.FULLSCREEN, null, null, null, krv0.l(R.attr.vk_ui_background_modal), 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, new kfb(this, context, list, 6), null, null, null, null, null, new dnz(this, 18), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), null, false, 0, null, null, null, null, -75630736, 15), context, rectF3, false, false, false, false, 236);
            return;
        }
        List<Integer> list2 = list;
        if (j5g.P(list2, this.h) && (rectF2 = this.e) != null) {
            if (rectF2 == null) {
                return;
            }
            this.c = Tooltip.l(new Tooltip(context, null, null, Tooltip.WindowStyle.FULLSCREEN, null, null, null, krv0.l(R.attr.vk_ui_background_modal), 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, new xsd(this, context, list, 2), null, null, null, null, null, new n8c0(this, 11), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), null, false, 0, null, null, null, null, -75630736, 15), context, rectF2, false, false, false, false, 236);
            return;
        }
        if (!j5g.P(list2, this.g) || (rectF = this.f) == null || rectF == null) {
            return;
        }
        this.c = Tooltip.l(new Tooltip(context, null, null, Tooltip.WindowStyle.FULLSCREEN, null, null, null, krv0.l(R.attr.vk_ui_background_modal), 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80, 0, false, null, 0, false, new com.vk.movika.sdk.base.ui.r0(26, this, context), null, null, null, null, null, new oyr(this, 23), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), null, false, 0, null, null, null, null, -75630736, 15), context, rectF, false, false, false, false, 236);
    }

    @Override // xsna.utn0
    public final void hide() {
        b();
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
