package ru.ok.android.webrtc.asr;

import org.json.JSONObject;
import ru.ok.android.webrtc.listeners.CallAsrListener;
import ru.ok.android.webrtc.listeners.CallListeners;
import ru.ok.android.webrtc.listeners.CallSessionRoomAsrRecordListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.asr.AsrParser;
import ru.ok.android.webrtc.signaling.asr.CallAsrInfo;

/* loaded from: classes9.dex */
public final class CallAsrRecordManager implements CallSessionRoomAsrRecordListener {
    public final AsrParser a;
    public final CallListeners b;

    public CallAsrRecordManager(AsrParser asrParser, CallListeners callListeners) {
        this.a = asrParser;
        this.b = callListeners;
        callListeners.addSessionRoomAsrRecordInfoListener(this);
    }

    public final void handleAsrRecordInfoOnConnection(JSONObject jSONObject) {
        CallAsrInfo parseRecordInfoFromParent$default = AsrParser.parseRecordInfoFromParent$default(this.a, jSONObject, null, 2, null);
        if (parseRecordInfoFromParent$default == null) {
            return;
        }
        this.b.getAsrListenerProxy().onAsrRecordStarted(new CallAsrListener.AsrRecordStartInfo(SessionRoomId.MainCall.INSTANCE, parseRecordInfoFromParent$default));
    }

    public final void handleStartAsrRecord(JSONObject jSONObject) {
        AsrParser.StartAsrRecord parseStartNotification = this.a.parseStartNotification(jSONObject);
        if (parseStartNotification == null) {
            return;
        }
        this.b.getAsrListenerProxy().onAsrRecordStarted(new CallAsrListener.AsrRecordStartInfo(parseStartNotification.component1(), parseStartNotification.component2()));
    }

    public final void handleStopAsrRecord(JSONObject jSONObject) {
        AsrParser.StopAsrRecord parseStopNotification = this.a.parseStopNotification(jSONObject);
        if (parseStopNotification == null) {
            return;
        }
        this.b.getAsrListenerProxy().onAsrRecordStopped(new CallAsrListener.AsrRecordStopInfo(parseStopNotification.component1()));
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomAsrRecordListener
    public void onSessionRoomAsrRecordInfo(CallSessionRoomAsrRecordListener.SessionRoomAsrRecordState sessionRoomAsrRecordState) {
        CallAsrInfo callAsrInfo = sessionRoomAsrRecordState.getCallAsrInfo();
        if (callAsrInfo == null) {
            this.b.getAsrListenerProxy().onAsrRecordStopped(new CallAsrListener.AsrRecordStopInfo(sessionRoomAsrRecordState.getSessionRoomId()));
        } else {
            this.b.getAsrListenerProxy().onAsrRecordStarted(new CallAsrListener.AsrRecordStartInfo(sessionRoomAsrRecordState.getSessionRoomId(), callAsrInfo));
        }
    }
}
