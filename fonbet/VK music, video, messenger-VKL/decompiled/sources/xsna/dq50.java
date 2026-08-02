package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.ads.DisclaimerBannerData;
import com.vk.clips.sdk.models.ads.SdkAdsChoices;
import com.vk.clips.sdk.models.ads.SdkAdsChoicesOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.wih0;

/* compiled from: MyTargetFeedItemBuilderImpl.kt */
/* loaded from: classes17.dex */
public final class dq50 implements cq50 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    @Override // xsna.cq50
    public final wih0.b a(gjx gjxVar, aq50 aq50Var, SdkOwner sdkOwner) {
        ImageUrl imageUrl;
        DisclaimerBannerData.DisclaimerType disclaimerType;
        ArrayList arrayList;
        wjz0 content = gjxVar.getContent();
        DisclaimerBannerData disclaimerBannerData = null;
        if (content != null) {
            ocz0 ocz0Var = content.a;
            kbz0 kbz0Var = content.e;
            if (kbz0Var != null) {
                kiw kiwVar = kbz0Var.a;
                imageUrl = new ImageUrl(kiwVar.a, kiwVar.c, kiwVar.b, false, 8, null);
            } else {
                imageUrl = null;
            }
            ArrayList arrayList2 = content.h;
            if (arrayList2 != null) {
                String id = gjxVar.getId();
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    wix wixVar = (wix) it.next();
                    String id2 = wixVar.getId();
                    if (id2 == null) {
                        id2 = UUID.randomUUID().toString();
                    }
                    String price = wixVar.getPrice();
                    String a = wixVar.a();
                    String d = wixVar.d();
                    String title = wixVar.getTitle();
                    String description = wixVar.getDescription();
                    kbz0 image = wixVar.getImage();
                    arrayList3.add(new cle(id2, price, a, d, title, description, image != null ? vp50.a(image) : null, null, null, null, wixVar.b(), null, 0, null, null));
                }
                wjz0 content2 = gjxVar.getContent();
                String n = content2 != null ? content2.a.n() : null;
                String str = n == null ? "" : n;
                wjz0 content3 = gjxVar.getContent();
                String n2 = content3 != null ? content3.a.n() : null;
                String str2 = n2 == null ? "" : n2;
                EmptyList emptyList = EmptyList.b;
                List list = emptyList;
                SdkActionLink sdkActionLink = new SdkActionLink("", 0, ocz0Var.n(), "", "", new ActionLinkSnippet(str, "", "", str2, 0, 0, new SdkImages(emptyList, null, 2, null), null, null, null, null, 1024, null), null, null, null);
                String str3 = ocz0Var.r;
                l0n d2 = content.d();
                String str4 = d2 != null ? d2.c : null;
                String str5 = ocz0Var.h;
                String str6 = ocz0Var.f;
                kbz0 kbz0Var2 = content.d;
                SdkImages a2 = kbz0Var2 != null ? vp50.a(kbz0Var2) : null;
                egz0 c = gjxVar.c();
                if (c != null && (arrayList = c.b) != null) {
                    list = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ajx ajxVar = (ajx) it2.next();
                        list.add(new SdkAdsChoicesOptions(ajxVar.b(), ajxVar.getType(), ajxVar.getTitle(), null, Boolean.valueOf(ajxVar.a()), null, null, 104, null));
                    }
                }
                SdkAdsChoices sdkAdsChoices = new SdkAdsChoices(null, null, null, null, list, 15, null);
                wjz0 content4 = gjxVar.getContent();
                l0n d3 = content4 != null ? content4.d() : null;
                if (d3 != null) {
                    float f = 0.1f;
                    int i = 80;
                    switch (d3.a) {
                        case 8:
                            disclaimerType = DisclaimerBannerData.DisclaimerType.DRUG;
                            i = 40;
                            f = 0.05f;
                            break;
                        case 9:
                            disclaimerType = DisclaimerBannerData.DisclaimerType.SUPPLEMENTS;
                            break;
                        case 10:
                        default:
                            i = 0;
                            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            disclaimerType = null;
                            break;
                        case 11:
                            disclaimerType = DisclaimerBannerData.DisclaimerType.LOANS;
                            break;
                        case 12:
                            disclaimerType = DisclaimerBannerData.DisclaimerType.BANKRUPTCY;
                            f = 0.07f;
                            break;
                        case 13:
                            disclaimerType = DisclaimerBannerData.DisclaimerType.ENERGETICS;
                            f = 0.07f;
                            break;
                    }
                    if (disclaimerType != null) {
                        disclaimerBannerData = new DisclaimerBannerData(disclaimerType, f, i);
                    }
                }
                wih0.b.a aVar = new wih0.b.a(str3, str4, disclaimerBannerData, str5, sdkOwner, str6, null, null, a2, null, jgp.b, sdkAdsChoices);
                String str7 = ocz0Var.c;
                return new wih0.b(id, arrayList3, imageUrl, aVar, sdkActionLink, str7 == null ? "" : str7, null, aq50Var);
            }
        }
        return null;
    }

    @Override // xsna.cq50
    public final wih0.d b(gjx gjxVar, aq50 aq50Var, SdkOwner sdkOwner) {
        wjz0 content = gjxVar.getContent();
        if (content != null) {
            ocz0 ocz0Var = content.a;
            kbz0 kbz0Var = content.e;
            if (kbz0Var != null) {
                String id = gjxVar.getId();
                kiw kiwVar = kbz0Var.a;
                ImageUrl imageUrl = new ImageUrl(kiwVar.a, kiwVar.c, kiwVar.b, false, 8, null);
                String str = ocz0Var.r;
                l0n d = content.d();
                String str2 = d != null ? d.c : null;
                String str3 = ocz0Var.h;
                String str4 = ocz0Var.f;
                kbz0 kbz0Var2 = content.d;
                wih0.d.a aVar = new wih0.d.a(str, str2, str3, sdkOwner, str4, null, null, kbz0Var2 != null ? vp50.a(kbz0Var2) : null, jgp.b, null);
                wjz0 content2 = gjxVar.getContent();
                String n = content2 != null ? content2.a.n() : null;
                String str5 = n == null ? "" : n;
                wjz0 content3 = gjxVar.getContent();
                String n2 = content3 != null ? content3.a.n() : null;
                SdkActionLink sdkActionLink = new SdkActionLink("", 0, ocz0Var.n(), "", "", new ActionLinkSnippet(str5, "", "", n2 == null ? "" : n2, 0, 0, new SdkImages(EmptyList.b, null, 2, null), null, null, null, null, 1024, null), null, null, null);
                String str6 = ocz0Var.c;
                return new wih0.d(id, imageUrl, aVar, sdkActionLink, str6 == null ? "" : str6, null, aq50Var);
            }
        }
        return null;
    }
}
