package com.yandex.passport.internal.ui.domik;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.ConfirmMethod;
import com.yandex.passport.internal.network.response.AccountType;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.k4o;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0001\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002bcB§\u0001\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#JË\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010'J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\u001d\u00108\u001a\u0002072\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u000205¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bB\u0010AR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bD\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bF\u0010AR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\bJ\u0010AR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bW\u0010AR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\b\u0019\u0010YR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b[\u0010\\R\u0011\u0010]\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0011\u0010^\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b^\u0010YR\u0011\u0010_\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0011\u0010`\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b`\u0010Y¨\u0006d"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/RegTrack;", "Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "properties", "", "trackId", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "phoneNumber", "firstName", "lastName", "", "loginSuggestions", "suggestedLanguage", "Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;", "regOrigin", "Lcom/yandex/passport/internal/ModernAccount;", "accountForRelogin", "Lcom/yandex/passport/internal/network/response/AccountType;", "accountType", "Lcom/yandex/passport/internal/entities/ConfirmMethod;", "confirmMethod", "selectedUid", "", "isLegalShown", "Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "unsubscribeMailing", "<init>", "(Lcom/yandex/passport/internal/properties/LoginProperties;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;Lcom/yandex/passport/internal/ModernAccount;Lcom/yandex/passport/internal/network/response/AccountType;Lcom/yandex/passport/internal/entities/ConfirmMethod;Ljava/lang/String;ZLcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;)V", "Lcom/yandex/passport/common/core/Environment;", "requireEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "toAuthTrack", "()Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "with", "(Lcom/yandex/passport/internal/properties/LoginProperties;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;Lcom/yandex/passport/internal/ModernAccount;Lcom/yandex/passport/internal/network/response/AccountType;Lcom/yandex/passport/internal/entities/ConfirmMethod;Ljava/lang/String;ZLcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;)Lcom/yandex/passport/internal/ui/domik/RegTrack;", "withTrackId", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/RegTrack;", "withPhoneNumber", "withSuggestedLanguage", "withRelogin", "(Lcom/yandex/passport/internal/ModernAccount;)Lcom/yandex/passport/internal/ui/domik/RegTrack;", "withConfirmMethod", "(Lcom/yandex/passport/internal/entities/ConfirmMethod;)Lcom/yandex/passport/internal/ui/domik/RegTrack;", "withLegalShown", "()Lcom/yandex/passport/internal/ui/domik/RegTrack;", "value", "withUnsubscribeMailing", "(Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;)Lcom/yandex/passport/internal/ui/domik/RegTrack;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getProperties", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getLogin", "getPassword", "getPhoneNumber", "getFirstName", "getLastName", "Ljava/util/List;", "getLoginSuggestions", "()Ljava/util/List;", "getSuggestedLanguage", "Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;", "getRegOrigin", "()Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;", "Lcom/yandex/passport/internal/ModernAccount;", "getAccountForRelogin", "()Lcom/yandex/passport/internal/ModernAccount;", "Lcom/yandex/passport/internal/network/response/AccountType;", "getAccountType", "()Lcom/yandex/passport/internal/network/response/AccountType;", "Lcom/yandex/passport/internal/entities/ConfirmMethod;", "getConfirmMethod", "()Lcom/yandex/passport/internal/entities/ConfirmMethod;", "getSelectedUid", "Z", "()Z", "Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "getUnsubscribeMailing", "()Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "isRelogin", "isUpgradePhonish", "isLoginRestoring", "isRegistrationOrigin", "Companion", "RegOrigin", "com/yandex/passport/internal/ui/domik/s", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RegTrack extends BaseTrack implements Parcelable {
    public static final int $stable = 8;
    private final ModernAccount accountForRelogin;
    private final AccountType accountType;
    private final ConfirmMethod confirmMethod;
    private final String firstName;
    private final boolean isLegalShown;
    private final String lastName;
    private final String login;
    private final List<String> loginSuggestions;
    private final String password;
    private final String phoneNumber;
    private final LoginProperties properties;
    private final RegOrigin regOrigin;
    private final String selectedUid;
    private final String suggestedLanguage;
    private final String trackId;
    private final UnsubscribeMailingStatus unsubscribeMailing;
    public static final s Companion = new s();
    public static final Parcelable.Creator<RegTrack> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/RegTrack$RegOrigin;", "", "REGISTRATION", "REGISTRATION_ACCOUNT_NOT_FOUND", "LOGIN_RESTORE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RegOrigin {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RegOrigin[] $VALUES;
        public static final RegOrigin LOGIN_RESTORE;
        public static final RegOrigin REGISTRATION;
        public static final RegOrigin REGISTRATION_ACCOUNT_NOT_FOUND;

        static {
            RegOrigin regOrigin = new RegOrigin("REGISTRATION", 0);
            REGISTRATION = regOrigin;
            RegOrigin regOrigin2 = new RegOrigin("REGISTRATION_ACCOUNT_NOT_FOUND", 1);
            REGISTRATION_ACCOUNT_NOT_FOUND = regOrigin2;
            RegOrigin regOrigin3 = new RegOrigin("LOGIN_RESTORE", 2);
            LOGIN_RESTORE = regOrigin3;
            RegOrigin[] regOriginArr = {regOrigin, regOrigin2, regOrigin3};
            $VALUES = regOriginArr;
            $ENTRIES = kotlin.enums.a.a(regOriginArr);
        }

        public static RegOrigin valueOf(String str) {
            return (RegOrigin) Enum.valueOf(RegOrigin.class, str);
        }

        public static RegOrigin[] values() {
            return (RegOrigin[]) $VALUES.clone();
        }
    }

    public RegTrack(LoginProperties loginProperties, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, RegOrigin regOrigin, ModernAccount modernAccount, AccountType accountType, ConfirmMethod confirmMethod, String str8, boolean z, UnsubscribeMailingStatus unsubscribeMailingStatus) {
        super(loginProperties, str, str2, str3, str4);
        this.properties = loginProperties;
        this.trackId = str;
        this.login = str2;
        this.password = str3;
        this.phoneNumber = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.loginSuggestions = list;
        this.suggestedLanguage = str7;
        this.regOrigin = regOrigin;
        this.accountForRelogin = modernAccount;
        this.accountType = accountType;
        this.confirmMethod = confirmMethod;
        this.selectedUid = str8;
        this.isLegalShown = z;
        this.unsubscribeMailing = unsubscribeMailingStatus;
    }

    public static final RegTrack create(LoginProperties loginProperties, RegOrigin regOrigin) {
        Companion.getClass();
        return new RegTrack(loginProperties, null, null, null, null, null, null, null, null, regOrigin, null, null, null, null, false, UnsubscribeMailingStatus.NOT_SHOWED);
    }

    public static /* synthetic */ RegTrack with$default(RegTrack regTrack, LoginProperties loginProperties, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, RegOrigin regOrigin, ModernAccount modernAccount, AccountType accountType, ConfirmMethod confirmMethod, String str8, boolean z, UnsubscribeMailingStatus unsubscribeMailingStatus, int i, Object obj) {
        return regTrack.with((i & 1) != 0 ? regTrack.getProperties() : loginProperties, (i & 2) != 0 ? regTrack.getTrackId() : str, (i & 4) != 0 ? regTrack.getLogin() : str2, (i & 8) != 0 ? regTrack.getPassword() : str3, (i & 16) != 0 ? regTrack.getPhoneNumber() : str4, (i & 32) != 0 ? regTrack.firstName : str5, (i & 64) != 0 ? regTrack.lastName : str6, (i & 128) != 0 ? regTrack.loginSuggestions : list, (i & 256) != 0 ? regTrack.suggestedLanguage : str7, (i & 512) != 0 ? regTrack.regOrigin : regOrigin, (i & 1024) != 0 ? regTrack.accountForRelogin : modernAccount, (i & 2048) != 0 ? regTrack.accountType : accountType, (i & 4096) != 0 ? regTrack.confirmMethod : confirmMethod, (i & 8192) != 0 ? regTrack.selectedUid : str8, (i & 16384) != 0 ? regTrack.isLegalShown : z, (i & 32768) != 0 ? regTrack.unsubscribeMailing : unsubscribeMailingStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ModernAccount getAccountForRelogin() {
        return this.accountForRelogin;
    }

    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final ConfirmMethod getConfirmMethod() {
        return this.confirmMethod;
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

    public final List<String> getLoginSuggestions() {
        return this.loginSuggestions;
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

    public final RegOrigin getRegOrigin() {
        return this.regOrigin;
    }

    public final String getSelectedUid() {
        return this.selectedUid;
    }

    public final String getSuggestedLanguage() {
        return this.suggestedLanguage;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getTrackId() {
        return this.trackId;
    }

    public final UnsubscribeMailingStatus getUnsubscribeMailing() {
        return this.unsubscribeMailing;
    }

    /* renamed from: isLegalShown, reason: from getter */
    public final boolean getIsLegalShown() {
        return this.isLegalShown;
    }

    public final boolean isLoginRestoring() {
        return this.regOrigin == RegOrigin.LOGIN_RESTORE;
    }

    public final boolean isRegistrationOrigin() {
        RegOrigin regOrigin = this.regOrigin;
        return regOrigin == RegOrigin.REGISTRATION || regOrigin == RegOrigin.REGISTRATION_ACCOUNT_NOT_FOUND;
    }

    public final boolean isRelogin() {
        return this.accountForRelogin != null;
    }

    public final boolean isUpgradePhonish() {
        return getProperties().isUpgradePhonish();
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public Environment requireEnvironment() {
        return com.yandex.passport.internal.util.p.u(getProperties().getFilter().getPrimaryEnvironment());
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public AuthTrack toAuthTrack() {
        return AuthTrack.withLogin$default(c.b(AuthTrack.Companion, getProperties()).withTrackId(getTrackId()), getLogin(), false, 2, null).withPassword(getPassword()).withSuggestedLanguage(this.suggestedLanguage);
    }

    public final RegTrack with(LoginProperties properties, String trackId, String login, String password, String phoneNumber, String firstName, String lastName, List<String> loginSuggestions, String suggestedLanguage, RegOrigin regOrigin, ModernAccount accountForRelogin, AccountType accountType, ConfirmMethod confirmMethod, String selectedUid, boolean isLegalShown, UnsubscribeMailingStatus unsubscribeMailing) {
        return new RegTrack(properties, trackId, login, password, phoneNumber, firstName, lastName, loginSuggestions, suggestedLanguage, regOrigin, accountForRelogin, accountType, confirmMethod, selectedUid, isLegalShown, unsubscribeMailing);
    }

    public final RegTrack withConfirmMethod(ConfirmMethod confirmMethod) {
        return with$default(this, null, null, null, null, null, null, null, null, null, null, null, null, confirmMethod, null, false, null, 61439, null);
    }

    public final RegTrack withLegalShown() {
        return with$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 49151, null);
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public RegTrack withPhoneNumber(String phoneNumber) {
        return with$default(this, null, null, null, null, phoneNumber, null, null, null, null, null, null, null, null, null, false, null, 65519, null);
    }

    public final RegTrack withRelogin(ModernAccount accountForRelogin) {
        return with$default(this, null, null, null, null, null, null, null, null, null, null, accountForRelogin, null, null, null, false, null, 64511, null);
    }

    public final RegTrack withSuggestedLanguage(String suggestedLanguage) {
        return with$default(this, null, null, null, null, null, null, null, null, suggestedLanguage, null, null, null, null, null, false, null, 65279, null);
    }

    public final RegTrack withTrackId(String trackId) {
        return with$default(this, null, trackId, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 65533, null);
    }

    public final RegTrack withUnsubscribeMailing(UnsubscribeMailingStatus value) {
        UnsubscribeMailingStatus unsubscribeMailingStatus = this.unsubscribeMailing;
        unsubscribeMailingStatus.getClass();
        UnsubscribeMailingStatus unsubscribeMailingStatus2 = UnsubscribeMailingStatus.NOT_SHOWED;
        return with$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, (unsubscribeMailingStatus == unsubscribeMailingStatus2 || value != unsubscribeMailingStatus2) ? value : unsubscribeMailingStatus, 32767, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.properties.writeToParcel(dest, flags);
        dest.writeString(this.trackId);
        dest.writeString(this.login);
        dest.writeString(this.password);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeStringList(this.loginSuggestions);
        dest.writeString(this.suggestedLanguage);
        dest.writeString(this.regOrigin.name());
        ModernAccount modernAccount = this.accountForRelogin;
        if (modernAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            modernAccount.writeToParcel(dest, flags);
        }
        AccountType accountType = this.accountType;
        if (accountType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(accountType.name());
        }
        ConfirmMethod confirmMethod = this.confirmMethod;
        if (confirmMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(confirmMethod.name());
        }
        dest.writeString(this.selectedUid);
        dest.writeInt(this.isLegalShown ? 1 : 0);
        dest.writeString(this.unsubscribeMailing.name());
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegTrack createFromParcel(Parcel parcel) {
            return new RegTrack(LoginProperties.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), RegOrigin.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ModernAccount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountType.valueOf(parcel.readString()), parcel.readInt() != 0 ? ConfirmMethod.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0, UnsubscribeMailingStatus.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegTrack[] newArray(int i) {
            return new RegTrack[i];
        }
    }

    public static final RegTrack create(AuthTrack authTrack, RegOrigin regOrigin) {
        Companion.getClass();
        return s.a(authTrack, regOrigin);
    }
}
