package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.api.AccountListShowMode;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0081\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u000212B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u001d¨\u00063"}, d2 = {"Lcom/yandex/passport/internal/properties/AccountListProperties;", "Lcom/yandex/passport/api/j;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/AccountListShowMode;", "showMode", "Lcom/yandex/passport/api/AccountListBranding;", "branding", "", "showCloseButton", "markPlusUsers", "<init>", "(Lcom/yandex/passport/api/AccountListShowMode;Lcom/yandex/passport/api/AccountListBranding;ZZ)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/AccountListShowMode;", "component2", "()Lcom/yandex/passport/api/AccountListBranding;", "component3", "()Z", "component4", "copy", "(Lcom/yandex/passport/api/AccountListShowMode;Lcom/yandex/passport/api/AccountListBranding;ZZ)Lcom/yandex/passport/internal/properties/AccountListProperties;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/AccountListShowMode;", "getShowMode", "Lcom/yandex/passport/api/AccountListBranding;", "getBranding", "Z", "getShowCloseButton", "getMarkPlusUsers", "Companion", "a", "com/yandex/passport/internal/properties/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AccountListProperties implements com.yandex.passport.api.j, Parcelable {
    public static final int $stable = 8;
    private final AccountListBranding branding;
    private final boolean markPlusUsers;
    private final boolean showCloseButton;
    private final AccountListShowMode showMode;
    public static final com.yandex.passport.internal.properties.a Companion = new com.yandex.passport.internal.properties.a();
    public static final Parcelable.Creator<AccountListProperties> CREATOR = new Creator();

    public static final class a implements com.yandex.passport.api.j {
        public AccountListShowMode a = AccountListShowMode.FULLSCREEN;
        public AccountListBranding b = AccountListBranding.Yandex.INSTANCE;
        public boolean c = true;
        public boolean w;

        @Override // com.yandex.passport.api.j
        public final AccountListBranding getBranding() {
            return this.b;
        }

        @Override // com.yandex.passport.api.j
        public final boolean getMarkPlusUsers() {
            return this.w;
        }

        @Override // com.yandex.passport.api.j
        public final boolean getShowCloseButton() {
            return this.c;
        }

        @Override // com.yandex.passport.api.j
        public final AccountListShowMode getShowMode() {
            return this.a;
        }
    }

    public AccountListProperties(AccountListShowMode accountListShowMode, AccountListBranding accountListBranding, boolean z, boolean z2) {
        this.showMode = accountListShowMode;
        this.branding = accountListBranding;
        this.showCloseButton = z;
        this.markPlusUsers = z2;
    }

    public static /* synthetic */ AccountListProperties copy$default(AccountListProperties accountListProperties, AccountListShowMode accountListShowMode, AccountListBranding accountListBranding, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountListShowMode = accountListProperties.showMode;
        }
        if ((i & 2) != 0) {
            accountListBranding = accountListProperties.branding;
        }
        if ((i & 4) != 0) {
            z = accountListProperties.showCloseButton;
        }
        if ((i & 8) != 0) {
            z2 = accountListProperties.markPlusUsers;
        }
        return accountListProperties.copy(accountListShowMode, accountListBranding, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountListShowMode getShowMode() {
        return this.showMode;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountListBranding getBranding() {
        return this.branding;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMarkPlusUsers() {
        return this.markPlusUsers;
    }

    public final AccountListProperties copy(AccountListShowMode showMode, AccountListBranding branding, boolean showCloseButton, boolean markPlusUsers) {
        return new AccountListProperties(showMode, branding, showCloseButton, markPlusUsers);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountListProperties)) {
            return false;
        }
        AccountListProperties accountListProperties = (AccountListProperties) other;
        return this.showMode == accountListProperties.showMode && jl40.l(this.branding, accountListProperties.branding) && this.showCloseButton == accountListProperties.showCloseButton && this.markPlusUsers == accountListProperties.markPlusUsers;
    }

    @Override // com.yandex.passport.api.j
    public AccountListBranding getBranding() {
        return this.branding;
    }

    @Override // com.yandex.passport.api.j
    public boolean getMarkPlusUsers() {
        return this.markPlusUsers;
    }

    @Override // com.yandex.passport.api.j
    public boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    @Override // com.yandex.passport.api.j
    public AccountListShowMode getShowMode() {
        return this.showMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.markPlusUsers) + unr0.e((this.branding.hashCode() + (this.showMode.hashCode() * 31)) * 31, 31, this.showCloseButton);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair("passport-account-list-properties", this));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccountListProperties(showMode=");
        sb.append(this.showMode);
        sb.append(", branding=");
        sb.append(this.branding);
        sb.append(", showCloseButton=");
        sb.append(this.showCloseButton);
        sb.append(", markPlusUsers=");
        return unr0.u(sb, this.markPlusUsers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.showMode.name());
        dest.writeParcelable(this.branding, flags);
        dest.writeInt(this.showCloseButton ? 1 : 0);
        dest.writeInt(this.markPlusUsers ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountListProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountListProperties createFromParcel(Parcel parcel) {
            return new AccountListProperties(AccountListShowMode.valueOf(parcel.readString()), (AccountListBranding) parcel.readParcelable(AccountListProperties.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountListProperties[] newArray(int i) {
            return new AccountListProperties[i];
        }
    }
}
