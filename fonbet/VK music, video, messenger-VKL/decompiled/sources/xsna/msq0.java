package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: UserProfileMainWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class msq0 implements izs<List<? extends NewsEntry>, s3q0> {
    public final /* synthetic */ lsq0 b;

    public msq0(lsq0 lsq0Var) {
        this.b = lsq0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<? extends NewsEntry> list) {
        lsq0 lsq0Var = this.b;
        lsq0Var.t();
        super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.U(list, false);
        return s3q0.a;
    }
}
