package com.yandex.mob.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/mob/domain/ValidateConfigUseCase$InvalidCause", "", "Lcom/yandex/mob/domain/ValidateConfigUseCase$InvalidCause;", "UrlParsingFailed", "DifferentHosts", "AdditionalQuery", "SlashSuffix", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ValidateConfigUseCase$InvalidCause {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ValidateConfigUseCase$InvalidCause[] $VALUES;
    public static final ValidateConfigUseCase$InvalidCause AdditionalQuery;
    public static final ValidateConfigUseCase$InvalidCause DifferentHosts;
    public static final ValidateConfigUseCase$InvalidCause SlashSuffix;
    public static final ValidateConfigUseCase$InvalidCause UrlParsingFailed;

    static {
        ValidateConfigUseCase$InvalidCause validateConfigUseCase$InvalidCause = new ValidateConfigUseCase$InvalidCause("UrlParsingFailed", 0);
        UrlParsingFailed = validateConfigUseCase$InvalidCause;
        ValidateConfigUseCase$InvalidCause validateConfigUseCase$InvalidCause2 = new ValidateConfigUseCase$InvalidCause("DifferentHosts", 1);
        DifferentHosts = validateConfigUseCase$InvalidCause2;
        ValidateConfigUseCase$InvalidCause validateConfigUseCase$InvalidCause3 = new ValidateConfigUseCase$InvalidCause("AdditionalQuery", 2);
        AdditionalQuery = validateConfigUseCase$InvalidCause3;
        ValidateConfigUseCase$InvalidCause validateConfigUseCase$InvalidCause4 = new ValidateConfigUseCase$InvalidCause("SlashSuffix", 3);
        SlashSuffix = validateConfigUseCase$InvalidCause4;
        ValidateConfigUseCase$InvalidCause[] validateConfigUseCase$InvalidCauseArr = {validateConfigUseCase$InvalidCause, validateConfigUseCase$InvalidCause2, validateConfigUseCase$InvalidCause3, validateConfigUseCase$InvalidCause4};
        $VALUES = validateConfigUseCase$InvalidCauseArr;
        $ENTRIES = kotlin.enums.a.a(validateConfigUseCase$InvalidCauseArr);
    }

    public static ValidateConfigUseCase$InvalidCause valueOf(String str) {
        return (ValidateConfigUseCase$InvalidCause) Enum.valueOf(ValidateConfigUseCase$InvalidCause.class, str);
    }

    public static ValidateConfigUseCase$InvalidCause[] values() {
        return (ValidateConfigUseCase$InvalidCause[]) $VALUES.clone();
    }
}
