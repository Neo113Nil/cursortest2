package com.ybsdk.feature.transfer.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.FpsHeaderDto;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult$Status;", "receiverName", "", "error", "header", "Lcom/ybsdk/core/transfer/utils/domain/dto/FpsHeaderDto;", "<init>", "(Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult$Status;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/domain/dto/FpsHeaderDto;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult$Status;", "getReceiverName", "()Ljava/lang/String;", "getError", "getHeader", "()Lcom/ybsdk/core/transfer/utils/domain/dto/FpsHeaderDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCheckResult {
    private final String error;
    private final FpsHeaderDto header;
    private final String receiverName;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "FOUND", "NOT_FOUND", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FOUND = new Status("FOUND", 0);
        public static final Status NOT_FOUND = new Status("NOT_FOUND", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{FOUND, NOT_FOUND};
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

    public YbCheckResult(@Json(name = "status") Status status, @Json(name = "receiver_name") String str, @Json(name = "error") String str2, @Json(name = "header") FpsHeaderDto fpsHeaderDto) {
        this.status = status;
        this.receiverName = str;
        this.error = str2;
        this.header = fpsHeaderDto;
    }

    public static /* synthetic */ YbCheckResult copy$default(YbCheckResult ybCheckResult, Status status, String str, String str2, FpsHeaderDto fpsHeaderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            status = ybCheckResult.status;
        }
        if ((i & 2) != 0) {
            str = ybCheckResult.receiverName;
        }
        if ((i & 4) != 0) {
            str2 = ybCheckResult.error;
        }
        if ((i & 8) != 0) {
            fpsHeaderDto = ybCheckResult.header;
        }
        return ybCheckResult.copy(status, str, str2, fpsHeaderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final FpsHeaderDto getHeader() {
        return this.header;
    }

    public final YbCheckResult copy(@Json(name = "status") Status status, @Json(name = "receiver_name") String receiverName, @Json(name = "error") String error, @Json(name = "header") FpsHeaderDto header) {
        return new YbCheckResult(status, receiverName, error, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCheckResult)) {
            return false;
        }
        YbCheckResult ybCheckResult = (YbCheckResult) other;
        return this.status == ybCheckResult.status && jl40.l(this.receiverName, ybCheckResult.receiverName) && jl40.l(this.error, ybCheckResult.error) && jl40.l(this.header, ybCheckResult.header);
    }

    public final String getError() {
        return this.error;
    }

    public final FpsHeaderDto getHeader() {
        return this.header;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.receiverName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FpsHeaderDto fpsHeaderDto = this.header;
        return hashCode3 + (fpsHeaderDto != null ? fpsHeaderDto.hashCode() : 0);
    }

    public String toString() {
        return "YbCheckResult(status=" + this.status + ", receiverName=" + this.receiverName + ", error=" + this.error + ", header=" + this.header + Extension.C_BRAKE;
    }
}
