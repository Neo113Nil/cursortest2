package com.yandex.passport.common.ebs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.JwtToken;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006#"}, d2 = {"Lcom/yandex/passport/common/ebs/CryptoSdkProperties;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/JwtToken;", "jwt", "<init>", "(Lcom/yandex/passport/common/core/JwtToken;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/JwtToken;", "copy", "(Lcom/yandex/passport/common/core/JwtToken;)Lcom/yandex/passport/common/ebs/CryptoSdkProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/JwtToken;", "getJwt", "Companion", "com/yandex/passport/common/ebs/o", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CryptoSdkProperties implements Parcelable {
    public static final int $stable = 0;
    private static final String KEY_PROPERTIES = "crypto_sdk_properties";
    private final JwtToken jwt;
    public static final o Companion = new o();
    public static final Parcelable.Creator<CryptoSdkProperties> CREATOR = new Creator();

    public CryptoSdkProperties(JwtToken jwtToken) {
        this.jwt = jwtToken;
    }

    public static /* synthetic */ CryptoSdkProperties copy$default(CryptoSdkProperties cryptoSdkProperties, JwtToken jwtToken, int i, Object obj) {
        if ((i & 1) != 0) {
            jwtToken = cryptoSdkProperties.jwt;
        }
        return cryptoSdkProperties.copy(jwtToken);
    }

    /* renamed from: component1, reason: from getter */
    public final JwtToken getJwt() {
        return this.jwt;
    }

    public final CryptoSdkProperties copy(JwtToken jwt) {
        return new CryptoSdkProperties(jwt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoSdkProperties) && jl40.l(this.jwt, ((CryptoSdkProperties) other).jwt);
    }

    public final JwtToken getJwt() {
        return this.jwt;
    }

    public int hashCode() {
        return this.jwt.hashCode();
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_PROPERTIES, this));
    }

    public String toString() {
        return "CryptoSdkProperties(jwt=" + this.jwt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.jwt.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoSdkProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoSdkProperties createFromParcel(Parcel parcel) {
            return new CryptoSdkProperties(JwtToken.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoSdkProperties[] newArray(int i) {
            return new CryptoSdkProperties[i];
        }
    }
}
