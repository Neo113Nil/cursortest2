package xsna;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class har implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ har(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebViewEvent onBroadcastEvent$lambda$21;
        switch (this.b) {
            case 0:
                return go9.b("constructor: directoryName= ", this.c);
            default:
                onBroadcastEvent$lambda$21 = WebViewAdPlayer.onBroadcastEvent$lambda$21(this.c);
                return onBroadcastEvent$lambda$21;
        }
    }
}
