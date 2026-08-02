package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkRetryConfigData;", "", "Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "retryPolicy", "Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "cooldownPolicy", "Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;", "retryBudget", "", "Lcom/ybsdk/rconfig/configs/NetworkRetryConfigSettingData;", "settings", "<init>", "(Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;Ljava/util/List;)V", "component1", "()Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "component2", "()Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "component3", "()Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;", "component4", "()Ljava/util/List;", "copy", "(Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/NetworkRetryConfigData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/NetworkRetryPolicyData;", "getRetryPolicy", "Lcom/ybsdk/rconfig/configs/NetworkCooldownPolicyData;", "getCooldownPolicy", "Lcom/ybsdk/rconfig/configs/NetworkRetryBudgetData;", "getRetryBudget", "Ljava/util/List;", "getSettings", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkRetryConfigData {

    @Json(name = "cooldown_policy")
    private final NetworkCooldownPolicyData cooldownPolicy;

    @Json(name = "retry_budget")
    private final NetworkRetryBudgetData retryBudget;

    @Json(name = "retry_policy")
    private final NetworkRetryPolicyData retryPolicy;

    @Json(name = "settings")
    private final List<NetworkRetryConfigSettingData> settings;

    public NetworkRetryConfigData(NetworkRetryPolicyData networkRetryPolicyData, NetworkCooldownPolicyData networkCooldownPolicyData, NetworkRetryBudgetData networkRetryBudgetData, List<NetworkRetryConfigSettingData> list) {
        this.retryPolicy = networkRetryPolicyData;
        this.cooldownPolicy = networkCooldownPolicyData;
        this.retryBudget = networkRetryBudgetData;
        this.settings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRetryConfigData copy$default(NetworkRetryConfigData networkRetryConfigData, NetworkRetryPolicyData networkRetryPolicyData, NetworkCooldownPolicyData networkCooldownPolicyData, NetworkRetryBudgetData networkRetryBudgetData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            networkRetryPolicyData = networkRetryConfigData.retryPolicy;
        }
        if ((i & 2) != 0) {
            networkCooldownPolicyData = networkRetryConfigData.cooldownPolicy;
        }
        if ((i & 4) != 0) {
            networkRetryBudgetData = networkRetryConfigData.retryBudget;
        }
        if ((i & 8) != 0) {
            list = networkRetryConfigData.settings;
        }
        return networkRetryConfigData.copy(networkRetryPolicyData, networkCooldownPolicyData, networkRetryBudgetData, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NetworkRetryPolicyData getRetryPolicy() {
        return this.retryPolicy;
    }

    /* renamed from: component2, reason: from getter */
    public final NetworkCooldownPolicyData getCooldownPolicy() {
        return this.cooldownPolicy;
    }

    /* renamed from: component3, reason: from getter */
    public final NetworkRetryBudgetData getRetryBudget() {
        return this.retryBudget;
    }

    public final List<NetworkRetryConfigSettingData> component4() {
        return this.settings;
    }

    public final NetworkRetryConfigData copy(NetworkRetryPolicyData retryPolicy, NetworkCooldownPolicyData cooldownPolicy, NetworkRetryBudgetData retryBudget, List<NetworkRetryConfigSettingData> settings) {
        return new NetworkRetryConfigData(retryPolicy, cooldownPolicy, retryBudget, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRetryConfigData)) {
            return false;
        }
        NetworkRetryConfigData networkRetryConfigData = (NetworkRetryConfigData) other;
        return jl40.l(this.retryPolicy, networkRetryConfigData.retryPolicy) && jl40.l(this.cooldownPolicy, networkRetryConfigData.cooldownPolicy) && jl40.l(this.retryBudget, networkRetryConfigData.retryBudget) && jl40.l(this.settings, networkRetryConfigData.settings);
    }

    public final NetworkCooldownPolicyData getCooldownPolicy() {
        return this.cooldownPolicy;
    }

    public final NetworkRetryBudgetData getRetryBudget() {
        return this.retryBudget;
    }

    public final NetworkRetryPolicyData getRetryPolicy() {
        return this.retryPolicy;
    }

    public final List<NetworkRetryConfigSettingData> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode() + ((this.retryBudget.hashCode() + ((this.cooldownPolicy.hashCode() + (this.retryPolicy.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "NetworkRetryConfigData(retryPolicy=" + this.retryPolicy + ", cooldownPolicy=" + this.cooldownPolicy + ", retryBudget=" + this.retryBudget + ", settings=" + this.settings + Extension.C_BRAKE;
    }
}
