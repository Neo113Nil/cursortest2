package com.yandex.passport.internal.ui.domik.social;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.network.response.AccountType;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.c;
import defpackage.ny61;
import defpackage.vng;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ£\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010!J!\u0010#\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b'\u0010!J\u001d\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020*¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b<\u0010;R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b=\u0010;R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b>\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b?\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b@\u0010;R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00109R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/social/SocialRegistrationTrack;", "Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "properties", "Lcom/yandex/passport/internal/ModernAccount;", "account", "", "trackId", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "phoneNumber", "firstName", "lastName", "country", "accountState", "suggestedLanguage", "Lcom/yandex/passport/internal/network/response/AccountType;", "accountType", "Lcom/yandex/passport/api/PassportLoginAction;", "loginAction", "<init>", "(Lcom/yandex/passport/internal/properties/LoginProperties;Lcom/yandex/passport/internal/ModernAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/network/response/AccountType;Lcom/yandex/passport/api/PassportLoginAction;)V", "Lcom/yandex/passport/common/core/Environment;", "requireEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "toAuthTrack", "()Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "modernAccount", "with", "(Lcom/yandex/passport/internal/properties/LoginProperties;Lcom/yandex/passport/internal/ModernAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/network/response/AccountType;Lcom/yandex/passport/api/PassportLoginAction;)Lcom/yandex/passport/internal/ui/domik/social/SocialRegistrationTrack;", "withTrackId", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/social/SocialRegistrationTrack;", "withPhoneNumber", "withName", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/social/SocialRegistrationTrack;", "withCountry", "withAccountState", "withSuggestedLanguage", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getProperties", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "Lcom/yandex/passport/internal/ModernAccount;", "getAccount", "()Lcom/yandex/passport/internal/ModernAccount;", "getAccount$annotations", "()V", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getLogin", "getPassword", "getPhoneNumber", "getFirstName", "getLastName", "Lcom/yandex/passport/internal/network/response/AccountType;", "getAccountType", "()Lcom/yandex/passport/internal/network/response/AccountType;", "Lcom/yandex/passport/api/PassportLoginAction;", "getLoginAction", "()Lcom/yandex/passport/api/PassportLoginAction;", "Lcom/yandex/passport/common/account/MasterToken;", "getMasterToken", "()Lcom/yandex/passport/common/account/MasterToken;", "masterToken", "Companion", "com/yandex/passport/internal/ui/domik/social/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialRegistrationTrack extends BaseTrack implements Parcelable {
    public static final int $stable = 8;
    private final ModernAccount account;
    private final String accountState;
    private final AccountType accountType;
    private final String country;
    private final String firstName;
    private final String lastName;
    private final String login;
    private final PassportLoginAction loginAction;
    private final String password;
    private final String phoneNumber;
    private final LoginProperties properties;
    private final String suggestedLanguage;
    private final String trackId;
    public static final a Companion = new a();
    public static final Parcelable.Creator<SocialRegistrationTrack> CREATOR = new Creator();

    public SocialRegistrationTrack(LoginProperties loginProperties, ModernAccount modernAccount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AccountType accountType, PassportLoginAction passportLoginAction) {
        super(loginProperties, str, str2, str3, str4);
        this.properties = loginProperties;
        this.account = modernAccount;
        this.trackId = str;
        this.login = str2;
        this.password = str3;
        this.phoneNumber = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.country = str7;
        this.accountState = str8;
        this.suggestedLanguage = str9;
        this.accountType = accountType;
        this.loginAction = passportLoginAction;
    }

    public static final SocialRegistrationTrack create(LoginProperties loginProperties, ModernAccount modernAccount, PassportLoginAction passportLoginAction) {
        Companion.getClass();
        return new SocialRegistrationTrack(loginProperties, modernAccount, null, null, null, null, null, null, null, null, null, null, passportLoginAction);
    }

    public static /* synthetic */ void getAccount$annotations() {
    }

    public static /* synthetic */ SocialRegistrationTrack with$default(SocialRegistrationTrack socialRegistrationTrack, LoginProperties loginProperties, ModernAccount modernAccount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, AccountType accountType, PassportLoginAction passportLoginAction, int i, Object obj) {
        if ((i & 1) != 0) {
            loginProperties = socialRegistrationTrack.getProperties();
        }
        return socialRegistrationTrack.with(loginProperties, (i & 2) != 0 ? socialRegistrationTrack.account : modernAccount, (i & 4) != 0 ? socialRegistrationTrack.getTrackId() : str, (i & 8) != 0 ? socialRegistrationTrack.getLogin() : str2, (i & 16) != 0 ? socialRegistrationTrack.getPassword() : str3, (i & 32) != 0 ? socialRegistrationTrack.getPhoneNumber() : str4, (i & 64) != 0 ? socialRegistrationTrack.firstName : str5, (i & 128) != 0 ? socialRegistrationTrack.lastName : str6, (i & 256) != 0 ? socialRegistrationTrack.country : str7, (i & 512) != 0 ? socialRegistrationTrack.accountState : str8, (i & 1024) != 0 ? socialRegistrationTrack.suggestedLanguage : str9, (i & 2048) != 0 ? socialRegistrationTrack.accountType : accountType, (i & 4096) != 0 ? socialRegistrationTrack.loginAction : passportLoginAction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ModernAccount getAccount() {
        return this.account;
    }

    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getLogin() {
        return this.login;
    }

    public final PassportLoginAction getLoginAction() {
        return this.loginAction;
    }

    public final MasterToken getMasterToken() {
        return this.account.getMasterToken();
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getPassword() {
        return this.password;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public LoginProperties getProperties() {
        return this.properties;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getTrackId() {
        return this.trackId;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public Environment requireEnvironment() {
        return this.account.getUid().getEnvironment();
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public AuthTrack toAuthTrack() {
        return AuthTrack.withLogin$default(c.b(AuthTrack.Companion, getProperties()).withTrackId(getTrackId()), getLogin(), false, 2, null).withPhoneNumber(getPhoneNumber()).withPassword(getPassword());
    }

    public final SocialRegistrationTrack with(LoginProperties properties, ModernAccount modernAccount, String trackId, String login, String password, String phoneNumber, String firstName, String lastName, String country, String accountState, String suggestedLanguage, AccountType accountType, PassportLoginAction loginAction) {
        return new SocialRegistrationTrack(properties, modernAccount, trackId, login, password, phoneNumber, firstName, lastName, country, accountState, suggestedLanguage, accountType, loginAction);
    }

    public final SocialRegistrationTrack withAccountState(String accountState) {
        return with$default(this, null, null, null, null, null, null, null, null, null, accountState, null, null, null, 7679, null);
    }

    public final SocialRegistrationTrack withCountry(String country) {
        return with$default(this, null, null, null, null, null, null, null, null, country, null, null, null, null, 7935, null);
    }

    public final SocialRegistrationTrack withName(String firstName, String lastName) {
        return with$default(this, null, null, null, null, null, null, firstName, lastName, null, null, null, null, null, 7999, null);
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public SocialRegistrationTrack withPhoneNumber(String phoneNumber) {
        return with$default(this, null, null, null, null, null, phoneNumber, null, null, null, null, null, null, null, 8159, null);
    }

    public final SocialRegistrationTrack withSuggestedLanguage(String suggestedLanguage) {
        return with$default(this, null, null, null, null, null, null, null, null, null, null, suggestedLanguage, null, null, 7167, null);
    }

    public final SocialRegistrationTrack withTrackId(String trackId) {
        return with$default(this, null, null, trackId, null, null, null, null, null, null, null, null, null, null, 8187, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.properties.writeToParcel(dest, flags);
        dest.writeBundle(wwg.g(new Pair("master-account", this.account)));
        dest.writeString(this.trackId);
        dest.writeString(this.login);
        dest.writeString(this.password);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.country);
        dest.writeString(this.accountState);
        dest.writeString(this.suggestedLanguage);
        AccountType accountType = this.accountType;
        if (accountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(accountType.name());
        }
        dest.writeString(this.loginAction.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialRegistrationTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationTrack createFromParcel(Parcel parcel) {
            LoginProperties createFromParcel = LoginProperties.CREATOR.createFromParcel(parcel);
            Bundle readBundle = parcel.readBundle(ModernAccount.class.getClassLoader());
            Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vng.u(readBundle, ModernAccount.class, "master-account") : readBundle.getParcelable("master-account");
            if (parcelable != null) {
                return new SocialRegistrationTrack(createFromParcel, (ModernAccount) parcelable, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AccountType.valueOf(parcel.readString()) : null, PassportLoginAction.valueOf(parcel.readString()));
            }
            ny61.r("can't get required parcelable master-account");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationTrack[] newArray(int i) {
            return new SocialRegistrationTrack[i];
        }
    }
}
