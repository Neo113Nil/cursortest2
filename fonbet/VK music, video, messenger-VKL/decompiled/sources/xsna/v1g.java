package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v1g implements a0t {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2 = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        char c = 1;
        Object obj6 = this.c;
        switch (i2) {
            case 0:
                VideoFile videoFile = (VideoFile) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lds0 lds0Var = (lds0) obj2;
                q630 q630Var = (q630) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                int i3 = com.vk.attachpicker.collages.a.k1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1297546910, intValue, -1, "com.vk.attachpicker.collages.CollageOnboardingBottomSheet.ThemedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollageOnboardingBottomSheet.kt:66)");
                }
                boolean y = aVar.y(lds0Var);
                Object x = aVar.x();
                if (y || x == c0012a) {
                    x = new lb(lds0Var, 27);
                    aVar.R(x);
                }
                izs izsVar = (izs) x;
                boolean y2 = aVar.y(lds0Var);
                Object x2 = aVar.x();
                if (y2 || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.observable.k(lds0Var, 25);
                    aVar.R(x2);
                }
                izs izsVar2 = (izs) x2;
                boolean y3 = aVar.y(lds0Var);
                Object x3 = aVar.x();
                if (y3 || x3 == c0012a) {
                    x3 = new hq5(lds0Var, 3);
                    aVar.R(x3);
                }
                wzs wzsVar = (wzs) x3;
                boolean y4 = aVar.y(lds0Var);
                Object x4 = aVar.x();
                if (y4 || x4 == c0012a) {
                    x4 = new com.vk.movika.sdk.base.observable.m(lds0Var, 29);
                    aVar.R(x4);
                }
                izs izsVar3 = (izs) x4;
                boolean y5 = aVar.y(lds0Var);
                Object x5 = aVar.x();
                if (y5 || x5 == c0012a) {
                    x5 = new wze(lds0Var, c == true ? 1 : 0);
                    aVar.R(x5);
                }
                izs izsVar4 = (izs) x5;
                boolean y6 = aVar.y(lds0Var);
                Object x6 = aVar.x();
                if (y6 || x6 == c0012a) {
                    x6 = new com.vk.movika.tools.controls.seekbar.q(lds0Var, r4);
                    aVar.R(x6);
                }
                gdu0.a(videoFile, q630Var, null, false, booleanValue, null, izsVar, null, null, izsVar2, null, null, wzsVar, izsVar3, izsVar4, (wzs) x6, null, aVar, ((intValue >> 3) & 112) | 3072 | ((intValue << 12) & 57344), 69028);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                gzs gzsVar = (gzs) obj6;
                qa8 qa8Var = (qa8) obj;
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(qa8Var) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 384) == 0) {
                    i |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                }
                if (aVar2.t(i & 1, (i & 1155) != 1154)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2064448072, i, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryItemView.<anonymous> (ImageGalleryDisplayModeCell.kt:63)");
                    }
                    dt1.a.getClass();
                    q630 b = qa8Var.b(q630.a.a, dt1.a.f);
                    boolean J = aVar2.J(gzsVar);
                    Object x7 = aVar2.x();
                    if (J || x7 == c0012a) {
                        x7 = new xiw(0, gzsVar);
                        aVar2.R(x7);
                    }
                    vjw.a(lg90Var, null, ojc.c(b, false, null, null, (gzs) x7, 15), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 24632 | ((i >> 6) & 14), 104);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                int intValue4 = ((Integer) obj3).intValue();
                int intValue5 = ((Integer) obj4).intValue();
                int intValue6 = ((Integer) obj5).intValue();
                q9f0 q9f0Var = ((akw0) obj6).e;
                if (q9f0Var != null) {
                    q9f0Var.a(intValue3, intValue4, intValue5, intValue6);
                }
                break;
        }
        return s3q0.a;
    }
}
