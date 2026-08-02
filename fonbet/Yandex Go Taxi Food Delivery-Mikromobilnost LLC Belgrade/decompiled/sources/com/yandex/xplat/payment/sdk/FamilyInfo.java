package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l0o;
import defpackage.mbb1;
import defpackage.tyj0;
import defpackage.vap;
import defpackage.y3x;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 %2\u00060\u0001j\u0002`\u0002:\u0001&B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0013R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b\f\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/xplat/payment/sdk/FamilyInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "familyAdminUid", "familyId", "", "expenses", "limit", "currency", "frame", "", "isUnlimited", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Z)V", "", "available", "()D", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFamilyAdminUid", "()Ljava/lang/String;", "getFamilyId", CA20Status.STATUS_USER_I, "getExpenses", "getLimit", "getCurrency", "getFrame", "Z", "()Z", "Companion", "vap", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FamilyInfo implements Parcelable {
    private final String currency;
    private final int expenses;
    private final String familyAdminUid;
    private final String familyId;
    private final String frame;
    private final boolean isUnlimited;
    private final int limit;
    public static final vap Companion = new vap();
    public static final Parcelable.Creator<FamilyInfo> CREATOR = new Creator();

    public FamilyInfo(String str, String str2, int i, int i2, String str3, String str4, boolean z) {
        this.familyAdminUid = str;
        this.familyId = str2;
        this.expenses = i;
        this.limit = i2;
        this.currency = str3;
        this.frame = str4;
        this.isUnlimited = z;
    }

    public static tyj0 fromPayerInfoJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new l0o(24));
    }

    public double available() {
        return (this.limit - this.expenses) / 100.0d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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
    public void writeToParcel(Parcel dest, int flags) {
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
