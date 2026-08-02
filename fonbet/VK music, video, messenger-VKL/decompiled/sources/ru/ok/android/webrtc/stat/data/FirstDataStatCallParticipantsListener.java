package ru.ok.android.webrtc.stat.data;

import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.listeners.CallParticipantsListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class FirstDataStatCallParticipantsListener implements CallParticipantsListener {
    public final gzs a;
    public final FirstDataStat b;
    public boolean c;
    public boolean d;

    public FirstDataStatCallParticipantsListener(gzs<CallParticipant.ParticipantId> gzsVar, FirstDataStat firstDataStat) {
        this.a = gzsVar;
        this.b = firstDataStat;
    }

    public final void a(CallParticipant.ParticipantId participantId, List list) {
        if (this.c && this.d) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallParticipant callParticipant = (CallParticipant) it.next();
            if (callParticipant.isCallAccepted()) {
                if (epx.f(callParticipant.getParticipantId(), participantId)) {
                    if (!this.c) {
                        this.b.onMeAccepted();
                        this.c = true;
                    }
                } else if (!this.d) {
                    this.b.onAnyOtherAccept();
                    this.d = true;
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsAdded(CallParticipantsListener.AddedParams addedParams) {
        a((CallParticipant.ParticipantId) this.a.invoke(), addedParams.getAddedParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsChanged(CallParticipantsListener.ChangedParams changedParams) {
        a((CallParticipant.ParticipantId) this.a.invoke(), changedParams.getChangedParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsDeAnonimized(CallParticipantsListener.DeAnonParams deAnonParams) {
        a((CallParticipant.ParticipantId) this.a.invoke(), deAnonParams.getChangedParticipants());
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public void onCallParticipantsRemoved(CallParticipantsListener.RemovedParams removedParams) {
    }
}
