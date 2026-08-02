package com.yandex.passport.internal.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.network.t;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.uo2;
import defpackage.x96;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes8.dex */
public final class i {
    public static final /* synthetic */ kgx[] m = {new MutablePropertyReference1Impl("pushTokenVersion", 0, "getPushTokenVersion()Ljava/lang/String;", i.class), oyr.B(qoi0.a, i.class, "currentAccountName", "getCurrentAccountName()Ljava/lang/String;", 0), new MutablePropertyReference1Impl("currentAccountUid", 0, "getCurrentAccountUid()Lcom/yandex/passport/common/core/Uid;", i.class), new MutablePropertyReference1Impl("authenticatorPackageName", 0, "getAuthenticatorPackageName()Ljava/lang/String;", i.class), new MutablePropertyReference1Impl("smsCode", 0, "getSmsCode()Ljava/lang/String;", i.class), new MutablePropertyReference1Impl("smsFrom", 0, "getSmsFrom()Ljava/lang/String;", i.class), new MutablePropertyReference1Impl("isAutoLoginFromCredentialManagerDisabled", 0, "isAutoLoginFromCredentialManagerDisabled()Z", i.class), new MutablePropertyReference1Impl("latestPassportVersion", 0, "getLatestPassportVersion()I", i.class), new MutablePropertyReference1Impl("masterTokenKey", 0, "getMasterTokenKey()Ljava/lang/String;", i.class), new MutablePropertyReference1Impl("webAmSessionIndicator", 0, "getWebAmSessionIndicator()Z", i.class), new MutablePropertyReference1Impl("lastCoreActivationTime", 0, "getLastCoreActivationTime()J", i.class), new MutablePropertyReference1Impl("accountCount", 0, "getAccountCount()I", i.class)};
    public final SharedPreferences a;
    public final uo2 b;
    public final uo2 c;
    public final uo2 d;
    public final uo2 e;
    public final uo2 f;
    public final uo2 g;
    public final x96 h;
    public final x96 i;
    public final uo2 j;
    public final x96 k;
    public final x96 l;

    public i(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("yandex_am_storage", 0);
        this.a = sharedPreferences;
        this.b = new uo2(sharedPreferences, null, "lib_saved_version", false, PreferenceStorage$special$$inlined$optionalStringPreference$default$1.b, e.a);
        this.c = new uo2(sharedPreferences, null, "current_account_name", false, PreferenceStorage$special$$inlined$optionalStringPreference$default$3.b, f.a);
        this.d = new uo2(sharedPreferences, null, "current_account_uid", false, new PreferenceStorage$currentAccountUid$2(1, com.yandex.passport.internal.serialization.b.a, com.yandex.passport.internal.serialization.b.class, "from", "from(Ljava/lang/String;)Lcom/yandex/passport/common/core/Uid;", 0), new t(16));
        this.e = new uo2(sharedPreferences, null, "authenticator_package_name", true, PreferenceStorage$special$$inlined$optionalStringPreference$default$5.b, g.a);
        this.f = new uo2(sharedPreferences, null, "sms_code", false, PreferenceStorage$special$$inlined$optionalStringPreference$default$7.b, h.a);
        this.g = new uo2(sharedPreferences, null, "sms_from", false, PreferenceStorage$special$$inlined$optionalStringPreference$default$9.b, c.a);
        this.h = new x96(sharedPreferences, "is_auto_login_from_smartlock_disabled", false);
        this.i = new x96(-1, sharedPreferences, "latest_passport_version");
        this.j = new uo2(sharedPreferences, null, "master_token_key", false, PreferenceStorage$special$$inlined$optionalStringPreference$default$11.b, d.a);
        this.k = new x96(sharedPreferences, (Object) 0L, "core_activation_sending_time");
        this.l = new x96(0, sharedPreferences, "account_count");
    }

    public final int a() {
        return ((Number) this.l.getValue(this, m[11])).intValue();
    }

    public final Uid b() {
        return (Uid) this.d.getValue(this, m[2]);
    }
}
