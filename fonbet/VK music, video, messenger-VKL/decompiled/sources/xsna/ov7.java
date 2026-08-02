package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dt1;
import xsna.hzg;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ov7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ov7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mqv mqvVar;
        Integer num;
        String f;
        int i;
        CharSequence b;
        switch (this.b) {
            case 0:
                BookingActionResult bookingActionResult = (BookingActionResult) this.c;
                i7k0 i7k0Var = (i7k0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(i7k0Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1975343858, intValue, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsSnackbarHost.<anonymous> (BookingRecordsScreenMviView.kt:171)");
                    }
                    if (bookingActionResult == null) {
                        aVar.K(2122013183);
                        aVar.j();
                        mqvVar = null;
                    } else {
                        aVar.K(-70095294);
                        mqv a = bookingActionResult.a(aVar);
                        aVar.j();
                        mqvVar = a;
                    }
                    String message = i7k0Var.getMessage();
                    if (bookingActionResult == null || (i = BookingActionResult.b.$EnumSwitchMapping$0[bookingActionResult.ordinal()]) == 1) {
                        num = null;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num = Integer.valueOf(R.string.booking_service_cancellation_failure_description);
                    }
                    if (num == null) {
                        aVar.K(2122162479);
                        aVar.j();
                        f = null;
                    } else {
                        f = l4.f(aVar, 2122162480, num, aVar, 0);
                    }
                    okv0.b(wlb0.m(message, f, null, aVar, 4), null, mqvVar, null, null, aVar, 0, 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(54403613, intValue2, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewView.ThemedContent.<anonymous>.<anonymous> (CommunityCreateReviewView.kt:85)");
                }
                CharSequence charSequence = null;
                if (fm50Var instanceof hzg.c) {
                    aVar2.K(742268511);
                    zyg.a(null, aVar2, 0);
                    aVar2.j();
                } else if (fm50Var instanceof hzg.b) {
                    aVar2.K(1535601939);
                    hzg.b bVar = (hzg.b) fm50Var;
                    wh50 a2 = jk50.a(bVar.a, aVar2, 0, 3);
                    wh50 a3 = jk50.a(bVar.b, aVar2, 0, 3);
                    tlo0 tlo0Var = (tlo0) a2.getValue();
                    if (tlo0Var == null) {
                        aVar2.K(1535847644);
                        aVar2.j();
                        b = null;
                    } else {
                        aVar2.K(742280133);
                        b = tlo0Var.b(((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).getResources());
                        aVar2.j();
                    }
                    String valueOf = String.valueOf(b);
                    tlo0 tlo0Var2 = (tlo0) a3.getValue();
                    if (tlo0Var2 == null) {
                        aVar2.K(1535954780);
                    } else {
                        aVar2.K(742283589);
                        charSequence = tlo0Var2.b(((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).getResources());
                    }
                    aVar2.j();
                    String valueOf2 = String.valueOf(charSequence);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new ee1(izsVar, 2);
                        aVar2.R(x);
                    }
                    syg.a(0, aVar2, valueOf, valueOf2, (gzs) x, null);
                    aVar2.j();
                } else {
                    if (fm50Var instanceof hzg.a) {
                        aVar2.K(1536242895);
                        pyg.a(0, aVar2, (hzg.a) fm50Var, izsVar, null);
                    } else {
                        aVar2.K(1531717701);
                    }
                    aVar2.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 2:
                com.vk.voip.ui.groupcalls.list.primary.tab.b bVar2 = (com.vk.voip.ui.groupcalls.list.primary.tab.b) this.c;
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                bVar2.a();
                return s3q0.a;
            default:
                qa8 qa8Var = (qa8) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1450125143, intValue3, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsSuccess.<anonymous>.<anonymous>.<anonymous> (StorefrontAlbumsSuccess.kt:91)");
                    }
                    SpinnerState spinnerState = SpinnerState.Loading;
                    dt1.a.getClass();
                    zfr0.f(spinnerState, qa8Var.b(q630.a.a, dt1.a.f), null, 0L, null, null, aVar3, 6, 60);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
