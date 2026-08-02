package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0006\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/SamsungPayFeature;", "", "", "", "serviceIds", "", "isEnabled", "<init>", "(Ljava/util/Map;Z)V", "component1", "()Ljava/util/Map;", "component2", "()Z", "copy", "(Ljava/util/Map;Z)Lcom/ybsdk/rconfig/configs/SamsungPayFeature;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getServiceIds", "Z", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SamsungPayFeature {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "service_ids")
    private final Map<String, String> serviceIds;

    public SamsungPayFeature(Map<String, String> map, boolean z) {
        this.serviceIds = map;
        this.isEnabled = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SamsungPayFeature copy$default(SamsungPayFeature samsungPayFeature, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = samsungPayFeature.serviceIds;
        }
        if ((i & 2) != 0) {
            z = samsungPayFeature.isEnabled;
        }
        return samsungPayFeature.copy(map, z);
    }

    public final Map<String, String> component1() {
        return this.serviceIds;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final SamsungPayFeature copy(Map<String, String> serviceIds, boolean isEnabled) {
        return new SamsungPayFeature(serviceIds, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SamsungPayFeature)) {
            return false;
        }
        SamsungPayFeature samsungPayFeature = (SamsungPayFeature) other;
        return jl40.l(this.serviceIds, samsungPayFeature.serviceIds) && this.isEnabled == samsungPayFeature.isEnabled;
    }

    public final Map<String, String> getServiceIds() {
        return this.serviceIds;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.serviceIds.hashCode() * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "SamsungPayFeature(serviceIds=" + this.serviceIds + ", isEnabled=" + this.isEnabled + Extension.C_BRAKE;
    }
}
