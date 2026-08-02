package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConfigSettingData;", "", "condition", "Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "retry", "Lcom/ybsdk/rconfig/configs/NetworkRetryEnabledData;", "cooldown", "Lcom/ybsdk/rconfig/configs/NetworkCooldownEnabledData;", "<init>", "(Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;Lcom/ybsdk/rconfig/configs/NetworkRetryEnabledData;Lcom/ybsdk/rconfig/configs/NetworkCooldownEnabledData;)V", "getCondition", "()Lcom/ybsdk/rconfig/configs/NetworkRetryConditionData;", "getRetry", "()Lcom/ybsdk/rconfig/configs/NetworkRetryEnabledData;", "getCooldown", "()Lcom/ybsdk/rconfig/configs/NetworkCooldownEnabledData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkRetryConfigSettingData {

    @Json(name = "condition")
    private final NetworkRetryConditionData condition;

    @Json(name = "cooldown")
    private final NetworkCooldownEnabledData cooldown;

    @Json(name = "retry")
    private final NetworkRetryEnabledData retry;

    public NetworkRetryConfigSettingData(NetworkRetryConditionData networkRetryConditionData, NetworkRetryEnabledData networkRetryEnabledData, NetworkCooldownEnabledData networkCooldownEnabledData) {
        this.condition = networkRetryConditionData;
        this.retry = networkRetryEnabledData;
        this.cooldown = networkCooldownEnabledData;
    }

    public static /* synthetic */ NetworkRetryConfigSettingData copy$default(NetworkRetryConfigSettingData networkRetryConfigSettingData, NetworkRetryConditionData networkRetryConditionData, NetworkRetryEnabledData networkRetryEnabledData, NetworkCooldownEnabledData networkCooldownEnabledData, int i, Object obj) {
        if ((i & 1) != 0) {
            networkRetryConditionData = networkRetryConfigSettingData.condition;
        }
        if ((i & 2) != 0) {
            networkRetryEnabledData = networkRetryConfigSettingData.retry;
        }
        if ((i & 4) != 0) {
            networkCooldownEnabledData = networkRetryConfigSettingData.cooldown;
        }
        return networkRetryConfigSettingData.copy(networkRetryConditionData, networkRetryEnabledData, networkCooldownEnabledData);
    }

    /* renamed from: component1, reason: from getter */
    public final NetworkRetryConditionData getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final NetworkRetryEnabledData getRetry() {
        return this.retry;
    }

    /* renamed from: component3, reason: from getter */
    public final NetworkCooldownEnabledData getCooldown() {
        return this.cooldown;
    }

    public final NetworkRetryConfigSettingData copy(NetworkRetryConditionData condition, NetworkRetryEnabledData retry, NetworkCooldownEnabledData cooldown) {
        return new NetworkRetryConfigSettingData(condition, retry, cooldown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRetryConfigSettingData)) {
            return false;
        }
        NetworkRetryConfigSettingData networkRetryConfigSettingData = (NetworkRetryConfigSettingData) other;
        return jl40.l(this.condition, networkRetryConfigSettingData.condition) && jl40.l(this.retry, networkRetryConfigSettingData.retry) && jl40.l(this.cooldown, networkRetryConfigSettingData.cooldown);
    }

    public final NetworkRetryConditionData getCondition() {
        return this.condition;
    }

    public final NetworkCooldownEnabledData getCooldown() {
        return this.cooldown;
    }

    public final NetworkRetryEnabledData getRetry() {
        return this.retry;
    }

    public int hashCode() {
        return this.cooldown.hashCode() + ((this.retry.hashCode() + (this.condition.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "NetworkRetryConfigSettingData(condition=" + this.condition + ", retry=" + this.retry + ", cooldown=" + this.cooldown + Extension.C_BRAKE;
    }
}
