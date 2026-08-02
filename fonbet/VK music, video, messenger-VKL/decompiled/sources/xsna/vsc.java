package xsna;

import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipVideoAttachmentSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.ClipEditSdkFeatures;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.util.ClipChangedValue;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import xsna.htc;
import xsna.usc;
import xsna.ysc;
import xsna.zsc;

/* compiled from: ClipEditSdkMviActor.kt */
/* loaded from: classes17.dex */
public final class vsc extends al50<ClipEditSdkMviState, usc, on50, htc, zsc, ysc> {
    public final Set<ClipEditSdkFeatures> c;

    /* compiled from: ClipEditSdkMviActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditCoauthorsState.Enabled.InactiveReason.values().length];
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithoutCoauthors.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithCoauthors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithoutCoauthors.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithCoauthors.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedClip.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.LoadingInfo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vsc(sj50<ClipEditSdkMviState, on50, htc, zsc, ysc> sj50Var, Set<? extends ClipEditSdkFeatures> set) {
        super(sj50Var);
        this.c = set;
    }

    @Override // xsna.al50, xsna.qj50
    public final boolean i(lj50 lj50Var) {
        return !((ClipEditSdkMviState) this.b.getCurrentState()).j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        String str;
        Set set;
        usc uscVar = (usc) lj50Var;
        boolean z = uscVar instanceof usc.b;
        Set<ClipEditSdkFeatures> set2 = this.c;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (!z) {
            if (!(uscVar instanceof usc.a)) {
                throw new NoWhenBranchMatchedException();
            }
            usc.a aVar = (usc.a) uscVar;
            if (aVar instanceof usc.a.c) {
                e(new zsc.m(((usc.a.c) aVar).b));
                return;
            }
            if (aVar instanceof usc.a.e) {
                e(new zsc.l(((usc.a.e) aVar).b));
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            if (aVar instanceof usc.a.d) {
                e(new zsc.p(((usc.a.d) aVar).b));
                return;
            }
            if (aVar instanceof usc.a.f) {
                e(new zsc.q(((usc.a.f) aVar).b));
                return;
            }
            if (aVar instanceof usc.a.b) {
                e(new zsc.j(new ClipsEditCoauthorsState.Enabled(((usc.a.b) aVar).b, set2.contains(ClipEditSdkFeatures.CoauthorsRedesign), null)));
                return;
            } else {
                if (!(aVar instanceof usc.a.C3818a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(new zsc.n(!((usc.a.C3818a) aVar).b));
                e(new zsc.k(oad.a((ClipEditSdkMviState) sj50Var.getCurrentState())));
                return;
            }
        }
        usc.b bVar = (usc.b) uscVar;
        boolean f = epx.f(bVar, usc.b.C3821b.b);
        ClipEditVideoAttachState.Empty empty = ClipEditVideoAttachState.Empty.b;
        ClipEditVideoAttachState.Disabled disabled = ClipEditVideoAttachState.Disabled.b;
        if (f) {
            ClipEditSdkMviState clipEditSdkMviState = (ClipEditSdkMviState) sj50Var.getCurrentState();
            ImmutableClipState immutableClipState = clipEditSdkMviState.i;
            SetBuilder setBuilder = new SetBuilder();
            if (!epx.f(clipEditSdkMviState.b, immutableClipState.e)) {
                setBuilder.add(ClipChangedValue.DESCRIPTION);
            }
            ClipEditVideoAttachState clipEditVideoAttachState = clipEditSdkMviState.e;
            if (epx.f(clipEditVideoAttachState, disabled) || epx.f(clipEditVideoAttachState, empty)) {
                str = null;
            } else if (clipEditVideoAttachState instanceof ClipEditVideoAttachState.Loading) {
                str = ((ClipEditVideoAttachState.Loading) clipEditVideoAttachState).b;
            } else {
                if (!(clipEditVideoAttachState instanceof ClipEditVideoAttachState.Selected)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ClipEditVideoAttachState.Selected) clipEditVideoAttachState).e;
            }
            ImmutableClipState.AttachedVideo attachedVideo = immutableClipState.l;
            if (!epx.f(str, attachedVideo != null ? attachedVideo.getId() : null)) {
                setBuilder.add(ClipChangedValue.ATTACHED_VIDEO);
            }
            if (clipEditSdkMviState.c.length() > 0) {
                setBuilder.add(ClipChangedValue.PREVIEW);
            }
            if (clipEditSdkMviState.d != null) {
                setBuilder.add(ClipChangedValue.ADS_INFO);
            }
            ClipsEditCoauthorsState clipsEditCoauthorsState = clipEditSdkMviState.f;
            ClipsEditCoauthorsState.Enabled enabled = clipsEditCoauthorsState instanceof ClipsEditCoauthorsState.Enabled ? (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState : null;
            if (enabled != null) {
                List<ClipCoauthorSdkItem> list = enabled.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ClipCoauthorSdkItem) it.next()).b);
                }
                set = j5g.S0(arrayList);
            } else {
                set = null;
            }
            if (!epx.f(set, j5g.S0(immutableClipState.m))) {
                setBuilder.add(ClipChangedValue.COOWNERS);
            }
            SetBuilder d = setBuilder.d();
            if (!d.isEmpty()) {
                ClipsEditCoauthorsState clipsEditCoauthorsState2 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).f;
                ClipsEditCoauthorsState.Enabled enabled2 = clipsEditCoauthorsState2 instanceof ClipsEditCoauthorsState.Enabled ? (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState2 : null;
                if (enabled2 != null) {
                    List<ClipCoauthorSdkItem> list2 = enabled2.b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((ClipCoauthorSdkItem) it2.next()).f) {
                                if (!d.isEmpty()) {
                                    Iterator it3 = d.iterator();
                                    while (((MapBuilder.d) it3).hasNext()) {
                                        if (((ClipChangedValue) ((MapBuilder.e) it3).next()) != ClipChangedValue.COOWNERS) {
                                            e(zsc.g.a);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a(new htc.e(d));
            return;
        }
        if (epx.f(bVar, usc.b.c.b)) {
            c(ysc.g.a);
            return;
        }
        if (epx.f(bVar, usc.b.d.b)) {
            c(ysc.c.a);
            return;
        }
        if (epx.f(bVar, usc.b.e.b)) {
            c(new ysc.d(((ClipEditSdkMviState) sj50Var.getCurrentState()).b));
            return;
        }
        if (epx.f(bVar, usc.b.h.b)) {
            e(zsc.b.a);
            return;
        }
        if (epx.f(bVar, usc.b.f.b)) {
            c(new ysc.e(((ClipEditSdkMviState) sj50Var.getCurrentState()).d));
            return;
        }
        if (bVar instanceof usc.b.i) {
            usc.b.i iVar = (usc.b.i) bVar;
            if (iVar instanceof usc.b.i.c) {
                ClipEditVideoAttachState clipEditVideoAttachState2 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).e;
                if (epx.f(clipEditVideoAttachState2, disabled) || (clipEditVideoAttachState2 instanceof ClipEditVideoAttachState.Loading)) {
                    return;
                }
                if (epx.f(clipEditVideoAttachState2, empty)) {
                    c(new ysc.f(new ClipVideoAttachmentSdkItem(((ClipEditSdkMviState) sj50Var.getCurrentState()).i.c, "", null, null, null)));
                    return;
                } else {
                    if (!(clipEditVideoAttachState2 instanceof ClipEditVideoAttachState.Selected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipEditVideoAttachState.Selected selected = (ClipEditVideoAttachState.Selected) clipEditVideoAttachState2;
                    c(new ysc.f(new ClipVideoAttachmentSdkItem(selected.d, selected.e, selected.c, selected.b, selected.f)));
                    return;
                }
            }
            if (!(iVar instanceof usc.b.i.d)) {
                if (epx.f(iVar, usc.b.i.a.b)) {
                    e(zsc.d.a);
                    return;
                } else {
                    if (!epx.f(iVar, usc.b.i.C3822b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e(new zsc.q(null));
                    e(zsc.d.a);
                    return;
                }
            }
            ClipEditVideoAttachState clipEditVideoAttachState3 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).e;
            if (clipEditVideoAttachState3 instanceof ClipEditVideoAttachState.Selected) {
                ImmutableClipState.AttachedVideo attachedVideo2 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).i.l;
                if ((attachedVideo2 != null ? attachedVideo2.getId() : null) != null) {
                    ImmutableClipState.AttachedVideo attachedVideo3 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).i.l;
                    if (epx.f(attachedVideo3 != null ? attachedVideo3.getId() : null, ((ClipEditVideoAttachState.Selected) clipEditVideoAttachState3).e)) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!(bVar instanceof usc.b.a)) {
            if (!(bVar instanceof usc.b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            e(new zsc.m(((ClipEditSdkMviState) sj50Var.getCurrentState()).b + ' ' + ((usc.b.g) bVar).b));
            return;
        }
        usc.b.a aVar2 = (usc.b.a) bVar;
        if (epx.f(aVar2, usc.b.a.C3819a.b)) {
            if ((((ClipEditSdkMviState) sj50Var.getCurrentState()).f instanceof ClipsEditCoauthorsState.Enabled) && ((ClipsEditCoauthorsState.Enabled) ((ClipEditSdkMviState) sj50Var.getCurrentState()).f).d == null) {
                c(new ysc.b(((ClipEditSdkMviState) sj50Var.getCurrentState()).i.c, Integer.parseInt(((ClipEditSdkMviState) sj50Var.getCurrentState()).i.b), ((ClipsEditCoauthorsState.Enabled) ((ClipEditSdkMviState) sj50Var.getCurrentState()).f).b));
                return;
            }
            return;
        }
        if (epx.f(aVar2, usc.b.a.C3820b.b)) {
            e(new zsc.j(new ClipsEditCoauthorsState.Enabled(EmptyList.b, set2.contains(ClipEditSdkFeatures.CoauthorsRedesign), null)));
            return;
        }
        if (!epx.f(aVar2, usc.b.a.e.b)) {
            if (epx.f(aVar2, usc.b.a.c.b)) {
                e(zsc.a.a);
                a(new htc.e(EmptySet.b));
                return;
            } else {
                if (!epx.f(aVar2, usc.b.a.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(zsc.a.a);
                return;
            }
        }
        ClipsEditCoauthorsState clipsEditCoauthorsState3 = ((ClipEditSdkMviState) sj50Var.getCurrentState()).f;
        ClipsEditCoauthorsState.Enabled enabled3 = clipsEditCoauthorsState3 instanceof ClipsEditCoauthorsState.Enabled ? (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState3 : null;
        ClipsEditCoauthorsState.Enabled.InactiveReason inactiveReason = enabled3 != null ? enabled3.d : null;
        switch (inactiveReason == null ? -1 : a.$EnumSwitchMapping$0[inactiveReason.ordinal()]) {
            case -1:
            case 6:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                a(htc.d.b);
                return;
            case 5:
                c(new ysc.a());
                return;
        }
    }
}
