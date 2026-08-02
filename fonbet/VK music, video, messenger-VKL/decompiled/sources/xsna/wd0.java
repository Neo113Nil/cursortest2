package xsna;

import androidx.compose.runtime.a;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.profile.community.impl.ui.profile.d;
import xsna.gpp0;
import xsna.khw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class wd0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                ae0 ae0Var = (ae0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1429308440, intValue, -1, "com.vk.ads.impl.adchoice.AdChoicesBottomSheetRedesign.Content.<anonymous> (AdChoicesBottomSheetRedesign.kt:60)");
                    }
                    b5v0.a(gzsVar, null, null, null, kai.c(1635194955, new zd0(0, ae0Var, gzsVar), aVar), null, false, false, null, aVar, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                yg4.c((gzs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                dlv0 dlv0Var = (dlv0) this.c;
                wh50 wh50Var = (wh50) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(601741988, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenMviView.ThemedContent.<anonymous> (BookingRecordsScreenMviView.kt:86)");
                    }
                    wv7.c(dlv0Var, (BookingActionResult) wh50Var.getValue(), aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                wzs wzsVar = (wzs) this.c;
                VoipCallSource voipCallSource = (VoipCallSource) this.d;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                zqk0 zqk0Var = (zqk0) wzsVar.invoke((UserId) obj2, bool);
                if (zqk0Var != null) {
                    a201.b().a().d(new khw0.a(zqk0Var, voipCallSource, null, null, null, 28));
                    break;
                } else {
                    break;
                }
            case 4:
                String str = (String) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                gzg.a(ne7.I(1), (androidx.compose.runtime.a) obj, str, izsVar);
                break;
            case 5:
                ((gjh) this.c).c.invoke(new d.t.a.e((f5u) this.d, ((Boolean) obj).booleanValue()));
                break;
            case 6:
                ((Integer) obj2).getClass();
                nix.a((fw20) this.c, (wzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((j8d0) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                AboutVideoItem.a0 a0Var = (AboutVideoItem.a0) this.c;
                gpp0.a aVar3 = (gpp0.a) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-620903450, intValue3, -1, "com.vk.video.ui.discovery.minimizable.banner_trap.TrapBannerDelegate.ViewHolder.<anonymous>.<anonymous>.<anonymous> (TrapBannerDelegate.kt:63)");
                    }
                    boolean y = aVar4.y(aVar3) | aVar4.y(a0Var);
                    Object x = aVar4.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new eg1(17, aVar3, a0Var);
                        aVar4.R(x);
                    }
                    gzs gzsVar2 = (gzs) x;
                    boolean y2 = aVar4.y(aVar3);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new m5o0(aVar3, 3);
                        aVar4.R(x2);
                    }
                    hpp0.a(a0Var, gzsVar2, (gzs) x2, null, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wd0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
