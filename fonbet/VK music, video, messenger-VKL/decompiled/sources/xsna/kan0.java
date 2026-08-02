package xsna;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.SuperAppWidgetOnboardingPanel;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SuperAppOnboardingPanelHolder.kt */
/* loaded from: classes6.dex */
public final class kan0 extends ucn0<lan0> {
    public static final float v = iah0.b(4.0f);
    public static final int w = iah0.a(24);
    public static final float x = iah0.b(16.0f);
    public final u7n0 p;
    public final ViewGroup q;
    public final ViewGroup r;
    public final TextView s;
    public final TextView t;
    public final View u;

    public kan0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (ViewGroup) this.itemView.findViewById(R.id.icon_container);
        this.r = (ViewGroup) this.itemView.findViewById(R.id.icon_background);
        TextView textView = (TextView) this.itemView.findViewById(R.id.title_text);
        this.s = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.subtitle_text);
        this.t = textView2;
        View findViewById = this.itemView.findViewById(R.id.close_button);
        this.u = findViewById;
        View view2 = this.itemView;
        Context context = view2.getContext();
        int f = e3m.f(R.attr.vk_ui_write_bar_input_background, this.itemView.getContext());
        float f2 = x;
        view2.setBackground(vjo.a(context, f, 0, 0, f2, null, f2, 188));
        jjc.g(findViewById, new z8l0(this, 5));
        jjc.g(this.itemView, new jan0(this, 0));
        textView.setTextSize(1, 14.0f);
        textView2.setTextSize(1, 13.0f);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        WebImageSize f;
        lan0 lan0Var = (lan0) zif0Var;
        this.r.setElevation(dhr0.M() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : v);
        SuperAppWidgetOnboardingPanel superAppWidgetOnboardingPanel = lan0Var.e;
        WebImage webImage = superAppWidgetOnboardingPanel.p;
        Integer num = null;
        String str = (webImage == null || (f = webImage.f(w)) == null) ? null : f.b;
        if (str != null) {
            VKImageController<View> b6 = b6(this.q);
            List<String> list = superAppWidgetOnboardingPanel.r;
            if (list != null) {
                String str2 = (String) j5g.a0(list);
                String str3 = (String) j5g.b0(!dhr0.C().b ? 1 : 0, list);
                if (str3 != null) {
                    str2 = str3;
                }
                try {
                    num = Integer.valueOf(Color.parseColor(str2));
                } catch (Throwable unused) {
                }
            }
            b6.f(str, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, num, null, null, 63487));
        }
        this.s.setText(superAppWidgetOnboardingPanel.q);
        this.t.setText(superAppWidgetOnboardingPanel.s);
        bwt0.p0(this.u, superAppWidgetOnboardingPanel.t);
    }
}
