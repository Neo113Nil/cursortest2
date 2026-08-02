package com.yandex.passport.common.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.exception.InvalidTokenException;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yandex/passport/common/account/MasterToken;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/passport/common/account/MasterToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getRawValue", "rawValue", "getNonNullValueOrThrow", "nonNullValueOrThrow", "isDropped", "()Z", "Companion", "com/yandex/passport/common/account/b", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MasterToken implements Parcelable {
    public static final int $stable = 0;
    public static final String MASTER_TOKEN_EMPTY_VALUE = "-";
    public static final String MASTER_TOKEN_INVALID_VALUE = "invalid_master_token";
    private final String value;
    public static final b Companion = new b();
    public static final Parcelable.Creator<MasterToken> CREATOR = new Creator();

    public MasterToken(String str) {
        this.value = str;
    }

    public static /* synthetic */ MasterToken copy$default(MasterToken masterToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = masterToken.value;
        }
        return masterToken.copy(str);
    }

    public static final MasterToken from(String str) {
        Companion.getClass();
        return b.a(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final MasterToken copy(String value) {
        return new MasterToken(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MasterToken) && jl40.l(this.value, ((MasterToken) other).value);
    }

    public final String getNonNullValueOrThrow() throws InvalidTokenException {
        String str = this.value;
        if (str != null) {
            return str;
        }
        throw new InvalidTokenException();
    }

    public final String getRawValue() {
        String str = this.value;
        return str == null ? "-" : str;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean isDropped() {
        String str = this.value;
        return str == null || jl40.l(str, MASTER_TOKEN_INVALID_VALUE) || jl40.l(this.value, "-");
    }

    public String toString() {
        return b64.p(new StringBuilder("MasterToken(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MasterToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MasterToken createFromParcel(Parcel parcel) {
            return new MasterToken(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MasterToken[] newArray(int i) {
            return new MasterToken[i];
        }
    }
}
