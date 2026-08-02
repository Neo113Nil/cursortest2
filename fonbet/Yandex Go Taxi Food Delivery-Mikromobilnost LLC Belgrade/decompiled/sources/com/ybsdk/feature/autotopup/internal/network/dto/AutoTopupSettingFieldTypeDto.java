package com.ybsdk.feature.autotopup.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingFieldTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "AMOUNT", "THRESHOLD", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingFieldTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoTopupSettingFieldTypeDto[] $VALUES;
    public static final AutoTopupSettingFieldTypeDto AMOUNT = new AutoTopupSettingFieldTypeDto("AMOUNT", 0);
    public static final AutoTopupSettingFieldTypeDto THRESHOLD = new AutoTopupSettingFieldTypeDto("THRESHOLD", 1);

    private static final /* synthetic */ AutoTopupSettingFieldTypeDto[] $values() {
        return new AutoTopupSettingFieldTypeDto[]{AMOUNT, THRESHOLD};
    }

    static {
        AutoTopupSettingFieldTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoTopupSettingFieldTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoTopupSettingFieldTypeDto valueOf(String str) {
        return (AutoTopupSettingFieldTypeDto) Enum.valueOf(AutoTopupSettingFieldTypeDto.class, str);
    }

    public static AutoTopupSettingFieldTypeDto[] values() {
        return (AutoTopupSettingFieldTypeDto[]) $VALUES.clone();
    }
}
