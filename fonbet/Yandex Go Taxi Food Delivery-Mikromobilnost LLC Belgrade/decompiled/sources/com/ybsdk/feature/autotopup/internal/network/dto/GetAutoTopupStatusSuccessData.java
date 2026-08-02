package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData$Status;", "inProgressData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusInProgressData;", "successData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSuccessResultDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData$Status;Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusInProgressData;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSuccessResultDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData$Status;", "getInProgressData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusInProgressData;", "getSuccessData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSuccessResultDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAutoTopupStatusSuccessData {
    private final GetAutoTopupStatusInProgressData inProgressData;
    private final Status status;
    private final AutoTopupSuccessResultDto successData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutoTopupStatusSuccessData$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "IN_PROGRESS", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status IN_PROGRESS = new Status("IN_PROGRESS", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, IN_PROGRESS};
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

    public GetAutoTopupStatusSuccessData(@Json(name = "status") Status status, @Json(name = "in_progress_data") GetAutoTopupStatusInProgressData getAutoTopupStatusInProgressData, @Json(name = "success_data") AutoTopupSuccessResultDto autoTopupSuccessResultDto) {
        this.status = status;
        this.inProgressData = getAutoTopupStatusInProgressData;
        this.successData = autoTopupSuccessResultDto;
    }

    public static /* synthetic */ GetAutoTopupStatusSuccessData copy$default(GetAutoTopupStatusSuccessData getAutoTopupStatusSuccessData, Status status, GetAutoTopupStatusInProgressData getAutoTopupStatusInProgressData, AutoTopupSuccessResultDto autoTopupSuccessResultDto, int i, Object obj) {
        if ((i & 1) != 0) {
            status = getAutoTopupStatusSuccessData.status;
        }
        if ((i & 2) != 0) {
            getAutoTopupStatusInProgressData = getAutoTopupStatusSuccessData.inProgressData;
        }
        if ((i & 4) != 0) {
            autoTopupSuccessResultDto = getAutoTopupStatusSuccessData.successData;
        }
        return getAutoTopupStatusSuccessData.copy(status, getAutoTopupStatusInProgressData, autoTopupSuccessResultDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final GetAutoTopupStatusInProgressData getInProgressData() {
        return this.inProgressData;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoTopupSuccessResultDto getSuccessData() {
        return this.successData;
    }

    public final GetAutoTopupStatusSuccessData copy(@Json(name = "status") Status status, @Json(name = "in_progress_data") GetAutoTopupStatusInProgressData inProgressData, @Json(name = "success_data") AutoTopupSuccessResultDto successData) {
        return new GetAutoTopupStatusSuccessData(status, inProgressData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAutoTopupStatusSuccessData)) {
            return false;
        }
        GetAutoTopupStatusSuccessData getAutoTopupStatusSuccessData = (GetAutoTopupStatusSuccessData) other;
        return this.status == getAutoTopupStatusSuccessData.status && jl40.l(this.inProgressData, getAutoTopupStatusSuccessData.inProgressData) && jl40.l(this.successData, getAutoTopupStatusSuccessData.successData);
    }

    public final GetAutoTopupStatusInProgressData getInProgressData() {
        return this.inProgressData;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final AutoTopupSuccessResultDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        GetAutoTopupStatusInProgressData getAutoTopupStatusInProgressData = this.inProgressData;
        int hashCode2 = (hashCode + (getAutoTopupStatusInProgressData == null ? 0 : getAutoTopupStatusInProgressData.hashCode())) * 31;
        AutoTopupSuccessResultDto autoTopupSuccessResultDto = this.successData;
        return hashCode2 + (autoTopupSuccessResultDto != null ? autoTopupSuccessResultDto.hashCode() : 0);
    }

    public String toString() {
        return "GetAutoTopupStatusSuccessData(status=" + this.status + ", inProgressData=" + this.inProgressData + ", successData=" + this.successData + Extension.C_BRAKE;
    }
}
