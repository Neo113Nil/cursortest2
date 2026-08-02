package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class a19 implements Signaling.Listener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a19(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        switch (this.b) {
            case 0:
                ((Runnable) this.c).run();
                break;
            default:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$0((gzs) this.c, jSONObject);
                break;
        }
    }
}
