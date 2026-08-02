package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.voip.VoipCallActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nfc0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;

    public /* synthetic */ nfc0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                int i = PostingFragment.L0;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Temporary files copies deleted"});
                    break;
                }
                break;
            default:
                int i2 = VoipCallActivity.P;
                L.l(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
                break;
        }
    }
}
