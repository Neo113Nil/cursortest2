package com.yandex.payment.sdk.core.camerascanner;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\nJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"Lcom/yandex/payment/sdk/core/camerascanner/CardScanData;", "Landroid/os/Parcelable;", "", "pan", "", "expMonth", "expYear", "<init>", "(Ljava/lang/String;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;II)Lcom/yandex/payment/sdk/core/camerascanner/CardScanData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPan", CA20Status.STATUS_USER_I, "getExpMonth", "getExpYear", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardScanData implements Parcelable {
    public static final Parcelable.Creator<CardScanData> CREATOR = new Creator();
    private final int expMonth;
    private final int expYear;
    private final String pan;

    public CardScanData(String str, int i, int i2) {
        this.pan = str;
        this.expMonth = i;
        this.expYear = i2;
    }

    public static /* synthetic */ CardScanData copy$default(CardScanData cardScanData, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardScanData.pan;
        }
        if ((i3 & 2) != 0) {
            i = cardScanData.expMonth;
        }
        if ((i3 & 4) != 0) {
            i2 = cardScanData.expYear;
        }
        return cardScanData.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpYear() {
        return this.expYear;
    }

    public final CardScanData copy(String pan, int expMonth, int expYear) {
        return new CardScanData(pan, expMonth, expYear);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardScanData)) {
            return false;
        }
        CardScanData cardScanData = (CardScanData) other;
        return jl40.l(this.pan, cardScanData.pan) && this.expMonth == cardScanData.expMonth && this.expYear == cardScanData.expYear;
    }

    public final int getExpMonth() {
        return this.expMonth;
    }

    public final int getExpYear() {
        return this.expYear;
    }

    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        return Integer.hashCode(this.expYear) + oyr.b(this.expMonth, this.pan.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.pan;
        return oyr.m(this.expYear, Extension.C_BRAKE, b64.u(this.expMonth, "CardScanData(pan=", str, ", expMonth=", ", expYear="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.pan);
        dest.writeInt(this.expMonth);
        dest.writeInt(this.expYear);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardScanData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardScanData createFromParcel(Parcel parcel) {
            return new CardScanData(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardScanData[] newArray(int i) {
            return new CardScanData[i];
        }
    }
}
