package xsna;

import android.text.SpannableStringBuilder;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vkontakte.android.R;
import xsna.vkp;

/* compiled from: AdsItemEndOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class sw0 extends oy8<ukp, vkp> {
    @Override // xsna.oy8
    public final vkp b(ukp ukpVar) {
        String str;
        ukp ukpVar2 = ukpVar;
        tgg tggVar = ukpVar2.c;
        String str2 = ukpVar2.b;
        if (!ukpVar2.a) {
            return new vkp.a(str2);
        }
        String str3 = tggVar.c;
        String str4 = ukpVar2.g ? tggVar.d : ukpVar2.h;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(ukpVar2.f);
        SdkActionLink sdkActionLink = ukpVar2.d;
        boolean z = ukpVar2.i;
        tlo0 tlo0Var = null;
        if (epx.f(sdkActionLink != null ? sdkActionLink.e : null, "link_community_with_subscribe")) {
            tlo0Var = tq.h(tlo0.Companion, z ? R.string.clips_open_community : R.string.clips_subscribe_community);
        } else if (sdkActionLink != null) {
            tlo0Var = oq.d(tlo0.Companion, sdkActionLink.d);
        }
        tlo0 tlo0Var2 = tlo0Var;
        StringBuilder sb = new StringBuilder();
        String str5 = tggVar.a;
        if (str5 == null || (str = drm0.p0(str5).toString()) == null) {
            str = "";
        }
        String str6 = tggVar.e;
        sb.append(str + ' ' + (str6 != null ? str6 : ""));
        if (str3 != null && str3.length() != 0) {
            sb.append(" · " + str3);
        }
        drm0.p0(sb);
        return new vkp.b(str2, ukpVar2.e, ukpVar2.g, tggVar, ukpVar2.j, ukpVar2.k, str4, spannableStringBuilder, tlo0Var2, sb.toString());
    }
}
