package com.yandex.go.blur.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/blur/core/BlurEffect$CoordinatesType", "", "Lcom/yandex/go/blur/core/BlurEffect$CoordinatesType;", "Relative", "Absolute", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurEffect$CoordinatesType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BlurEffect$CoordinatesType[] $VALUES;
    public static final BlurEffect$CoordinatesType Absolute;
    public static final BlurEffect$CoordinatesType Relative;

    static {
        BlurEffect$CoordinatesType blurEffect$CoordinatesType = new BlurEffect$CoordinatesType("Relative", 0);
        Relative = blurEffect$CoordinatesType;
        BlurEffect$CoordinatesType blurEffect$CoordinatesType2 = new BlurEffect$CoordinatesType("Absolute", 1);
        Absolute = blurEffect$CoordinatesType2;
        BlurEffect$CoordinatesType[] blurEffect$CoordinatesTypeArr = {blurEffect$CoordinatesType, blurEffect$CoordinatesType2};
        $VALUES = blurEffect$CoordinatesTypeArr;
        $ENTRIES = a.a(blurEffect$CoordinatesTypeArr);
    }

    public static BlurEffect$CoordinatesType valueOf(String str) {
        return (BlurEffect$CoordinatesType) Enum.valueOf(BlurEffect$CoordinatesType.class, str);
    }

    public static BlurEffect$CoordinatesType[] values() {
        return (BlurEffect$CoordinatesType[]) $VALUES.clone();
    }
}
