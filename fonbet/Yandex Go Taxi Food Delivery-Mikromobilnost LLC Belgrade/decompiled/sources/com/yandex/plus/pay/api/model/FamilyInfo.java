package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/api/model/FamilyInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/FamilyRole;", "familyRole", "Lcom/yandex/plus/pay/api/model/ParentInfo;", "parentInfo", "<init>", "(Lcom/yandex/plus/pay/api/model/FamilyRole;Lcom/yandex/plus/pay/api/model/ParentInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/FamilyRole;", "component2", "()Lcom/yandex/plus/pay/api/model/ParentInfo;", "copy", "(Lcom/yandex/plus/pay/api/model/FamilyRole;Lcom/yandex/plus/pay/api/model/ParentInfo;)Lcom/yandex/plus/pay/api/model/FamilyInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/FamilyRole;", "getFamilyRole", "Lcom/yandex/plus/pay/api/model/ParentInfo;", "getParentInfo", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FamilyInfo implements Parcelable {
    public static final Parcelable.Creator<FamilyInfo> CREATOR = new Creator();
    private final FamilyRole familyRole;
    private final ParentInfo parentInfo;

    public FamilyInfo(FamilyRole familyRole, ParentInfo parentInfo) {
        this.familyRole = familyRole;
        this.parentInfo = parentInfo;
    }

    public static /* synthetic */ FamilyInfo copy$default(FamilyInfo familyInfo, FamilyRole familyRole, ParentInfo parentInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            familyRole = familyInfo.familyRole;
        }
        if ((i & 2) != 0) {
            parentInfo = familyInfo.parentInfo;
        }
        return familyInfo.copy(familyRole, parentInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final FamilyRole getFamilyRole() {
        return this.familyRole;
    }

    /* renamed from: component2, reason: from getter */
    public final ParentInfo getParentInfo() {
        return this.parentInfo;
    }

    public final FamilyInfo copy(FamilyRole familyRole, ParentInfo parentInfo) {
        return new FamilyInfo(familyRole, parentInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyInfo)) {
            return false;
        }
        FamilyInfo familyInfo = (FamilyInfo) other;
        return this.familyRole == familyInfo.familyRole && jl40.l(this.parentInfo, familyInfo.parentInfo);
    }

    public final FamilyRole getFamilyRole() {
        return this.familyRole;
    }

    public final ParentInfo getParentInfo() {
        return this.parentInfo;
    }

    public int hashCode() {
        int hashCode = this.familyRole.hashCode() * 31;
        ParentInfo parentInfo = this.parentInfo;
        return hashCode + (parentInfo == null ? 0 : parentInfo.hashCode());
    }

    public String toString() {
        return "FamilyInfo(familyRole=" + this.familyRole + ", parentInfo=" + this.parentInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.familyRole.name());
        ParentInfo parentInfo = this.parentInfo;
        if (parentInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            parentInfo.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyInfo createFromParcel(Parcel parcel) {
            return new FamilyInfo(FamilyRole.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ParentInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyInfo[] newArray(int i) {
            return new FamilyInfo[i];
        }
    }
}
