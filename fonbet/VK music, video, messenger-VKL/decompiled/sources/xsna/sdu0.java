package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vkontakte.android.R;
import xsna.kel0;

/* compiled from: VkBannerAdViewFactory.kt */
/* loaded from: classes6.dex */
public class sdu0 implements lel0 {
    public final kel0.a a;
    public final t36 b;

    public sdu0(kel0.a aVar, t36 t36Var) {
        this.a = aVar;
        this.b = t36Var;
    }

    public s36 a(kel0.a aVar, Context context, BannerAdUiData bannerAdUiData, boolean z) {
        s36 c = this.b.c(context, bannerAdUiData, z);
        String str = aVar.a;
        s36 e = c.e(str);
        String str2 = aVar.c;
        String str3 = aVar.b;
        s36 d = e.d((str2 == null || str2.length() <= 0) ? (str3 == null || str3.length() <= 0) ? null : str3 : str2);
        String str4 = aVar.e;
        if (str4 == null || str4.length() == 0) {
            str4 = context.getString(R.string.vk_banner_call_to_action_button_text);
        }
        s36 a = d.a(str4);
        String str5 = aVar.f;
        String str6 = aVar.d;
        int i = aVar.j;
        if (str5 == null || str5.length() == 0) {
            str5 = null;
        }
        if (str5 == null) {
            str5 = context.getString(R.string.vk_banner_advertising_label_default);
        }
        String str7 = aVar.g;
        boolean z2 = false;
        if (str7 != null && str7.length() > 0) {
            z2 = true;
        }
        a.g(str5);
        if (z2) {
            if (str7 == null) {
                str7 = "";
            }
            a.i(str7);
        }
        if (aVar.h) {
            float f = aVar.i;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i > 0) {
                a.j(String.valueOf(f));
                a.l(context.getResources().getQuantityString(R.plurals.vk_banner_ad_app_votes, i, Integer.valueOf(i)));
                if (str2 != null || str2.length() <= 0) {
                    str2 = (str3 != null || str3.length() <= 0) ? null : str3;
                }
                return a.k(context.getString(R.string.vk_banner_ad_container_accessibility, a.c(str, str2))).h(context, aVar.k);
            }
        }
        if (str6 != null && str6.length() > 0) {
            a.m(str6);
        }
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        return a.k(context.getString(R.string.vk_banner_ad_container_accessibility, a.c(str, str2))).h(context, aVar.k);
    }
}
