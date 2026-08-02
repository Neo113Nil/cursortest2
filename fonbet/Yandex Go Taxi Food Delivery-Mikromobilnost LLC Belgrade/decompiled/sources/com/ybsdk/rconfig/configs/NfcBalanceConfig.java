package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcBalanceConfig;", "", "", "", "", "productToEnabledMap", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/rconfig/configs/NfcBalanceConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getProductToEnabledMap", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcBalanceConfig {

    @Json(name = "product_to_enabled_map")
    private final Map<String, Boolean> productToEnabledMap;

    public NfcBalanceConfig(Map<String, Boolean> map) {
        this.productToEnabledMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcBalanceConfig copy$default(NfcBalanceConfig nfcBalanceConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = nfcBalanceConfig.productToEnabledMap;
        }
        return nfcBalanceConfig.copy(map);
    }

    public final Map<String, Boolean> component1() {
        return this.productToEnabledMap;
    }

    public final NfcBalanceConfig copy(Map<String, Boolean> productToEnabledMap) {
        return new NfcBalanceConfig(productToEnabledMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NfcBalanceConfig) && jl40.l(this.productToEnabledMap, ((NfcBalanceConfig) other).productToEnabledMap);
    }

    public final Map<String, Boolean> getProductToEnabledMap() {
        return this.productToEnabledMap;
    }

    public int hashCode() {
        return this.productToEnabledMap.hashCode();
    }

    public String toString() {
        return nnm.j("NfcBalanceConfig(productToEnabledMap=", Extension.C_BRAKE, this.productToEnabledMap);
    }
}
