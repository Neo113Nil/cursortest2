package com.ybsdk.feature.autotopup.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundSettingFieldTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOFUND_MONEY", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoFundSettingFieldTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AutoFundSettingFieldTypeDto[] $VALUES;
    public static final AutoFundSettingFieldTypeDto AUTOFUND_MONEY = new AutoFundSettingFieldTypeDto("AUTOFUND_MONEY", 0);

    private static final /* synthetic */ AutoFundSettingFieldTypeDto[] $values() {
        return new AutoFundSettingFieldTypeDto[]{AUTOFUND_MONEY};
    }

    static {
        AutoFundSettingFieldTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AutoFundSettingFieldTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AutoFundSettingFieldTypeDto valueOf(String str) {
        return (AutoFundSettingFieldTypeDto) Enum.valueOf(AutoFundSettingFieldTypeDto.class, str);
    }

    public static AutoFundSettingFieldTypeDto[] values() {
        return (AutoFundSettingFieldTypeDto[]) $VALUES.clone();
    }
}
