package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.n96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment;", "Ln96;", "Companion", "OrderStatusRule", "com/yandex/go/taxi/order/models/api/response/typed_experiments/p", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WalkRouteOrderExperiment extends n96 {
    public static final p Companion = new p();
    public static final i3y[] k = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(15))};
    public static final WalkRouteOrderExperiment l = new WalkRouteOrderExperiment(0);
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Float h;
    public final List i;
    public final a3y0 j;

    public WalkRouteOrderExperiment(int i, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Float f, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = num5;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        this.j = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "WalkRouteOrderExperiment");
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return (!getB() || this.e == null || this.f == null || this.c == null || this.d == null || this.i == null || this.g == null || this.h == null) ? false : true;
    }

    public final int c() {
        Integer num = this.d;
        if (num != null && num.intValue() >= 0) {
            return num.intValue();
        }
        a3y0.d(this.j, "routeInfoMinDurationSeconds", new IllegalStateException("invalid routeInfoMinDurationSeconds: " + num), null, 4);
        return 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment$OrderStatusRule;", "", "Companion", "PointType", "$serializer", "com/yandex/go/taxi/order/models/api/response/typed_experiments/q", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class OrderStatusRule {
        public static final q Companion = new q();
        public static final i3y[] d;
        public final DriveState a;
        public final PointType b;
        public final PointType c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment$OrderStatusRule$PointType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/r", "CAR", "POINT_A", "POINT_B", "END_OF_DRIVING_ROUTE", "USER_LOCATION", "CHECK_IN_ZONE", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PointType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ PointType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final PointType CAR;
            public static final PointType CHECK_IN_ZONE;
            public static final r Companion;
            public static final PointType END_OF_DRIVING_ROUTE;
            public static final PointType NONE;
            public static final PointType POINT_A;
            public static final PointType POINT_B;
            public static final PointType USER_LOCATION;

            static {
                PointType pointType = new PointType("CAR", 0);
                CAR = pointType;
                PointType pointType2 = new PointType("POINT_A", 1);
                POINT_A = pointType2;
                PointType pointType3 = new PointType("POINT_B", 2);
                POINT_B = pointType3;
                PointType pointType4 = new PointType("END_OF_DRIVING_ROUTE", 3);
                END_OF_DRIVING_ROUTE = pointType4;
                PointType pointType5 = new PointType("USER_LOCATION", 4);
                USER_LOCATION = pointType5;
                PointType pointType6 = new PointType("CHECK_IN_ZONE", 5);
                CHECK_IN_ZONE = pointType6;
                PointType pointType7 = new PointType(JCP.RAW_PREFIX, 6);
                NONE = pointType7;
                PointType[] pointTypeArr = {pointType, pointType2, pointType3, pointType4, pointType5, pointType6, pointType7};
                $VALUES = pointTypeArr;
                $ENTRIES = kotlin.enums.a.a(pointTypeArr);
                Companion = new r();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(19));
            }

            public static PointType valueOf(String str) {
                return (PointType) Enum.valueOf(PointType.class, str);
            }

            public static PointType[] values() {
                return (PointType[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new b931(16)), kotlin.a.b(lazyThreadSafetyMode, new b931(17)), kotlin.a.b(lazyThreadSafetyMode, new b931(18))};
        }

        public /* synthetic */ OrderStatusRule(int i, DriveState driveState, PointType pointType, PointType pointType2) {
            this.a = (i & 1) == 0 ? null : driveState;
            if ((i & 2) == 0) {
                this.b = PointType.NONE;
            } else {
                this.b = pointType;
            }
            if ((i & 4) == 0) {
                this.c = PointType.NONE;
            } else {
                this.c = pointType2;
            }
        }

        public OrderStatusRule() {
            PointType pointType = PointType.NONE;
            this.a = null;
            this.b = pointType;
            this.c = pointType;
        }
    }

    public WalkRouteOrderExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "WalkRouteOrderExperiment");
    }

    public WalkRouteOrderExperiment() {
        this(0);
    }
}
