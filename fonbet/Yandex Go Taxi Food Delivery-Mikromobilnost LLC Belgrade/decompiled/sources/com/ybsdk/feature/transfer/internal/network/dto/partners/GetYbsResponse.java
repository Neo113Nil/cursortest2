package com.ybsdk.feature.transfer.internal.network.dto.partners;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetYbsResponse;", "", "cursor", "", "ybs", "", "Lcom/ybsdk/core/transfer/utils/domain/dto/PartnerDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCursor", "()Ljava/lang/String;", "getYbs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetYbsResponse {
    private final String cursor;
    private final List<PartnerDto> ybs;

    public GetYbsResponse(@Json(name = "cursor") String str, @Json(name = "JSON_FIELD_MEMBERS") List<PartnerDto> list) {
        this.cursor = str;
        this.ybs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetYbsResponse copy$default(GetYbsResponse getYbsResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getYbsResponse.cursor;
        }
        if ((i & 2) != 0) {
            list = getYbsResponse.ybs;
        }
        return getYbsResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final List<PartnerDto> component2() {
        return this.ybs;
    }

    public final GetYbsResponse copy(@Json(name = "cursor") String cursor, @Json(name = "JSON_FIELD_MEMBERS") List<PartnerDto> ybs) {
        return new GetYbsResponse(cursor, ybs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetYbsResponse)) {
            return false;
        }
        GetYbsResponse getYbsResponse = (GetYbsResponse) other;
        return jl40.l(this.cursor, getYbsResponse.cursor) && jl40.l(this.ybs, getYbsResponse.ybs);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<PartnerDto> getYbs() {
        return this.ybs;
    }

    public int hashCode() {
        String str = this.cursor;
        return this.ybs.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nnm.h("GetYbsResponse(cursor=", this.cursor, ", ybs=", Extension.C_BRAKE, this.ybs);
    }
}
