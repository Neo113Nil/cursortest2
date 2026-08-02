package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0019¨\u0006'"}, d2 = {"Lcom/yandex/passport/internal/entities/JwtToken;", "Landroid/os/Parcelable;", "", "", "value", "", "expiresIn", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "getValue", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/yandex/passport/internal/entities/JwtToken;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "J", "getExpiresIn", "Companion", "com/yandex/passport/internal/entities/i", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class JwtToken implements Parcelable {
    public static final int $stable = 0;
    private final long expiresIn;
    private final String value;
    public static final i Companion = new i();
    public static final Parcelable.Creator<JwtToken> CREATOR = new Creator();

    public /* synthetic */ JwtToken(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j);
    }

    /* renamed from: component1, reason: from getter */
    private final String getValue() {
        return this.value;
    }

    public static /* synthetic */ JwtToken copy$default(JwtToken jwtToken, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jwtToken.value;
        }
        if ((i & 2) != 0) {
            j = jwtToken.expiresIn;
        }
        return jwtToken.copy(str, j);
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final JwtToken copy(String value, long expiresIn) {
        return new JwtToken(value, expiresIn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JwtToken)) {
            return false;
        }
        JwtToken jwtToken = (JwtToken) other;
        return jl40.l(this.value, jwtToken.value) && this.expiresIn == jwtToken.expiresIn;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.expiresIn) + (this.value.hashCode() * 31);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("jwt_token", this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JwtToken(value=");
        sb.append(this.value);
        sb.append(", expiresIn=");
        return b64.o(sb, this.expiresIn, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
        dest.writeLong(this.expiresIn);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JwtToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JwtToken createFromParcel(Parcel parcel) {
            return new JwtToken(parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JwtToken[] newArray(int i) {
            return new JwtToken[i];
        }
    }

    public JwtToken(String str, long j) {
        this.value = str;
        this.expiresIn = j;
    }
}
