package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.music.MusicOwner;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockActionSwitchAccount;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.api.data.discover.a;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Iterator;
import xsna.p1n;
import xsna.r1n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class dta implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dta(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UIBlockActionSwitchAccount uIBlockActionSwitchAccount;
        switch (this.b) {
            case 0:
                gta gtaVar = (gta) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                po6 po6Var = (po6) this.e;
                StoryPrivacyType storyPrivacyType = (StoryPrivacyType) this.f;
                gtaVar.getClass();
                ((u1m0) gtaVar.e.getValue()).a(po6Var.getContext(), new hed0(gta.c(storyEntry), storyPrivacyType, gtaVar.d().j()), gtaVar.d(), true, new eta(gtaVar, storyEntry, po6Var, 0));
                gtaVar.b();
                return s3q0.a;
            case 1:
                q1n q1nVar = (q1n) this.c;
                DiscoverId discoverId = (DiscoverId) this.d;
                m6o0 m6o0Var = (m6o0) this.e;
                bwq bwqVar = (bwq) this.f;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                if ((q1nVar.a(newsEntriesContainer, false) instanceof r1n.c) && m6n.b(discoverId, newsEntriesContainer)) {
                    return io.reactivex.rxjava3.core.q.T(new ovz(newsEntriesContainer)).a0(asu0.a.d());
                }
                DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
                DiscoverCustomIntent discoverCustomIntent = DiscoverCustomIntent.PRELOAD;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) m6o0Var.b;
                vrk0 vrk0Var = DiscoverNewsEntriesRepository.f;
                r1n.c cVar = r1n.c.a;
                com.vk.newsfeed.api.data.discover.a aVar = newsEntriesContainer.b.o;
                vrk0Var.getClass();
                mx6<x960> a = discoverNewsEntriesRepository.a(discoverId, true, discoverCustomIntent, false, new krk0(true, mobileOfficialAppsCoreNavStat$EventScreen, aVar instanceof a.b ? p1n.c.a : p1n.b.a));
                a.M0(bwqVar);
                return a.b;
            default:
                w060 w060Var = (w060) this.c;
                bi20 bi20Var = (bi20) this.d;
                MusicOwner musicOwner = (MusicOwner) obj;
                Iterator it = w060Var.O0((CatalogExtendedData) this.f, ((CatalogBlock) this.e).j, bi20Var).iterator();
                while (true) {
                    if (it.hasNext()) {
                        uIBlockActionSwitchAccount = it.next();
                        if (((UIBlockAction) uIBlockActionSwitchAccount) instanceof UIBlockActionSwitchAccount) {
                        }
                    } else {
                        uIBlockActionSwitchAccount = 0;
                    }
                }
                return new UIBlockMusicOwner(bi20Var.b(), bi20Var.o, musicOwner, uIBlockActionSwitchAccount instanceof UIBlockActionSwitchAccount ? uIBlockActionSwitchAccount : null);
        }
    }
}
