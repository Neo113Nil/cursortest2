package com.ybsdk.feature.main.internal.data.network.dto;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommonSheet;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/BindSbpAccountResponse;", "", Constants.DEEPLINK, "", "appNotFoundSheet", "Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommonSheet;)V", "getDeeplink", "()Ljava/lang/String;", "getAppNotFoundSheet", "()Lcom/ybsdk/core/common/data/network/dto/CommonSheet;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BindSbpAccountResponse {
    private final CommonSheet appNotFoundSheet;
    private final String deeplink;

    public BindSbpAccountResponse(@Json(name = "deeplink") String str, @Json(name = "app_not_found_sheet") CommonSheet commonSheet) {
        this.deeplink = str;
        this.appNotFoundSheet = commonSheet;
    }

    public static /* synthetic */ BindSbpAccountResponse copy$default(BindSbpAccountResponse bindSbpAccountResponse, String str, CommonSheet commonSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindSbpAccountResponse.deeplink;
        }
        if ((i & 2) != 0) {
            commonSheet = bindSbpAccountResponse.appNotFoundSheet;
        }
        return bindSbpAccountResponse.copy(str, commonSheet);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    public final BindSbpAccountResponse copy(@Json(name = "deeplink") String deeplink, @Json(name = "app_not_found_sheet") CommonSheet appNotFoundSheet) {
        return new BindSbpAccountResponse(deeplink, appNotFoundSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindSbpAccountResponse)) {
            return false;
        }
        BindSbpAccountResponse bindSbpAccountResponse = (BindSbpAccountResponse) other;
        return jl40.l(this.deeplink, bindSbpAccountResponse.deeplink) && jl40.l(this.appNotFoundSheet, bindSbpAccountResponse.appNotFoundSheet);
    }

    public final CommonSheet getAppNotFoundSheet() {
        return this.appNotFoundSheet;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        String str = this.deeplink;
        return this.appNotFoundSheet.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "BindSbpAccountResponse(deeplink=" + this.deeplink + ", appNotFoundSheet=" + this.appNotFoundSheet + Extension.C_BRAKE;
    }
}
