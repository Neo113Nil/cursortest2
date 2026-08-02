package com.ybsdk.feature.ui.stat.internal.domain;

import defpackage.k4o;
import defpackage.rt11;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/ui/stat/internal/domain/UiStatPayloadType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "rt11", "COUNTER", "STRING", "feature-ui-stat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiStatPayloadType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UiStatPayloadType[] $VALUES;
    public static final rt11 Companion;
    private final String value;
    public static final UiStatPayloadType COUNTER = new UiStatPayloadType("COUNTER", 0, "counter");
    public static final UiStatPayloadType STRING = new UiStatPayloadType("STRING", 1, "string");

    private static final /* synthetic */ UiStatPayloadType[] $values() {
        return new UiStatPayloadType[]{COUNTER, STRING};
    }

    static {
        UiStatPayloadType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new rt11();
    }

    private UiStatPayloadType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static UiStatPayloadType valueOf(String str) {
        return (UiStatPayloadType) Enum.valueOf(UiStatPayloadType.class, str);
    }

    public static UiStatPayloadType[] values() {
        return (UiStatPayloadType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
