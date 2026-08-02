package com.ybsdk.core.common.data.network.dto.nfc;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PAY_CARD", "CREDIT_LIMIT", "CORP_CARD", "PRO", "OTHER", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcProductTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcProductTypeDto[] $VALUES;
    public static final NfcProductTypeDto PAY_CARD = new NfcProductTypeDto("PAY_CARD", 0);
    public static final NfcProductTypeDto CREDIT_LIMIT = new NfcProductTypeDto("CREDIT_LIMIT", 1);
    public static final NfcProductTypeDto CORP_CARD = new NfcProductTypeDto("CORP_CARD", 2);
    public static final NfcProductTypeDto PRO = new NfcProductTypeDto("PRO", 3);
    public static final NfcProductTypeDto OTHER = new NfcProductTypeDto("OTHER", 4);

    private static final /* synthetic */ NfcProductTypeDto[] $values() {
        return new NfcProductTypeDto[]{PAY_CARD, CREDIT_LIMIT, CORP_CARD, PRO, OTHER};
    }

    static {
        NfcProductTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcProductTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcProductTypeDto valueOf(String str) {
        return (NfcProductTypeDto) Enum.valueOf(NfcProductTypeDto.class, str);
    }

    public static NfcProductTypeDto[] values() {
        return (NfcProductTypeDto[]) $VALUES.clone();
    }
}
