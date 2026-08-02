package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ClientInfo;", "", "target", "", "userAgent", "locale", "serviceName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTarget", "()Ljava/lang/String;", "getUserAgent", "getLocale", "getServiceName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ClientInfo {

    @xuf0(tag = 3)
    private final String locale;

    @xuf0(tag = 4)
    private final String serviceName;

    @xuf0(tag = 1)
    private final String target;

    @xuf0(tag = 2)
    private final String userAgent;

    public /* synthetic */ ClientInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ ClientInfo copy$default(ClientInfo clientInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientInfo.target;
        }
        if ((i & 2) != 0) {
            str2 = clientInfo.userAgent;
        }
        if ((i & 4) != 0) {
            str3 = clientInfo.locale;
        }
        if ((i & 8) != 0) {
            str4 = clientInfo.serviceName;
        }
        return clientInfo.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component4, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    public final ClientInfo copy(@Json(name = "Target") String target, @Json(name = "UserAgent") String userAgent, @Json(name = "Locale") String locale, @Json(name = "ServiceName") String serviceName) {
        return new ClientInfo(target, userAgent, locale, serviceName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) other;
        return jl40.l(this.target, clientInfo.target) && jl40.l(this.userAgent, clientInfo.userAgent) && jl40.l(this.locale, clientInfo.locale) && jl40.l(this.serviceName, clientInfo.serviceName);
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.target;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userAgent;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locale;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceName;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.target;
        String str2 = this.userAgent;
        return g8e.r(b64.v("ClientInfo(target=", str, ", userAgent=", str2, ", locale="), this.locale, ", serviceName=", this.serviceName, Extension.C_BRAKE);
    }

    public ClientInfo(@Json(name = "Target") String str, @Json(name = "UserAgent") String str2, @Json(name = "Locale") String str3, @Json(name = "ServiceName") String str4) {
        this.target = str;
        this.userAgent = str2;
        this.locale = str3;
        this.serviceName = str4;
    }

    public ClientInfo() {
        this(null, null, null, null, 15, null);
    }
}
