package com.yandex.passport.internal.properties;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import defpackage.jl40;
import defpackage.wwg;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00013B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/properties/AccountNotAuthorizedProperties;", "Lcom/yandex/passport/api/k;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "Lcom/yandex/passport/api/PassportTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", Constants.KEY_MESSAGE, "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/lang/String;Lcom/yandex/passport/internal/properties/LoginProperties;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Lcom/yandex/passport/api/PassportTheme;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Lcom/yandex/passport/api/PassportTheme;Ljava/lang/String;Lcom/yandex/passport/internal/properties/LoginProperties;)Lcom/yandex/passport/internal/properties/AccountNotAuthorizedProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Lcom/yandex/passport/api/PassportTheme;", "getTheme", "Ljava/lang/String;", "getMessage", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getLoginProperties", "Companion", "com/yandex/passport/internal/properties/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AccountNotAuthorizedProperties implements com.yandex.passport.api.k, Parcelable {
    public static final int $stable = 8;
    private static final String KEY_ACCOUNT_NOT_AUTHORIZED_PROPERTIES = "account-not-authorized-properties";
    private final LoginProperties loginProperties;
    private final String message;
    private final PassportTheme theme;
    private final PassportUidImpl uid;
    public static final b Companion = new b();
    public static final Parcelable.Creator<AccountNotAuthorizedProperties> CREATOR = new Creator();

    public AccountNotAuthorizedProperties(PassportUidImpl passportUidImpl, PassportTheme passportTheme, String str, LoginProperties loginProperties) {
        this.uid = passportUidImpl;
        this.theme = passportTheme;
        this.message = str;
        this.loginProperties = loginProperties;
    }

    public static /* synthetic */ AccountNotAuthorizedProperties copy$default(AccountNotAuthorizedProperties accountNotAuthorizedProperties, PassportUidImpl passportUidImpl, PassportTheme passportTheme, String str, LoginProperties loginProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = accountNotAuthorizedProperties.uid;
        }
        if ((i & 2) != 0) {
            passportTheme = accountNotAuthorizedProperties.theme;
        }
        if ((i & 4) != 0) {
            str = accountNotAuthorizedProperties.message;
        }
        if ((i & 8) != 0) {
            loginProperties = accountNotAuthorizedProperties.loginProperties;
        }
        return accountNotAuthorizedProperties.copy(passportUidImpl, passportTheme, str, loginProperties);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final PassportTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    public final AccountNotAuthorizedProperties copy(PassportUidImpl uid, PassportTheme theme, String message, LoginProperties loginProperties) {
        return new AccountNotAuthorizedProperties(uid, theme, message, loginProperties);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNotAuthorizedProperties)) {
            return false;
        }
        AccountNotAuthorizedProperties accountNotAuthorizedProperties = (AccountNotAuthorizedProperties) other;
        return jl40.l(this.uid, accountNotAuthorizedProperties.uid) && this.theme == accountNotAuthorizedProperties.theme && jl40.l(this.message, accountNotAuthorizedProperties.message) && jl40.l(this.loginProperties, accountNotAuthorizedProperties.loginProperties);
    }

    @Override // com.yandex.passport.api.k
    public String getMessage() {
        return this.message;
    }

    @Override // com.yandex.passport.internal.b0
    public PassportTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = (this.theme.hashCode() + (this.uid.hashCode() * 31)) * 31;
        String str = this.message;
        return this.loginProperties.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final Bundle toBundle() {
        return wwg.g(new Pair(KEY_ACCOUNT_NOT_AUTHORIZED_PROPERTIES, this));
    }

    public String toString() {
        return "AccountNotAuthorizedProperties(uid=" + this.uid + ", theme=" + this.theme + ", message=" + this.message + ", loginProperties=" + this.loginProperties + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeString(this.theme.name());
        dest.writeString(this.message);
        this.loginProperties.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountNotAuthorizedProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountNotAuthorizedProperties createFromParcel(Parcel parcel) {
            return new AccountNotAuthorizedProperties(PassportUidImpl.CREATOR.createFromParcel(parcel), PassportTheme.valueOf(parcel.readString()), parcel.readString(), LoginProperties.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountNotAuthorizedProperties[] newArray(int i) {
            return new AccountNotAuthorizedProperties[i];
        }
    }

    @Override // com.yandex.passport.api.k
    public LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    @Override // com.yandex.passport.api.k
    public PassportUidImpl getUid() {
        return this.uid;
    }
}
