package com.yandex.passport.sloth.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Uid;
import defpackage.jl40;
import defpackage.uw51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/yandex/passport/sloth/data/AccountForProfile;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Uid;", "uid", "muid", "<init>", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/core/Uid;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "copy", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/core/Uid;)Lcom/yandex/passport/sloth/data/AccountForProfile;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "getMuid", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AccountForProfile implements Parcelable {
    public static final Parcelable.Creator<AccountForProfile> CREATOR = new Creator();
    private final Uid muid;
    private final Uid uid;

    public AccountForProfile(Uid uid, Uid uid2) {
        this.uid = uid;
        this.muid = uid2;
    }

    public static /* synthetic */ AccountForProfile copy$default(AccountForProfile accountForProfile, Uid uid, Uid uid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = accountForProfile.uid;
        }
        if ((i & 2) != 0) {
            uid2 = accountForProfile.muid;
        }
        return accountForProfile.copy(uid, uid2);
    }

    /* renamed from: component1, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final Uid getMuid() {
        return this.muid;
    }

    public final AccountForProfile copy(Uid uid, Uid muid) {
        return new AccountForProfile(uid, muid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountForProfile)) {
            return false;
        }
        AccountForProfile accountForProfile = (AccountForProfile) other;
        return jl40.l(this.uid, accountForProfile.uid) && jl40.l(this.muid, accountForProfile.muid);
    }

    public final Uid getMuid() {
        return this.muid;
    }

    public final Uid getUid() {
        return this.uid;
    }

    public int hashCode() {
        int hashCode = this.uid.hashCode() * 31;
        Uid uid = this.muid;
        return hashCode + (uid == null ? 0 : uid.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccountForProfile(uid=");
        sb.append(this.uid);
        sb.append(", muid=");
        return uw51.j(sb, this.muid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uid, flags);
        dest.writeParcelable(this.muid, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountForProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountForProfile createFromParcel(Parcel parcel) {
            return new AccountForProfile((Uid) parcel.readParcelable(AccountForProfile.class.getClassLoader()), (Uid) parcel.readParcelable(AccountForProfile.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountForProfile[] newArray(int i) {
            return new AccountForProfile[i];
        }
    }
}
