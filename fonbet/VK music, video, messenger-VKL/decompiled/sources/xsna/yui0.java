package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class yui0 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yui0(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                ((SessionRoomAdminCommandExecutorImpl) this.d).parseErrorResponse("switchRoom", jSONObject, this.c);
                break;
            default:
                ((WatchTogetherCommandExecutorImpl) this.d).parseErrorResponse("stop", jSONObject, this.c);
                break;
        }
    }
}
