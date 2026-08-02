package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.j2;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/entities/TurboAuthParams;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/j2;", "", "phoneNumber", "email", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "params", "(Lcom/yandex/passport/api/j2;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/TurboAuthParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhoneNumber", "getEmail", "getFirstName", "getLastName", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TurboAuthParams implements Parcelable, j2 {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TurboAuthParams> CREATOR = new Creator();
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    public TurboAuthParams(j2 j2Var) {
        this(j2Var.getPhoneNumber(), j2Var.getEmail(), j2Var.getFirstName(), j2Var.getLastName());
    }

    public static /* synthetic */ TurboAuthParams copy$default(TurboAuthParams turboAuthParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = turboAuthParams.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = turboAuthParams.email;
        }
        if ((i & 4) != 0) {
            str3 = turboAuthParams.firstName;
        }
        if ((i & 8) != 0) {
            str4 = turboAuthParams.lastName;
        }
        return turboAuthParams.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final TurboAuthParams copy(String phoneNumber, String email, String firstName, String lastName) {
        return new TurboAuthParams(phoneNumber, email, firstName, lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurboAuthParams)) {
            return false;
        }
        TurboAuthParams turboAuthParams = (TurboAuthParams) other;
        return jl40.l(this.phoneNumber, turboAuthParams.phoneNumber) && jl40.l(this.email, turboAuthParams.email) && jl40.l(this.firstName, turboAuthParams.firstName) && jl40.l(this.lastName, turboAuthParams.lastName);
    }

    @Override // com.yandex.passport.api.j2
    public String getEmail() {
        return this.email;
    }

    @Override // com.yandex.passport.api.j2
    public String getFirstName() {
        return this.firstName;
    }

    @Override // com.yandex.passport.api.j2
    public String getLastName() {
        return this.lastName;
    }

    @Override // com.yandex.passport.api.j2
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TurboAuthParams(phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        return b64.p(sb, this.lastName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.phoneNumber);
        dest.writeString(this.email);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TurboAuthParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurboAuthParams createFromParcel(Parcel parcel) {
            return new TurboAuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TurboAuthParams[] newArray(int i) {
            return new TurboAuthParams[i];
        }
    }

    public TurboAuthParams(String str, String str2, String str3, String str4) {
        this.phoneNumber = str;
        this.email = str2;
        this.firstName = str3;
        this.lastName = str4;
    }
}
