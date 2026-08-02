package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.aw80;
import defpackage.ew80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UpdateTargetsState$Target", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$UpdateTargetsState$Target;", "Companion", "ew80", "ALL", "PLUS_POINTS", "TREASURY_STATE", "FAMILY", "PAYMENT_CONFIGURATION", "PLAQUE", "DAILY", "APPWIDGET_DAILY", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OutMessage$UpdateTargetsState$Target {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$UpdateTargetsState$Target[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final OutMessage$UpdateTargetsState$Target ALL;
    public static final OutMessage$UpdateTargetsState$Target APPWIDGET_DAILY;
    public static final ew80 Companion;
    public static final OutMessage$UpdateTargetsState$Target DAILY;
    public static final OutMessage$UpdateTargetsState$Target FAMILY;
    public static final OutMessage$UpdateTargetsState$Target PAYMENT_CONFIGURATION;
    public static final OutMessage$UpdateTargetsState$Target PLAQUE;
    public static final OutMessage$UpdateTargetsState$Target PLUS_POINTS;
    public static final OutMessage$UpdateTargetsState$Target TREASURY_STATE;

    static {
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target = new OutMessage$UpdateTargetsState$Target("ALL", 0);
        ALL = outMessage$UpdateTargetsState$Target;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target2 = new OutMessage$UpdateTargetsState$Target("PLUS_POINTS", 1);
        PLUS_POINTS = outMessage$UpdateTargetsState$Target2;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target3 = new OutMessage$UpdateTargetsState$Target("TREASURY_STATE", 2);
        TREASURY_STATE = outMessage$UpdateTargetsState$Target3;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target4 = new OutMessage$UpdateTargetsState$Target("FAMILY", 3);
        FAMILY = outMessage$UpdateTargetsState$Target4;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target5 = new OutMessage$UpdateTargetsState$Target("PAYMENT_CONFIGURATION", 4);
        PAYMENT_CONFIGURATION = outMessage$UpdateTargetsState$Target5;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target6 = new OutMessage$UpdateTargetsState$Target("PLAQUE", 5);
        PLAQUE = outMessage$UpdateTargetsState$Target6;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target7 = new OutMessage$UpdateTargetsState$Target("DAILY", 6);
        DAILY = outMessage$UpdateTargetsState$Target7;
        OutMessage$UpdateTargetsState$Target outMessage$UpdateTargetsState$Target8 = new OutMessage$UpdateTargetsState$Target("APPWIDGET_DAILY", 7);
        APPWIDGET_DAILY = outMessage$UpdateTargetsState$Target8;
        OutMessage$UpdateTargetsState$Target[] outMessage$UpdateTargetsState$TargetArr = {outMessage$UpdateTargetsState$Target, outMessage$UpdateTargetsState$Target2, outMessage$UpdateTargetsState$Target3, outMessage$UpdateTargetsState$Target4, outMessage$UpdateTargetsState$Target5, outMessage$UpdateTargetsState$Target6, outMessage$UpdateTargetsState$Target7, outMessage$UpdateTargetsState$Target8};
        $VALUES = outMessage$UpdateTargetsState$TargetArr;
        $ENTRIES = a.a(outMessage$UpdateTargetsState$TargetArr);
        Companion = new ew80();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(2));
    }

    public static OutMessage$UpdateTargetsState$Target valueOf(String str) {
        return (OutMessage$UpdateTargetsState$Target) Enum.valueOf(OutMessage$UpdateTargetsState$Target.class, str);
    }

    public static OutMessage$UpdateTargetsState$Target[] values() {
        return (OutMessage$UpdateTargetsState$Target[]) $VALUES.clone();
    }
}
