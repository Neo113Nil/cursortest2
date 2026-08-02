package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.h5c0;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.t5c0;

/* compiled from: PostCoownershipMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class p1c0 extends evg0<m5c0, on50, t5c0.a, t5c0, h5c0, d5c0> {
    public final qn60 f;
    public final pn60 g;

    public p1c0(es60 es60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = es60Var.a;
        this.g = es60Var.b;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        List<NewsfeedCoowners.CoownerRequest> list;
        List<NewsfeedCoowners.CoownerRequest> list2;
        t5c0.a aVar = (t5c0.a) hn50Var;
        boolean z = aVar instanceof t5c0.a.c;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (z) {
            NewsEntry newsEntry = ((m5c0) nn50Var.getCurrentState()).i;
            if (epx.f(newsEntry, ((t5c0.a.c) aVar).b) && (newsEntry instanceof Post)) {
                Post post = (Post) newsEntry;
                NewsfeedCoowners newsfeedCoowners = post.f0;
                CoownershipStatusUiDto coownershipStatusUiDto = !(((newsfeedCoowners == null || (list2 = newsfeedCoowners.g) == null) ? 0 : list2.size()) >= 2) ? CoownershipStatusUiDto.Rejected : CoownershipStatusUiDto.None;
                NewsfeedCoowners newsfeedCoowners2 = post.f0;
                s(post, coownershipStatusUiDto, newsfeedCoowners2 != null ? newsfeedCoowners2.g : null);
            }
        } else if (aVar instanceof t5c0.a.C3720a) {
            NewsEntry newsEntry2 = ((m5c0) nn50Var.getCurrentState()).i;
            if (epx.f(newsEntry2, ((t5c0.a.C3720a) aVar).b) && (newsEntry2 instanceof Post)) {
                Post post2 = (Post) newsEntry2;
                NewsfeedCoowners newsfeedCoowners3 = post2.f0;
                CoownershipStatusUiDto coownershipStatusUiDto2 = !(((newsfeedCoowners3 == null || (list = newsfeedCoowners3.g) == null) ? 0 : list.size()) >= 2) ? CoownershipStatusUiDto.Approved : CoownershipStatusUiDto.None;
                NewsfeedCoowners newsfeedCoowners4 = post2.f0;
                s(post2, coownershipStatusUiDto2, newsfeedCoowners4 != null ? newsfeedCoowners4.g : null);
            }
        } else {
            if (!(aVar instanceof t5c0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            NewsEntry newsEntry3 = ((m5c0) nn50Var.getCurrentState()).i;
            if (epx.f(newsEntry3, ((t5c0.a.b) aVar).b) && (newsEntry3 instanceof Post)) {
                s((Post) newsEntry3, CoownershipStatusUiDto.Closed, null);
            }
        }
        return null;
    }

    public final void s(Post post, CoownershipStatusUiDto coownershipStatusUiDto, List list) {
        e(new h5c0.a.C2973a(coownershipStatusUiDto, list));
        Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(this.f.f(new a8q0(post, list, coownershipStatusUiDto, this.g)));
        if (!(b instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) b;
            this.b.e(new j5c0(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a = Result.a(b);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
    }
}
