package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3b0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w3b0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j;
        switch (this.b) {
            case 0:
                a4b0 a4b0Var = (a4b0) this.c;
                String str = (String) this.d;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(izsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1872909602, intValue, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.NormalizationMenuItem.<anonymous>.<anonymous>.<anonymous> (PlayerSettingsMviView.kt:367)");
                    }
                    if (a4b0Var.g) {
                        aVar.K(274835495);
                        aVar.j();
                        j = l5g.b;
                    } else {
                        aVar.K(274836493);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().m;
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, izsVar, wuv0Var.N, aVar, 0, (intValue << 6) & 896, 4090);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                jai jaiVar = (jai) this.c;
                s890 s890Var = (s890) this.d;
                xb90 xb90Var = (xb90) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1405405670, intValue2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingContent.<anonymous>.<anonymous> (SlidingContent.kt:90)");
                }
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                jaiVar.invoke(xb90Var, s200.H(q630.a.a, s890Var.c(layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s200.r(s890Var, layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), num, aVar2, Integer.valueOf(((intValue2 << 3) & 896) | (intValue2 & 14)));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
