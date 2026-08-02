package com.yandex.go.preorder.mode;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/preorder/mode/SourcePointMode;", "", "POINT", "POINT_ZOOMING", "ROUTE", "ROUTE_ON_ROUTE_STOPS", "ROUTE_WITH_FOCUS_TO_POINT_A", "ROUTE_WITH_FOCUS_TO_POINT_B", "POINT_WITH_ROUTE", "FOCUS_ON_MULTIEXIT_POINT", "OVERVIEW", "LINKED_ORDER", "TOLL_ROAD_SELECTOR", "DRIVE_TARIFF_FLOW", "SCOOTERS_TARIFF_FLOW", "SHUTTLE_TARIFF_FLOW", "WHERE_YOU_ARE", "DELIVERY_NDD_FLOW", "DELIVERY_FLOW", "PIN_ABSENCE", "ROUTE_WITH_FOCUS_TO_WALKING_ROUTE", "ROUTE_WITH_POINT_A_CONFIRMATION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class SourcePointMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SourcePointMode[] $VALUES;
    public static final SourcePointMode DELIVERY_FLOW;
    public static final SourcePointMode DELIVERY_NDD_FLOW;
    public static final SourcePointMode DRIVE_TARIFF_FLOW;
    public static final SourcePointMode FOCUS_ON_MULTIEXIT_POINT;
    public static final SourcePointMode LINKED_ORDER;
    public static final SourcePointMode OVERVIEW;
    public static final SourcePointMode PIN_ABSENCE;
    public static final SourcePointMode POINT;
    public static final SourcePointMode POINT_WITH_ROUTE;
    public static final SourcePointMode POINT_ZOOMING;
    public static final SourcePointMode ROUTE;
    public static final SourcePointMode ROUTE_ON_ROUTE_STOPS;
    public static final SourcePointMode ROUTE_WITH_FOCUS_TO_POINT_A;
    public static final SourcePointMode ROUTE_WITH_FOCUS_TO_POINT_B;
    public static final SourcePointMode ROUTE_WITH_FOCUS_TO_WALKING_ROUTE;
    public static final SourcePointMode ROUTE_WITH_POINT_A_CONFIRMATION;
    public static final SourcePointMode SCOOTERS_TARIFF_FLOW;
    public static final SourcePointMode SHUTTLE_TARIFF_FLOW;
    public static final SourcePointMode TOLL_ROAD_SELECTOR;
    public static final SourcePointMode WHERE_YOU_ARE;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.DELIVERY_FLOW", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DELIVERY_FLOW extends SourcePointMode {
        public DELIVERY_FLOW() {
            super("DELIVERY_FLOW", 16);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.MAIN;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.DELIVERY_NDD_FLOW", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DELIVERY_NDD_FLOW extends SourcePointMode {
        public DELIVERY_NDD_FLOW() {
            super("DELIVERY_NDD_FLOW", 15);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.MAIN;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.DRIVE_TARIFF_FLOW", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DRIVE_TARIFF_FLOW extends SourcePointMode {
        public DRIVE_TARIFF_FLOW() {
            super("DRIVE_TARIFF_FLOW", 11);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean f() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean h() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.ROUTE;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean v() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean w() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.FOCUS_ON_MULTIEXIT_POINT", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FOCUS_ON_MULTIEXIT_POINT extends SourcePointMode {
        public FOCUS_ON_MULTIEXIT_POINT() {
            super("FOCUS_ON_MULTIEXIT_POINT", 7);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.EDIT;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.LINKED_ORDER", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LINKED_ORDER extends SourcePointMode {
        public LINKED_ORDER() {
            super("LINKED_ORDER", 9);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean f() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.MAIN;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean s() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.OVERVIEW", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class OVERVIEW extends SourcePointMode {
        public OVERVIEW() {
            super("OVERVIEW", 8);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean f() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.MAIN;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean s() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.ROUTE_ON_ROUTE_STOPS", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ROUTE_ON_ROUTE_STOPS extends SourcePointMode {
        public ROUTE_ON_ROUTE_STOPS() {
            super("ROUTE_ON_ROUTE_STOPS", 3);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean a() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean h() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.ROUTE;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean l() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean v() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean w() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ROUTE_WITH_FOCUS_TO_POINT_A extends SourcePointMode {
        public ROUTE_WITH_FOCUS_TO_POINT_A() {
            super("ROUTE_WITH_FOCUS_TO_POINT_A", 4);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean f() {
            return SourcePointMode.ROUTE.f();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean g() {
            return SourcePointMode.ROUTE.g();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean h() {
            return SourcePointMode.ROUTE.h();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourcePointMode.ROUTE.i(z);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean l() {
            return SourcePointMode.ROUTE.l();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return SourcePointMode.ROUTE.q();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean v() {
            return SourcePointMode.ROUTE.v();
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean w() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/go/preorder/mode/SourcePointMode.TOLL_ROAD_SELECTOR", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TOLL_ROAD_SELECTOR extends SourcePointMode {
        public TOLL_ROAD_SELECTOR() {
            super("TOLL_ROAD_SELECTOR", 10);
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean a() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean g() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean h() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final SourceAnalyticsMode i(boolean z) {
            return SourceAnalyticsMode.ROUTE;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean l() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean q() {
            return true;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean v() {
            return false;
        }

        @Override // com.yandex.go.preorder.mode.SourcePointMode
        public final boolean w() {
            return true;
        }
    }

    static {
        SourcePointMode sourcePointMode = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.POINT
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean b() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean c() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return z ? SourceAnalyticsMode.SUMMARY_NO_ROUTE : SourceAnalyticsMode.MAIN;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean p() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return false;
            }
        };
        POINT = sourcePointMode;
        SourcePointMode sourcePointMode2 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.POINT_ZOOMING
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean b() {
                return SourcePointMode.POINT.b();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean c() {
                return SourcePointMode.POINT.c();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return SourcePointMode.POINT.f();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourcePointMode.POINT.i(z);
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean n() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean p() {
                return SourcePointMode.POINT.p();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return SourcePointMode.ROUTE.s();
            }
        };
        POINT_ZOOMING = sourcePointMode2;
        SourcePointMode sourcePointMode3 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.ROUTE
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean a() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.ROUTE;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean l() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        ROUTE = sourcePointMode3;
        ROUTE_ON_ROUTE_STOPS route_on_route_stops = new ROUTE_ON_ROUTE_STOPS();
        ROUTE_ON_ROUTE_STOPS = route_on_route_stops;
        ROUTE_WITH_FOCUS_TO_POINT_A route_with_focus_to_point_a = new ROUTE_WITH_FOCUS_TO_POINT_A();
        ROUTE_WITH_FOCUS_TO_POINT_A = route_with_focus_to_point_a;
        SourcePointMode sourcePointMode4 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_B
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return SourcePointMode.ROUTE.f();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean g() {
                return SourcePointMode.ROUTE.g();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return SourcePointMode.ROUTE.h();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourcePointMode.ROUTE.i(z);
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean k() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean l() {
                return SourcePointMode.ROUTE.l();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return SourcePointMode.ROUTE.q();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return SourcePointMode.ROUTE.v();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        ROUTE_WITH_FOCUS_TO_POINT_B = sourcePointMode4;
        SourcePointMode sourcePointMode5 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.POINT_WITH_ROUTE
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.EDIT;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean j() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean p() {
                return true;
            }
        };
        POINT_WITH_ROUTE = sourcePointMode5;
        FOCUS_ON_MULTIEXIT_POINT focus_on_multiexit_point = new FOCUS_ON_MULTIEXIT_POINT();
        FOCUS_ON_MULTIEXIT_POINT = focus_on_multiexit_point;
        OVERVIEW overview = new OVERVIEW();
        OVERVIEW = overview;
        LINKED_ORDER linked_order = new LINKED_ORDER();
        LINKED_ORDER = linked_order;
        TOLL_ROAD_SELECTOR toll_road_selector = new TOLL_ROAD_SELECTOR();
        TOLL_ROAD_SELECTOR = toll_road_selector;
        DRIVE_TARIFF_FLOW drive_tariff_flow = new DRIVE_TARIFF_FLOW();
        DRIVE_TARIFF_FLOW = drive_tariff_flow;
        SourcePointMode sourcePointMode6 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.SCOOTERS_TARIFF_FLOW
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.ROUTE;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        SCOOTERS_TARIFF_FLOW = sourcePointMode6;
        SourcePointMode sourcePointMode7 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.SHUTTLE_TARIFF_FLOW
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.ROUTE;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean t() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        SHUTTLE_TARIFF_FLOW = sourcePointMode7;
        SourcePointMode sourcePointMode8 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.WHERE_YOU_ARE
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.MAIN;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean p() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean t() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean u() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return false;
            }
        };
        WHERE_YOU_ARE = sourcePointMode8;
        DELIVERY_NDD_FLOW delivery_ndd_flow = new DELIVERY_NDD_FLOW();
        DELIVERY_NDD_FLOW = delivery_ndd_flow;
        DELIVERY_FLOW delivery_flow = new DELIVERY_FLOW();
        DELIVERY_FLOW = delivery_flow;
        SourcePointMode sourcePointMode9 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.PIN_ABSENCE
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean b() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.MAIN;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean s() {
                return false;
            }
        };
        PIN_ABSENCE = sourcePointMode9;
        SourcePointMode sourcePointMode10 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.ROUTE_WITH_FOCUS_TO_WALKING_ROUTE
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourceAnalyticsMode.ROUTE;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean l() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return false;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        ROUTE_WITH_FOCUS_TO_WALKING_ROUTE = sourcePointMode10;
        SourcePointMode sourcePointMode11 = new SourcePointMode() { // from class: com.yandex.go.preorder.mode.SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION
            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean f() {
                return SourcePointMode.ROUTE.f();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean g() {
                return SourcePointMode.ROUTE.g();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean h() {
                return SourcePointMode.ROUTE.h();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final SourceAnalyticsMode i(boolean z) {
                return SourcePointMode.ROUTE.i(z);
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean k() {
                return true;
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean q() {
                return SourcePointMode.ROUTE.q();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean v() {
                return SourcePointMode.ROUTE.v();
            }

            @Override // com.yandex.go.preorder.mode.SourcePointMode
            public final boolean w() {
                return true;
            }
        };
        ROUTE_WITH_POINT_A_CONFIRMATION = sourcePointMode11;
        SourcePointMode[] sourcePointModeArr = {sourcePointMode, sourcePointMode2, sourcePointMode3, route_on_route_stops, route_with_focus_to_point_a, sourcePointMode4, sourcePointMode5, focus_on_multiexit_point, overview, linked_order, toll_road_selector, drive_tariff_flow, sourcePointMode6, sourcePointMode7, sourcePointMode8, delivery_ndd_flow, delivery_flow, sourcePointMode9, sourcePointMode10, sourcePointMode11};
        $VALUES = sourcePointModeArr;
        $ENTRIES = a.a(sourcePointModeArr);
    }

    public static SourcePointMode valueOf(String str) {
        return (SourcePointMode) Enum.valueOf(SourcePointMode.class, str);
    }

    public static SourcePointMode[] values() {
        return (SourcePointMode[]) $VALUES.clone();
    }

    public boolean a() {
        return this instanceof DELIVERY_FLOW;
    }

    public boolean b() {
        return !(this instanceof OVERVIEW);
    }

    public boolean c() {
        return this instanceof OVERVIEW;
    }

    public boolean f() {
        return !(this instanceof DELIVERY_NDD_FLOW);
    }

    public boolean g() {
        return this instanceof DELIVERY_NDD_FLOW;
    }

    public boolean h() {
        return !(this instanceof DELIVERY_FLOW);
    }

    public abstract SourceAnalyticsMode i(boolean z);

    public boolean j() {
        return this instanceof LINKED_ORDER;
    }

    public boolean k() {
        return this instanceof ROUTE_WITH_FOCUS_TO_POINT_A;
    }

    public boolean l() {
        return this instanceof DELIVERY_FLOW;
    }

    public boolean m() {
        return !(this instanceof ROUTE_ON_ROUTE_STOPS);
    }

    public boolean n() {
        return this instanceof OVERVIEW;
    }

    public boolean p() {
        return this instanceof FOCUS_ON_MULTIEXIT_POINT;
    }

    public boolean q() {
        return this instanceof DELIVERY_FLOW;
    }

    public boolean r() {
        return !(this instanceof TOLL_ROAD_SELECTOR);
    }

    public boolean s() {
        return !(this instanceof DRIVE_TARIFF_FLOW);
    }

    public boolean t() {
        return !(this instanceof DRIVE_TARIFF_FLOW);
    }

    public boolean u() {
        return this instanceof LINKED_ORDER;
    }

    public boolean v() {
        return !(this instanceof DELIVERY_FLOW);
    }

    public boolean w() {
        return this instanceof DELIVERY_FLOW;
    }
}
