package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class eio implements hsd0 {
    public final /* synthetic */ int a;
    public final lho b;

    public /* synthetic */ eio(lho lhoVar, int i) {
        this.a = i;
        this.b = lhoVar;
    }

    @Override // defpackage.hsd0
    public final void a(String str) {
        int i = this.a;
        lho lhoVar = this.b;
        switch (i) {
            case 0:
                LinkedHashMap n = nnm.n(lhoVar, "from", str);
                n.put("_meta", lho.a(1, new HashMap()));
                lhoVar.d("PlusHome.Content.Shown", n);
                break;
            default:
                LinkedHashMap n2 = nnm.n(lhoVar, "from", str);
                n2.put("_meta", lho.a(1, new HashMap()));
                lhoVar.d("PlusStories.Content.Shown", n2);
                break;
        }
    }

    @Override // defpackage.hsd0
    public final void b(String str, OfferTypeDto offerTypeDto) {
        EvgenAnalytics$EvgenOfferType d;
        EvgenAnalytics$EvgenOfferType d2;
        int i = this.a;
        lho lhoVar = this.b;
        switch (i) {
            case 0:
                if (offerTypeDto != null && (d = zba1.d(offerTypeDto)) != null) {
                    lhoVar.c(str, d);
                    break;
                }
                break;
            default:
                if (offerTypeDto != null && (d2 = zba1.d(offerTypeDto)) != null) {
                    lhoVar.c(str, d2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hsd0
    public final void c(String str, OfferTypeDto offerTypeDto) {
        EvgenAnalytics$EvgenOfferType d;
        EvgenAnalytics$EvgenOfferType d2;
        int i = this.a;
        lho lhoVar = this.b;
        switch (i) {
            case 0:
                if (offerTypeDto != null && (d = zba1.d(offerTypeDto)) != null) {
                    lhoVar.b(str, d);
                    break;
                }
                break;
            default:
                if (offerTypeDto != null && (d2 = zba1.d(offerTypeDto)) != null) {
                    lhoVar.b(str, d2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hsd0
    public final void d(String str, String str2) {
        int i = this.a;
        lho lhoVar = this.b;
        switch (i) {
            case 0:
                lhoVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", str);
                linkedHashMap.put("page_url", str2);
                linkedHashMap.put("_meta", lho.a(2, new HashMap()));
                lhoVar.d("PlusHome.Content.Loading.Error", linkedHashMap);
                break;
            default:
                lhoVar.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("from", str);
                linkedHashMap2.put("page_url", str2);
                linkedHashMap2.put("_meta", lho.a(2, new HashMap()));
                lhoVar.d("PlusStories.Content.Loading.Error", linkedHashMap2);
                break;
        }
    }

    @Override // defpackage.hsd0
    public final void f(String str) {
        int i = this.a;
        lho lhoVar = this.b;
        switch (i) {
            case 0:
                LinkedHashMap n = nnm.n(lhoVar, "from", str);
                n.put("_meta", lho.a(1, new HashMap()));
                lhoVar.d("PlusHome.Opened", n);
                break;
            default:
                LinkedHashMap n2 = nnm.n(lhoVar, "from", str);
                n2.put("_meta", lho.a(1, new HashMap()));
                lhoVar.d("PlusStories.Opened", n2);
                break;
        }
    }
}
