package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.log.L;
import com.vk.voip.VoipCallActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pex implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ pex(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                int i = qex.x;
                break;
            default:
                int i2 = VoipCallActivity.P;
                L.l(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                break;
        }
    }
}
