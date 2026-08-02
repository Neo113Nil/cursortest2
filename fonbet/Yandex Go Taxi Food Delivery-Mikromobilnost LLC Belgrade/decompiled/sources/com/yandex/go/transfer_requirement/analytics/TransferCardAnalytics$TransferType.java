package com.yandex.go.transfer_requirement.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$TransferType", "", "Lcom/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$TransferType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Avia", "Train", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferCardAnalytics$TransferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferCardAnalytics$TransferType[] $VALUES;
    public static final TransferCardAnalytics$TransferType Avia;
    public static final TransferCardAnalytics$TransferType Train;
    private final String eventValue;

    static {
        TransferCardAnalytics$TransferType transferCardAnalytics$TransferType = new TransferCardAnalytics$TransferType("Avia", 0, "avia");
        Avia = transferCardAnalytics$TransferType;
        TransferCardAnalytics$TransferType transferCardAnalytics$TransferType2 = new TransferCardAnalytics$TransferType("Train", 1, "train");
        Train = transferCardAnalytics$TransferType2;
        TransferCardAnalytics$TransferType[] transferCardAnalytics$TransferTypeArr = {transferCardAnalytics$TransferType, transferCardAnalytics$TransferType2};
        $VALUES = transferCardAnalytics$TransferTypeArr;
        $ENTRIES = a.a(transferCardAnalytics$TransferTypeArr);
    }

    public TransferCardAnalytics$TransferType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransferCardAnalytics$TransferType valueOf(String str) {
        return (TransferCardAnalytics$TransferType) Enum.valueOf(TransferCardAnalytics$TransferType.class, str);
    }

    public static TransferCardAnalytics$TransferType[] values() {
        return (TransferCardAnalytics$TransferType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
