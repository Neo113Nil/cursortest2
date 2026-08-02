package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.auth.LegacyAccountType;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0012J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010 ¨\u00061"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayUserStatus;", "Landroid/os/Parcelable;", "", "uid", "", LegacyAccountType.STRING_LOGIN, "Lcom/yandex/plus/pay/api/model/FamilyRole;", "familyRole", "", "Lcom/yandex/plus/pay/api/model/Feature;", "features", "<init>", "(JLjava/lang/String;Lcom/yandex/plus/pay/api/model/FamilyRole;Ljava/util/List;)V", "", "hasPlus", "()Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/yandex/plus/pay/api/model/FamilyRole;", "component4", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Lcom/yandex/plus/pay/api/model/FamilyRole;Ljava/util/List;)Lcom/yandex/plus/pay/api/model/PlusPayUserStatus;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getUid", "Ljava/lang/String;", "getLogin", "Lcom/yandex/plus/pay/api/model/FamilyRole;", "getFamilyRole", "Ljava/util/List;", "getFeatures", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayUserStatus implements Parcelable {
    public static final Parcelable.Creator<PlusPayUserStatus> CREATOR = new Creator();
    private final FamilyRole familyRole;
    private final List<Feature> features;
    private final String login;
    private final long uid;

    public PlusPayUserStatus(long j, String str, FamilyRole familyRole, List<Feature> list) {
        this.uid = j;
        this.login = str;
        this.familyRole = familyRole;
        this.features = list;
    }

    public static /* synthetic */ PlusPayUserStatus copy$default(PlusPayUserStatus plusPayUserStatus, long j, String str, FamilyRole familyRole, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = plusPayUserStatus.uid;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = plusPayUserStatus.login;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            familyRole = plusPayUserStatus.familyRole;
        }
        FamilyRole familyRole2 = familyRole;
        if ((i & 8) != 0) {
            list = plusPayUserStatus.features;
        }
        return plusPayUserStatus.copy(j2, str2, familyRole2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    /* renamed from: component3, reason: from getter */
    public final FamilyRole getFamilyRole() {
        return this.familyRole;
    }

    public final List<Feature> component4() {
        return this.features;
    }

    public final PlusPayUserStatus copy(long uid, String login, FamilyRole familyRole, List<Feature> features) {
        return new PlusPayUserStatus(uid, login, familyRole, features);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayUserStatus)) {
            return false;
        }
        PlusPayUserStatus plusPayUserStatus = (PlusPayUserStatus) other;
        return this.uid == plusPayUserStatus.uid && jl40.l(this.login, plusPayUserStatus.login) && this.familyRole == plusPayUserStatus.familyRole && jl40.l(this.features, plusPayUserStatus.features);
    }

    public final FamilyRole getFamilyRole() {
        return this.familyRole;
    }

    public final List<Feature> getFeatures() {
        return this.features;
    }

    public final String getLogin() {
        return this.login;
    }

    public final long getUid() {
        return this.uid;
    }

    public final boolean hasPlus() {
        List<Feature> list = this.features;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((Feature) it.next()).getFeature(), Features.FEATURE_PLUS)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.uid) * 31;
        String str = this.login;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FamilyRole familyRole = this.familyRole;
        return this.features.hashCode() + ((hashCode2 + (familyRole != null ? familyRole.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusPayUserStatus(uid=");
        sb.append(this.uid);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", familyRole=");
        sb.append(this.familyRole);
        sb.append(", features=");
        return unr0.t(sb, this.features, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.uid);
        dest.writeString(this.login);
        FamilyRole familyRole = this.familyRole;
        if (familyRole == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(familyRole.name());
        }
        Iterator t = vfc.t(dest, this.features);
        while (t.hasNext()) {
            ((Feature) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayUserStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayUserStatus createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            FamilyRole valueOf = parcel.readInt() == 0 ? null : FamilyRole.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(Feature.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlusPayUserStatus(readLong, readString, valueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayUserStatus[] newArray(int i) {
            return new PlusPayUserStatus[i];
        }
    }
}
