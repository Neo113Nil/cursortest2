package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import defpackage.xvz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "Landroid/os/Parcelable;", "", "found", "", "value", "<init>", "(ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/AccountTypeProto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getFound", "Ljava/lang/String;", "getValue", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AccountTypeProto implements Parcelable {
    public static final Parcelable.Creator<AccountTypeProto> CREATOR = new Creator();

    @xuf0(tag = 1)
    private final boolean found;

    @xuf0(tag = 2)
    private final String value;

    public /* synthetic */ AccountTypeProto(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ AccountTypeProto copy$default(AccountTypeProto accountTypeProto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountTypeProto.found;
        }
        if ((i & 2) != 0) {
            str = accountTypeProto.value;
        }
        return accountTypeProto.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFound() {
        return this.found;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final AccountTypeProto copy(@Json(name = "Found") boolean found, @Json(name = "Value") String value) {
        return new AccountTypeProto(found, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountTypeProto)) {
            return false;
        }
        AccountTypeProto accountTypeProto = (AccountTypeProto) other;
        return this.found == accountTypeProto.found && jl40.l(this.value, accountTypeProto.value);
    }

    public final boolean getFound() {
        return this.found;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (Boolean.hashCode(this.found) * 31);
    }

    public String toString() {
        return xvz.m("AccountTypeProto(found=", this.found, ", value=", this.value, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.found ? 1 : 0);
        dest.writeString(this.value);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountTypeProto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountTypeProto createFromParcel(Parcel parcel) {
            return new AccountTypeProto(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountTypeProto[] newArray(int i) {
            return new AccountTypeProto[i];
        }
    }

    public AccountTypeProto(@Json(name = "Found") boolean z, @Json(name = "Value") String str) {
        this.found = z;
        this.value = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountTypeProto() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
