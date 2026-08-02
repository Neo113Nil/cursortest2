package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.api.router.BookingSource;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingCancelClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingCheckViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingCloseClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingErrorViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingFinishClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingMasterViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingResheduleClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingScheduleViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingServicesViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingSource;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingSuccessViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem;
import com.vk.stat.scheme.CommonMarketStat$TypeSmbYclientsStoryAddStickerItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.hzp0;
import xsna.mm7;

/* compiled from: BookingAnalytics.kt */
/* loaded from: classes18.dex */
public final class lm7 {
    public CommonMarketStat$TypeSmbNativeBookingSource a;

    /* compiled from: BookingAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookingSource.values().length];
            try {
                iArr[BookingSource.RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingSource.REPEAT_RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lm7() {
        CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource;
        UiTracker uiTracker = UiTracker.a;
        int i = a.$EnumSwitchMapping$0[BookingSource.RECORD.ordinal()];
        if (i == 1) {
            commonMarketStat$TypeSmbNativeBookingSource = CommonMarketStat$TypeSmbNativeBookingSource.RECORD;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            commonMarketStat$TypeSmbNativeBookingSource = CommonMarketStat$TypeSmbNativeBookingSource.REPEAT_RECORD;
        }
        this.a = commonMarketStat$TypeSmbNativeBookingSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mm7.a aVar) {
        MobileOfficialAppsMarketStat$TypeMarketClick.b commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem;
        MobileOfficialAppsMarketStat$TypeMarketClick.b bVar;
        UserId userId = aVar.a;
        Integer num = aVar.b;
        long j = fkq0.e(userId).b;
        boolean z = false;
        if (aVar instanceof mm7.a.c) {
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = num != null ? Long.valueOf(num.intValue()) : null;
            CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource = this.a;
            BookingServiceType bookingServiceType = ((mm7.a.c) aVar).c;
            bVar = new CommonMarketStat$TypeSmbNativeBookingChooseServiceClickItem(valueOf, null, valueOf2, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
        } else {
            if (aVar instanceof mm7.a.b) {
                commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem = new CommonMarketStat$TypeSmbNativeBookingChooseMasterClickItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, this.a, z ? 1 : 0, 10, null);
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null);
                UiTracker uiTracker = UiTracker.a;
                UiTrackingScreen b = UiTracker.j.b();
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, null, null, null, commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem, 61), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b2, uzp0Var.a).q();
            }
            if (aVar instanceof mm7.a.f) {
                Long valueOf3 = Long.valueOf(j);
                Long valueOf4 = num != null ? Long.valueOf(num.intValue()) : null;
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource2 = this.a;
                BookingServiceType bookingServiceType2 = ((mm7.a.f) aVar).c;
                bVar = new CommonMarketStat$TypeSmbNativeBookingResheduleClickItem(valueOf3, null, valueOf4, null, commonMarketStat$TypeSmbNativeBookingSource2, bookingServiceType2 != null ? bookingServiceType2.i() : null, 10, null);
            } else if (aVar instanceof mm7.a.C3351a) {
                Long valueOf5 = Long.valueOf(j);
                Long valueOf6 = num != null ? Long.valueOf(num.intValue()) : null;
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource3 = this.a;
                BookingServiceType bookingServiceType3 = ((mm7.a.C3351a) aVar).c;
                bVar = new CommonMarketStat$TypeSmbNativeBookingCancelClickItem(valueOf5, null, valueOf6, null, commonMarketStat$TypeSmbNativeBookingSource3, bookingServiceType3 != null ? bookingServiceType3.i() : null, 10, null);
            } else if (aVar instanceof mm7.a.d) {
                Long valueOf7 = Long.valueOf(j);
                Long valueOf8 = num != null ? Long.valueOf(num.intValue()) : null;
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource4 = this.a;
                BookingServiceType bookingServiceType4 = ((mm7.a.d) aVar).c;
                bVar = new CommonMarketStat$TypeSmbNativeBookingCloseClickItem(valueOf7, null, valueOf8, null, commonMarketStat$TypeSmbNativeBookingSource4, bookingServiceType4 != null ? bookingServiceType4.i() : null, 10, null);
            } else {
                if (!(aVar instanceof mm7.a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                Long valueOf9 = num != null ? Long.valueOf(num.intValue()) : null;
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource5 = this.a;
                mm7.a.e eVar = (mm7.a.e) aVar;
                BookingServiceType bookingServiceType5 = eVar.c;
                bVar = new CommonMarketStat$TypeSmbNativeBookingFinishClickItem(Long.valueOf(j), null, valueOf9, null, commonMarketStat$TypeSmbNativeBookingSource5, eVar.d, bookingServiceType5 != null ? bookingServiceType5.i() : null, 10, null);
            }
        }
        commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem = bVar;
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null);
        UiTracker uiTracker3 = UiTracker.a;
        UiTrackingScreen b3 = UiTracker.j.b();
        SchemeStat$TypeClick b22 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 != null ? b3.a : null, null, null, null, commonMarketStat$TypeSmbNativeBookingChooseMasterClickItem, 61), 2);
        UiTracker uiTracker22 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, b22, uzp0Var2.a).q();
    }

    public final void b(com.vk.ecomm.onlinebooking.impl.navhostfragment.b bVar, mm7 mm7Var) {
        MobileOfficialAppsMarketStat$TypeMarketView.b commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem;
        MobileOfficialAppsMarketStat$TypeMarketView.b commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem;
        if (!(mm7Var instanceof mm7.b)) {
            if (mm7Var instanceof mm7.a) {
                a((mm7.a) mm7Var);
                return;
            }
            if (!(mm7Var instanceof mm7.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            mm7.c.a aVar = (mm7.c.a) mm7Var;
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeSmbYclientsStoryAddStickerItem(Long.valueOf(fkq0.e(aVar.a).b), aVar.c), 63), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            return;
        }
        mm7.b bVar2 = (mm7.b) mm7Var;
        if (bVar2 instanceof mm7.b.g) {
            UserId userId = bVar2.a;
            mm7.b.g gVar = (mm7.b.g) bVar2;
            boolean z = gVar.d;
            Integer num = bVar2.b;
            CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource = this.a;
            BookingServiceType bookingServiceType = gVar.c;
            long j = fkq0.e(userId).b;
            if (bVar.equals(b.e.b)) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingStartingMenuViewItem(Long.valueOf(j), null, null, commonMarketStat$TypeSmbNativeBookingSource, null, 22, null);
            } else if (bVar instanceof b.a) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingScheduleViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
            } else if (bVar.equals(b.d.b)) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingMasterViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
            } else if (bVar instanceof b.j) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingServicesViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
            } else if (bVar instanceof b.C0978b) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingCheckViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
            } else {
                if (bVar instanceof b.h) {
                    if (z) {
                        commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingResheduleSuccessViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
                    } else {
                        commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingSuccessViewItem(Long.valueOf(j), null, num != null ? Long.valueOf(num.intValue()) : null, null, commonMarketStat$TypeSmbNativeBookingSource, bookingServiceType != null ? bookingServiceType.i() : null, 10, null);
                    }
                }
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = null;
            }
        } else {
            if (bVar2 instanceof mm7.b.h) {
                Long valueOf = Long.valueOf(fkq0.e(bVar2.a).b);
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource2 = this.a;
                BookingServiceType bookingServiceType2 = ((mm7.b.h) bVar2).c;
                commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem = new CommonMarketStat$TypeSmbNativeBookingTimeslotsViewItem(valueOf, null, null, commonMarketStat$TypeSmbNativeBookingSource2, bookingServiceType2 != null ? bookingServiceType2.i() : null, 6, null);
            } else if (bVar2 instanceof mm7.b.c) {
                Long valueOf2 = Long.valueOf(fkq0.e(bVar2.a).b);
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource3 = this.a;
                BookingServiceType bookingServiceType3 = ((mm7.b.c) bVar2).c;
                commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem = new CommonMarketStat$TypeSmbNativeBookingNoTimeslotsViewItem(valueOf2, null, null, null, commonMarketStat$TypeSmbNativeBookingSource3, bookingServiceType3 != null ? bookingServiceType3.i() : null, 14, null);
            } else if (bVar2 instanceof mm7.b.C3352b) {
                Long valueOf3 = Long.valueOf(fkq0.e(bVar2.a).b);
                CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource4 = this.a;
                BookingServiceType bookingServiceType4 = ((mm7.b.C3352b) bVar2).c;
                commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem = new CommonMarketStat$TypeSmbNativeBookingErrorViewItem(valueOf3, null, null, null, commonMarketStat$TypeSmbNativeBookingSource4, bookingServiceType4 != null ? bookingServiceType4.i() : null, 14, null);
            } else if (bVar2 instanceof mm7.b.f) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingRepeatRecordsWidgetViewItem(Long.valueOf(fkq0.e(bVar2.a).b), 0L);
            } else if (bVar2 instanceof mm7.b.d) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingRepeatRecordsMasterUnavailableViewItem(Long.valueOf(fkq0.e(bVar2.a).b), 0L);
            } else if (bVar2 instanceof mm7.b.e) {
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = new CommonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem(Long.valueOf(fkq0.e(bVar2.a).b), 0L);
            } else {
                if (bVar2 instanceof mm7.b.a) {
                    Long valueOf4 = Long.valueOf(fkq0.e(bVar2.a).b);
                    Long valueOf5 = bVar2.b != null ? Long.valueOf(r1.intValue()) : null;
                    CommonMarketStat$TypeSmbNativeBookingSource commonMarketStat$TypeSmbNativeBookingSource5 = this.a;
                    BookingServiceType bookingServiceType5 = ((mm7.b.a) bVar2).c;
                    commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem = new CommonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem(valueOf4, null, valueOf5, null, commonMarketStat$TypeSmbNativeBookingSource5, bookingServiceType5 != null ? bookingServiceType5.i() : null, 10, null);
                }
                commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = null;
            }
            commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem = commonMarketStat$TypeSmbNativeBookingCancelSuccessViewItem;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, null, null, null, null, 62, null);
        UiTracker uiTracker2 = UiTracker.a;
        UiTrackingScreen b2 = UiTracker.j.b();
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b2 != null ? b2.a : null, null, null, commonMarketStat$TypeSmbNativeBookingRepeatRecordsServiceUnavailableViewItem, 30), null).a();
    }
}
