package ru.ok.android.webrtc.signaling.urlsharing;

import org.json.JSONObject;
import ru.ok.android.webrtc.listeners.CallUrlSharingListener;
import ru.ok.android.webrtc.listeners.proxy.UrlSharingListenerProxy;

/* loaded from: classes9.dex */
public final class UrlSharingHandler {
    public final UrlSharingListenerProxy a;
    public final UrlSharingParser b;

    public UrlSharingHandler(UrlSharingListenerProxy urlSharingListenerProxy, UrlSharingParser urlSharingParser) {
        this.a = urlSharingListenerProxy;
        this.b = urlSharingParser;
    }

    public final void handleUrlSharingInfoFromObject(JSONObject jSONObject) {
        RoomSignalingUrlSharingInfo parseRoomUrlSharingInfoFromParent = this.b.parseRoomUrlSharingInfoFromParent(jSONObject);
        if (parseRoomUrlSharingInfoFromParent == null) {
            return;
        }
        this.a.onUrlSharingInfoUpdated(new CallUrlSharingListener.UrlSharingState(parseRoomUrlSharingInfoFromParent.getRoomId(), parseRoomUrlSharingInfoFromParent.getUrl() != null ? new SignalingUrlSharingInfo(parseRoomUrlSharingInfoFromParent.getInitiator(), parseRoomUrlSharingInfoFromParent.getUrl()) : null));
    }

    public final void onInfoUpdated(JSONObject jSONObject) {
        RoomSignalingUrlSharingInfo parseRoomUrlSharingInfo = this.b.parseRoomUrlSharingInfo(jSONObject);
        if (parseRoomUrlSharingInfo == null) {
            return;
        }
        this.a.onUrlSharingInfoUpdated(new CallUrlSharingListener.UrlSharingState(parseRoomUrlSharingInfo.getRoomId(), parseRoomUrlSharingInfo.getUrl() != null ? new SignalingUrlSharingInfo(parseRoomUrlSharingInfo.getInitiator(), parseRoomUrlSharingInfo.getUrl()) : null));
    }
}
