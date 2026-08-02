package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: UserProfileWallPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class axq0 implements izs<List<? extends NewsEntry>, s3q0> {
    public final /* synthetic */ zwq0 b;

    public axq0(zwq0 zwq0Var) {
        this.b = zwq0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<? extends NewsEntry> list) {
        zwq0 zwq0Var = this.b;
        zwq0Var.t();
        super/*com.vk.newsfeed.impl.presenters.EntriesListPresenter*/.U(list, false);
        return s3q0.a;
    }
}
