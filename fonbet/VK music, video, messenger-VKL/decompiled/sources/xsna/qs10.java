package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class qs10 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ qs10(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$0(this.c, jSONObject);
                break;
            default:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$0(this.c, jSONObject);
                break;
        }
    }
}
