package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.a;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import java.util.WeakHashMap;
import xsna.mr3;
import xsna.q630;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class er3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ er3(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        izs<? super br3, s3q0> izsVar = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((fr3) obj4).h((mr3.a) obj3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((pn7) obj4).l((tn7) obj3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mt7.a((BookingButton) obj4, (q630) obj3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                BookingServicesScreenKt.j((a.InterfaceC0987a.C0988a) obj4, (BookingServiceType) obj3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                his.a((jis) obj4, izsVar, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                cic0 cic0Var = (cic0) obj4;
                wpc0<?> wpc0Var = (wpc0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1065149530, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (PostingOtherStepsContentView.kt:107)");
                    }
                    int i2 = ComposeView.n;
                    cic0Var.o(wpc0Var, izsVar, aVar, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                kdh0 kdh0Var = (kdh0) obj4;
                Context context = (Context) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-780457245, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Root.<anonymous>.<anonymous> (Root.kt:51)");
                    }
                    String obj5 = kdh0Var.e().a(context).toString();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-675090670, 6, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
                    }
                    WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                    te2 te2Var = yqx0.a.c(aVar2).f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    img0.b(0, aVar2, obj5, izsVar, tci.y(q630.a.a, te2Var));
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

    public /* synthetic */ er3(Object obj, izs izsVar, int i, Object obj2) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    public /* synthetic */ er3(jis jisVar, izs izsVar, q630 q630Var, int i) {
        this.b = 4;
        this.d = jisVar;
        this.c = izsVar;
        this.e = q630Var;
    }
}
