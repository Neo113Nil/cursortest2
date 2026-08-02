package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.cex;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\b\u0007\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0003\u0010\u0012\u001a\u00020\n\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J \u0001\u00103\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b6\u0010\u001fJ\u001a\u00109\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010<R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010;R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010=R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0016\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010@R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010A\u001a\u0004\bB\u00102\"\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "Landroid/os/Parcelable;", "", "avatarId", "displayName", "userId", "phoneId", "", "version", "nickname", "", "isRobot", "isDisplayRestricted", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "robotInfo", "", "Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "employeeInfos", "deleted", "Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "localizationDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;[Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;ZLcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "component10", "()[Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "component11", "()Z", "component12", "()Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;[Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;ZLcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;)Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "J", "Ljava/lang/Boolean;", "Lcom/yandex/messaging/core/net/entities/proto/message/RobotInfo;", "[Lcom/yandex/messaging/core/net/entities/proto/message/EmployeeInfo;", "Z", "Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "getLocalizationDescriptor", "setLocalizationDescriptor", "(Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;)V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ReducedUserInfo implements Parcelable {
    public static final Parcelable.Creator<ReducedUserInfo> CREATOR = new Creator();

    @xuf0(tag = 1)
    public String avatarId;

    @xuf0(tag = 22)
    public boolean deleted;

    @xuf0(tag = 2)
    public String displayName;

    @xuf0(tag = 21)
    public EmployeeInfo[] employeeInfos;

    @xuf0(tag = 14)
    public Boolean isDisplayRestricted;

    @xuf0(tag = 11)
    public Boolean isRobot;

    @xuf0(tag = 23)
    private LocalizationDescriptor localizationDescriptor;

    @xuf0(tag = 7)
    public String nickname;

    @xuf0(tag = 4)
    public String phoneId;

    @xuf0(tag = 15)
    public RobotInfo robotInfo;

    @cex
    @xuf0(tag = 3)
    public String userId;

    @xuf0(tag = 5)
    public long version;

    public /* synthetic */ ReducedUserInfo(String str, String str2, String str3, String str4, long j, String str5, Boolean bool, Boolean bool2, RobotInfo robotInfo, EmployeeInfo[] employeeInfoArr, boolean z, LocalizationDescriptor localizationDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : robotInfo, (i & 512) != 0 ? null : employeeInfoArr, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : localizationDescriptor);
    }

    public static /* synthetic */ ReducedUserInfo copy$default(ReducedUserInfo reducedUserInfo, String str, String str2, String str3, String str4, long j, String str5, Boolean bool, Boolean bool2, RobotInfo robotInfo, EmployeeInfo[] employeeInfoArr, boolean z, LocalizationDescriptor localizationDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reducedUserInfo.avatarId;
        }
        return reducedUserInfo.copy(str, (i & 2) != 0 ? reducedUserInfo.displayName : str2, (i & 4) != 0 ? reducedUserInfo.userId : str3, (i & 8) != 0 ? reducedUserInfo.phoneId : str4, (i & 16) != 0 ? reducedUserInfo.version : j, (i & 32) != 0 ? reducedUserInfo.nickname : str5, (i & 64) != 0 ? reducedUserInfo.isRobot : bool, (i & 128) != 0 ? reducedUserInfo.isDisplayRestricted : bool2, (i & 256) != 0 ? reducedUserInfo.robotInfo : robotInfo, (i & 512) != 0 ? reducedUserInfo.employeeInfos : employeeInfoArr, (i & 1024) != 0 ? reducedUserInfo.deleted : z, (i & 2048) != 0 ? reducedUserInfo.localizationDescriptor : localizationDescriptor);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component10, reason: from getter */
    public final EmployeeInfo[] getEmployeeInfos() {
        return this.employeeInfos;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* renamed from: component12, reason: from getter */
    public final LocalizationDescriptor getLocalizationDescriptor() {
        return this.localizationDescriptor;
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
    public final Boolean getIsRobot() {
        return this.isRobot;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsDisplayRestricted() {
        return this.isDisplayRestricted;
    }

    /* renamed from: component9, reason: from getter */
    public final RobotInfo getRobotInfo() {
        return this.robotInfo;
    }

    public final ReducedUserInfo copy(@Json(name = "AvatarId") String avatarId, @Json(name = "DisplayName") String displayName, @Json(name = "Guid") String userId, @Json(name = "PhoneId") String phoneId, @Json(name = "Version") long version, @Json(name = "Nickname") String nickname, @Json(name = "IsRobot") Boolean isRobot, @Json(name = "IsDisplayRestricted") Boolean isDisplayRestricted, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "EmployeeInfos") EmployeeInfo[] employeeInfos, @Json(name = "AccountDeleted") boolean deleted, @Json(name = "LocalizationDescriptor") LocalizationDescriptor localizationDescriptor) {
        return new ReducedUserInfo(avatarId, displayName, userId, phoneId, version, nickname, isRobot, isDisplayRestricted, robotInfo, employeeInfos, deleted, localizationDescriptor);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReducedUserInfo)) {
            return false;
        }
        ReducedUserInfo reducedUserInfo = (ReducedUserInfo) other;
        return jl40.l(this.avatarId, reducedUserInfo.avatarId) && jl40.l(this.displayName, reducedUserInfo.displayName) && jl40.l(this.userId, reducedUserInfo.userId) && jl40.l(this.phoneId, reducedUserInfo.phoneId) && this.version == reducedUserInfo.version && jl40.l(this.nickname, reducedUserInfo.nickname) && jl40.l(this.isRobot, reducedUserInfo.isRobot) && jl40.l(this.isDisplayRestricted, reducedUserInfo.isDisplayRestricted) && jl40.l(this.robotInfo, reducedUserInfo.robotInfo) && jl40.l(this.employeeInfos, reducedUserInfo.employeeInfos) && this.deleted == reducedUserInfo.deleted && jl40.l(this.localizationDescriptor, reducedUserInfo.localizationDescriptor);
    }

    public final LocalizationDescriptor getLocalizationDescriptor() {
        return this.localizationDescriptor;
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
        Boolean bool = this.isRobot;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDisplayRestricted;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RobotInfo robotInfo = this.robotInfo;
        int hashCode5 = (hashCode4 + (robotInfo == null ? 0 : robotInfo.hashCode())) * 31;
        EmployeeInfo[] employeeInfoArr = this.employeeInfos;
        int e = unr0.e((hashCode5 + (employeeInfoArr == null ? 0 : Arrays.hashCode(employeeInfoArr))) * 31, 31, this.deleted);
        LocalizationDescriptor localizationDescriptor = this.localizationDescriptor;
        return e + (localizationDescriptor != null ? localizationDescriptor.hashCode() : 0);
    }

    public final void setLocalizationDescriptor(LocalizationDescriptor localizationDescriptor) {
        this.localizationDescriptor = localizationDescriptor;
    }

    public String toString() {
        String str = this.avatarId;
        String str2 = this.displayName;
        String str3 = this.userId;
        String str4 = this.phoneId;
        long j = this.version;
        String str5 = this.nickname;
        Boolean bool = this.isRobot;
        Boolean bool2 = this.isDisplayRestricted;
        RobotInfo robotInfo = this.robotInfo;
        String arrays = Arrays.toString(this.employeeInfos);
        boolean z = this.deleted;
        LocalizationDescriptor localizationDescriptor = this.localizationDescriptor;
        StringBuilder v = b64.v("ReducedUserInfo(avatarId=", str, ", displayName=", str2, ", userId=");
        g8e.D(v, str3, ", phoneId=", str4, ", version=");
        uw51.v(j, ", nickname=", str5, v);
        v.append(", isRobot=");
        v.append(bool);
        v.append(", isDisplayRestricted=");
        v.append(bool2);
        v.append(", robotInfo=");
        v.append(robotInfo);
        v.append(", employeeInfos=");
        v.append(arrays);
        v.append(", deleted=");
        v.append(z);
        v.append(", localizationDescriptor=");
        v.append(localizationDescriptor);
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
        Boolean bool = this.isRobot;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        Boolean bool2 = this.isDisplayRestricted;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool2);
        }
        RobotInfo robotInfo = this.robotInfo;
        if (robotInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            robotInfo.writeToParcel(dest, flags);
        }
        EmployeeInfo[] employeeInfoArr = this.employeeInfos;
        if (employeeInfoArr == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            int length = employeeInfoArr.length;
            dest.writeInt(length);
            for (int i = 0; i != length; i++) {
                employeeInfoArr[i].writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.deleted ? 1 : 0);
        LocalizationDescriptor localizationDescriptor = this.localizationDescriptor;
        if (localizationDescriptor == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localizationDescriptor.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReducedUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReducedUserInfo createFromParcel(Parcel parcel) {
            EmployeeInfo[] employeeInfoArr;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            long readLong = parcel.readLong();
            String readString5 = parcel.readString();
            Boolean valueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            RobotInfo createFromParcel = parcel.readInt() == 0 ? null : RobotInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                employeeInfoArr = null;
            } else {
                int readInt = parcel.readInt();
                employeeInfoArr = new EmployeeInfo[readInt];
                for (int i = 0; i != readInt; i++) {
                    employeeInfoArr[i] = EmployeeInfo.CREATOR.createFromParcel(parcel);
                }
            }
            return new ReducedUserInfo(readString, readString2, readString3, readString4, readLong, readString5, valueOf, valueOf2, createFromParcel, employeeInfoArr, parcel.readInt() != 0, parcel.readInt() != 0 ? LocalizationDescriptor.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReducedUserInfo[] newArray(int i) {
            return new ReducedUserInfo[i];
        }
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "Guid") String str2) {
        this(str, null, str2, null, 0L, null, null, null, null, null, false, null, 4090, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3) {
        this(str, str2, str3, null, 0L, null, null, null, null, null, false, null, 4088, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4) {
        this(str, str2, str3, str4, 0L, null, null, null, null, null, false, null, 4080, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j) {
        this(str, str2, str3, str4, j, null, null, null, null, null, false, null, 4064, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5) {
        this(str, str2, str3, str4, j, str5, null, null, null, null, false, null, 4032, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool) {
        this(str, str2, str3, str4, j, str5, bool, null, null, null, false, null, 3968, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") Boolean bool2) {
        this(str, str2, str3, str4, j, str5, bool, bool2, null, null, false, null, 3840, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") Boolean bool2, @Json(name = "RobotInfo") RobotInfo robotInfo) {
        this(str, str2, str3, str4, j, str5, bool, bool2, robotInfo, null, false, null, HProv.ALG_TYPE_GR3410, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") Boolean bool2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "EmployeeInfos") EmployeeInfo[] employeeInfoArr) {
        this(str, str2, str3, str4, j, str5, bool, bool2, robotInfo, employeeInfoArr, false, null, HProv.ALG_TYPE_SECURECHANNEL, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") Boolean bool2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "EmployeeInfos") EmployeeInfo[] employeeInfoArr, @Json(name = "AccountDeleted") boolean z) {
        this(str, str2, str3, str4, j, str5, bool, bool2, robotInfo, employeeInfoArr, z, null, 2048, null);
    }

    public ReducedUserInfo(@Json(name = "AvatarId") String str, @Json(name = "DisplayName") String str2, @Json(name = "Guid") String str3, @Json(name = "PhoneId") String str4, @Json(name = "Version") long j, @Json(name = "Nickname") String str5, @Json(name = "IsRobot") Boolean bool, @Json(name = "IsDisplayRestricted") Boolean bool2, @Json(name = "RobotInfo") RobotInfo robotInfo, @Json(name = "EmployeeInfos") EmployeeInfo[] employeeInfoArr, @Json(name = "AccountDeleted") boolean z, @Json(name = "LocalizationDescriptor") LocalizationDescriptor localizationDescriptor) {
        this.avatarId = str;
        this.displayName = str2;
        this.userId = str3;
        this.phoneId = str4;
        this.version = j;
        this.nickname = str5;
        this.isRobot = bool;
        this.isDisplayRestricted = bool2;
        this.robotInfo = robotInfo;
        this.employeeInfos = employeeInfoArr;
        this.deleted = z;
        this.localizationDescriptor = localizationDescriptor;
    }

    public ReducedUserInfo(@Json(name = "Guid") String str) {
        this(null, null, str, null, 0L, null, null, null, null, null, false, null, 4091, null);
    }
}
