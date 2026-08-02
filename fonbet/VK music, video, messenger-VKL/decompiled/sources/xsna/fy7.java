package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.subscription.api.SubscribeStatus;
import xsna.jbb0;
import xsna.ttg;
import xsna.yre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fy7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fy7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                BookingServicesScreenKt.a((z37) this.c, (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                UIBlockList uIBlockList = (UIBlockList) obj;
                c2e.b(uIBlockList, new bta((c2e) this.c, (UserId) this.d, (SubscribeStatus) this.e));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((b0f) this.c).g((c0f) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((otg) this.c).h((ttg.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                String str = (String) this.c;
                String str2 = (String) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-888460786, intValue, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticle.<anonymous>.<anonymous> (DzenArticleScreen.kt:23)");
                    }
                    eso.a(str, str2, izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                xyo xyoVar = (xyo) this.c;
                Activity activity = (Activity) this.d;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.e;
                xyoVar.b.j(bwt0.u(activity), (View) obj, clipVideoFile, new sy4(clipVideoFile, (izs) obj2, xyoVar, 3));
                break;
            case 6:
                ((Integer) obj2).getClass();
                e6t.a((g6t) this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pxu.b((yre.a) this.c, (izs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((wab0) this.c).i((jbb0.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((com.vk.newsfeed.posting.privacy_picker.presentation.a) this.c).h((lfd0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 10:
                gzs gzsVar = (gzs) this.e;
                gzs gzsVar2 = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                gud0.b(ne7.I(385), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                ((zph0) this.c).j((com.vk.search.params.impl.presentation.modal.database.mvi.model.b) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fy7(int i, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        this.b = 10;
        this.e = gzsVar;
        this.c = gzsVar2;
        this.d = q630Var;
    }

    public /* synthetic */ fy7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
