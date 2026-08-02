package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponseDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "requestId", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "getTitle", "()Ljava/lang/String;", "getDescription", "getRequestId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferConfirmResponseDto {
    private final String description;
    private final String requestId;
    private final TransferStatusDto status;
    private final String title;

    public TransferConfirmResponseDto(@Json(name = "status") TransferStatusDto transferStatusDto, @Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "request_id") String str3) {
        this.status = transferStatusDto;
        this.title = str;
        this.description = str2;
        this.requestId = str3;
    }

    public static /* synthetic */ TransferConfirmResponseDto copy$default(TransferConfirmResponseDto transferConfirmResponseDto, TransferStatusDto transferStatusDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            transferStatusDto = transferConfirmResponseDto.status;
        }
        if ((i & 2) != 0) {
            str = transferConfirmResponseDto.title;
        }
        if ((i & 4) != 0) {
            str2 = transferConfirmResponseDto.description;
        }
        if ((i & 8) != 0) {
            str3 = transferConfirmResponseDto.requestId;
        }
        return transferConfirmResponseDto.copy(transferStatusDto, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final TransferConfirmResponseDto copy(@Json(name = "status") TransferStatusDto status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "request_id") String requestId) {
        return new TransferConfirmResponseDto(status, title, description, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferConfirmResponseDto)) {
            return false;
        }
        TransferConfirmResponseDto transferConfirmResponseDto = (TransferConfirmResponseDto) other;
        return this.status == transferConfirmResponseDto.status && jl40.l(this.title, transferConfirmResponseDto.title) && jl40.l(this.description, transferConfirmResponseDto.description) && jl40.l(this.requestId, transferConfirmResponseDto.requestId);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final TransferStatusDto getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.requestId.hashCode() + unr0.b(unr0.b(this.status.hashCode() * 31, 31, this.title), 31, this.description);
    }

    public String toString() {
        TransferStatusDto transferStatusDto = this.status;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.requestId;
        StringBuilder sb = new StringBuilder("TransferConfirmResponseDto(status=");
        sb.append(transferStatusDto);
        sb.append(", title=");
        sb.append(str);
        sb.append(", description=");
        return g8e.r(sb, str2, ", requestId=", str3, Extension.C_BRAKE);
    }
}
