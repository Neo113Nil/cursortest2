package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.hints.HintId;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ext.CounterType;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SuperAppShowcaseMenuHolder.kt */
/* loaded from: classes6.dex */
public final class nbn0 extends ucn0<jbn0> {
    public static final int z = iah0.a(28.0f);
    public final u7n0 p;
    public final View q;
    public final ImageView r;
    public final FrameLayout s;
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final TextView w;
    public final View x;
    public final ImageView y;

    static {
        iah0.a(40.0f);
    }

    public nbn0(View view, u7n0 u7n0Var, wxt0 wxt0Var) {
        super(view, wxt0Var);
        this.p = u7n0Var;
        this.q = this.itemView.findViewById(R.id.container);
        this.r = (ImageView) this.itemView.findViewById(R.id.icon_background);
        this.s = (FrameLayout) this.itemView.findViewById(R.id.icon_container);
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.t = textView;
        this.u = (TextView) this.itemView.findViewById(R.id.badge);
        this.v = (ImageView) this.itemView.findViewById(R.id.new_badge);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.counter);
        this.w = textView2;
        this.x = this.itemView.findViewById(R.id.dot);
        this.y = (ImageView) this.itemView.findViewById(R.id.favorite_badge);
        jjc.g(view, new qjg0(this, 10));
        textView.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 12.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    @Override // xsna.hf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(zif0 zif0Var) {
        Integer num;
        Drawable enk0Var;
        Integer num2;
        String str;
        String str2;
        Integer num3;
        Integer num4;
        WebImageSize f;
        CustomMenuInfo customMenuInfo = ((jbn0) zif0Var).b;
        String str3 = customMenuInfo.c;
        if (epx.f(str3, "more")) {
            int f2 = e3m.f(R.attr.vk_ui_image_border_alpha, this.itemView.getContext());
            float b = iah0.b(0.5f);
            if (b < 1.0f) {
                b = 1.0f;
            }
            enk0Var = new fnk0(b, f2);
        } else {
            List<String> list = customMenuInfo.j;
            if (list != null) {
                String str4 = (String) j5g.b0(!dhr0.C().b ? 1 : 0, list);
                if (str4 == null) {
                    str4 = null;
                }
                try {
                    num = Integer.valueOf(Color.parseColor(str4));
                } catch (Throwable unused) {
                }
                enk0Var = new enk0(3.9d, num == null ? num.intValue() : e3m.f(R.attr.vk_ui_background_tertiary, this.itemView.getContext()));
            }
            num = null;
            enk0Var = new enk0(3.9d, num == null ? num.intValue() : e3m.f(R.attr.vk_ui_background_tertiary, this.itemView.getContext()));
        }
        ImageView imageView = this.r;
        imageView.setImageDrawable(enk0Var);
        Context context = this.itemView.getContext();
        List<String> list2 = customMenuInfo.h;
        if (list2 != null) {
            String str5 = (String) j5g.b0(!dhr0.C().b ? 1 : 0, list2);
            if (str5 == null) {
                str5 = null;
            }
            try {
                num2 = Integer.valueOf(Color.parseColor(str5));
            } catch (Throwable unused2) {
            }
            int intValue = num2 == null ? num2.intValue() : epx.f(customMenuInfo.c, "more") ? e3m.f(R.attr.vk_ui_text_accent, context) : e3m.f(R.attr.vk_ui_text_primary, context);
            TextView textView = this.t;
            textView.setTextColor(intValue);
            this.itemView.getContext();
            str = customMenuInfo.f;
            if (drm0.N(str)) {
                str = null;
            }
            textView.setText(str);
            VKImageController<View> b6 = b6(this.s);
            WebImage webImage = customMenuInfo.k;
            str2 = (webImage != null || (f = webImage.f(z)) == null) ? null : f.b;
            if (str2 == null) {
                List<String> list3 = customMenuInfo.i;
                if (list3 != null) {
                    String str6 = (String) j5g.b0(!dhr0.C().b ? 1 : 0, list3);
                    if (str6 == null) {
                        str6 = null;
                    }
                    try {
                        num4 = Integer.valueOf(Color.parseColor(str6));
                    } catch (Throwable unused3) {
                        num4 = null;
                    }
                    num3 = num4;
                } else {
                    num3 = null;
                }
                b6.f(str2, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, num3, null, null, 63479));
            } else {
                VKImageController.a.a(b6, null);
            }
            this.y.setImageResource(!dhr0.M() ? R.drawable.vk_icon_favorite_badge_color_dark_16 : R.drawable.vk_icon_favorite_badge_color_light_16);
            dz5.h(customMenuInfo.g, CounterType.WITH_PLUS, this.w, this.x, this.u, this.v, this.y, null, 64);
            if (epx.f(str3, "more")) {
                pla.e().b().q(imageView, HintId.INFO_MINI_APPS_OPEN_CATALOG_WITH_BADGES);
            }
            if (epx.f(str3, "market")) {
                return;
            }
            pla.e().b().l(textView, HintId.MARKETPLACE_SERVICE_ENTRY_POINT_ONBOARDING.getId(), null);
            return;
        }
        num2 = null;
        if (num2 == null) {
        }
        TextView textView2 = this.t;
        textView2.setTextColor(intValue);
        this.itemView.getContext();
        str = customMenuInfo.f;
        if (drm0.N(str)) {
        }
        textView2.setText(str);
        VKImageController<View> b62 = b6(this.s);
        WebImage webImage2 = customMenuInfo.k;
        if (webImage2 != null) {
        }
        if (str2 == null) {
        }
        this.y.setImageResource(!dhr0.M() ? R.drawable.vk_icon_favorite_badge_color_dark_16 : R.drawable.vk_icon_favorite_badge_color_light_16);
        dz5.h(customMenuInfo.g, CounterType.WITH_PLUS, this.w, this.x, this.u, this.v, this.y, null, 64);
        if (epx.f(str3, "more")) {
        }
        if (epx.f(str3, "market")) {
        }
    }
}
