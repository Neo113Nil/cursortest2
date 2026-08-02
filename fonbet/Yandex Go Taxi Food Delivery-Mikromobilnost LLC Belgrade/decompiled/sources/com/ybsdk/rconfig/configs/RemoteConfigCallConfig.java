package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/RemoteConfigCallConfig;", "", "Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;", "callType", "<init>", "(Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;)V", "component1", "()Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;", "copy", "(Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;)Lcom/ybsdk/rconfig/configs/RemoteConfigCallConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;", "getCallType", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RemoteConfigCallConfig {

    @Json(name = "call_type")
    private final RemoteConfigCallType callType;

    public RemoteConfigCallConfig(RemoteConfigCallType remoteConfigCallType) {
        this.callType = remoteConfigCallType;
    }

    public static /* synthetic */ RemoteConfigCallConfig copy$default(RemoteConfigCallConfig remoteConfigCallConfig, RemoteConfigCallType remoteConfigCallType, int i, Object obj) {
        if ((i & 1) != 0) {
            remoteConfigCallType = remoteConfigCallConfig.callType;
        }
        return remoteConfigCallConfig.copy(remoteConfigCallType);
    }

    /* renamed from: component1, reason: from getter */
    public final RemoteConfigCallType getCallType() {
        return this.callType;
    }

    public final RemoteConfigCallConfig copy(RemoteConfigCallType callType) {
        return new RemoteConfigCallConfig(callType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RemoteConfigCallConfig) && this.callType == ((RemoteConfigCallConfig) other).callType;
    }

    public final RemoteConfigCallType getCallType() {
        return this.callType;
    }

    public int hashCode() {
        return this.callType.hashCode();
    }

    public String toString() {
        return "RemoteConfigCallConfig(callType=" + this.callType + Extension.C_BRAKE;
    }
}
