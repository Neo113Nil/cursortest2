package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/WhoamiResponse;", "", "userInfo", "Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;", ACSPConstants.STATUS, "", "errorInfo", "Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "currentTime", "", "<init>", "(Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;ILcom/yandex/messaging/core/net/entities/proto/ErrorInfo;J)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WhoamiResponse {

    @xuf0(tag = 5)
    public long currentTime;

    @xuf0(tag = 3)
    public ErrorInfo errorInfo;

    @xuf0(tag = 2)
    private int status;

    @xuf0(tag = 1)
    public WhoamiUserInfo userInfo;

    public /* synthetic */ WhoamiResponse(WhoamiUserInfo whoamiUserInfo, int i, ErrorInfo errorInfo, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : whoamiUserInfo, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : errorInfo, (i2 & 8) != 0 ? 0L : j);
    }

    public static /* synthetic */ WhoamiResponse copy$default(WhoamiResponse whoamiResponse, WhoamiUserInfo whoamiUserInfo, int i, ErrorInfo errorInfo, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            whoamiUserInfo = whoamiResponse.userInfo;
        }
        if ((i2 & 2) != 0) {
            i = whoamiResponse.status;
        }
        if ((i2 & 4) != 0) {
            errorInfo = whoamiResponse.errorInfo;
        }
        if ((i2 & 8) != 0) {
            j = whoamiResponse.currentTime;
        }
        ErrorInfo errorInfo2 = errorInfo;
        return whoamiResponse.copy(whoamiUserInfo, i, errorInfo2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final WhoamiUserInfo getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final WhoamiResponse copy(@Json(name = "UserInfo") WhoamiUserInfo userInfo, @Json(name = "Status") int status, @Json(name = "ErrorInfo") ErrorInfo errorInfo, @Json(name = "CurrentTime") long currentTime) {
        return new WhoamiResponse(userInfo, status, errorInfo, currentTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoamiResponse)) {
            return false;
        }
        WhoamiResponse whoamiResponse = (WhoamiResponse) other;
        return jl40.l(this.userInfo, whoamiResponse.userInfo) && this.status == whoamiResponse.status && jl40.l(this.errorInfo, whoamiResponse.errorInfo) && this.currentTime == whoamiResponse.currentTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        WhoamiUserInfo whoamiUserInfo = this.userInfo;
        int b = oyr.b(this.status, (whoamiUserInfo == null ? 0 : whoamiUserInfo.hashCode()) * 31, 31);
        ErrorInfo errorInfo = this.errorInfo;
        return Long.hashCode(this.currentTime) + ((b + (errorInfo != null ? errorInfo.hashCode() : 0)) * 31);
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        return "WhoamiResponse(userInfo=" + this.userInfo + ", status=" + this.status + ", errorInfo=" + this.errorInfo + ", currentTime=" + this.currentTime + Extension.C_BRAKE;
    }

    public WhoamiResponse(@Json(name = "UserInfo") WhoamiUserInfo whoamiUserInfo, @Json(name = "Status") int i, @Json(name = "ErrorInfo") ErrorInfo errorInfo, @Json(name = "CurrentTime") long j) {
        this.userInfo = whoamiUserInfo;
        this.status = i;
        this.errorInfo = errorInfo;
        this.currentTime = j;
    }

    public WhoamiResponse() {
        this(null, 0, null, 0L, 15, null);
    }
}
