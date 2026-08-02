package com.ybsdk.feature.transfer.internal.network.dto.transfer;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult$Status;", Constants.KEY_MESSAGE, "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult$Status;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult$Status;", "getMessage", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferResult {
    private final String description;
    private final String message;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/transfer/TransferResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "FAILED", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status PROCESSING = new Status("PROCESSING", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, PROCESSING, FAILED};
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

    public TransferResult(@Json(name = "status") Status status, @Json(name = "message") String str, @Json(name = "description") String str2) {
        this.status = status;
        this.message = str;
        this.description = str2;
    }

    public static /* synthetic */ TransferResult copy$default(TransferResult transferResult, Status status, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = transferResult.status;
        }
        if ((i & 2) != 0) {
            str = transferResult.message;
        }
        if ((i & 4) != 0) {
            str2 = transferResult.description;
        }
        return transferResult.copy(status, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final TransferResult copy(@Json(name = "status") Status status, @Json(name = "message") String message, @Json(name = "description") String description) {
        return new TransferResult(status, message, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferResult)) {
            return false;
        }
        TransferResult transferResult = (TransferResult) other;
        return this.status == transferResult.status && jl40.l(this.message, transferResult.message) && jl40.l(this.description, transferResult.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.description.hashCode() + unr0.b(this.status.hashCode() * 31, 31, this.message);
    }

    public String toString() {
        Status status = this.status;
        String str = this.message;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder("TransferResult(status=");
        sb.append(status);
        sb.append(", message=");
        sb.append(str);
        sb.append(", description=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
