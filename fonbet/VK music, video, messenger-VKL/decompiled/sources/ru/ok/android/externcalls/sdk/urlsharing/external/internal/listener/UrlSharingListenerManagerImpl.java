package ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingInfo;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingListener;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.listeners.CallUrlSharingListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.urlsharing.SignalingUrlSharingInfo;
import xsna.epx;
import xsna.u8p;
import xsna.xw1;
import xsna.zcl;

/* compiled from: UrlSharingListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class UrlSharingListenerManagerImpl implements UrlSharingListenerManager, CallUrlSharingListener, CallSessionRoomsListener {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "UrlSharingListenerManagerImpl";
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final RTCLog logger;
    private final CopyOnWriteArraySet<UrlSharingListener> listeners = new CopyOnWriteArraySet<>();
    private Map<SessionRoomId, UrlSharingInfo> roomIdToUrlSharingInfo = new HashMap();
    private SessionRoomId activeRoomId = SessionRoomId.MainCall.INSTANCE;

    /* compiled from: UrlSharingListenerManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public UrlSharingListenerManagerImpl(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, RTCLog rTCLog) {
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.logger = rTCLog;
    }

    private final void reportForActiveRoom() {
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        Iterator<UrlSharingListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            UrlSharingListener next = it.next();
            if (urlSharingInfo == null) {
                next.onUrlSharingStopped();
            } else {
                next.onUrlSharingStarted(urlSharingInfo);
            }
        }
    }

    private final void saveUrlSharing(SessionRoomId sessionRoomId, SignalingUrlSharingInfo signalingUrlSharingInfo) {
        ParticipantId byInternal = this.idMappingWrapper.getByInternal(signalingUrlSharingInfo.getInitiator());
        if (byInternal != null) {
            saveUrlSharingWithId(sessionRoomId, byInternal, signalingUrlSharingInfo.getUrl());
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(signalingUrlSharingInfo.getInitiator()), new u8p(this, signalingUrlSharingInfo, sessionRoomId, 2), new xw1(this, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$0(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl, SignalingUrlSharingInfo signalingUrlSharingInfo, SessionRoomId sessionRoomId) {
        ParticipantId byInternal = urlSharingListenerManagerImpl.idMappingWrapper.getByInternal(signalingUrlSharingInfo.getInitiator());
        if (byInternal == null) {
            return;
        }
        urlSharingListenerManagerImpl.saveUrlSharingWithId(sessionRoomId, byInternal, signalingUrlSharingInfo.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveUrlSharing$lambda$1(UrlSharingListenerManagerImpl urlSharingListenerManagerImpl) {
        urlSharingListenerManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void saveUrlSharingWithId(SessionRoomId sessionRoomId, ParticipantId participantId, String str) {
        this.roomIdToUrlSharingInfo.put(sessionRoomId, new UrlSharingInfo(str, participantId));
        if (epx.f(sessionRoomId, this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void addListener(UrlSharingListener urlSharingListener) {
        this.listeners.add(urlSharingListener);
        UrlSharingInfo urlSharingInfo = this.roomIdToUrlSharingInfo.get(this.activeRoomId);
        if (urlSharingInfo != null) {
            urlSharingListener.onUrlSharingStarted(urlSharingInfo);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        if (epx.f(this.activeRoomId, activeRoomChangedParams.getRoomId())) {
            return;
        }
        this.activeRoomId = activeRoomChangedParams.getRoomId();
        reportForActiveRoom();
    }

    @Override // ru.ok.android.webrtc.listeners.CallUrlSharingListener
    public void onUrlSharingInfoUpdated(CallUrlSharingListener.UrlSharingState urlSharingState) {
        SignalingUrlSharingInfo info = urlSharingState.getInfo();
        if (info != null) {
            saveUrlSharing(urlSharingState.getRoomId(), info);
            return;
        }
        this.roomIdToUrlSharingInfo.put(urlSharingState.getRoomId(), null);
        if (epx.f(urlSharingState.getRoomId(), this.activeRoomId)) {
            reportForActiveRoom();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManager
    public void removeListener(UrlSharingListener urlSharingListener) {
        this.listeners.remove(urlSharingListener);
    }
}
