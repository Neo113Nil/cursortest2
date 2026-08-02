package com.ybsdk.feature.passport.impl;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$SetupPinSavePinResultResult;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechSaveDeviceIdStashResultResult;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechRequestCookieAuthUrlResultResult;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.passport.api.PassportAuthorizationUrlError;
import com.ybsdk.feature.passport.api.adapter.PassportReloginRequiredException;
import com.ybsdk.feature.passport.api.adapter.PassportStashCell;
import defpackage.csf0;
import defpackage.dzh0;
import defpackage.em3;
import defpackage.evu0;
import defpackage.fp90;
import defpackage.g8e;
import defpackage.gw41;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.unr0;
import defpackage.ws51;
import defpackage.x4c;
import defpackage.ym90;
import defpackage.zy11;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.InitializedLazyImpl;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class a implements ppp0 {
    public final com.ybsdk.adapters.passportsdk.impl.a a;
    public final InitializedLazyImpl b;
    public final i3y c = kotlin.a.a(new csf0(25, this));

    public a(com.ybsdk.adapters.passportsdk.impl.a aVar, InitializedLazyImpl initializedLazyImpl) {
        this.a = aVar;
        this.b = initializedLazyImpl;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:23|24))(4:25|(1:27)|28|(1:30))|11|12|(1:14)|15|(2:17|(1:19))|20))|33|6|7|(0)(0)|11|12|(0)|15|(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r6 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$dropToken$1 sdkPassportManagerImpl$dropToken$1;
        int i;
        Object failure;
        Throwable a;
        Object a2;
        if (continuationImpl instanceof SdkPassportManagerImpl$dropToken$1) {
            sdkPassportManagerImpl$dropToken$1 = (SdkPassportManagerImpl$dropToken$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$dropToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$dropToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$dropToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$dropToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    AppAnalyticsReporter c = c();
                    if (c != null) {
                        c.d.a.a("authentication.token_drop_initiated", null);
                    }
                    com.ybsdk.adapters.passportsdk.impl.a aVar = this.a;
                    sdkPassportManagerImpl$dropToken$1.label = 1;
                    a2 = aVar.a(str, sdkPassportManagerImpl$dropToken$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a2 = ((Result) obj).getValue();
                }
                b.b(a2);
                failure = zy11.a;
                a = Result.a(failure);
                if (a != null) {
                    x4c.g("failed to drop token", a, "SdkPassportManagerImpl", null, 8);
                }
                if (!(failure instanceof Result.Failure)) {
                    AppAnalyticsReporter c2 = c();
                    if (c2 != null) {
                        c2.d.a.a("authentication.token_dropped", null);
                    }
                }
                return failure;
            }
        }
        sdkPassportManagerImpl$dropToken$1 = new SdkPassportManagerImpl$dropToken$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$dropToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$dropToken$1.label;
        if (i != 0) {
        }
        b.b(a2);
        failure = zy11.a;
        a = Result.a(failure);
        if (a != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$getAccountManagementUri$1 sdkPassportManagerImpl$getAccountManagementUri$1;
        int i;
        if (continuationImpl instanceof SdkPassportManagerImpl$getAccountManagementUri$1) {
            sdkPassportManagerImpl$getAccountManagementUri$1 = (SdkPassportManagerImpl$getAccountManagementUri$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$getAccountManagementUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$getAccountManagementUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$getAccountManagementUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$getAccountManagementUri$1.label;
                if (i != 0) {
                    b.b(obj);
                    sdkPassportManagerImpl$getAccountManagementUri$1.label = 1;
                    Object c = this.a.c(j, sdkPassportManagerImpl$getAccountManagementUri$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sdkPassportManagerImpl$getAccountManagementUri$1 = new SdkPassportManagerImpl$getAccountManagementUri$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$getAccountManagementUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$getAccountManagementUri$1.label;
        if (i != 0) {
        }
    }

    public final AppAnalyticsReporter c() {
        return (AppAnalyticsReporter) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(long j, String str, String str2, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$getAuthorizationUrl$1 sdkPassportManagerImpl$getAuthorizationUrl$1;
        int i;
        Object d;
        long j2;
        AppAnalyticsReporter c;
        Throwable a;
        if (continuationImpl instanceof SdkPassportManagerImpl$getAuthorizationUrl$1) {
            sdkPassportManagerImpl$getAuthorizationUrl$1 = (SdkPassportManagerImpl$getAuthorizationUrl$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$getAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$getAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                SdkPassportManagerImpl$getAuthorizationUrl$1 sdkPassportManagerImpl$getAuthorizationUrl$12 = sdkPassportManagerImpl$getAuthorizationUrl$1;
                Object obj = sdkPassportManagerImpl$getAuthorizationUrl$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$getAuthorizationUrl$12.label;
                if (i != 0) {
                    b.b(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    AppAnalyticsReporter c2 = c();
                    if (c2 != null) {
                        c2.v0.a.a("tech.request_cookie_auth_url.start", g8e.w(2, "retpath", str));
                    }
                    sdkPassportManagerImpl$getAuthorizationUrl$12.L$0 = str;
                    sdkPassportManagerImpl$getAuthorizationUrl$12.J$0 = currentTimeMillis;
                    sdkPassportManagerImpl$getAuthorizationUrl$12.label = 1;
                    d = this.a.d(j, str2, str, sdkPassportManagerImpl$getAuthorizationUrl$12);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j2 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = sdkPassportManagerImpl$getAuthorizationUrl$12.J$0;
                    str = (String) sdkPassportManagerImpl$getAuthorizationUrl$12.L$0;
                    b.b(obj);
                    d = ((Result) obj).getValue();
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j2;
                c = c();
                if (c != null) {
                    gw41 gw41Var = c.v0;
                    String valueOf = String.valueOf(currentTimeMillis2);
                    WebviewEvents$TechRequestCookieAuthUrlResultResult webviewEvents$TechRequestCookieAuthUrlResultResult = !(d instanceof Result.Failure) ? WebviewEvents$TechRequestCookieAuthUrlResultResult.OK : WebviewEvents$TechRequestCookieAuthUrlResultResult.ERROR;
                    Throwable a2 = Result.a(d);
                    String message = a2 != null ? a2.getMessage() : null;
                    LinkedHashMap w = g8e.w(5, "retpath", str);
                    if (valueOf != null) {
                        w.put("duration", valueOf);
                    }
                    w.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechRequestCookieAuthUrlResultResult.getOriginalValue());
                    if (message != null) {
                        w.put("error", message);
                    }
                    gw41Var.a.a("tech.request_cookie_auth_url.result", w);
                }
                a = Result.a(d);
                if (a != null) {
                    return (String) d;
                }
                x4c.g("Unable to create passport auth url", a, str, null, 8);
                return new Result.Failure(new PassportAuthorizationUrlError(a, a instanceof PassportReloginRequiredException));
            }
        }
        sdkPassportManagerImpl$getAuthorizationUrl$1 = new SdkPassportManagerImpl$getAuthorizationUrl$1(this, continuationImpl);
        SdkPassportManagerImpl$getAuthorizationUrl$1 sdkPassportManagerImpl$getAuthorizationUrl$122 = sdkPassportManagerImpl$getAuthorizationUrl$1;
        Object obj2 = sdkPassportManagerImpl$getAuthorizationUrl$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$getAuthorizationUrl$122.label;
        if (i != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j2;
        c = c();
        if (c != null) {
        }
        a = Result.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$getDeviceIdData$1 sdkPassportManagerImpl$getDeviceIdData$1;
        int i;
        if (continuationImpl instanceof SdkPassportManagerImpl$getDeviceIdData$1) {
            sdkPassportManagerImpl$getDeviceIdData$1 = (SdkPassportManagerImpl$getDeviceIdData$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$getDeviceIdData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$getDeviceIdData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$getDeviceIdData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$getDeviceIdData$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                PassportStashCell passportStashCell = PassportStashCell.PIN;
                sdkPassportManagerImpl$getDeviceIdData$1.label = 1;
                Object e = this.a.e(j, passportStashCell, sdkPassportManagerImpl$getDeviceIdData$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        sdkPassportManagerImpl$getDeviceIdData$1 = new SdkPassportManagerImpl$getDeviceIdData$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$getDeviceIdData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$getDeviceIdData$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$getPin$1 sdkPassportManagerImpl$getPin$1;
        int i;
        if (continuationImpl instanceof SdkPassportManagerImpl$getPin$1) {
            sdkPassportManagerImpl$getPin$1 = (SdkPassportManagerImpl$getPin$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$getPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$getPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$getPin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$getPin$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                PassportStashCell passportStashCell = PassportStashCell.PIN_2;
                sdkPassportManagerImpl$getPin$1.label = 1;
                Object e = this.a.e(j, passportStashCell, sdkPassportManagerImpl$getPin$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        sdkPassportManagerImpl$getPin$1 = new SdkPassportManagerImpl$getPin$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$getPin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$getPin$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$getUserInfo$1 sdkPassportManagerImpl$getUserInfo$1;
        int i;
        Object b;
        if (continuationImpl instanceof SdkPassportManagerImpl$getUserInfo$1) {
            sdkPassportManagerImpl$getUserInfo$1 = (SdkPassportManagerImpl$getUserInfo$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$getUserInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$getUserInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$getUserInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$getUserInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    sdkPassportManagerImpl$getUserInfo$1.label = 1;
                    b = this.a.b(j, sdkPassportManagerImpl$getUserInfo$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    return b;
                }
                ym90 ym90Var = (ym90) b;
                com.ybsdk.core.utils.text.b bVar = Text.Companion;
                String c = ym90Var.c();
                if (c == null) {
                    c = "";
                }
                String e = ym90Var.e();
                String obj2 = evu0.k0(c + " " + (e != null ? e : "")).toString();
                if (obj2.length() == 0) {
                    obj2 = ym90Var.f();
                }
                Text.Constant i3 = g8e.i(bVar, obj2);
                String g = ym90Var.g();
                Text constant = g != null ? new Text.Constant(g) : new Text.Resource(dzh0.ybsdk_dashboard_menu_userinfo_email_placeholder);
                long h = ym90Var.h();
                String c2 = ym90Var.c();
                String e2 = ym90Var.e();
                if (e2 != null && e2.length() != 0 && c2 != null && c2.length() != 0) {
                    c2 = unr0.o(c2, " ", String.valueOf(e2.charAt(0)).toUpperCase(Locale.ROOT), Extension.DOT_CHAR);
                }
                return new ws51(h, i3, c2 != null ? new Text.Constant(evu0.k0(c2).toString()) : null, constant, ym90Var.a(), ym90Var.d(), ym90Var.i(), ym90Var.b());
            }
        }
        sdkPassportManagerImpl$getUserInfo$1 = new SdkPassportManagerImpl$getUserInfo$1(this, continuationImpl);
        Object obj3 = sdkPassportManagerImpl$getUserInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$getUserInfo$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, String str, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$injectCookie$1 sdkPassportManagerImpl$injectCookie$1;
        int i;
        if (continuationImpl instanceof SdkPassportManagerImpl$injectCookie$1) {
            sdkPassportManagerImpl$injectCookie$1 = (SdkPassportManagerImpl$injectCookie$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$injectCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$injectCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$injectCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$injectCookie$1.label;
                if (i != 0) {
                    b.b(obj);
                    sdkPassportManagerImpl$injectCookie$1.label = 1;
                    Object h = this.a.h(j, str, sdkPassportManagerImpl$injectCookie$1);
                    return h == coroutineSingletons ? coroutineSingletons : h;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sdkPassportManagerImpl$injectCookie$1 = new SdkPassportManagerImpl$injectCookie$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$injectCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$injectCookie$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|8|(1:(1:11)(2:24|25))(4:26|(1:28)|29|(1:31))|12|13|(1:15)|16|(2:18|(1:20))|21))|35|6|7|8|(0)(0)|12|13|(0)|16|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r10 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, String str, String str2, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$requestNewToken$1 sdkPassportManagerImpl$requestNewToken$1;
        int i;
        Object failure;
        Throwable a;
        Object g;
        if (continuationImpl instanceof SdkPassportManagerImpl$requestNewToken$1) {
            sdkPassportManagerImpl$requestNewToken$1 = (SdkPassportManagerImpl$requestNewToken$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$requestNewToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$requestNewToken$1.label = i2 - Integer.MIN_VALUE;
                SdkPassportManagerImpl$requestNewToken$1 sdkPassportManagerImpl$requestNewToken$12 = sdkPassportManagerImpl$requestNewToken$1;
                Object obj = sdkPassportManagerImpl$requestNewToken$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$requestNewToken$12.label;
                if (i != 0) {
                    b.b(obj);
                    AppAnalyticsReporter c = c();
                    if (c != null) {
                        c.d.a.a("authentication.new_token_requested", null);
                    }
                    com.ybsdk.adapters.passportsdk.impl.a aVar = this.a;
                    sdkPassportManagerImpl$requestNewToken$12.label = 1;
                    g = aVar.g(j, str, str2, sdkPassportManagerImpl$requestNewToken$12);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    g = ((Result) obj).getValue();
                }
                b.b(g);
                failure = new fp90((String) g);
                a = Result.a(failure);
                if (a != null) {
                    x4c.g("failed to get token", a, "SdkPassportManagerImpl", null, 8);
                }
                if (!(failure instanceof Result.Failure)) {
                    AppAnalyticsReporter c2 = c();
                    if (c2 != null) {
                        c2.d.a.a("authentication.new_token_received", null);
                    }
                }
                return failure;
            }
        }
        sdkPassportManagerImpl$requestNewToken$1 = new SdkPassportManagerImpl$requestNewToken$1(this, continuationImpl);
        SdkPassportManagerImpl$requestNewToken$1 sdkPassportManagerImpl$requestNewToken$122 = sdkPassportManagerImpl$requestNewToken$1;
        Object obj2 = sdkPassportManagerImpl$requestNewToken$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$requestNewToken$122.label;
        if (i != 0) {
        }
        b.b(g);
        failure = new fp90((String) g);
        a = Result.a(failure);
        if (a != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(long j, String str, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$saveDeviceIdData$1 sdkPassportManagerImpl$saveDeviceIdData$1;
        int i;
        Object i2;
        String str2;
        AppAnalyticsReporter c;
        if (continuationImpl instanceof SdkPassportManagerImpl$saveDeviceIdData$1) {
            sdkPassportManagerImpl$saveDeviceIdData$1 = (SdkPassportManagerImpl$saveDeviceIdData$1) continuationImpl;
            int i3 = sdkPassportManagerImpl$saveDeviceIdData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$saveDeviceIdData$1.label = i3 - Integer.MIN_VALUE;
                SdkPassportManagerImpl$saveDeviceIdData$1 sdkPassportManagerImpl$saveDeviceIdData$12 = sdkPassportManagerImpl$saveDeviceIdData$1;
                Object obj = sdkPassportManagerImpl$saveDeviceIdData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$saveDeviceIdData$12.label;
                if (i != 0) {
                    b.b(obj);
                    PassportStashCell passportStashCell = PassportStashCell.PIN;
                    sdkPassportManagerImpl$saveDeviceIdData$12.L$0 = str;
                    sdkPassportManagerImpl$saveDeviceIdData$12.label = 1;
                    i2 = this.a.i(j, passportStashCell, str, sdkPassportManagerImpl$saveDeviceIdData$12);
                    if (i2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) sdkPassportManagerImpl$saveDeviceIdData$12.L$0;
                    b.b(obj);
                    i2 = ((Result) obj).getValue();
                }
                if (!(i2 instanceof Result.Failure)) {
                    AppAnalyticsReporter c2 = c();
                    if (c2 != null) {
                        c2.m0.h(str2, TechEvents$TechSaveDeviceIdStashResultResult.OK);
                    }
                }
                if (Result.a(i2) != null && (c = c()) != null) {
                    c.m0.h(str2, TechEvents$TechSaveDeviceIdStashResultResult.FAILED);
                }
                return i2;
            }
        }
        sdkPassportManagerImpl$saveDeviceIdData$1 = new SdkPassportManagerImpl$saveDeviceIdData$1(this, continuationImpl);
        SdkPassportManagerImpl$saveDeviceIdData$1 sdkPassportManagerImpl$saveDeviceIdData$122 = sdkPassportManagerImpl$saveDeviceIdData$1;
        Object obj2 = sdkPassportManagerImpl$saveDeviceIdData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$saveDeviceIdData$122.label;
        if (i != 0) {
        }
        if (!(i2 instanceof Result.Failure)) {
        }
        if (Result.a(i2) != null) {
            c.m0.h(str2, TechEvents$TechSaveDeviceIdStashResultResult.FAILED);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, String str, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$savePin$1 sdkPassportManagerImpl$savePin$1;
        int i;
        Object i2;
        AppAnalyticsReporter c;
        if (continuationImpl instanceof SdkPassportManagerImpl$savePin$1) {
            sdkPassportManagerImpl$savePin$1 = (SdkPassportManagerImpl$savePin$1) continuationImpl;
            int i3 = sdkPassportManagerImpl$savePin$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$savePin$1.label = i3 - Integer.MIN_VALUE;
                SdkPassportManagerImpl$savePin$1 sdkPassportManagerImpl$savePin$12 = sdkPassportManagerImpl$savePin$1;
                Object obj = sdkPassportManagerImpl$savePin$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$savePin$12.label;
                if (i != 0) {
                    b.b(obj);
                    PassportStashCell passportStashCell = PassportStashCell.PIN_2;
                    sdkPassportManagerImpl$savePin$12.label = 1;
                    i2 = this.a.i(j, passportStashCell, str, sdkPassportManagerImpl$savePin$12);
                    if (i2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    i2 = ((Result) obj).getValue();
                }
                if (!(i2 instanceof Result.Failure)) {
                    AppAnalyticsReporter c2 = c();
                    if (c2 != null) {
                        em3 em3Var = c2.S;
                        PinEvents$SetupPinSavePinResultResult pinEvents$SetupPinSavePinResultResult = PinEvents$SetupPinSavePinResultResult.OK;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$SetupPinSavePinResultResult.getOriginalValue());
                        em3Var.a.a("setup_pin.save_pin_result", linkedHashMap);
                    }
                }
                if (Result.a(i2) != null && (c = c()) != null) {
                    em3 em3Var2 = c.S;
                    PinEvents$SetupPinSavePinResultResult pinEvents$SetupPinSavePinResultResult2 = PinEvents$SetupPinSavePinResultResult.ERROR;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                    linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$SetupPinSavePinResultResult2.getOriginalValue());
                    em3Var2.a.a("setup_pin.save_pin_result", linkedHashMap2);
                }
                return i2;
            }
        }
        sdkPassportManagerImpl$savePin$1 = new SdkPassportManagerImpl$savePin$1(this, continuationImpl);
        SdkPassportManagerImpl$savePin$1 sdkPassportManagerImpl$savePin$122 = sdkPassportManagerImpl$savePin$1;
        Object obj2 = sdkPassportManagerImpl$savePin$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$savePin$122.label;
        if (i != 0) {
        }
        if (!(i2 instanceof Result.Failure)) {
        }
        if (Result.a(i2) != null) {
            em3 em3Var22 = c.S;
            PinEvents$SetupPinSavePinResultResult pinEvents$SetupPinSavePinResultResult22 = PinEvents$SetupPinSavePinResultResult.ERROR;
            LinkedHashMap linkedHashMap22 = new LinkedHashMap(1);
            linkedHashMap22.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$SetupPinSavePinResultResult22.getOriginalValue());
            em3Var22.a.a("setup_pin.save_pin_result", linkedHashMap22);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j, String str, ContinuationImpl continuationImpl) {
        SdkPassportManagerImpl$updateCookie$1 sdkPassportManagerImpl$updateCookie$1;
        int i;
        if (continuationImpl instanceof SdkPassportManagerImpl$updateCookie$1) {
            sdkPassportManagerImpl$updateCookie$1 = (SdkPassportManagerImpl$updateCookie$1) continuationImpl;
            int i2 = sdkPassportManagerImpl$updateCookie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPassportManagerImpl$updateCookie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdkPassportManagerImpl$updateCookie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPassportManagerImpl$updateCookie$1.label;
                if (i != 0) {
                    b.b(obj);
                    sdkPassportManagerImpl$updateCookie$1.label = 1;
                    Object j2 = this.a.j(j, str, sdkPassportManagerImpl$updateCookie$1);
                    return j2 == coroutineSingletons ? coroutineSingletons : j2;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        sdkPassportManagerImpl$updateCookie$1 = new SdkPassportManagerImpl$updateCookie$1(this, continuationImpl);
        Object obj2 = sdkPassportManagerImpl$updateCookie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPassportManagerImpl$updateCookie$1.label;
        if (i != 0) {
        }
    }
}
