package com.yandex.plus.core.data.family;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010\u0016¨\u0006#"}, d2 = {"Lcom/yandex/plus/core/data/family/FamilyMember;", "Landroid/os/Parcelable;", "", "puid", "avatar", "", "isFamilyInvitationAccepted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/yandex/plus/core/data/family/FamilyMember;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPuid", "getAvatar", "Z", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FamilyMember implements Parcelable {
    public static final Parcelable.Creator<FamilyMember> CREATOR = new Creator();
    private final String avatar;
    private final boolean isFamilyInvitationAccepted;
    private final String puid;

    public FamilyMember(String str, String str2, boolean z) {
        this.puid = str;
        this.avatar = str2;
        this.isFamilyInvitationAccepted = z;
    }

    public static /* synthetic */ FamilyMember copy$default(FamilyMember familyMember, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = familyMember.puid;
        }
        if ((i & 2) != 0) {
            str2 = familyMember.avatar;
        }
        if ((i & 4) != 0) {
            z = familyMember.isFamilyInvitationAccepted;
        }
        return familyMember.copy(str, str2, z);
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
    public final boolean getIsFamilyInvitationAccepted() {
        return this.isFamilyInvitationAccepted;
    }

    public final FamilyMember copy(String puid, String avatar, boolean isFamilyInvitationAccepted) {
        return new FamilyMember(puid, avatar, isFamilyInvitationAccepted);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyMember)) {
            return false;
        }
        FamilyMember familyMember = (FamilyMember) other;
        return jl40.l(this.puid, familyMember.puid) && jl40.l(this.avatar, familyMember.avatar) && this.isFamilyInvitationAccepted == familyMember.isFamilyInvitationAccepted;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getPuid() {
        return this.puid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFamilyInvitationAccepted) + unr0.b(this.puid.hashCode() * 31, 31, this.avatar);
    }

    public final boolean isFamilyInvitationAccepted() {
        return this.isFamilyInvitationAccepted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FamilyMember(puid=");
        sb.append(this.puid);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", isFamilyInvitationAccepted=");
        return unr0.u(sb, this.isFamilyInvitationAccepted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.puid);
        dest.writeString(this.avatar);
        dest.writeInt(this.isFamilyInvitationAccepted ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyMember> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyMember createFromParcel(Parcel parcel) {
            return new FamilyMember(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyMember[] newArray(int i) {
            return new FamilyMember[i];
        }
    }

    public /* synthetic */ FamilyMember(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }
}
