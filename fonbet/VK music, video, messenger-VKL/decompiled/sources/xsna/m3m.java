package xsna;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m3m implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ m3m(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebViewEvent sendFocusChange$lambda$16;
        switch (this.b) {
            case 0:
                ((zak0) vsx.a).setValue(Boolean.valueOf(!this.c));
                boolean a = vsx.a();
                bqi.a = a;
                if (bqi.b.isInitialized()) {
                    bqi.a().setValue(Boolean.valueOf(a));
                }
                return s3q0.a;
            default:
                sendFocusChange$lambda$16 = WebViewAdPlayer.sendFocusChange$lambda$16(this.c);
                return sendFocusChange$lambda$16;
        }
    }
}
