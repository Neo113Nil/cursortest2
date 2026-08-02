package com.yandex.div.core.images;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/images/BitmapSource;", "", "NETWORK", "DISK", "MEMORY", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapSource {
    private static final /* synthetic */ BitmapSource[] $VALUES;
    public static final BitmapSource DISK;
    public static final BitmapSource MEMORY;
    public static final BitmapSource NETWORK;

    static {
        BitmapSource bitmapSource = new BitmapSource("NETWORK", 0);
        NETWORK = bitmapSource;
        BitmapSource bitmapSource2 = new BitmapSource("DISK", 1);
        DISK = bitmapSource2;
        BitmapSource bitmapSource3 = new BitmapSource("MEMORY", 2);
        MEMORY = bitmapSource3;
        $VALUES = new BitmapSource[]{bitmapSource, bitmapSource2, bitmapSource3};
    }

    public static BitmapSource valueOf(String str) {
        return (BitmapSource) Enum.valueOf(BitmapSource.class, str);
    }

    public static BitmapSource[] values() {
        return (BitmapSource[]) $VALUES.clone();
    }
}
