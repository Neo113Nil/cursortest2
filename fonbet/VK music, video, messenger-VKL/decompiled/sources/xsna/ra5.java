package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ra5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ra5(int i, bc90 bc90Var, mc90 mc90Var, int i2) {
        this.b = 0;
        this.c = i;
        this.d = bc90Var;
        this.e = mc90Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xa5.g(this.c, (bc90) this.d, (mc90) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                vz7.g((dlv0) this.d, (o.a) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((hr8) this.d).d((ButtonSize) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ybo.e((cco) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.video.videocell.a.b((VideoCellViewState.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1), this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.h((VideoMetaViewState.f) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                tra0.a aVar = (tra0.a) this.d;
                jai jaiVar = (jai) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1103777544, intValue, -1, "com.vk.core.compose.component.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkScaffold.kt:142)");
                    }
                    jaiVar.invoke(s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.j1(this.c), 7), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ra5(VideoCellViewState.a aVar, q630 q630Var, int i, int i2) {
        this.b = 4;
        this.d = aVar;
        this.e = q630Var;
        this.c = i2;
    }

    public /* synthetic */ ra5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ ra5(tra0.a aVar, int i, jai jaiVar) {
        this.b = 6;
        this.d = aVar;
        this.c = i;
        this.e = jaiVar;
    }
}
