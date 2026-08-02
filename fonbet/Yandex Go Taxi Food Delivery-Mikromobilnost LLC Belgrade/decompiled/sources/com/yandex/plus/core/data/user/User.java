package com.yandex.plus.core.data.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.family.Family;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/yandex/plus/core/data/user/User;", "Landroid/os/Parcelable;", "", "puid", "avatar", "Lcom/yandex/plus/core/data/family/Family;", "family", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/family/Family;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/plus/core/data/family/Family;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/family/Family;)Lcom/yandex/plus/core/data/user/User;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPuid", "getAvatar", "Lcom/yandex/plus/core/data/family/Family;", "getFamily", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    private final String avatar;
    private final Family family;
    private final String puid;

    public User(String str, String str2, Family family) {
        this.puid = str;
        this.avatar = str2;
        this.family = family;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, Family family, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.puid;
        }
        if ((i & 2) != 0) {
            str2 = user.avatar;
        }
        if ((i & 4) != 0) {
            family = user.family;
        }
        return user.copy(str, str2, family);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPuid() {
        return this.puid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component3, reason: from getter */
    public final Family getFamily() {
        return this.family;
    }

    public final User copy(String puid, String avatar, Family family) {
        return new User(puid, avatar, family);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return jl40.l(this.puid, user.puid) && jl40.l(this.avatar, user.avatar) && jl40.l(this.family, user.family);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Family getFamily() {
        return this.family;
    }

    public final String getPuid() {
        return this.puid;
    }

    public int hashCode() {
        return this.family.hashCode() + unr0.b(this.puid.hashCode() * 31, 31, this.avatar);
    }

    public String toString() {
        return "User(puid=" + this.puid + ", avatar=" + this.avatar + ", family=" + this.family + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.puid);
        dest.writeString(this.avatar);
        this.family.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            return new User(parcel.readString(), parcel.readString(), Family.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }
}
