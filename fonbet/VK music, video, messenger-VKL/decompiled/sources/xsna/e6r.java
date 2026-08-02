package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;

/* compiled from: FeedbackListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class e6r implements FeedbackListener {
    public final i6r a;

    public e6r(i6r i6rVar) {
        this.a = i6rVar;
    }

    public static ArrayList a(List list) {
        List<ParticipantFeedback> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (ParticipantFeedback participantFeedback : list2) {
            String key = participantFeedback.getKey();
            CallMemberId E = mnh0.E(participantFeedback.getParticipantId());
            participantFeedback.getFinishTimeMs();
            participantFeedback.getSource();
            arrayList.add(new a69(key, E));
        }
        return arrayList;
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener
    public final void onFeedbackAdded(List<ParticipantFeedback> list) {
        this.a.n(a(list));
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener
    public final void onFeedbackEnabledChanged(boolean z) {
        this.a.onFeedbackEnabledChanged(z);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener
    public final void onFeedbackRemoved(List<ParticipantFeedback> list) {
        this.a.j(a(list));
    }
}
