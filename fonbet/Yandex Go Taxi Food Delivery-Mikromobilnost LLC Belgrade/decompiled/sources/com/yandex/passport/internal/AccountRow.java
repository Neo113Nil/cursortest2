package com.yandex.passport.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0012J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0012J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0012J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0012J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0012Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010-R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-¨\u0006."}, d2 = {"Lcom/yandex/passport/internal/AccountRow;", "Landroid/os/Parcelable;", "", "name", "masterTokenValue", "uidString", "userInfoBody", "userInfoMeta", "stashBody", "legacyAccountType", "legacyAffinity", "legacyExtraDataBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/accounts/Account;", "toAccount", "()Landroid/accounts/Account;", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/AccountRow;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AccountRow implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountRow> CREATOR = new Creator();
    public final String legacyAccountType;
    public final String legacyAffinity;
    public final String legacyExtraDataBody;
    public final String masterTokenValue;
    public final String name;
    public final String stashBody;
    public final String uidString;
    public final String userInfoBody;
    public final String userInfoMeta;

    public AccountRow(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.name = str;
        this.masterTokenValue = str2;
        this.uidString = str3;
        this.userInfoBody = str4;
        this.userInfoMeta = str5;
        this.stashBody = str6;
        this.legacyAccountType = str7;
        this.legacyAffinity = str8;
        this.legacyExtraDataBody = str9;
    }

    public static /* synthetic */ AccountRow copy$default(AccountRow accountRow, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountRow.name;
        }
        if ((i & 2) != 0) {
            str2 = accountRow.masterTokenValue;
        }
        if ((i & 4) != 0) {
            str3 = accountRow.uidString;
        }
        if ((i & 8) != 0) {
            str4 = accountRow.userInfoBody;
        }
        if ((i & 16) != 0) {
            str5 = accountRow.userInfoMeta;
        }
        if ((i & 32) != 0) {
            str6 = accountRow.stashBody;
        }
        if ((i & 64) != 0) {
            str7 = accountRow.legacyAccountType;
        }
        if ((i & 128) != 0) {
            str8 = accountRow.legacyAffinity;
        }
        if ((i & 256) != 0) {
            str9 = accountRow.legacyExtraDataBody;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return accountRow.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMasterTokenValue() {
        return this.masterTokenValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUidString() {
        return this.uidString;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUserInfoBody() {
        return this.userInfoBody;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserInfoMeta() {
        return this.userInfoMeta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStashBody() {
        return this.stashBody;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLegacyAccountType() {
        return this.legacyAccountType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLegacyAffinity() {
        return this.legacyAffinity;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLegacyExtraDataBody() {
        return this.legacyExtraDataBody;
    }

    public final AccountRow copy(String name, String masterTokenValue, String uidString, String userInfoBody, String userInfoMeta, String stashBody, String legacyAccountType, String legacyAffinity, String legacyExtraDataBody) {
        return new AccountRow(name, masterTokenValue, uidString, userInfoBody, userInfoMeta, stashBody, legacyAccountType, legacyAffinity, legacyExtraDataBody);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRow)) {
            return false;
        }
        AccountRow accountRow = (AccountRow) other;
        return jl40.l(this.name, accountRow.name) && jl40.l(this.masterTokenValue, accountRow.masterTokenValue) && jl40.l(this.uidString, accountRow.uidString) && jl40.l(this.userInfoBody, accountRow.userInfoBody) && jl40.l(this.userInfoMeta, accountRow.userInfoMeta) && jl40.l(this.stashBody, accountRow.stashBody) && jl40.l(this.legacyAccountType, accountRow.legacyAccountType) && jl40.l(this.legacyAffinity, accountRow.legacyAffinity) && jl40.l(this.legacyExtraDataBody, accountRow.legacyExtraDataBody);
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.masterTokenValue;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uidString;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userInfoBody;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userInfoMeta;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stashBody;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.legacyAccountType;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.legacyAffinity;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.legacyExtraDataBody;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Account toAccount() {
        return new Account(this.name, i.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccountRow(name='");
        sb.append(this.name);
        sb.append("', masterTokenValue=");
        sb.append(com.yandex.passport.internal.ui.sloth.e.l(this.masterTokenValue));
        sb.append(", uidString=");
        sb.append(this.uidString);
        sb.append(", userInfoBody=");
        sb.append(this.userInfoBody);
        sb.append(", userInfoMeta=");
        sb.append(this.userInfoMeta);
        sb.append(", stashBody=");
        sb.append(this.stashBody);
        sb.append(", legacyAccountType=");
        sb.append(this.legacyAccountType);
        sb.append(", legacyAffinity=");
        sb.append(this.legacyAffinity);
        sb.append(", legacyExtraDataBody=");
        return b64.p(sb, this.legacyExtraDataBody, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.masterTokenValue);
        dest.writeString(this.uidString);
        dest.writeString(this.userInfoBody);
        dest.writeString(this.userInfoMeta);
        dest.writeString(this.stashBody);
        dest.writeString(this.legacyAccountType);
        dest.writeString(this.legacyAffinity);
        dest.writeString(this.legacyExtraDataBody);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountRow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRow createFromParcel(Parcel parcel) {
            return new AccountRow(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRow[] newArray(int i) {
            return new AccountRow[i];
        }
    }
}
