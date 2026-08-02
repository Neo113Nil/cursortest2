package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/CreateInviteLinkTokenResponse;", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "", "validUntil", "", "<init>", "(Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getValidUntil", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CreateInviteLinkTokenResponse {
    private final String token;
    private final long validUntil;

    public CreateInviteLinkTokenResponse(@Json(name = "token") String str, @Json(name = "valid_until") long j) {
        this.token = str;
        this.validUntil = j;
    }

    public static /* synthetic */ CreateInviteLinkTokenResponse copy$default(CreateInviteLinkTokenResponse createInviteLinkTokenResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createInviteLinkTokenResponse.token;
        }
        if ((i & 2) != 0) {
            j = createInviteLinkTokenResponse.validUntil;
        }
        return createInviteLinkTokenResponse.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValidUntil() {
        return this.validUntil;
    }

    public final CreateInviteLinkTokenResponse copy(@Json(name = "token") String token, @Json(name = "valid_until") long validUntil) {
        return new CreateInviteLinkTokenResponse(token, validUntil);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateInviteLinkTokenResponse)) {
            return false;
        }
        CreateInviteLinkTokenResponse createInviteLinkTokenResponse = (CreateInviteLinkTokenResponse) other;
        return jl40.l(this.token, createInviteLinkTokenResponse.token) && this.validUntil == createInviteLinkTokenResponse.validUntil;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        return Long.hashCode(this.validUntil) + (this.token.hashCode() * 31);
    }

    public String toString() {
        StringBuilder l = x4e.l("CreateInviteLinkTokenResponse(token=", this.token, ", validUntil=", this.validUntil);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
