package xsna;

import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.lists.c;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;

/* compiled from: MarketClassifiedsCatalogSearchVhFactory.kt */
/* loaded from: classes18.dex */
public final class zv00 implements mgc {
    public final u4a a;
    public final lgc b;

    public zv00(u4a u4aVar, lgc lgcVar) {
        this.a = u4aVar;
        this.b = lgcVar;
    }

    @Override // xsna.mgc
    public final SearchResultsImplVh a() {
        u4a u4aVar = this.a;
        u4a.a aVar = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        vd7 vd7Var = new vd7(aVar.e);
        jda K = catalogConfiguration.K(u4aVar);
        lgc lgcVar = this.b;
        kea keaVar = new kea(lgcVar, K, this.a, vd7Var, false, null, null, false, null, null, null, null, null, false, null, 131008);
        return new SearchResultsImplVh(lgcVar, keaVar, new VerticalStackedListVh(catalogConfiguration, new c.h((c.m) keaVar), keaVar, this.a, null, R.layout.catalog_list_vertical_with_appbar_behaviour, new VerticalListVh.a(new z3v(false), null, null, 52), new xe10(), 368), null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
    }
}
