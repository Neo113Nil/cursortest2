package com.yandex.payment.sdk.flex.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/flex/api/models/FlexAction;", "", "OPEN_WEB", "SHOW_NATIVE_SCREEN", "SEND_EXTERNAL_EVENT", "SEND_ANALYTICS_EVENT", "DELAY", "TRANSPORT_READ_CARD", "TRANSPORT_FINISH_NFC", "TRANSPORT_READ_BLOCKS", "TRANSPORT_WRITE_BLOCKS", "FINISH_FLOW", "FT_REQUEST_ACTION", "flex-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlexAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FlexAction[] $VALUES;
    public static final FlexAction DELAY;
    public static final FlexAction FINISH_FLOW;
    public static final FlexAction FT_REQUEST_ACTION;
    public static final FlexAction OPEN_WEB;
    public static final FlexAction SEND_ANALYTICS_EVENT;
    public static final FlexAction SEND_EXTERNAL_EVENT;
    public static final FlexAction SHOW_NATIVE_SCREEN;
    public static final FlexAction TRANSPORT_FINISH_NFC;
    public static final FlexAction TRANSPORT_READ_BLOCKS;
    public static final FlexAction TRANSPORT_READ_CARD;
    public static final FlexAction TRANSPORT_WRITE_BLOCKS;

    static {
        FlexAction flexAction = new FlexAction("OPEN_WEB", 0);
        OPEN_WEB = flexAction;
        FlexAction flexAction2 = new FlexAction("SHOW_NATIVE_SCREEN", 1);
        SHOW_NATIVE_SCREEN = flexAction2;
        FlexAction flexAction3 = new FlexAction("SEND_EXTERNAL_EVENT", 2);
        SEND_EXTERNAL_EVENT = flexAction3;
        FlexAction flexAction4 = new FlexAction("SEND_ANALYTICS_EVENT", 3);
        SEND_ANALYTICS_EVENT = flexAction4;
        FlexAction flexAction5 = new FlexAction("DELAY", 4);
        DELAY = flexAction5;
        FlexAction flexAction6 = new FlexAction("TRANSPORT_READ_CARD", 5);
        TRANSPORT_READ_CARD = flexAction6;
        FlexAction flexAction7 = new FlexAction("TRANSPORT_FINISH_NFC", 6);
        TRANSPORT_FINISH_NFC = flexAction7;
        FlexAction flexAction8 = new FlexAction("TRANSPORT_READ_BLOCKS", 7);
        TRANSPORT_READ_BLOCKS = flexAction8;
        FlexAction flexAction9 = new FlexAction("TRANSPORT_WRITE_BLOCKS", 8);
        TRANSPORT_WRITE_BLOCKS = flexAction9;
        FlexAction flexAction10 = new FlexAction("FINISH_FLOW", 9);
        FINISH_FLOW = flexAction10;
        FlexAction flexAction11 = new FlexAction("FT_REQUEST_ACTION", 10);
        FT_REQUEST_ACTION = flexAction11;
        FlexAction[] flexActionArr = {flexAction, flexAction2, flexAction3, flexAction4, flexAction5, flexAction6, flexAction7, flexAction8, flexAction9, flexAction10, flexAction11};
        $VALUES = flexActionArr;
        $ENTRIES = a.a(flexActionArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static FlexAction valueOf(String str) {
        return (FlexAction) Enum.valueOf(FlexAction.class, str);
    }

    public static FlexAction[] values() {
        return (FlexAction[]) $VALUES.clone();
    }
}
