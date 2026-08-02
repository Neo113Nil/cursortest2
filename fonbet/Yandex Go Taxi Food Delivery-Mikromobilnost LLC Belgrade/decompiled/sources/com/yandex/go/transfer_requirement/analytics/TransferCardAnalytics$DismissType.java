package com.yandex.go.transfer_requirement.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$DismissType", "", "Lcom/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$DismissType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BackButton", "CloseAfterSaveTransfer", "CloseAfterNotRecoverableError", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferCardAnalytics$DismissType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferCardAnalytics$DismissType[] $VALUES;
    public static final TransferCardAnalytics$DismissType BackButton;
    public static final TransferCardAnalytics$DismissType CloseAfterNotRecoverableError;
    public static final TransferCardAnalytics$DismissType CloseAfterSaveTransfer;
    private final String eventValue;

    static {
        TransferCardAnalytics$DismissType transferCardAnalytics$DismissType = new TransferCardAnalytics$DismissType("BackButton", 0, "back_button");
        BackButton = transferCardAnalytics$DismissType;
        TransferCardAnalytics$DismissType transferCardAnalytics$DismissType2 = new TransferCardAnalytics$DismissType("CloseAfterSaveTransfer", 1, "close_after_save_transfer");
        CloseAfterSaveTransfer = transferCardAnalytics$DismissType2;
        TransferCardAnalytics$DismissType transferCardAnalytics$DismissType3 = new TransferCardAnalytics$DismissType("CloseAfterNotRecoverableError", 2, "close_after_not_recoverable_error");
        CloseAfterNotRecoverableError = transferCardAnalytics$DismissType3;
        TransferCardAnalytics$DismissType[] transferCardAnalytics$DismissTypeArr = {transferCardAnalytics$DismissType, transferCardAnalytics$DismissType2, transferCardAnalytics$DismissType3};
        $VALUES = transferCardAnalytics$DismissTypeArr;
        $ENTRIES = a.a(transferCardAnalytics$DismissTypeArr);
    }

    public TransferCardAnalytics$DismissType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransferCardAnalytics$DismissType valueOf(String str) {
        return (TransferCardAnalytics$DismissType) Enum.valueOf(TransferCardAnalytics$DismissType.class, str);
    }

    public static TransferCardAnalytics$DismissType[] values() {
        return (TransferCardAnalytics$DismissType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
