package xsna;

import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectInputModel;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ClipsFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.end;
import xsna.lgj0;
import xsna.vmd;

/* compiled from: ClipsCoauthorsSelectorFeature.kt */
/* loaded from: classes16.dex */
public final class bnd extends wk50<gnd, ClipsCoauthorsSelectorMviState, vmd, ClipsCoauthorsSelectorPatch> {
    public static final /* synthetic */ qcy<Object>[] k;
    public final qmd f;
    public final boolean g;
    public final f4z h;
    public final ClipsCoauthorsSelectorInputParams.ImmediateSave i;
    public final pgn j;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(bnd.class, "searchCoauthorDisposable", "getSearchCoauthorDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        k = new qcy[]{mutablePropertyReference1Impl};
    }

    public bnd(ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams, qmd qmdVar) {
        super(new vmd.a(clipsCoauthorsSelectorInputParams), new dnd());
        boolean z;
        this.f = qmdVar;
        if (BuildInfo.q()) {
            ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
            clipsFeatures.getClass();
            if (com.vk.toggle.b.A.a(clipsFeatures)) {
                z = true;
                this.g = z;
                this.h = new f4z();
                this.i = clipsCoauthorsSelectorInputParams.h;
                this.j = new pgn();
            }
        }
        z = false;
        this.g = z;
        this.h = new f4z();
        this.i = clipsCoauthorsSelectorInputParams.h;
        this.j = new pgn();
    }

    @Override // xsna.wk50
    public final void N(ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState, vmd vmdVar) {
        ClipsCoauthorsSelectorMviState.Consumer clips;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState2 = clipsCoauthorsSelectorMviState;
        vmd vmdVar2 = vmdVar;
        boolean z = vmdVar2 instanceof vmd.a;
        boolean z2 = this.g;
        qmd qmdVar = this.f;
        boolean z3 = false;
        if (z) {
            ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams = ((vmd.a) vmdVar2).b;
            ClipsCoauthorsSelectorInputParams.OpenFrom openFrom = clipsCoauthorsSelectorInputParams.i;
            UserId userId = clipsCoauthorsSelectorInputParams.f;
            if (openFrom instanceof ClipsCoauthorsSelectorInputParams.OpenFrom.Clips) {
                Integer num = ((ClipsCoauthorsSelectorInputParams.OpenFrom.Clips) openFrom).b;
                MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = new MobileOfficialAppsClipsStat$TypeClipsClipItem(num != null ? num.intValue() : 0, userId.b, null, 4, null);
                UiTrackingScreen b = UiTracker.j.b();
                if (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                }
                new god(mobileOfficialAppsCoreNavStat$EventScreen, new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.OPEN_MODAL_COOWNERS, new MobileOfficialAppsClipsStat$TypeClipsClipItem(mobileOfficialAppsClipsStat$TypeClipsClipItem.a(), mobileOfficialAppsClipsStat$TypeClipsClipItem.b(), null, 4, null))).q();
            }
            Set<ClipsCoauthorsSelectInputModel> set = clipsCoauthorsSelectorInputParams.c;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.clips.coauthors.domain.model.a.a((ClipsCoauthorsSelectInputModel) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((ClipsCoauthorSelectorUserItem) next).b.equals(userId)) {
                    arrayList2.add(next);
                }
            }
            Set S0 = j5g.S0(arrayList2);
            boolean z4 = clipsCoauthorsSelectorInputParams.g;
            ClipsCoauthorsSelectorInputParams.OpenFrom openFrom2 = clipsCoauthorsSelectorInputParams.i;
            if (openFrom2 instanceof ClipsCoauthorsSelectorInputParams.OpenFrom.Posting) {
                clips = ClipsCoauthorsSelectorMviState.Consumer.Posting.b;
            } else {
                if (!(openFrom2 instanceof ClipsCoauthorsSelectorInputParams.OpenFrom.Clips)) {
                    throw new NoWhenBranchMatchedException();
                }
                clips = new ClipsCoauthorsSelectorMviState.Consumer.Clips(((ClipsCoauthorsSelectorInputParams.OpenFrom.Clips) openFrom2).b);
            }
            T(new ClipsCoauthorsSelectorPatch.d(S0, z4, clips, userId));
            a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(new io.reactivex.rxjava3.internal.operators.single.d0(qmdVar.a(0, "", z2), new eq(5), null), io.reactivex.rxjava3.core.x.t(300L, TimeUnit.MILLISECONDS), new fq(8, new k8d((byte) 0, 1))), new sf4(2, this, clipsCoauthorsSelectorInputParams), null, 5);
            return;
        }
        if (vmdVar2 instanceof vmd.c) {
            String str = ((vmd.c) vmdVar2).b;
            T(new ClipsCoauthorsSelectorPatch.h(str));
            io.reactivex.rxjava3.disposables.c i = hg1.i(new io.reactivex.rxjava3.internal.operators.single.d0(qmdVar.a(0, str, z2), new hq(7), null), new jy5(str, this, clipsCoauthorsSelectorMviState2, 2));
            qcy<Object> qcyVar = k[0];
            this.j.b(i);
            return;
        }
        if (vmdVar2 instanceof vmd.d) {
            C(new vmd.c(""));
            return;
        }
        boolean z5 = vmdVar2 instanceof vmd.f;
        f4z f4zVar = this.h;
        if (z5) {
            if ((clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.a) && (((ClipsCoauthorsSelectorMviState.a) clipsCoauthorsSelectorMviState2).f instanceof ClipsCoauthorsException.CoauthorsEmptyResponseException)) {
                z3 = true;
            }
            if ((clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) || z3) {
                ClipsCoauthorsSelectorInputParams.ImmediateSave immediateSave = this.i;
                if (!(immediateSave instanceof ClipsCoauthorsSelectorInputParams.ImmediateSave.Enabled)) {
                    f4zVar.b(new end.b(clipsCoauthorsSelectorMviState2.u()));
                    return;
                }
                T(ClipsCoauthorsSelectorPatch.a.d.b);
                UserId C = clipsCoauthorsSelectorMviState2.C();
                int i2 = ((ClipsCoauthorsSelectorInputParams.ImmediateSave.Enabled) immediateSave).b;
                Set<ClipsCoauthorSelectorUserItem> u = clipsCoauthorsSelectorMviState2.u();
                ArrayList arrayList3 = new ArrayList(c5g.u(u, 10));
                Iterator<T> it3 = u.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ClipsCoauthorSelectorUserItem) it3.next()).b);
                }
                a7f0.a.f(this, rsg0.W(yfb.x(lgj0.a.b((mgj0) qmdVar.b.getValue(), C, i2, null, null, null, null, null, null, arrayList3, null, 30716)), 7), new g60(this, 26), new dsc(this, 4), 1);
                return;
            }
            return;
        }
        if (vmdVar2 instanceof vmd.e) {
            UserId userId2 = ((vmd.e) vmdVar2).b;
            if (!(clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c)) {
                rdi.E();
            }
            Set<ClipsCoauthorSelectorUserItem> u2 = clipsCoauthorsSelectorMviState2.u();
            if (!(u2 instanceof Collection) || !u2.isEmpty()) {
                Iterator<T> it4 = u2.iterator();
                while (it4.hasNext()) {
                    if (((ClipsCoauthorSelectorUserItem) it4.next()).b.equals(userId2)) {
                        T(new ClipsCoauthorsSelectorPatch.ChangeUserSelection(userId2, ClipsCoauthorsSelectorPatch.ChangeUserSelection.Action.Remove));
                        return;
                    }
                }
            }
            if (clipsCoauthorsSelectorMviState2.u().size() < 4) {
                T(new ClipsCoauthorsSelectorPatch.ChangeUserSelection(userId2, ClipsCoauthorsSelectorPatch.ChangeUserSelection.Action.Add));
                return;
            } else {
                f4zVar.b(end.c.a);
                return;
            }
        }
        if (vmdVar2 instanceof vmd.h) {
            T(new ClipsCoauthorsSelectorPatch.ChangeUserSelection(((vmd.h) vmdVar2).b, ClipsCoauthorsSelectorPatch.ChangeUserSelection.Action.Remove));
            return;
        }
        if (vmdVar2 instanceof vmd.b) {
            f4zVar.b(end.a.a);
            return;
        }
        if (!(vmdVar2 instanceof vmd.i)) {
            if (!(vmdVar2 instanceof vmd.g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
                T(ClipsCoauthorsSelectorPatch.f.b);
                ClipsCoauthorsSelectorMviState.c cVar = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.d0(qmdVar.a(cVar.g.size(), cVar.b, z2), new wp(7), null), new tm0(this, 25), null, 5);
                return;
            }
            return;
        }
        if (clipsCoauthorsSelectorMviState2 instanceof ClipsCoauthorsSelectorMviState.c) {
            ClipsCoauthorsSelectorMviState.c cVar2 = (ClipsCoauthorsSelectorMviState.c) clipsCoauthorsSelectorMviState2;
            ClipsCoauthorsSelectorMviState.c.a aVar = cVar2.i;
            if (aVar instanceof ClipsCoauthorsSelectorMviState.c.a.C0552a) {
                f4zVar.b(new end.b(cVar2.c));
            } else if (aVar instanceof ClipsCoauthorsSelectorMviState.c.a.b) {
                T(ClipsCoauthorsSelectorPatch.a.c.b);
            }
        }
    }
}
