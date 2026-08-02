package com.yandex.passport.internal.ui.domik;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.t0;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.network.response.AccountType;
import com.yandex.passport.internal.network.response.AuthMethod;
import com.yandex.passport.internal.properties.LoginProperties;
import defpackage.oo31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0001\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001oBÁ\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0000H\u0016¢\u0006\u0004\b$\u0010%Jë\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b4\u0010+J\u0019\u00105\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b5\u0010+J\u0015\u00106\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b8\u0010+J\u0017\u00109\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b9\u0010+J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u001c¢\u0006\u0004\b;\u0010<J\u001d\u0010B\u001a\u00020A2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020?¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020!2\u0006\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bI\u0010JR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bQ\u0010PR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bU\u0010PR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bV\u0010PR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b[\u0010\\R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\b`\u0010PR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010aR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bb\u0010PR\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010R\u001a\u0004\bc\u0010TR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bd\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\be\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\bg\u0010%R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bh\u0010PR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010R\u001a\u0004\bl\u0010TR\u0011\u0010m\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bm\u0010T¨\u0006p"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "Lcom/yandex/passport/internal/ui/domik/BaseTrack;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/properties/LoginProperties;", "properties", "", "trackId", LegacyAccountType.STRING_LOGIN, "", "syntheticLogin", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "maskedLogin", "Lcom/yandex/passport/internal/ModernAccount;", "accountForRelogin", "Lcom/yandex/passport/internal/network/response/AccountType;", "accountType", "", "Lcom/yandex/passport/internal/network/response/AuthMethod;", "authMethods", "magicLinkEmail", "Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;", "analyticalFrom", "phoneNumber", "allowMagicLink", "maskedPhoneNumber", "suggestedLanguage", "previousTrack", "avatarUrl", "Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "unsubscribeMailing", "nativeToBrowserAuthRequested", "<init>", "(Lcom/yandex/passport/internal/properties/LoginProperties;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ModernAccount;Lcom/yandex/passport/internal/network/response/AccountType;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/AuthTrack;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;Z)V", "Lcom/yandex/passport/common/core/Environment;", "requireEnvironment", "()Lcom/yandex/passport/common/core/Environment;", "toAuthTrack", "()Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "with", "(Lcom/yandex/passport/internal/properties/LoginProperties;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ModernAccount;Lcom/yandex/passport/internal/network/response/AccountType;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/AuthTrack;Ljava/lang/String;Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;Z)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withLogin", "(Ljava/lang/String;Z)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withTrackId", "(Ljava/lang/String;)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withPassword", "withMaskedLogin", "withRelogin", "(Lcom/yandex/passport/internal/ModernAccount;)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withAccountType", "(Lcom/yandex/passport/internal/network/response/AccountType;)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withAuthMethods", "(Ljava/util/List;)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withMagicLinkEmail", "withPhoneNumber", "withAllowMagicLink", "(Z)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "withMaskedPhoneNumber", "withSuggestedLanguage", "value", "withUnsubscribeMailing", "(Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;)Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, "determineEnvironment", "(Ljava/lang/String;)Lcom/yandex/passport/common/core/Environment;", "isTeamUsername", "(Ljava/lang/String;)Z", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getProperties", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "getLogin", "Z", "getSyntheticLogin", "()Z", "getPassword", "getMaskedLogin", "Lcom/yandex/passport/internal/ModernAccount;", "getAccountForRelogin", "()Lcom/yandex/passport/internal/ModernAccount;", "Lcom/yandex/passport/internal/network/response/AccountType;", "getAccountType", "()Lcom/yandex/passport/internal/network/response/AccountType;", "Ljava/util/List;", "getAuthMethods", "()Ljava/util/List;", "getMagicLinkEmail", "Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;", "getPhoneNumber", "getAllowMagicLink", "getMaskedPhoneNumber", "getSuggestedLanguage", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "getPreviousTrack", "getAvatarUrl", "Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "getUnsubscribeMailing", "()Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "getNativeToBrowserAuthRequested", "isRelogin", "Companion", "com/yandex/passport/internal/ui/domik/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthTrack extends BaseTrack implements Parcelable {
    public static final int $stable = 8;
    private final ModernAccount accountForRelogin;
    private final AccountType accountType;
    private final boolean allowMagicLink;
    private final AnalyticsFromValue analyticalFrom;
    private final List<AuthMethod> authMethods;
    private final String avatarUrl;
    private final String login;
    private final String magicLinkEmail;
    private final String maskedLogin;
    private final String maskedPhoneNumber;
    private final boolean nativeToBrowserAuthRequested;
    private final String password;
    private final String phoneNumber;
    private final AuthTrack previousTrack;
    private final LoginProperties properties;
    private final String suggestedLanguage;
    private final boolean syntheticLogin;
    private final String trackId;
    private final UnsubscribeMailingStatus unsubscribeMailing;
    public static final c Companion = new c();
    public static final Parcelable.Creator<AuthTrack> CREATOR = new Creator();
    private static final String REGEX_TEAM_USERNAME = "@(?:mail\\.)?yandex-team\\.(?:ru|com|com\\.tr|com\\.ua)$";
    private static final Pattern PATTERN_TEAM_USERNAME = Pattern.compile(REGEX_TEAM_USERNAME, 2);

    /* JADX WARN: Multi-variable type inference failed */
    public AuthTrack(LoginProperties loginProperties, String str, String str2, boolean z, String str3, String str4, ModernAccount modernAccount, AccountType accountType, List<? extends AuthMethod> list, String str5, AnalyticsFromValue analyticsFromValue, String str6, boolean z2, String str7, String str8, AuthTrack authTrack, String str9, UnsubscribeMailingStatus unsubscribeMailingStatus, boolean z3) {
        super(loginProperties, str, str2, str3, str6);
        this.properties = loginProperties;
        this.trackId = str;
        this.login = str2;
        this.syntheticLogin = z;
        this.password = str3;
        this.maskedLogin = str4;
        this.accountForRelogin = modernAccount;
        this.accountType = accountType;
        this.authMethods = list;
        this.magicLinkEmail = str5;
        this.analyticalFrom = analyticsFromValue;
        this.phoneNumber = str6;
        this.allowMagicLink = z2;
        this.maskedPhoneNumber = str7;
        this.suggestedLanguage = str8;
        this.previousTrack = authTrack;
        this.avatarUrl = str9;
        this.unsubscribeMailing = unsubscribeMailingStatus;
        this.nativeToBrowserAuthRequested = z3;
    }

    private final Environment determineEnvironment(String username) {
        t0 teamEnvironmentIfSpecified = getProperties().getFilter().getTeamEnvironmentIfSpecified();
        Environment u = teamEnvironmentIfSpecified != null ? com.yandex.passport.internal.util.p.u(PassportEnvironmentImpl.from(teamEnvironmentIfSpecified)) : null;
        return (u == null || !isTeamUsername(username)) ? com.yandex.passport.internal.util.p.u(getProperties().getFilter().getPrimaryEnvironment()) : u;
    }

    private final boolean isTeamUsername(String username) {
        return PATTERN_TEAM_USERNAME.matcher(username).find();
    }

    public static /* synthetic */ AuthTrack with$default(AuthTrack authTrack, LoginProperties loginProperties, String str, String str2, boolean z, String str3, String str4, ModernAccount modernAccount, AccountType accountType, List list, String str5, AnalyticsFromValue analyticsFromValue, String str6, boolean z2, String str7, String str8, AuthTrack authTrack2, String str9, UnsubscribeMailingStatus unsubscribeMailingStatus, boolean z3, int i, Object obj) {
        boolean z4;
        UnsubscribeMailingStatus unsubscribeMailingStatus2;
        LoginProperties properties = (i & 1) != 0 ? authTrack.getProperties() : loginProperties;
        String trackId = (i & 2) != 0 ? authTrack.getTrackId() : str;
        String login = (i & 4) != 0 ? authTrack.getLogin() : str2;
        boolean z5 = (i & 8) != 0 ? authTrack.syntheticLogin : z;
        String password = (i & 16) != 0 ? authTrack.getPassword() : str3;
        String str10 = (i & 32) != 0 ? authTrack.maskedLogin : str4;
        ModernAccount modernAccount2 = (i & 64) != 0 ? authTrack.accountForRelogin : modernAccount;
        AccountType accountType2 = (i & 128) != 0 ? authTrack.accountType : accountType;
        List list2 = (i & 256) != 0 ? authTrack.authMethods : list;
        String str11 = (i & 512) != 0 ? authTrack.magicLinkEmail : str5;
        AnalyticsFromValue analyticsFromValue2 = (i & 1024) != 0 ? authTrack.analyticalFrom : analyticsFromValue;
        String phoneNumber = (i & 2048) != 0 ? authTrack.getPhoneNumber() : str6;
        boolean z6 = (i & 4096) != 0 ? authTrack.allowMagicLink : z2;
        String str12 = (i & 8192) != 0 ? authTrack.maskedPhoneNumber : str7;
        LoginProperties loginProperties2 = properties;
        String str13 = (i & 16384) != 0 ? authTrack.suggestedLanguage : str8;
        AuthTrack authTrack3 = (i & 32768) != 0 ? authTrack.previousTrack : authTrack2;
        String str14 = (i & 65536) != 0 ? authTrack.avatarUrl : str9;
        UnsubscribeMailingStatus unsubscribeMailingStatus3 = (i & 131072) != 0 ? authTrack.unsubscribeMailing : unsubscribeMailingStatus;
        if ((i & 262144) != 0) {
            unsubscribeMailingStatus2 = unsubscribeMailingStatus3;
            z4 = authTrack.nativeToBrowserAuthRequested;
        } else {
            z4 = z3;
            unsubscribeMailingStatus2 = unsubscribeMailingStatus3;
        }
        return authTrack.with(loginProperties2, trackId, login, z5, password, str10, modernAccount2, accountType2, list2, str11, analyticsFromValue2, phoneNumber, z6, str12, str13, authTrack3, str14, unsubscribeMailingStatus2, z4);
    }

    public static /* synthetic */ AuthTrack withLogin$default(AuthTrack authTrack, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return authTrack.withLogin(str, z);
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

    public final boolean getAllowMagicLink() {
        return this.allowMagicLink;
    }

    public final List<AuthMethod> getAuthMethods() {
        return this.authMethods;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getLogin() {
        return this.login;
    }

    public final String getMagicLinkEmail() {
        return this.magicLinkEmail;
    }

    public final String getMaskedLogin() {
        return this.maskedLogin;
    }

    public final String getMaskedPhoneNumber() {
        return this.maskedPhoneNumber;
    }

    public final boolean getNativeToBrowserAuthRequested() {
        return this.nativeToBrowserAuthRequested;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getPassword() {
        return this.password;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final AuthTrack getPreviousTrack() {
        return this.previousTrack;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public LoginProperties getProperties() {
        return this.properties;
    }

    public final String getSuggestedLanguage() {
        return this.suggestedLanguage;
    }

    public final boolean getSyntheticLogin() {
        return this.syntheticLogin;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public String getTrackId() {
        return this.trackId;
    }

    public final UnsubscribeMailingStatus getUnsubscribeMailing() {
        return this.unsubscribeMailing;
    }

    public final boolean isRelogin() {
        return this.accountForRelogin != null;
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public Environment requireEnvironment() {
        return getLogin() != null ? determineEnvironment(getLogin()) : com.yandex.passport.internal.util.p.u(getProperties().getFilter().getPrimaryEnvironment());
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public AuthTrack toAuthTrack() {
        return this;
    }

    public final AuthTrack with(LoginProperties properties, String trackId, String login, boolean syntheticLogin, String password, String maskedLogin, ModernAccount accountForRelogin, AccountType accountType, List<? extends AuthMethod> authMethods, String magicLinkEmail, AnalyticsFromValue analyticalFrom, String phoneNumber, boolean allowMagicLink, String maskedPhoneNumber, String suggestedLanguage, AuthTrack previousTrack, String avatarUrl, UnsubscribeMailingStatus unsubscribeMailing, boolean nativeToBrowserAuthRequested) {
        return new AuthTrack(properties, trackId, login, syntheticLogin, password, maskedLogin, accountForRelogin, accountType, authMethods, magicLinkEmail, analyticalFrom, phoneNumber, allowMagicLink, maskedPhoneNumber, suggestedLanguage, previousTrack, avatarUrl, unsubscribeMailing, nativeToBrowserAuthRequested);
    }

    public final AuthTrack withAccountType(AccountType accountType) {
        return with$default(this, null, null, null, false, null, null, null, accountType, null, null, null, null, false, null, null, null, null, null, false, 524159, null);
    }

    public final AuthTrack withAllowMagicLink(boolean allowMagicLink) {
        return with$default(this, null, null, null, false, null, null, null, null, null, null, null, null, allowMagicLink, null, null, null, null, null, false, 520191, null);
    }

    public final AuthTrack withAuthMethods(List<? extends AuthMethod> authMethods) {
        return with$default(this, null, null, null, false, null, null, null, null, authMethods, null, null, null, false, null, null, null, null, null, false, 524031, null);
    }

    public final AuthTrack withLogin(String login, boolean syntheticLogin) {
        return with$default(this, null, null, login, syntheticLogin, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, 524275, null);
    }

    public final AuthTrack withMagicLinkEmail(String magicLinkEmail) {
        return with$default(this, null, null, null, false, null, null, null, null, null, magicLinkEmail, null, null, false, null, null, null, null, null, false, 523775, null);
    }

    public final AuthTrack withMaskedLogin(String maskedLogin) {
        return with$default(this, null, null, null, false, null, maskedLogin, null, null, null, null, null, null, false, null, null, null, null, null, false, 524255, null);
    }

    public final AuthTrack withMaskedPhoneNumber(String maskedPhoneNumber) {
        return with$default(this, null, null, null, false, null, null, null, null, null, null, null, null, false, maskedPhoneNumber, null, null, null, null, false, 516095, null);
    }

    public final AuthTrack withPassword(String password) {
        return with$default(this, null, null, null, false, password, null, null, null, null, null, null, null, false, null, null, null, null, null, false, 524271, null);
    }

    @Override // com.yandex.passport.internal.ui.domik.BaseTrack
    public AuthTrack withPhoneNumber(String phoneNumber) {
        return with$default(this, null, null, null, false, null, null, null, null, null, null, null, phoneNumber, false, null, null, null, null, null, false, 522239, null);
    }

    public final AuthTrack withRelogin(ModernAccount accountForRelogin) {
        return with$default(this, null, null, null, false, null, null, accountForRelogin, null, null, null, null, null, false, null, null, null, null, null, false, 524223, null);
    }

    public final AuthTrack withSuggestedLanguage(String suggestedLanguage) {
        return with$default(this, null, null, null, false, null, null, null, null, null, null, null, null, false, null, suggestedLanguage, null, null, null, false, 507903, null);
    }

    public final AuthTrack withTrackId(String trackId) {
        return with$default(this, null, trackId, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, 524285, null);
    }

    public final AuthTrack withUnsubscribeMailing(UnsubscribeMailingStatus value) {
        UnsubscribeMailingStatus unsubscribeMailingStatus = this.unsubscribeMailing;
        unsubscribeMailingStatus.getClass();
        UnsubscribeMailingStatus unsubscribeMailingStatus2 = UnsubscribeMailingStatus.NOT_SHOWED;
        return with$default(this, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, (unsubscribeMailingStatus == unsubscribeMailingStatus2 || value != unsubscribeMailingStatus2) ? value : unsubscribeMailingStatus, false, 393215, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.properties.writeToParcel(dest, flags);
        dest.writeString(this.trackId);
        dest.writeString(this.login);
        dest.writeInt(this.syntheticLogin ? 1 : 0);
        dest.writeString(this.password);
        dest.writeString(this.maskedLogin);
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
        List<AuthMethod> list = this.authMethods;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator m = oo31.m(dest, 1, list);
            while (m.hasNext()) {
                dest.writeString(((AuthMethod) m.next()).name());
            }
        }
        dest.writeString(this.magicLinkEmail);
        this.analyticalFrom.writeToParcel(dest, flags);
        dest.writeString(this.phoneNumber);
        dest.writeInt(this.allowMagicLink ? 1 : 0);
        dest.writeString(this.maskedPhoneNumber);
        dest.writeString(this.suggestedLanguage);
        AuthTrack authTrack = this.previousTrack;
        if (authTrack == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            authTrack.writeToParcel(dest, flags);
        }
        dest.writeString(this.avatarUrl);
        dest.writeString(this.unsubscribeMailing.name());
        dest.writeInt(this.nativeToBrowserAuthRequested ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthTrack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthTrack createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            AuthTrack authTrack;
            boolean z2;
            LoginProperties createFromParcel = LoginProperties.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ModernAccount createFromParcel2 = parcel.readInt() == 0 ? null : ModernAccount.CREATOR.createFromParcel(parcel);
            AccountType valueOf = parcel.readInt() == 0 ? null : AccountType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AuthMethod.valueOf(parcel.readString()));
                }
            }
            String readString5 = parcel.readString();
            AnalyticsFromValue createFromParcel3 = AnalyticsFromValue.CREATOR.createFromParcel(parcel);
            AccountType accountType = valueOf;
            ArrayList arrayList2 = arrayList;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                authTrack = null;
                z2 = z;
            } else {
                authTrack = null;
                z2 = false;
            }
            return new AuthTrack(createFromParcel, readString, readString2, z3, readString3, readString4, createFromParcel2, accountType, arrayList2, readString5, createFromParcel3, readString6, z2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? authTrack : AuthTrack.CREATOR.createFromParcel(parcel), parcel.readString(), UnsubscribeMailingStatus.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthTrack[] newArray(int i) {
            return new AuthTrack[i];
        }
    }

    public final AuthTrack withLogin(String str) {
        return withLogin$default(this, str, false, 2, null);
    }
}
