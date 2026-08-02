package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NativeVibrateRequest$VibrateType", "", "Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/OutMessage$NativeVibrateRequest$VibrateType;", "SELECTION", "SOFT", "LIGHT", "MEDIUM", "HARD", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OutMessage$NativeVibrateRequest$VibrateType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OutMessage$NativeVibrateRequest$VibrateType[] $VALUES;
    public static final OutMessage$NativeVibrateRequest$VibrateType HARD;
    public static final OutMessage$NativeVibrateRequest$VibrateType LIGHT;
    public static final OutMessage$NativeVibrateRequest$VibrateType MEDIUM;
    public static final OutMessage$NativeVibrateRequest$VibrateType SELECTION;
    public static final OutMessage$NativeVibrateRequest$VibrateType SOFT;

    static {
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType = new OutMessage$NativeVibrateRequest$VibrateType("SELECTION", 0);
        SELECTION = outMessage$NativeVibrateRequest$VibrateType;
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType2 = new OutMessage$NativeVibrateRequest$VibrateType("SOFT", 1);
        SOFT = outMessage$NativeVibrateRequest$VibrateType2;
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType3 = new OutMessage$NativeVibrateRequest$VibrateType("LIGHT", 2);
        LIGHT = outMessage$NativeVibrateRequest$VibrateType3;
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType4 = new OutMessage$NativeVibrateRequest$VibrateType("MEDIUM", 3);
        MEDIUM = outMessage$NativeVibrateRequest$VibrateType4;
        OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType5 = new OutMessage$NativeVibrateRequest$VibrateType("HARD", 4);
        HARD = outMessage$NativeVibrateRequest$VibrateType5;
        OutMessage$NativeVibrateRequest$VibrateType[] outMessage$NativeVibrateRequest$VibrateTypeArr = {outMessage$NativeVibrateRequest$VibrateType, outMessage$NativeVibrateRequest$VibrateType2, outMessage$NativeVibrateRequest$VibrateType3, outMessage$NativeVibrateRequest$VibrateType4, outMessage$NativeVibrateRequest$VibrateType5};
        $VALUES = outMessage$NativeVibrateRequest$VibrateTypeArr;
        $ENTRIES = a.a(outMessage$NativeVibrateRequest$VibrateTypeArr);
    }

    public static OutMessage$NativeVibrateRequest$VibrateType valueOf(String str) {
        return (OutMessage$NativeVibrateRequest$VibrateType) Enum.valueOf(OutMessage$NativeVibrateRequest$VibrateType.class, str);
    }

    public static OutMessage$NativeVibrateRequest$VibrateType[] values() {
        return (OutMessage$NativeVibrateRequest$VibrateType[]) $VALUES.clone();
    }
}
