package ru.ok.android.externcalls.sdk.feedback.internal.listeners;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedback;
import ru.ok.android.externcalls.sdk.feedback.ParticipantFeedbackSource;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.listener.FeedbackListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.feedback.CallFeedback;
import ru.ok.android.webrtc.listeners.CallFeedbackListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.c5g;
import xsna.epx;
import xsna.f6r;
import xsna.g5g;
import xsna.j5g;
import xsna.qyc;

/* compiled from: FeedbackListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class FeedbackListenerManagerImpl implements FeedbackListenerManager, CallFeedbackListener {
    private final Conversation conversation;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final ParticipantStore store;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArraySet<FeedbackListener> listeners = new CopyOnWriteArraySet<>();
    private HashMap<ParticipantId, ParticipantFeedback> activeFeedback = new HashMap<>();
    private long timeout = 10000;
    private final LinkedList<Long> generations = new LinkedList<>();

    /* compiled from: FeedbackListenerManagerImpl.kt */
    public static final class CallParticipantFeedback {
        private final String feedbackId;
        private final CallParticipant.ParticipantId participantId;

        public CallParticipantFeedback(CallParticipant.ParticipantId participantId, String str) {
            this.participantId = participantId;
            this.feedbackId = str;
        }

        public final String getFeedbackId() {
            return this.feedbackId;
        }

        public final CallParticipant.ParticipantId getParticipantId() {
            return this.participantId;
        }
    }

    public FeedbackListenerManagerImpl(Conversation conversation, ParticipantStore participantStore, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper) {
        this.conversation = conversation;
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
    }

    private final void notifyFeedbackAdded(List<ParticipantFeedback> list) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackAdded(list);
        }
    }

    private final void notifyFeedbackEnabledChanged(boolean z) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackEnabledChanged(z);
        }
    }

    private final void notifyFeedbackRemoved(List<ParticipantFeedback> list) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((FeedbackListener) it.next()).onFeedbackRemoved(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyResolvedFeedbackItems(List<ParticipantFeedback> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ParticipantFeedback participantFeedback = (ParticipantFeedback) obj;
            ParticipantFeedback participantFeedback2 = this.activeFeedback.get(participantFeedback.getParticipantId());
            if (!epx.f(participantFeedback2 != null ? participantFeedback2.getKey() : null, participantFeedback.getKey())) {
                arrayList.add(obj);
            }
        }
        updateActiveFeedback(list);
        if (!arrayList.isEmpty()) {
            notifyFeedbackAdded(arrayList);
        }
        scheduleRemoving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFeedback$lambda$1(FeedbackListenerManagerImpl feedbackListenerManagerImpl, List list, List list2) {
        feedbackListenerManagerImpl.processFeedbackForResolvedInternalIds(list, list2);
        feedbackListenerManagerImpl.notifyResolvedFeedbackItems(list2);
    }

    private final List<CallParticipantFeedback> processFeedbackForResolvedInternalIds(List<CallParticipantFeedback> list, List<ParticipantFeedback> list2) {
        ParticipantId byInternal;
        long currentTimeMillis = System.currentTimeMillis() + this.timeout;
        ArrayList arrayList = new ArrayList();
        for (CallParticipantFeedback callParticipantFeedback : list) {
            ConversationParticipant byInternal2 = this.store.getByInternal(callParticipantFeedback.getParticipantId());
            if (byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) {
                byInternal = this.idMappingWrapper.getByInternal(callParticipantFeedback.getParticipantId());
            }
            ParticipantId participantId = byInternal;
            ParticipantFeedback participantFeedback = participantId != null ? new ParticipantFeedback(callParticipantFeedback.getFeedbackId(), currentTimeMillis, participantId, null, 8, null) : null;
            if (participantFeedback != null) {
                list2.add(participantFeedback);
            } else {
                arrayList.add(callParticipantFeedback);
            }
        }
        this.generations.add(Long.valueOf(currentTimeMillis));
        return arrayList;
    }

    private final void scheduleRemoving() {
        Long l = (Long) g5g.H(this.generations);
        if (l != null) {
            long longValue = l.longValue();
            this.mainHandler.postDelayed(new f6r(this, longValue, 0), longValue - System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryToRemoveOld(long j) {
        Iterator<Map.Entry<ParticipantId, ParticipantFeedback>> it = this.activeFeedback.entrySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Map.Entry<ParticipantId, ParticipantFeedback> next = it.next();
            if (next.getValue().getFinishTimeMs() <= j) {
                it.remove();
                arrayList.add(next.getValue());
            }
        }
        if (!arrayList.isEmpty()) {
            notifyFeedbackRemoved(arrayList);
        }
        scheduleRemoving();
    }

    private final List<CallParticipantFeedback> unrollReceivedFeedback(CallFeedbackListener.Feedback feedback) {
        List<CallFeedback> feedbacks = feedback.getFeedbacks();
        ArrayList arrayList = new ArrayList();
        for (CallFeedback callFeedback : feedbacks) {
            List<CallParticipant.ParticipantId> participantIds = callFeedback.getParticipantIds();
            ArrayList arrayList2 = new ArrayList(c5g.u(participantIds, 10));
            Iterator<T> it = participantIds.iterator();
            while (it.hasNext()) {
                arrayList2.add(new CallParticipantFeedback((CallParticipant.ParticipantId) it.next(), callFeedback.getFeedbackId()));
            }
            g5g.y(arrayList2, arrayList);
        }
        return arrayList;
    }

    private final void updateActiveFeedback(List<ParticipantFeedback> list) {
        for (ParticipantFeedback participantFeedback : list) {
            this.activeFeedback.put(participantFeedback.getParticipantId(), participantFeedback);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void addListener(FeedbackListener feedbackListener) {
        this.listeners.add(feedbackListener);
    }

    public final void clear() {
        this.activeFeedback = new HashMap<>();
    }

    public final Set<ParticipantFeedback> getFeedback() {
        return j5g.S0(this.activeFeedback.values());
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public ParticipantFeedback getOwnCurrentFeedback() {
        return this.activeFeedback.get(this.conversation.getMe().getExternalId());
    }

    @Override // ru.ok.android.webrtc.listeners.CallFeedbackListener
    public void onFeedback(CallFeedbackListener.Feedback feedback) {
        if (epx.f(feedback.getRoomId(), this.store.getActiveRoomId())) {
            List<CallParticipantFeedback> unrollReceivedFeedback = unrollReceivedFeedback(feedback);
            if (unrollReceivedFeedback.isEmpty()) {
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final List<CallParticipantFeedback> processFeedbackForResolvedInternalIds = processFeedbackForResolvedInternalIds(unrollReceivedFeedback, arrayList);
            if (processFeedbackForResolvedInternalIds.isEmpty()) {
                notifyResolvedFeedbackItems(arrayList);
                return;
            }
            IdMappingResolver idMappingResolver = this.idMappingResolver;
            List<CallParticipantFeedback> list = processFeedbackForResolvedInternalIds;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CallParticipantFeedback) it.next()).getParticipantId());
            }
            idMappingResolver.resolveExternalsByInternalsIds(arrayList2, new Runnable() { // from class: xsna.g6r
                @Override // java.lang.Runnable
                public final void run() {
                    FeedbackListenerManagerImpl.onFeedback$lambda$1(FeedbackListenerManagerImpl.this, processFeedbackForResolvedInternalIds, arrayList);
                }
            }, new qyc(1, this, arrayList));
        }
    }

    public final void onFeedbackEnabledChanged(boolean z) {
        notifyFeedbackEnabledChanged(z);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void ownFeedbackSent(String str, ParticipantFeedbackSource participantFeedbackSource) {
        ConversationParticipant me2 = this.conversation.getMe();
        if (me2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() + this.timeout;
        ParticipantFeedback participantFeedback = new ParticipantFeedback(str, currentTimeMillis, me2.getExternalId(), participantFeedbackSource);
        this.generations.add(Long.valueOf(currentTimeMillis));
        updateActiveFeedback(Collections.singletonList(participantFeedback));
        notifyFeedbackAdded(Collections.singletonList(participantFeedback));
        scheduleRemoving();
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void removeListener(FeedbackListener feedbackListener) {
        this.listeners.remove(feedbackListener);
    }

    @Override // ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager
    public void setTimeout(long j) {
        this.timeout = j;
    }
}
