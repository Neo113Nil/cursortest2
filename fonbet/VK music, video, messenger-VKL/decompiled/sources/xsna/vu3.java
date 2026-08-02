package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class vu3 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;

    public /* synthetic */ vu3(int i, xzs xzsVar) {
        this.b = i;
        this.c = xzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$0((gzs) this.c, jSONObject);
                break;
            default:
                UrlSharingCommandsExecutorImpl.stop$lambda$1((izs) this.c, jSONObject);
                break;
        }
    }
}
