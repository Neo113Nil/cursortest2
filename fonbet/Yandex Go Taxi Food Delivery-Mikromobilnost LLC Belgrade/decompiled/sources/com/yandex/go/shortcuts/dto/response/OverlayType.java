package com.yandex.go.shortcuts.dto.response;

import defpackage.aw80;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s190;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/OverlayType;", "", "Companion", "s190", "STATIC_TEXT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OverlayType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OverlayType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final s190 Companion;
    public static final OverlayType STATIC_TEXT;

    static {
        OverlayType overlayType = new OverlayType("STATIC_TEXT", 0);
        STATIC_TEXT = overlayType;
        OverlayType[] overlayTypeArr = {overlayType};
        $VALUES = overlayTypeArr;
        $ENTRIES = kotlin.enums.a.a(overlayTypeArr);
        Companion = new s190();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(11));
    }

    public static OverlayType valueOf(String str) {
        return (OverlayType) Enum.valueOf(OverlayType.class, str);
    }

    public static OverlayType[] values() {
        return (OverlayType[]) $VALUES.clone();
    }
}
