package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.utils.Consumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class yu3 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yu3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                AsrCommandsExecutorImpl.stopRecord$lambda$1((izs) this.c, jSONObject);
                break;
            default:
                ((Consumer) this.c).accept(null);
                break;
        }
    }
}
