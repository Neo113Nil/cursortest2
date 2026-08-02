package ru.ok.android.webrtc.record;

import org.json.JSONObject;
import ru.ok.android.webrtc.listeners.CallListeners;
import ru.ok.android.webrtc.listeners.CallRecordListener;
import ru.ok.android.webrtc.listeners.CallSessionRoomRecordInfoListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.record.RecordInfoParser;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordStartEvent;
import ru.ok.android.webrtc.signaling.record.event.SignalingRecordStopEvent;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CallRecordManager implements CallSessionRoomRecordInfoListener {
    public static final Companion Companion = new Companion(null);
    public final RecordInfoParser a;
    public final CallListeners b;
    public final RecordInfoProvider c;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public CallRecordManager(RecordInfoParser recordInfoParser, CallListeners callListeners, RecordInfoProvider recordInfoProvider) {
        this.a = recordInfoParser;
        this.b = callListeners;
        this.c = recordInfoProvider;
        callListeners.addSessionRoomRecordInfoListener(this);
    }

    public final RecordInfoProvider getRecordInfoProvider() {
        return this.c;
    }

    public final void handleRecordInfoOnConnection(JSONObject jSONObject) {
        SignalingRecordInfo parseRecordInfoFromParent$default = RecordInfoParser.parseRecordInfoFromParent$default(this.a, jSONObject, null, 2, null);
        if (parseRecordInfoFromParent$default == null) {
            return;
        }
        this.b.getRecordProxy().onRecordStarted(new CallRecordListener.RecordStartInfo(SessionRoomId.MainCall.INSTANCE, CallRecordDescriptionKt.toCallRecordDescription(parseRecordInfoFromParent$default)));
    }

    public final void handleStartRecord(JSONObject jSONObject) {
        SignalingRecordStartEvent parseStartNotification = this.a.parseStartNotification(jSONObject);
        if (parseStartNotification == null) {
            return;
        }
        this.b.getRecordProxy().onRecordStarted(new CallRecordListener.RecordStartInfo(parseStartNotification.getSessionRoomId(), CallRecordDescriptionKt.toCallRecordDescription(parseStartNotification.getRecordInfo())));
    }

    public final void handleStopRecord(JSONObject jSONObject) {
        SignalingRecordStopEvent parseStopNotification = this.a.parseStopNotification(jSONObject);
        if (parseStopNotification == null) {
            return;
        }
        this.b.getRecordProxy().onRecordStopped(new CallRecordListener.RecordStopInfo(parseStopNotification.getSessionRoomId(), parseStopNotification.getParticipant()));
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomRecordInfoListener
    public void onSessionRoomRecordInfo(CallSessionRoomRecordInfoListener.SessionRoomRecordInfoState sessionRoomRecordInfoState) {
        if (sessionRoomRecordInfoState.getRecordInfo() == null) {
            this.b.getRecordProxy().onRecordStopped(new CallRecordListener.RecordStopInfo(sessionRoomRecordInfoState.getSessionRoomId(), null));
        } else {
            this.b.getRecordProxy().onRecordStarted(new CallRecordListener.RecordStartInfo(sessionRoomRecordInfoState.getSessionRoomId(), CallRecordDescriptionKt.toCallRecordDescription(sessionRoomRecordInfoState.getRecordInfo())));
        }
    }
}
