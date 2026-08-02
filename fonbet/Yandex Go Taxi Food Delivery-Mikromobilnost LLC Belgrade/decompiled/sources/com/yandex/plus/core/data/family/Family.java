package com.yandex.plus.core.data.family;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u000b¨\u0006*"}, d2 = {"Lcom/yandex/plus/core/data/family/Family;", "Landroid/os/Parcelable;", "", "capacity", "Lcom/yandex/plus/core/data/family/FamilyMember;", "headOfFamily", "", "members", "<init>", "(ILcom/yandex/plus/core/data/family/FamilyMember;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Lcom/yandex/plus/core/data/family/FamilyMember;", "component3", "()Ljava/util/List;", "copy", "(ILcom/yandex/plus/core/data/family/FamilyMember;Ljava/util/List;)Lcom/yandex/plus/core/data/family/Family;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getCapacity", "Lcom/yandex/plus/core/data/family/FamilyMember;", "getHeadOfFamily", "Ljava/util/List;", "getMembers", "getMembersCount", "membersCount", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Family implements Parcelable {
    public static final Parcelable.Creator<Family> CREATOR = new Creator();
    private final int capacity;
    private final FamilyMember headOfFamily;
    private final List<FamilyMember> members;

    public Family(int i, FamilyMember familyMember, List<FamilyMember> list) {
        this.capacity = i;
        this.headOfFamily = familyMember;
        this.members = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Family copy$default(Family family, int i, FamilyMember familyMember, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = family.capacity;
        }
        if ((i2 & 2) != 0) {
            familyMember = family.headOfFamily;
        }
        if ((i2 & 4) != 0) {
            list = family.members;
        }
        return family.copy(i, familyMember, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* renamed from: component2, reason: from getter */
    public final FamilyMember getHeadOfFamily() {
        return this.headOfFamily;
    }

    public final List<FamilyMember> component3() {
        return this.members;
    }

    public final Family copy(int capacity, FamilyMember headOfFamily, List<FamilyMember> members) {
        return new Family(capacity, headOfFamily, members);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Family)) {
            return false;
        }
        Family family = (Family) other;
        return this.capacity == family.capacity && jl40.l(this.headOfFamily, family.headOfFamily) && jl40.l(this.members, family.members);
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final FamilyMember getHeadOfFamily() {
        return this.headOfFamily;
    }

    public final List<FamilyMember> getMembers() {
        return this.members;
    }

    public final int getMembersCount() {
        int i = this.capacity;
        return i > 0 ? i : this.members.size() + 1;
    }

    public int hashCode() {
        return this.members.hashCode() + ((this.headOfFamily.hashCode() + (Integer.hashCode(this.capacity) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Family(capacity=");
        sb.append(this.capacity);
        sb.append(", headOfFamily=");
        sb.append(this.headOfFamily);
        sb.append(", members=");
        return unr0.t(sb, this.members, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.capacity);
        this.headOfFamily.writeToParcel(dest, flags);
        Iterator t = vfc.t(dest, this.members);
        while (t.hasNext()) {
            ((FamilyMember) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Family> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Family createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            FamilyMember createFromParcel = FamilyMember.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = oo31.d(FamilyMember.CREATOR, parcel, arrayList, i, 1);
            }
            return new Family(readInt, createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Family[] newArray(int i) {
            return new Family[i];
        }
    }
}
