package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Ju\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0012¨\u0006."}, d2 = {"Lcom/yandex/messaging/core/net/entities/ContactData;", "", "deleted", "", "contactName", "", "avatarId", "displayName", "userId", "phoneId", "version", "", "accountDeleted", "isRobot", "isDisplayRestricted", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZZ)V", "getDeleted", "()Z", "getContactName", "()Ljava/lang/String;", "getAvatarId", "getDisplayName", "getUserId", "getPhoneId", "getVersion", "()J", "getAccountDeleted", "toReducedUserInfo", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ContactData {
    private final boolean accountDeleted;
    private final String avatarId;
    private final String contactName;
    private final boolean deleted;
    private final String displayName;
    private final boolean isDisplayRestricted;
    private final boolean isRobot;
    private final String phoneId;
    private final String userId;
    private final long version;

    public /* synthetic */ ContactData(boolean z, String str, String str2, String str3, String str4, String str5, long j, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4);
    }

    public static /* synthetic */ ContactData copy$default(ContactData contactData, boolean z, String str, String str2, String str3, String str4, String str5, long j, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contactData.deleted;
        }
        if ((i & 2) != 0) {
            str = contactData.contactName;
        }
        if ((i & 4) != 0) {
            str2 = contactData.avatarId;
        }
        if ((i & 8) != 0) {
            str3 = contactData.displayName;
        }
        if ((i & 16) != 0) {
            str4 = contactData.userId;
        }
        if ((i & 32) != 0) {
            str5 = contactData.phoneId;
        }
        if ((i & 64) != 0) {
            j = contactData.version;
        }
        if ((i & 128) != 0) {
            z2 = contactData.accountDeleted;
        }
        if ((i & 256) != 0) {
            z3 = contactData.isRobot;
        }
        if ((i & 512) != 0) {
            z4 = contactData.isDisplayRestricted;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        long j2 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        return contactData.copy(z, str, str8, str9, str6, str7, j2, z6, z3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDisplayRestricted() {
        return this.isDisplayRestricted;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContactName() {
        return this.contactName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getAccountDeleted() {
        return this.accountDeleted;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRobot() {
        return this.isRobot;
    }

    public final ContactData copy(@Json(name = "deleted") boolean deleted, @Json(name = "contact_name") String contactName, @Json(name = "avatar_id") String avatarId, @Json(name = "display_name") String displayName, @Json(name = "guid") String userId, @Json(name = "phone_id") String phoneId, @Json(name = "version") long version, @Json(name = "account_deleted") boolean accountDeleted, @Json(name = "is_robot") boolean isRobot, @Json(name = "is_display_restricted") boolean isDisplayRestricted) {
        return new ContactData(deleted, contactName, avatarId, displayName, userId, phoneId, version, accountDeleted, isRobot, isDisplayRestricted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactData)) {
            return false;
        }
        ContactData contactData = (ContactData) other;
        return this.deleted == contactData.deleted && jl40.l(this.contactName, contactData.contactName) && jl40.l(this.avatarId, contactData.avatarId) && jl40.l(this.displayName, contactData.displayName) && jl40.l(this.userId, contactData.userId) && jl40.l(this.phoneId, contactData.phoneId) && this.version == contactData.version && this.accountDeleted == contactData.accountDeleted && this.isRobot == contactData.isRobot && this.isDisplayRestricted == contactData.isDisplayRestricted;
    }

    public final boolean getAccountDeleted() {
        return this.accountDeleted;
    }

    public final String getAvatarId() {
        return this.avatarId;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPhoneId() {
        return this.phoneId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.deleted) * 31;
        String str = this.contactName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int b = unr0.b((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.userId);
        String str4 = this.phoneId;
        return Boolean.hashCode(this.isDisplayRestricted) + unr0.e(unr0.e(qv10.c((b + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.version), 31, this.accountDeleted), 31, this.isRobot);
    }

    public final boolean isDisplayRestricted() {
        return this.isDisplayRestricted;
    }

    public final boolean isRobot() {
        return this.isRobot;
    }

    public final ReducedUserInfo toReducedUserInfo() {
        return new ReducedUserInfo(this.avatarId, this.displayName, this.userId, this.phoneId, this.version, null, Boolean.FALSE, Boolean.valueOf(this.isDisplayRestricted), null, null, this.accountDeleted, null, 2848, null);
    }

    public String toString() {
        boolean z = this.deleted;
        String str = this.contactName;
        String str2 = this.avatarId;
        String str3 = this.displayName;
        String str4 = this.userId;
        String str5 = this.phoneId;
        long j = this.version;
        boolean z2 = this.accountDeleted;
        boolean z3 = this.isRobot;
        boolean z4 = this.isDisplayRestricted;
        StringBuilder v = ly3.v("ContactData(deleted=", ", contactName=", str, ", avatarId=", z);
        g8e.D(v, str2, ", displayName=", str3, ", userId=");
        g8e.D(v, str4, ", phoneId=", str5, ", version=");
        v.append(j);
        v.append(", accountDeleted=");
        v.append(z2);
        n.z(", isRobot=", ", isDisplayRestricted=", v, z3, z4);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ContactData(@Json(name = "deleted") boolean z, @Json(name = "contact_name") String str, @Json(name = "avatar_id") String str2, @Json(name = "display_name") String str3, @Json(name = "guid") String str4, @Json(name = "phone_id") String str5, @Json(name = "version") long j, @Json(name = "account_deleted") boolean z2, @Json(name = "is_robot") boolean z3, @Json(name = "is_display_restricted") boolean z4) {
        this.deleted = z;
        this.contactName = str;
        this.avatarId = str2;
        this.displayName = str3;
        this.userId = str4;
        this.phoneId = str5;
        this.version = j;
        this.accountDeleted = z2;
        this.isRobot = z3;
        this.isDisplayRestricted = z4;
    }
}
