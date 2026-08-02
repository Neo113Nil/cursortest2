package ru.ok.android.externcalls.sdk.stereo.internal;

import com.vk.movika.sdk.base.ui.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.listeners.CallWaitingRoomListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.gzs;
import xsna.id;
import xsna.izs;
import xsna.j5g;
import xsna.jl90;
import xsna.l1l0;
import xsna.m1l0;
import xsna.p76;
import xsna.qm30;
import xsna.qo4;
import xsna.s3q0;
import xsna.vkb;
import xsna.vq3;
import xsna.zcl;
import xsna.zgb;
import xsna.zn4;

/* compiled from: StereoRoomManagerImpl.kt */
/* loaded from: classes9.dex */
public final class StereoRoomManagerImpl implements StereoRoomManager, CallWaitingRoomListener, StereoRoomListenerManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    private final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final RTCLog logger;
    private final ParticipantStore store;

    /* compiled from: StereoRoomManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: StereoRoomManagerImpl.kt */
    public interface GrantRolesRequest {
        void grantRoles(CallParticipant.ParticipantId participantId, boolean z, CallParticipant.Role[] roleArr, Runnable runnable, Runnable runnable2);
    }

    public StereoRoomManagerImpl(RTCLog rTCLog, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, TimeProvider timeProvider) {
        this.logger = rTCLog;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, timeProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParticipantId getExternalId(CallParticipant.ParticipantId participantId) {
        ParticipantId externalId;
        ConversationParticipant byInternal = this.store.getByInternal(participantId);
        return (byInternal == null || (externalId = byInternal.getExternalId()) == null) ? this.idMappingWrapper.getByInternal(participantId) : externalId;
    }

    private final CallParticipant.ParticipantId getInternalId(ParticipantId participantId) {
        CallParticipant.ParticipantId internalId;
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        return (byExternal == null || (internalId = byExternal.getInternalId()) == null) ? this.idMappingWrapper.getByExternal(participantId) : internalId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void grantAdmin$lambda$0$1(izs izsVar) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void idNotResolved(ParticipantId participantId, izs<? super Throwable, s3q0> izsVar) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 onAttendee$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, CallWaitingRoomEvent.Attendee attendee) {
        StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl = stereoRoomManagerImpl.listenersManager;
        int totalCount = attendee.getTotalCount();
        List<CallParticipant.ParticipantId> removedParticipantIds = attendee.getRemovedParticipantIds();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = removedParticipantIds.iterator();
        while (it.hasNext()) {
            ParticipantId externalId = stereoRoomManagerImpl.getExternalId((CallParticipant.ParticipantId) it.next());
            if (externalId != null) {
                arrayList.add(externalId);
            }
        }
        List<CallParticipant.ParticipantId> addedParticipantIds = attendee.getAddedParticipantIds();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = addedParticipantIds.iterator();
        while (it2.hasNext()) {
            ParticipantId externalId2 = stereoRoomManagerImpl.getExternalId((CallParticipant.ParticipantId) it2.next());
            if (externalId2 != null) {
                arrayList2.add(externalId2);
            }
        }
        stereoRoomListenerManagerImpl.onListenersChanged(new StereoRoomManagerListener.ListenersUpdated(totalCount, arrayList2, arrayList));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 promoteParticipant$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, gzs gzsVar, izs izsVar, CallParticipant.ParticipantId participantId) {
        stereoRoomManagerImpl.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(participantId, true), gzsVar, izsVar);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveIdsAndThen(final List<CallParticipant.ParticipantId> list, final gzs<s3q0> gzsVar) {
        final ArrayList arrayList = new ArrayList();
        for (CallParticipant.ParticipantId participantId : list) {
            if (getExternalId(participantId) == null) {
                arrayList.add(participantId);
            }
        }
        if (arrayList.isEmpty()) {
            gzsVar.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new p76(2, gzsVar), new Runnable() { // from class: xsna.k1l0
                @Override // java.lang.Runnable
                public final void run() {
                    StereoRoomManagerImpl.resolveIdsAndThen$lambda$2(StereoRoomManagerImpl.this, arrayList, list, gzsVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveIdsAndThen$lambda$2(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, gzs gzsVar) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            gzsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeAdmin$lambda$0$1(izs izsVar) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        CallParticipant callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            gzsVar.invoke();
            return;
        }
        List<CallParticipant.Role> roles = callParticipant.getRoles();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CallParticipant.Role role = CallParticipant.Role.ADMIN;
        if (roles.contains(role)) {
            linkedHashSet.add(role);
        }
        CallParticipant.Role role2 = CallParticipant.Role.SPEAKER;
        if (roles.contains(role2)) {
            linkedHashSet.add(role2);
        }
        if (linkedHashSet.isEmpty()) {
            gzsVar.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest = this.grantRolesRequest;
        CallParticipant.ParticipantId participantId2 = callParticipant.getParticipantId();
        if (participantId2 == null) {
            return;
        }
        grantRolesRequest.grantRoles(participantId2, true, (CallParticipant.Role[]) linkedHashSet.toArray(new CallParticipant.Role[0]), new zn4(1, gzsVar), new id(izsVar, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeRoles$lambda$1(izs izsVar) {
        if (izsVar != null) {
            izsVar.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 unpromoteParticipant$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, gzs gzsVar, izs izsVar) {
        stereoRoomManagerImpl.unpromoteParticipantImpl(participantId, gzsVar, izsVar);
        return s3q0.a;
    }

    private final void unpromoteParticipantImpl(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        withInternalId(participantId, izsVar, new zgb(this, gzsVar, izsVar, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 unpromoteParticipantImpl$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, gzs gzsVar, izs izsVar, CallParticipant.ParticipantId participantId) {
        stereoRoomManagerImpl.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(participantId, false), gzsVar, izsVar);
        return s3q0.a;
    }

    private final void withInternalId(ParticipantId participantId, izs<? super Throwable, s3q0> izsVar, final izs<? super CallParticipant.ParticipantId, s3q0> izsVar2) {
        this.idResolver.withInternalId(participantId, new Consumer() { // from class: xsna.j1l0
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                izs.this.invoke((CallParticipant.ParticipantId) obj);
            }
        }, new qm30(this, participantId, izsVar, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void acceptPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void addListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.addListener(stereoRoomManagerListener);
        stereoRoomManagerListener.onOwnPromotionChanged(isMePromoted());
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void cancelPromotionRequest(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void grantAdmin(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        CallParticipant.ParticipantId internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new CallParticipant.Role[]{CallParticipant.Role.ADMIN}, new jl90(1, gzsVar), new vq3(izsVar, 12));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public boolean isMePromoted() {
        return this.isMePromoted;
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onAttendee(CallWaitingRoomEvent.Attendee attendee) {
        resolveIdsAndThen(j5g.u0(attendee.getRemovedParticipantIds(), attendee.getAddedParticipantIds()), new m(24, this, attendee));
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onHandUp(CallWaitingRoomEvent.HandUp handUp) {
        getHandsQueue().onHandUp(handUp);
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onMeInWaitingRoomChanged(boolean z) {
        this.isMePromoted = !z;
        this.listenersManager.onOwnPromotionChanged(isMePromoted());
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onPromotionUpdated(CallWaitingRoomEvent.PromotionApproved promotionApproved) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(promotionApproved.getApproved()));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void promoteParticipant(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        withInternalId(participantId, izsVar, new vkb(this, gzsVar, izsVar, 6));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotionRequest(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        unpromoteParticipantImpl(participantId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void removeListener(StereoRoomManagerListener stereoRoomManagerListener) {
        this.listenersManager.removeListener(stereoRoomManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void requestPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokeAdmin(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        CallParticipant.ParticipantId internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new CallParticipant.Role[]{CallParticipant.Role.ADMIN}, new l1l0(0, gzsVar), new qo4(izsVar, 12));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokePromotion(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        unpromoteParticipantImpl(participantId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void unpromoteParticipant(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        revokeRoles(participantId, new m1l0(0, participantId, this, gzsVar, izsVar), izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }

    @Override // ru.ok.android.webrtc.listeners.CallWaitingRoomListener
    public void onFeedback(CallWaitingRoomEvent.Feedback feedback) {
    }
}
