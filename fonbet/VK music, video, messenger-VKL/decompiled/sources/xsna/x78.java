package xsna;

import android.content.Context;
import android.util.TypedValue;
import com.vk.libvideo.adfree.impl.ui.entity.BottomSheetViewState;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x78 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x78(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                BottomSheetViewState bottomSheetViewState = (BottomSheetViewState) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-919299299, intValue, -1, "com.vk.libvideo.adfree.impl.ui.view.BottomSheetContentView.<anonymous> (BottomSheetContentView.kt:46)");
                    }
                    z78.b(bottomSheetViewState, izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.events.d.e((CommunityEventsState) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((njl) obj4).f((AuthorHeaderConfig.Header.Main.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                dz5.a((buw) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(24577));
                break;
            case 4:
                Context context = (Context) obj4;
                la10 la10Var = (la10) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-867026959, intValue2, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketPickerPageController.<anonymous> (MarketMultiPickerPageController.kt:81)");
                    }
                    TypedValue typedValue = krv0.a;
                    rrv0.e(epx.f(krv0.i(context), Boolean.TRUE), null, null, null, null, null, kai.c(-1785335852, new bo3(la10Var, 11), aVar2), aVar2, 1572864, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                ((wh50) obj3).setValue(Boolean.valueOf(!((Boolean) r7.getValue()).booleanValue()));
                ((wzs) obj4).invoke(num, obj2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x78(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }
}
