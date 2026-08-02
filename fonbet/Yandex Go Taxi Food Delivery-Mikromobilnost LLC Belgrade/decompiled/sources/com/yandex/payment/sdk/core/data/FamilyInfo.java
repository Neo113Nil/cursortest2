package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u000b\u0010 R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "Landroid/os/Parcelable;", "", "familyAdminUid", "familyId", "", "expenses", "limit", "currency", "frame", "", "isUnlimited", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFamilyAdminUid", "()Ljava/lang/String;", "getFamilyId", CA20Status.STATUS_USER_I, "getExpenses", "getLimit", "getCurrency", "getFrame", "Z", "()Z", "", "getAvailable", "()D", "available", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyInfo implements Parcelable {
    public static final Parcelable.Creator<FamilyInfo> CREATOR = new Creator();
    private final String currency;
    private final int expenses;
    private final String familyAdminUid;
    private final String familyId;
    private final String frame;
    private final boolean isUnlimited;
    private final int limit;

    public FamilyInfo(String str, String str2, int i, int i2, String str3, String str4, boolean z) {
        this.familyAdminUid = str;
        this.familyId = str2;
        this.expenses = i;
        this.limit = i2;
        this.currency = str3;
        this.frame = str4;
        this.isUnlimited = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double getAvailable() {
        return new com.yandex.xplat.payment.sdk.FamilyInfo(getFamilyAdminUid(), getFamilyId(), getExpenses(), getLimit(), getCurrency(), getFrame(), getIsUnlimited()).available();
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getExpenses() {
        return this.expenses;
    }

    public final String getFamilyAdminUid() {
        return this.familyAdminUid;
    }

    public final String getFamilyId() {
        return this.familyId;
    }

    public final String getFrame() {
        return this.frame;
    }

    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: isUnlimited, reason: from getter */
    public final boolean getIsUnlimited() {
        return this.isUnlimited;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.familyAdminUid);
        dest.writeString(this.familyId);
        dest.writeInt(this.expenses);
        dest.writeInt(this.limit);
        dest.writeString(this.currency);
        dest.writeString(this.frame);
        dest.writeInt(this.isUnlimited ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FamilyInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyInfo createFromParcel(Parcel parcel) {
            return new FamilyInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FamilyInfo[] newArray(int i) {
            return new FamilyInfo[i];
        }
    }
}
