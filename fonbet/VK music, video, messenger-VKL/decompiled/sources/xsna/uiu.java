package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uiu implements ParticipantStatesManager.Listener {
    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        GroupCallViewModel.b.getClass();
        HashSet<String> hashSet = GroupCallViewModel.k;
        hashSet.clear();
        Set<ParticipantId> raisedHandIds = participantStatesManager.getRaisedHandIds();
        ArrayList arrayList = new ArrayList(c5g.u(raisedHandIds, 10));
        Iterator<T> it = raisedHandIds.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantId) it.next()).id);
        }
        hashSet.addAll(arrayList);
        Iterator<kiu> it2 = GroupCallViewModel.g.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            kiu next = it2.next();
            boolean contains = hashSet.contains(next.a.a.b);
            if (contains != next.m) {
                next.m = contains;
                GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                CallMemberId callMemberId = next.a.a;
                groupCallViewModel.getClass();
                GroupCallViewModel.l.onNext(callMemberId);
                z = true;
            }
        }
        if (z) {
            ArrayList<kiu> arrayList2 = GroupCallViewModel.g;
            if (arrayList2.size() > 1) {
                g5g.L(arrayList2, new wiu(0));
            }
            GroupCallViewModel.r();
            GroupCallViewModel.e();
        }
    }
}
