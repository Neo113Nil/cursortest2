package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.DisclaimerType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyTargetExt.kt */
/* loaded from: classes4.dex */
public final class up50 {
    public static final AdsChoices a(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        ArrayList<ajx> arrayList;
        gjx gjxVar = myTargetNativeAdEntry.B;
        egz0 c = gjxVar != null ? gjxVar.c() : null;
        if (c != null && (arrayList = c.b) != null) {
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                String str = c.a.a.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (ajx ajxVar : arrayList) {
                    arrayList2.add(new AdsChoicesOptions(ajxVar.b(), ajxVar.getType(), ajxVar.getTitle(), null, null, null, null, 120, null));
                }
                return new AdsChoices(str, null, null, null, arrayList2);
            }
        }
        return null;
    }

    public static final void b(io.reactivex.rxjava3.core.y<bs50> yVar, zu50 zu50Var, bp50 bp50Var, gjx gjxVar, DisclaimerContent disclaimerContent) {
        l0n l0nVar;
        cw50 d;
        DisclaimerType disclaimerType;
        wjz0 content;
        DisclaimerData disclaimerData = null;
        if (gjxVar == null || (content = gjxVar.getContent()) == null || (l0nVar = content.d()) == null) {
            l0nVar = (zu50Var == null || (d = zu50Var.d()) == null) ? null : d.k;
        }
        if (l0nVar != null) {
            float f = 0.1f;
            int i = 80;
            switch (l0nVar.a) {
                case 8:
                    disclaimerType = DisclaimerType.DRUG;
                    i = 40;
                    f = 0.05f;
                    break;
                case 9:
                    disclaimerType = DisclaimerType.SUPPLEMENT;
                    break;
                case 10:
                default:
                    i = 0;
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    disclaimerType = null;
                    break;
                case 11:
                    disclaimerType = DisclaimerType.CREDITS;
                    break;
                case 12:
                    disclaimerType = DisclaimerType.BANKRUPTCY;
                    f = 0.07f;
                    break;
                case 13:
                    disclaimerType = DisclaimerType.ENERGETICS;
                    f = 0.07f;
                    break;
            }
            if (disclaimerType != null) {
                disclaimerData = new DisclaimerData(disclaimerType, f, i);
            }
        }
        yVar.onSuccess(new bs50(zu50Var, gjxVar, bp50Var, disclaimerData, disclaimerContent));
    }

    public static final ajx c(gjx gjxVar, String str) {
        ArrayList arrayList;
        egz0 c = gjxVar.c();
        Object obj = null;
        if (c == null || (arrayList = c.b) == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((ajx) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (ajx) obj;
    }

    public static final DisclaimerContent d(String str, String str2) {
        return (epx.f(str, "site_sdk") || (epx.f(str, "mob_sdk") && epx.f(str2, "static"))) ? DisclaimerContent.TEXT_WITH_CONTENT : DisclaimerContent.UNSUPPORTED;
    }

    public static final Image e(ehx ehxVar) {
        Serializer.c<Image> cVar = Image.CREATOR;
        return Image.b.c(ehxVar.getUrl(), ehxVar.getWidth(), ehxVar.getHeight(), ImageSizeKey.SIZE_KEY_UNDEFINED);
    }
}
