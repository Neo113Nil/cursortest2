package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zya implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zya(long j, kg50 kg50Var) {
        this.b = 1;
        this.c = j;
        this.d = kg50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                sxp sxpVar = (sxp) obj;
                ((com.vk.channels.impl.channel_screen.footer.f) obj2).getClass();
                boolean z = sxpVar instanceof w680;
                long j = this.c;
                break;
            case 1:
                oio oioVar = (oio) obj;
                int i2 = RedesignedClipsTopBar.N;
                oio.P(oioVar, this.c, 0L, 0L, ((kg50) obj2).getFloatValue(), null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                break;
            default:
                oio.C0((oio) obj, (Path) obj2, this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zya(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }
}
