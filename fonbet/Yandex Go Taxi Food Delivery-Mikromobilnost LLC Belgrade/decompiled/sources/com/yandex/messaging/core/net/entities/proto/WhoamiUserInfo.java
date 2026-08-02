package com.yandex.messaging.core.net.entities.proto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.message.AccountTypeProto;
import com.yandex.messaging.core.net.entities.proto.message.RobotInfo;
import defpackage.b64;
import defpackage.cex;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.xuf0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\b\u0007\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\b\u0003\u0010\u0016\u001a\u00020\r\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b:\u00104J\u0012\u0010;\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b;\u0010<J¾\u0001\u0010=\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0003\u0010\u0016\u001a\u00020\r2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010'J\u0010\u0010@\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b@\u0010%J\u001a\u0010C\u001a\u00020\r2\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010ER\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010ER\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010FR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010ER$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010/\"\u0004\bI\u0010JR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010KR\"\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010L\u001a\u0004\b\u000f\u00104\"\u0004\bM\u0010NR\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010PR\"\u0010\u0016\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010L\u001a\u0004\bQ\u00104\"\u0004\bR\u0010NR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010S¨\u0006T"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;", "Landroid/os/Parcelable;", "", "avatarId", "displayName", "userId", "phoneId", "", "version", "nickname", "", "registrationStatus", "phone", "", "isRobot", "isOnboarded", "isDisplayRestricted", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "robotInfo", "", "Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "organizations", "needsMigrationOnboarding", "Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;[Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;ZLcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;)V", "Lcom/yandex/messaging/core/net/entities/UserData$EmployeeInfo;", "getEmployeeInfos", "()[Lcom/yandex/messaging/core/net/entities/UserData$EmployeeInfo;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "()Z", "component11", "component12", "()Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "component13", "()[Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "component14", "component15", "()Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;ZZLcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;[Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;ZLcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;)Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "J", "Ljava/lang/Integer;", "getRegistrationStatus", "setRegistrationStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Boolean;", "Z", "setOnboarded", "(Z)V", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "[Lcom/yandex/messaging/core/net/entities/proto/OrganizationProto;", "getNeedsMigrationOnboarding", "setNeedsMigrationOnboarding", "Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WhoamiUserInfo implements Parcelable {
    public static final Parcelable.Creator<WhoamiUserInfo> CREATOR = new Creator();

    @xuf0(tag = 25)
    public AccountTypeProto accountType;

    @xuf0(tag = 1)
    public String avatarId;

    @xuf0(tag = 2)
    public String displayName;

    @xuf0(tag = 14)
    public boolean isDisplayRestricted;

    @xuf0(tag = 13)
    private boolean isOnboarded;

    @xuf0(tag = 11)
    public Boolean isRobot;

    @xuf0(tag = 20)
    private boolean needsMigrationOnboarding;

    @xuf0(tag = 7)
    public String nickname;

    @xuf0(tag = 18)
    public OrganizationProto[] organizations;

    @xuf0(tag = 9)
    public String phone;

    @xuf0(tag = 4)
    public String phoneId;

    @xuf0(tag = 8)
    private Integer registrationStatus;

    @xuf0(tag = 15)
    public RobotInfo robotInfo;

    @cex
    @xuf0(tag = 3)
    public String userId;

    @xuf0(tag = 5)
    public long version;

    public /* synthetic */ WhoamiUserInfo(String str, String str2, String str3, String str4, long j, String str5, Integer num, String str6, Boolean bool, boolean z, boolean z2, RobotInfo robotInfo, OrganizationProto[] organizationProtoArr, boolean z3, AccountTypeProto accountTypeProto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, str6, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? false : z, z2, (i & 2048) != 0 ? null : robotInfo, (i & 4096) != 0 ? null : organizationProtoArr, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? null : accountTypeProto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsOnboarded() {
        return this.isOnboarded;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsDisplayRestricted() {
        return this.isDisplayRestricted;
    }

    /* renamed from: component12, reason: from getter */
    public final RobotInfo getRobotInfo() {
        return this.robotInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final OrganizationProto[] getOrganizations() {
        return this.organizations;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getNeedsMigrationOnboarding() {
        return this.needsMigrationOnboarding;
    }

    /* renamed from: component15, reason: from getter */
    public final AccountTypeProto getAccountType() {
        return this.accountType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getRegistrationStatus() {
        return this.registrationStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsRobot() {
        return this.isRobot;
    }

    public final WhoamiUserInfo copy(@Json(name = "AvatarId") String avatarId, @Json(name = "DisplayName") String displayName, @Json(name = "Guid") String userId, @Json(name = "PhoneId") String phoneId, @Json(name = "Version") long version, @Json(name = "Nickname") String nickname, @Json(name = "RegistrationStatus") Integer registrationStatus, @Json(name = "Phone") String phone, @Json(name = "IsRobot") Boolean isRobot, @Json(name = "IsOnboarded") boolean isOnboarded, @Json(name = "IsDisplayRestricted") boolean isDisplayRestricted, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "OrganizationInfos") OrganizationProto[] organizations, @Json(name = "NeedsMigrationOnboarding") boolean needsMigrationOnboarding, @Json(name = "AccountType") AccountTypeProto accountType) {
        return new WhoamiUserInfo(avatarId, displayName, userId, phoneId, version, nickname, registrationStatus, phone, isRobot, isOnboarded, isDisplayRestricted, robotInfo, organizations, needsMigrationOnboarding, accountType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoamiUserInfo)) {
            return false;
        }
        WhoamiUserInfo whoamiUserInfo = (WhoamiUserInfo) other;
        return jl40.l(this.avatarId, whoamiUserInfo.avatarId) && jl40.l(this.displayName, whoamiUserInfo.displayName) && jl40.l(this.userId, whoamiUserInfo.userId) && jl40.l(this.phoneId, whoamiUserInfo.phoneId) && this.version == whoamiUserInfo.version && jl40.l(this.nickname, whoamiUserInfo.nickname) && jl40.l(this.registrationStatus, whoamiUserInfo.registrationStatus) && jl40.l(this.phone, whoamiUserInfo.phone) && jl40.l(this.isRobot, whoamiUserInfo.isRobot) && this.isOnboarded == whoamiUserInfo.isOnboarded && this.isDisplayRestricted == whoamiUserInfo.isDisplayRestricted && jl40.l(this.robotInfo, whoamiUserInfo.robotInfo) && jl40.l(this.organizations, whoamiUserInfo.organizations) && this.needsMigrationOnboarding == whoamiUserInfo.needsMigrationOnboarding && jl40.l(this.accountType, whoamiUserInfo.accountType);
    }

    public final UserData.EmployeeInfo[] getEmployeeInfos() {
        OrganizationProto[] organizationProtoArr = this.organizations;
        if (organizationProtoArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(organizationProtoArr.length);
        for (OrganizationProto organizationProto : organizationProtoArr) {
            UserData.EmployeeInfo employeeInfo = new UserData.EmployeeInfo();
            employeeInfo.department = null;
            employeeInfo.position = null;
            employeeInfo.organizationName = organizationProto.getOrganizationName();
            employeeInfo.organizationId = organizationProto.getOrganizationId();
            arrayList.add(employeeInfo);
        }
        return (UserData.EmployeeInfo[]) arrayList.toArray(new UserData.EmployeeInfo[0]);
    }

    public final boolean getNeedsMigrationOnboarding() {
        return this.needsMigrationOnboarding;
    }

    public final Integer getRegistrationStatus() {
        return this.registrationStatus;
    }

    public int hashCode() {
        String str = this.avatarId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.userId);
        String str3 = this.phoneId;
        int c = qv10.c((b + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.version);
        String str4 = this.nickname;
        int hashCode2 = (c + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.registrationStatus;
        int b2 = unr0.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.phone);
        Boolean bool = this.isRobot;
        int e = unr0.e(unr0.e((b2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isOnboarded), 31, this.isDisplayRestricted);
        RobotInfo robotInfo = this.robotInfo;
        int hashCode3 = (e + (robotInfo == null ? 0 : robotInfo.hashCode())) * 31;
        OrganizationProto[] organizationProtoArr = this.organizations;
        int e2 = unr0.e((hashCode3 + (organizationProtoArr == null ? 0 : Arrays.hashCode(organizationProtoArr))) * 31, 31, this.needsMigrationOnboarding);
        AccountTypeProto accountTypeProto = this.accountType;
        return e2 + (accountTypeProto != null ? accountTypeProto.hashCode() : 0);
    }

    public final boolean isOnboarded() {
        return this.isOnboarded;
    }

    public final void setNeedsMigrationOnboarding(boolean z) {
        this.needsMigrationOnboarding = z;
    }

    public final void setOnboarded(boolean z) {
        this.isOnboarded = z;
    }

    public final void setRegistrationStatus(Integer num) {
        this.registrationStatus = num;
    }

    public String toString() {
        String str = this.avatarId;
        String str2 = this.displayName;
        String str3 = this.userId;
        String str4 = this.phoneId;
        long j = this.version;
        String str5 = this.nickname;
        Integer num = this.registrationStatus;
        String str6 = this.phone;
        Boolean bool = this.isRobot;
        boolean z = this.isOnboarded;
        boolean z2 = this.isDisplayRestricted;
        RobotInfo robotInfo = this.robotInfo;
        String arrays = Arrays.toString(this.organizations);
        boolean z3 = this.needsMigrationOnboarding;
        AccountTypeProto accountTypeProto = this.accountType;
        StringBuilder v = b64.v("WhoamiUserInfo(avatarId=", str, ", displayName=", str2, ", userId=");
        g8e.D(v, str3, ", phoneId=", str4, ", version=");
        uw51.v(j, ", nickname=", str5, v);
        v.append(", registrationStatus=");
        v.append(num);
        v.append(", phone=");
        v.append(str6);
        v.append(", isRobot=");
        v.append(bool);
        v.append(", isOnboarded=");
        v.append(z);
        v.append(", isDisplayRestricted=");
        v.append(z2);
        v.append(", robotInfo=");
        v.append(robotInfo);
        uw51.x(", organizations=", arrays, ", needsMigrationOnboarding=", v, z3);
        v.append(", accountType=");
        v.append(accountTypeProto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.avatarId);
        dest.writeString(this.displayName);
        dest.writeString(this.userId);
        dest.writeString(this.phoneId);
        dest.writeLong(this.version);
        dest.writeString(this.nickname);
        Integer num = this.registrationStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        dest.writeString(this.phone);
        Boolean bool = this.isRobot;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeInt(this.isOnboarded ? 1 : 0);
        dest.writeInt(this.isDisplayRestricted ? 1 : 0);
        RobotInfo robotInfo = this.robotInfo;
        if (robotInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            robotInfo.writeToParcel(dest, flags);
        }
        OrganizationProto[] organizationProtoArr = this.organizations;
        if (organizationProtoArr == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            int length = organizationProtoArr.length;
            dest.writeInt(length);
            for (int i = 0; i != length; i++) {
                organizationProtoArr[i].writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.needsMigrationOnboarding ? 1 : 0);
        AccountTypeProto accountTypeProto = this.accountType;
        if (accountTypeProto == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountTypeProto.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WhoamiUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final WhoamiUserInfo createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            Boolean valueOf2;
            Object obj;
            Boolean bool2;
            boolean z;
            String str;
            OrganizationProto[] organizationProtoArr;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            long readLong = parcel.readLong();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString6 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                valueOf2 = bool;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                obj = bool;
                bool2 = valueOf2;
                z = true;
            } else {
                obj = bool;
                bool2 = valueOf2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            RobotInfo robotInfo = (RobotInfo) (parcel.readInt() == 0 ? obj : RobotInfo.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                str = readString;
                organizationProtoArr = obj;
            } else {
                int readInt = parcel.readInt();
                OrganizationProto[] organizationProtoArr2 = new OrganizationProto[readInt];
                str = readString;
                int i = 0;
                while (i != readInt) {
                    int i2 = i;
                    organizationProtoArr2[i2] = OrganizationProto.CREATOR.createFromParcel(parcel);
                    i = i2 + 1;
                }
                organizationProtoArr = organizationProtoArr2;
            }
            return new WhoamiUserInfo(str, readString2, readString3, readString4, readLong, readString5, valueOf, readString6, bool2, z, z2, robotInfo, organizationProtoArr, parcel.readInt() != 0, parcel.readInt() == 0 ? null : AccountTypeProto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhoamiUserInfo[] newArray(int i) {
            return new WhoamiUserInfo[i];
        }
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsOnboarded") boolean z, @Json(name = "IsDisplayRestricted") boolean z2) {
        this(str, str2, str3, str4, j, str5, num, str6, bool, z, z2, null, null, false, null, 30720, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsOnboarded") boolean z, @Json(name = "IsDisplayRestricted") boolean z2, @Json(name = "RobotInfo") RobotInfo robotInfo) {
        this(str, str2, str3, str4, j, str5, num, str6, bool, z, z2, robotInfo, null, false, null, 28672, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsOnboarded") boolean z, @Json(name = "IsDisplayRestricted") boolean z2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "OrganizationInfos") OrganizationProto[] organizationProtoArr) {
        this(str, str2, str3, str4, j, str5, num, str6, bool, z, z2, robotInfo, organizationProtoArr, false, null, HProv.ALG_CLASS_DATA_ENCRYPT, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsOnboarded") boolean z, @Json(name = "IsDisplayRestricted") boolean z2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "OrganizationInfos") OrganizationProto[] organizationProtoArr, @Json(name = "NeedsMigrationOnboarding") boolean z3) {
        this(str, str2, str3, str4, j, str5, num, str6, bool, z, z2, robotInfo, organizationProtoArr, z3, null, 16384, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, str4, j, str5, num, str6, null, false, z, null, null, false, null, 31488, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "Phone") String str6, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, str4, j, str5, null, str6, null, false, z, null, null, false, null, 31552, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Phone") String str5, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, str4, j, null, null, str5, null, false, z, null, null, false, null, 31584, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Phone") String str5, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, str4, 0L, null, null, str5, null, false, z, null, null, false, null, 31600, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "Phone") String str4, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, null, 0L, null, null, str4, null, false, z, null, null, false, null, 31608, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "Guid") String str2, @Json(name = "Phone") String str3, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, null, str2, null, 0L, null, null, str3, null, false, z, null, null, false, null, 31610, null);
    }

    public WhoamiUserInfo(@Json(name = "Guid") String str, @Json(name = "Phone") String str2, @Json(name = "IsDisplayRestricted") boolean z) {
        this(null, null, str, null, 0L, null, null, str2, null, false, z, null, null, false, null, 31611, null);
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsOnboarded") boolean z, @Json(name = "IsDisplayRestricted") boolean z2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "OrganizationInfos") OrganizationProto[] organizationProtoArr, @Json(name = "NeedsMigrationOnboarding") boolean z3, @Json(name = "AccountType") AccountTypeProto accountTypeProto) {
        this.avatarId = str;
        this.displayName = str2;
        this.userId = str3;
        this.phoneId = str4;
        this.version = j;
        this.nickname = str5;
        this.registrationStatus = num;
        this.phone = str6;
        this.isRobot = bool;
        this.isOnboarded = z;
        this.isDisplayRestricted = z2;
        this.robotInfo = robotInfo;
        this.organizations = organizationProtoArr;
        this.needsMigrationOnboarding = z3;
        this.accountType = accountTypeProto;
    }

    public WhoamiUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "RegistrationStatus") Integer num, @Json(name = "Phone") String str6, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") boolean z) {
        this(str, str2, str3, str4, j, str5, num, str6, bool, false, z, null, null, false, null, 31232, null);
    }
}
