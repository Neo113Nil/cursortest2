package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.dz40;
import xsna.pn7;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class en7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ en7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                BookingCalendarScreenState.TimeSlotSelector.Block block = (BookingCalendarScreenState.TimeSlotSelector.Block) this.c;
                pn7 pn7Var = (pn7) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1521588223, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.timeSlotTable.<anonymous> (BookingCalendarScreenMviView.kt:357)");
                    }
                    int i3 = pn7.b.$EnumSwitchMapping$0[block.a.ordinal()];
                    if (i3 == 1) {
                        i = 1957405487;
                        i2 = R.string.booking_time_night;
                    } else if (i3 == 2) {
                        i = 1957409329;
                        i2 = R.string.booking_time_morning;
                    } else if (i3 == 3) {
                        i = 1957413101;
                        i2 = R.string.booking_time_day;
                    } else {
                        if (i3 != 4) {
                            throw alb0.c(1957403104, aVar);
                        }
                        i = 1957416881;
                        i2 = R.string.booking_time_evening;
                    }
                    pn7Var.j(zq.a(aVar, i, i2, aVar, 0), aVar, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                ogr ogrVar = (ogr) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1258185755, intValue2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.FiltersBottomSheet.<anonymous> (FiltersBottomSheet.kt:67)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().r;
                    e.a aVar3 = androidx.compose.ui.graphics.e.a;
                    q630.a aVar4 = q630.a.a;
                    q630 m = hr80.m(aVar4, j, aVar3);
                    TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.storefront_services_title_filters, 0, aVar2), null, null, null, null, aVar2, 196608, 30), null, null, null, aVar2, 14);
                    String N = d370.N(R.string.storefront_services_filters_clear, 0, aVar2);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new nyg(izsVar, 1);
                        aVar2.R(x);
                    }
                    muv0.h(a, m, null, null, null, null, d.a.a(d.c.b.a.a(N, (gzs) x, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 196608, 28), null, null, null, aVar2, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8124);
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.k.b(ogrVar.a);
                        aVar2.R(x2);
                    }
                    wh50 wh50Var = (wh50) x2;
                    Object x3 = aVar2.x();
                    if (x3 == c0012a) {
                        x3 = androidx.compose.runtime.k.b(ogrVar.c);
                        aVar2.R(x3);
                    }
                    wh50 wh50Var2 = (wh50) x3;
                    Object x4 = aVar2.x();
                    if (x4 == c0012a) {
                        x4 = androidx.compose.runtime.k.b(ogrVar.d);
                        aVar2.R(x4);
                    }
                    wh50 wh50Var3 = (wh50) x4;
                    Object x5 = aVar2.x();
                    if (x5 == c0012a) {
                        String str = ogrVar.e;
                        if (str == null) {
                            str = "category_all_id";
                        }
                        x5 = androidx.compose.runtime.k.b(str);
                        aVar2.R(x5);
                    }
                    wh50 wh50Var4 = (wh50) x5;
                    String N2 = d370.N(R.string.storefront_services_sort_title, 0, aVar2);
                    List O0 = j5g.O0(ServicesSort.h());
                    mbi mbiVar = new mbi(5);
                    ServicesSort servicesSort = (ServicesSort) wh50Var.getValue();
                    Object x6 = aVar2.x();
                    if (x6 == c0012a) {
                        x6 = new g8q(1, wh50Var);
                        aVar2.R(x6);
                    }
                    rfr.c(N2, O0, mbiVar, servicesSort, (izs) x6, null, aVar2, 24576);
                    androidx.compose.runtime.a aVar5 = aVar2;
                    rfr.b(ogrVar, wh50Var2, wh50Var3, aVar5, Tensorflow.FRAME_WIDTH);
                    Map map = ogrVar.f;
                    bpw bpwVar = map != null ? new bpw(map) : null;
                    if (bpwVar == null || bpwVar.b.isEmpty()) {
                        aVar5.K(-435362787);
                    } else {
                        aVar5.K(-430827301);
                        ArrayList v0 = j5g.v0("category_all_id", j5g.O0(ogrVar.f.keySet()));
                        String N3 = d370.N(R.string.storefront_services_title_category, 0, aVar5);
                        qyq qyqVar = new qyq(ogrVar, 1);
                        String str2 = (String) wh50Var4.getValue();
                        Object x7 = aVar5.x();
                        if (x7 == c0012a) {
                            x7 = new qfr(0, wh50Var4);
                            aVar5.R(x7);
                        }
                        rfr.c(N3, v0, qyqVar, str2, (izs) x7, null, aVar5, 24576);
                        aVar5 = aVar5;
                    }
                    aVar5.j();
                    q630 E = s200.E(txj0.f(aVar4, 1.0f), 16, 12);
                    String N4 = d370.N(R.string.storefront_services_filter_show, 0, aVar5);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J2 = aVar5.J(izsVar);
                    Object x8 = aVar5.x();
                    if (J2 || x8 == c0012a) {
                        y1n y1nVar = new y1n(izsVar, wh50Var2, wh50Var3, wh50Var, wh50Var4, 1);
                        aVar5.R(y1nVar);
                        x8 = y1nVar;
                    }
                    bhu0.e((gzs) x8, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N4, null, null, null, null, false, null, null, null, aVar5, 28080, 0, 0, 4190176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar2 = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-67194898, intValue3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.TopHeaderBlock.<anonymous> (RedesignHeaderBlock.kt:56)");
                    }
                    vkf0.b((dz40.h) mtk0Var.getValue(), izsVar2, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                o3j0 o3j0Var = (o3j0) this.c;
                izs izsVar3 = (izs) this.d;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1754868835, intValue4, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsOther.<anonymous> (SettingsScreen.kt:178)");
                    }
                    zzi0 zzi0Var = o3j0Var.g;
                    boolean J3 = aVar7.J(izsVar3);
                    Object x9 = aVar7.x();
                    if (J3 || x9 == a.C0011a.a) {
                        x9 = new mmd(izsVar3, 4);
                        aVar7.R(x9);
                    }
                    yzi0.a(zzi0Var, (izs) x9, ahn.E(q630.a.a, "ScreenTags.USER_POST"), aVar7, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ en7(izs izsVar, wh50 wh50Var) {
        this.b = 2;
        this.c = izsVar;
        this.d = wh50Var;
    }
}
