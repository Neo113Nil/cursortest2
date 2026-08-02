package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class xui0 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;

    public /* synthetic */ xui0(int i, xzs xzsVar) {
        this.b = i;
        this.c = xzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$0((gzs) this.c, jSONObject);
                break;
            case 1:
                WatchTogetherCommandExecutorImpl.stop$lambda$0((gzs) this.c, jSONObject);
                break;
            default:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$1((izs) this.c, jSONObject);
                break;
        }
    }
}
