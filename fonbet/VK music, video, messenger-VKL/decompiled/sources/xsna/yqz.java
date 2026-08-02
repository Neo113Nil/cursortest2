package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.dz40;
import xsna.kdh0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class yqz implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yqz(izs izsVar, mtk0 mtk0Var) {
        this.c = izsVar;
        this.d = mtk0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                kdh0.a aVar = (kdh0.a) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1157180999, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.upperSettingsItems.<anonymous> (Loaded.kt:152)");
                    }
                    com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.a.a(aVar.h, this.c, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar.g != null ? 2 : 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(q630Var) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-420685885, intValue2, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:195)");
                    }
                    due0.a((dz40.h) mtk0Var.getValue(), this.c, q630Var, aVar3, (intValue2 << 6) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yqz(kdh0.a aVar, izs izsVar) {
        this.d = aVar;
        this.c = izsVar;
    }
}
