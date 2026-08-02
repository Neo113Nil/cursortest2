package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tc01;
import defpackage.w111;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/TransportCubeIconBackgroundType;", "", "Companion", "w111", "SQUARE", "CIRCLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportCubeIconBackgroundType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportCubeIconBackgroundType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TransportCubeIconBackgroundType CIRCLE;
    public static final w111 Companion;
    public static final TransportCubeIconBackgroundType SQUARE;

    static {
        TransportCubeIconBackgroundType transportCubeIconBackgroundType = new TransportCubeIconBackgroundType("SQUARE", 0);
        SQUARE = transportCubeIconBackgroundType;
        TransportCubeIconBackgroundType transportCubeIconBackgroundType2 = new TransportCubeIconBackgroundType("CIRCLE", 1);
        CIRCLE = transportCubeIconBackgroundType2;
        TransportCubeIconBackgroundType[] transportCubeIconBackgroundTypeArr = {transportCubeIconBackgroundType, transportCubeIconBackgroundType2};
        $VALUES = transportCubeIconBackgroundTypeArr;
        $ENTRIES = kotlin.enums.a.a(transportCubeIconBackgroundTypeArr);
        Companion = new w111();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(27));
    }

    public static TransportCubeIconBackgroundType valueOf(String str) {
        return (TransportCubeIconBackgroundType) Enum.valueOf(TransportCubeIconBackgroundType.class, str);
    }

    public static TransportCubeIconBackgroundType[] values() {
        return (TransportCubeIconBackgroundType[]) $VALUES.clone();
    }
}
