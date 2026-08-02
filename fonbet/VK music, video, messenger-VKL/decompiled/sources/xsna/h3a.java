package xsna;

import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.catalog2.common.ui.holders.classifieds.CatalogCategoryTabVh;
import com.vk.common.links.LaunchContext;
import com.vk.dto.hints.HintCategories;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.album.MarketAlbumImageUploadProgressView;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.ad.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h3a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Uri uri;
        String str2;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                UIBlockNavigationTab uIBlockNavigationTab = (UIBlockNavigationTab) obj2;
                CatalogCategoryTabVh catalogCategoryTabVh = (CatalogCategoryTabVh) obj;
                CatalogNavigationTab catalogNavigationTab = uIBlockNavigationTab.y;
                String str3 = catalogNavigationTab.d;
                switch (str3.hashCode()) {
                    case 116079:
                        if (str3.equals("url") && (str = catalogNavigationTab.e) != null) {
                            String str4 = !drm0.N(str) ? str : null;
                            if (str4 == null || (uri = Uri.parse(str4)) == null) {
                                uri = Uri.EMPTY;
                            }
                            String queryParameter = uri.getQueryParameter("section");
                            String queryParameter2 = uri.getQueryParameter("category_id");
                            Integer m = queryParameter2 != null ? arm0.m(10, queryParameter2) : null;
                            if (epx.f(queryParameter, "category")) {
                                i3a i3aVar = catalogCategoryTabVh.e;
                                MarketAnalyticsParams marketAnalyticsParams = catalogCategoryTabVh.d;
                                i3aVar.getClass();
                                i3a.a(marketAnalyticsParams, m);
                            }
                            maz.c(catalogCategoryTabVh.b, view.getContext(), str, LaunchContext.A, null, null, 24);
                            break;
                        }
                        break;
                    case 1296516636:
                        if (!str3.equals(HintCategories.PARAM_NAME)) {
                        }
                        break;
                    case 1762953472:
                        if (!str3.equals("classifieds_category_tree")) {
                        }
                        break;
                    case 1970241253:
                        if (str3.equals("section") && (str2 = catalogNavigationTab.f) != null) {
                            ((ClassifiedsComponent) ((k7m) m7m.f(catalogCategoryTabVh)).a(fpf0.a(ClassifiedsComponent.class))).dc().d(view.getContext(), new ngc(null, str2, null, null, null, null, null, null, null, null, catalogCategoryTabVh.d, null, false, catalogNavigationTab.c, 3604475));
                            break;
                        }
                        break;
                }
                ahc ahcVar = catalogCategoryTabVh.i;
                if (ahcVar != null) {
                    ahcVar.a(uIBlockNavigationTab);
                    break;
                }
                break;
            case 1:
                int i2 = MarketAlbumImageUploadProgressView.f;
                ((MarketAlbumImageUploadProgressView) obj2).a(0, 0);
                ((View.OnClickListener) obj).onClick(view);
                break;
            default:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) obj2;
                Handler handler = eVar.u;
                VideoAdDialog.c cVar = eVar.b;
                handler.removeCallbacksAndMessages(null);
                if (!((yg5) obj).w0()) {
                    cVar.invoke(a.i.b);
                    handler.postDelayed(new kyc(eVar, 9), 3000L);
                    break;
                } else {
                    cVar.invoke(a.g.b);
                    break;
                }
        }
    }
}
