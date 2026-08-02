package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.qv10;
import defpackage.xvz;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!Jb\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b.\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b/\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010!¨\u00062"}, d2 = {"Lcom/yandex/passport/internal/entities/TwoFactorOtpArguments;", "Landroid/os/Parcelable;", "", "", "kind", "uid", "machineReadableLogin", "", "isTeam", "pin", "secret", "", ClidProvider.TIMESTAMP, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/yandex/passport/internal/entities/TwoFactorOtpArguments;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKind", "getUid", "getMachineReadableLogin", "Ljava/lang/Boolean;", "getPin", "getSecret", "Ljava/lang/Long;", "getTimestamp", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TwoFactorOtpArguments implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TwoFactorOtpArguments> CREATOR = new Creator();
    private final Boolean isTeam;
    private final String kind;
    private final String machineReadableLogin;
    private final String pin;
    private final String secret;
    private final Long timestamp;
    private final String uid;

    public TwoFactorOtpArguments(String str, String str2, String str3, Boolean bool, String str4, String str5, Long l) {
        this.kind = str;
        this.uid = str2;
        this.machineReadableLogin = str3;
        this.isTeam = bool;
        this.pin = str4;
        this.secret = str5;
        this.timestamp = l;
    }

    public static /* synthetic */ TwoFactorOtpArguments copy$default(TwoFactorOtpArguments twoFactorOtpArguments, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twoFactorOtpArguments.kind;
        }
        if ((i & 2) != 0) {
            str2 = twoFactorOtpArguments.uid;
        }
        if ((i & 4) != 0) {
            str3 = twoFactorOtpArguments.machineReadableLogin;
        }
        if ((i & 8) != 0) {
            bool = twoFactorOtpArguments.isTeam;
        }
        if ((i & 16) != 0) {
            str4 = twoFactorOtpArguments.pin;
        }
        if ((i & 32) != 0) {
            str5 = twoFactorOtpArguments.secret;
        }
        if ((i & 64) != 0) {
            l = twoFactorOtpArguments.timestamp;
        }
        String str6 = str5;
        Long l2 = l;
        String str7 = str4;
        String str8 = str3;
        return twoFactorOtpArguments.copy(str, str2, str8, bool, str7, str6, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsTeam() {
        return this.isTeam;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final TwoFactorOtpArguments copy(String kind, String uid, String machineReadableLogin, Boolean isTeam, String pin, String secret, Long timestamp) {
        return new TwoFactorOtpArguments(kind, uid, machineReadableLogin, isTeam, pin, secret, timestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoFactorOtpArguments)) {
            return false;
        }
        TwoFactorOtpArguments twoFactorOtpArguments = (TwoFactorOtpArguments) other;
        return jl40.l(this.kind, twoFactorOtpArguments.kind) && jl40.l(this.uid, twoFactorOtpArguments.uid) && jl40.l(this.machineReadableLogin, twoFactorOtpArguments.machineReadableLogin) && jl40.l(this.isTeam, twoFactorOtpArguments.isTeam) && jl40.l(this.pin, twoFactorOtpArguments.pin) && jl40.l(this.secret, twoFactorOtpArguments.secret) && jl40.l(this.timestamp, twoFactorOtpArguments.timestamp);
    }

    public String getKind() {
        return this.kind;
    }

    public String getMachineReadableLogin() {
        return this.machineReadableLogin;
    }

    public String getPin() {
        return this.pin;
    }

    public String getSecret() {
        return this.secret;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.machineReadableLogin;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isTeam;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.pin;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secret;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.timestamp;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public Boolean isTeam() {
        return this.isTeam;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TwoFactorOtpArguments(kind=");
        sb.append(this.kind);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", machineReadableLogin=");
        sb.append(this.machineReadableLogin);
        sb.append(", isTeam=");
        sb.append(this.isTeam);
        sb.append(", pin=");
        sb.append(this.pin);
        sb.append(", secret=");
        sb.append(this.secret);
        sb.append(", timestamp=");
        return qv10.q(sb, this.timestamp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.kind);
        dest.writeString(this.uid);
        dest.writeString(this.machineReadableLogin);
        Boolean bool = this.isTeam;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.pin);
        dest.writeString(this.secret);
        Long l = this.timestamp;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TwoFactorOtpArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwoFactorOtpArguments createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TwoFactorOtpArguments(readString, readString2, readString3, valueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwoFactorOtpArguments[] newArray(int i) {
            return new TwoFactorOtpArguments[i];
        }
    }
}
