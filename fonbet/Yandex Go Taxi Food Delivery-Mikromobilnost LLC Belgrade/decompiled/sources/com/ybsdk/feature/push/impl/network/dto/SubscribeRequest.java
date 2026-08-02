package com.ybsdk.feature.push.impl.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/push/impl/network/dto/SubscribeRequest;", "", "pushToken", "", "uuid", "deviceId", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "getUuid", "getDeviceId", "getPlatform", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-push-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscribeRequest {
    private final String deviceId;
    private final String platform;
    private final String pushToken;
    private final String uuid;

    public SubscribeRequest(@Json(name = "push_token") String str, @Json(name = "uuid") String str2, @Json(name = "device_id") String str3, @Json(name = "push_platform") String str4) {
        this.pushToken = str;
        this.uuid = str2;
        this.deviceId = str3;
        this.platform = str4;
    }

    public static /* synthetic */ SubscribeRequest copy$default(SubscribeRequest subscribeRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscribeRequest.pushToken;
        }
        if ((i & 2) != 0) {
            str2 = subscribeRequest.uuid;
        }
        if ((i & 4) != 0) {
            str3 = subscribeRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = subscribeRequest.platform;
        }
        return subscribeRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPushToken() {
        return this.pushToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final SubscribeRequest copy(@Json(name = "push_token") String pushToken, @Json(name = "uuid") String uuid, @Json(name = "device_id") String deviceId, @Json(name = "push_platform") String platform) {
        return new SubscribeRequest(pushToken, uuid, deviceId, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeRequest)) {
            return false;
        }
        SubscribeRequest subscribeRequest = (SubscribeRequest) other;
        return jl40.l(this.pushToken, subscribeRequest.pushToken) && jl40.l(this.uuid, subscribeRequest.uuid) && jl40.l(this.deviceId, subscribeRequest.deviceId) && jl40.l(this.platform, subscribeRequest.platform);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int b = unr0.b(this.pushToken.hashCode() * 31, 31, this.uuid);
        String str = this.deviceId;
        return this.platform.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.pushToken;
        String str2 = this.uuid;
        return g8e.r(b64.v("SubscribeRequest(pushToken=", str, ", uuid=", str2, ", deviceId="), this.deviceId, ", platform=", this.platform, Extension.C_BRAKE);
    }
}
