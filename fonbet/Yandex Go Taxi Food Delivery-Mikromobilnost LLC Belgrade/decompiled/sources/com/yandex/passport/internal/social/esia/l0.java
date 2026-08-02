package com.yandex.passport.internal.social.esia;

import com.adjust.sdk.Constants;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jwu;
import defpackage.ny61;
import defpackage.vg10;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class l0 {
    public final com.yandex.passport.data.network.core.h a;

    public l0(com.yandex.passport.data.network.core.h hVar) {
        this.a = hVar;
    }

    public static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (('A' > charAt || charAt >= '[') && (('a' > charAt || charAt >= '{') && !(('0' <= charAt && charAt < ':') || charAt == '-' || charAt == '.' || charAt == '_' || charAt == '~' || charAt == '%' || charAt == '+'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jwu jwuVar, ContinuationImpl continuationImpl) {
        SocialismUrlProvider$appendCommonAmQueryParameters$1 socialismUrlProvider$appendCommonAmQueryParameters$1;
        int i;
        if (continuationImpl instanceof SocialismUrlProvider$appendCommonAmQueryParameters$1) {
            socialismUrlProvider$appendCommonAmQueryParameters$1 = (SocialismUrlProvider$appendCommonAmQueryParameters$1) continuationImpl;
            int i2 = socialismUrlProvider$appendCommonAmQueryParameters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                socialismUrlProvider$appendCommonAmQueryParameters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = socialismUrlProvider$appendCommonAmQueryParameters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = socialismUrlProvider$appendCommonAmQueryParameters$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    socialismUrlProvider$appendCommonAmQueryParameters$1.L$0 = jwuVar;
                    socialismUrlProvider$appendCommonAmQueryParameters$1.label = 1;
                    return this.a.c(jwuVar, socialismUrlProvider$appendCommonAmQueryParameters$1) == coroutineSingletons ? coroutineSingletons : jwuVar;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jwu jwuVar2 = (jwu) socialismUrlProvider$appendCommonAmQueryParameters$1.L$0;
                kotlin.b.b(obj);
                return jwuVar2;
            }
        }
        socialismUrlProvider$appendCommonAmQueryParameters$1 = new SocialismUrlProvider$appendCommonAmQueryParameters$1(this, continuationImpl);
        Object obj2 = socialismUrlProvider$appendCommonAmQueryParameters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = socialismUrlProvider$appendCommonAmQueryParameters$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, Environment environment, SocialismUrlProvider$ActualTheme socialismUrlProvider$ActualTheme, ContinuationImpl continuationImpl) {
        SocialismUrlProvider$provideRedirectUrl$1 socialismUrlProvider$provideRedirectUrl$1;
        int i;
        if (continuationImpl instanceof SocialismUrlProvider$provideRedirectUrl$1) {
            socialismUrlProvider$provideRedirectUrl$1 = (SocialismUrlProvider$provideRedirectUrl$1) continuationImpl;
            int i2 = socialismUrlProvider$provideRedirectUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                socialismUrlProvider$provideRedirectUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = socialismUrlProvider$provideRedirectUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = socialismUrlProvider$provideRedirectUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jwu jwuVar = new jwu();
                    jwuVar.o(Constants.SCHEME);
                    jwuVar.h(environment == Environment.PRODUCTION ? "social.yandex.ru" : "social-test.yandex.ru");
                    jwuVar.k(0, 6, "broker", false, true);
                    jwuVar.k(0, 8, "redirect", false, true);
                    jwuVar.a(AuthSdkActivity.RESPONSE_TYPE_CODE, str);
                    jwuVar.a(ClidProvider.STATE, str2);
                    socialismUrlProvider$provideRedirectUrl$1.L$0 = socialismUrlProvider$ActualTheme;
                    socialismUrlProvider$provideRedirectUrl$1.label = 1;
                    obj = a(jwuVar, socialismUrlProvider$provideRedirectUrl$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    socialismUrlProvider$ActualTheme = (SocialismUrlProvider$ActualTheme) socialismUrlProvider$provideRedirectUrl$1.L$0;
                    kotlin.b.b(obj);
                }
                jwu jwuVar2 = (jwu) obj;
                jwuVar2.d(DivkitThemeChangeListener.THEME_VARIABLE_NAME, socialismUrlProvider$ActualTheme.name().toLowerCase(Locale.ROOT));
                return jwuVar2.e().i;
            }
        }
        socialismUrlProvider$provideRedirectUrl$1 = new SocialismUrlProvider$provideRedirectUrl$1(this, continuationImpl);
        Object obj3 = socialismUrlProvider$provideRedirectUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = socialismUrlProvider$provideRedirectUrl$1.label;
        if (i != 0) {
        }
        jwu jwuVar22 = (jwu) obj3;
        jwuVar22.d(DivkitThemeChangeListener.THEME_VARIABLE_NAME, socialismUrlProvider$ActualTheme.name().toLowerCase(Locale.ROOT));
        return jwuVar22.e().i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Environment environment, String str, String str2, String str3, SocialismUrlProvider$ActualTheme socialismUrlProvider$ActualTheme, String str4, ContinuationImpl continuationImpl) {
        SocialismUrlProvider$provideStartUrlForUserAware$1 socialismUrlProvider$provideStartUrlForUserAware$1;
        int i;
        if (continuationImpl instanceof SocialismUrlProvider$provideStartUrlForUserAware$1) {
            socialismUrlProvider$provideStartUrlForUserAware$1 = (SocialismUrlProvider$provideStartUrlForUserAware$1) continuationImpl;
            int i2 = socialismUrlProvider$provideStartUrlForUserAware$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                socialismUrlProvider$provideStartUrlForUserAware$1.label = i2 - Integer.MIN_VALUE;
                Object obj = socialismUrlProvider$provideStartUrlForUserAware$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = socialismUrlProvider$provideStartUrlForUserAware$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str5 = b(str) ? str : null;
                    if (str5 == null) {
                        vg10.d("Invalid parameter value for 'application': ".concat(str));
                        return null;
                    }
                    String str6 = b(str2) ? str2 : null;
                    if (str6 == null) {
                        vg10.d("Invalid parameter value for 'consumer': ".concat(str2));
                        return null;
                    }
                    String str7 = b(str3) ? str3 : null;
                    if (str7 == null) {
                        vg10.d("Invalid parameter value for 'scope': ".concat(str3));
                        return null;
                    }
                    String str8 = environment == Environment.PRODUCTION ? "social.yandex.ru" : "social-test.yandex.ru";
                    jwu jwuVar = new jwu();
                    jwuVar.o(Constants.SCHEME);
                    jwuVar.h(str8);
                    jwuVar.b("broker2");
                    jwuVar.b("start");
                    jwuVar.d("provider", "esia");
                    jwuVar.a(ClidProvider.APPLICATION, str5);
                    jwuVar.a("consumer", str6);
                    jwuVar.d("bind", "1");
                    jwuVar.a("scope", str7);
                    if (str4 != null) {
                        jwuVar.d("app_to_app_return_url", str4);
                    }
                    jwuVar.d("retpath", "https://passport.yandex.ru/closewebview");
                    socialismUrlProvider$provideStartUrlForUserAware$1.L$0 = socialismUrlProvider$ActualTheme;
                    socialismUrlProvider$provideStartUrlForUserAware$1.label = 1;
                    obj = a(jwuVar, socialismUrlProvider$provideStartUrlForUserAware$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    socialismUrlProvider$ActualTheme = (SocialismUrlProvider$ActualTheme) socialismUrlProvider$provideStartUrlForUserAware$1.L$0;
                    kotlin.b.b(obj);
                }
                jwu jwuVar2 = (jwu) obj;
                jwuVar2.d(DivkitThemeChangeListener.THEME_VARIABLE_NAME, socialismUrlProvider$ActualTheme.name().toLowerCase(Locale.ROOT));
                String str9 = jwuVar2.e().i;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Socialism binding flow start url: ".concat(str9), 8);
                }
                return str9;
            }
        }
        socialismUrlProvider$provideStartUrlForUserAware$1 = new SocialismUrlProvider$provideStartUrlForUserAware$1(this, continuationImpl);
        Object obj3 = socialismUrlProvider$provideStartUrlForUserAware$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = socialismUrlProvider$provideStartUrlForUserAware$1.label;
        if (i != 0) {
        }
        jwu jwuVar22 = (jwu) obj3;
        jwuVar22.d(DivkitThemeChangeListener.THEME_VARIABLE_NAME, socialismUrlProvider$ActualTheme.name().toLowerCase(Locale.ROOT));
        String str92 = jwuVar22.e().i;
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        return str92;
    }
}
