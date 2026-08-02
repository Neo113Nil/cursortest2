package com.yandex.passport.internal.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportUidImpl;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/account/PassportAvailableAccountImpl;", "", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "masterUid", "Lcom/yandex/passport/api/PassportAccountType;", "accountType", "", "displayLogin", "publicName", "phoneNumber", "avatarUrl", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportAccountType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "()Lcom/yandex/passport/api/PassportUidImpl;", "getMasterUid", "Lcom/yandex/passport/api/PassportAccountType;", "getAccountType", "()Lcom/yandex/passport/api/PassportAccountType;", "Ljava/lang/String;", "getDisplayLogin", "()Ljava/lang/String;", "getPublicName", "getPhoneNumber", "getAvatarUrl", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAvailableAccountImpl implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PassportAvailableAccountImpl> CREATOR = new Creator();
    private final PassportAccountType accountType;
    private final String avatarUrl;
    private final String displayLogin;
    private final PassportUidImpl masterUid;
    private final String phoneNumber;
    private final String publicName;
    private final PassportUidImpl uid;

    public PassportAvailableAccountImpl(PassportUidImpl passportUidImpl, PassportUidImpl passportUidImpl2, PassportAccountType passportAccountType, String str, String str2, String str3, String str4) {
        this.uid = passportUidImpl;
        this.masterUid = passportUidImpl2;
        this.accountType = passportAccountType;
        this.displayLogin = str;
        this.publicName = str2;
        this.phoneNumber = str3;
        this.avatarUrl = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PassportAccountType getAccountType() {
        return this.accountType;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getDisplayLogin() {
        return this.displayLogin;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPublicName() {
        return this.publicName;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        PassportUidImpl passportUidImpl = this.masterUid;
        if (passportUidImpl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl.writeToParcel(dest, flags);
        }
        dest.writeString(this.accountType.name());
        dest.writeString(this.displayLogin);
        dest.writeString(this.publicName);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.avatarUrl);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportAvailableAccountImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportAvailableAccountImpl createFromParcel(Parcel parcel) {
            Parcelable.Creator<PassportUidImpl> creator = PassportUidImpl.CREATOR;
            return new PassportAvailableAccountImpl(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), PassportAccountType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportAvailableAccountImpl[] newArray(int i) {
            return new PassportAvailableAccountImpl[i];
        }
    }

    /* renamed from: getMasterUid, reason: from getter and merged with bridge method [inline-methods] */
    public PassportUidImpl m299getMasterUid() {
        return this.masterUid;
    }

    /* renamed from: getUid, reason: from getter and merged with bridge method [inline-methods] */
    public PassportUidImpl m300getUid() {
        return this.uid;
    }
}
