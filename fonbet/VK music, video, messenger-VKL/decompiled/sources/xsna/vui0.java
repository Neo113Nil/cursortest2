package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class vui0 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ vui0(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                SessionRoomAdminCommandExecutorImpl.removeRooms$lambda$0(this.c, jSONObject);
                break;
            default:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$0(this.c, jSONObject);
                break;
        }
    }
}
