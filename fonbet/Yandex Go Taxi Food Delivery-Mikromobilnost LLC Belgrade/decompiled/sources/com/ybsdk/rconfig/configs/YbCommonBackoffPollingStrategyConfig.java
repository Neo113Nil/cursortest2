package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbCommonBackoffPollingStrategyConfig;", "", "", "", "Lcom/ybsdk/rconfig/configs/PollingConfig;", "jsonValues", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/rconfig/configs/YbCommonBackoffPollingStrategyConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getJsonValues", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbCommonBackoffPollingStrategyConfig {
    private final Map<String, PollingConfig> jsonValues;

    /* JADX WARN: Multi-variable type inference failed */
    public YbCommonBackoffPollingStrategyConfig(Map<String, ? extends PollingConfig> map) {
        this.jsonValues = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbCommonBackoffPollingStrategyConfig copy$default(YbCommonBackoffPollingStrategyConfig ybCommonBackoffPollingStrategyConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = ybCommonBackoffPollingStrategyConfig.jsonValues;
        }
        return ybCommonBackoffPollingStrategyConfig.copy(map);
    }

    public final Map<String, PollingConfig> component1() {
        return this.jsonValues;
    }

    public final YbCommonBackoffPollingStrategyConfig copy(Map<String, ? extends PollingConfig> jsonValues) {
        return new YbCommonBackoffPollingStrategyConfig(jsonValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YbCommonBackoffPollingStrategyConfig) && jl40.l(this.jsonValues, ((YbCommonBackoffPollingStrategyConfig) other).jsonValues);
    }

    public final Map<String, PollingConfig> getJsonValues() {
        return this.jsonValues;
    }

    public int hashCode() {
        return this.jsonValues.hashCode();
    }

    public String toString() {
        return nnm.j("YbCommonBackoffPollingStrategyConfig(jsonValues=", Extension.C_BRAKE, this.jsonValues);
    }
}
