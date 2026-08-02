package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kr;
import defpackage.ojw;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction;", "Lkr;", "Companion", "FlexPointType", "SourceRouteInfo", "PedestrianParameters", "ModalScreenContent", "AvailablePointToSelection", "ClarifyPointOriginalPoint", "TripInfo", "TripInfoPoint", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityOpenShuttleClarifyPointAction extends kr {
    public static final f Companion = new f();
    public static final i3y[] j;
    public final String a;
    public final FlexPointType b;
    public final String c;
    public final String d;
    public final ClarifyPointOriginalPoint e;
    public final SourceRouteInfo f;
    public final ModalScreenContent g;
    public final List h;
    public final TripInfo i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$AvailablePointToSelection;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AvailablePointToSelection {
        public static final d Companion = new d();
        public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(6)), null, null, null};
        public final String a;
        public final Double[] b;
        public final String c;
        public final String d;
        public final String e;

        public /* synthetic */ AvailablePointToSelection(int i, String str, Double[] dArr, String str2, String str3, String str4) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, IntercityOpenShuttleClarifyPointAction$AvailablePointToSelection$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = dArr;
            this.c = str2;
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$FlexPointType;", "", "Companion", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/g", "SOURCE", "DESTINATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FlexPointType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FlexPointType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final FlexPointType DESTINATION;
        public static final FlexPointType SOURCE;

        static {
            FlexPointType flexPointType = new FlexPointType("SOURCE", 0);
            SOURCE = flexPointType;
            FlexPointType flexPointType2 = new FlexPointType("DESTINATION", 1);
            DESTINATION = flexPointType2;
            FlexPointType[] flexPointTypeArr = {flexPointType, flexPointType2};
            $VALUES = flexPointTypeArr;
            $ENTRIES = kotlin.enums.a.a(flexPointTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(8));
        }

        public static FlexPointType valueOf(String str) {
            return (FlexPointType) Enum.valueOf(FlexPointType.class, str);
        }

        public static FlexPointType[] values() {
            return (FlexPointType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ojw(4)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ojw(5)), null};
    }

    public /* synthetic */ IntercityOpenShuttleClarifyPointAction(int i, String str, FlexPointType flexPointType, String str2, String str3, ClarifyPointOriginalPoint clarifyPointOriginalPoint, SourceRouteInfo sourceRouteInfo, ModalScreenContent modalScreenContent, List list, TripInfo tripInfo) {
        if (208 != (i & 208)) {
            qje.Z(i, 208, IntercityOpenShuttleClarifyPointAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = flexPointType;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = clarifyPointOriginalPoint;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = sourceRouteInfo;
        }
        this.g = modalScreenContent;
        this.h = list;
        if ((i & 256) == 0) {
            this.i = new TripInfo(0);
        } else {
            this.i = tripInfo;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$SourceRouteInfo;", "", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SourceRouteInfo {
        public static final j Companion = new j();
        public final PedestrianParameters a;

        public /* synthetic */ SourceRouteInfo(int i, PedestrianParameters pedestrianParameters) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = pedestrianParameters;
            }
        }

        public SourceRouteInfo() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$PedestrianParameters;", "", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PedestrianParameters {
        public static final i Companion = new i();
        public final Integer a;
        public final Integer b;

        public /* synthetic */ PedestrianParameters(int i, Integer num, Integer num2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
        }

        public PedestrianParameters() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$ClarifyPointOriginalPoint;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ClarifyPointOriginalPoint {
        public static final e Companion = new e();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(7)), null};
        public final Double[] a;
        public final String b;

        public /* synthetic */ ClarifyPointOriginalPoint(int i, Double[] dArr, String str) {
            if ((i & 1) == 0) {
                this.a = new Double[0];
            } else {
                this.a = dArr;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public ClarifyPointOriginalPoint() {
            this.a = new Double[0];
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$TripInfo;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TripInfo {
        public static final k Companion = new k();
        public final TripInfoPoint a;
        public final TripInfoPoint b;

        public /* synthetic */ TripInfo(int i, TripInfoPoint tripInfoPoint, TripInfoPoint tripInfoPoint2) {
            int i2 = 0;
            this.a = (i & 1) == 0 ? new TripInfoPoint(i2) : tripInfoPoint;
            if ((i & 2) == 0) {
                this.b = new TripInfoPoint(i2);
            } else {
                this.b = tripInfoPoint2;
            }
        }

        public TripInfo() {
            this(0);
        }

        public TripInfo(int i) {
            int i2 = 0;
            TripInfoPoint tripInfoPoint = new TripInfoPoint(i2);
            TripInfoPoint tripInfoPoint2 = new TripInfoPoint(i2);
            this.a = tripInfoPoint;
            this.b = tripInfoPoint2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$ModalScreenContent;", "", "<init>", "()V", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ModalScreenContent {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ModalScreenContent(int i, String str, String str2, String str3) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public ModalScreenContent() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/IntercityOpenShuttleClarifyPointAction$TripInfoPoint;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/action/serializer/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TripInfoPoint {
        public static final l Companion = new l();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(9)), null};
        public final String a;
        public final String b;
        public final Double[] c;
        public final String d;

        public /* synthetic */ TripInfoPoint(int i, String str, String str2, Double[] dArr, String str3) {
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
                this.c = new Double[0];
            } else {
                this.c = dArr;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
        }

        public TripInfoPoint() {
            this(0);
        }

        public TripInfoPoint(String str, String str2, Double[] dArr, String str3) {
            this.a = str;
            this.b = str2;
            this.c = dArr;
            this.d = str3;
        }

        public /* synthetic */ TripInfoPoint(int i) {
            this("", "", new Double[0], "");
        }
    }
}
