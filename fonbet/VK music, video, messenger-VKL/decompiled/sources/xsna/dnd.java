package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: ClipsCoauthorsSelectorReducer.kt */
/* loaded from: classes16.dex */
public final class dnd extends dm50<gnd, ClipsCoauthorsSelectorPatch, ClipsCoauthorsSelectorMviState> {
    public final bpn0 d;

    public dnd() {
        super(ClipsCoauthorsSelectorMviState.b.b);
        this.d = new bpn0(new jb(6));
    }

    @Override // xsna.dm50
    public final ClipsCoauthorsSelectorMviState c(ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState, ClipsCoauthorsSelectorPatch clipsCoauthorsSelectorPatch) {
        ClipsCoauthorsSelectorMviState.c.a aVar;
        Object obj;
        LinkedHashSet<ClipsCoauthorSelectorUserItem> k;
        Object obj2;
        ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState2 = clipsCoauthorsSelectorMviState;
        ClipsCoauthorsSelectorPatch clipsCoauthorsSelectorPatch2 = clipsCoauthorsSelectorPatch;
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.d) {
            ClipsCoauthorsSelectorPatch.d dVar = (ClipsCoauthorsSelectorPatch.d) clipsCoauthorsSelectorPatch2;
            return new ClipsCoauthorsSelectorMviState.d("", dVar.b, dVar.e, dVar.c, dVar.d);
        }
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.c) {
            ClipsCoauthorsSelectorPatch.c cVar = (ClipsCoauthorsSelectorPatch.c) clipsCoauthorsSelectorPatch2;
            return new ClipsCoauthorsSelectorMviState.c("", cVar.b, cVar.d, cVar.e, cVar.f, cVar.c, clipsCoauthorsSelectorMviState2.j(), 448);
        }
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.b) {
            ClipsCoauthorsException clipsCoauthorsException = ((ClipsCoauthorsSelectorPatch.b) clipsCoauthorsSelectorPatch2).b;
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                ClipsCoauthorsSelectorMviState.c cVar2 = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.a(cVar2.b, cVar2.c, cVar2.d, cVar2.e, clipsCoauthorsException, cVar2.k);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) {
                return ClipsCoauthorsSelectorMviState.a.a((ClipsCoauthorsSelectorMviState.a) clipsCoauthorsSelectorMviState2, null, clipsCoauthorsException, 47);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.d) {
                ClipsCoauthorsSelectorMviState.d dVar2 = (ClipsCoauthorsSelectorMviState.d) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.a(dVar2.b, dVar2.c, dVar2.d, dVar2.e, clipsCoauthorsException, dVar2.f);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.b) {
                return new ClipsCoauthorsSelectorMviState.a("", ClipsCoauthorsSelectorMviState.b.e, ClipsCoauthorsSelectorMviState.b.f, false, clipsCoauthorsException, ClipsCoauthorsSelectorMviState.b.c);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.h) {
            String str = ((ClipsCoauthorsSelectorPatch.h) clipsCoauthorsSelectorPatch2).b;
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) {
                ClipsCoauthorsSelectorMviState.a aVar2 = (ClipsCoauthorsSelectorMviState.a) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.d(str, aVar2.c, aVar2.d, aVar2.e, aVar2.g);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                ClipsCoauthorsSelectorMviState.c cVar3 = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.d(str, cVar3.c, cVar3.d, cVar3.e, cVar3.k);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.d) {
                return ClipsCoauthorsSelectorMviState.d.a((ClipsCoauthorsSelectorMviState.d) clipsCoauthorsSelectorMviState2, str, null, 30);
            }
            if (!epx.f(clipsCoauthorsSelectorMviState2, ClipsCoauthorsSelectorMviState.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.E();
            return new ClipsCoauthorsSelectorMviState.d(clipsCoauthorsSelectorMviState2.n(), clipsCoauthorsSelectorMviState2.u(), clipsCoauthorsSelectorMviState2.C(), clipsCoauthorsSelectorMviState2.l(), clipsCoauthorsSelectorMviState2.j());
        }
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.e) {
            ClipsCoauthorsSelectorPatch.e eVar = (ClipsCoauthorsSelectorPatch.e) clipsCoauthorsSelectorPatch2;
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) {
                ClipsCoauthorsSelectorMviState.a aVar3 = (ClipsCoauthorsSelectorMviState.a) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.c(aVar3.b, aVar3.c, aVar3.d, aVar3.e, eVar.c, eVar.b, aVar3.g, 384);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                return ClipsCoauthorsSelectorMviState.c.a((ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2, null, 0, eVar.b, null, false, 927);
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.d) {
                ClipsCoauthorsSelectorMviState.d dVar3 = (ClipsCoauthorsSelectorMviState.d) clipsCoauthorsSelectorMviState2;
                return new ClipsCoauthorsSelectorMviState.c(dVar3.b, dVar3.c, dVar3.d, dVar3.e, eVar.c, eVar.b, dVar3.f, 384);
            }
            if (epx.f(clipsCoauthorsSelectorMviState2, ClipsCoauthorsSelectorMviState.b.b)) {
                return new ClipsCoauthorsSelectorMviState.c("", EmptySet.b, clipsCoauthorsSelectorMviState2.C(), clipsCoauthorsSelectorMviState2.l(), eVar.c, eVar.b, clipsCoauthorsSelectorMviState2.j(), 384);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.g) {
            ClipsCoauthorsSelectorPatch.g gVar = (ClipsCoauthorsSelectorPatch.g) clipsCoauthorsSelectorPatch2;
            return new ClipsCoauthorsSelectorMviState.c("", clipsCoauthorsSelectorMviState2.u(), clipsCoauthorsSelectorMviState2.C(), clipsCoauthorsSelectorMviState2.l(), gVar.b.size(), gVar.b, clipsCoauthorsSelectorMviState2.j(), 448);
        }
        if (!(clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.ChangeUserSelection)) {
            if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.a) {
                ClipsCoauthorsSelectorPatch.a aVar4 = (ClipsCoauthorsSelectorPatch.a) clipsCoauthorsSelectorPatch2;
                if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                    ClipsCoauthorsSelectorMviState.c cVar4 = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
                    if (epx.f(aVar4, ClipsCoauthorsSelectorPatch.a.C0554a.b)) {
                        aVar = ClipsCoauthorsSelectorMviState.c.a.C0552a.a;
                    } else if (epx.f(aVar4, ClipsCoauthorsSelectorPatch.a.b.b)) {
                        aVar = ClipsCoauthorsSelectorMviState.c.a.b.a;
                    } else if (epx.f(aVar4, ClipsCoauthorsSelectorPatch.a.c.b)) {
                        aVar = ClipsCoauthorsSelectorMviState.c.a.d.a;
                    } else {
                        if (!epx.f(aVar4, ClipsCoauthorsSelectorPatch.a.d.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = ClipsCoauthorsSelectorMviState.c.a.C0553c.a;
                    }
                    return ClipsCoauthorsSelectorMviState.c.a(cVar4, null, 0, null, aVar, false, 895);
                }
            } else if (clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.i) {
                ClipsCoauthorsSelectorPatch.i iVar = (ClipsCoauthorsSelectorPatch.i) clipsCoauthorsSelectorPatch2;
                if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                    ClipsCoauthorsSelectorMviState.c cVar5 = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
                    List<ClipsCoauthorSelectorUserItem> list = cVar5.g;
                    ArrayList u0 = j5g.u0(iVar.b, list);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (hashSet.add(((ClipsCoauthorSelectorUserItem) next).b)) {
                            arrayList.add(next);
                        }
                    }
                    return ClipsCoauthorsSelectorMviState.c.a(cVar5, null, arrayList.size() == list.size() ? 0 : cVar5.f, arrayList, null, false, 719);
                }
            } else {
                if (!(clipsCoauthorsSelectorPatch2 instanceof ClipsCoauthorsSelectorPatch.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                    return ClipsCoauthorsSelectorMviState.c.a((ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2, null, 0, null, null, true, 767);
                }
            }
            return clipsCoauthorsSelectorMviState2;
        }
        ClipsCoauthorsSelectorPatch.ChangeUserSelection changeUserSelection = (ClipsCoauthorsSelectorPatch.ChangeUserSelection) clipsCoauthorsSelectorPatch2;
        boolean z = clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c;
        Iterable iterable = z ? ((ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2).g : EmptyList.b;
        ClipsCoauthorsSelectorPatch.ChangeUserSelection.Action action = changeUserSelection.c;
        UserId userId = changeUserSelection.b;
        if (action == ClipsCoauthorsSelectorPatch.ChangeUserSelection.Action.Remove) {
            Set<ClipsCoauthorSelectorUserItem> u = clipsCoauthorsSelectorMviState2.u();
            Iterator<T> it2 = clipsCoauthorsSelectorMviState2.u().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((ClipsCoauthorSelectorUserItem) obj2).b.equals(userId)) {
                    break;
                }
            }
            k = izi0.f(u, obj2);
        } else {
            Set<ClipsCoauthorSelectorUserItem> u2 = clipsCoauthorsSelectorMviState2.u();
            Iterator it3 = iterable.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((ClipsCoauthorSelectorUserItem) obj).b.equals(userId)) {
                    break;
                }
            }
            k = izi0.k(u2, obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : k) {
            if (clipsCoauthorSelectorUserItem != null) {
                arrayList2.add(clipsCoauthorSelectorUserItem);
            }
        }
        Set S0 = j5g.S0(arrayList2);
        if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) {
            return ClipsCoauthorsSelectorMviState.a.a((ClipsCoauthorsSelectorMviState.a) clipsCoauthorsSelectorMviState2, S0, null, 61);
        }
        if (z) {
            return ClipsCoauthorsSelectorMviState.c.a((ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2, S0, 0, null, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
        }
        if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.d) {
            return ClipsCoauthorsSelectorMviState.d.a((ClipsCoauthorsSelectorMviState.d) clipsCoauthorsSelectorMviState2, null, S0, 29);
        }
        if (!epx.f(clipsCoauthorsSelectorMviState2, ClipsCoauthorsSelectorMviState.b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rdi.E();
        return clipsCoauthorsSelectorMviState2;
    }

    @Override // xsna.dm50
    public final gnd d() {
        return new gnd(e(new hb(this, 26)), e(new com.vk.movika.sdk.base.observable.c(this, 25)), e(new go1(this, 21)), e(new bz(8)));
    }

    @Override // xsna.dm50
    public final void h(ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState, gnd gndVar) {
        ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState2 = clipsCoauthorsSelectorMviState;
        gnd gndVar2 = gndVar;
        if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) {
            f(gndVar2.b, clipsCoauthorsSelectorMviState2);
            return;
        }
        if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
            f(gndVar2.c, clipsCoauthorsSelectorMviState2);
        } else if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.d) {
            f(gndVar2.a, clipsCoauthorsSelectorMviState2);
        } else {
            if (!(clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(gndVar2.d, clipsCoauthorsSelectorMviState2);
        }
    }
}
