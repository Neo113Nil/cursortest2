package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.market.good.ui.ProductActionButton;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import java.util.List;
import xsna.hv70;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jn7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((pn7) this.c).j((String) this.d, (androidx.compose.runtime.a) obj, ne7.I(65));
                break;
            case 1:
                com.vk.ecomm.onlinebooking.impl.services.presentation.model.a aVar = (com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(649846321, intValue, -1, "com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesView.<anonymous> (BookingServicesScreen.kt:145)");
                    }
                    BookingServicesScreenKt.c(aVar, izsVar, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                b8d.b((c8d) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                khf.c(ne7.I(49), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 4:
                List list = (List) this.c;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                n0h.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                zsp.a((ysp) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                t8s.q((fxt0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 7:
                ((Integer) obj2).getClass();
                xa50.c(this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                cv70.d((hv70.a) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ProductActionButton productActionButton = (ProductActionButton) this.c;
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1739101043, intValue2, -1, "com.vk.ecomm.market.good.ui.ProductButtonsBinderImpl.bindButton.<anonymous> (ProductButtonsBinderImpl.kt:248)");
                    }
                    String obj3 = productActionButton.a.toString();
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean y = aVar3.y(eVar);
                    Object x = aVar3.x();
                    if (y || x == a.C0011a.a) {
                        x = new ajd0(eVar, 0);
                        aVar3.R(x);
                    }
                    bjd0.a(obj3, buttonAppearance, (gzs) x, aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((bdn0) this.c).h6((jdj0) this.d, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            case 11:
                d.b.a aVar4 = (d.b.a) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(223011217, intValue3, -1, "com.vk.core.compose.component.topbar.TopBar.After.Extra.Icon.Content.<anonymous>.<anonymous>.<anonymous> (TopBar.kt:1847)");
                    }
                    com.vk.core.compose.component.topbar.l.a((com.vk.core.compose.component.topbar.k) ((zak0) aVar4.c).getValue(), (gzs) ((zak0) aVar4.g).getValue(), (lg90) ((zak0) aVar4.d).getValue(), (String) ((zak0) aVar4.f).getValue(), mtk0Var, q630.a.a, (l5g) ((zak0) aVar4.e).getValue(), null, aVar5, 197120, 128);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.i((VideoMetaViewState.g) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            default:
                d0l d0lVar = (d0l) this.c;
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1801637401, intValue4, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous>.<anonymous> (VkDateTimePicker.kt:91)");
                    }
                    boolean z = d0lVar.f() != null;
                    boolean J = aVar6.J(d0lVar) | aVar6.J(dateTimePickerState);
                    Object x2 = aVar6.x();
                    if (J || x2 == a.C0011a.a) {
                        x2 = new d7s0(4, d0lVar, dateTimePickerState);
                        aVar6.R(x2);
                    }
                    bqv0.d(0, 0, aVar6, (gzs) x2, z);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jn7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
