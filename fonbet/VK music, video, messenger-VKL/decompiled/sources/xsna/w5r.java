package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class w5r implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ w5r(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$0(this.c, jSONObject);
                break;
            default:
                UrlSharingCommandsExecutorImpl.start$lambda$0(this.c, jSONObject);
                break;
        }
    }
}
