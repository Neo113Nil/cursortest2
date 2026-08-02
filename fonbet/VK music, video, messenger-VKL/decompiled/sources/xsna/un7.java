package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.common.links.LaunchContext;
import com.vk.dto.music.Artist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class un7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ un7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        switch (this.b) {
            case 0:
                BookingCalendarScreenState.TimeSlotSelector.b bVar = (BookingCalendarScreenState.TimeSlotSelector.b) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(880825864, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.bookingCalendarTimeSlotTableView.<anonymous>.<anonymous> (BookingCalendarTimeSlotTableView.kt:56)");
                    }
                    String str3 = bVar.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str3, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.P.b(aVar), aVar, 0, 0, 8190);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                yp7 yp7Var = (yp7) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-953666092, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenMviView.ThemedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookingEditScreenMviView.kt:136)");
                    }
                    f9t.e(yp7Var.g, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                hh80 hh80Var = (hh80) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-60735444, intValue3, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous>.<anonymous> (OnboardingPromoFullscreenSlides.kt:390)");
                    }
                    ff80 ff80Var = hh80Var.d.d;
                    yqv0.c(ff80Var.b, null, pf80.h(false, ff80Var.e, aVar3), null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                huh0 huh0Var = (huh0) this.c;
                Context context = (Context) obj;
                UIBlock uIBlock = (UIBlock) obj2;
                SearchStatInfoProvider searchStatInfoProvider = (SearchStatInfoProvider) obj3;
                UIBlockSearchHistory.a aVar4 = uIBlock instanceof UIBlockSearchHistory.a ? (UIBlockSearchHistory.a) uIBlock : null;
                Object g7 = aVar4 != null ? aVar4.g7() : null;
                if (!(g7 instanceof Artist)) {
                    if (!(g7 instanceof Podcast)) {
                        if (!(g7 instanceof AudioBook)) {
                            str = null;
                            if (str != null) {
                                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
                                dfp0 dfp0Var = uIBlock instanceof dfp0 ? (dfp0) uIBlock : null;
                                String r = dfp0Var != null ? dfp0Var.r() : null;
                                if (r == null) {
                                    r = "";
                                }
                                SearchStatsLoggingInfo b = searchStatInfoProvider.b(type, r, false);
                                LaunchContext.a aVar5 = new LaunchContext.a();
                                aVar5.d = uIBlock.f;
                                aVar5.e = uIBlock.p.h();
                                if (b != null) {
                                    aVar5.m = b;
                                }
                                maz.c(((qdz) huh0Var.d.getValue()).e(), context, str, aVar5.a(), null, null, 24);
                            }
                            break;
                        } else {
                            String str4 = vm40.a;
                            str2 = "https://" + a0a.d + "/audiobook" + ((AudioBook) g7).b;
                        }
                    } else {
                        String str5 = vm40.a;
                        str2 = "https://" + a0a.d + "/podcasts" + ((Podcast) g7).c.b;
                    }
                } else {
                    String str6 = vm40.a;
                    str2 = "https://" + a0a.d + "/artist/" + ((Artist) g7).b;
                }
                str = str2;
                if (str != null) {
                }
        }
        return s3q0.a;
    }
}
