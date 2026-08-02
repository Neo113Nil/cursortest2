package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.c5g;
import xsna.eg1;
import xsna.fg1;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.jw5;
import xsna.q34;
import xsna.rd00;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: StereoRoomHandsQueueImpl.kt */
/* loaded from: classes9.dex */
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    private final izs<CallParticipant.ParticipantId, ParticipantId> getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    private boolean hasMore = true;
    private final wzs<List<CallParticipant.ParticipantId>, gzs<s3q0>, s3q0> idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final TimeProvider timeProvider;
    private int totalCount;

    /* JADX WARN: Multi-variable type inference failed */
    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, wzs<? super List<CallParticipant.ParticipantId>, ? super gzs<s3q0>, s3q0> wzsVar, izs<? super CallParticipant.ParticipantId, ParticipantId> izsVar, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, TimeProvider timeProvider) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = wzsVar;
        this.getExternalId = izsVar;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = timeProvider;
    }

    private final void loadHandsQueue(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.getHandsQueue(new rd00(2, this, gzsVar), izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, gzs gzsVar, izs izsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            izsVar = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(gzsVar, izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 loadHandsQueue$lambda$0(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, gzs gzsVar, int i, boolean z, List list) {
        stereoRoomHandsQueueImpl.totalCount = i;
        stereoRoomHandsQueueImpl.hasMore = z;
        wzs<List<CallParticipant.ParticipantId>, gzs<s3q0>, s3q0> wzsVar = stereoRoomHandsQueueImpl.idsResolverHelper;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallWaitingParticipantId) it.next()).getParticipantId());
        }
        wzsVar.invoke(arrayList, new q34(list, gzsVar, stereoRoomHandsQueueImpl, 6));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 loadHandsQueue$lambda$0$1(List list, gzs gzsVar, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallWaitingParticipantId callWaitingParticipantId = (CallWaitingParticipantId) it.next();
            ParticipantId invoke = stereoRoomHandsQueueImpl.getExternalId.invoke(callWaitingParticipantId.getParticipantId());
            if (invoke != null) {
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(invoke, callWaitingParticipantId.getAddedTs()), true);
            }
        }
        gzsVar.invoke();
        stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 loadMoreElements$lambda$0(izs izsVar, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        if (izsVar != null) {
            izsVar.invoke(stereoRoomHandsQueueImpl);
        }
        return s3q0.a;
    }

    private final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onHandUp$lambda$0(CallWaitingRoomEvent.HandUp handUp, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        Iterator<T> it = handUp.getRemovedParticipantIds().iterator();
        while (it.hasNext()) {
            ParticipantId invoke = stereoRoomHandsQueueImpl.getExternalId.invoke((CallParticipant.ParticipantId) it.next());
            if (invoke != null) {
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(invoke, stereoRoomHandsQueueImpl.timeProvider.utcTimeMs()), false);
            }
        }
        Iterator<T> it2 = handUp.getAddedParticipantIds().iterator();
        while (it2.hasNext()) {
            ParticipantId invoke2 = stereoRoomHandsQueueImpl.getExternalId.invoke((CallParticipant.ParticipantId) it2.next());
            if (invoke2 != null) {
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(invoke2, stereoRoomHandsQueueImpl.timeProvider.utcTimeMs()), true);
            }
        }
        stereoRoomHandsQueueImpl.totalCount = handUp.getTotalCount();
        stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
        return s3q0.a;
    }

    private final void participantHandChanged(StereoHandQueueItem stereoHandQueueItem, boolean z) {
        if (z) {
            this.handQueue.put(stereoHandQueueItem.getParticipantId(), stereoHandQueueItem);
        } else {
            this.handQueue.remove(stereoHandQueueItem.getParticipantId());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public int getTotalCount() {
        return this.totalCount;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public boolean hasMore() {
        return this.hasMore;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public void loadMoreElements(izs<? super StereoRoomHandsQueue, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        loadHandsQueue(new eg1(16, izsVar, this), izsVar2);
    }

    public final void onHandUp(CallWaitingRoomEvent.HandUp handUp) {
        this.idsResolverHelper.invoke(j5g.u0(handUp.getRemovedParticipantIds(), handUp.getAddedParticipantIds()), new fg1(26, handUp, this));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue
    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> hashMap = this.handQueue;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<ParticipantId, StereoHandQueueItem>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            StereoHandQueueItem value = it.next().getValue();
            if (value != null) {
                arrayList.add(value);
            }
        }
        return j5g.D0(new Comparator() { // from class: ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(Long.valueOf(((StereoHandQueueItem) t).getAddedTs()), Long.valueOf(((StereoHandQueueItem) t2).getAddedTs()));
            }
        }, arrayList);
    }
}
