package xsna;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class thl implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ thl(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebViewEvent sendMuteChange$lambda$14;
        switch (this.b) {
            case 0:
                return zhy0.a("initial tunnel state is ", this.c);
            default:
                sendMuteChange$lambda$14 = WebViewAdPlayer.sendMuteChange$lambda$14(this.c);
                return sendMuteChange$lambda$14;
        }
    }
}
