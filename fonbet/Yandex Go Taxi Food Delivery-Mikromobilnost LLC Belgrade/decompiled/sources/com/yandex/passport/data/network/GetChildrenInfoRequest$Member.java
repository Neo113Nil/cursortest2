package com.yandex.passport.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.psq0;
import defpackage.qje;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010(JN\u0010,\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010\"J\u001a\u00102\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010(R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010(R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010(¨\u0006G"}, d2 = {"com/yandex/passport/data/network/GetChildrenInfoRequest$Member", "Landroid/os/Parcelable;", "", "uid", "", "hasPlus", "", "displayLogin", "displayName", "publicName", "avatarUrl", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lpsq0;", "serializationConstructorMarker", "(IJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpsq0;)V", "Lcom/yandex/passport/data/network/GetChildrenInfoRequest$Member;", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$passport_data_release", "(Lcom/yandex/passport/data/network/GetChildrenInfoRequest$Member;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/data/network/GetChildrenInfoRequest$Member;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getUid", "getUid$annotations", "()V", "Z", "getHasPlus", "getHasPlus$annotations", "Ljava/lang/String;", "getDisplayLogin", "getDisplayLogin$annotations", "getDisplayName", "getDisplayName$annotations", "getPublicName", "getPublicName$annotations", "getAvatarUrl", "getAvatarUrl$annotations", "Companion", "com/yandex/passport/data/network/z3", "com/yandex/passport/data/network/a4", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetChildrenInfoRequest$Member implements Parcelable {
    private final String avatarUrl;
    private final String displayLogin;
    private final String displayName;
    private final boolean hasPlus;
    private final String publicName;
    private final long uid;
    public static final a4 Companion = new a4();
    public static final Parcelable.Creator<GetChildrenInfoRequest$Member> CREATOR = new Creator();

    public /* synthetic */ GetChildrenInfoRequest$Member(int i, long j, boolean z, String str, String str2, String str3, String str4, psq0 psq0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, z3.a.getDescriptor());
            throw null;
        }
        this.uid = j;
        if ((i & 2) == 0) {
            this.hasPlus = false;
        } else {
            this.hasPlus = z;
        }
        if ((i & 4) == 0) {
            this.displayLogin = "";
        } else {
            this.displayLogin = str;
        }
        if ((i & 8) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str2;
        }
        if ((i & 16) == 0) {
            this.publicName = "";
        } else {
            this.publicName = str3;
        }
        if ((i & 32) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str4;
        }
    }

    public static /* synthetic */ GetChildrenInfoRequest$Member copy$default(GetChildrenInfoRequest$Member getChildrenInfoRequest$Member, long j, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getChildrenInfoRequest$Member.uid;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = getChildrenInfoRequest$Member.hasPlus;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = getChildrenInfoRequest$Member.displayLogin;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = getChildrenInfoRequest$Member.displayName;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = getChildrenInfoRequest$Member.publicName;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = getChildrenInfoRequest$Member.avatarUrl;
        }
        return getChildrenInfoRequest$Member.copy(j2, z2, str5, str6, str7, str4);
    }

    public static /* synthetic */ void getAvatarUrl$annotations() {
    }

    public static /* synthetic */ void getDisplayLogin$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getHasPlus$annotations() {
    }

    public static /* synthetic */ void getPublicName$annotations() {
    }

    public static /* synthetic */ void getUid$annotations() {
    }

    public static final /* synthetic */ void write$Self$passport_data_release(GetChildrenInfoRequest$Member self, yjd output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.uid);
        if (output.F() || self.hasPlus) {
            output.n(serialDesc, 1, self.hasPlus);
        }
        if (output.F() || !jl40.l(self.displayLogin, "")) {
            output.o(serialDesc, 2, self.displayLogin);
        }
        if (output.F() || !jl40.l(self.displayName, "")) {
            output.o(serialDesc, 3, self.displayName);
        }
        if (output.F() || !jl40.l(self.publicName, "")) {
            output.o(serialDesc, 4, self.publicName);
        }
        if (!output.F() && self.avatarUrl == null) {
            return;
        }
        output.g(serialDesc, 5, auu0.a, self.avatarUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPublicName() {
        return this.publicName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final GetChildrenInfoRequest$Member copy(long uid, boolean hasPlus, String displayLogin, String displayName, String publicName, String avatarUrl) {
        return new GetChildrenInfoRequest$Member(uid, hasPlus, displayLogin, displayName, publicName, avatarUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetChildrenInfoRequest$Member)) {
            return false;
        }
        GetChildrenInfoRequest$Member getChildrenInfoRequest$Member = (GetChildrenInfoRequest$Member) other;
        return this.uid == getChildrenInfoRequest$Member.uid && this.hasPlus == getChildrenInfoRequest$Member.hasPlus && jl40.l(this.displayLogin, getChildrenInfoRequest$Member.displayLogin) && jl40.l(this.displayName, getChildrenInfoRequest$Member.displayName) && jl40.l(this.publicName, getChildrenInfoRequest$Member.publicName) && jl40.l(this.avatarUrl, getChildrenInfoRequest$Member.avatarUrl);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDisplayLogin() {
        return this.displayLogin;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getHasPlus() {
        return this.hasPlus;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.e(Long.hashCode(this.uid) * 31, 31, this.hasPlus), 31, this.displayLogin), 31, this.displayName), 31, this.publicName);
        String str = this.avatarUrl;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Member(uid=");
        sb.append(this.uid);
        sb.append(", hasPlus=");
        sb.append(this.hasPlus);
        sb.append(", displayLogin=");
        sb.append(this.displayLogin);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", publicName=");
        sb.append(this.publicName);
        sb.append(", avatarUrl=");
        return b64.p(sb, this.avatarUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.uid);
        dest.writeInt(this.hasPlus ? 1 : 0);
        dest.writeString(this.displayLogin);
        dest.writeString(this.displayName);
        dest.writeString(this.publicName);
        dest.writeString(this.avatarUrl);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetChildrenInfoRequest$Member> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetChildrenInfoRequest$Member createFromParcel(Parcel parcel) {
            return new GetChildrenInfoRequest$Member(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetChildrenInfoRequest$Member[] newArray(int i) {
            return new GetChildrenInfoRequest$Member[i];
        }
    }

    public GetChildrenInfoRequest$Member(long j, boolean z, String str, String str2, String str3, String str4) {
        this.uid = j;
        this.hasPlus = z;
        this.displayLogin = str;
        this.displayName = str2;
        this.publicName = str3;
        this.avatarUrl = str4;
    }

    public /* synthetic */ GetChildrenInfoRequest$Member(long j, boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : str4);
    }
}
