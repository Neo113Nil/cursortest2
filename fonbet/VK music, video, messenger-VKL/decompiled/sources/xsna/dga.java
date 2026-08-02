package xsna;

import android.content.Context;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.screen.api.CatalogSectionScreenArguments;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import xsna.bea;
import xsna.ikv0;
import xsna.mot0;
import xsna.r1a;

/* compiled from: CatalogSectionViewEventHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class dga implements cga {
    public final tda a;
    public final g7s0 b;
    public final b25 c;
    public final maz d;
    public final com.vk.catalog.mvi.section.screen.api.a e;
    public final fba f;
    public final p1e g;

    public dga(tda tdaVar, g7s0 g7s0Var, b25 b25Var, maz mazVar, com.vk.catalog.mvi.section.screen.api.a aVar, fba fbaVar, p1e p1eVar) {
        this.a = tdaVar;
        this.b = g7s0Var;
        this.c = b25Var;
        this.d = mazVar;
        this.e = aVar;
        this.f = fbaVar;
        this.g = p1eVar;
    }

    @Override // xsna.cga
    public final void a(Context context, bea beaVar) {
        if (beaVar instanceof bea.b) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(j03.g(context, ((bea.b) beaVar).a, R.string.error), (String) null, (ikv0.d.a) null, 6);
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                aVar.k = 1;
                aVar.g(1);
            }
            aVar.b().c();
            return;
        }
        if (!(beaVar instanceof bea.a)) {
            throw new NoWhenBranchMatchedException();
        }
        r1a r1aVar = ((bea.a) beaVar).a;
        if ((r1aVar instanceof wnk) || (r1aVar instanceof smk)) {
            return;
        }
        if (r1aVar instanceof r1a.b) {
            r1a.b bVar = (r1a.b) r1aVar;
            b(context, bVar.a, bVar.b);
            return;
        }
        if (!(r1aVar instanceof r1a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        CatalogLinkButtonActionDo catalogLinkButtonActionDo = ((r1a.a) r1aVar).a;
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) {
            CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection openShowAllFragmentLegacySection = (CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) catalogLinkButtonActionDo;
            this.f.a(context, openShowAllFragmentLegacySection.b, openShowAllFragmentLegacySection.c);
            return;
        }
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenSection) {
            CatalogLinkButtonActionDo.OpenSection openSection = (CatalogLinkButtonActionDo.OpenSection) catalogLinkButtonActionDo;
            this.e.a(xa4.L(context), new CatalogSectionScreenArguments(openSection.c, openSection.b, this.a.c()));
            return;
        }
        boolean f = epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.OpenGroups.b);
        g7s0 g7s0Var = this.b;
        b25 b25Var = this.c;
        if (f) {
            b25Var.c();
            g7s0Var.getClass();
            return;
        }
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenUploadVideo) {
            CatalogLinkButtonActionDo.OpenUploadVideo openUploadVideo = (CatalogLinkButtonActionDo.OpenUploadVideo) catalogLinkButtonActionDo;
            mot0.b(mot0.a.a, context, openUploadVideo.b, openUploadVideo.c, null, 24);
            return;
        }
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenAddVideosToAlbum) {
            UserId userId = ((CatalogLinkButtonActionDo.OpenAddVideosToAlbum) catalogLinkButtonActionDo).b;
            g7s0Var.getClass();
            return;
        }
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenUploadClip) {
            this.g.a(context, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.COMMUNITY, null, null, false, false, null, true, null, 190, null));
            return;
        }
        if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenLink) {
            b(context, ((CatalogLinkButtonActionDo.OpenLink) catalogLinkButtonActionDo).b, null);
            return;
        }
        if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.OpenHowBecomeAuthor.b)) {
            maz.c(this.d, context, "https://vkvideo.ru/landings/video_faq", new LaunchContext(false, false, true, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67106811), null, null, 24);
            return;
        }
        if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.OpenAuthorCabinet.b)) {
            s75 c = com.vk.toggle.d.c();
            String str = c != null ? c.b : null;
            if (str == null || drm0.N(str)) {
                return;
            }
            g7s0Var.getClass();
            return;
        }
        if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.ClearVideoHistory.b)) {
            return;
        }
        if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.CreateAlbum.b)) {
            UserId c2 = b25Var.c();
            int i = g7s0.G7;
            g7s0Var.n(context, c2);
        } else {
            if (!(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.SwitchSection) && !(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleAlbumShuffle) && !(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.PlayVideosFromBlock) && !(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleAlbumSubscription) && !(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleVideoAlbumSubscription)) {
                throw new NoWhenBranchMatchedException();
            }
            throw new NotImplementedError("This action is not implemented in catalog event handler,please implement it in your screen");
        }
    }

    public final void b(Context context, String str, String str2) {
        SearchStatsLoggingInfo a = this.a.a(SchemeStat$EventItem.Type.LINK, str2);
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = null;
        aVar.h = str;
        if (a != null) {
            aVar.m = a;
        }
        maz.c(this.d, context, str, aVar.a(), null, null, 24);
    }
}
