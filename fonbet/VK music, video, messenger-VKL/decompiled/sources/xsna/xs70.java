package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dll0;
import xsna.dt70;
import xsna.yqu;
import xsna.zs70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs70 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xs70(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                dt70.b bVar = (dt70.b) this.c;
                wh50 wh50Var = (wh50) this.d;
                lf4 lf4Var = (lf4) this.e;
                izs izsVar = (izs) this.f;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, "headerItem", null, new jai(1934419846, new nte(1, bVar, wh50Var), true), 2);
                List<dt70.a> list = bVar.d;
                nvyVar.e(list.size(), new zs70.a(new ow60(2), list), new zs70.b(list), new jai(802480018, new zs70.c(list, lf4Var, izsVar), true));
                break;
            case 1:
                final com.vk.catalog2.common.ui.holders.c cVar = (com.vk.catalog2.common.ui.holders.c) this.c;
                final UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) this.d;
                final UserId userId = (UserId) this.e;
                String str = (String) this.f;
                ((ikv0) obj).a();
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    io.reactivex.rxjava3.disposables.c cVar2 = cVar.d;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = rsg0.Z(yfb.x(yqu.a.c(cVar.f, userId, null, null, str, null, null, null, null, 502))).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ryd0
                        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            com.vk.catalog2.common.ui.holders.c cVar3 = com.vk.catalog2.common.ui.holders.c.this;
                            cVar3.c.invoke(SearchAuthorAnalyticsInfo.ClickTarget.CancelUnsubscribe);
                            ysg0<awd0> ysg0Var = o1e0.a;
                            UserId userId2 = userId;
                            ysg0Var.a(new wzd0(fkq0.e(userId2), true));
                            q3a q3aVar = cVar3.a;
                            q3aVar.b(new oon0("author_subscribe", null, false, false, 14), false);
                            UIBlockSearchAuthor uIBlockSearchAuthor2 = uIBlockSearchAuthor;
                            if (uIBlockSearchAuthor2 != null) {
                                q3aVar.b(new buz(12, new q520(17), new zjm(8, uIBlockSearchAuthor2, userId2)), false);
                            }
                            com.vk.catalog2.common.ui.holders.c.d(userId2);
                        }
                    }, new jsb0(new juz(19), 8));
                    cVar.b.a(subscribe);
                    cVar.d = subscribe;
                } else {
                    cvk.u(R.string.error_network, false);
                }
                break;
            case 2:
                bel0 bel0Var = (bel0) this.c;
                WebAdConfig webAdConfig = (WebAdConfig) this.d;
                BannerAdUiData bannerAdUiData = (BannerAdUiData) this.e;
                Context context = (Context) this.f;
                bel0Var.h = null;
                bel0Var.i = 0;
                gnl gnlVar = e370.m;
                bel0Var.w(new uh0(AdRequestPurpose.LOAD_NEXT_INSTANCE), bannerAdUiData, jn00.b((gnlVar != null ? gnlVar : null).a().j0().y(webAdConfig).get(bel0Var.i)), context, true, webAdConfig);
                break;
            default:
                dll0.a.b bVar2 = (dll0.a.b) this.c;
                LoadingState loadingState = (LoadingState) this.d;
                izs izsVar2 = (izs) this.f;
                qa8 qa8Var = (qa8) this.e;
                rry rryVar = (rry) obj;
                mpl0 mpl0Var = bVar2.a;
                tl1 u = mpl0Var != null ? hpt0.u(176, mpl0Var.d) : null;
                if (u != null) {
                    rry.j(rryVar, null, new jai(1469539008, new wkl0(izsVar2, bVar2, u), true), 7);
                }
                List<GoodAlbum> list2 = bVar2.b;
                rryVar.a(list2.size(), null, new zkl0(list2), new jai(-1942245546, new all0(list2, izsVar2), true));
                if (loadingState == LoadingState.Page) {
                    rry.j(rryVar, new rgl0(1), new jai(-1450125143, new ov7(qa8Var, 3), true), 5);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xs70(dll0.a.b bVar, LoadingState loadingState, izs izsVar, qa8 qa8Var) {
        this.b = 3;
        this.c = bVar;
        this.d = loadingState;
        this.f = izsVar;
        this.e = qa8Var;
    }
}
