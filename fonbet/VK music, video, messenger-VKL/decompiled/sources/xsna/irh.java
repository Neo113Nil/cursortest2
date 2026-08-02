package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: CommunityProfileMainWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class irh implements izs<List<? extends NewsEntry>, s3q0> {
    public final /* synthetic */ hrh b;
    public final /* synthetic */ boolean c;

    public irh(hrh hrhVar, boolean z) {
        this.b = hrhVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<? extends NewsEntry> list) {
        hrh hrhVar = this.b;
        super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.t();
        super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.U(list, false);
        if (this.c) {
            hrhVar.f0();
        }
        return s3q0.a;
    }
}
