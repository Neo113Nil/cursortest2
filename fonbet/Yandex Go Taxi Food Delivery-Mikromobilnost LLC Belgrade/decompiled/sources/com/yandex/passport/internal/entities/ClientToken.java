package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.h2;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\fR\u0011\u0010%\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010\f¨\u0006("}, d2 = {"Lcom/yandex/passport/internal/entities/ClientToken;", "Lcom/yandex/passport/api/h2;", "Landroid/os/Parcelable;", "", "value", "decryptedClientId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/entities/ClientToken;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getDecryptedClientId", "Lcom/yandex/passport/api/f;", "getKPassportToken-H85nsjE", "kPassportToken", "Companion", "com/yandex/passport/internal/entities/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ClientToken implements h2, Parcelable {
    public static final int $stable = 0;
    private final String decryptedClientId;
    private final String value;
    public static final b Companion = new b();
    public static final Parcelable.Creator<ClientToken> CREATOR = new Creator();

    public ClientToken(String str, String str2) {
        this.value = str;
        this.decryptedClientId = str2;
    }

    public static /* synthetic */ ClientToken copy$default(ClientToken clientToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientToken.value;
        }
        if ((i & 2) != 0) {
            str2 = clientToken.decryptedClientId;
        }
        return clientToken.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDecryptedClientId() {
        return this.decryptedClientId;
    }

    public final ClientToken copy(String value, String decryptedClientId) {
        return new ClientToken(value, decryptedClientId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientToken)) {
            return false;
        }
        ClientToken clientToken = (ClientToken) other;
        return jl40.l(this.value, clientToken.value) && jl40.l(this.decryptedClientId, clientToken.decryptedClientId);
    }

    public final String getDecryptedClientId() {
        return this.decryptedClientId;
    }

    /* renamed from: getKPassportToken-H85nsjE, reason: not valid java name */
    public final String m301getKPassportTokenH85nsjE() {
        return getValue();
    }

    @Override // com.yandex.passport.api.h2
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.decryptedClientId.hashCode() + (this.value.hashCode() * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair("passport-client-token", this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientToken(value='");
        sb.append(com.yandex.passport.internal.ui.sloth.e.l(getValue()));
        sb.append("', decryptedClientId='");
        return oyr.t(sb, this.decryptedClientId, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
        dest.writeString(this.decryptedClientId);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClientToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientToken createFromParcel(Parcel parcel) {
            return new ClientToken(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientToken[] newArray(int i) {
            return new ClientToken[i];
        }
    }
}
