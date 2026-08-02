package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbBiometrySuggestScreenRetryConfig;", "", "", "retriesNumber", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/ybsdk/rconfig/configs/YbBiometrySuggestScreenRetryConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getRetriesNumber", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbBiometrySuggestScreenRetryConfig {

    @Json(name = "number_of_retries")
    private final int retriesNumber;

    public YbBiometrySuggestScreenRetryConfig(int i) {
        this.retriesNumber = i;
    }

    public static /* synthetic */ YbBiometrySuggestScreenRetryConfig copy$default(YbBiometrySuggestScreenRetryConfig ybBiometrySuggestScreenRetryConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ybBiometrySuggestScreenRetryConfig.retriesNumber;
        }
        return ybBiometrySuggestScreenRetryConfig.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRetriesNumber() {
        return this.retriesNumber;
    }

    public final YbBiometrySuggestScreenRetryConfig copy(int retriesNumber) {
        return new YbBiometrySuggestScreenRetryConfig(retriesNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YbBiometrySuggestScreenRetryConfig) && this.retriesNumber == ((YbBiometrySuggestScreenRetryConfig) other).retriesNumber;
    }

    public final int getRetriesNumber() {
        return this.retriesNumber;
    }

    public int hashCode() {
        return Integer.hashCode(this.retriesNumber);
    }

    public String toString() {
        return oyr.j(this.retriesNumber, "YbBiometrySuggestScreenRetryConfig(retriesNumber=", Extension.C_BRAKE);
    }
}
