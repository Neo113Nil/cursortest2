package xsna;

import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditChangedValue;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipEditItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import xsna.ajh0;
import xsna.usc;
import xsna.ysc;

/* compiled from: ClipEditSdkMviAnalyticsMiddleware.kt */
/* loaded from: classes17.dex */
public final class wsc implements h7f0<ClipEditSdkMviState, usc, on50, htc, zsc, ysc> {
    public final sl50<ClipEditSdkMviState, usc, on50, htc, zsc, ysc> b;
    public final irk0 c;
    public final bpn0 d = new bpn0(new zg(this, 23));

    public wsc(sl50<ClipEditSdkMviState, usc, on50, htc, zsc, ysc> sl50Var, irk0 irk0Var) {
        this.b = sl50Var;
        this.c = irk0Var;
    }

    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        buc bucVar;
        if (!(((usc) lj50Var) instanceof usc.b.g) || (bucVar = (buc) this.d.getValue()) == null) {
            return;
        }
        bucVar.a(ajh0.a.a);
    }

    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        String str;
        ysc yscVar = (ysc) pk50Var;
        boolean z = yscVar instanceof ysc.h;
        irk0 irk0Var = this.c;
        sl50<ClipEditSdkMviState, usc, on50, htc, zsc, ysc> sl50Var = this.b;
        if (!z) {
            if (!(yscVar instanceof ysc.f) || irk0Var == null) {
                return;
            }
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            ImmutableClipState immutableClipState = sl50Var.getCurrentState().i;
            new bjc(c, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, arm0.n(immutableClipState.b), Long.valueOf(immutableClipState.c.b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoToClipAttach(MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.TRY_TO_ATTACH_CLIP, MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_EDIT_CLIP_SECTION_CABINET, null, 4, null), 2), irk0Var).q();
            return;
        }
        if (irk0Var != null) {
            ClipEditSdkMviState currentState = sl50Var.getCurrentState();
            ImmutableClipState immutableClipState2 = currentState.i;
            SetBuilder setBuilder = new SetBuilder();
            if (!epx.f(currentState.b, immutableClipState2.e)) {
                setBuilder.add(MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_DESCRIPTION);
            }
            ClipEditVideoAttachState clipEditVideoAttachState = currentState.e;
            Set set = null;
            if (epx.f(clipEditVideoAttachState, ClipEditVideoAttachState.Disabled.b) || epx.f(clipEditVideoAttachState, ClipEditVideoAttachState.Empty.b)) {
                str = null;
            } else if (clipEditVideoAttachState instanceof ClipEditVideoAttachState.Loading) {
                str = ((ClipEditVideoAttachState.Loading) clipEditVideoAttachState).b;
            } else {
                if (!(clipEditVideoAttachState instanceof ClipEditVideoAttachState.Selected)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ClipEditVideoAttachState.Selected) clipEditVideoAttachState).e;
            }
            ImmutableClipState.AttachedVideo attachedVideo = immutableClipState2.l;
            if (!epx.f(str, attachedVideo != null ? attachedVideo.getId() : null)) {
                setBuilder.add(MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_ATTACHED_VIDEO);
            }
            if (currentState.c.length() > 0) {
                setBuilder.add(MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_PREVIEW);
            }
            if (currentState.d != null) {
                setBuilder.add(MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_ADS_INFO);
            }
            ClipsEditCoauthorsState clipsEditCoauthorsState = currentState.f;
            ClipsEditCoauthorsState.Enabled enabled = clipsEditCoauthorsState instanceof ClipsEditCoauthorsState.Enabled ? (ClipsEditCoauthorsState.Enabled) clipsEditCoauthorsState : null;
            if (enabled != null) {
                List<ClipCoauthorSdkItem> list = enabled.b;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ClipCoauthorSdkItem) it.next()).b);
                }
                set = j5g.S0(arrayList);
            }
            if (set == null) {
                set = EmptySet.b;
            }
            List<ClipCoauthorSdkItem> list2 = immutableClipState2.m;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ClipCoauthorSdkItem) it2.next()).b);
            }
            if (!epx.f(set, j5g.S0(arrayList2))) {
                setBuilder.add(MobileOfficialAppsClipsStat$TypeClipEditChangedValue.EDIT_COOWNERS);
            }
            SetBuilder d = setBuilder.d();
            UiTracker uiTracker2 = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            List O0 = j5g.O0(d);
            ImmutableClipState immutableClipState3 = sl50Var.getCurrentState().i;
            Integer m = arm0.m(10, immutableClipState3.b);
            new xee0(c2, O0, new MobileOfficialAppsClipsStat$TypeClipsClipItem(m != null ? m.intValue() : 0, immutableClipState3.c.b, immutableClipState3.n), MobileOfficialAppsClipsStat$TypeClipEditItem.EventType.CLIP_EDIT, irk0Var).q();
        }
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
