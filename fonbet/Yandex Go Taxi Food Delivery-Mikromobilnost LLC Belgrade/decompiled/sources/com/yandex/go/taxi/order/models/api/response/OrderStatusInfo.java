package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.taxi.order.models.api.objects.AutoReorder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.ForceDestinationDTO;
import com.yandex.go.taxi.order.models.api.objects.FreightageRideItem;
import com.yandex.go.taxi.order.models.api.objects.Organization;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import com.yandex.go.taxi.order.models.api.objects.PaidOptionDiscount;
import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.objects.Tariff;
import com.yandex.go.taxi.order.models.api.objects.TariffUpgradeDto;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.orderperformer.RealtimeInfo;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxExperiment;
import com.yandex.go.taxi.order.models.api.totw.TotwPromotions;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.SupportedFeedbackChoices;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.b64;
import defpackage.c680;
import defpackage.crc;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lv90;
import defpackage.lwj0;
import defpackage.ly3;
import defpackage.ly6;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.qn11;
import defpackage.rf00;
import defpackage.s780;
import defpackage.tcc;
import defpackage.tse0;
import defpackage.u280;
import defpackage.unr0;
import defpackage.v280;
import defpackage.zn11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0016\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo;", "Llwj0;", "Companion", "CancelledBy", "CancelReasonDescription", "CostMessageDetails", "PlusInfo", "ExtraInfo", "CostBreakdown", "CashbackDetails", "TipsSuggestions", "TollRoads", "TollRoadUi", "TollRoadCard", "TollRoadAlert", "SearchEstimates", "ExtraItem", "com/yandex/go/taxi/order/models/api/response/o2", "MultiOrderInfo", "AlternativeDestination", "ModalsContent", "Modal", "TransportInfo", "RidaSearchInfo", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OrderStatusInfo extends lwj0 {
    public static final o2 Companion = new o2();
    public static final i3y[] x0;
    public static final OrderStatusInfo y0;
    public final SupportedFeedbackChoices A;
    public final String B;
    public final List C;
    public final FeedbackDto D;
    public final TipsSuggestions E;
    public final CancelledBy F;
    public final boolean G;
    public final boolean H;
    public final lv90 I;
    public final List J;
    public final ief K;
    public final CancelRules L;
    public final boolean M;
    public final double N;
    public final String O;
    public final v280 P;
    public final CancelReasonDescription Q;
    public final boolean R;
    public final boolean S;
    public final CostMessageDetails T;
    public final String U;
    public final List V;
    public final ForceDestinationDTO W;
    public final PaidOptionDiscount X;
    public final CanMakeMoreOrders Y;
    public final StateInfo Z;
    public final String a;
    public final CheckInInfo a0;
    public final ReorderInfo b;
    public final TollRoads b0;
    public final Organization c;
    public final SearchEstimates c0;
    public final Organization d;
    public final TotwPromotions d0;
    public final Tariff e;
    public final FreightageContract e0;
    public final OriginalRequest f;
    public final List f0;
    public final Driver g;
    public final List g0;
    public final RealtimeInfo h;
    public final MultiOrderInfo h0;
    public final DriveState i;
    public final FreightageRideItem i0;
    public final Double j;
    public final AlternativeDestination j0;
    public final double k;
    public final List k0;
    public final String l;
    public final r7 l0;
    public final String m;
    public final List m0;
    public final TipsDto n;
    public final OrderDetailsCardResponse n0;
    public final double o;
    public final RideCardInfoResponse o0;
    public final CouponCheckResult p;
    public final Date p0;
    public final AutoReorder q;
    public final String q0;
    public final RouteInfo r;
    public final boolean r0;
    public final List s;
    public final ModalsContent s0;
    public final String t;
    public final TransportInfo t0;
    public final double u;
    public final RidaSearchInfo u0;
    public final String v;
    public final TariffsSuggestDto v0;
    public final String w;
    public final zn11 w0;
    public final String x;
    public final PlusInfo y;
    public final TariffUpgradeDto z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CancelledBy;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/k2", "USER", "PARK", "TIMEOUT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CancelledBy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CancelledBy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final k2 Companion;
        public static final CancelledBy PARK;
        public static final CancelledBy TIMEOUT;
        public static final CancelledBy USER;

        static {
            CancelledBy cancelledBy = new CancelledBy("USER", 0);
            USER = cancelledBy;
            CancelledBy cancelledBy2 = new CancelledBy("PARK", 1);
            PARK = cancelledBy2;
            CancelledBy cancelledBy3 = new CancelledBy("TIMEOUT", 2);
            TIMEOUT = cancelledBy3;
            CancelledBy[] cancelledByArr = {cancelledBy, cancelledBy2, cancelledBy3};
            $VALUES = cancelledByArr;
            $ENTRIES = kotlin.enums.a.a(cancelledByArr);
            Companion = new k2();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c680(22));
        }

        public static CancelledBy valueOf(String str) {
            return (CancelledBy) Enum.valueOf(CancelledBy.class, str);
        }

        public static CancelledBy[] values() {
            return (CancelledBy[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        x0 = new i3y[]{null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(10)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(13)), null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(14)), null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(15)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(16)), null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(17)), null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(18)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(19)), kotlin.a.b(lazyThreadSafetyMode, new c680(20)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(11)), null, kotlin.a.b(lazyThreadSafetyMode, new c680(12)), null, null, null, null, null, null, null, null, null, null};
        y0 = new OrderStatusInfo(0);
    }

    public OrderStatusInfo(int i, int i2, int i3, String str, ReorderInfo reorderInfo, Organization organization, Organization organization2, Tariff tariff, OriginalRequest originalRequest, Driver driver, RealtimeInfo realtimeInfo, DriveState driveState, Double d, double d2, String str2, String str3, TipsDto tipsDto, double d3, CouponCheckResult couponCheckResult, AutoReorder autoReorder, RouteInfo routeInfo, List list, String str4, double d4, String str5, String str6, String str7, PlusInfo plusInfo, TariffUpgradeDto tariffUpgradeDto, SupportedFeedbackChoices supportedFeedbackChoices, String str8, List list2, FeedbackDto feedbackDto, TipsSuggestions tipsSuggestions, CancelledBy cancelledBy, boolean z, boolean z2, lv90 lv90Var, List list3, ief iefVar, CancelRules cancelRules, boolean z3, double d5, String str9, v280 v280Var, CancelReasonDescription cancelReasonDescription, boolean z4, boolean z5, CostMessageDetails costMessageDetails, String str10, List list4, ForceDestinationDTO forceDestinationDTO, PaidOptionDiscount paidOptionDiscount, CanMakeMoreOrders canMakeMoreOrders, StateInfo stateInfo, CheckInInfo checkInInfo, TollRoads tollRoads, SearchEstimates searchEstimates, TotwPromotions totwPromotions, FreightageContract freightageContract, List list5, List list6, MultiOrderInfo multiOrderInfo, FreightageRideItem freightageRideItem, AlternativeDestination alternativeDestination, List list7, r7 r7Var, List list8, OrderDetailsCardResponse orderDetailsCardResponse, RideCardInfoResponse rideCardInfoResponse, Date date, String str11, boolean z6, ModalsContent modalsContent, TransportInfo transportInfo, RidaSearchInfo ridaSearchInfo, TariffsSuggestDto tariffsSuggestDto, zn11 zn11Var) {
        int i4;
        int i5;
        int i6;
        PlusInfo plusInfo2;
        int i7;
        SupportedFeedbackChoices supportedFeedbackChoices2;
        int i8;
        int i9;
        int i10;
        lv90 lv90Var2;
        v280 v280Var2;
        StateInfo stateInfo2;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = reorderInfo;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = organization;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = organization2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = tariff;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = originalRequest;
        }
        this.g = (i & 64) == 0 ? Driver.v : driver;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = realtimeInfo;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = driveState;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d;
        }
        if ((i & 1024) == 0) {
            this.k = 0.0d;
        } else {
            this.k = d2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = tipsDto;
        }
        if ((i & 16384) == 0) {
            this.o = 0.0d;
        } else {
            this.o = d3;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = couponCheckResult;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = autoReorder;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = routeInfo;
        }
        int i11 = i & 262144;
        EmptyList emptyList = EmptyList.a;
        if (i11 == 0) {
            this.s = emptyList;
        } else {
            this.s = list;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = str4;
        }
        if ((i & 1048576) == 0) {
            this.u = 0.0d;
        } else {
            this.u = d4;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = str5;
        }
        if ((i & SelfTester_JCP.ENCRYPT_CBC) == 0) {
            this.w = null;
            i4 = 32768;
        } else {
            i4 = 32768;
            this.w = str6;
        }
        if ((i & SelfTester_JCP.ENCRYPT_CNT) == 0) {
            this.x = null;
            i5 = 8388608;
        } else {
            i5 = 8388608;
            this.x = str7;
        }
        if ((i & 16777216) == 0) {
            PlusInfo.Companion.getClass();
            i6 = 16777216;
            plusInfo2 = w2.a();
        } else {
            i6 = 16777216;
            plusInfo2 = plusInfo;
        }
        this.y = plusInfo2;
        this.z = (i & SelfTester_JCP.DECRYPT_CFB) == 0 ? TariffUpgradeDto.e : tariffUpgradeDto;
        if ((i & SelfTester_JCP.DECRYPT_CBC) == 0) {
            SupportedFeedbackChoices.Companion.getClass();
            i7 = 67108864;
            supportedFeedbackChoices2 = SupportedFeedbackChoices.j;
        } else {
            i7 = 67108864;
            supportedFeedbackChoices2 = supportedFeedbackChoices;
        }
        this.A = supportedFeedbackChoices2;
        if ((i & SelfTester_JCP.DECRYPT_CNT) == 0) {
            this.B = null;
            i8 = 134217728;
        } else {
            i8 = 134217728;
            this.B = str8;
        }
        if ((i & SelfTester_JCP.IMITA) == 0) {
            this.C = emptyList;
            i9 = 268435456;
        } else {
            i9 = 268435456;
            this.C = list2;
        }
        if ((i & 536870912) == 0) {
            this.D = null;
            i10 = 536870912;
        } else {
            i10 = 536870912;
            this.D = feedbackDto;
        }
        this.E = (i & 1073741824) == 0 ? TipsSuggestions.c : tipsSuggestions;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = cancelledBy;
        }
        if ((i2 & 1) == 0) {
            this.G = false;
        } else {
            this.G = z;
        }
        if ((i2 & 2) == 0) {
            this.H = false;
        } else {
            this.H = z2;
        }
        if ((i2 & 4) == 0) {
            lv90.Companion.getClass();
            lv90Var2 = lv90.g;
        } else {
            lv90Var2 = lv90Var;
        }
        this.I = lv90Var2;
        if ((i2 & 8) == 0) {
            this.J = emptyList;
        } else {
            this.J = list3;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = iefVar;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = cancelRules;
        }
        if ((i2 & 64) == 0) {
            this.M = false;
        } else {
            this.M = z3;
        }
        this.N = (i2 & 128) != 0 ? d5 : 0.0d;
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = str9;
        }
        if ((i2 & 512) == 0) {
            v280.Companion.getClass();
            v280Var2 = u280.a();
        } else {
            v280Var2 = v280Var;
        }
        this.P = v280Var2;
        if ((i2 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = cancelReasonDescription;
        }
        if ((i2 & 2048) == 0) {
            this.R = false;
        } else {
            this.R = z4;
        }
        if ((i2 & 4096) == 0) {
            this.S = false;
        } else {
            this.S = z5;
        }
        if ((i2 & 8192) == 0) {
            this.T = null;
        } else {
            this.T = costMessageDetails;
        }
        if ((i2 & 16384) == 0) {
            this.U = null;
        } else {
            this.U = str10;
        }
        if ((i2 & i4) == 0) {
            this.V = emptyList;
        } else {
            this.V = list4;
        }
        this.W = (i2 & 65536) == 0 ? ForceDestinationDTO.b : forceDestinationDTO;
        this.X = (i2 & 131072) == 0 ? PaidOptionDiscount.b : paidOptionDiscount;
        this.Y = (i2 & 262144) == 0 ? CanMakeMoreOrders.UNMODIFIED : canMakeMoreOrders;
        if ((i2 & 524288) == 0) {
            StateInfo.Companion.getClass();
            stateInfo2 = s7.a();
        } else {
            stateInfo2 = stateInfo;
        }
        this.Z = stateInfo2;
        if ((i2 & 1048576) == 0) {
            this.a0 = null;
        } else {
            this.a0 = checkInInfo;
        }
        this.b0 = (i2 & 2097152) == 0 ? TollRoads.f : tollRoads;
        if ((i2 & SelfTester_JCP.ENCRYPT_CBC) == 0) {
            this.c0 = null;
        } else {
            this.c0 = searchEstimates;
        }
        if ((i2 & i5) == 0) {
            this.d0 = null;
        } else {
            this.d0 = totwPromotions;
        }
        if ((i2 & i6) == 0) {
            this.e0 = null;
        } else {
            this.e0 = freightageContract;
        }
        if ((i2 & SelfTester_JCP.DECRYPT_CFB) == 0) {
            this.f0 = emptyList;
        } else {
            this.f0 = list5;
        }
        if ((i2 & i7) == 0) {
            this.g0 = emptyList;
        } else {
            this.g0 = list6;
        }
        if ((i2 & i8) == 0) {
            this.h0 = null;
        } else {
            this.h0 = multiOrderInfo;
        }
        if ((i2 & i9) == 0) {
            this.i0 = null;
        } else {
            this.i0 = freightageRideItem;
        }
        if ((i2 & i10) == 0) {
            this.j0 = null;
        } else {
            this.j0 = alternativeDestination;
        }
        if ((i2 & 1073741824) == 0) {
            this.k0 = emptyList;
        } else {
            this.k0 = list7;
        }
        if ((i2 & Integer.MIN_VALUE) == 0) {
            this.l0 = null;
        } else {
            this.l0 = r7Var;
        }
        if ((i3 & 1) == 0) {
            this.m0 = null;
        } else {
            this.m0 = list8;
        }
        if ((i3 & 2) == 0) {
            this.n0 = null;
        } else {
            this.n0 = orderDetailsCardResponse;
        }
        if ((i3 & 4) == 0) {
            this.o0 = null;
        } else {
            this.o0 = rideCardInfoResponse;
        }
        if ((i3 & 8) == 0) {
            this.p0 = null;
        } else {
            this.p0 = date;
        }
        if ((i3 & 16) == 0) {
            this.q0 = null;
        } else {
            this.q0 = str11;
        }
        if ((i3 & 32) == 0) {
            this.r0 = false;
        } else {
            this.r0 = z6;
        }
        if ((i3 & 64) == 0) {
            this.s0 = null;
        } else {
            this.s0 = modalsContent;
        }
        if ((i3 & 128) == 0) {
            this.t0 = null;
        } else {
            this.t0 = transportInfo;
        }
        if ((i3 & 256) == 0) {
            this.u0 = null;
        } else {
            this.u0 = ridaSearchInfo;
        }
        if ((i3 & 512) == 0) {
            this.v0 = null;
        } else {
            this.v0 = tariffsSuggestDto;
        }
        if ((i3 & 1024) == 0) {
            this.w0 = null;
        } else {
            this.w0 = zn11Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e, reason: from getter */
    public final zn11 getG() {
        return this.w0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatusInfo)) {
            return false;
        }
        OrderStatusInfo orderStatusInfo = (OrderStatusInfo) obj;
        return jl40.l(this.a, orderStatusInfo.a) && jl40.l(this.b, orderStatusInfo.b) && jl40.l(this.c, orderStatusInfo.c) && jl40.l(this.d, orderStatusInfo.d) && jl40.l(this.e, orderStatusInfo.e) && jl40.l(this.f, orderStatusInfo.f) && jl40.l(this.g, orderStatusInfo.g) && jl40.l(this.h, orderStatusInfo.h) && this.i == orderStatusInfo.i && jl40.l(this.j, orderStatusInfo.j) && Double.compare(this.k, orderStatusInfo.k) == 0 && jl40.l(this.l, orderStatusInfo.l) && jl40.l(this.m, orderStatusInfo.m) && jl40.l(this.n, orderStatusInfo.n) && Double.compare(this.o, orderStatusInfo.o) == 0 && jl40.l(this.p, orderStatusInfo.p) && jl40.l(this.q, orderStatusInfo.q) && jl40.l(this.r, orderStatusInfo.r) && jl40.l(this.s, orderStatusInfo.s) && jl40.l(this.t, orderStatusInfo.t) && Double.compare(this.u, orderStatusInfo.u) == 0 && jl40.l(this.v, orderStatusInfo.v) && jl40.l(this.w, orderStatusInfo.w) && jl40.l(this.x, orderStatusInfo.x) && jl40.l(this.y, orderStatusInfo.y) && jl40.l(this.z, orderStatusInfo.z) && jl40.l(this.A, orderStatusInfo.A) && jl40.l(this.B, orderStatusInfo.B) && jl40.l(this.C, orderStatusInfo.C) && jl40.l(this.D, orderStatusInfo.D) && jl40.l(this.E, orderStatusInfo.E) && this.F == orderStatusInfo.F && this.G == orderStatusInfo.G && this.H == orderStatusInfo.H && jl40.l(this.I, orderStatusInfo.I) && jl40.l(this.J, orderStatusInfo.J) && jl40.l(this.K, orderStatusInfo.K) && jl40.l(this.L, orderStatusInfo.L) && this.M == orderStatusInfo.M && Double.compare(this.N, orderStatusInfo.N) == 0 && jl40.l(this.O, orderStatusInfo.O) && jl40.l(this.P, orderStatusInfo.P) && jl40.l(this.Q, orderStatusInfo.Q) && this.R == orderStatusInfo.R && this.S == orderStatusInfo.S && jl40.l(this.T, orderStatusInfo.T) && jl40.l(this.U, orderStatusInfo.U) && jl40.l(this.V, orderStatusInfo.V) && jl40.l(this.W, orderStatusInfo.W) && jl40.l(this.X, orderStatusInfo.X) && this.Y == orderStatusInfo.Y && jl40.l(this.Z, orderStatusInfo.Z) && jl40.l(this.a0, orderStatusInfo.a0) && jl40.l(this.b0, orderStatusInfo.b0) && jl40.l(this.c0, orderStatusInfo.c0) && jl40.l(this.d0, orderStatusInfo.d0) && jl40.l(this.e0, orderStatusInfo.e0) && jl40.l(this.f0, orderStatusInfo.f0) && jl40.l(this.g0, orderStatusInfo.g0) && jl40.l(this.h0, orderStatusInfo.h0) && jl40.l(this.i0, orderStatusInfo.i0) && jl40.l(this.j0, orderStatusInfo.j0) && jl40.l(this.k0, orderStatusInfo.k0) && jl40.l(this.l0, orderStatusInfo.l0) && jl40.l(this.m0, orderStatusInfo.m0) && jl40.l(this.n0, orderStatusInfo.n0) && jl40.l(this.o0, orderStatusInfo.o0) && jl40.l(this.p0, orderStatusInfo.p0) && jl40.l(this.q0, orderStatusInfo.q0) && this.r0 == orderStatusInfo.r0 && jl40.l(this.s0, orderStatusInfo.s0) && jl40.l(this.t0, orderStatusInfo.t0) && jl40.l(this.u0, orderStatusInfo.u0) && jl40.l(this.v0, orderStatusInfo.v0) && jl40.l(this.w0, orderStatusInfo.w0);
    }

    public final List g() {
        crc a;
        List a2;
        TotwPromotions totwPromotions = this.d0;
        return (totwPromotions == null || (a = totwPromotions.getA()) == null || (a2 = a.getA()) == null) ? EmptyList.a : a2;
    }

    public final FeedbackDto h() {
        FeedbackDto feedbackDto = this.D;
        if (feedbackDto != null) {
            if (!(feedbackDto.a == null && feedbackDto.b == null && feedbackDto.c == null && feedbackDto.d == null)) {
                return feedbackDto;
            }
        }
        return null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ReorderInfo reorderInfo = this.b;
        int hashCode2 = (hashCode + (reorderInfo == null ? 0 : reorderInfo.hashCode())) * 31;
        Organization organization = this.c;
        int hashCode3 = (hashCode2 + (organization == null ? 0 : organization.hashCode())) * 31;
        Organization organization2 = this.d;
        int hashCode4 = (hashCode3 + (organization2 == null ? 0 : organization2.hashCode())) * 31;
        Tariff tariff = this.e;
        int hashCode5 = (hashCode4 + (tariff == null ? 0 : tariff.hashCode())) * 31;
        OriginalRequest originalRequest = this.f;
        int hashCode6 = (this.g.hashCode() + ((hashCode5 + (originalRequest == null ? 0 : originalRequest.hashCode())) * 31)) * 31;
        RealtimeInfo realtimeInfo = this.h;
        int hashCode7 = (hashCode6 + (realtimeInfo == null ? 0 : realtimeInfo.hashCode())) * 31;
        DriveState driveState = this.i;
        int hashCode8 = (hashCode7 + (driveState == null ? 0 : driveState.hashCode())) * 31;
        Double d = this.j;
        int a = unr0.a((hashCode8 + (d == null ? 0 : d.hashCode())) * 31, 31, this.k);
        String str2 = this.l;
        int hashCode9 = (a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TipsDto tipsDto = this.n;
        int a2 = unr0.a((hashCode10 + (tipsDto == null ? 0 : tipsDto.hashCode())) * 31, 31, this.o);
        CouponCheckResult couponCheckResult = this.p;
        int hashCode11 = (a2 + (couponCheckResult == null ? 0 : couponCheckResult.hashCode())) * 31;
        AutoReorder autoReorder = this.q;
        int hashCode12 = (hashCode11 + (autoReorder == null ? 0 : autoReorder.hashCode())) * 31;
        RouteInfo routeInfo = this.r;
        int c = unr0.c((hashCode12 + (routeInfo == null ? 0 : routeInfo.hashCode())) * 31, 31, this.s);
        String str4 = this.t;
        int a3 = unr0.a((c + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.u);
        String str5 = this.v;
        int hashCode13 = (a3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.x;
        int hashCode15 = (this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str8 = this.B;
        int c2 = unr0.c((hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.C);
        FeedbackDto feedbackDto = this.D;
        int hashCode16 = (this.E.hashCode() + ((c2 + (feedbackDto == null ? 0 : feedbackDto.hashCode())) * 31)) * 31;
        CancelledBy cancelledBy = this.F;
        int c3 = unr0.c((this.I.hashCode() + unr0.e(unr0.e((hashCode16 + (cancelledBy == null ? 0 : cancelledBy.hashCode())) * 31, 31, this.G), 31, this.H)) * 31, 31, this.J);
        ief iefVar = this.K;
        int hashCode17 = (c3 + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        CancelRules cancelRules = this.L;
        int a4 = unr0.a(unr0.e((hashCode17 + (cancelRules == null ? 0 : cancelRules.hashCode())) * 31, 31, this.M), 31, this.N);
        String str9 = this.O;
        int hashCode18 = (this.P.hashCode() + ((a4 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31;
        CancelReasonDescription cancelReasonDescription = this.Q;
        int e = unr0.e(unr0.e((hashCode18 + (cancelReasonDescription == null ? 0 : cancelReasonDescription.hashCode())) * 31, 31, this.R), 31, this.S);
        CostMessageDetails costMessageDetails = this.T;
        int hashCode19 = (e + (costMessageDetails == null ? 0 : costMessageDetails.hashCode())) * 31;
        String str10 = this.U;
        int hashCode20 = (this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + ((this.W.hashCode() + unr0.c((hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.V)) * 31)) * 31)) * 31)) * 31;
        CheckInInfo checkInInfo = this.a0;
        int hashCode21 = (this.b0.hashCode() + ((hashCode20 + (checkInInfo == null ? 0 : checkInInfo.hashCode())) * 31)) * 31;
        SearchEstimates searchEstimates = this.c0;
        int hashCode22 = (hashCode21 + (searchEstimates == null ? 0 : searchEstimates.hashCode())) * 31;
        TotwPromotions totwPromotions = this.d0;
        int hashCode23 = (hashCode22 + (totwPromotions == null ? 0 : totwPromotions.hashCode())) * 31;
        FreightageContract freightageContract = this.e0;
        int c4 = unr0.c(unr0.c((hashCode23 + (freightageContract == null ? 0 : freightageContract.hashCode())) * 31, 31, this.f0), 31, this.g0);
        MultiOrderInfo multiOrderInfo = this.h0;
        int hashCode24 = (c4 + (multiOrderInfo == null ? 0 : multiOrderInfo.hashCode())) * 31;
        FreightageRideItem freightageRideItem = this.i0;
        int hashCode25 = (hashCode24 + (freightageRideItem == null ? 0 : freightageRideItem.hashCode())) * 31;
        AlternativeDestination alternativeDestination = this.j0;
        int c5 = unr0.c((hashCode25 + (alternativeDestination == null ? 0 : alternativeDestination.hashCode())) * 31, 31, this.k0);
        r7 r7Var = this.l0;
        int hashCode26 = (c5 + (r7Var == null ? 0 : r7Var.hashCode())) * 31;
        List list = this.m0;
        int hashCode27 = (hashCode26 + (list == null ? 0 : list.hashCode())) * 31;
        OrderDetailsCardResponse orderDetailsCardResponse = this.n0;
        int hashCode28 = (hashCode27 + (orderDetailsCardResponse == null ? 0 : orderDetailsCardResponse.hashCode())) * 31;
        RideCardInfoResponse rideCardInfoResponse = this.o0;
        int hashCode29 = (hashCode28 + (rideCardInfoResponse == null ? 0 : rideCardInfoResponse.hashCode())) * 31;
        Date date = this.p0;
        int hashCode30 = (hashCode29 + (date == null ? 0 : date.hashCode())) * 31;
        String str11 = this.q0;
        int e2 = unr0.e((hashCode30 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.r0);
        ModalsContent modalsContent = this.s0;
        int hashCode31 = (e2 + (modalsContent == null ? 0 : modalsContent.hashCode())) * 31;
        TransportInfo transportInfo = this.t0;
        int hashCode32 = (hashCode31 + (transportInfo == null ? 0 : transportInfo.hashCode())) * 31;
        RidaSearchInfo ridaSearchInfo = this.u0;
        int hashCode33 = (hashCode32 + (ridaSearchInfo == null ? 0 : ridaSearchInfo.hashCode())) * 31;
        TariffsSuggestDto tariffsSuggestDto = this.v0;
        int hashCode34 = (hashCode33 + (tariffsSuggestDto == null ? 0 : tariffsSuggestDto.hashCode())) * 31;
        zn11 zn11Var = this.w0;
        return hashCode34 + (zn11Var != null ? zn11Var.hashCode() : 0);
    }

    public final List i() {
        List list = this.m0;
        if (list == null) {
            return EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SearchInfoResponse$CompanionsSearch.TravelCompanion) it.next()).getB());
        }
        return arrayList;
    }

    public final LootBoxExperiment j() {
        LootBoxExperiment.Companion.getClass();
        qn11 a = com.yandex.go.taxi.order.models.api.response.typed_experiments.b.a();
        qn11 b = b(LootBoxExperiment.class);
        if (b != null) {
            a = b;
        }
        return (LootBoxExperiment) a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderStatusInfo(version=");
        sb.append(this.a);
        sb.append(", reorder=");
        sb.append(this.b);
        sb.append(", partner=");
        sb.append(this.c);
        sb.append(", carrier=");
        sb.append(this.d);
        sb.append(", tariff=");
        sb.append(this.e);
        sb.append(", originalRequest=");
        sb.append(this.f);
        sb.append(", driver=");
        sb.append(this.g);
        sb.append(", realtimeInfo=");
        sb.append(this.h);
        sb.append(", status=");
        sb.append(this.i);
        sb.append(", costLeftToPay=");
        sb.append(this.j);
        sb.append(", cost=");
        sb.append(this.k);
        sb.append(", costDecimalValue=");
        sb.append(this.l);
        sb.append(", costAsStr=");
        sb.append(this.m);
        sb.append(", tipsDto=");
        sb.append(this.n);
        nzs.o(sb, ", discount=", this.o, ", couponCheckResult=");
        sb.append(this.p);
        sb.append(", autoReorder=");
        sb.append(this.q);
        sb.append(", routeInfo=");
        sb.append(this.r);
        sb.append(", mapObjects=");
        sb.append(this.s);
        sb.append(", blockTime=");
        sb.append(this.t);
        sb.append(", finalCost=");
        sb.append(this.u);
        g8e.D(sb, ", finalCostDecimalValue=", this.v, ", finalCostAsStr=", this.w);
        sb.append(", costMessage=");
        sb.append(this.x);
        sb.append(", plusInfo=");
        sb.append(this.y);
        sb.append(", tariffUpgrade=");
        sb.append(this.z);
        sb.append(", supportedFeedbackChoices=");
        sb.append(this.A);
        sb.append(", routeSharingUrl=");
        sb.append(this.B);
        sb.append(", allowedChanges=");
        sb.append(this.C);
        sb.append(", _feedback=");
        sb.append(this.D);
        sb.append(", tipsSuggestions=");
        sb.append(this.E);
        sb.append(", cancelledBy=");
        sb.append(this.F);
        sb.append(", isUserReady=");
        sb.append(this.G);
        sb.append(", isRideSaved=");
        sb.append(this.H);
        sb.append(", payment=");
        sb.append(this.I);
        sb.append(", paymentChanges=");
        sb.append(this.J);
        sb.append(", currencyRulesDto=");
        sb.append(this.K);
        sb.append(", cancelRules=");
        sb.append(this.L);
        sb.append(", isCancelDisabled=");
        sb.append(this.M);
        nzs.o(sb, ", maxWaitingTimeSec=", this.N, ", departureTime=");
        sb.append(this.O);
        sb.append(", notifications=");
        sb.append(this.P);
        sb.append(", cancelReasonDescription=");
        sb.append(this.Q);
        sb.append(", isDriverChatEnabled=");
        sb.append(this.R);
        sb.append(", isDriverCallEnabled=");
        sb.append(this.S);
        sb.append(", costMessageDetails=");
        sb.append(this.T);
        sb.append(", orderName=");
        tse0.x(this.U, ", buttonModifierDTOS=", ", forceDestinationDTO=", sb, this.V);
        sb.append(this.W);
        sb.append(", paidOptionDiscount=");
        sb.append(this.X);
        sb.append(", canMakeMoreOrders=");
        sb.append(this.Y);
        sb.append(", stateInfo=");
        sb.append(this.Z);
        sb.append(", dispatchCheckIn=");
        sb.append(this.a0);
        sb.append(", tollRoads=");
        sb.append(this.b0);
        sb.append(", estimates=");
        sb.append(this.c0);
        sb.append(", totwPromotions=");
        sb.append(this.d0);
        sb.append(", freightageContract=");
        sb.append(this.e0);
        sb.append(", customEndpoints=");
        sb.append(this.f0);
        sb.append(", companions=");
        sb.append(this.g0);
        sb.append(", multiOrderInfo=");
        sb.append(this.h0);
        sb.append(", freightageRideItem=");
        sb.append(this.i0);
        sb.append(", alternativeDestination=");
        sb.append(this.j0);
        sb.append(", travelCompanionPoints=");
        sb.append(this.k0);
        sb.append(", searchInfo=");
        sb.append(this.l0);
        sb.append(", finalCompanionsSearch=");
        sb.append(this.m0);
        sb.append(", orderDetailsCard=");
        sb.append(this.n0);
        sb.append(", rideCardInfo=");
        sb.append(this.o0);
        sb.append(", orderStartDate=");
        sb.append(this.p0);
        sb.append(", messengerChatId=");
        tse0.y(this.q0, ", messengerVoiceEnabled=", ", modalContent=", sb, this.r0);
        sb.append(this.s0);
        sb.append(", transportInfo=");
        sb.append(this.t0);
        sb.append(", ridaSearchInfo=");
        sb.append(this.u0);
        sb.append(", tariffsSuggest=");
        sb.append(this.v0);
        sb.append(", typedExperiments=");
        sb.append(this.w0);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination;", "", "Companion", "Point", "InfoBlock", "DetailScreen", "$serializer", "com/yandex/go/taxi/order/models/api/response/f2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class AlternativeDestination {
        public static final f2 Companion = new f2();
        public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c680(21)), null, null};
        public final Point a;
        public final Point b;
        public final String c;
        public final List d;
        public final int e;
        public final InfoBlock f;

        public AlternativeDestination(int i, Point point, Point point2, String str, List list, int i2, InfoBlock infoBlock) {
            if ((i & 1) == 0) {
                Point.Companion.getClass();
                point = Point.c;
            }
            this.a = point;
            if ((i & 2) == 0) {
                Point.Companion.getClass();
                this.b = Point.c;
            } else {
                this.b = point2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = infoBlock;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Point getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final InfoBlock getF() {
            return this.f;
        }

        /* renamed from: c, reason: from getter */
        public final List getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlternativeDestination)) {
                return false;
            }
            AlternativeDestination alternativeDestination = (AlternativeDestination) obj;
            return jl40.l(this.a, alternativeDestination.a) && jl40.l(this.b, alternativeDestination.b) && jl40.l(this.c, alternativeDestination.c) && jl40.l(this.d, alternativeDestination.d) && this.e == alternativeDestination.e && jl40.l(this.f, alternativeDestination.f);
        }

        public final int hashCode() {
            int b = oyr.b(this.e, unr0.c(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
            InfoBlock infoBlock = this.f;
            return b + (infoBlock == null ? 0 : infoBlock.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlternativeDestination(destinationPoint=");
            sb.append(this.a);
            sb.append(", alternativePoint=");
            sb.append(this.b);
            sb.append(", walkTime=");
            tse0.x(this.c, ", route=", ", secondsAfterFinish=", sb, this.d);
            sb.append(this.e);
            sb.append(", infoBlock=");
            sb.append(this.f);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$DetailScreen;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/g2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class DetailScreen {
            public static final g2 Companion = new g2();
            public final ly6 a;

            public /* synthetic */ DetailScreen(int i, ly6 ly6Var) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = ly6Var;
                }
            }

            /* renamed from: a, reason: from getter */
            public final ly6 getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DetailScreen) && jl40.l(this.a, ((DetailScreen) obj).a);
            }

            public final int hashCode() {
                ly6 ly6Var = this.a;
                if (ly6Var == null) {
                    return 0;
                }
                return ly6Var.hashCode();
            }

            public final String toString() {
                return "DetailScreen(button=" + this.a + Extension.C_BRAKE;
            }

            public DetailScreen() {
                this.a = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$Point;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/i2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Point {
            public static final i2 Companion = new i2();
            public static final Point c = new Point(0);
            public final zzs a;
            public final rf00 b;

            public /* synthetic */ Point(int i, zzs zzsVar, rf00 rf00Var) {
                this.a = (i & 1) == 0 ? zzs.f : zzsVar;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = rf00Var;
                }
            }

            /* renamed from: a, reason: from getter */
            public final zzs getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return jl40.l(this.a, point.a) && jl40.l(this.b, point.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                rf00 rf00Var = this.b;
                return hashCode + (rf00Var == null ? 0 : rf00Var.hashCode());
            }

            public final String toString() {
                return "Point(position=" + this.a + ", bubble=" + this.b + Extension.C_BRAKE;
            }

            public Point() {
                this(0);
            }

            public Point(int i) {
                this.a = zzs.f;
                this.b = null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$InfoBlock;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/h2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class InfoBlock {
            public static final h2 Companion = new h2();
            public final String a;
            public final String b;
            public final ly6 c;
            public final String d;
            public final DetailScreen e;

            public InfoBlock(int i, String str, String str2, ly6 ly6Var, String str3, DetailScreen detailScreen) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    ly6.Companion.getClass();
                    this.c = ly6.d;
                } else {
                    this.c = ly6Var;
                }
                if ((i & 8) == 0) {
                    this.d = "";
                } else {
                    this.d = str3;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = detailScreen;
                }
            }

            /* renamed from: a, reason: from getter */
            public final ly6 getC() {
                return this.c;
            }

            /* renamed from: b, reason: from getter */
            public final DetailScreen getE() {
                return this.e;
            }

            /* renamed from: c, reason: from getter */
            public final String getB() {
                return this.b;
            }

            /* renamed from: d, reason: from getter */
            public final String getD() {
                return this.d;
            }

            /* renamed from: e, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoBlock)) {
                    return false;
                }
                InfoBlock infoBlock = (InfoBlock) obj;
                return jl40.l(this.a, infoBlock.a) && jl40.l(this.b, infoBlock.b) && jl40.l(this.c, infoBlock.c) && jl40.l(this.d, infoBlock.d) && jl40.l(this.e, infoBlock.e);
            }

            public final int hashCode() {
                int b = unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
                DetailScreen detailScreen = this.e;
                return b + (detailScreen == null ? 0 : detailScreen.hashCode());
            }

            public final String toString() {
                StringBuilder v = b64.v("InfoBlock(title=", this.a, ", subtitle=", this.b, ", closeButton=");
                v.append(this.c);
                v.append(", tariffIconTag=");
                v.append(this.d);
                v.append(", detailScreen=");
                v.append(this.e);
                v.append(Extension.C_BRAKE);
                return v.toString();
            }

            public InfoBlock() {
                ly6.Companion.getClass();
                this.a = "";
                this.b = "";
                this.c = ly6.d;
                this.d = "";
                this.e = null;
            }
        }

        public AlternativeDestination() {
            i2 i2Var = Point.Companion;
            i2Var.getClass();
            Point point = Point.c;
            i2Var.getClass();
            this.a = point;
            this.b = point;
            this.c = "";
            this.d = EmptyList.a;
            this.e = 0;
            this.f = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CashbackDetails;", "", "Companion", "ActionType", "Action", "com/yandex/go/taxi/order/models/api/response/n2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CashbackDetails {
        public static final n2 Companion = new n2();
        public final Action a;
        public final FormattedText b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CashbackDetails$ActionType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/m2", "BUY_PLUS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ActionType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final ActionType BUY_PLUS;
            public static final m2 Companion;

            static {
                ActionType actionType = new ActionType("BUY_PLUS", 0);
                BUY_PLUS = actionType;
                ActionType[] actionTypeArr = {actionType};
                $VALUES = actionTypeArr;
                $ENTRIES = kotlin.enums.a.a(actionTypeArr);
                Companion = new m2();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c680(24));
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ CashbackDetails(int i, Action action, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = action;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CashbackDetails$Action;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/l2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Action {
            public static final l2 Companion = new l2();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c680(23))};
            public final ActionType a;

            public /* synthetic */ Action(int i, ActionType actionType) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = actionType;
                }
            }

            public Action() {
                this.a = null;
            }
        }

        public CashbackDetails() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/s2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ExtraItem {
        public static final s2 Companion = new s2();
        public final String a;

        public /* synthetic */ ExtraItem(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public ExtraItem() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ModalsContent;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class ModalsContent {
        public static final u2 Companion = new u2();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c680(27))};
        public final List a;

        public /* synthetic */ ModalsContent(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ModalsContent) && jl40.l(this.a, ((ModalsContent) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("ModalsContent(modals=", Extension.C_BRAKE, this.a);
        }

        public ModalsContent() {
            this.a = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$SearchEstimates;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/g3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class SearchEstimates {
        public static final g3 Companion = new g3();
        public final double a;

        public /* synthetic */ SearchEstimates(int i, double d) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
        }

        public final long a() {
            return (long) (this.a * 1000.0d);
        }

        public SearchEstimates() {
            this.a = 0.0d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TipsSuggestions;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/h3", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TipsSuggestions {
        public static final h3 Companion = new h3();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(1))};
        public static final TipsSuggestions c = new TipsSuggestions(0);
        public final List a;

        public /* synthetic */ TipsSuggestions(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final TipsVariant.CustomizedOptions a() {
            List list = this.a;
            TipsVariant tipsVariant = list != null ? (TipsVariant) kotlin.collections.a.R(list) : null;
            TipsVariant.CustomizedOptions customizedOptions = tipsVariant != null ? tipsVariant.b : null;
            if (customizedOptions != null) {
                return customizedOptions;
            }
            TipsVariant.CustomizedOptions.Companion.getClass();
            return TipsVariant.CustomizedOptions.e;
        }

        public final TipsType b() {
            TipsType b2;
            TipsVariant tipsVariant = (TipsVariant) kotlin.collections.a.R(this.a);
            return (tipsVariant == null || (b2 = tipsVariant.b()) == null) ? TipsType.PERCENT : b2;
        }

        public TipsSuggestions(int i) {
            this.a = EmptyList.a;
        }

        public TipsSuggestions() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TransportInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/m3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class TransportInfo {
        public static final m3 Companion = new m3();
        public final String a;

        public /* synthetic */ TransportInfo(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransportInfo) && jl40.l(this.a, ((TransportInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("TransportInfo(deeplink=", this.a, Extension.C_BRAKE);
        }

        public TransportInfo() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$Modal;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/t2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class Modal {
        public static final t2 Companion = new t2();
        public final u0 a;

        public /* synthetic */ Modal(int i, u0 u0Var) {
            if ((i & 1) == 0) {
                this.a = new ModalItemDto$DefaultItem(0);
            } else {
                this.a = u0Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Modal) && jl40.l(this.a, ((Modal) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Modal(item=" + this.a + Extension.C_BRAKE;
        }

        public Modal() {
            this.a = new ModalItemDto$DefaultItem(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$PlusInfo;", "", "Companion", "PlusInfoTemplate", "com/yandex/go/taxi/order/models/api/response/w2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class PlusInfo {
        public static final w2 Companion = new w2();
        public static final i3y[] c;
        public static final PlusInfo d;
        public final List a;
        public final Map b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new c680(28)), kotlin.a.b(lazyThreadSafetyMode, new c680(29))};
            d = new PlusInfo(0);
        }

        public /* synthetic */ PlusInfo(int i, List list, Map map) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = map;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Map getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final List getA() {
            return this.a;
        }

        public PlusInfo(int i) {
            this.a = EmptyList.a;
            this.b = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$PlusInfo$PlusInfoTemplate;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/x2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PlusInfoTemplate {
            public static final x2 Companion = new x2();
            public final String a;
            public final String b;

            public /* synthetic */ PlusInfoTemplate(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getA() {
                return this.a;
            }

            /* renamed from: b, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public PlusInfoTemplate() {
                this.a = "";
                this.b = "";
            }
        }

        public PlusInfo() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo;", "", "Companion", "BidInfoDto", "ViewInfo", "IncreasePriceInfo", "BackgroundColors", "$serializer", "com/yandex/go/taxi/order/models/api/response/a3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class RidaSearchInfo {
        public static final a3 Companion = new a3();
        public static final i3y[] h = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(0))};
        public final int a;
        public final BackgroundColors b;
        public final FormattedText c;
        public final String d;
        public final ViewInfo e;
        public final IncreasePriceInfo f;
        public final List g;

        public /* synthetic */ RidaSearchInfo(int i, int i2, BackgroundColors backgroundColors, FormattedText formattedText, String str, ViewInfo viewInfo, IncreasePriceInfo increasePriceInfo, List list) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = new BackgroundColors(0);
            } else {
                this.b = backgroundColors;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = viewInfo;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = increasePriceInfo;
            }
            if ((i & 64) == 0) {
                this.g = EmptyList.a;
            } else {
                this.g = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RidaSearchInfo)) {
                return false;
            }
            RidaSearchInfo ridaSearchInfo = (RidaSearchInfo) obj;
            return this.a == ridaSearchInfo.a && jl40.l(this.b, ridaSearchInfo.b) && jl40.l(this.c, ridaSearchInfo.c) && jl40.l(this.d, ridaSearchInfo.d) && jl40.l(this.e, ridaSearchInfo.e) && jl40.l(this.f, ridaSearchInfo.f) && jl40.l(this.g, ridaSearchInfo.g);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            FormattedText formattedText = this.c;
            int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
            String str = this.d;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ViewInfo viewInfo = this.e;
            int hashCode4 = (hashCode3 + (viewInfo == null ? 0 : viewInfo.hashCode())) * 31;
            IncreasePriceInfo increasePriceInfo = this.f;
            return this.g.hashCode() + ((hashCode4 + (increasePriceInfo != null ? increasePriceInfo.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RidaSearchInfo(iteration=");
            sb.append(this.a);
            sb.append(", backgroundColors=");
            sb.append(this.b);
            sb.append(", lookupTitle=");
            sb.append(this.c);
            sb.append(", lookupSubtitle=");
            sb.append(this.d);
            sb.append(", viewInfo=");
            sb.append(this.e);
            sb.append(", increasePriceInfo=");
            sb.append(this.f);
            sb.append(", bids=");
            return ly3.s(sb, this.g, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo;", "", "Companion", "NewState", PlusPayUiKitInflaterFactory.NAME_BUTTON, "Modal", "$serializer", "com/yandex/go/taxi/order/models/api/response/c3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class IncreasePriceInfo {
            public static final c3 Companion = new c3();
            public final NewState a;
            public final String b;
            public final Button c;
            public final Modal d;

            public /* synthetic */ IncreasePriceInfo(int i, NewState newState, String str, Button button, Modal modal) {
                this.a = (i & 1) == 0 ? new NewState(0) : newState;
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str;
                }
                if ((i & 4) == 0) {
                    this.c = new Button(0);
                } else {
                    this.c = button;
                }
                if ((i & 8) == 0) {
                    this.d = new Modal(0);
                } else {
                    this.d = modal;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IncreasePriceInfo)) {
                    return false;
                }
                IncreasePriceInfo increasePriceInfo = (IncreasePriceInfo) obj;
                return jl40.l(this.a, increasePriceInfo.a) && jl40.l(this.b, increasePriceInfo.b) && jl40.l(this.c, increasePriceInfo.c) && jl40.l(this.d, increasePriceInfo.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
            }

            public final String toString() {
                return "IncreasePriceInfo(newState=" + this.a + ", passengerPriceIncrement=" + this.b + ", button=" + this.c + ", modal=" + this.d + Extension.C_BRAKE;
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$Button;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/b3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class Button {
                public static final b3 Companion = new b3();
                public final String a;
                public final String b;

                public /* synthetic */ Button(int i, String str, String str2) {
                    if ((i & 1) == 0) {
                        this.a = "";
                    } else {
                        this.a = str;
                    }
                    if ((i & 2) == 0) {
                        this.b = "";
                    } else {
                        this.b = str2;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return jl40.l(this.a, button.a) && jl40.l(this.b, button.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return unr0.p("Button(text=", this.a, ", style=", this.b, Extension.C_BRAKE);
                }

                public Button(int i) {
                    this.a = "";
                    this.b = "";
                }

                public Button() {
                    this(0);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$NewState;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class NewState {
                public static final e3 Companion = new e3();
                public final BackgroundColors a;
                public final String b;

                public /* synthetic */ NewState(int i, BackgroundColors backgroundColors, String str) {
                    this.a = (i & 1) == 0 ? new BackgroundColors(0) : backgroundColors;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof NewState)) {
                        return false;
                    }
                    NewState newState = (NewState) obj;
                    return jl40.l(this.a, newState.a) && jl40.l(this.b, newState.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    String str = this.b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return "NewState(backgroundColors=" + this.a + ", lookupSubtitle=" + this.b + Extension.C_BRAKE;
                }

                public NewState() {
                    this(0);
                }

                public NewState(int i) {
                    this.a = new BackgroundColors(0);
                    this.b = null;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$Modal;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final /* data */ class Modal {
                public static final d3 Companion = new d3();
                public final String a;
                public final String b;
                public final String c;
                public final String d;

                public /* synthetic */ Modal(int i, String str, String str2, String str3, String str4) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = str;
                    }
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = str2;
                    }
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = str3;
                    }
                    if ((i & 8) == 0) {
                        this.d = null;
                    } else {
                        this.d = str4;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Modal)) {
                        return false;
                    }
                    Modal modal = (Modal) obj;
                    return jl40.l(this.a, modal.a) && jl40.l(this.b, modal.b) && jl40.l(this.c, modal.c) && jl40.l(this.d, modal.d);
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.c;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.d;
                    return hashCode3 + (str4 != null ? str4.hashCode() : 0);
                }

                public final String toString() {
                    return g8e.r(b64.v("Modal(title=", this.a, ", bodyText=", this.b, ", yesText="), this.c, ", noText=", this.d, Extension.C_BRAKE);
                }

                public Modal(int i) {
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                }

                public Modal() {
                    this(0);
                }
            }

            public IncreasePriceInfo() {
                NewState newState = new NewState(0);
                Button button = new Button(0);
                Modal modal = new Modal(0);
                this.a = newState;
                this.b = "";
                this.c = button;
                this.d = modal;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$ViewInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/f3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ViewInfo {
            public static final f3 Companion = new f3();
            public final int a;
            public final int b;

            public /* synthetic */ ViewInfo(int i, int i2, int i3) {
                if ((i & 1) == 0) {
                    this.a = 0;
                } else {
                    this.a = i2;
                }
                if ((i & 2) == 0) {
                    this.b = 0;
                } else {
                    this.b = i3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewInfo)) {
                    return false;
                }
                ViewInfo viewInfo = (ViewInfo) obj;
                return this.a == viewInfo.a && this.b == viewInfo.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return b64.d(this.a, this.b, "ViewInfo(count=", ", progressPercent=", Extension.C_BRAKE);
            }

            public ViewInfo() {
                this.a = 0;
                this.b = 0;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$BackgroundColors;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class BackgroundColors {
            public static final y2 Companion = new y2();
            public final String a;
            public final String b;

            public /* synthetic */ BackgroundColors(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BackgroundColors)) {
                    return false;
                }
                BackgroundColors backgroundColors = (BackgroundColors) obj;
                return jl40.l(this.a, backgroundColors.a) && jl40.l(this.b, backgroundColors.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return unr0.p("BackgroundColors(startColor=", this.a, ", endColor=", this.b, Extension.C_BRAKE);
            }

            public BackgroundColors(int i) {
                this.a = "";
                this.b = "";
            }

            public BackgroundColors() {
                this(0);
            }
        }

        public RidaSearchInfo() {
            BackgroundColors backgroundColors = new BackgroundColors(0);
            this.a = 0;
            this.b = backgroundColors;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = EmptyList.a;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo$BidInfoDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/z2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class BidInfoDto {
            public static final z2 Companion = new z2();
            public final String a;
            public final String b;
            public final FormattedText c;
            public final Long d;
            public final int e;
            public final FormattedText f;
            public final FormattedText g;
            public final boolean h;
            public final String i;

            public /* synthetic */ BidInfoDto(int i, String str, String str2, FormattedText formattedText, Long l, int i2, FormattedText formattedText2, FormattedText formattedText3, boolean z, String str3) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = l;
                }
                if ((i & 16) == 0) {
                    this.e = 0;
                } else {
                    this.e = i2;
                }
                if ((i & 32) == 0) {
                    this.f = FormattedText.c;
                } else {
                    this.f = formattedText2;
                }
                if ((i & 64) == 0) {
                    this.g = FormattedText.c;
                } else {
                    this.g = formattedText3;
                }
                if ((i & 128) == 0) {
                    this.h = false;
                } else {
                    this.h = z;
                }
                if ((i & 256) == 0) {
                    this.i = "";
                } else {
                    this.i = str3;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BidInfoDto)) {
                    return false;
                }
                BidInfoDto bidInfoDto = (BidInfoDto) obj;
                return jl40.l(this.a, bidInfoDto.a) && jl40.l(this.b, bidInfoDto.b) && jl40.l(this.c, bidInfoDto.c) && jl40.l(this.d, bidInfoDto.d) && this.e == bidInfoDto.e && jl40.l(this.f, bidInfoDto.f) && jl40.l(this.g, bidInfoDto.g) && this.h == bidInfoDto.h && jl40.l(this.i, bidInfoDto.i);
            }

            public final int hashCode() {
                int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c.a);
                Long l = this.d;
                return this.i.hashCode() + unr0.e(unr0.c(unr0.c(oyr.b(this.e, (c + (l == null ? 0 : l.hashCode())) * 31, 31), 31, this.f.a), 31, this.g.a), 31, this.h);
            }

            public final String toString() {
                StringBuilder v = b64.v("BidInfoDto(bidId=", this.a, ", driverName=", this.b, ", subtitle=");
                v.append(this.c);
                v.append(", createdAt=");
                v.append(this.d);
                v.append(", ttl=");
                v.append(this.e);
                v.append(", price=");
                v.append(this.f);
                v.append(", eta=");
                v.append(this.g);
                v.append(", isFastest=");
                v.append(this.h);
                v.append(", driverAvatarUrl=");
                return oyr.t(v, this.i, Extension.C_BRAKE);
            }

            public BidInfoDto() {
                FormattedText formattedText = FormattedText.c;
                this.a = "";
                this.b = "";
                this.c = formattedText;
                this.d = null;
                this.e = 0;
                this.f = formattedText;
                this.g = formattedText;
                this.h = false;
                this.i = "";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/r2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ExtraInfo {
        public static final r2 Companion = new r2();
        public final String a;
        public final String b;

        public /* synthetic */ ExtraInfo(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public ExtraInfo() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$MultiOrderInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/v2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class MultiOrderInfo {
        public static final v2 Companion = new v2();
        public final String a;
        public final String b;

        public /* synthetic */ MultiOrderInfo(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public MultiOrderInfo() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TollRoadCard;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/j3", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TollRoadCard {
        public static final j3 Companion = new j3();
        public static final TollRoadCard c = new TollRoadCard(0);
        public final String a;
        public final String b;

        public /* synthetic */ TollRoadCard(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public TollRoadCard(int i) {
            this.a = "";
            this.b = "";
        }

        public TollRoadCard() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CancelReasonDescription;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/j2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CancelReasonDescription {
        public static final j2 Companion = new j2();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CancelReasonDescription(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public CancelReasonDescription() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TollRoadUi;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/k3", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TollRoadUi {
        public static final k3 Companion = new k3();
        public static final TollRoadUi c = new TollRoadUi(0);
        public final TollRoadCard a;
        public final TollRoadAlert b;

        public TollRoadUi(int i, TollRoadCard tollRoadCard, TollRoadAlert tollRoadAlert) {
            if ((i & 1) == 0) {
                TollRoadCard.Companion.getClass();
                tollRoadCard = TollRoadCard.c;
            }
            this.a = tollRoadCard;
            if ((i & 2) != 0) {
                this.b = tollRoadAlert;
            } else {
                TollRoadAlert.Companion.getClass();
                this.b = TollRoadAlert.d;
            }
        }

        public TollRoadUi() {
            this(0);
        }

        public TollRoadUi(int i) {
            TollRoadCard.Companion.getClass();
            TollRoadAlert.Companion.getClass();
            this.a = TollRoadCard.c;
            this.b = TollRoadAlert.d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CostMessageDetails;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/q2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CostMessageDetails {
        public static final q2 Companion = new q2();
        public static final i3y[] d;
        public final List a;
        public final List b;
        public final CashbackDetails c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new c680(25)), kotlin.a.b(lazyThreadSafetyMode, new c680(26)), null};
        }

        public /* synthetic */ CostMessageDetails(int i, List list, List list2, CashbackDetails cashbackDetails) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = cashbackDetails;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final List getA() {
            return this.a;
        }

        public CostMessageDetails() {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TollRoadAlert;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/i3", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TollRoadAlert {
        public static final i3 Companion = new i3();
        public static final TollRoadAlert d = new TollRoadAlert(0);
        public final String a;
        public final FormattedText b;
        public final String c;

        public /* synthetic */ TollRoadAlert(int i, String str, String str2, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public TollRoadAlert(int i) {
            this.a = "";
            this.b = null;
            this.c = "";
        }

        public TollRoadAlert() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$CostBreakdown;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/p2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class CostBreakdown {
        public static final p2 Companion = new p2();
        public final String a;
        public final FormattedText b;
        public final String c;
        public final FormattedText d;

        public /* synthetic */ CostBreakdown(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final FormattedText getD() {
            return this.d;
        }

        /* renamed from: d, reason: from getter */
        public final FormattedText getB() {
            return this.b;
        }

        public CostBreakdown() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$TollRoads;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/l3", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TollRoads {
        public static final l3 Companion = new l3();
        public static final TollRoads f = new TollRoads(0);
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final TollRoadUi e;

        public TollRoads(int i, boolean z, boolean z2, boolean z3, boolean z4, TollRoadUi tollRoadUi) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z4;
            }
            if ((i & 16) != 0) {
                this.e = tollRoadUi;
            } else {
                TollRoadUi.Companion.getClass();
                this.e = TollRoadUi.c;
            }
        }

        public final boolean a() {
            return this.a || this.d;
        }

        public TollRoads() {
            this(0);
        }

        public TollRoads(int i) {
            TollRoadUi.Companion.getClass();
            TollRoadUi tollRoadUi = TollRoadUi.c;
            this.a = false;
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = tollRoadUi;
        }
    }

    public OrderStatusInfo() {
        this(0);
    }

    public OrderStatusInfo(int i) {
        Driver driver = Driver.v;
        PlusInfo.Companion.getClass();
        PlusInfo a = w2.a();
        SupportedFeedbackChoices.Companion.getClass();
        SupportedFeedbackChoices supportedFeedbackChoices = SupportedFeedbackChoices.j;
        TipsSuggestions tipsSuggestions = TipsSuggestions.c;
        lv90.Companion.getClass();
        lv90 lv90Var = lv90.g;
        v280.Companion.getClass();
        v280 a2 = u280.a();
        ForceDestinationDTO forceDestinationDTO = ForceDestinationDTO.b;
        PaidOptionDiscount paidOptionDiscount = PaidOptionDiscount.b;
        CanMakeMoreOrders canMakeMoreOrders = CanMakeMoreOrders.UNMODIFIED;
        StateInfo.Companion.getClass();
        StateInfo a3 = s7.a();
        TollRoads tollRoads = TollRoads.f;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = driver;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0.0d;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = 0.0d;
        this.p = null;
        this.q = null;
        this.r = null;
        EmptyList emptyList = EmptyList.a;
        this.s = emptyList;
        this.t = null;
        this.u = 0.0d;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = a;
        this.z = TariffUpgradeDto.e;
        this.A = supportedFeedbackChoices;
        this.B = null;
        this.C = emptyList;
        this.D = null;
        this.E = tipsSuggestions;
        this.F = null;
        this.G = false;
        this.H = false;
        this.I = lv90Var;
        this.J = emptyList;
        this.K = null;
        this.L = null;
        this.M = false;
        this.N = 0.0d;
        this.O = null;
        this.P = a2;
        this.Q = null;
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = null;
        this.V = emptyList;
        this.W = forceDestinationDTO;
        this.X = paidOptionDiscount;
        this.Y = canMakeMoreOrders;
        this.Z = a3;
        this.a0 = null;
        this.b0 = tollRoads;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = emptyList;
        this.g0 = emptyList;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = emptyList;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = false;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
    }
}
