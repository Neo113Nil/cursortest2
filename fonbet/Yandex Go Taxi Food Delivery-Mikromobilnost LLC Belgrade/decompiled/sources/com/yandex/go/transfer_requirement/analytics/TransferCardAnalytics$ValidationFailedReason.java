package com.yandex.go.transfer_requirement.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$ValidationFailedReason", "", "Lcom/yandex/go/transfer_requirement/analytics/TransferCardAnalytics$ValidationFailedReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BadRequest", "TransferNotFound", "TripNotFound", "ExplicitGreeting", "NotRetryableError", "Unknown", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferCardAnalytics$ValidationFailedReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferCardAnalytics$ValidationFailedReason[] $VALUES;
    public static final TransferCardAnalytics$ValidationFailedReason BadRequest;
    public static final TransferCardAnalytics$ValidationFailedReason ExplicitGreeting;
    public static final TransferCardAnalytics$ValidationFailedReason NotRetryableError;
    public static final TransferCardAnalytics$ValidationFailedReason TransferNotFound;
    public static final TransferCardAnalytics$ValidationFailedReason TripNotFound;
    public static final TransferCardAnalytics$ValidationFailedReason Unknown;
    private final String eventValue;

    static {
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason = new TransferCardAnalytics$ValidationFailedReason("BadRequest", 0, "bad_request");
        BadRequest = transferCardAnalytics$ValidationFailedReason;
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason2 = new TransferCardAnalytics$ValidationFailedReason("TransferNotFound", 1, "transfer_not_found");
        TransferNotFound = transferCardAnalytics$ValidationFailedReason2;
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason3 = new TransferCardAnalytics$ValidationFailedReason("TripNotFound", 2, "trip_not_found");
        TripNotFound = transferCardAnalytics$ValidationFailedReason3;
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason4 = new TransferCardAnalytics$ValidationFailedReason("ExplicitGreeting", 3, "explicit_greeting");
        ExplicitGreeting = transferCardAnalytics$ValidationFailedReason4;
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason5 = new TransferCardAnalytics$ValidationFailedReason("NotRetryableError", 4, "not_retryable_error");
        NotRetryableError = transferCardAnalytics$ValidationFailedReason5;
        TransferCardAnalytics$ValidationFailedReason transferCardAnalytics$ValidationFailedReason6 = new TransferCardAnalytics$ValidationFailedReason("Unknown", 5, "unknown");
        Unknown = transferCardAnalytics$ValidationFailedReason6;
        TransferCardAnalytics$ValidationFailedReason[] transferCardAnalytics$ValidationFailedReasonArr = {transferCardAnalytics$ValidationFailedReason, transferCardAnalytics$ValidationFailedReason2, transferCardAnalytics$ValidationFailedReason3, transferCardAnalytics$ValidationFailedReason4, transferCardAnalytics$ValidationFailedReason5, transferCardAnalytics$ValidationFailedReason6};
        $VALUES = transferCardAnalytics$ValidationFailedReasonArr;
        $ENTRIES = a.a(transferCardAnalytics$ValidationFailedReasonArr);
    }

    public TransferCardAnalytics$ValidationFailedReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransferCardAnalytics$ValidationFailedReason valueOf(String str) {
        return (TransferCardAnalytics$ValidationFailedReason) Enum.valueOf(TransferCardAnalytics$ValidationFailedReason.class, str);
    }

    public static TransferCardAnalytics$ValidationFailedReason[] values() {
        return (TransferCardAnalytics$ValidationFailedReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
