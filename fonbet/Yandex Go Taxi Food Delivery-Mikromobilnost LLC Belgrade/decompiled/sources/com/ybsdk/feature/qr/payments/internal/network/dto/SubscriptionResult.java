package com.ybsdk.feature.qr.payments.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult;", "", Constants.KEY_MESSAGE, "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult$Status;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult$Status;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult$Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionResult {
    private final String message;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "FAILED", "SUCCESS", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FAILED = new Status("FAILED", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{FAILED, SUCCESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public SubscriptionResult(@Json(name = "message") String str, @Json(name = "status") Status status) {
        this.message = str;
        this.status = status;
    }

    public static /* synthetic */ SubscriptionResult copy$default(SubscriptionResult subscriptionResult, String str, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionResult.message;
        }
        if ((i & 2) != 0) {
            status = subscriptionResult.status;
        }
        return subscriptionResult.copy(str, status);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final SubscriptionResult copy(@Json(name = "message") String message, @Json(name = "status") Status status) {
        return new SubscriptionResult(message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionResult)) {
            return false;
        }
        SubscriptionResult subscriptionResult = (SubscriptionResult) other;
        return jl40.l(this.message, subscriptionResult.message) && this.status == subscriptionResult.status;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.message.hashCode() * 31);
    }

    public String toString() {
        return "SubscriptionResult(message=" + this.message + ", status=" + this.status + Extension.C_BRAKE;
    }
}
