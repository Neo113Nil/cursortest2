package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/yandex/payment/sdk/core/data/BoundSbpToken;", "Landroid/os/Parcelable;", "", "tokenId", "memberId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/BoundSbpToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTokenId", "getMemberId", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BoundSbpToken implements Parcelable {
    public static final Parcelable.Creator<BoundSbpToken> CREATOR = new Creator();
    private final String memberId;
    private final String tokenId;

    public BoundSbpToken(String str, String str2) {
        this.tokenId = str;
        this.memberId = str2;
    }

    public static /* synthetic */ BoundSbpToken copy$default(BoundSbpToken boundSbpToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boundSbpToken.tokenId;
        }
        if ((i & 2) != 0) {
            str2 = boundSbpToken.memberId;
        }
        return boundSbpToken.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    public final BoundSbpToken copy(String tokenId, String memberId) {
        return new BoundSbpToken(tokenId, memberId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundSbpToken)) {
            return false;
        }
        BoundSbpToken boundSbpToken = (BoundSbpToken) other;
        return jl40.l(this.tokenId, boundSbpToken.tokenId) && jl40.l(this.memberId, boundSbpToken.memberId);
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int hashCode = this.tokenId.hashCode() * 31;
        String str = this.memberId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("BoundSbpToken(tokenId=", this.tokenId, ", memberId=", this.memberId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tokenId);
        dest.writeString(this.memberId);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BoundSbpToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundSbpToken createFromParcel(Parcel parcel) {
            return new BoundSbpToken(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundSbpToken[] newArray(int i) {
            return new BoundSbpToken[i];
        }
    }
}
