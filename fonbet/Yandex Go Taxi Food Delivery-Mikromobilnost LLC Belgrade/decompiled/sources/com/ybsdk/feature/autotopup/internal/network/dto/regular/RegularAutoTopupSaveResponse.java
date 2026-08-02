package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSaveResponse;", "", "requestId", "", "button", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "appNotFoundSheet", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/CommonSheet;)V", "getRequestId", "()Ljava/lang/String;", "getButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getAppNotFoundSheet", "()Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutoTopupSaveResponse {
    private final CommonSheet appNotFoundSheet;
    private final ActionButtonDto button;
    private final String requestId;

    public RegularAutoTopupSaveResponse(@Json(name = "request_id") String str, @Json(name = "button") ActionButtonDto actionButtonDto, @Json(name = "app_not_found_sheet") CommonSheet commonSheet) {
        this.requestId = str;
        this.button = actionButtonDto;
        this.appNotFoundSheet = commonSheet;
    }

    public static /* synthetic */ RegularAutoTopupSaveResponse copy$default(RegularAutoTopupSaveResponse regularAutoTopupSaveResponse, String str, ActionButtonDto actionButtonDto, CommonSheet commonSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            str = regularAutoTopupSaveResponse.requestId;
        }
        if ((i & 2) != 0) {
            actionButtonDto = regularAutoTopupSaveResponse.button;
        }
        if ((i & 4) != 0) {
            commonSheet = regularAutoTopupSaveResponse.appNotFoundSheet;
        }
        return regularAutoTopupSaveResponse.copy(str, actionButtonDto, commonSheet);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionButtonDto getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    public final RegularAutoTopupSaveResponse copy(@Json(name = "request_id") String requestId, @Json(name = "button") ActionButtonDto button, @Json(name = "app_not_found_sheet") CommonSheet appNotFoundSheet) {
        return new RegularAutoTopupSaveResponse(requestId, button, appNotFoundSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutoTopupSaveResponse)) {
            return false;
        }
        RegularAutoTopupSaveResponse regularAutoTopupSaveResponse = (RegularAutoTopupSaveResponse) other;
        return jl40.l(this.requestId, regularAutoTopupSaveResponse.requestId) && jl40.l(this.button, regularAutoTopupSaveResponse.button) && jl40.l(this.appNotFoundSheet, regularAutoTopupSaveResponse.appNotFoundSheet);
    }

    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    public final ActionButtonDto getButton() {
        return this.button;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        ActionButtonDto actionButtonDto = this.button;
        int hashCode2 = (hashCode + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        CommonSheet commonSheet = this.appNotFoundSheet;
        return hashCode2 + (commonSheet != null ? commonSheet.hashCode() : 0);
    }

    public String toString() {
        return "RegularAutoTopupSaveResponse(requestId=" + this.requestId + ", button=" + this.button + ", appNotFoundSheet=" + this.appNotFoundSheet + Extension.C_BRAKE;
    }
}
