package com.yandex.go.litert.api.config;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/litert/api/config/LiteRtImageResizeMode;", "", "RESIZE", "FIT_CENTER", "CENTER_CROP", "go-client-android.features.litert:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiteRtImageResizeMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LiteRtImageResizeMode[] $VALUES;
    public static final LiteRtImageResizeMode CENTER_CROP;
    public static final LiteRtImageResizeMode FIT_CENTER;
    public static final LiteRtImageResizeMode RESIZE;

    static {
        LiteRtImageResizeMode liteRtImageResizeMode = new LiteRtImageResizeMode("RESIZE", 0);
        RESIZE = liteRtImageResizeMode;
        LiteRtImageResizeMode liteRtImageResizeMode2 = new LiteRtImageResizeMode("FIT_CENTER", 1);
        FIT_CENTER = liteRtImageResizeMode2;
        LiteRtImageResizeMode liteRtImageResizeMode3 = new LiteRtImageResizeMode("CENTER_CROP", 2);
        CENTER_CROP = liteRtImageResizeMode3;
        LiteRtImageResizeMode[] liteRtImageResizeModeArr = {liteRtImageResizeMode, liteRtImageResizeMode2, liteRtImageResizeMode3};
        $VALUES = liteRtImageResizeModeArr;
        $ENTRIES = a.a(liteRtImageResizeModeArr);
    }

    public static LiteRtImageResizeMode valueOf(String str) {
        return (LiteRtImageResizeMode) Enum.valueOf(LiteRtImageResizeMode.class, str);
    }

    public static LiteRtImageResizeMode[] values() {
        return (LiteRtImageResizeMode[]) $VALUES.clone();
    }
}
