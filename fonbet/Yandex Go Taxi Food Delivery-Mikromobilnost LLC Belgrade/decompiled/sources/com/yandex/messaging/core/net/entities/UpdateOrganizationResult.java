package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;", "", "Success", "BaseError", "UserError", "OrganizationMismatchError", "NetworkError", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$BaseError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$NetworkError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$Success;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UpdateOrganizationResult {

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$BaseError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class BaseError implements UpdateOrganizationResult {
        public static final int UNPROCESSABLE_ENTITY = 422;
        private final String code;

        public BaseError(@Json(name = "code") String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$NetworkError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkError implements UpdateOrganizationResult {
        public final int a;

        public NetworkError(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && this.a == ((NetworkError) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return oyr.j(this.a, "NetworkError(httpCode=", Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$OrganizationMismatchError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$BaseError;", com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE, "", "organization", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getErrorCode", "()Ljava/lang/String;", "getOrganization", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$OrganizationMismatchError;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrganizationMismatchError extends BaseError {
        public static final String ORGANIZATIONS_JSON_CODE = "main_organization_mismatch";
        private final String errorCode;
        private final Long organization;

        public OrganizationMismatchError(@Json(name = "code") String str, @Json(name = "main_organization") Long l) {
            super(str);
            this.errorCode = str;
            this.organization = l;
        }

        public static /* synthetic */ OrganizationMismatchError copy$default(OrganizationMismatchError organizationMismatchError, String str, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = organizationMismatchError.errorCode;
            }
            if ((i & 2) != 0) {
                l = organizationMismatchError.organization;
            }
            return organizationMismatchError.copy(str, l);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getOrganization() {
            return this.organization;
        }

        public final OrganizationMismatchError copy(@Json(name = "code") String errorCode, @Json(name = "main_organization") Long organization) {
            return new OrganizationMismatchError(errorCode, organization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrganizationMismatchError)) {
                return false;
            }
            OrganizationMismatchError organizationMismatchError = (OrganizationMismatchError) other;
            return jl40.l(this.errorCode, organizationMismatchError.errorCode) && jl40.l(this.organization, organizationMismatchError.organization);
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Long getOrganization() {
            return this.organization;
        }

        public int hashCode() {
            int hashCode = this.errorCode.hashCode() * 31;
            Long l = this.organization;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "OrganizationMismatchError(errorCode=" + this.errorCode + ", organization=" + this.organization + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$Success;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;", "chat", "Lcom/yandex/messaging/core/net/entities/ChatData;", "<init>", "(Lcom/yandex/messaging/core/net/entities/ChatData;)V", "getChat", "()Lcom/yandex/messaging/core/net/entities/ChatData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements UpdateOrganizationResult {
        private final ChatData chat;

        public Success(@Json(name = "chat") ChatData chatData) {
            this.chat = chatData;
        }

        public static /* synthetic */ Success copy$default(Success success, ChatData chatData, int i, Object obj) {
            if ((i & 1) != 0) {
                chatData = success.chat;
            }
            return success.copy(chatData);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatData getChat() {
            return this.chat;
        }

        public final Success copy(@Json(name = "chat") ChatData chat) {
            return new Success(chat);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && jl40.l(this.chat, ((Success) other).chat);
        }

        public final ChatData getChat() {
            return this.chat;
        }

        public int hashCode() {
            return this.chat.hashCode();
        }

        public String toString() {
            return "Success(chat=" + this.chat + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$UserError;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$BaseError;", com.google.android.gms.fido.u2f.api.common.ErrorResponseData.JSON_ERROR_CODE, "", "userCount", "", CSPDirectoryConstants.SUBDIRECTORY_USERS, "", "Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;", "<init>", "(Ljava/lang/String;I[Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;)V", "getErrorCode", "()Ljava/lang/String;", "getUserCount", "()I", "getUsers", "()[Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;", "[Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;I[Lcom/yandex/messaging/core/net/entities/OutOrganizationUser;)Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult$UserError;", "equals", "", "other", "", "hashCode", "toString", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserError extends BaseError {
        public static final String USERS_JSON_CODE = "user_not_in_organization";
        private final String errorCode;
        private final int userCount;
        private final OutOrganizationUser[] users;

        public UserError(@Json(name = "code") String str, @Json(name = "user_count") int i, @Json(name = "users") OutOrganizationUser[] outOrganizationUserArr) {
            super(str);
            this.errorCode = str;
            this.userCount = i;
            this.users = outOrganizationUserArr;
        }

        public static /* synthetic */ UserError copy$default(UserError userError, String str, int i, OutOrganizationUser[] outOrganizationUserArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = userError.errorCode;
            }
            if ((i2 & 2) != 0) {
                i = userError.userCount;
            }
            if ((i2 & 4) != 0) {
                outOrganizationUserArr = userError.users;
            }
            return userError.copy(str, i, outOrganizationUserArr);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final int getUserCount() {
            return this.userCount;
        }

        /* renamed from: component3, reason: from getter */
        public final OutOrganizationUser[] getUsers() {
            return this.users;
        }

        public final UserError copy(@Json(name = "code") String errorCode, @Json(name = "user_count") int userCount, @Json(name = "users") OutOrganizationUser[] users) {
            return new UserError(errorCode, userCount, users);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserError)) {
                return false;
            }
            UserError userError = (UserError) other;
            return jl40.l(this.errorCode, userError.errorCode) && this.userCount == userError.userCount && jl40.l(this.users, userError.users);
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final int getUserCount() {
            return this.userCount;
        }

        public final OutOrganizationUser[] getUsers() {
            return this.users;
        }

        public int hashCode() {
            return Arrays.hashCode(this.users) + oyr.b(this.userCount, this.errorCode.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.errorCode;
            int i = this.userCount;
            return oyr.t(b64.u(i, "UserError(errorCode=", str, ", userCount=", ", users="), Arrays.toString(this.users), Extension.C_BRAKE);
        }
    }
}
