package com.yandex.mapkit.styling.automotivenavigation.balloons;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ResourceSize;", "", "<init>", "(Ljava/lang/String;I)V", "BIG", "SMALL", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResourceSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ResourceSize[] $VALUES;
    public static final ResourceSize BIG = new ResourceSize("BIG", 0);
    public static final ResourceSize SMALL = new ResourceSize("SMALL", 1);

    private static final /* synthetic */ ResourceSize[] $values() {
        return new ResourceSize[]{BIG, SMALL};
    }

    static {
        ResourceSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ResourceSize(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ResourceSize valueOf(String str) {
        return (ResourceSize) Enum.valueOf(ResourceSize.class, str);
    }

    public static ResourceSize[] values() {
        return (ResourceSize[]) $VALUES.clone();
    }
}
