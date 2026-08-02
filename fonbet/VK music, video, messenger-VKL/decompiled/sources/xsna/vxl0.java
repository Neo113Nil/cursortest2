package xsna;

import android.util.LruCache;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.voip.ui.di.VoipFirstCallCacheStubComponent;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vxl0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vxl0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new cyl0(1080, 1920);
            case 1:
                return s3q0.a;
            case 2:
                return new LruCache(12);
            case 3:
                int i = VKAvatarView.r;
                StoriesFeatures storiesFeatures = StoriesFeatures.SAFE_UPDATE;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 4:
                bpn0 bpn0Var = o25.a;
                return new sql(bpn0Var != null ? bpn0Var : null);
            case 5:
                return new aru();
            case 6:
                return VkCell.Left.c.Companion.serializer();
            case 7:
                throw null;
            case 8:
                return (ScheduledExecutorService) jfv0.n.getValue();
            case 9:
                qcy<Object>[] qcyVarArr = VoipFirstCallCacheStubComponent.b;
                return new how0();
            case 10:
                o2l.a.getClass();
                boolean z = false;
                if (o2l.b("__dbg_call_webrtc_sdp_munging", false) && o2l.b("__dbg_call_webrtc_sdp_filtering", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                com.vk.voip.ui.c.b.B0();
                return s3q0.a;
        }
    }
}
