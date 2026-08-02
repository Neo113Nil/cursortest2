package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/CommonFeatureFlag;", "", "", "isEnabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/ybsdk/rconfig/configs/CommonFeatureFlag;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CommonFeatureFlag {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    public CommonFeatureFlag(boolean z) {
        this.isEnabled = z;
    }

    public static /* synthetic */ CommonFeatureFlag copy$default(CommonFeatureFlag commonFeatureFlag, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = commonFeatureFlag.isEnabled;
        }
        return commonFeatureFlag.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final CommonFeatureFlag copy(boolean isEnabled) {
        return new CommonFeatureFlag(isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CommonFeatureFlag) && this.isEnabled == ((CommonFeatureFlag) other).isEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return nzs.b("CommonFeatureFlag(isEnabled=", Extension.C_BRAKE, this.isEnabled);
    }
}
