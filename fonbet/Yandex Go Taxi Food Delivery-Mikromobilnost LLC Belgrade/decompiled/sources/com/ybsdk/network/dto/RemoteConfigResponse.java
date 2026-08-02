package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/RemoteConfigResponse;", "", "typedExperiments", "", "Lcom/ybsdk/network/dto/RemoteConfigResponse$TypedExperiments;", "version", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTypedExperiments", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TypedExperiments", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RemoteConfigResponse {
    private final List<TypedExperiments> typedExperiments;
    private final String version;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/RemoteConfigResponse$TypedExperiments;", "", "name", "", "cacheStatus", "version", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getCacheStatus", "getVersion", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TypedExperiments {
        private final String cacheStatus;
        private final String name;
        private final String value;
        private final String version;

        public TypedExperiments(@Json(name = "name") String str, @Json(name = "cache_status") String str2, @Json(name = "version") String str3, @Json(name = "value") @RawJsonString String str4) {
            this.name = str;
            this.cacheStatus = str2;
            this.version = str3;
            this.value = str4;
        }

        public static /* synthetic */ TypedExperiments copy$default(TypedExperiments typedExperiments, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = typedExperiments.name;
            }
            if ((i & 2) != 0) {
                str2 = typedExperiments.cacheStatus;
            }
            if ((i & 4) != 0) {
                str3 = typedExperiments.version;
            }
            if ((i & 8) != 0) {
                str4 = typedExperiments.value;
            }
            return typedExperiments.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCacheStatus() {
            return this.cacheStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component4, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final TypedExperiments copy(@Json(name = "name") String name, @Json(name = "cache_status") String cacheStatus, @Json(name = "version") String version, @Json(name = "value") @RawJsonString String value) {
            return new TypedExperiments(name, cacheStatus, version, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TypedExperiments)) {
                return false;
            }
            TypedExperiments typedExperiments = (TypedExperiments) other;
            return jl40.l(this.name, typedExperiments.name) && jl40.l(this.cacheStatus, typedExperiments.cacheStatus) && jl40.l(this.version, typedExperiments.version) && jl40.l(this.value, typedExperiments.value);
        }

        public final String getCacheStatus() {
            return this.cacheStatus;
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.value.hashCode() + unr0.b(unr0.b(this.name.hashCode() * 31, 31, this.cacheStatus), 31, this.version);
        }

        public String toString() {
            String str = this.name;
            String str2 = this.cacheStatus;
            return g8e.r(b64.v("TypedExperiments(name=", str, ", cacheStatus=", str2, ", version="), this.version, ", value=", this.value, Extension.C_BRAKE);
        }
    }

    public RemoteConfigResponse(@Json(name = "typed_experiments") List<TypedExperiments> list, @Json(name = "version") String str) {
        this.typedExperiments = list;
        this.version = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteConfigResponse copy$default(RemoteConfigResponse remoteConfigResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = remoteConfigResponse.typedExperiments;
        }
        if ((i & 2) != 0) {
            str = remoteConfigResponse.version;
        }
        return remoteConfigResponse.copy(list, str);
    }

    public final List<TypedExperiments> component1() {
        return this.typedExperiments;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final RemoteConfigResponse copy(@Json(name = "typed_experiments") List<TypedExperiments> typedExperiments, @Json(name = "version") String version) {
        return new RemoteConfigResponse(typedExperiments, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfigResponse)) {
            return false;
        }
        RemoteConfigResponse remoteConfigResponse = (RemoteConfigResponse) other;
        return jl40.l(this.typedExperiments, remoteConfigResponse.typedExperiments) && jl40.l(this.version, remoteConfigResponse.version);
    }

    public final List<TypedExperiments> getTypedExperiments() {
        return this.typedExperiments;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.typedExperiments.hashCode() * 31);
    }

    public String toString() {
        return xvz.i("RemoteConfigResponse(typedExperiments=", ", version=", this.version, Extension.C_BRAKE, this.typedExperiments);
    }
}
