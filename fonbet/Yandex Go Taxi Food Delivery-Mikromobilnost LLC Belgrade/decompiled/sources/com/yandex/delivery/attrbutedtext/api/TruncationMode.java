package com.yandex.delivery.attrbutedtext.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/attrbutedtext/api/TruncationMode;", "", "HEAD", "TAIL", "MIDDLE", "attributed-text"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TruncationMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TruncationMode[] $VALUES;
    public static final TruncationMode HEAD;
    public static final TruncationMode MIDDLE;
    public static final TruncationMode TAIL;

    static {
        TruncationMode truncationMode = new TruncationMode("HEAD", 0);
        HEAD = truncationMode;
        TruncationMode truncationMode2 = new TruncationMode("TAIL", 1);
        TAIL = truncationMode2;
        TruncationMode truncationMode3 = new TruncationMode("MIDDLE", 2);
        MIDDLE = truncationMode3;
        TruncationMode[] truncationModeArr = {truncationMode, truncationMode2, truncationMode3};
        $VALUES = truncationModeArr;
        $ENTRIES = kotlin.enums.a.a(truncationModeArr);
    }

    public static TruncationMode valueOf(String str) {
        return (TruncationMode) Enum.valueOf(TruncationMode.class, str);
    }

    public static TruncationMode[] values() {
        return (TruncationMode[]) $VALUES.clone();
    }
}
