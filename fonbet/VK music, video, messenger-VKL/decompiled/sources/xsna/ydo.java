package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.sdo;
import xsna.tdo;

/* compiled from: DraftsListInlineActor.kt */
/* loaded from: classes18.dex */
public final class ydo extends bl50<DraftsListState, sdo, on50, bwj, dwj, tdo> {
    public final zdo c;
    public final sj50<DraftsListState, on50, ll50<on50, bwj, dwj>, jl50<DraftsListState>, tdo> d;

    public ydo(zdo zdoVar, sj50<DraftsListState, on50, ll50<on50, bwj, dwj>, jl50<DraftsListState>, tdo> sj50Var) {
        super(sj50Var);
        this.c = zdoVar;
        this.d = sj50Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<DraftsListState, on50, ll50<on50, bwj, dwj>, jl50<DraftsListState>, tdo> W() {
        return this.d;
    }

    public final void m(int i, PostingCreationEntryPoint postingCreationEntryPoint) {
        Object obj;
        Iterator<T> it = ((DraftsListState) this.b.getCurrentState()).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Post) obj).n == i) {
                    break;
                }
            }
        }
        Post post = (Post) obj;
        if (post == null) {
            return;
        }
        zdo zdoVar = this.c;
        zdoVar.n0().c(-1, zdoVar.getContext(), post, postingCreationEntryPoint);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        Object obj;
        Object obj2;
        sdo sdoVar = (sdo) lj50Var;
        boolean z = sdoVar instanceof sdo.n;
        Object obj3 = null;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            if (((DraftsListState) sj50Var.getCurrentState()).d != DraftsListState.LoadingState.NOT_INITIALIZED) {
                return;
            }
            rdi.y(this, new nk(21));
            g3q.a(this, new wdo(this, new n1i(this, 3), null));
            return;
        }
        if ((sdoVar instanceof sdo.a) || (sdoVar instanceof sdo.p)) {
            c(tdo.a.a);
            return;
        }
        if (sdoVar.equals(sdo.c.b)) {
            c(tdo.a.a);
            return;
        }
        if (sdoVar.equals(sdo.l.b)) {
            rdi.y(this, new com.vk.movika.sdk.base.utils.b(22));
            g3q.a(this, new wdo(this, new bfm(this, 3), null));
            return;
        }
        if (sdoVar.equals(sdo.k.b)) {
            rdi.y(this, new gv3(22));
            g3q.a(this, new wdo(this, new tbg(this, 16), null));
            return;
        }
        if (sdoVar instanceof sdo.e) {
            m(((sdo.e) sdoVar).b, PostingCreationEntryPoint.ListEditDraft);
            return;
        }
        boolean z2 = sdoVar instanceof sdo.j;
        zdo zdoVar = this.c;
        if (z2) {
            int i = ((sdo.j) sdoVar).b;
            Iterator<T> it = ((DraftsListState) sj50Var.getCurrentState()).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((Post) obj2).n == i) {
                        break;
                    }
                }
            }
            Post post = (Post) obj2;
            if (post == null) {
                return;
            }
            UiTracker uiTracker = UiTracker.a;
            zdoVar.n0().G(zdoVar.getContext(), post, new z6c0(false, null, UiTracker.d(), 3), null);
            return;
        }
        if (sdoVar instanceof sdo.f) {
            m(((sdo.f) sdoVar).b, PostingCreationEntryPoint.ListEditDraftThreeDots);
            return;
        }
        if (sdoVar instanceof sdo.b) {
            sdo.b bVar = (sdo.b) sdoVar;
            int i2 = bVar.b;
            int i3 = bVar.c;
            Iterator<T> it2 = ((DraftsListState) sj50Var.getCurrentState()).c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((Post) obj).n == i2) {
                        break;
                    }
                }
            }
            Post post2 = (Post) obj;
            if (post2 == null) {
                return;
            }
            p4r b = zdoVar.b();
            MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.COPY_LINK;
            UserId userId = post2.m;
            Integer valueOf = Integer.valueOf(post2.n);
            String str = post2.L.b;
            Integer valueOf2 = Integer.valueOf(i3);
            b.getClass();
            p4r.d(action, userId, valueOf, str, valueOf2);
            zdoVar.n0().B(post2, null);
            return;
        }
        if (sdoVar instanceof sdo.d) {
            int i4 = ((sdo.d) sdoVar).b;
            Iterator<T> it3 = ((DraftsListState) sj50Var.getCurrentState()).c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((Post) next).n == i4) {
                    obj3 = next;
                    break;
                }
            }
            Post post3 = (Post) obj3;
            if (post3 == null) {
                return;
            }
            zdoVar.n0().d(zdoVar.getContext(), post3, false, MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_DELETE_DRAFT_THREE_DOTS);
            return;
        }
        if (sdoVar.equals(sdo.h.b)) {
            if (((DraftsListState) sj50Var.getCurrentState()).f || ((DraftsListState) sj50Var.getCurrentState()).d == DraftsListState.LoadingState.LOADING_PAGINATION || ((DraftsListState) sj50Var.getCurrentState()).d == DraftsListState.LoadingState.ERROR_PAGINATION) {
                return;
            }
            rdi.y(this, new z90(28));
            g3q.a(this, new xdo(this, null));
            return;
        }
        if (sdoVar.equals(sdo.m.b)) {
            if (((DraftsListState) sj50Var.getCurrentState()).f) {
                rdi.y(this, new wh6(23));
                return;
            } else {
                rdi.y(this, new l8k(5));
                g3q.a(this, new xdo(this, null));
                return;
            }
        }
        if (!(sdoVar instanceof sdo.g)) {
            if (sdoVar.equals(sdo.o.b)) {
                rdi.y(this, new tb4(22));
                return;
            } else {
                if (!sdoVar.equals(sdo.i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rdi.y(this, new pf(27));
                return;
            }
        }
        sdo.g gVar = (sdo.g) sdoVar;
        if (gVar instanceof sdo.g.a) {
            deo.a(this, ((sdo.g.a) gVar).b);
            return;
        }
        if (gVar instanceof sdo.g.b) {
            final int i5 = ((sdo.g.b) gVar).b;
            rdi.y(this, new izs() { // from class: xsna.ceo
                @Override // xsna.izs
                public final Object invoke(Object obj4) {
                    DraftsListState draftsListState = (DraftsListState) obj4;
                    return DraftsListState.a(draftsListState, deo.b(i5, draftsListState.c), null, 0, false, false, 61);
                }
            });
        } else {
            if (!(gVar instanceof sdo.g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            deo.a(this, ((sdo.g.c) gVar).b);
        }
    }
}
