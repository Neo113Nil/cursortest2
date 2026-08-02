package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DEBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010!JR\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010!J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010%R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010%R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010!¨\u0006F"}, d2 = {"com/yandex/passport/data/network/GetUserInfoRequest$MasterMember", "Landroid/os/Parcelable;", "", "uid", "", "displayLogin", "publicName", "phoneNumber", "avatarUrl", "", "primaryAliasType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpsq0;)V", "Lcom/yandex/passport/data/network/GetUserInfoRequest$MasterMember;", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$passport_data_release", "(Lcom/yandex/passport/data/network/GetUserInfoRequest$MasterMember;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/yandex/passport/data/network/GetUserInfoRequest$MasterMember;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getUid", "getUid$annotations", "()V", "Ljava/lang/String;", "getDisplayLogin", "getDisplayLogin$annotations", "getPublicName", "getPublicName$annotations", "getPhoneNumber", "getPhoneNumber$annotations", "getAvatarUrl", "getAvatarUrl$annotations", CA20Status.STATUS_USER_I, "getPrimaryAliasType", "getPrimaryAliasType$annotations", "Companion", "com/yandex/passport/data/network/t9", "com/yandex/passport/data/network/u9", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetUserInfoRequest$MasterMember implements Parcelable {
    private final String avatarUrl;
    private final String displayLogin;
    private final String phoneNumber;
    private final int primaryAliasType;
    private final String publicName;
    private final long uid;
    public static final u9 Companion = new u9();
    public static final Parcelable.Creator<GetUserInfoRequest$MasterMember> CREATOR = new Creator();

    public /* synthetic */ GetUserInfoRequest$MasterMember(int i, long j, String str, String str2, String str3, String str4, int i2, psq0 psq0Var) {
        if (41 != (i & 41)) {
            qje.Z(i, 41, t9.a.getDescriptor());
            throw null;
        }
        this.uid = j;
        if ((i & 2) == 0) {
            this.displayLogin = null;
        } else {
            this.displayLogin = str;
        }
        if ((i & 4) == 0) {
            this.publicName = null;
        } else {
            this.publicName = str2;
        }
        this.phoneNumber = str3;
        if ((i & 16) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str4;
        }
        this.primaryAliasType = i2;
    }

    public static /* synthetic */ GetUserInfoRequest$MasterMember copy$default(GetUserInfoRequest$MasterMember getUserInfoRequest$MasterMember, long j, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = getUserInfoRequest$MasterMember.uid;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = getUserInfoRequest$MasterMember.displayLogin;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = getUserInfoRequest$MasterMember.publicName;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = getUserInfoRequest$MasterMember.phoneNumber;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = getUserInfoRequest$MasterMember.avatarUrl;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = getUserInfoRequest$MasterMember.primaryAliasType;
        }
        return getUserInfoRequest$MasterMember.copy(j2, str5, str6, str7, str8, i);
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getDisplayLogin$annotations() {
    }

    public static /* synthetic */ void getPhoneNumber$annotations() {
    }

    public static /* synthetic */ void getPrimaryAliasType$annotations() {
    }

    public static /* synthetic */ void getPublicName$annotations() {
    }

    public static /* synthetic */ void getUid$annotations() {
    }

    public static final /* synthetic */ void write$Self$passport_data_release(GetUserInfoRequest$MasterMember self, yjd output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.uid);
        if (output.F() || self.displayLogin != null) {
            output.g(serialDesc, 1, auu0.a, self.displayLogin);
        }
        if (output.F() || self.publicName != null) {
            output.g(serialDesc, 2, auu0.a, self.publicName);
        }
        output.o(serialDesc, 3, self.phoneNumber);
        if (output.F() || self.avatarUrl != null) {
            output.g(serialDesc, 4, auu0.a, self.avatarUrl);
        }
        output.A(5, self.primaryAliasType, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPublicName() {
        return this.publicName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPrimaryAliasType() {
        return this.primaryAliasType;
    }

    public final GetUserInfoRequest$MasterMember copy(long uid, String displayLogin, String publicName, String phoneNumber, String avatarUrl, int primaryAliasType) {
        return new GetUserInfoRequest$MasterMember(uid, displayLogin, publicName, phoneNumber, avatarUrl, primaryAliasType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserInfoRequest$MasterMember)) {
            return false;
        }
        GetUserInfoRequest$MasterMember getUserInfoRequest$MasterMember = (GetUserInfoRequest$MasterMember) other;
        return this.uid == getUserInfoRequest$MasterMember.uid && jl40.l(this.displayLogin, getUserInfoRequest$MasterMember.displayLogin) && jl40.l(this.publicName, getUserInfoRequest$MasterMember.publicName) && jl40.l(this.phoneNumber, getUserInfoRequest$MasterMember.phoneNumber) && jl40.l(this.avatarUrl, getUserInfoRequest$MasterMember.avatarUrl) && this.primaryAliasType == getUserInfoRequest$MasterMember.primaryAliasType;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final int getPrimaryAliasType() {
        return this.primaryAliasType;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.uid) * 31;
        String str = this.displayLogin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publicName;
        int b = unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.phoneNumber);
        String str3 = this.avatarUrl;
        return Integer.hashCode(this.primaryAliasType) + ((b + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MasterMember(uid=");
        sb.append(this.uid);
        sb.append(", displayLogin=");
        sb.append(this.displayLogin);
        sb.append(", publicName=");
        sb.append(this.publicName);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", primaryAliasType=");
        return oyr.s(sb, this.primaryAliasType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.uid);
        dest.writeString(this.displayLogin);
        dest.writeString(this.publicName);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.primaryAliasType);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetUserInfoRequest$MasterMember> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserInfoRequest$MasterMember createFromParcel(Parcel parcel) {
            return new GetUserInfoRequest$MasterMember(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserInfoRequest$MasterMember[] newArray(int i) {
            return new GetUserInfoRequest$MasterMember[i];
        }
    }

    public GetUserInfoRequest$MasterMember(long j, String str, String str2, String str3, String str4, int i) {
        this.uid = j;
        this.displayLogin = str;
        this.publicName = str2;
        this.phoneNumber = str3;
        this.avatarUrl = str4;
        this.primaryAliasType = i;
    }

    public /* synthetic */ GetUserInfoRequest$MasterMember(long j, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, str3, (i2 & 16) != 0 ? null : str4, i);
    }
}
