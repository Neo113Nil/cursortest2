package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.s2r;

/* compiled from: ExploreTabPreloader.kt */
/* loaded from: classes.dex */
public final class gaq implements lz50 {
    public io.reactivex.rxjava3.disposables.c a;

    @Override // xsna.lz50
    public final void a() {
        boolean z;
        io.reactivex.rxjava3.core.q L;
        q1n q1nVar = new q1n(new y2n(0));
        io.reactivex.rxjava3.disposables.c cVar = this.a;
        if (cVar != null) {
            cVar.dispose();
        }
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        DiscoverId a = m3n.a();
        if (DiscoverNewsEntriesRepository.c.contains(a)) {
            z = false;
        } else {
            s2r G = o25.a().G();
            if (G == null) {
                G = s2r.a.a();
            }
            int i = DiscoverNewsEntriesRepository.a.$EnumSwitchMapping$0[a.d().ordinal()];
            z = true;
            if (i == 1) {
                z = G.a().a();
            } else if (i == 2) {
                z = G.b().a();
            }
        }
        io.reactivex.rxjava3.disposables.c cVar2 = null;
        if (z) {
            m6o0 m6o0Var = new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA);
            DiscoverNewsEntriesRepository.e.getClass();
            L = q1nVar.b(a).L(new iu4(new dta(q1nVar, a, m6o0Var, new bwq(), 1), 10), false);
        } else {
            L = null;
        }
        if (L != null) {
            int i2 = kwg0.a;
            cVar2 = L.subscribe(new iwg0());
        }
        this.a = cVar2;
    }

    @Override // xsna.lz50
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.a;
        if (cVar != null) {
            cVar.dispose();
        }
        this.a = null;
    }
}
