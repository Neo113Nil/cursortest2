package com.yandex.go.payments.sbp.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/payments/sbp/domain/OpeningBankDialogInteractor$DialogDataSource", "", "Lcom/yandex/go/payments/sbp/domain/OpeningBankDialogInteractor$DialogDataSource;", "WEB_OVERRIDE", "WITHOUT_WEB_OVERRIDE", "ORIGINAL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpeningBankDialogInteractor$DialogDataSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpeningBankDialogInteractor$DialogDataSource[] $VALUES;
    public static final OpeningBankDialogInteractor$DialogDataSource ORIGINAL;
    public static final OpeningBankDialogInteractor$DialogDataSource WEB_OVERRIDE;
    public static final OpeningBankDialogInteractor$DialogDataSource WITHOUT_WEB_OVERRIDE;

    static {
        OpeningBankDialogInteractor$DialogDataSource openingBankDialogInteractor$DialogDataSource = new OpeningBankDialogInteractor$DialogDataSource("WEB_OVERRIDE", 0);
        WEB_OVERRIDE = openingBankDialogInteractor$DialogDataSource;
        OpeningBankDialogInteractor$DialogDataSource openingBankDialogInteractor$DialogDataSource2 = new OpeningBankDialogInteractor$DialogDataSource("WITHOUT_WEB_OVERRIDE", 1);
        WITHOUT_WEB_OVERRIDE = openingBankDialogInteractor$DialogDataSource2;
        OpeningBankDialogInteractor$DialogDataSource openingBankDialogInteractor$DialogDataSource3 = new OpeningBankDialogInteractor$DialogDataSource("ORIGINAL", 2);
        ORIGINAL = openingBankDialogInteractor$DialogDataSource3;
        OpeningBankDialogInteractor$DialogDataSource[] openingBankDialogInteractor$DialogDataSourceArr = {openingBankDialogInteractor$DialogDataSource, openingBankDialogInteractor$DialogDataSource2, openingBankDialogInteractor$DialogDataSource3};
        $VALUES = openingBankDialogInteractor$DialogDataSourceArr;
        $ENTRIES = kotlin.enums.a.a(openingBankDialogInteractor$DialogDataSourceArr);
    }

    public static OpeningBankDialogInteractor$DialogDataSource valueOf(String str) {
        return (OpeningBankDialogInteractor$DialogDataSource) Enum.valueOf(OpeningBankDialogInteractor$DialogDataSource.class, str);
    }

    public static OpeningBankDialogInteractor$DialogDataSource[] values() {
        return (OpeningBankDialogInteractor$DialogDataSource[]) $VALUES.clone();
    }
}
