package ru.ok.android.webrtc.topology.server.layout;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayout;
import ru.ok.android.webrtc.layout.internal.ServerDisplayLayoutItem;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Response;
import ru.ok.android.webrtc.topology.server.PeerConnectionWrapper;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.kb;
import xsna.l8;
import xsna.lh3;
import xsna.ps2;

/* loaded from: classes9.dex */
public final class DiffDisplayLayouts implements DisplayLayouts {
    public static final ServerDisplayLayout f;
    public final RTCLog a;
    public final PeerConnectionWrapper b;
    public volatile List c = Collections.EMPTY_LIST;
    public volatile Map d = Collections.EMPTY_MAP;
    public volatile boolean e = false;

    static {
        ServerDisplayLayout serverDisplayLayout = new ServerDisplayLayout();
        f = serverDisplayLayout;
        serverDisplayLayout.setStopStream(true);
    }

    public DiffDisplayLayouts(@NonNull RTCLog rTCLog, @NonNull PeerConnectionWrapper peerConnectionWrapper) {
        this.a = rTCLog;
        this.b = peerConnectionWrapper;
    }

    public final void a(List list) {
        List<CallDisplayLayoutItem> list2 = this.e ? Collections.EMPTY_LIST : this.c;
        HashMap hashMap = new HashMap();
        for (CallDisplayLayoutItem callDisplayLayoutItem : list2) {
            hashMap.put(callDisplayLayoutItem.getVideoTrackParticipantKey(), callDisplayLayoutItem);
        }
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallDisplayLayoutItem callDisplayLayoutItem2 = (CallDisplayLayoutItem) it.next();
            hashMap2.put(callDisplayLayoutItem2.getVideoTrackParticipantKey(), callDisplayLayoutItem2);
        }
        ArrayList arrayList = new ArrayList();
        for (CallVideoTrackParticipantKey callVideoTrackParticipantKey : hashMap2.keySet()) {
            CallDisplayLayoutItem callDisplayLayoutItem3 = (CallDisplayLayoutItem) hashMap.get(callVideoTrackParticipantKey);
            CallDisplayLayoutItem callDisplayLayoutItem4 = (CallDisplayLayoutItem) hashMap2.get(callVideoTrackParticipantKey);
            if (callDisplayLayoutItem4 != null && (callDisplayLayoutItem3 == null || !callDisplayLayoutItem3.getLayout().equals(callDisplayLayoutItem4.getLayout()))) {
                CallVideoTrackParticipantKey videoTrackParticipantKey = callDisplayLayoutItem4.getVideoTrackParticipantKey();
                VideoDisplayLayout layout = callDisplayLayoutItem4.getLayout();
                ServerDisplayLayout serverDisplayLayout = new ServerDisplayLayout();
                serverDisplayLayout.setFit(layout.getFit() == VideoDisplayLayout.Fit.COVER ? ServerDisplayLayout.Fit.COVER : ServerDisplayLayout.Fit.CONTAIN);
                serverDisplayLayout.setWidth(layout.getWidth());
                serverDisplayLayout.setHeight(layout.getHeight());
                serverDisplayLayout.setStopStream(false);
                arrayList.add(new ServerDisplayLayoutItem(videoTrackParticipantKey, serverDisplayLayout));
            }
        }
        for (CallVideoTrackParticipantKey callVideoTrackParticipantKey2 : hashMap.keySet()) {
            CallDisplayLayoutItem callDisplayLayoutItem5 = (CallDisplayLayoutItem) hashMap.get(callVideoTrackParticipantKey2);
            if (callDisplayLayoutItem5 != null && !hashMap2.containsKey(callVideoTrackParticipantKey2)) {
                arrayList.add(new ServerDisplayLayoutItem(callDisplayLayoutItem5.getVideoTrackParticipantKey(), f));
            }
        }
        a(arrayList, this.e);
        this.c = list;
        HashMap hashMap3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CallDisplayLayoutItem callDisplayLayoutItem6 = (CallDisplayLayoutItem) it2.next();
            CallParticipant.ParticipantId participantId = callDisplayLayoutItem6.getVideoTrackParticipantKey().getParticipantId();
            Set set = (Set) hashMap3.get(participantId);
            if (set == null) {
                set = new HashSet();
                hashMap3.put(participantId, set);
            }
            set.add(callDisplayLayoutItem6.getVideoTrackParticipantKey());
        }
        this.d = hashMap3;
        this.e = false;
    }

    public final /* synthetic */ void b(UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command, UpdateDisplayLayoutV2Response updateDisplayLayoutV2Response) {
        this.a.log("DisplayLayouts", "Stop stream on participant removed response: " + updateDisplayLayoutV2Response);
    }

    @Override // ru.ok.android.webrtc.topology.server.layout.DisplayLayouts
    @NonNull
    public List<CallDisplayLayoutItem> getLatestDisplayLayouts() {
        return this.c;
    }

    @Override // ru.ok.android.webrtc.topology.server.layout.DisplayLayouts
    public void removeDisplayLayoutsForParticipant(@NonNull CallParticipant.ParticipantId participantId) {
        a(participantId);
        List<CallDisplayLayoutItem> list = this.c;
        ArrayList arrayList = new ArrayList();
        for (CallDisplayLayoutItem callDisplayLayoutItem : list) {
            if (!callDisplayLayoutItem.getVideoTrackParticipantKey().getParticipantId().equals(participantId)) {
                arrayList.add(callDisplayLayoutItem);
            }
        }
        this.c = arrayList;
        this.d.remove(participantId);
    }

    @Override // ru.ok.android.webrtc.topology.server.layout.DisplayLayouts
    public void resendLatestDisplayLayouts() {
        this.e = true;
        a(this.c);
    }

    @Override // ru.ok.android.webrtc.topology.server.layout.DisplayLayouts
    public void updateDisplayLayouts(@NonNull List<CallDisplayLayoutItem> list) {
        a(list);
    }

    public final /* synthetic */ void b(UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command, Throwable th) {
        this.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
    }

    public final void a(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.b.getCommandExecutor().execute(new UpdateDisplayLayoutV2Command(arrayList, z), new lh3(this, 14), new kb(this, 25));
    }

    public final void a(UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command, UpdateDisplayLayoutV2Response updateDisplayLayoutV2Response) {
        if (updateDisplayLayoutV2Response.participantsToErrorMap.isEmpty()) {
            return;
        }
        this.a.log("DisplayLayouts", "Resend next time after response with errors");
        this.e = true;
    }

    public final void a(UpdateDisplayLayoutV2Command updateDisplayLayoutV2Command, Throwable th) {
        this.a.log("DisplayLayouts", "Resend next time after error");
        this.e = true;
    }

    public final void a(CallParticipant.ParticipantId participantId) {
        Set set = (Set) this.d.get(participantId);
        if (set == null) {
            set = new HashSet();
        }
        set.add(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(VideoTrackType.VIDEO).build());
        set.add(new CallVideoTrackParticipantKey.Builder().setParticipantId(participantId).setType(VideoTrackType.SCREEN_CAPTURE).build());
        ServerDisplayLayout serverDisplayLayout = new ServerDisplayLayout();
        serverDisplayLayout.setStopStream(true);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new ServerDisplayLayoutItem((CallVideoTrackParticipantKey) it.next(), serverDisplayLayout));
        }
        this.b.getCommandExecutor().execute(new UpdateDisplayLayoutV2Command(arrayList, false), new ps2(this, 18), new l8(this, 21));
    }
}
