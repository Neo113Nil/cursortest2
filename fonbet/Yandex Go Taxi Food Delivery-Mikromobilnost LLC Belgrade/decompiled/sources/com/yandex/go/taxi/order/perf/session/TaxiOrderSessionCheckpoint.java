package com.yandex.go.taxi.order.perf.session;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/taxi/order/perf/session/TaxiOrderSessionCheckpoint;", "", "START_ORDER_FRAGMENT_ROUTER", "ATTACH_ORDER_FRAGMENT_ROUTER", "FRAGMENT_COMPONENT_CREATED", "STACK_VIEW_COMPONENT_CREATED", "ORDER_VIEW_COMPONENT_CREATED", "SCREEN_TRACKING_HANDLED", "SCREEN_TRACKING_ATTACHED", "SCREEN_DETAILS_HANDLED", "SCREEN_DETAILS_ATTACHED", "MAP", "OVERLAY", "FCP", "LCP_DEFAULTS", "ORDERDRAFT", "ORDERCOMMIT", "TAXIONTHEWAY", "LCP", "go-client-android.features.taxi_order:perf"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TaxiOrderSessionCheckpoint {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TaxiOrderSessionCheckpoint[] $VALUES;
    public static final TaxiOrderSessionCheckpoint ATTACH_ORDER_FRAGMENT_ROUTER;
    public static final TaxiOrderSessionCheckpoint FCP;
    public static final TaxiOrderSessionCheckpoint FRAGMENT_COMPONENT_CREATED;
    public static final TaxiOrderSessionCheckpoint LCP;
    public static final TaxiOrderSessionCheckpoint LCP_DEFAULTS;
    public static final TaxiOrderSessionCheckpoint MAP;
    public static final TaxiOrderSessionCheckpoint ORDERCOMMIT;
    public static final TaxiOrderSessionCheckpoint ORDERDRAFT;
    public static final TaxiOrderSessionCheckpoint ORDER_VIEW_COMPONENT_CREATED;
    public static final TaxiOrderSessionCheckpoint OVERLAY;
    public static final TaxiOrderSessionCheckpoint SCREEN_DETAILS_ATTACHED;
    public static final TaxiOrderSessionCheckpoint SCREEN_DETAILS_HANDLED;
    public static final TaxiOrderSessionCheckpoint SCREEN_TRACKING_ATTACHED;
    public static final TaxiOrderSessionCheckpoint SCREEN_TRACKING_HANDLED;
    public static final TaxiOrderSessionCheckpoint STACK_VIEW_COMPONENT_CREATED;
    public static final TaxiOrderSessionCheckpoint START_ORDER_FRAGMENT_ROUTER;
    public static final TaxiOrderSessionCheckpoint TAXIONTHEWAY;

    static {
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = new TaxiOrderSessionCheckpoint("START_ORDER_FRAGMENT_ROUTER", 0);
        START_ORDER_FRAGMENT_ROUTER = taxiOrderSessionCheckpoint;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint2 = new TaxiOrderSessionCheckpoint("ATTACH_ORDER_FRAGMENT_ROUTER", 1);
        ATTACH_ORDER_FRAGMENT_ROUTER = taxiOrderSessionCheckpoint2;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint3 = new TaxiOrderSessionCheckpoint("FRAGMENT_COMPONENT_CREATED", 2);
        FRAGMENT_COMPONENT_CREATED = taxiOrderSessionCheckpoint3;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint4 = new TaxiOrderSessionCheckpoint("STACK_VIEW_COMPONENT_CREATED", 3);
        STACK_VIEW_COMPONENT_CREATED = taxiOrderSessionCheckpoint4;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint5 = new TaxiOrderSessionCheckpoint("ORDER_VIEW_COMPONENT_CREATED", 4);
        ORDER_VIEW_COMPONENT_CREATED = taxiOrderSessionCheckpoint5;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint6 = new TaxiOrderSessionCheckpoint("SCREEN_TRACKING_HANDLED", 5);
        SCREEN_TRACKING_HANDLED = taxiOrderSessionCheckpoint6;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint7 = new TaxiOrderSessionCheckpoint("SCREEN_TRACKING_ATTACHED", 6);
        SCREEN_TRACKING_ATTACHED = taxiOrderSessionCheckpoint7;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint8 = new TaxiOrderSessionCheckpoint("SCREEN_DETAILS_HANDLED", 7);
        SCREEN_DETAILS_HANDLED = taxiOrderSessionCheckpoint8;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint9 = new TaxiOrderSessionCheckpoint("SCREEN_DETAILS_ATTACHED", 8);
        SCREEN_DETAILS_ATTACHED = taxiOrderSessionCheckpoint9;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint10 = new TaxiOrderSessionCheckpoint("MAP", 9);
        MAP = taxiOrderSessionCheckpoint10;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint11 = new TaxiOrderSessionCheckpoint("OVERLAY", 10);
        OVERLAY = taxiOrderSessionCheckpoint11;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint12 = new TaxiOrderSessionCheckpoint("FCP", 11);
        FCP = taxiOrderSessionCheckpoint12;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint13 = new TaxiOrderSessionCheckpoint("LCP_DEFAULTS", 12);
        LCP_DEFAULTS = taxiOrderSessionCheckpoint13;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint14 = new TaxiOrderSessionCheckpoint("ORDERDRAFT", 13);
        ORDERDRAFT = taxiOrderSessionCheckpoint14;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint15 = new TaxiOrderSessionCheckpoint("ORDERCOMMIT", 14);
        ORDERCOMMIT = taxiOrderSessionCheckpoint15;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint16 = new TaxiOrderSessionCheckpoint("TAXIONTHEWAY", 15);
        TAXIONTHEWAY = taxiOrderSessionCheckpoint16;
        TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint17 = new TaxiOrderSessionCheckpoint("LCP", 16);
        LCP = taxiOrderSessionCheckpoint17;
        TaxiOrderSessionCheckpoint[] taxiOrderSessionCheckpointArr = {taxiOrderSessionCheckpoint, taxiOrderSessionCheckpoint2, taxiOrderSessionCheckpoint3, taxiOrderSessionCheckpoint4, taxiOrderSessionCheckpoint5, taxiOrderSessionCheckpoint6, taxiOrderSessionCheckpoint7, taxiOrderSessionCheckpoint8, taxiOrderSessionCheckpoint9, taxiOrderSessionCheckpoint10, taxiOrderSessionCheckpoint11, taxiOrderSessionCheckpoint12, taxiOrderSessionCheckpoint13, taxiOrderSessionCheckpoint14, taxiOrderSessionCheckpoint15, taxiOrderSessionCheckpoint16, taxiOrderSessionCheckpoint17};
        $VALUES = taxiOrderSessionCheckpointArr;
        $ENTRIES = kotlin.enums.a.a(taxiOrderSessionCheckpointArr);
    }

    public static TaxiOrderSessionCheckpoint valueOf(String str) {
        return (TaxiOrderSessionCheckpoint) Enum.valueOf(TaxiOrderSessionCheckpoint.class, str);
    }

    public static TaxiOrderSessionCheckpoint[] values() {
        return (TaxiOrderSessionCheckpoint[]) $VALUES.clone();
    }
}
