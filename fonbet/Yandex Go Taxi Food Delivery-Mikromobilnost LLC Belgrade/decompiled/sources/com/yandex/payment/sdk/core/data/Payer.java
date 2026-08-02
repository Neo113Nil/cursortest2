package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JX\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b)\u0010\u0015R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010(R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010(R\u0017\u00100\u001a\u00020!8F¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yandex/payment/sdk/core/data/Payer;", "Landroid/os/Parcelable;", "", "oauthToken", "email", "uid", "firstName", "lastName", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/Payer;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOauthToken", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getUid", "getFirstName", "setFirstName", "getLastName", "setLastName", "getPhone", "setPhone", "isAuthorized", "()Z", "isAuthorized$annotations", "()V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Payer implements Parcelable {
    public static final Parcelable.Creator<Payer> CREATOR = new Creator();
    private String email;
    private String firstName;
    private String lastName;
    private final String oauthToken;
    private String phone;
    private final String uid;

    public Payer(String str, String str2, String str3, String str4, String str5, String str6) {
        this.oauthToken = str;
        this.email = str2;
        this.uid = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.phone = str6;
    }

    public static /* synthetic */ Payer copy$default(Payer payer, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payer.oauthToken;
        }
        if ((i & 2) != 0) {
            str2 = payer.email;
        }
        if ((i & 4) != 0) {
            str3 = payer.uid;
        }
        if ((i & 8) != 0) {
            str4 = payer.firstName;
        }
        if ((i & 16) != 0) {
            str5 = payer.lastName;
        }
        if ((i & 32) != 0) {
            str6 = payer.phone;
        }
        String str7 = str5;
        String str8 = str6;
        return payer.copy(str, str2, str3, str4, str7, str8);
    }

    public static /* synthetic */ void isAuthorized$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getOauthToken() {
        return this.oauthToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final Payer copy(String oauthToken, String email, String uid, String firstName, String lastName, String phone) {
        return new Payer(oauthToken, email, uid, firstName, lastName, phone);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payer)) {
            return false;
        }
        Payer payer = (Payer) other;
        return jl40.l(this.oauthToken, payer.oauthToken) && jl40.l(this.email, payer.email) && jl40.l(this.uid, payer.uid) && jl40.l(this.firstName, payer.firstName) && jl40.l(this.lastName, payer.lastName) && jl40.l(this.phone, payer.phone);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getOauthToken() {
        return this.oauthToken;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.oauthToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uid;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phone;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isAuthorized() {
        String str = this.oauthToken;
        return !(str == null || str.length() == 0);
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public String toString() {
        String str = this.oauthToken;
        String str2 = this.email;
        String str3 = this.uid;
        String str4 = this.firstName;
        String str5 = this.lastName;
        String str6 = this.phone;
        StringBuilder v = b64.v("Payer(oauthToken=", str, ", email=", str2, ", uid=");
        g8e.D(v, str3, ", firstName=", str4, ", lastName=");
        return g8e.r(v, str5, ", phone=", str6, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.oauthToken);
        dest.writeString(this.email);
        dest.writeString(this.uid);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.phone);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Payer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Payer createFromParcel(Parcel parcel) {
            return new Payer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Payer[] newArray(int i) {
            return new Payer[i];
        }
    }
}
