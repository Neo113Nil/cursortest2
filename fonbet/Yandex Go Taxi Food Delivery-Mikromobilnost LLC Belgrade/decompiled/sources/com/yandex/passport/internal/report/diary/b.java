package com.yandex.passport.internal.report.diary;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.api.AccountListShowMode;
import com.yandex.passport.api.PassportIdentifierHintVariant;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.resources.DrawableResource;
import com.yandex.passport.internal.AnimationTheme;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.entities.TurboAuthParams;
import com.yandex.passport.internal.methods.c3;
import com.yandex.passport.internal.methods.f3;
import com.yandex.passport.internal.methods.i3;
import com.yandex.passport.internal.methods.n3;
import com.yandex.passport.internal.methods.p3;
import com.yandex.passport.internal.methods.q;
import com.yandex.passport.internal.methods.q3;
import com.yandex.passport.internal.methods.u;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.methods.y2;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.properties.AccountNotAuthorizedProperties;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.SetCurrentAccountPropertiesImpl;
import com.yandex.passport.internal.properties.SocialApplicationBindProperties;
import com.yandex.passport.internal.properties.SocialBindProperties;
import com.yandex.passport.internal.properties.SocialRegistrationProperties;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import com.yandex.passport.internal.properties.UserMenuProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import com.yandex.passport.internal.properties.a0;
import com.yandex.passport.internal.properties.s;
import com.yandex.passport.internal.properties.t;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.RoadSign;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.util.p;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.passport.common.a a;
    public final c b;

    public b(com.yandex.passport.common.a aVar, c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0160, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0140, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0120, code lost:
    
        if (r10.p(r2, r9, r11, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
    
        if (p("WebAmProperties", r8, r9, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, String str2, WebAmProperties webAmProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordWebAmProperties$1 diaryArgumentsRecorder$recordWebAmProperties$1;
        int i;
        b bVar;
        WebAmProperties webAmProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordWebAmProperties$1) {
            diaryArgumentsRecorder$recordWebAmProperties$1 = (DiaryArgumentsRecorder$recordWebAmProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordWebAmProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordWebAmProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordWebAmProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordWebAmProperties$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (webAmProperties != null) {
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = this;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str2;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties;
                            diaryArgumentsRecorder$recordWebAmProperties$1.label = 2;
                            break;
                        } else {
                            diaryArgumentsRecorder$recordWebAmProperties$1.label = 1;
                            if (p(webAmProperties, str, str2, diaryArgumentsRecorder$recordWebAmProperties$1) != coroutineSingletons) {
                                return zy11Var;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                    case 7:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    case 2:
                        webAmProperties = (WebAmProperties) diaryArgumentsRecorder$recordWebAmProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordWebAmProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".ignoreUnsupportedLanguageFallback");
                        Boolean valueOf = Boolean.valueOf(webAmProperties.getIgnoreUnsupportedLanguageFallback());
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties;
                        diaryArgumentsRecorder$recordWebAmProperties$1.label = 3;
                        if (this.p(valueOf, str, j, diaryArgumentsRecorder$recordWebAmProperties$1) != coroutineSingletons) {
                            WebAmProperties webAmProperties3 = webAmProperties;
                            bVar = this;
                            webAmProperties2 = webAmProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".ignoreWebViewCrashFallback");
                            Boolean valueOf2 = Boolean.valueOf(webAmProperties2.getIgnoreWebViewCrashFallback());
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties2;
                            diaryArgumentsRecorder$recordWebAmProperties$1.label = 4;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        webAmProperties2 = (WebAmProperties) diaryArgumentsRecorder$recordWebAmProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordWebAmProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".ignoreWebViewCrashFallback");
                        Boolean valueOf22 = Boolean.valueOf(webAmProperties2.getIgnoreWebViewCrashFallback());
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties2;
                        diaryArgumentsRecorder$recordWebAmProperties$1.label = 4;
                        break;
                    case 4:
                        webAmProperties2 = (WebAmProperties) diaryArgumentsRecorder$recordWebAmProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordWebAmProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".ignoreExperimentSettingsFallback");
                        Boolean valueOf3 = Boolean.valueOf(webAmProperties2.getIgnoreExperimentSettingsFallback());
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties2;
                        diaryArgumentsRecorder$recordWebAmProperties$1.label = 5;
                        break;
                    case 5:
                        webAmProperties2 = (WebAmProperties) diaryArgumentsRecorder$recordWebAmProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordWebAmProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".ignoreBackToNativeFallback");
                        Boolean valueOf4 = Boolean.valueOf(webAmProperties2.getIgnoreBackToNativeFallback());
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = webAmProperties2;
                        diaryArgumentsRecorder$recordWebAmProperties$1.label = 6;
                        break;
                    case 6:
                        webAmProperties2 = (WebAmProperties) diaryArgumentsRecorder$recordWebAmProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordWebAmProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordWebAmProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".testId");
                        String testId = webAmProperties2.getTestId();
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordWebAmProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordWebAmProperties$1.label = 7;
                        if (bVar.p(testId, str3, j5, diaryArgumentsRecorder$recordWebAmProperties$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordWebAmProperties$1 = new DiaryArgumentsRecorder$recordWebAmProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordWebAmProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordWebAmProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, AccountListBranding accountListBranding, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAccountListBranding$1 diaryArgumentsRecorder$recordAccountListBranding$1;
        int i;
        String str3;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAccountListBranding$1) {
            diaryArgumentsRecorder$recordAccountListBranding$1 = (DiaryArgumentsRecorder$recordAccountListBranding$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAccountListBranding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAccountListBranding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAccountListBranding$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAccountListBranding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(accountListBranding, AccountListBranding.Yandex.INSTANCE)) {
                        str3 = "Yandex";
                    } else {
                        if (!(accountListBranding instanceof AccountListBranding.Custom)) {
                            w511.b();
                            return null;
                        }
                        str3 = "Custom(resource=" + ((Object) DrawableResource.m272toStringimpl(((AccountListBranding.Custom) accountListBranding).m230getResourcelwcMDYM())) + ')';
                    }
                    Object concat = "AccountListBranding.".concat(str3);
                    diaryArgumentsRecorder$recordAccountListBranding$1.label = 1;
                    if (p(concat, str, str2, diaryArgumentsRecorder$recordAccountListBranding$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        diaryArgumentsRecorder$recordAccountListBranding$1 = new DiaryArgumentsRecorder$recordAccountListBranding$1(this, continuationImpl);
        Object obj3 = diaryArgumentsRecorder$recordAccountListBranding$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAccountListBranding$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0132, code lost:
    
        if (r13.p(r10, r12, r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0113, code lost:
    
        if (r13.p(r2, r12, r14, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
    
        if (r13.a(r12, r14, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (p("AccountListProperties", r11, r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, AccountListProperties accountListProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAccountListProperties$1 diaryArgumentsRecorder$recordAccountListProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        AccountListShowMode showMode;
        b bVar;
        AccountListProperties accountListProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAccountListProperties$1) {
            diaryArgumentsRecorder$recordAccountListProperties$1 = (DiaryArgumentsRecorder$recordAccountListProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAccountListProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAccountListProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAccountListProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAccountListProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = this;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str2;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties;
                    diaryArgumentsRecorder$recordAccountListProperties$1.label = 1;
                } else if (i == 1) {
                    accountListProperties = (AccountListProperties) diaryArgumentsRecorder$recordAccountListProperties$1.L$3;
                    str2 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordAccountListProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } else if (i == 2) {
                    accountListProperties2 = (AccountListProperties) diaryArgumentsRecorder$recordAccountListProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountListProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j2 = b64.j(str4, ".branding");
                    AccountListBranding branding = accountListProperties2.getBranding();
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties2;
                    diaryArgumentsRecorder$recordAccountListProperties$1.label = 3;
                } else if (i == 3) {
                    accountListProperties2 = (AccountListProperties) diaryArgumentsRecorder$recordAccountListProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountListProperties$1.L$0;
                    kotlin.b.b(obj);
                    String j3 = b64.j(str4, ".showCloseButton");
                    Boolean valueOf = Boolean.valueOf(accountListProperties2.getShowCloseButton());
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties2;
                    diaryArgumentsRecorder$recordAccountListProperties$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    accountListProperties2 = (AccountListProperties) diaryArgumentsRecorder$recordAccountListProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountListProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountListProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".markPlusUsers");
                    Boolean valueOf2 = Boolean.valueOf(accountListProperties2.getMarkPlusUsers());
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordAccountListProperties$1.label = 5;
                }
                j = b64.j(str2, ".showMode");
                showMode = accountListProperties.getShowMode();
                diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties;
                diaryArgumentsRecorder$recordAccountListProperties$1.label = 2;
                if (this.p(showMode, str, j, diaryArgumentsRecorder$recordAccountListProperties$1) != coroutineSingletons) {
                    AccountListProperties accountListProperties3 = accountListProperties;
                    bVar = this;
                    accountListProperties2 = accountListProperties3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".branding");
                    AccountListBranding branding2 = accountListProperties2.getBranding();
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties2;
                    diaryArgumentsRecorder$recordAccountListProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordAccountListProperties$1 = new DiaryArgumentsRecorder$recordAccountListProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordAccountListProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAccountListProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str2, ".showMode");
        showMode = accountListProperties.getShowMode();
        diaryArgumentsRecorder$recordAccountListProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordAccountListProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordAccountListProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordAccountListProperties$1.L$3 = accountListProperties;
        diaryArgumentsRecorder$recordAccountListProperties$1.label = 2;
        if (this.p(showMode, str, j, diaryArgumentsRecorder$recordAccountListProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x012a, code lost:
    
        if (r13.l(r12, r11, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010f, code lost:
    
        if (r13.p(r2, r12, r14, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f4, code lost:
    
        if (r13.p(r2, r12, r14, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (p("AccountNotAuthorizedProperties", r11, r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, AccountNotAuthorizedProperties accountNotAuthorizedProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1 diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        PassportUidImpl uid;
        b bVar;
        AccountNotAuthorizedProperties accountNotAuthorizedProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1) {
            diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1 = (DiaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = this;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str2;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 1;
                } else if (i == 1) {
                    accountNotAuthorizedProperties = (AccountNotAuthorizedProperties) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3;
                    str2 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } else if (i == 2) {
                    accountNotAuthorizedProperties2 = (AccountNotAuthorizedProperties) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j2 = b64.j(str4, ".theme");
                    PassportTheme theme = accountNotAuthorizedProperties2.getTheme();
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties2;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 3;
                } else if (i == 3) {
                    accountNotAuthorizedProperties2 = (AccountNotAuthorizedProperties) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j3 = b64.j(str4, ".message");
                    String message = accountNotAuthorizedProperties2.getMessage();
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties2;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    accountNotAuthorizedProperties2 = (AccountNotAuthorizedProperties) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".loginProperties");
                    LoginProperties loginProperties = accountNotAuthorizedProperties2.getLoginProperties();
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 5;
                }
                j = b64.j(str2, ".uid");
                uid = accountNotAuthorizedProperties.getUid();
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties;
                diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 2;
                if (this.p(uid, str, j, diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1) != coroutineSingletons) {
                    AccountNotAuthorizedProperties accountNotAuthorizedProperties3 = accountNotAuthorizedProperties;
                    bVar = this;
                    accountNotAuthorizedProperties2 = accountNotAuthorizedProperties3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".theme");
                    PassportTheme theme2 = accountNotAuthorizedProperties2.getTheme();
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties2;
                    diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1 = new DiaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str2, ".uid");
        uid = accountNotAuthorizedProperties.getUid();
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.L$3 = accountNotAuthorizedProperties;
        diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1.label = 2;
        if (this.p(uid, str, j, diaryArgumentsRecorder$recordAccountNotAuthorizedProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x024c, code lost:
    
        if (r9.p(r6, r8, r7, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x022f, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x020e, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f1, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d4, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b3, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0192, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0171, code lost:
    
        if (r9.p(r2, r8, r10, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        if (p("AuthByQrProperties", r7, r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, AuthByQrProperties authByQrProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAuthByQrProperties$1 diaryArgumentsRecorder$recordAuthByQrProperties$1;
        b bVar;
        AuthByQrProperties authByQrProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAuthByQrProperties$1) {
            diaryArgumentsRecorder$recordAuthByQrProperties$1 = (DiaryArgumentsRecorder$recordAuthByQrProperties$1) continuationImpl;
            int i = diaryArgumentsRecorder$recordAuthByQrProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAuthByQrProperties$1.label = i - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAuthByQrProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (diaryArgumentsRecorder$recordAuthByQrProperties$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 1;
                        break;
                    case 1:
                        authByQrProperties = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".theme");
                        PassportTheme theme = authByQrProperties.getTheme();
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 2;
                        if (this.p(theme, str, j, diaryArgumentsRecorder$recordAuthByQrProperties$1) != coroutineSingletons) {
                            AuthByQrProperties authByQrProperties3 = authByQrProperties;
                            bVar = this;
                            authByQrProperties2 = authByQrProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".environment");
                            PassportEnvironmentImpl environment = authByQrProperties2.getEnvironment();
                            diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                            diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 3;
                            break;
                        }
                        return coroutineSingletons;
                    case 2:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".environment");
                        PassportEnvironmentImpl environment2 = authByQrProperties2.getEnvironment();
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 3;
                        break;
                    case 3:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".isShowSkipButton");
                        Boolean valueOf = Boolean.valueOf(authByQrProperties2.isShowSkipButton());
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 4;
                        break;
                    case 4:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".isShowSettingsButton");
                        Boolean valueOf2 = Boolean.valueOf(authByQrProperties2.isShowSettingsButton());
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 5;
                        break;
                    case 5:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".isFinishWithoutDialogOnError");
                        Boolean valueOf3 = Boolean.valueOf(authByQrProperties2.isFinishWithoutDialogOnError());
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 6;
                        break;
                    case 6:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j6 = b64.j(str4, ".lottieSpinnerResId");
                        Integer lottieSpinnerResId = authByQrProperties2.getLottieSpinnerResId();
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 7;
                        break;
                    case 7:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j7 = b64.j(str4, ".backgroundResId");
                        Integer backgroundResId = authByQrProperties2.getBackgroundResId();
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 8;
                        break;
                    case 8:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j8 = b64.j(str4, ".skipBackButton");
                        Boolean valueOf4 = Boolean.valueOf(authByQrProperties2.getSkipBackButton());
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = authByQrProperties2;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 9;
                        break;
                    case 9:
                        authByQrProperties2 = (AuthByQrProperties) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j9 = b64.j(str4, ".origin");
                        String origin = authByQrProperties2.getOrigin();
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordAuthByQrProperties$1.label = 10;
                        break;
                    case 10:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordAuthByQrProperties$1 = new DiaryArgumentsRecorder$recordAuthByQrProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordAuthByQrProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (diaryArgumentsRecorder$recordAuthByQrProperties$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0158, code lost:
    
        if (r6.p(r0, r2, r1, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0124, code lost:
    
        if (r6.p(r9, r2, r3, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (r6.p(r10, r2, r3, r4) != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r0.p("AuthorizationUrlProperties", r1, r2, r4) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, AuthorizationUrlProperties authorizationUrlProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAuthorizationUrlProperties$1 diaryArgumentsRecorder$recordAuthorizationUrlProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        AuthorizationUrlProperties authorizationUrlProperties2;
        String j;
        String passportUidImpl;
        String str3;
        String str4;
        b bVar;
        AuthorizationUrlProperties authorizationUrlProperties3;
        b bVar2 = this;
        String str5 = str;
        String str6 = str2;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAuthorizationUrlProperties$1) {
            diaryArgumentsRecorder$recordAuthorizationUrlProperties$1 = (DiaryArgumentsRecorder$recordAuthorizationUrlProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar2;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str5;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str6;
                    authorizationUrlProperties2 = authorizationUrlProperties;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties2;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 1;
                } else if (i == 1) {
                    AuthorizationUrlProperties authorizationUrlProperties4 = (AuthorizationUrlProperties) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3;
                    String str7 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2;
                    String str8 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1;
                    b bVar3 = (b) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    str6 = str7;
                    str5 = str8;
                    authorizationUrlProperties2 = authorizationUrlProperties4;
                    bVar2 = bVar3;
                } else if (i == 2) {
                    authorizationUrlProperties3 = (AuthorizationUrlProperties) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j2 = b64.j(str4, ".returnUrl");
                    String returnUrl = authorizationUrlProperties3.getReturnUrl();
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 3;
                } else if (i == 3) {
                    authorizationUrlProperties3 = (AuthorizationUrlProperties) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j3 = b64.j(str4, ".tld");
                    String tld = authorizationUrlProperties3.getTld();
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    authorizationUrlProperties3 = (AuthorizationUrlProperties) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".analyticsParams");
                    String X = kotlin.collections.a.X(authorizationUrlProperties3.getAnalyticsParams().entrySet(), ",", null, null, new com.yandex.passport.internal.core.announcing.f(5), 30);
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 5;
                }
                j = b64.j(str6, ".uid");
                passportUidImpl = authorizationUrlProperties2.getUid().toString();
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar2;
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str5;
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str6;
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties2;
                diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 2;
                if (bVar2.p(passportUidImpl, str5, j, diaryArgumentsRecorder$recordAuthorizationUrlProperties$1) != coroutineSingletons) {
                    String str9 = str6;
                    str3 = str5;
                    str4 = str9;
                    bVar = bVar2;
                    authorizationUrlProperties3 = authorizationUrlProperties2;
                    String j22 = b64.j(str4, ".returnUrl");
                    String returnUrl2 = authorizationUrlProperties3.getReturnUrl();
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties3;
                    diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1 = new DiaryArgumentsRecorder$recordAuthorizationUrlProperties$1(bVar2, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str6, ".uid");
        passportUidImpl = authorizationUrlProperties2.getUid().toString();
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$0 = bVar2;
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$1 = str5;
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$2 = str6;
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.L$3 = authorizationUrlProperties2;
        diaryArgumentsRecorder$recordAuthorizationUrlProperties$1.label = 2;
        if (bVar2.p(passportUidImpl, str5, j, diaryArgumentsRecorder$recordAuthorizationUrlProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0136, code lost:
    
        if (r13.p(r10, r12, r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0117, code lost:
    
        if (r13.p(r2, r12, r14, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f8, code lost:
    
        if (r13.p(r2, r12, r14, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (p("AutoLoginProperties", r11, r12, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, AutoLoginProperties autoLoginProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAutoLoginProperties$1 diaryArgumentsRecorder$recordAutoLoginProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        Filter filter;
        b bVar;
        AutoLoginProperties autoLoginProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAutoLoginProperties$1) {
            diaryArgumentsRecorder$recordAutoLoginProperties$1 = (DiaryArgumentsRecorder$recordAutoLoginProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAutoLoginProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAutoLoginProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAutoLoginProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAutoLoginProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = this;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str2;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 1;
                } else if (i == 1) {
                    autoLoginProperties = (AutoLoginProperties) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3;
                    str2 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } else if (i == 2) {
                    autoLoginProperties2 = (AutoLoginProperties) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0;
                    kotlin.b.b(obj);
                    String j2 = b64.j(str4, ".theme");
                    String obj2 = autoLoginProperties2.getTheme().toString();
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties2;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 3;
                } else if (i == 3) {
                    autoLoginProperties2 = (AutoLoginProperties) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j3 = b64.j(str4, ".mode");
                    String obj3 = autoLoginProperties2.getMode().toString();
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties2;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    autoLoginProperties2 = (AutoLoginProperties) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".message");
                    String message = autoLoginProperties2.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 5;
                }
                j = b64.j(str2, ".Filter");
                filter = autoLoginProperties.getFilter();
                diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties;
                diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 2;
                if (this.j(str, j, filter, diaryArgumentsRecorder$recordAutoLoginProperties$1) != coroutineSingletons) {
                    AutoLoginProperties autoLoginProperties3 = autoLoginProperties;
                    bVar = this;
                    autoLoginProperties2 = autoLoginProperties3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".theme");
                    String obj22 = autoLoginProperties2.getTheme().toString();
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties2;
                    diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordAutoLoginProperties$1 = new DiaryArgumentsRecorder$recordAutoLoginProperties$1(this, continuationImpl);
        Object obj4 = diaryArgumentsRecorder$recordAutoLoginProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAutoLoginProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str2, ".Filter");
        filter = autoLoginProperties.getFilter();
        diaryArgumentsRecorder$recordAutoLoginProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordAutoLoginProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordAutoLoginProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordAutoLoginProperties$1.L$3 = autoLoginProperties;
        diaryArgumentsRecorder$recordAutoLoginProperties$1.label = 2;
        if (this.j(str, j, filter, diaryArgumentsRecorder$recordAutoLoginProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r6.p(r8, r7, "isErrorTemporary", r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (f(r7, "AutoLoginProperties", r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Bundle bundle, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordAutologinRetryIntentArguments$1 diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1;
        int i;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordAutologinRetryIntentArguments$1) {
            diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1 = (DiaryArgumentsRecorder$recordAutologinRetryIntentArguments$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoLoginProperties.Companion.getClass();
                    AutoLoginProperties a = com.yandex.passport.internal.properties.e.a(bundle);
                    diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$0 = this;
                    diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$1 = str;
                    diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$2 = bundle;
                    diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    bundle = (Bundle) diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$0;
                    kotlin.b.b(obj);
                }
                String valueOf = String.valueOf(bundle.getBoolean(AutoLoginRetryActivity.KEY_IS_ERROR_TEMPORARY));
                diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$0 = null;
                diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$1 = null;
                diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$2 = null;
                diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label = 2;
            }
        }
        diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1 = new DiaryArgumentsRecorder$recordAutologinRetryIntentArguments$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label;
        if (i != 0) {
        }
        String valueOf2 = String.valueOf(bundle.getBoolean(AutoLoginRetryActivity.KEY_IS_ERROR_TEMPORARY));
        diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$0 = null;
        diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$1 = null;
        diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.L$2 = null;
        diaryArgumentsRecorder$recordAutologinRetryIntentArguments$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0158, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0138, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011c, code lost:
    
        if (r10.p(r2, r9, r11, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (p("BindPhoneProperties", r8, r9, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, BindPhoneProperties bindPhoneProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordBindPhoneProperties$1 diaryArgumentsRecorder$recordBindPhoneProperties$1;
        int i;
        b bVar;
        BindPhoneProperties bindPhoneProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordBindPhoneProperties$1) {
            diaryArgumentsRecorder$recordBindPhoneProperties$1 = (DiaryArgumentsRecorder$recordBindPhoneProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordBindPhoneProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordBindPhoneProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordBindPhoneProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordBindPhoneProperties$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (bindPhoneProperties != null) {
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = this;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str2;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 2;
                            break;
                        } else {
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 1;
                            if (p(bindPhoneProperties, str, str2, diaryArgumentsRecorder$recordBindPhoneProperties$1) != coroutineSingletons) {
                                return zy11Var;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    case 2:
                        bindPhoneProperties = (BindPhoneProperties) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".theme");
                        PassportTheme theme = bindPhoneProperties.getTheme();
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 3;
                        if (this.p(theme, str, j, diaryArgumentsRecorder$recordBindPhoneProperties$1) != coroutineSingletons) {
                            BindPhoneProperties bindPhoneProperties3 = bindPhoneProperties;
                            bVar = this;
                            bindPhoneProperties2 = bindPhoneProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".uid");
                            PassportUidImpl uid = bindPhoneProperties2.getUid();
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties2;
                            diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 4;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        bindPhoneProperties2 = (BindPhoneProperties) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".uid");
                        PassportUidImpl uid2 = bindPhoneProperties2.getUid();
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties2;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 4;
                        break;
                    case 4:
                        bindPhoneProperties2 = (BindPhoneProperties) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".phoneNumber");
                        String phoneNumber = bindPhoneProperties2.getPhoneNumber();
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties2;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 5;
                        break;
                    case 5:
                        bindPhoneProperties2 = (BindPhoneProperties) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".isPhoneEditable");
                        Boolean valueOf = Boolean.valueOf(bindPhoneProperties2.isPhoneEditable());
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = bindPhoneProperties2;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 6;
                        break;
                    case 6:
                        bindPhoneProperties2 = (BindPhoneProperties) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".webAmProperties");
                        WebAmProperties webAmProperties = bindPhoneProperties2.getWebAmProperties();
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordBindPhoneProperties$1.label = 7;
                        if (bVar.A(str3, j5, webAmProperties, diaryArgumentsRecorder$recordBindPhoneProperties$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    case 7:
                        kotlin.b.b(obj);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordBindPhoneProperties$1 = new DiaryArgumentsRecorder$recordBindPhoneProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordBindPhoneProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordBindPhoneProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, Environment environment, String str2, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordEnvironment$1 diaryArgumentsRecorder$recordEnvironment$1;
        int i;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordEnvironment$1) {
            diaryArgumentsRecorder$recordEnvironment$1 = (DiaryArgumentsRecorder$recordEnvironment$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordEnvironment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordEnvironment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordEnvironment$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordEnvironment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (str2 == null) {
                    str2 = "Environment";
                }
                Object valueOf = String.valueOf(environment);
                diaryArgumentsRecorder$recordEnvironment$1.label = 1;
                Object p = p(valueOf, str, str2, diaryArgumentsRecorder$recordEnvironment$1);
                return p == obj2 ? obj2 : p;
            }
        }
        diaryArgumentsRecorder$recordEnvironment$1 = new DiaryArgumentsRecorder$recordEnvironment$1(this, continuationImpl);
        Object obj3 = diaryArgumentsRecorder$recordEnvironment$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordEnvironment$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x015d, code lost:
    
        if (r6.p(r0, r2, r1, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
    
        if (r6.p(r9, r2, r3, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
    
        if (r6.p(r10, r2, r3, r4) != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r0.p("Filter", r1, r2, r4) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, Filter filter, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordFilter$1 diaryArgumentsRecorder$recordFilter$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Filter filter2;
        String j;
        Environment u;
        String str3;
        String str4;
        b bVar;
        Filter filter3;
        b bVar2 = this;
        String str5 = str;
        String str6 = str2;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordFilter$1) {
            diaryArgumentsRecorder$recordFilter$1 = (DiaryArgumentsRecorder$recordFilter$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordFilter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordFilter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordFilter$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordFilter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordFilter$1.L$0 = bVar2;
                    diaryArgumentsRecorder$recordFilter$1.L$1 = str5;
                    diaryArgumentsRecorder$recordFilter$1.L$2 = str6;
                    filter2 = filter;
                    diaryArgumentsRecorder$recordFilter$1.L$3 = filter2;
                    diaryArgumentsRecorder$recordFilter$1.label = 1;
                } else if (i == 1) {
                    Filter filter4 = (Filter) diaryArgumentsRecorder$recordFilter$1.L$3;
                    String str7 = (String) diaryArgumentsRecorder$recordFilter$1.L$2;
                    String str8 = (String) diaryArgumentsRecorder$recordFilter$1.L$1;
                    b bVar3 = (b) diaryArgumentsRecorder$recordFilter$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    str6 = str7;
                    str5 = str8;
                    filter2 = filter4;
                    bVar2 = bVar3;
                } else if (i == 2) {
                    filter3 = (Filter) diaryArgumentsRecorder$recordFilter$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordFilter$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordFilter$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordFilter$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j2 = b64.j(str4, ".secondaryTeamEnvironment");
                    String valueOf = String.valueOf(filter3.getSecondaryTeamEnvironment());
                    diaryArgumentsRecorder$recordFilter$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordFilter$1.L$1 = str3;
                    diaryArgumentsRecorder$recordFilter$1.L$2 = str4;
                    diaryArgumentsRecorder$recordFilter$1.L$3 = filter3;
                    diaryArgumentsRecorder$recordFilter$1.label = 3;
                } else if (i == 3) {
                    filter3 = (Filter) diaryArgumentsRecorder$recordFilter$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordFilter$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordFilter$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordFilter$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j3 = b64.j(str4, ".supportedAccountTypes");
                    String X = kotlin.collections.a.X(filter3.getSupportedAccountTypes(), ",", null, null, null, 62);
                    diaryArgumentsRecorder$recordFilter$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordFilter$1.L$1 = str3;
                    diaryArgumentsRecorder$recordFilter$1.L$2 = str4;
                    diaryArgumentsRecorder$recordFilter$1.L$3 = filter3;
                    diaryArgumentsRecorder$recordFilter$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    filter3 = (Filter) diaryArgumentsRecorder$recordFilter$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordFilter$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordFilter$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordFilter$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".partitions");
                    String X2 = kotlin.collections.a.X(filter3.getPartitions(), ",", null, null, null, 62);
                    diaryArgumentsRecorder$recordFilter$1.L$0 = null;
                    diaryArgumentsRecorder$recordFilter$1.L$1 = null;
                    diaryArgumentsRecorder$recordFilter$1.L$2 = null;
                    diaryArgumentsRecorder$recordFilter$1.L$3 = null;
                    diaryArgumentsRecorder$recordFilter$1.label = 5;
                }
                j = b64.j(str6, ".primaryEnvironment");
                u = p.u(filter2.getPrimaryEnvironment());
                diaryArgumentsRecorder$recordFilter$1.L$0 = bVar2;
                diaryArgumentsRecorder$recordFilter$1.L$1 = str5;
                diaryArgumentsRecorder$recordFilter$1.L$2 = str6;
                diaryArgumentsRecorder$recordFilter$1.L$3 = filter2;
                diaryArgumentsRecorder$recordFilter$1.label = 2;
                if (bVar2.i(str5, u, j, diaryArgumentsRecorder$recordFilter$1) != coroutineSingletons) {
                    String str9 = str6;
                    str3 = str5;
                    str4 = str9;
                    bVar = bVar2;
                    filter3 = filter2;
                    String j22 = b64.j(str4, ".secondaryTeamEnvironment");
                    String valueOf2 = String.valueOf(filter3.getSecondaryTeamEnvironment());
                    diaryArgumentsRecorder$recordFilter$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordFilter$1.L$1 = str3;
                    diaryArgumentsRecorder$recordFilter$1.L$2 = str4;
                    diaryArgumentsRecorder$recordFilter$1.L$3 = filter3;
                    diaryArgumentsRecorder$recordFilter$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordFilter$1 = new DiaryArgumentsRecorder$recordFilter$1(bVar2, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordFilter$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordFilter$1.label;
        if (i != 0) {
        }
        j = b64.j(str6, ".primaryEnvironment");
        u = p.u(filter2.getPrimaryEnvironment());
        diaryArgumentsRecorder$recordFilter$1.L$0 = bVar2;
        diaryArgumentsRecorder$recordFilter$1.L$1 = str5;
        diaryArgumentsRecorder$recordFilter$1.L$2 = str6;
        diaryArgumentsRecorder$recordFilter$1.L$3 = filter2;
        diaryArgumentsRecorder$recordFilter$1.label = 2;
        if (bVar2.i(str5, u, j, diaryArgumentsRecorder$recordFilter$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0168, code lost:
    
        if (r12.p(r14, r11, "showOverlay", r0) == r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        if (r12.p(r13, r11, "WebCaseData", r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
    
        if (i(r11, r12, null, r0) == r1) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, RoadSign roadSign, Bundle bundle, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordIntentArguments$1 diaryArgumentsRecorder$recordIntentArguments$1;
        int i;
        WebCaseType webCaseType;
        b bVar;
        Bundle bundle2;
        PassportTheme passportTheme;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordIntentArguments$1) {
            diaryArgumentsRecorder$recordIntentArguments$1 = (DiaryArgumentsRecorder$recordIntentArguments$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordIntentArguments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordIntentArguments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordIntentArguments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordIntentArguments$1.label;
                int i3 = 0;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        switch (a.a[roadSign.ordinal()]) {
                            case 1:
                                LoginProperties.Companion.getClass();
                                LoginProperties a = bundle.containsKey("passport-login-properties") ? com.yandex.passport.internal.properties.i.a(bundle) : null;
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 1;
                                return l(str, "LoginProperties", a, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                            case 2:
                                SocialBindProperties.Companion.getClass();
                                SocialBindProperties a2 = v.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 2;
                                if (s(str, "SocialBindProperties", a2, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 3:
                                SocialApplicationBindProperties.Companion.getClass();
                                SocialApplicationBindProperties a3 = t.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 3;
                                if (r(str, "SocialApplicationBindProperties", a3, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 4:
                                AuthByQrProperties.Companion.getClass();
                                AuthByQrProperties a4 = com.yandex.passport.internal.properties.c.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 4;
                                if (d(str, "AuthByQrProperties", a4, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 5:
                                TurboAppAuthProperties.Companion.getClass();
                                TurboAppAuthProperties a5 = y.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 5;
                                if (v(str, "TurboAppAuthProperties", a5, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 6:
                                Uri uri = (Uri) bundle.getParcelable(GlobalRouterActivity.URI);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 6;
                                if (x(uri, str, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 7:
                                PassportLogoutPropertiesImpl.Companion.getClass();
                                PassportLogoutPropertiesImpl a6 = com.yandex.passport.internal.properties.l.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 7;
                                if (m(str, "LogoutProperties", a6, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 8:
                                SetCurrentAccountPropertiesImpl.Companion.getClass();
                                SetCurrentAccountPropertiesImpl a7 = s.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 8;
                                if (q(str, "SetCurrentProperties", a7, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 9:
                                Environment environment = (Environment) bundle.getParcelable(WebViewActivity.KEY_ENVIRONMENT);
                                diaryArgumentsRecorder$recordIntentArguments$1.L$0 = this;
                                diaryArgumentsRecorder$recordIntentArguments$1.L$1 = str;
                                diaryArgumentsRecorder$recordIntentArguments$1.L$2 = bundle;
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 9;
                                break;
                            case 10:
                                UserMenuProperties.Companion.getClass();
                                UserMenuProperties a8 = a0.a(bundle);
                                diaryArgumentsRecorder$recordIntentArguments$1.label = 14;
                                if (y(str, "UserMenuProperties", a8, diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                                }
                                break;
                            case 11:
                            case 12:
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                    case 1:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 2:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 3:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 4:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 5:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 6:
                    case 13:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    case 7:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 8:
                        kotlin.b.b(obj);
                        return zy11Var;
                    case 9:
                        bundle = (Bundle) diaryArgumentsRecorder$recordIntentArguments$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordIntentArguments$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordIntentArguments$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        int i4 = bundle.getInt(WebViewActivity.KEY_WEB_CASE, -1);
                        WebCaseType[] values = WebCaseType.values();
                        int length = values.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                webCaseType = values[i5];
                                if (webCaseType.ordinal() != i4) {
                                    i5++;
                                }
                            } else {
                                webCaseType = null;
                            }
                        }
                        String valueOf = String.valueOf(webCaseType);
                        diaryArgumentsRecorder$recordIntentArguments$1.L$0 = this;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$1 = str;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$2 = bundle;
                        diaryArgumentsRecorder$recordIntentArguments$1.label = 10;
                        if (this.p(valueOf, str, "WebCaseType", diaryArgumentsRecorder$recordIntentArguments$1) != coroutineSingletons) {
                            bVar = this;
                            bundle2 = bundle;
                            String valueOf2 = String.valueOf(bundle2.getBundle(WebViewActivity.KEY_WEB_CASE_DATA));
                            diaryArgumentsRecorder$recordIntentArguments$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordIntentArguments$1.L$1 = str;
                            diaryArgumentsRecorder$recordIntentArguments$1.L$2 = bundle2;
                            diaryArgumentsRecorder$recordIntentArguments$1.label = 11;
                            break;
                        }
                    case 10:
                        bundle2 = (Bundle) diaryArgumentsRecorder$recordIntentArguments$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordIntentArguments$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordIntentArguments$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String valueOf22 = String.valueOf(bundle2.getBundle(WebViewActivity.KEY_WEB_CASE_DATA));
                        diaryArgumentsRecorder$recordIntentArguments$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$1 = str;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$2 = bundle2;
                        diaryArgumentsRecorder$recordIntentArguments$1.label = 11;
                        break;
                    case 11:
                        bundle2 = (Bundle) diaryArgumentsRecorder$recordIntentArguments$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordIntentArguments$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordIntentArguments$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        Boolean valueOf3 = Boolean.valueOf(bundle2.getBoolean(WebViewActivity.KEY_SHOW_DEBUG_OVERLAY));
                        if (!bundle2.containsKey(WebViewActivity.KEY_SHOW_DEBUG_OVERLAY)) {
                            valueOf3 = null;
                        }
                        diaryArgumentsRecorder$recordIntentArguments$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$1 = str;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$2 = bundle2;
                        diaryArgumentsRecorder$recordIntentArguments$1.label = 12;
                        break;
                    case 12:
                        bundle2 = (Bundle) diaryArgumentsRecorder$recordIntentArguments$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordIntentArguments$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordIntentArguments$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        int i6 = bundle2.getInt(WebViewActivity.KEY_THEME, -1);
                        PassportTheme[] values2 = PassportTheme.values();
                        int length2 = values2.length;
                        while (true) {
                            if (i3 < length2) {
                                passportTheme = values2[i3];
                                if (passportTheme.ordinal() != i6) {
                                    i3++;
                                }
                            } else {
                                passportTheme = null;
                            }
                        }
                        String valueOf4 = String.valueOf(passportTheme);
                        diaryArgumentsRecorder$recordIntentArguments$1.L$0 = null;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$1 = null;
                        diaryArgumentsRecorder$recordIntentArguments$1.L$2 = null;
                        diaryArgumentsRecorder$recordIntentArguments$1.label = 13;
                        if (bVar.p(valueOf4, str, "passportTheme", diaryArgumentsRecorder$recordIntentArguments$1) == coroutineSingletons) {
                        }
                        break;
                    case 14:
                        kotlin.b.b(obj);
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordIntentArguments$1 = new DiaryArgumentsRecorder$recordIntentArguments$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordIntentArguments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordIntentArguments$1.label;
        int i32 = 0;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x04cf, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x04ae, code lost:
    
        if (r10.A(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0491, code lost:
    
        if (r10.w(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0473, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0455, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0437, code lost:
    
        if (r10.h(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0419, code lost:
    
        if (r10.z(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x03fb, code lost:
    
        if (r10.u(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03dd, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03bb, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x039d, code lost:
    
        if (r10.t(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0377, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0355, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0333, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0315, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02f8, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02db, code lost:
    
        if (r10.j(r9, r11, r2, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02be, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a1, code lost:
    
        if (r10.p(r2, r9, r11, r0) != r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0259, code lost:
    
        if (p(r11, r8, r9, r0) == r1) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, LoginProperties loginProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordLoginProperties$1 diaryArgumentsRecorder$recordLoginProperties$1;
        int i;
        b bVar;
        LoginProperties loginProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordLoginProperties$1) {
            diaryArgumentsRecorder$recordLoginProperties$1 = (DiaryArgumentsRecorder$recordLoginProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordLoginProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordLoginProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordLoginProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordLoginProperties$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        StringBuilder sb = new StringBuilder("LoginProperties is null ");
                        sb.append(loginProperties == null);
                        String sb2 = sb.toString();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 1;
                        break;
                    case 1:
                        loginProperties = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        if (loginProperties != null) {
                            String j = b64.j(str2, ".applicationPackageName");
                            String applicationPackageName = loginProperties.getApplicationPackageName();
                            diaryArgumentsRecorder$recordLoginProperties$1.L$0 = this;
                            diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str;
                            diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str2;
                            diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties;
                            diaryArgumentsRecorder$recordLoginProperties$1.label = 2;
                            if (this.p(applicationPackageName, str, j, diaryArgumentsRecorder$recordLoginProperties$1) != coroutineSingletons) {
                                LoginProperties loginProperties3 = loginProperties;
                                bVar = this;
                                loginProperties2 = loginProperties3;
                                String str5 = str2;
                                str3 = str;
                                str4 = str5;
                                String j2 = b64.j(str4, ".isWebAmForbidden");
                                Boolean valueOf = Boolean.valueOf(loginProperties2.isWebAmForbidden());
                                diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                                diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                                diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                                diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                                diaryArgumentsRecorder$recordLoginProperties$1.label = 3;
                                break;
                            }
                        }
                    case 2:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".isWebAmForbidden");
                        Boolean valueOf2 = Boolean.valueOf(loginProperties2.isWebAmForbidden());
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 3;
                        break;
                    case 3:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".applicationVersion");
                        String applicationVersion = loginProperties2.getApplicationVersion();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 4;
                        break;
                    case 4:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".filter");
                        Filter filter = loginProperties2.getFilter();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 5;
                        break;
                    case 5:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j5 = b64.j(str4, ".theme");
                        PassportTheme theme = loginProperties2.getTheme();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 6;
                        break;
                    case 6:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j6 = b64.j(str4, ".animationTheme");
                        AnimationTheme animationTheme = loginProperties2.getAnimationTheme();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 7;
                        break;
                    case 7:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j7 = b64.j(str4, ".selectedUid");
                        PassportUidImpl selectedUid = loginProperties2.getSelectedUid();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 8;
                        break;
                    case 8:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j8 = b64.j(str4, ".isAdditionOnlyRequired");
                        Boolean valueOf3 = Boolean.valueOf(loginProperties2.isAdditionOnlyRequired());
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 9;
                        break;
                    case 9:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j9 = b64.j(str4, ".isRegistrationOnlyRequired");
                        Boolean valueOf4 = Boolean.valueOf(loginProperties2.isRegistrationOnlyRequired());
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 10;
                        break;
                    case 10:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j10 = b64.j(str4, ".socialConfiguration");
                        PassportSocialConfiguration socialConfiguration = loginProperties2.getSocialConfiguration();
                        SocialConfiguration V = socialConfiguration != null ? com.yandex.passport.internal.a0.V(socialConfiguration) : null;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 11;
                        break;
                    case 11:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j11 = b64.j(str4, ".loginHint");
                        String loginHint = loginProperties2.getLoginHint();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 12;
                        break;
                    case 12:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j12 = b64.j(str4, ".isFromAuthSdk");
                        Boolean valueOf5 = Boolean.valueOf(loginProperties2.isFromAuthSdk());
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 13;
                        break;
                    case 13:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j13 = b64.j(str4, ".socialRegistrationProperties");
                        SocialRegistrationProperties socialRegistrationProperties = loginProperties2.getSocialRegistrationProperties();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 14;
                        break;
                    case 14:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j14 = b64.j(str4, ".visualProperties");
                        VisualProperties visualProperties = loginProperties2.getVisualProperties();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 15;
                        break;
                    case 15:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j15 = b64.j(str4, ".bindPhoneProperties");
                        BindPhoneProperties bindPhoneProperties = loginProperties2.getBindPhoneProperties();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 16;
                        break;
                    case 16:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j16 = b64.j(str4, ".source");
                        String source = loginProperties2.getSource();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 17;
                        break;
                    case 17:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j17 = b64.j(str4, ".analyticsParams");
                        Map<String, String> analyticsParams = loginProperties2.getAnalyticsParams();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 18;
                        break;
                    case 18:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j18 = b64.j(str4, ".turboAuthParams");
                        TurboAuthParams turboAuthParams = loginProperties2.getTurboAuthParams();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 19;
                        break;
                    case 19:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j19 = b64.j(str4, ".webAmProperties");
                        WebAmProperties webAmProperties = loginProperties2.getWebAmProperties();
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 20;
                        break;
                    case 20:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j20 = b64.j(str4, ".setAsCurrent");
                        Boolean valueOf6 = Boolean.valueOf(loginProperties2.getSetAsCurrent());
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = loginProperties2;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 21;
                        break;
                    case 21:
                        loginProperties2 = (LoginProperties) diaryArgumentsRecorder$recordLoginProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLoginProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLoginProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j21 = b64.j(str4, ".additionalActionRequest");
                        String mo243getAdditionalActionRequestJWfNWPw = loginProperties2.mo243getAdditionalActionRequestJWfNWPw();
                        com.yandex.passport.api.a a = mo243getAdditionalActionRequestJWfNWPw != null ? com.yandex.passport.api.a.a(mo243getAdditionalActionRequestJWfNWPw) : null;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordLoginProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordLoginProperties$1.label = 22;
                        return bVar.p(a, str3, j21, diaryArgumentsRecorder$recordLoginProperties$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    case 22:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordLoginProperties$1 = new DiaryArgumentsRecorder$recordLoginProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordLoginProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordLoginProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        if (r14.p(r2, r13, r15, r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (p("LogoutProperties", r12, r13, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordLogoutProperties$1 diaryArgumentsRecorder$recordLogoutProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        PassportUidImpl uid;
        b bVar;
        PassportLogoutPropertiesImpl passportLogoutPropertiesImpl2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordLogoutProperties$1) {
            diaryArgumentsRecorder$recordLogoutProperties$1 = (DiaryArgumentsRecorder$recordLogoutProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordLogoutProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordLogoutProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordLogoutProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordLogoutProperties$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (passportLogoutPropertiesImpl == null) {
                        diaryArgumentsRecorder$recordLogoutProperties$1.label = 1;
                        if (p(passportLogoutPropertiesImpl, str, str2, diaryArgumentsRecorder$recordLogoutProperties$1) == coroutineSingletons) {
                        }
                    } else {
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = passportLogoutPropertiesImpl;
                        diaryArgumentsRecorder$recordLogoutProperties$1.label = 2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        passportLogoutPropertiesImpl = (PassportLogoutPropertiesImpl) diaryArgumentsRecorder$recordLogoutProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordLogoutProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                    } else if (i == 3) {
                        passportLogoutPropertiesImpl2 = (PassportLogoutPropertiesImpl) diaryArgumentsRecorder$recordLogoutProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordLogoutProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j2 = b64.j(str4, ".theme");
                        PassportTheme theme = passportLogoutPropertiesImpl2.getTheme();
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = passportLogoutPropertiesImpl2;
                        diaryArgumentsRecorder$recordLogoutProperties$1.label = 4;
                    } else {
                        if (i == 4) {
                            passportLogoutPropertiesImpl2 = (PassportLogoutPropertiesImpl) diaryArgumentsRecorder$recordLogoutProperties$1.L$3;
                            str4 = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$2;
                            str3 = (String) diaryArgumentsRecorder$recordLogoutProperties$1.L$1;
                            bVar = (b) diaryArgumentsRecorder$recordLogoutProperties$1.L$0;
                            kotlin.b.b(obj);
                            ((Result) obj).getClass();
                            String j3 = b64.j(str4, ".source");
                            String source = passportLogoutPropertiesImpl2.getSource();
                            diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = null;
                            diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = null;
                            diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = null;
                            diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = null;
                            diaryArgumentsRecorder$recordLogoutProperties$1.label = 5;
                            return bVar.p(source, str3, j3, diaryArgumentsRecorder$recordLogoutProperties$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                return zy11Var;
                j = b64.j(str2, ".uid");
                uid = passportLogoutPropertiesImpl.getUid();
                diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = passportLogoutPropertiesImpl;
                diaryArgumentsRecorder$recordLogoutProperties$1.label = 3;
                if (this.p(uid, str, j, diaryArgumentsRecorder$recordLogoutProperties$1) != coroutineSingletons) {
                    PassportLogoutPropertiesImpl passportLogoutPropertiesImpl3 = passportLogoutPropertiesImpl;
                    bVar = this;
                    passportLogoutPropertiesImpl2 = passportLogoutPropertiesImpl3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".theme");
                    PassportTheme theme2 = passportLogoutPropertiesImpl2.getTheme();
                    diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = passportLogoutPropertiesImpl2;
                    diaryArgumentsRecorder$recordLogoutProperties$1.label = 4;
                }
            }
        }
        diaryArgumentsRecorder$recordLogoutProperties$1 = new DiaryArgumentsRecorder$recordLogoutProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordLogoutProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordLogoutProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        j = b64.j(str2, ".uid");
        uid = passportLogoutPropertiesImpl.getUid();
        diaryArgumentsRecorder$recordLogoutProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordLogoutProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordLogoutProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordLogoutProperties$1.L$3 = passportLogoutPropertiesImpl;
        diaryArgumentsRecorder$recordLogoutProperties$1.label = 3;
        if (this.p(uid, str, j, diaryArgumentsRecorder$recordLogoutProperties$1) != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, com.yandex.passport.internal.methods.e eVar, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordMethodArgument$1 diaryArgumentsRecorder$recordMethodArgument$1;
        int i;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordMethodArgument$1) {
            diaryArgumentsRecorder$recordMethodArgument$1 = (DiaryArgumentsRecorder$recordMethodArgument$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordMethodArgument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordMethodArgument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordMethodArgument$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordMethodArgument$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (eVar instanceof q) {
                    q qVar = (q) eVar;
                    String str2 = qVar.a;
                    Filter filter = (Filter) qVar.c;
                    diaryArgumentsRecorder$recordMethodArgument$1.label = 1;
                    return j(str, str2, filter, diaryArgumentsRecorder$recordMethodArgument$1) == obj2 ? obj2 : zy11Var;
                }
                if (eVar instanceof com.yandex.passport.internal.methods.h) {
                    com.yandex.passport.internal.methods.h hVar = (com.yandex.passport.internal.methods.h) eVar;
                    String str3 = hVar.a;
                    AuthorizationUrlProperties authorizationUrlProperties = (AuthorizationUrlProperties) hVar.c;
                    diaryArgumentsRecorder$recordMethodArgument$1.label = 2;
                    if (e(str, str3, authorizationUrlProperties, diaryArgumentsRecorder$recordMethodArgument$1) == obj2) {
                    }
                } else if (eVar instanceof com.yandex.passport.internal.methods.k) {
                    com.yandex.passport.internal.methods.k kVar = (com.yandex.passport.internal.methods.k) eVar;
                    String str4 = kVar.a;
                    AutoLoginProperties autoLoginProperties = (AutoLoginProperties) kVar.c;
                    diaryArgumentsRecorder$recordMethodArgument$1.label = 3;
                    if (f(str, str4, autoLoginProperties, diaryArgumentsRecorder$recordMethodArgument$1) == obj2) {
                    }
                } else {
                    String str5 = eVar.a;
                    Object valueOf = String.valueOf(eVar.a());
                    diaryArgumentsRecorder$recordMethodArgument$1.label = 4;
                    if (p(valueOf, str, str5, diaryArgumentsRecorder$recordMethodArgument$1) == obj2) {
                    }
                }
            }
        }
        diaryArgumentsRecorder$recordMethodArgument$1 = new DiaryArgumentsRecorder$recordMethodArgument$1(this, continuationImpl);
        Object obj3 = diaryArgumentsRecorder$recordMethodArgument$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordMethodArgument$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(x2 x2Var, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordMethodArguments$1 diaryArgumentsRecorder$recordMethodArguments$1;
        int i;
        b bVar;
        Iterator it;
        x2 x2Var2;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordMethodArguments$1) {
            diaryArgumentsRecorder$recordMethodArguments$1 = (DiaryArgumentsRecorder$recordMethodArguments$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordMethodArguments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordMethodArguments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordMethodArguments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordMethodArguments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List b = x2Var.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : b) {
                        com.yandex.passport.internal.methods.e eVar = (com.yandex.passport.internal.methods.e) obj2;
                        if ((eVar instanceof f3) || (eVar instanceof n3) || (eVar instanceof c3) || (eVar instanceof com.yandex.passport.internal.methods.l) || (eVar instanceof q) || (eVar instanceof i3) || (eVar instanceof com.yandex.passport.internal.methods.h) || (eVar instanceof com.yandex.passport.internal.methods.k) || (eVar instanceof com.yandex.passport.internal.methods.i) || (eVar instanceof com.yandex.passport.internal.methods.s) || (eVar instanceof y2) || (eVar instanceof p3) || (eVar instanceof q3) || (eVar instanceof u)) {
                            arrayList.add(obj2);
                        }
                    }
                    bVar = this;
                    it = arrayList.iterator();
                    x2Var2 = x2Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) diaryArgumentsRecorder$recordMethodArguments$1.L$2;
                    x2 x2Var3 = (x2) diaryArgumentsRecorder$recordMethodArguments$1.L$1;
                    b bVar2 = (b) diaryArgumentsRecorder$recordMethodArguments$1.L$0;
                    kotlin.b.b(obj);
                    x2Var2 = x2Var3;
                    bVar = bVar2;
                }
                while (it.hasNext()) {
                    com.yandex.passport.internal.methods.e eVar2 = (com.yandex.passport.internal.methods.e) it.next();
                    String name = x2Var2.a.name();
                    diaryArgumentsRecorder$recordMethodArguments$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordMethodArguments$1.L$1 = x2Var2;
                    diaryArgumentsRecorder$recordMethodArguments$1.L$2 = it;
                    diaryArgumentsRecorder$recordMethodArguments$1.label = 1;
                    if (bVar.n(name, eVar2, diaryArgumentsRecorder$recordMethodArguments$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        diaryArgumentsRecorder$recordMethodArguments$1 = new DiaryArgumentsRecorder$recordMethodArguments$1(this, continuationImpl);
        Object obj3 = diaryArgumentsRecorder$recordMethodArguments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordMethodArguments$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj, String str, String str2, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordParameter$1 diaryArgumentsRecorder$recordParameter$1;
        int i;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordParameter$1) {
            diaryArgumentsRecorder$recordParameter$1 = (DiaryArgumentsRecorder$recordParameter$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordParameter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordParameter$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = diaryArgumentsRecorder$recordParameter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordParameter$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                String valueOf = String.valueOf(obj);
                this.a.getClass();
                com.yandex.passport.internal.database.diary.b bVar = new com.yandex.passport.internal.database.diary.b(str2, str, valueOf, System.currentTimeMillis());
                diaryArgumentsRecorder$recordParameter$1.label = 1;
                Object b = this.b.b(bVar, diaryArgumentsRecorder$recordParameter$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        diaryArgumentsRecorder$recordParameter$1 = new DiaryArgumentsRecorder$recordParameter$1(this, continuationImpl);
        Object obj22 = diaryArgumentsRecorder$recordParameter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordParameter$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (p("SetCurrentProperties", r11, r12, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, String str2, SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordSetCurrentProperties$1 diaryArgumentsRecorder$recordSetCurrentProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        PassportUidImpl uid;
        b bVar;
        SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordSetCurrentProperties$1) {
            diaryArgumentsRecorder$recordSetCurrentProperties$1 = (DiaryArgumentsRecorder$recordSetCurrentProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordSetCurrentProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordSetCurrentProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordSetCurrentProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordSetCurrentProperties$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (setCurrentAccountPropertiesImpl == null) {
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 1;
                        if (p(setCurrentAccountPropertiesImpl, str, str2, diaryArgumentsRecorder$recordSetCurrentProperties$1) == coroutineSingletons) {
                        }
                    } else {
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3 = setCurrentAccountPropertiesImpl;
                        diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        setCurrentAccountPropertiesImpl = (SetCurrentAccountPropertiesImpl) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                    } else {
                        if (i == 3) {
                            setCurrentAccountPropertiesImpl2 = (SetCurrentAccountPropertiesImpl) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3;
                            str4 = (String) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2;
                            str3 = (String) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1;
                            bVar = (b) diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0;
                            kotlin.b.b(obj);
                            ((Result) obj).getClass();
                            String j2 = b64.j(str4, ".progressProperties");
                            ProgressPropertiesImpl progressProperties = setCurrentAccountPropertiesImpl2.getProgressProperties();
                            diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0 = null;
                            diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1 = null;
                            diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2 = null;
                            diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3 = null;
                            diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 4;
                            return bVar.p(progressProperties, str3, j2, diaryArgumentsRecorder$recordSetCurrentProperties$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                return zy11Var;
                j = b64.j(str2, ".uid");
                uid = setCurrentAccountPropertiesImpl.getUid();
                diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3 = setCurrentAccountPropertiesImpl;
                diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 3;
                if (this.p(uid, str, j, diaryArgumentsRecorder$recordSetCurrentProperties$1) != coroutineSingletons) {
                    SetCurrentAccountPropertiesImpl setCurrentAccountPropertiesImpl3 = setCurrentAccountPropertiesImpl;
                    bVar = this;
                    setCurrentAccountPropertiesImpl2 = setCurrentAccountPropertiesImpl3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".progressProperties");
                    ProgressPropertiesImpl progressProperties2 = setCurrentAccountPropertiesImpl2.getProgressProperties();
                    diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 4;
                    if (bVar.p(progressProperties2, str3, j22, diaryArgumentsRecorder$recordSetCurrentProperties$1) != coroutineSingletons) {
                    }
                }
            }
        }
        diaryArgumentsRecorder$recordSetCurrentProperties$1 = new DiaryArgumentsRecorder$recordSetCurrentProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordSetCurrentProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordSetCurrentProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        j = b64.j(str2, ".uid");
        uid = setCurrentAccountPropertiesImpl.getUid();
        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordSetCurrentProperties$1.L$3 = setCurrentAccountPropertiesImpl;
        diaryArgumentsRecorder$recordSetCurrentProperties$1.label = 3;
        if (this.p(uid, str, j, diaryArgumentsRecorder$recordSetCurrentProperties$1) != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0158, code lost:
    
        if (r9.p(r6, r8, r7, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013c, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0120, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0104, code lost:
    
        if (r9.p(r2, r8, r10, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (p("SocialApplicationBindProperties", r7, r8, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, String str2, SocialApplicationBindProperties socialApplicationBindProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1 diaryArgumentsRecorder$recordSocialApplicationBindProperties$1;
        b bVar;
        SocialApplicationBindProperties socialApplicationBindProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1) {
            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1 = (DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1) continuationImpl;
            int i = diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = i - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 1;
                        break;
                    case 1:
                        socialApplicationBindProperties = (SocialApplicationBindProperties) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".filter");
                        Filter filter = socialApplicationBindProperties.getFilter();
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 2;
                        if (this.j(str, j, filter, diaryArgumentsRecorder$recordSocialApplicationBindProperties$1) != coroutineSingletons) {
                            SocialApplicationBindProperties socialApplicationBindProperties3 = socialApplicationBindProperties;
                            bVar = this;
                            socialApplicationBindProperties2 = socialApplicationBindProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".theme");
                            PassportTheme theme = socialApplicationBindProperties2.getTheme();
                            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties2;
                            diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 3;
                            break;
                        }
                        return coroutineSingletons;
                    case 2:
                        socialApplicationBindProperties2 = (SocialApplicationBindProperties) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0;
                        kotlin.b.b(obj);
                        String j22 = b64.j(str4, ".theme");
                        PassportTheme theme2 = socialApplicationBindProperties2.getTheme();
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties2;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 3;
                        break;
                    case 3:
                        socialApplicationBindProperties2 = (SocialApplicationBindProperties) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".uid");
                        PassportUidImpl uid = socialApplicationBindProperties2.getUid();
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties2;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 4;
                        break;
                    case 4:
                        socialApplicationBindProperties2 = (SocialApplicationBindProperties) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".applicationName");
                        String applicationName = socialApplicationBindProperties2.getApplicationName();
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = socialApplicationBindProperties2;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 5;
                        break;
                    case 5:
                        socialApplicationBindProperties2 = (SocialApplicationBindProperties) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".clientId");
                        String clientId = socialApplicationBindProperties2.getClientId();
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label = 6;
                        break;
                    case 6:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordSocialApplicationBindProperties$1 = new DiaryArgumentsRecorder$recordSocialApplicationBindProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (diaryArgumentsRecorder$recordSocialApplicationBindProperties$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0129, code lost:
    
        if (r13.t(r12, r11, r10, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010a, code lost:
    
        if (r13.p(r2, r12, r14, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r13.p(r2, r12, r14, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (p("SocialBindProperties", r11, r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, String str2, SocialBindProperties socialBindProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordSocialBindProperties$1 diaryArgumentsRecorder$recordSocialBindProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        Filter filter;
        b bVar;
        SocialBindProperties socialBindProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordSocialBindProperties$1) {
            diaryArgumentsRecorder$recordSocialBindProperties$1 = (DiaryArgumentsRecorder$recordSocialBindProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordSocialBindProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordSocialBindProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordSocialBindProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordSocialBindProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = this;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str2;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.label = 1;
                } else if (i == 1) {
                    socialBindProperties = (SocialBindProperties) diaryArgumentsRecorder$recordSocialBindProperties$1.L$3;
                    str2 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordSocialBindProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } else if (i == 2) {
                    socialBindProperties2 = (SocialBindProperties) diaryArgumentsRecorder$recordSocialBindProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordSocialBindProperties$1.L$0;
                    kotlin.b.b(obj);
                    String j2 = b64.j(str4, ".theme");
                    PassportTheme theme = socialBindProperties2.getTheme();
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties2;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.label = 3;
                } else if (i == 3) {
                    socialBindProperties2 = (SocialBindProperties) diaryArgumentsRecorder$recordSocialBindProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordSocialBindProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j3 = b64.j(str4, ".uid");
                    PassportUidImpl uid = socialBindProperties2.getUid();
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties2;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.label = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    socialBindProperties2 = (SocialBindProperties) diaryArgumentsRecorder$recordSocialBindProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordSocialBindProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordSocialBindProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j4 = b64.j(str4, ".socialBindingConfiguration");
                    SocialConfiguration V = com.yandex.passport.internal.a0.V(socialBindProperties2.getSocialBindingConfiguration());
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.label = 5;
                }
                j = b64.j(str2, ".filter");
                filter = socialBindProperties.getFilter();
                diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties;
                diaryArgumentsRecorder$recordSocialBindProperties$1.label = 2;
                if (this.j(str, j, filter, diaryArgumentsRecorder$recordSocialBindProperties$1) != coroutineSingletons) {
                    SocialBindProperties socialBindProperties3 = socialBindProperties;
                    bVar = this;
                    socialBindProperties2 = socialBindProperties3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".theme");
                    PassportTheme theme2 = socialBindProperties2.getTheme();
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = bVar;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str3;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str4;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties2;
                    diaryArgumentsRecorder$recordSocialBindProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordSocialBindProperties$1 = new DiaryArgumentsRecorder$recordSocialBindProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordSocialBindProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordSocialBindProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str2, ".filter");
        filter = socialBindProperties.getFilter();
        diaryArgumentsRecorder$recordSocialBindProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordSocialBindProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordSocialBindProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordSocialBindProperties$1.L$3 = socialBindProperties;
        diaryArgumentsRecorder$recordSocialBindProperties$1.label = 2;
        if (this.j(str, j, filter, diaryArgumentsRecorder$recordSocialBindProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0153, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0133, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0117, code lost:
    
        if (r10.p(r2, r9, r11, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (p("SocialConfiguration", r8, r9, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2, SocialConfiguration socialConfiguration, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordSocialConfiguration$1 diaryArgumentsRecorder$recordSocialConfiguration$1;
        int i;
        b bVar;
        SocialConfiguration socialConfiguration2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordSocialConfiguration$1) {
            diaryArgumentsRecorder$recordSocialConfiguration$1 = (DiaryArgumentsRecorder$recordSocialConfiguration$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordSocialConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordSocialConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordSocialConfiguration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordSocialConfiguration$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (socialConfiguration != null) {
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = this;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str2;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.label = 2;
                            break;
                        } else {
                            diaryArgumentsRecorder$recordSocialConfiguration$1.label = 1;
                            if (p(socialConfiguration, str, str2, diaryArgumentsRecorder$recordSocialConfiguration$1) != coroutineSingletons) {
                                return zy11Var;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                    case 7:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    case 2:
                        socialConfiguration = (SocialConfiguration) diaryArgumentsRecorder$recordSocialConfiguration$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordSocialConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".id");
                        PassportSocialConfiguration id = socialConfiguration.getId();
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = this;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str2;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.label = 3;
                        if (this.p(id, str, j, diaryArgumentsRecorder$recordSocialConfiguration$1) != coroutineSingletons) {
                            SocialConfiguration socialConfiguration3 = socialConfiguration;
                            bVar = this;
                            socialConfiguration2 = socialConfiguration3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".type");
                            SocialConfiguration.Type type = socialConfiguration2.getType();
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str3;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str4;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration2;
                            diaryArgumentsRecorder$recordSocialConfiguration$1.label = 4;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        socialConfiguration2 = (SocialConfiguration) diaryArgumentsRecorder$recordSocialConfiguration$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".type");
                        SocialConfiguration.Type type2 = socialConfiguration2.getType();
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration2;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.label = 4;
                        break;
                    case 4:
                        socialConfiguration2 = (SocialConfiguration) diaryArgumentsRecorder$recordSocialConfiguration$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".scope");
                        String scope = socialConfiguration2.getScope();
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration2;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.label = 5;
                        break;
                    case 5:
                        socialConfiguration2 = (SocialConfiguration) diaryArgumentsRecorder$recordSocialConfiguration$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".isBrowserRequired");
                        Boolean valueOf = Boolean.valueOf(socialConfiguration2.isBrowserRequired());
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = str3;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = str4;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = socialConfiguration2;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.label = 6;
                        break;
                    case 6:
                        socialConfiguration2 = (SocialConfiguration) diaryArgumentsRecorder$recordSocialConfiguration$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordSocialConfiguration$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordSocialConfiguration$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".extraQueryParams");
                        Map<String, String> extraQueryParams = socialConfiguration2.getExtraQueryParams();
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$0 = null;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$1 = null;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$2 = null;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.L$3 = null;
                        diaryArgumentsRecorder$recordSocialConfiguration$1.label = 7;
                        if (bVar.p(extraQueryParams, str3, j5, diaryArgumentsRecorder$recordSocialConfiguration$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordSocialConfiguration$1 = new DiaryArgumentsRecorder$recordSocialConfiguration$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordSocialConfiguration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordSocialConfiguration$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (r11.p(r8, r10, r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        if (p("SocialRegistrationProperties", r9, r10, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, String str2, SocialRegistrationProperties socialRegistrationProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordSocialRegistrationProperties$1 diaryArgumentsRecorder$recordSocialRegistrationProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        PassportUidImpl uid;
        b bVar;
        SocialRegistrationProperties socialRegistrationProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordSocialRegistrationProperties$1) {
            diaryArgumentsRecorder$recordSocialRegistrationProperties$1 = (DiaryArgumentsRecorder$recordSocialRegistrationProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordSocialRegistrationProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0 = this;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1 = str;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2 = str2;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3 = socialRegistrationProperties;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = 1;
                } else if (i == 1) {
                    socialRegistrationProperties = (SocialRegistrationProperties) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3;
                    str2 = (String) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2;
                    str = (String) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1;
                    this = (b) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    socialRegistrationProperties2 = (SocialRegistrationProperties) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3;
                    str4 = (String) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2;
                    str3 = (String) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1;
                    bVar = (b) diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0;
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    String j2 = b64.j(str4, ".message");
                    String message = socialRegistrationProperties2.getMessage();
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = 3;
                }
                j = b64.j(str2, ".uid");
                uid = socialRegistrationProperties.getUid();
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0 = this;
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1 = str;
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2 = str2;
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3 = socialRegistrationProperties;
                diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = 2;
                if (this.p(uid, str, j, diaryArgumentsRecorder$recordSocialRegistrationProperties$1) != coroutineSingletons) {
                    SocialRegistrationProperties socialRegistrationProperties3 = socialRegistrationProperties;
                    bVar = this;
                    socialRegistrationProperties2 = socialRegistrationProperties3;
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    String j22 = b64.j(str4, ".message");
                    String message2 = socialRegistrationProperties2.getMessage();
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3 = null;
                    diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1 = new DiaryArgumentsRecorder$recordSocialRegistrationProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordSocialRegistrationProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label;
        if (i != 0) {
        }
        j = b64.j(str2, ".uid");
        uid = socialRegistrationProperties.getUid();
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$0 = this;
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$1 = str;
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$2 = str2;
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1.L$3 = socialRegistrationProperties;
        diaryArgumentsRecorder$recordSocialRegistrationProperties$1.label = 2;
        if (this.p(uid, str, j, diaryArgumentsRecorder$recordSocialRegistrationProperties$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0193, code lost:
    
        if (r9.p(r6, r8, r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0177, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x015b, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013f, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0123, code lost:
    
        if (r9.p(r2, r8, r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (p("TurboAppAuthProperties", r7, r8, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, TurboAppAuthProperties turboAppAuthProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordTurboAppAuthProperties$1 diaryArgumentsRecorder$recordTurboAppAuthProperties$1;
        b bVar;
        TurboAppAuthProperties turboAppAuthProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordTurboAppAuthProperties$1) {
            diaryArgumentsRecorder$recordTurboAppAuthProperties$1 = (DiaryArgumentsRecorder$recordTurboAppAuthProperties$1) continuationImpl;
            int i = diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = i - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordTurboAppAuthProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 1;
                        break;
                    case 1:
                        turboAppAuthProperties = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".theme");
                        PassportTheme theme = turboAppAuthProperties.getTheme();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 2;
                        if (this.p(theme, str, j, diaryArgumentsRecorder$recordTurboAppAuthProperties$1) != coroutineSingletons) {
                            TurboAppAuthProperties turboAppAuthProperties3 = turboAppAuthProperties;
                            bVar = this;
                            turboAppAuthProperties2 = turboAppAuthProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".environment");
                            PassportEnvironmentImpl environment = turboAppAuthProperties2.getEnvironment();
                            diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties2;
                            diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 3;
                            break;
                        }
                        return coroutineSingletons;
                    case 2:
                        turboAppAuthProperties2 = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".environment");
                        PassportEnvironmentImpl environment2 = turboAppAuthProperties2.getEnvironment();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 3;
                        break;
                    case 3:
                        turboAppAuthProperties2 = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".uid");
                        PassportUidImpl uid = turboAppAuthProperties2.getUid();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 4;
                        break;
                    case 4:
                        turboAppAuthProperties2 = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".clientId");
                        String clientId = turboAppAuthProperties2.getClientId();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 5;
                        break;
                    case 5:
                        turboAppAuthProperties2 = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".turboAppIdentifier");
                        String turboAppIdentifier = turboAppAuthProperties2.getTurboAppIdentifier();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = turboAppAuthProperties2;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 6;
                        break;
                    case 6:
                        turboAppAuthProperties2 = (TurboAppAuthProperties) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j6 = b64.j(str4, ".scopes");
                        List<String> scopes = turboAppAuthProperties2.getScopes();
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label = 7;
                        break;
                    case 7:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordTurboAppAuthProperties$1 = new DiaryArgumentsRecorder$recordTurboAppAuthProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordTurboAppAuthProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (diaryArgumentsRecorder$recordTurboAppAuthProperties$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0118, code lost:
    
        if (r10.p(r2, r9, r11, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fc, code lost:
    
        if (r10.p(r2, r9, r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (p("TurboAuthParams", r8, r9, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(String str, String str2, TurboAuthParams turboAuthParams, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordTurboAuthParams$1 diaryArgumentsRecorder$recordTurboAuthParams$1;
        int i;
        b bVar;
        TurboAuthParams turboAuthParams2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordTurboAuthParams$1) {
            diaryArgumentsRecorder$recordTurboAuthParams$1 = (DiaryArgumentsRecorder$recordTurboAuthParams$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordTurboAuthParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordTurboAuthParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordTurboAuthParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordTurboAuthParams$1.label;
                zy11 zy11Var = zy11.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        if (turboAuthParams != null) {
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = this;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = str;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = str2;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = turboAuthParams;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.label = 2;
                            break;
                        } else {
                            diaryArgumentsRecorder$recordTurboAuthParams$1.label = 1;
                            if (p(turboAuthParams, str, str2, diaryArgumentsRecorder$recordTurboAuthParams$1) != coroutineSingletons) {
                                return zy11Var;
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                    case 6:
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11Var;
                    case 2:
                        turboAuthParams = (TurboAuthParams) diaryArgumentsRecorder$recordTurboAuthParams$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordTurboAuthParams$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".phoneNumber");
                        String phoneNumber = turboAuthParams.getPhoneNumber();
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = this;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = str;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = str2;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = turboAuthParams;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.label = 3;
                        if (this.p(phoneNumber, str, j, diaryArgumentsRecorder$recordTurboAuthParams$1) != coroutineSingletons) {
                            TurboAuthParams turboAuthParams3 = turboAuthParams;
                            bVar = this;
                            turboAuthParams2 = turboAuthParams3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".email");
                            String email = turboAuthParams2.getEmail();
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = str3;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = str4;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = turboAuthParams2;
                            diaryArgumentsRecorder$recordTurboAuthParams$1.label = 4;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        turboAuthParams2 = (TurboAuthParams) diaryArgumentsRecorder$recordTurboAuthParams$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAuthParams$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".email");
                        String email2 = turboAuthParams2.getEmail();
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = turboAuthParams2;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.label = 4;
                        break;
                    case 4:
                        turboAuthParams2 = (TurboAuthParams) diaryArgumentsRecorder$recordTurboAuthParams$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAuthParams$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".firstName");
                        String firstName = turboAuthParams2.getFirstName();
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = str3;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = str4;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = turboAuthParams2;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.label = 5;
                        break;
                    case 5:
                        turboAuthParams2 = (TurboAuthParams) diaryArgumentsRecorder$recordTurboAuthParams$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordTurboAuthParams$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordTurboAuthParams$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".lastName");
                        String lastName = turboAuthParams2.getLastName();
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$0 = null;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$1 = null;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$2 = null;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.L$3 = null;
                        diaryArgumentsRecorder$recordTurboAuthParams$1.label = 6;
                        if (bVar.p(lastName, str3, j4, diaryArgumentsRecorder$recordTurboAuthParams$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordTurboAuthParams$1 = new DiaryArgumentsRecorder$recordTurboAuthParams$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordTurboAuthParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordTurboAuthParams$1.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(Uri uri, String str, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordUri$1 diaryArgumentsRecorder$recordUri$1;
        int i;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordUri$1) {
            diaryArgumentsRecorder$recordUri$1 = (DiaryArgumentsRecorder$recordUri$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordUri$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordUri$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object valueOf = String.valueOf(uri);
                diaryArgumentsRecorder$recordUri$1.label = 1;
                Object p = p(valueOf, str, "Uri", diaryArgumentsRecorder$recordUri$1);
                return p == obj2 ? obj2 : p;
            }
        }
        diaryArgumentsRecorder$recordUri$1 = new DiaryArgumentsRecorder$recordUri$1(this, continuationImpl);
        Object obj3 = diaryArgumentsRecorder$recordUri$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordUri$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (p("UserMenuProperties", r9, r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, String str2, UserMenuProperties userMenuProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordUserMenuProperties$1 diaryArgumentsRecorder$recordUserMenuProperties$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String j;
        PassportTheme theme;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordUserMenuProperties$1) {
            diaryArgumentsRecorder$recordUserMenuProperties$1 = (DiaryArgumentsRecorder$recordUserMenuProperties$1) continuationImpl;
            int i2 = diaryArgumentsRecorder$recordUserMenuProperties$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordUserMenuProperties$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordUserMenuProperties$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryArgumentsRecorder$recordUserMenuProperties$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (userMenuProperties == null) {
                        diaryArgumentsRecorder$recordUserMenuProperties$1.label = 1;
                        if (p(userMenuProperties, str, str2, diaryArgumentsRecorder$recordUserMenuProperties$1) != coroutineSingletons) {
                            return zy11Var;
                        }
                    } else {
                        diaryArgumentsRecorder$recordUserMenuProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordUserMenuProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordUserMenuProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordUserMenuProperties$1.L$3 = userMenuProperties;
                        diaryArgumentsRecorder$recordUserMenuProperties$1.label = 2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        userMenuProperties = (UserMenuProperties) diaryArgumentsRecorder$recordUserMenuProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordUserMenuProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordUserMenuProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordUserMenuProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                    } else if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                return zy11Var;
                j = b64.j(str2, ".theme");
                theme = userMenuProperties.getTheme();
                diaryArgumentsRecorder$recordUserMenuProperties$1.L$0 = null;
                diaryArgumentsRecorder$recordUserMenuProperties$1.L$1 = null;
                diaryArgumentsRecorder$recordUserMenuProperties$1.L$2 = null;
                diaryArgumentsRecorder$recordUserMenuProperties$1.L$3 = null;
                diaryArgumentsRecorder$recordUserMenuProperties$1.label = 3;
                if (this.p(theme, str, j, diaryArgumentsRecorder$recordUserMenuProperties$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        diaryArgumentsRecorder$recordUserMenuProperties$1 = new DiaryArgumentsRecorder$recordUserMenuProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordUserMenuProperties$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryArgumentsRecorder$recordUserMenuProperties$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        j = b64.j(str2, ".theme");
        theme = userMenuProperties.getTheme();
        diaryArgumentsRecorder$recordUserMenuProperties$1.L$0 = null;
        diaryArgumentsRecorder$recordUserMenuProperties$1.L$1 = null;
        diaryArgumentsRecorder$recordUserMenuProperties$1.L$2 = null;
        diaryArgumentsRecorder$recordUserMenuProperties$1.L$3 = null;
        diaryArgumentsRecorder$recordUserMenuProperties$1.label = 3;
        if (this.p(theme, str, j, diaryArgumentsRecorder$recordUserMenuProperties$1) != coroutineSingletons) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x02f3, code lost:
    
        if (r9.b(r8, r7, r6, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02d6, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02b9, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0298, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0276, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0258, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x023a, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x021d, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0200, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01df, code lost:
    
        if (r9.p(r2, r8, r10, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c2, code lost:
    
        if (r9.p(r2, r8, r10, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017a, code lost:
    
        if (p("VisualProperties", r7, r8, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(String str, String str2, VisualProperties visualProperties, ContinuationImpl continuationImpl) {
        DiaryArgumentsRecorder$recordVisualProperties$1 diaryArgumentsRecorder$recordVisualProperties$1;
        b bVar;
        VisualProperties visualProperties2;
        String str3;
        String str4;
        if (continuationImpl instanceof DiaryArgumentsRecorder$recordVisualProperties$1) {
            diaryArgumentsRecorder$recordVisualProperties$1 = (DiaryArgumentsRecorder$recordVisualProperties$1) continuationImpl;
            int i = diaryArgumentsRecorder$recordVisualProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                diaryArgumentsRecorder$recordVisualProperties$1.label = i - Integer.MIN_VALUE;
                Object obj = diaryArgumentsRecorder$recordVisualProperties$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (diaryArgumentsRecorder$recordVisualProperties$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 1;
                        break;
                    case 1:
                        visualProperties = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str2 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        this = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j = b64.j(str2, ".isNoReturnToHost");
                        Boolean valueOf = Boolean.valueOf(visualProperties.isNoReturnToHost());
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = this;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str2;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 2;
                        if (this.p(valueOf, str, j, diaryArgumentsRecorder$recordVisualProperties$1) != coroutineSingletons) {
                            VisualProperties visualProperties3 = visualProperties;
                            bVar = this;
                            visualProperties2 = visualProperties3;
                            String str5 = str2;
                            str3 = str;
                            str4 = str5;
                            String j2 = b64.j(str4, ".isSkipButtonShown");
                            Boolean valueOf2 = Boolean.valueOf(visualProperties2.isSkipButtonShown());
                            diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                            diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                            diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                            diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                            diaryArgumentsRecorder$recordVisualProperties$1.label = 3;
                            break;
                        }
                        return coroutineSingletons;
                    case 2:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j22 = b64.j(str4, ".isSkipButtonShown");
                        Boolean valueOf22 = Boolean.valueOf(visualProperties2.isSkipButtonShown());
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 3;
                        break;
                    case 3:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j3 = b64.j(str4, ".identifierHintVariant");
                        PassportIdentifierHintVariant identifierHintVariant = visualProperties2.getIdentifierHintVariant();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 4;
                        break;
                    case 4:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j4 = b64.j(str4, ".isSocialAuthorizationEnabled");
                        Boolean valueOf3 = Boolean.valueOf(visualProperties2.isSocialAuthorizationEnabled());
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 5;
                        break;
                    case 5:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j5 = b64.j(str4, ".authMessage");
                        String authMessage = visualProperties2.getAuthMessage();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 6;
                        break;
                    case 6:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j6 = b64.j(str4, ".usernameMessage");
                        String usernameMessage = visualProperties2.getUsernameMessage();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 7;
                        break;
                    case 7:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j7 = b64.j(str4, ".registrationMessage");
                        String registrationMessage = visualProperties2.getRegistrationMessage();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 8;
                        break;
                    case 8:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j8 = b64.j(str4, ".deleteAccountMessage");
                        String deleteAccountMessage = visualProperties2.getDeleteAccountMessage();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 9;
                        break;
                    case 9:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j9 = b64.j(str4, ".isPreferPhonishAuth");
                        Boolean valueOf4 = Boolean.valueOf(visualProperties2.isPreferPhonishAuth());
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 10;
                        break;
                    case 10:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j10 = b64.j(str4, ".isChoosingAnotherAccountOnReloginButtonHidden");
                        Boolean valueOf5 = Boolean.valueOf(visualProperties2.isChoosingAnotherAccountOnReloginButtonHidden());
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 11;
                        break;
                    case 11:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j11 = b64.j(str4, ".customLogoText");
                        String customLogoText = visualProperties2.getCustomLogoText();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = bVar;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = str3;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = str4;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = visualProperties2;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 12;
                        break;
                    case 12:
                        visualProperties2 = (VisualProperties) diaryArgumentsRecorder$recordVisualProperties$1.L$3;
                        str4 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$2;
                        str3 = (String) diaryArgumentsRecorder$recordVisualProperties$1.L$1;
                        bVar = (b) diaryArgumentsRecorder$recordVisualProperties$1.L$0;
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        String j12 = b64.j(str4, ".accountListProperties");
                        AccountListProperties accountListProperties = visualProperties2.getAccountListProperties();
                        diaryArgumentsRecorder$recordVisualProperties$1.L$0 = null;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$1 = null;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$2 = null;
                        diaryArgumentsRecorder$recordVisualProperties$1.L$3 = null;
                        diaryArgumentsRecorder$recordVisualProperties$1.label = 13;
                        break;
                    case 13:
                        kotlin.b.b(obj);
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        diaryArgumentsRecorder$recordVisualProperties$1 = new DiaryArgumentsRecorder$recordVisualProperties$1(this, continuationImpl);
        Object obj2 = diaryArgumentsRecorder$recordVisualProperties$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (diaryArgumentsRecorder$recordVisualProperties$1.label) {
        }
    }
}
