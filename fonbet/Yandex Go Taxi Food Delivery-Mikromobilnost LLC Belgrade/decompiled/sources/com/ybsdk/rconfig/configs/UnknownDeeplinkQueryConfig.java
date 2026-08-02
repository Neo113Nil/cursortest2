package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/UnknownDeeplinkQueryConfig;", "", "", "isEnabled", "", "", "namesIgnored", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/ybsdk/rconfig/configs/UnknownDeeplinkQueryConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getNamesIgnored", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UnknownDeeplinkQueryConfig {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "name_parameters_ignore")
    private final List<String> namesIgnored;

    public UnknownDeeplinkQueryConfig(boolean z, List<String> list) {
        this.isEnabled = z;
        this.namesIgnored = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnknownDeeplinkQueryConfig copy$default(UnknownDeeplinkQueryConfig unknownDeeplinkQueryConfig, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unknownDeeplinkQueryConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            list = unknownDeeplinkQueryConfig.namesIgnored;
        }
        return unknownDeeplinkQueryConfig.copy(z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final List<String> component2() {
        return this.namesIgnored;
    }

    public final UnknownDeeplinkQueryConfig copy(boolean isEnabled, List<String> namesIgnored) {
        return new UnknownDeeplinkQueryConfig(isEnabled, namesIgnored);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownDeeplinkQueryConfig)) {
            return false;
        }
        UnknownDeeplinkQueryConfig unknownDeeplinkQueryConfig = (UnknownDeeplinkQueryConfig) other;
        return this.isEnabled == unknownDeeplinkQueryConfig.isEnabled && jl40.l(this.namesIgnored, unknownDeeplinkQueryConfig.namesIgnored);
    }

    public final List<String> getNamesIgnored() {
        return this.namesIgnored;
    }

    public int hashCode() {
        return this.namesIgnored.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "UnknownDeeplinkQueryConfig(isEnabled=" + this.isEnabled + ", namesIgnored=" + this.namesIgnored + Extension.C_BRAKE;
    }
}
