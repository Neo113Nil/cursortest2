package com.ybsdk.feature.autotopup.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "BALANCE_THRESHOLD", "UP_TO_BALANCE", "UNKNOWN", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupTypeDto[] $VALUES;
    public static final AutoTopupTypeDto BALANCE_THRESHOLD = new AutoTopupTypeDto("BALANCE_THRESHOLD", 0);
    public static final AutoTopupTypeDto UP_TO_BALANCE = new AutoTopupTypeDto("UP_TO_BALANCE", 1);
    public static final AutoTopupTypeDto UNKNOWN = new AutoTopupTypeDto("UNKNOWN", 2);

    private static final /* synthetic */ AutoTopupTypeDto[] $values() {
        return new AutoTopupTypeDto[]{BALANCE_THRESHOLD, UP_TO_BALANCE, UNKNOWN};
    }

    static {
        AutoTopupTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupTypeDto valueOf(String str) {
        return (AutoTopupTypeDto) Enum.valueOf(AutoTopupTypeDto.class, str);
    }

    public static AutoTopupTypeDto[] values() {
        return (AutoTopupTypeDto[]) $VALUES.clone();
    }
}
