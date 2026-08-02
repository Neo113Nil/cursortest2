package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/payment/sdk/core/data/BrowserCard;", "Landroid/os/Parcelable;", "", "number", "expirationMonth", "expirationYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/BrowserCard;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumber", "getExpirationMonth", "getExpirationYear", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BrowserCard implements Parcelable {
    public static final Parcelable.Creator<BrowserCard> CREATOR = new Creator();
    private final String expirationMonth;
    private final String expirationYear;
    private final String number;

    public BrowserCard(String str, String str2, String str3) {
        this.number = str;
        this.expirationMonth = str2;
        this.expirationYear = str3;
    }

    public static /* synthetic */ BrowserCard copy$default(BrowserCard browserCard, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserCard.number;
        }
        if ((i & 2) != 0) {
            str2 = browserCard.expirationMonth;
        }
        if ((i & 4) != 0) {
            str3 = browserCard.expirationYear;
        }
        return browserCard.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final BrowserCard copy(String number, String expirationMonth, String expirationYear) {
        return new BrowserCard(number, expirationMonth, expirationYear);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowserCard)) {
            return false;
        }
        BrowserCard browserCard = (BrowserCard) other;
        return jl40.l(this.number, browserCard.number) && jl40.l(this.expirationMonth, browserCard.expirationMonth) && jl40.l(this.expirationYear, browserCard.expirationYear);
    }

    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        return this.expirationYear.hashCode() + unr0.b(this.number.hashCode() * 31, 31, this.expirationMonth);
    }

    public String toString() {
        String str = this.number;
        String str2 = this.expirationMonth;
        return oyr.t(b64.v("BrowserCard(number=", str, ", expirationMonth=", str2, ", expirationYear="), this.expirationYear, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.number);
        dest.writeString(this.expirationMonth);
        dest.writeString(this.expirationYear);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BrowserCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrowserCard createFromParcel(Parcel parcel) {
            return new BrowserCard(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BrowserCard[] newArray(int i) {
            return new BrowserCard[i];
        }
    }
}
