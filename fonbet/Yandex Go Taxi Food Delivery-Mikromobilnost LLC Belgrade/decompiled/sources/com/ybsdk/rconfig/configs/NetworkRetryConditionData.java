package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "codeRange", "Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;", "<init>", "(Ljava/lang/Integer;Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCodeRange", "()Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;)Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "equals", "", "other", "hashCode", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkRetryConditionData {

    @Json(name = AuthSdkActivity.RESPONSE_TYPE_CODE)
    private final Integer code;

    @Json(name = "code_range")
    private final NetworkCodeRangeData codeRange;

    public NetworkRetryConditionData(Integer num, NetworkCodeRangeData networkCodeRangeData) {
        this.code = num;
        this.codeRange = networkCodeRangeData;
    }

    public static /* synthetic */ NetworkRetryConditionData copy$default(NetworkRetryConditionData networkRetryConditionData, Integer num, NetworkCodeRangeData networkCodeRangeData, int i, Object obj) {
        if ((i & 1) != 0) {
            num = networkRetryConditionData.code;
        }
        if ((i & 2) != 0) {
            networkCodeRangeData = networkRetryConditionData.codeRange;
        }
        return networkRetryConditionData.copy(num, networkCodeRangeData);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final NetworkCodeRangeData getCodeRange() {
        return this.codeRange;
    }

    public final NetworkRetryConditionData copy(Integer code, NetworkCodeRangeData codeRange) {
        return new NetworkRetryConditionData(code, codeRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRetryConditionData)) {
            return false;
        }
        NetworkRetryConditionData networkRetryConditionData = (NetworkRetryConditionData) other;
        return jl40.l(this.code, networkRetryConditionData.code) && jl40.l(this.codeRange, networkRetryConditionData.codeRange);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final NetworkCodeRangeData getCodeRange() {
        return this.codeRange;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        NetworkCodeRangeData networkCodeRangeData = this.codeRange;
        return hashCode + (networkCodeRangeData != null ? networkCodeRangeData.hashCode() : 0);
    }

    public String toString() {
        return "NetworkRetryConditionData(code=" + this.code + ", codeRange=" + this.codeRange + Extension.C_BRAKE;
    }
}
