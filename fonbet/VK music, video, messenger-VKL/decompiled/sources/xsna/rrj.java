package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class rrj implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;

    public /* synthetic */ rrj(int i, xzs xzsVar) {
        this.b = i;
        this.c = xzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$2((izs) this.c, jSONObject);
                break;
            default:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$0((gzs) this.c, jSONObject);
                break;
        }
    }
}
