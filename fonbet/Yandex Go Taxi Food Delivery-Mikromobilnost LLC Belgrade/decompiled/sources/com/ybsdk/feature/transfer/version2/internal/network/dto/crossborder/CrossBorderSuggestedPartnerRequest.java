package com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/crossborder/CrossBorderSuggestedPartnerRequest;", "", "receiverPhone", "", "destinationCountry", "showFullList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getReceiverPhone", "()Ljava/lang/String;", "getDestinationCountry", "getShowFullList", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderSuggestedPartnerRequest {
    private final String destinationCountry;
    private final String receiverPhone;
    private final boolean showFullList;

    public CrossBorderSuggestedPartnerRequest(@Json(name = "receiver_phone") String str, @Json(name = "destination_country") String str2, @Json(name = "show_full_list") boolean z) {
        this.receiverPhone = str;
        this.destinationCountry = str2;
        this.showFullList = z;
    }

    public static /* synthetic */ CrossBorderSuggestedPartnerRequest copy$default(CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderSuggestedPartnerRequest.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = crossBorderSuggestedPartnerRequest.destinationCountry;
        }
        if ((i & 4) != 0) {
            z = crossBorderSuggestedPartnerRequest.showFullList;
        }
        return crossBorderSuggestedPartnerRequest.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDestinationCountry() {
        return this.destinationCountry;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowFullList() {
        return this.showFullList;
    }

    public final CrossBorderSuggestedPartnerRequest copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "destination_country") String destinationCountry, @Json(name = "show_full_list") boolean showFullList) {
        return new CrossBorderSuggestedPartnerRequest(receiverPhone, destinationCountry, showFullList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderSuggestedPartnerRequest)) {
            return false;
        }
        CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest = (CrossBorderSuggestedPartnerRequest) other;
        return jl40.l(this.receiverPhone, crossBorderSuggestedPartnerRequest.receiverPhone) && jl40.l(this.destinationCountry, crossBorderSuggestedPartnerRequest.destinationCountry) && this.showFullList == crossBorderSuggestedPartnerRequest.showFullList;
    }

    public final String getDestinationCountry() {
        return this.destinationCountry;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final boolean getShowFullList() {
        return this.showFullList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showFullList) + unr0.b(this.receiverPhone.hashCode() * 31, 31, this.destinationCountry);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.destinationCountry;
        return x4e.i(b64.v("CrossBorderSuggestedPartnerRequest(receiverPhone=", str, ", destinationCountry=", str2, ", showFullList="), this.showFullList, Extension.C_BRAKE);
    }

    public /* synthetic */ CrossBorderSuggestedPartnerRequest(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
