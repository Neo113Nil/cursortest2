package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SearchDelegate.kt */
/* loaded from: classes16.dex */
public final class hqh0 {
    public final h7m a;
    public final wia b;
    public final kca c;
    public final btm d;
    public final h1j e;
    public final x2y f;
    public final yp70 g;
    public final s1m h;
    public VkTopBarSearchQueryVh i;
    public SwitchCatalogVh j;
    public final bpn0 k = new bpn0(new z4d0(this, 6));
    public final eg50 l;
    public SearchRequestFactory.a m;
    public SearchRequestFactory.a n;
    public final Object o;
    public final CatalogGetAudioSearchRequestFactory p;
    public final String q;
    public String r;
    public final CommonSearchResultsVh s;

    public hqh0(Bundle bundle, u4a u4aVar, l7m l7mVar, wia wiaVar, kca kcaVar, btm btmVar, h1j h1jVar, x2y x2yVar, r250 r250Var, yp70 yp70Var, s1m s1mVar, d94 d94Var) {
        this.a = l7mVar;
        this.b = wiaVar;
        this.c = kcaVar;
        this.d = btmVar;
        this.e = h1jVar;
        this.f = x2yVar;
        this.g = yp70Var;
        this.h = s1mVar;
        eg50 eg50Var = new eg50();
        this.l = eg50Var;
        CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint searchMusicEntrypoint = CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInService;
        this.m = searchMusicEntrypoint;
        this.n = searchMusicEntrypoint;
        this.o = msy.a(LazyThreadSafetyMode.NONE, new qah0(this, 1));
        CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory = new CatalogGetAudioSearchRequestFactory(u4aVar.b.s.N(), new qbc0(this, 8), r250Var, yp70Var, d94Var);
        this.p = catalogGetAudioSearchRequestFactory;
        this.q = bundle != null ? bundle.getString("query") : null;
        this.r = "";
        this.s = a().b(u4aVar, catalogGetAudioSearchRequestFactory, eg50Var);
    }

    public final drh0 a() {
        return (drh0) this.k.getValue();
    }
}
