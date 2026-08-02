package com.yandex.passport.internal.credentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.j;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0013R \u0010!\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0013R \u0010%\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001e\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0013¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/credentials/Credentials;", "Lcom/yandex/passport/internal/credentials/ClientCredentials;", "Lcom/yandex/passport/internal/j;", "Landroid/os/Parcelable;", "", "encryptedId", "encryptedSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/credentials/Credentials;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEncryptedId", "getEncryptedSecret", "decryptedId", "getDecryptedId", "getDecryptedId$annotations", "()V", "decryptedSecret", "getDecryptedSecret", "getDecryptedSecret$annotations", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Credentials implements ClientCredentials, j, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Credentials> CREATOR = new Creator();
    private final String decryptedId = com.yandex.passport.internal.util.b.c(getEncryptedId());
    private final String decryptedSecret = com.yandex.passport.internal.util.b.c(getEncryptedSecret());
    private final String encryptedId;
    private final String encryptedSecret;

    public Credentials(String str, String str2) {
        this.encryptedId = str;
        this.encryptedSecret = str2;
    }

    public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentials.encryptedId;
        }
        if ((i & 2) != 0) {
            str2 = credentials.encryptedSecret;
        }
        return credentials.copy(str, str2);
    }

    public static /* synthetic */ void getDecryptedId$annotations() {
    }

    public static /* synthetic */ void getDecryptedSecret$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getEncryptedId() {
        return this.encryptedId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncryptedSecret() {
        return this.encryptedSecret;
    }

    public final Credentials copy(String encryptedId, String encryptedSecret) {
        return new Credentials(encryptedId, encryptedSecret);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) other;
        return jl40.l(this.encryptedId, credentials.encryptedId) && jl40.l(this.encryptedSecret, credentials.encryptedSecret);
    }

    @Override // com.yandex.passport.internal.credentials.ClientCredentials, com.yandex.passport.internal.j
    public String getDecryptedId() {
        return this.decryptedId;
    }

    @Override // com.yandex.passport.internal.credentials.ClientCredentials, com.yandex.passport.internal.j
    public String getDecryptedSecret() {
        return this.decryptedSecret;
    }

    @Override // com.yandex.passport.internal.credentials.ClientCredentials, com.yandex.passport.api.n0
    public String getEncryptedId() {
        return this.encryptedId;
    }

    @Override // com.yandex.passport.internal.credentials.ClientCredentials, com.yandex.passport.api.n0
    public String getEncryptedSecret() {
        return this.encryptedSecret;
    }

    public int hashCode() {
        return this.encryptedSecret.hashCode() + (this.encryptedId.hashCode() * 31);
    }

    @Override // com.yandex.passport.internal.credentials.ClientCredentials
    public Bundle toBundle() {
        return a0.U(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Credentials(encryptedId=");
        sb.append(this.encryptedId);
        sb.append(", encryptedSecret=");
        return b64.p(sb, this.encryptedSecret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.encryptedId);
        dest.writeString(this.encryptedSecret);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Credentials> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Credentials createFromParcel(Parcel parcel) {
            return new Credentials(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Credentials[] newArray(int i) {
            return new Credentials[i];
        }
    }
}
