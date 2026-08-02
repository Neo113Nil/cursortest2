package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/MobilePaymentPrerequisiteParam;", "", "targetPhone", "", "targetProviderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTargetPhone", "()Ljava/lang/String;", "getTargetProviderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobilePaymentPrerequisiteParam {
    private final String targetPhone;
    private final String targetProviderId;

    public MobilePaymentPrerequisiteParam(@Json(name = "target_phone") String str, @Json(name = "target_provider_id") String str2) {
        this.targetPhone = str;
        this.targetProviderId = str2;
    }

    public static /* synthetic */ MobilePaymentPrerequisiteParam copy$default(MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobilePaymentPrerequisiteParam.targetPhone;
        }
        if ((i & 2) != 0) {
            str2 = mobilePaymentPrerequisiteParam.targetProviderId;
        }
        return mobilePaymentPrerequisiteParam.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTargetPhone() {
        return this.targetPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTargetProviderId() {
        return this.targetProviderId;
    }

    public final MobilePaymentPrerequisiteParam copy(@Json(name = "target_phone") String targetPhone, @Json(name = "target_provider_id") String targetProviderId) {
        return new MobilePaymentPrerequisiteParam(targetPhone, targetProviderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobilePaymentPrerequisiteParam)) {
            return false;
        }
        MobilePaymentPrerequisiteParam mobilePaymentPrerequisiteParam = (MobilePaymentPrerequisiteParam) other;
        return jl40.l(this.targetPhone, mobilePaymentPrerequisiteParam.targetPhone) && jl40.l(this.targetProviderId, mobilePaymentPrerequisiteParam.targetProviderId);
    }

    public final String getTargetPhone() {
        return this.targetPhone;
    }

    public final String getTargetProviderId() {
        return this.targetProviderId;
    }

    public int hashCode() {
        return this.targetProviderId.hashCode() + (this.targetPhone.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("MobilePaymentPrerequisiteParam(targetPhone=", this.targetPhone, ", targetProviderId=", this.targetProviderId, Extension.C_BRAKE);
    }
}
