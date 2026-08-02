package com.yandex.go.zone.dto.objects;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/zone/dto/objects/VerticalMode;", "", "", "mode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WITHOUT_SELECTOR", "SELECTOR", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalMode[] $VALUES;
    public static final VerticalMode SELECTOR;
    public static final VerticalMode WITHOUT_SELECTOR;
    private final String mode;

    static {
        VerticalMode verticalMode = new VerticalMode("WITHOUT_SELECTOR", 0, "");
        WITHOUT_SELECTOR = verticalMode;
        VerticalMode verticalMode2 = new VerticalMode("SELECTOR", 1, "verticals_selector");
        SELECTOR = verticalMode2;
        VerticalMode[] verticalModeArr = {verticalMode, verticalMode2};
        $VALUES = verticalModeArr;
        $ENTRIES = kotlin.enums.a.a(verticalModeArr);
    }

    public VerticalMode(String str, int i, String str2) {
        this.mode = str2;
    }

    public static VerticalMode valueOf(String str) {
        return (VerticalMode) Enum.valueOf(VerticalMode.class, str);
    }

    public static VerticalMode[] values() {
        return (VerticalMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getMode() {
        return this.mode;
    }
}
