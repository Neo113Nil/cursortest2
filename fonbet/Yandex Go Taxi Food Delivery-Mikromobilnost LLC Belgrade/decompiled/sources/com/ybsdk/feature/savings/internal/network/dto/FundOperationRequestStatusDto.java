package com.ybsdk.feature.savings.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequestStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "IN_PROGRESS", "NEED_CONFIRMATION", IDialogId.INTENT_EXTRA_OUT_RESULT, "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundOperationRequestStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FundOperationRequestStatusDto[] $VALUES;
    public static final FundOperationRequestStatusDto SUCCESS = new FundOperationRequestStatusDto("SUCCESS", 0);
    public static final FundOperationRequestStatusDto IN_PROGRESS = new FundOperationRequestStatusDto("IN_PROGRESS", 1);
    public static final FundOperationRequestStatusDto NEED_CONFIRMATION = new FundOperationRequestStatusDto("NEED_CONFIRMATION", 2);
    public static final FundOperationRequestStatusDto RESULT = new FundOperationRequestStatusDto(IDialogId.INTENT_EXTRA_OUT_RESULT, 3);

    private static final /* synthetic */ FundOperationRequestStatusDto[] $values() {
        return new FundOperationRequestStatusDto[]{SUCCESS, IN_PROGRESS, NEED_CONFIRMATION, RESULT};
    }

    static {
        FundOperationRequestStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FundOperationRequestStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FundOperationRequestStatusDto valueOf(String str) {
        return (FundOperationRequestStatusDto) Enum.valueOf(FundOperationRequestStatusDto.class, str);
    }

    public static FundOperationRequestStatusDto[] values() {
        return (FundOperationRequestStatusDto[]) $VALUES.clone();
    }
}
