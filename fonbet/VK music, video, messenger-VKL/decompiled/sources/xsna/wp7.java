package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.o;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wp7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ mtk0 g;

    public /* synthetic */ wp7(Object obj, Object obj2, Object obj3, Object obj4, wh50 wh50Var, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                final com.vk.ecomm.onlinebooking.impl.edit.q qVar = (com.vk.ecomm.onlinebooking.impl.edit.q) this.c;
                final yp7 yp7Var = (yp7) this.d;
                gq7 gq7Var = (gq7) this.e;
                final izs izsVar = (izs) this.f;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(s890Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-137918524, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.ThemedContent.<anonymous> (BookingEditScreenMviView.kt:112)");
                    }
                    yzt0<wow<BookingEditScreenState.g>> yzt0Var = qVar.f;
                    yzt0<BookingEditScreenState.c> yzt0Var2 = qVar.g;
                    final List<T> list = ((wow) jk50.c(yzt0Var, aVar).getValue()).b;
                    final String str = (String) jk50.c(qVar.j, aVar).getValue();
                    final BookingEditScreenState.c cVar = (BookingEditScreenState.c) jk50.c(yzt0Var2, aVar).getValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(230602542, 64, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.getDateSeparatorModifier (BookingEditScreenMviView.kt:193)");
                    }
                    q630 q630Var = ((BookingEditScreenState.c) jk50.c(yzt0Var2, aVar).getValue()).c > 0 ? yp7Var.i : yp7Var.j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    BookingMaster bookingMaster = ((BookingEditScreenState.e) jk50.c(qVar.e, aVar).getValue()).b;
                    String str2 = bookingMaster != null ? bookingMaster.j : null;
                    Object obj4 = a.C0011a.a;
                    if (gq7Var == null) {
                        aVar.K(1553377250);
                        q630 C = s200.C(yp7Var.f, s890Var);
                        boolean y = aVar.y(yp7Var) | aVar.J(qVar) | aVar.J(izsVar) | aVar.J(q630Var) | aVar.J(list) | aVar.J(str) | aVar.J(cVar) | aVar.J(str2);
                        final mtk0 mtk0Var = this.g;
                        boolean J = y | aVar.J(mtk0Var);
                        Object x = aVar.x();
                        if (J || x == obj4) {
                            final q630 q630Var2 = q630Var;
                            final String str3 = str2;
                            Object obj5 = new izs() { // from class: xsna.xp7
                                @Override // xsna.izs
                                public final Object invoke(Object obj6) {
                                    nvy nvyVar = (nvy) obj6;
                                    com.vk.ecomm.onlinebooking.impl.edit.q qVar2 = qVar;
                                    final yzt0<BookingEditScreenState.e> yzt0Var3 = qVar2.e;
                                    final izs izsVar2 = izsVar;
                                    nvy.g(nvyVar, "master-block", null, new jai(-303596131, new yzs() { // from class: xsna.up7
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj8;
                                            int intValue2 = ((Integer) obj9).intValue();
                                            if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-303596131, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.addMasterBlockCell.<anonymous> (BookingEditScreenMviView.kt:200)");
                                                }
                                                wh50 c = jk50.c(yzt0.this, aVar2);
                                                BookingMaster bookingMaster2 = ((BookingEditScreenState.e) c.getValue()).b;
                                                com.vk.core.compose.component.cell.content.y0 y0Var = null;
                                                if (((BookingEditScreenState.e) c.getValue()).a) {
                                                    aVar2.K(301898909);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                                                    }
                                                    lg90 a = pg90.a(R.drawable.vk_icon_edit_outline_28, 0, aVar2);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                    }
                                                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    long j = ylu0Var.getIcon().n;
                                                    String N = d370.N(R.string.booking_edit_accessibility_change_master, 0, aVar2);
                                                    float f = 28;
                                                    long b = byc0.b(f, f);
                                                    com.vk.core.compose.component.semantics.a b2 = cq.b("edit_master", null, 3);
                                                    izs izsVar3 = izsVar2;
                                                    boolean J2 = aVar2.J(izsVar3);
                                                    Object x2 = aVar2.x();
                                                    if (J2 || x2 == a.C0011a.a) {
                                                        x2 = new wn1(izsVar3, 1);
                                                        aVar2.R(x2);
                                                    }
                                                    y0Var = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a, j, b, N, (gzs) x2, b2, aVar2, 1573256, 0), null, null, null, aVar2, 61);
                                                    aVar2 = aVar2;
                                                    aVar2.j();
                                                } else {
                                                    aVar2.K(769460448);
                                                    aVar2.j();
                                                }
                                                com.vk.core.compose.component.cell.content.y0 y0Var2 = y0Var;
                                                f9t.e(txj0.q(q630.a.a, 7), aVar2, 6);
                                                if (bookingMaster2 == null) {
                                                    aVar2.K(769548706);
                                                    pm7.a(null, y0Var2, null, aVar2, 0, 5);
                                                    aVar2.j();
                                                } else {
                                                    aVar2.K(769621525);
                                                    vq7.a(bookingMaster2, null, y0Var2, aVar2, 0, 2);
                                                    aVar2.j();
                                                }
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar2.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 2);
                                    final yp7 yp7Var2 = yp7.this;
                                    yp7.j(yp7Var2, nvyVar, "sep-1");
                                    nvy.g(nvyVar, "time", null, new jai(1000459567, new sp7(0, qVar2.g, izsVar2), true), 2);
                                    nvy.g(nvyVar, "sep-2", null, new jai(-1841774146, new op7(q630Var2, 0), true), 2);
                                    nvy.g(nvyVar, "services-title", null, new jai(-601002076, new com.vk.friends.requests.impl.allrequests.presentation.a(izsVar2, 1), true), 2);
                                    List list2 = list;
                                    final wow wowVar = new wow(list2);
                                    int size = list2.size();
                                    sa saVar = new sa(wowVar, 10);
                                    final BookingEditScreenState.c cVar2 = cVar;
                                    final String str4 = str;
                                    nvy.c(nvyVar, size, saVar, new jai(220093544, new zzs() { // from class: xsna.qp7
                                        @Override // xsna.zzs
                                        public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                            String str5;
                                            com.vk.core.compose.component.cell.content.y0 y0Var;
                                            int intValue2 = ((Integer) obj8).intValue();
                                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj9;
                                            int intValue3 = ((Integer) obj10).intValue();
                                            if ((intValue3 & 48) == 0) {
                                                intValue3 |= aVar2.o(intValue2) ? 32 : 16;
                                            }
                                            if (aVar2.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(220093544, intValue3, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.addServicesCell.<anonymous> (BookingEditScreenMviView.kt:228)");
                                                }
                                                BookingEditScreenState.g gVar = (BookingEditScreenState.g) wow.this.b.get(intValue2);
                                                if (intValue2 > 0) {
                                                    aVar2.K(-1608222308);
                                                    f9t.e(yp7Var2.h, aVar2, 0);
                                                } else {
                                                    aVar2.K(-1618537062);
                                                }
                                                aVar2.j();
                                                q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7);
                                                BookingServiceModel bookingServiceModel = gVar.b;
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-328937632, 64, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.getCapacity (BookingEditScreenMviView.kt:370)");
                                                }
                                                aVar2.K(1718519089);
                                                BookingEditScreenState.c cVar3 = cVar2;
                                                Integer num = cVar3.d;
                                                Integer num2 = cVar3.e;
                                                if (num == null || num2 == null) {
                                                    str5 = null;
                                                } else {
                                                    int intValue4 = num2.intValue();
                                                    int intValue5 = num.intValue();
                                                    int i = intValue5 - intValue4;
                                                    str5 = d370.F(R.plurals.booking_group_service_capacity, i, new Object[]{Integer.valueOf(i), Integer.valueOf(intValue5)}, aVar2, 0);
                                                }
                                                aVar2.j();
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                if (gVar.a) {
                                                    aVar2.K(1056513673);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1369856538, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline28> (VkSdkIcons.kt:630)");
                                                    }
                                                    lg90 b = or.b(aVar2, -1382946425, R.drawable.vk_icon_delete_outline_28, aVar2, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                    }
                                                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    long j = ylu0Var.getIcon().n;
                                                    String N = d370.N(R.string.booking_edit_accessibility_remove_service, 0, aVar2);
                                                    float f = 28;
                                                    long b2 = byc0.b(f, f);
                                                    com.vk.core.compose.component.semantics.a b3 = cq.b("remove_service", null, 3);
                                                    izs izsVar3 = izsVar2;
                                                    boolean J2 = aVar2.J(izsVar3) | aVar2.y(gVar);
                                                    Object x2 = aVar2.x();
                                                    if (J2 || x2 == a.C0011a.a) {
                                                        x2 = new cy0(3, izsVar3, gVar);
                                                        aVar2.R(x2);
                                                    }
                                                    com.vk.core.compose.component.cell.content.y0 a = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b, j, b2, N, (gzs) x2, b3, aVar2, 1573256, 0), null, null, null, aVar2, 61);
                                                    aVar2.j();
                                                    y0Var = a;
                                                } else {
                                                    aVar2.K(-1607192427);
                                                    aVar2.j();
                                                    y0Var = null;
                                                }
                                                uw7.b(bookingServiceModel, str4, H, y0Var, null, false, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, str5, aVar2, 12583296, 880);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar2.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, true), 4);
                                    yp7.j(yp7Var2, nvyVar, "sep-3");
                                    String str5 = str3;
                                    if (str5 != null) {
                                        nvy.g(nvyVar, "master-address-title", null, ubi.a, 2);
                                        nvy.g(nvyVar, "master-address", null, new jai(-1304691880, new rp7(str5, 0), true), 2);
                                        yp7.j(yp7Var2, nvyVar, "sep-4");
                                    }
                                    nvy.g(nvyVar, "info-block", null, new jai(776778110, new pp7(qVar2.i, mtk0Var, izsVar2, 0), true), 2);
                                    yzt0<BookingEditScreenState.f> yzt0Var4 = qVar2.k;
                                    yp7.j(yp7Var2, nvyVar, "sep-5");
                                    nvy.g(nvyVar, "notification-block", null, new jai(-1554147276, new tp7(0, yzt0Var4, izsVar2), true), 2);
                                    yzt0<BookingEditScreenState.b> yzt0Var5 = qVar2.l;
                                    yp7.j(yp7Var2, nvyVar, "sep-6");
                                    nvy.g(nvyVar, "consent-personal-data-block", null, new jai(1958468889, new np7(0, yzt0Var5, izsVar2), true), 2);
                                    nvy.g(nvyVar, "bot-spacer", null, new jai(-953666092, new un7(yp7Var2, 1), true), 2);
                                    return s3q0.a;
                                }
                            };
                            aVar.R(obj5);
                            x = obj5;
                        }
                        lqy.a(C, null, null, null, null, null, false, null, (izs) x, aVar, 0, 510);
                        aVar.j();
                    } else {
                        aVar.K(1554555591);
                        com.vk.ecomm.onlinebooking.impl.common.a c = com.vk.ecomm.onlinebooking.impl.common.b.c(gq7Var.a);
                        boolean J2 = aVar.J(izsVar) | aVar.J(gq7Var);
                        Object x2 = aVar.x();
                        if (J2 || x2 == obj4) {
                            x2 = new vf1(2, izsVar, gq7Var);
                            aVar.R(x2);
                        }
                        iq7.a(c, (gzs) x2, aVar, 0);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                sgx sgxVar = (sgx) this.c;
                wh50 wh50Var = (wh50) this.d;
                jai jaiVar = (jai) this.e;
                wh50 wh50Var2 = (wh50) this.f;
                wh50 wh50Var3 = (wh50) this.g;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-281528422, intValue2, -1, "com.vk.core.compose.component.internal.InternalDropdownPopup.<anonymous>.<anonymous> (InternalDropdown.kt:196)");
                    }
                    bi50<Boolean> bi50Var = sgxVar.i;
                    q630 q630Var3 = sgxVar.c;
                    r5j0 r5j0Var = sgxVar.g;
                    gzs<agw> gzsVar = sgxVar.j;
                    pco pcoVar = (pco) wh50Var2.getValue();
                    float f = ((pco) wh50Var3.getValue()).b;
                    rgx.c(bi50Var, wh50Var, gzsVar, q630Var3, r5j0Var, pcoVar, 0, jaiVar, aVar2, 48, 0);
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
}
