package com.yandex.passport.internal.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00011B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0011\u0010+\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010!R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;", "Landroid/os/Parcelable;", "", "fromValue", "Lcom/yandex/passport/api/PassportLoginAction;", "loginAction", "", "fromLoginSdk", "<init>", "(Ljava/lang/String;Lcom/yandex/passport/api/PassportLoginAction;Z)V", "value", "withLoginSdk", "(Z)Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcom/yandex/passport/api/PassportLoginAction;Z)Lcom/yandex/passport/internal/analytics/AnalyticsFromValue;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component2", "()Lcom/yandex/passport/api/PassportLoginAction;", "component3", "()Z", "Ljava/lang/String;", "getFromValue", "Lcom/yandex/passport/api/PassportLoginAction;", "Z", "getFromLoginSdkValue", "fromLoginSdkValue", "getFromAction", "fromAction", "Lcom/yandex/passport/internal/analytics/m;", "getEvent", "()Lcom/yandex/passport/internal/analytics/m;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Companion", "com/yandex/passport/internal/analytics/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AnalyticsFromValue implements Parcelable {
    public static final int $stable = 0;
    private static final AnalyticsFromValue AUTH_BY_SMS;
    private static final AnalyticsFromValue AUTH_NEO_PHONISH_LOGIN_RESTORE;
    private static final AnalyticsFromValue AUTOLOGIN;
    private static final AnalyticsFromValue CAPTCHA;
    private static final AnalyticsFromValue CODE;
    private static final AnalyticsFromValue COOKIE_EXTERNAL;
    private static final AnalyticsFromValue COOKIE_EXTERNAL_ACTION;
    private static final AnalyticsFromValue COOKIE_QR_ON_TV;
    private static final AnalyticsFromValue CREDENTIALS;
    private static final AnalyticsFromValue CREDENTIAL_MANAGER;
    private static final AnalyticsFromValue DEVICE_CODE;
    private static final AnalyticsFromValue LOGIN;
    private static final AnalyticsFromValue MAGIC_LINK_AUTH;
    private static final AnalyticsFromValue MAGIC_LINK_REG;
    private static final AnalyticsFromValue MAILISH_EXTERNAL;
    private static final AnalyticsFromValue MAILISH_GIMAP;
    private static final AnalyticsFromValue MAILISH_NATIVE;
    private static final AnalyticsFromValue MAILISH_PASSWORD;
    private static final AnalyticsFromValue MAILISH_WEBVIEW;
    private static final AnalyticsFromValue MUID_LOGIN;
    private static final AnalyticsFromValue PHONISH;
    private static final AnalyticsFromValue RAW_JSON;
    private static final AnalyticsFromValue REGISTRATION;
    private static final AnalyticsFromValue REG_NEO_PHONISH;
    private static final AnalyticsFromValue ROTATION;
    private static final AnalyticsFromValue SLOTH;
    private static final AnalyticsFromValue SOCIAL_BROWSER;
    private static final AnalyticsFromValue SOCIAL_NATIVE;
    private static final AnalyticsFromValue SOCIAL_WEBVIEW;
    private static final AnalyticsFromValue TOTP;
    private static final AnalyticsFromValue TRACK_ID;
    private static final AnalyticsFromValue UPDATE_PHONISH;
    private static final AnalyticsFromValue UPGRADE_LITE_ACCOUNT;
    private static final AnalyticsFromValue UPGRADE_NEO_PHONISH_ACCOUNT;
    private static final AnalyticsFromValue UPGRADE_SOCIAL_ACCOUNT;
    private static final AnalyticsFromValue WEB_LOGIN;
    private final boolean fromLoginSdk;
    private final String fromValue;
    private final PassportLoginAction loginAction;
    public static final a Companion = new a();
    public static final Parcelable.Creator<AnalyticsFromValue> CREATOR = new Creator();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        PassportLoginAction passportLoginAction = PassportLoginAction.PASSWORD;
        LOGIN = new AnalyticsFromValue("Login", passportLoginAction, false, 4, null);
        CAPTCHA = new AnalyticsFromValue("captcha", passportLoginAction, false, 4, null);
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        REGISTRATION = new AnalyticsFromValue("Registration", PassportLoginAction.REGISTRATION, z, i, defaultConstructorMarker);
        CREDENTIAL_MANAGER = new AnalyticsFromValue("credential_manager", passportLoginAction, false, 4, null);
        UPGRADE_SOCIAL_ACCOUNT = new AnalyticsFromValue("upgrade_social_account", 0 == true ? 1 : 0, z, i, defaultConstructorMarker);
        UPGRADE_NEO_PHONISH_ACCOUNT = new AnalyticsFromValue("upgrade_neophonish_account", null, false, 4, null);
        UPGRADE_LITE_ACCOUNT = new AnalyticsFromValue("upgrade_lite_account", null, false, 4, null);
        PHONISH = new AnalyticsFromValue("phonish", PassportLoginAction.PHONISH, false, 4, null);
        TOTP = new AnalyticsFromValue("totp", PassportLoginAction.TOTP, false, 4, null);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        DEVICE_CODE = new AnalyticsFromValue("device_code", null, false, 4, defaultConstructorMarker2);
        COOKIE_EXTERNAL_ACTION = new AnalyticsFromValue("external_action_webview", passportLoginAction, false, 4, null);
        COOKIE_EXTERNAL = new AnalyticsFromValue("cookie", 0 == true ? 1 : 0, false, 4, null);
        COOKIE_QR_ON_TV = new AnalyticsFromValue("qr_on_tv_webview", PassportLoginAction.QR_ON_TV, false, 4, null);
        PassportLoginAction passportLoginAction2 = PassportLoginAction.SOCIAL;
        SOCIAL_BROWSER = new AnalyticsFromValue("social_browser", passportLoginAction2, false, 4, 0 == true ? 1 : 0);
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z2 = false;
        SOCIAL_WEBVIEW = new AnalyticsFromValue("social_webview", passportLoginAction2, z2, i2, defaultConstructorMarker3);
        SOCIAL_NATIVE = new AnalyticsFromValue("social_native", passportLoginAction2, z2, i2, defaultConstructorMarker3);
        CODE = new AnalyticsFromValue(AuthSdkActivity.RESPONSE_TYPE_CODE, null, false, 4, null);
        AUTOLOGIN = new AnalyticsFromValue("autologin", PassportLoginAction.AUTOLOGIN, false, 4, defaultConstructorMarker2);
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        MAILISH_NATIVE = new AnalyticsFromValue("mailish_native", null, false, 4, defaultConstructorMarker4);
        MAILISH_EXTERNAL = new AnalyticsFromValue("mailish_external", null, false, 4, null);
        MAILISH_WEBVIEW = new AnalyticsFromValue("mailish_webview", null, false, 4, null);
        MAILISH_PASSWORD = new AnalyticsFromValue("mailish_password", null, false, 4, null);
        MAILISH_GIMAP = new AnalyticsFromValue("mailish_gimap", PassportLoginAction.MAILISH_GIMAP, false, 4, 0 == true ? 1 : 0);
        CREDENTIALS = new AnalyticsFromValue(AutoLoginRetryActivity.KEY_USER_CREDENTIALS, null, false, 4, null);
        PassportLoginAction passportLoginAction3 = PassportLoginAction.MAGIC_LINK;
        MAGIC_LINK_AUTH = new AnalyticsFromValue("magic_link_auth", passportLoginAction3, false, 4, null);
        int i3 = 4;
        boolean z3 = false;
        MAGIC_LINK_REG = new AnalyticsFromValue("magic_link_reg", passportLoginAction3, z3, i3, defaultConstructorMarker4);
        TRACK_ID = new AnalyticsFromValue("track_id", passportLoginAction3, z3, i3, defaultConstructorMarker4);
        AUTH_BY_SMS = new AnalyticsFromValue("auth_by_sms", PassportLoginAction.SMS, false, 4, null);
        AUTH_NEO_PHONISH_LOGIN_RESTORE = new AnalyticsFromValue("auth_neo_phonish", PassportLoginAction.LOGIN_RESTORE, false, 4, null);
        PassportLoginAction passportLoginAction4 = PassportLoginAction.REG_NEO_PHONISH;
        REG_NEO_PHONISH = new AnalyticsFromValue("reg_neo_phonish", passportLoginAction4, false, 4, null);
        UPDATE_PHONISH = new AnalyticsFromValue("update_phonish", passportLoginAction4, false, 4, null);
        WEB_LOGIN = new AnalyticsFromValue("web_login", passportLoginAction, false, 4, null);
        RAW_JSON = new AnalyticsFromValue(kju0.e, null, false, 4, null);
        SLOTH = new AnalyticsFromValue("sloth", null, false, 4, null);
        ROTATION = new AnalyticsFromValue("rotation", null, false, 4, null);
        MUID_LOGIN = new AnalyticsFromValue("muid", null, false, 4, null);
    }

    public AnalyticsFromValue(String str, PassportLoginAction passportLoginAction, boolean z) {
        this.fromValue = str;
        this.loginAction = passportLoginAction;
        this.fromLoginSdk = z;
    }

    /* renamed from: component2, reason: from getter */
    private final PassportLoginAction getLoginAction() {
        return this.loginAction;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getFromLoginSdk() {
        return this.fromLoginSdk;
    }

    public static /* synthetic */ AnalyticsFromValue copy$default(AnalyticsFromValue analyticsFromValue, String str, PassportLoginAction passportLoginAction, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsFromValue.fromValue;
        }
        if ((i & 2) != 0) {
            passportLoginAction = analyticsFromValue.loginAction;
        }
        if ((i & 4) != 0) {
            z = analyticsFromValue.fromLoginSdk;
        }
        return analyticsFromValue.copy(str, passportLoginAction, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFromValue() {
        return this.fromValue;
    }

    public final AnalyticsFromValue copy(String fromValue, PassportLoginAction loginAction, boolean fromLoginSdk) {
        return new AnalyticsFromValue(fromValue, loginAction, fromLoginSdk);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsFromValue)) {
            return false;
        }
        AnalyticsFromValue analyticsFromValue = (AnalyticsFromValue) other;
        return jl40.l(this.fromValue, analyticsFromValue.fromValue) && this.loginAction == analyticsFromValue.loginAction && this.fromLoginSdk == analyticsFromValue.fromLoginSdk;
    }

    public final m getEvent() {
        return new n(this.fromValue);
    }

    public final PassportLoginAction getFromAction() {
        return this.loginAction;
    }

    public final String getFromLoginSdkValue() {
        return String.valueOf(this.fromLoginSdk);
    }

    public final String getFromValue() {
        return this.fromValue;
    }

    public int hashCode() {
        int hashCode = this.fromValue.hashCode() * 31;
        PassportLoginAction passportLoginAction = this.loginAction;
        return Boolean.hashCode(this.fromLoginSdk) + ((hashCode + (passportLoginAction == null ? 0 : passportLoginAction.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsFromValue(fromValue=");
        sb.append(this.fromValue);
        sb.append(", loginAction=");
        sb.append(this.loginAction);
        sb.append(", fromLoginSdk=");
        return unr0.u(sb, this.fromLoginSdk, ')');
    }

    public final AnalyticsFromValue withLoginSdk(boolean value) {
        return new AnalyticsFromValue(this.fromValue, this.loginAction, value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fromValue);
        PassportLoginAction passportLoginAction = this.loginAction;
        if (passportLoginAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(passportLoginAction.name());
        }
        dest.writeInt(this.fromLoginSdk ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsFromValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnalyticsFromValue createFromParcel(Parcel parcel) {
            return new AnalyticsFromValue(parcel.readString(), parcel.readInt() == 0 ? null : PassportLoginAction.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AnalyticsFromValue[] newArray(int i) {
            return new AnalyticsFromValue[i];
        }
    }

    public /* synthetic */ AnalyticsFromValue(String str, PassportLoginAction passportLoginAction, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, passportLoginAction, (i & 4) != 0 ? false : z);
    }
}
