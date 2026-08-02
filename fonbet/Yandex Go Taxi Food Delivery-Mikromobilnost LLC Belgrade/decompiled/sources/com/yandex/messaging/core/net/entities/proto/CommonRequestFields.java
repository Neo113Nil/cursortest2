package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.gsq0;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;", "", "isRetry", "", "origin", "", "<init>", "(ZI)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CommonRequestFields {

    @Json(name = "IsRetry")
    @xuf0(tag = 1)
    public boolean isRetry;

    @Json(name = "Origin")
    @xuf0(tag = 3)
    public int origin;

    public CommonRequestFields(boolean z, int i) {
        this.isRetry = z;
        this.origin = i;
    }

    public static /* synthetic */ CommonRequestFields copy$default(CommonRequestFields commonRequestFields, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = commonRequestFields.isRetry;
        }
        if ((i2 & 2) != 0) {
            i = commonRequestFields.origin;
        }
        return commonRequestFields.copy(z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRetry() {
        return this.isRetry;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOrigin() {
        return this.origin;
    }

    public final CommonRequestFields copy(boolean isRetry, int origin) {
        return new CommonRequestFields(isRetry, origin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestFields)) {
            return false;
        }
        CommonRequestFields commonRequestFields = (CommonRequestFields) other;
        return this.isRetry == commonRequestFields.isRetry && this.origin == commonRequestFields.origin;
    }

    public int hashCode() {
        return Integer.hashCode(this.origin) + (Boolean.hashCode(this.isRetry) * 31);
    }

    public String toString() {
        return "CommonRequestFields(isRetry=" + this.isRetry + ", origin=" + this.origin + Extension.C_BRAKE;
    }
}
