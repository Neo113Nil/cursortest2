package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.holders.MusicLinksLineVh;
import com.vk.common.links.LaunchContext;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zee implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zee(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                afe afeVar = (afe) this.c;
                ClipGridParams.Data.Hashtag hashtag = (ClipGridParams.Data.Hashtag) this.d;
                ClipsChallenge clipsChallenge = (ClipsChallenge) this.e;
                afeVar.w.b(hashtag, clipsChallenge, clipsChallenge.d, afeVar.h, new com.vk.movika.tools.controls.seekbar.m(afeVar, 3));
                break;
            default:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                MusicLinksLineVh musicLinksLineVh = (MusicLinksLineVh) this.d;
                View view2 = (View) this.e;
                CatalogLink catalogLink = uIBlockLink.y;
                if (catalogLink != null) {
                    b5a b5aVar = musicLinksLineVh.b;
                    Meta meta = catalogLink.g;
                    SearchStatsLoggingInfo searchStatsLoggingInfo = null;
                    b5aVar.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
                    SearchStatInfoProvider searchStatInfoProvider = musicLinksLineVh.c;
                    if (searchStatInfoProvider != null) {
                        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
                        String r = uIBlockLink.r();
                        if (r == null) {
                            r = "";
                        }
                        searchStatsLoggingInfo = searchStatInfoProvider.b(type, r, false);
                    }
                    LaunchContext.a aVar = new LaunchContext.a();
                    aVar.d = uIBlockLink.f;
                    if (searchStatsLoggingInfo != null) {
                        aVar.m = searchStatsLoggingInfo;
                    }
                    maz.c(xwk.d().e(), view2.getContext(), catalogLink.e, aVar.a(), null, null, 24);
                    break;
                }
                break;
        }
    }
}
