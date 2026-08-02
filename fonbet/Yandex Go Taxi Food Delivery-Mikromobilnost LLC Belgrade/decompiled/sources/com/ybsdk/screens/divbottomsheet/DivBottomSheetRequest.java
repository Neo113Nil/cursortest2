package com.ybsdk.screens.divbottomsheet;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetRequest;", "", "target", "", "agreementId", "additionalData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTarget", "()Ljava/lang/String;", "getAgreementId", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DivBottomSheetRequest {
    private final Map<String, String> additionalData;
    private final String agreementId;
    private final String target;

    public DivBottomSheetRequest(@Json(name = "target") String str, @Json(name = "agreement_id") String str2, @Json(name = "additional_data") Map<String, String> map) {
        this.target = str;
        this.agreementId = str2;
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivBottomSheetRequest copy$default(DivBottomSheetRequest divBottomSheetRequest, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = divBottomSheetRequest.target;
        }
        if ((i & 2) != 0) {
            str2 = divBottomSheetRequest.agreementId;
        }
        if ((i & 4) != 0) {
            map = divBottomSheetRequest.additionalData;
        }
        return divBottomSheetRequest.copy(str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Map<String, String> component3() {
        return this.additionalData;
    }

    public final DivBottomSheetRequest copy(@Json(name = "target") String target, @Json(name = "agreement_id") String agreementId, @Json(name = "additional_data") Map<String, String> additionalData) {
        return new DivBottomSheetRequest(target, agreementId, additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivBottomSheetRequest)) {
            return false;
        }
        DivBottomSheetRequest divBottomSheetRequest = (DivBottomSheetRequest) other;
        return jl40.l(this.target, divBottomSheetRequest.target) && jl40.l(this.agreementId, divBottomSheetRequest.agreementId) && jl40.l(this.additionalData, divBottomSheetRequest.additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = this.target.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.target;
        String str2 = this.agreementId;
        return b64.r(b64.v("DivBottomSheetRequest(target=", str, ", agreementId=", str2, ", additionalData="), this.additionalData, Extension.C_BRAKE);
    }
}
