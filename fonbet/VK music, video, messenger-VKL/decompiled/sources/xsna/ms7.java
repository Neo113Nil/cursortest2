package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ms7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ms7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-544740630, intValue, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.BookingPreloaderScreen.<anonymous> (BookingPreloaderScreen.kt:63)");
                    }
                    String N = d370.N(R.string.booking_accessability_back, 0, aVar);
                    com.vk.core.compose.component.semantics.a b = cq.b("back_button", null, 3);
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    Object obj3 = a.C0011a.a;
                    if (J || x == obj3) {
                        x = new m74(izsVar, 1);
                        aVar.R(x);
                    }
                    TopBar$Before.e a = e.a.a((gzs) x, N, null, null, b, aVar, 196608, 12);
                    TopBar$Middle.a aVar2 = TopBar$Middle.a.c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b2 = or.b(aVar, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N2 = d370.N(R.string.booking_accessability_close, 0, aVar);
                    boolean J2 = aVar.J(izsVar);
                    Object x2 = aVar.x();
                    if (J2 || x2 == obj3) {
                        x2 = new os7(izsVar, 0);
                        aVar.R(x2);
                    }
                    muv0.h(aVar2, null, null, null, a, null, d.a.a(d.c.C0760d.a.a(b2, N2, (gzs) x2, null, null, null, aVar, 1572872, 56), null, null, cq.b("close_button", null, 3), aVar, 24576, 6), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 6, 0, 8110);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(990040601, intValue2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreen.<anonymous> (SettingsScreen.kt:54)");
                    }
                    n3j0.e(0, aVar3, this.c, null);
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
}
