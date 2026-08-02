package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.lists.c;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;

/* compiled from: SearchClassifiedsCatalogSearchVhFactory.kt */
/* loaded from: classes18.dex */
public final class snh0 implements mgc {
    public final u4a a;
    public final lgc b;
    public final Context c;

    public snh0(u4a u4aVar, lgc lgcVar, FragmentActivity fragmentActivity) {
        this.a = u4aVar;
        this.b = lgcVar;
        this.c = fragmentActivity;
    }

    @Override // xsna.mgc
    public final SearchResultsImplVh a() {
        boolean z = (1 & 2) == 0;
        u4a u4aVar = this.a;
        u4a.a aVar = u4aVar.b;
        u4a a = u4a.a(u4aVar, u4a.a.a(aVar, null, null, null, null, null, z ? new tyh0(aVar.s) : aVar.s, null, null, null, aVar.I, new onh0(), -524289, 1048551));
        u4a.a aVar2 = a.b;
        CatalogConfiguration catalogConfiguration = aVar2.s;
        vd7 vd7Var = new vd7(aVar2.e);
        jda K = catalogConfiguration.K(a);
        lgc lgcVar = this.b;
        kea keaVar = new kea(lgcVar, K, a, vd7Var, false, null, null, false, null, null, null, null, null, false, null, 131008);
        return new SearchResultsImplVh(lgcVar, keaVar, new VerticalStackedListVh(catalogConfiguration, new c.h((c.m) keaVar), keaVar, a, null, R.layout.catalog_list_vertical_with_appbar_behaviour, new VerticalListVh.a(new z3v(false), null, null, 52), new e0a(this.c), 368), null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
    }
}
