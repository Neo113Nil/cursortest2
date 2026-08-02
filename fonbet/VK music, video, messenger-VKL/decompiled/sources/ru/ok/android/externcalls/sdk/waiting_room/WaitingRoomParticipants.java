package ru.ok.android.externcalls.sdk.waiting_room;

import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.schedulers.a;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.listeners.CallWaitingRoomListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipant;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import ru.ok.android.webrtc.participant.waiting.CallWaitingRoomParticipantsPage;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.aaq;
import xsna.bjn0;
import xsna.go9;
import xsna.izs;
import xsna.o93;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: WaitingRoomParticipants.kt */
/* loaded from: classes9.dex */
public final class WaitingRoomParticipants implements CallWaitingRoomListener {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile Call call;
    private final b compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final f<Boolean> loadEventSubject;
    private final RTCLog log;

    /* compiled from: WaitingRoomParticipants.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: WaitingRoomParticipants.kt */
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean z);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate);
    }

    /* compiled from: WaitingRoomParticipants.kt */
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    public WaitingRoomParticipants(Listener listener, IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, RTCLog rTCLog) {
        this.listener = listener;
        this.idMappingWrapper = idMappingWrapper;
        this.idMappingResolver = idMappingResolver;
        this.log = rTCLog;
        f<Boolean> fVar = new f<>();
        this.loadEventSubject = fVar;
        b bVar = new b();
        this.compositeDisposable = bVar;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        bVar.b(fVar.w0(3L, TimeUnit.SECONDS).a0(a.b()).U(new l() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$1
            @Override // io.reactivex.rxjava3.functions.l
            public final WaitingRoomParticipantsUpdate apply(Boolean bool) {
                WaitingRoomParticipantsUpdate loadWaitingParticipantIds;
                loadWaitingParticipantIds = WaitingRoomParticipants.this.loadWaitingParticipantIds();
                return loadWaitingParticipantIds;
            }
        }).d0(waitingRoomParticipantsUpdate).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate2) {
                WaitingRoomParticipants.this.notifyListener(waitingRoomParticipantsUpdate2);
            }
        }));
    }

    private final CallWaitingParticipantId fromInternalLong(ConversationWaitingParticipantId conversationWaitingParticipantId, CallParticipant.ParticipantId participantId) {
        return new CallWaitingParticipantId(participantId, conversationWaitingParticipantId.addedTs);
    }

    private final List<CallParticipant.ParticipantId> getInternalIdsToResolve(List<CallWaitingParticipant> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CallWaitingParticipant> it = list.iterator();
        while (it.hasNext()) {
            CallWaitingParticipantId waitingParticipantId = it.next().getWaitingParticipantId();
            if (this.idMappingWrapper.getByInternal(waitingParticipantId.getParticipantId()) == null) {
                arrayList.add(waitingParticipantId.getParticipantId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<CallWaitingParticipant> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (CallWaitingParticipant callWaitingParticipant : list) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(callWaitingParticipant.getWaitingParticipantId().getParticipantId());
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), callWaitingParticipant.getWaitingParticipantId().getAddedTs()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        CallWaitingParticipantId fromInternalLong;
        boolean z;
        Call call = this.call;
        if (call == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    fromInternalLong = fromInternalLong(conversationWaitingParticipantId, resolveInternalIdSingle(conversationWaitingParticipantId).c());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                fromInternalLong = null;
            }
            try {
                WaitingParticipantsPage c = loadWaitingParticipantIdsPageSingle(call, fromInternalLong).c();
                Iterator<ConversationWaitingParticipantId> it = c.getParticipantIds().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getParticipantId());
                }
                z = c.getHasMore() && !c.getParticipantIds().isEmpty();
                if (!c.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = c.getParticipantIds().get(c.getParticipantIds().size() - 1);
                }
            } catch (Throwable th2) {
                bjn0.b("can't load next page. Error: ", th2.getMessage(), this.log, LOG_TAG);
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final x<WaitingParticipantsPage> loadWaitingParticipantIdsPageSingle(final Call call, final CallWaitingParticipantId callWaitingParticipantId) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new a0() { // from class: xsna.h8x0
            @Override // io.reactivex.rxjava3.core.a0
            public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0(Call.this, callWaitingParticipantId, this, yVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$0(Call call, CallWaitingParticipantId callWaitingParticipantId, final WaitingRoomParticipants waitingRoomParticipants, final y yVar) {
        call.getWaitingRoomParticipants(callWaitingParticipantId, 50, false, new Consumer() { // from class: xsna.i8x0
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$0$0(WaitingRoomParticipants.this, yVar, (CallWaitingRoomParticipantsPage) obj);
            }
        }, new o93(yVar, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$0$0(final WaitingRoomParticipants waitingRoomParticipants, final y yVar, final CallWaitingRoomParticipantsPage callWaitingRoomParticipantsPage) {
        final List<CallWaitingParticipant> participants = callWaitingRoomParticipantsPage.getParticipants();
        waitingRoomParticipants.putIdMappingsToCache(participants);
        List<CallParticipant.ParticipantId> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(participants);
        if (internalIdsToResolve.isEmpty()) {
            yVar.onSuccess(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(participants), callWaitingRoomParticipantsPage.hasMore()));
        } else {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$0$0$$inlined$resolveInternalIds$1
                @Override // java.lang.Runnable
                public final void run() {
                    List resolvedWaitingParticipantIds;
                    resolvedWaitingParticipantIds = WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(participants);
                    try {
                        yVar.onSuccess(new WaitingRoomParticipants.WaitingParticipantsPage(resolvedWaitingParticipantIds, callWaitingRoomParticipantsPage.hasMore()));
                    } catch (Exception e) {
                        yVar.b(new RuntimeException(go9.b("Can't resolve internal ids: ", e.getMessage())));
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$0$0$$inlined$resolveInternalIds$2
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.b(new RuntimeException(go9.b("Can't resolve internal ids: ", new RuntimeException("Can't resolve extenral ids").getMessage())));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWaitingParticipantIdsPageSingle$lambda$0$1(y yVar) {
        yVar.b(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        this.listener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListener(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(waitingRoomParticipantsUpdate);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<CallWaitingParticipant> list) {
        for (CallWaitingParticipant callWaitingParticipant : list) {
            ParticipantId convert = CallExternalIdConverter.convert(callWaitingParticipant.getExternalId());
            if (convert != null) {
                this.idMappingWrapper.addMapping(convert, callWaitingParticipant.getWaitingParticipantId().getParticipantId());
            }
        }
    }

    private final x<CallParticipant.ParticipantId> resolveInternalIdSingle(ConversationWaitingParticipantId conversationWaitingParticipantId) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new com.vk.newsfeed.posting.donut_teaser.domain.interactor.a(this, conversationWaitingParticipantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$0(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, final y yVar) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new Consumer() { // from class: xsna.j8x0
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                io.reactivex.rxjava3.core.y.this.onSuccess((CallParticipant.ParticipantId) obj);
            }
        }, new aaq(7, yVar, conversationWaitingParticipantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveInternalIdSingle$lambda$0$0(y yVar, ConversationWaitingParticipantId conversationWaitingParticipantId) {
        yVar.onError(new RuntimeException("No external id for " + conversationWaitingParticipantId.getParticipantId()));
    }

    private final void resolveInternalIds(final List<CallWaitingParticipant> list, final izs<? super List<ConversationWaitingParticipantId>, s3q0> izsVar, final izs<? super Throwable, s3q0> izsVar2) {
        putIdMappingsToCache(list);
        List<CallParticipant.ParticipantId> internalIdsToResolve = getInternalIdsToResolve(list);
        if (internalIdsToResolve.isEmpty()) {
            izsVar.invoke(getResolvedWaitingParticipantIds(list));
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$resolveInternalIds$1
                @Override // java.lang.Runnable
                public final void run() {
                    List<ConversationWaitingParticipantId> resolvedWaitingParticipantIds;
                    resolvedWaitingParticipantIds = WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(list);
                    try {
                        izsVar.invoke(resolvedWaitingParticipantIds);
                    } catch (Exception e) {
                        izsVar2.invoke(e);
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$resolveInternalIds$2
                @Override // java.lang.Runnable
                public final void run() {
                    izsVar2.invoke(new RuntimeException("Can't resolve extenral ids"));
                }
            });
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.onNext(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onAttendee(CallWaitingRoomEvent.Attendee attendee) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    public final void onIsMeAdminMayHaveChanged(boolean z) {
        if (this.isMeAdmin != z) {
            this.isMeAdmin = z;
            update();
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onMeInWaitingRoomChanged(boolean z) {
        this.listener.onMeInWaitingRoomChanged(z);
    }

    public final void onWaitingRoomEnabled(boolean z) {
        if (this.isWaitingRoomEnabled != z) {
            this.isWaitingRoomEnabled = z;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.dispose();
    }

    public final void setCall(Call call) {
        this.call = call;
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onFeedback(CallWaitingRoomEvent.Feedback feedback) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onHandUp(CallWaitingRoomEvent.HandUp handUp) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onPromotionUpdated(CallWaitingRoomEvent.PromotionApproved promotionApproved) {
    }
}
