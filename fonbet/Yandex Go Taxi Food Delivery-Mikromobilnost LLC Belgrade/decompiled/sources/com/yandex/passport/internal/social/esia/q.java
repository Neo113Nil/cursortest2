package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.c7;
import com.yandex.passport.internal.report.d7;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.reporters.EsiaBindingReporter$EsiaWay;
import com.yandex.passport.internal.report.x6;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.social.esia.EsiaBindViewModel$Result;
import com.yandex.passport.internal.social.esia.EsiaInternalBindProperties;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.cvu0;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.w511;
import defpackage.zy11;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class q extends com.yandex.passport.common.mvi.g {
    public final com.yandex.passport.internal.usecase.y c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final l0 e;
    public final com.yandex.passport.internal.report.reporters.y f;
    public final k0 g;

    public q(com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.common.ui.lang.b bVar, l0 l0Var, com.yandex.passport.internal.report.reporters.y yVar2, k0 k0Var) {
        this.c = yVar;
        this.d = bVar;
        this.e = l0Var;
        this.f = yVar2;
        this.g = k0Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        f0 f0Var = (f0) obj;
        boolean z = f0Var instanceof b0;
        zy11 zy11Var = zy11.a;
        if (z) {
            a(new v(true));
            return zy11Var;
        }
        if (f0Var instanceof c0) {
            c0 c0Var = (c0) f0Var;
            Object l = l(c0Var.a, c0Var.b, (ContinuationImpl) continuation);
            if (l == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return l;
            }
        } else {
            if (f0Var instanceof d0) {
                Uri uri = ((d0) f0Var).a;
                String queryParameter = uri != null ? uri.getQueryParameter("task_id") : null;
                a(new w((!jl40.l(uri != null ? uri.getQueryParameter(ACSPConstants.STATUS) : null, WriteBlocks.OK) || queryParameter == null) ? EsiaBindViewModel$Result.Canceled.INSTANCE : new EsiaBindViewModel$Result.Success(queryParameter)));
                return zy11Var;
            }
            if (!(f0Var instanceof e0)) {
                w511.b();
                return null;
            }
            if (((EsiaBindViewModel$InternalState) g()).getUiState().isWaitingForEsiaCallback()) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "The app resumed without esia results in callback", 8);
                }
                a(s.a);
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        a(new t(th));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.common.mvi.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(p pVar, ContinuationImpl continuationImpl) {
        EsiaBindStoreFactory$ExecutorImpl$executeActionSafe$1 esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1;
        int i;
        try {
            if (continuationImpl instanceof EsiaBindStoreFactory$ExecutorImpl$executeActionSafe$1) {
                esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1 = (EsiaBindStoreFactory$ExecutorImpl$executeActionSafe$1) continuationImpl;
                int i2 = esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (!(pVar instanceof n)) {
                            if (!(pVar instanceof o)) {
                                w511.b();
                                return null;
                            }
                            return zy11.a;
                        }
                        esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.L$0 = this;
                        esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.label = 1;
                        Object m = m(esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1);
                        this = m;
                        if (m == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        q qVar = (q) esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.L$0;
                        kotlin.b.b(obj);
                        this = qVar;
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Throwable th) {
            com.yandex.passport.internal.report.reporters.y yVar = this.f;
            yVar.getClass();
            yVar.f(c7.w, new yd(th));
            throw th;
        }
        esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1 = new EsiaBindStoreFactory$ExecutorImpl$executeActionSafe$1(this, continuationImpl);
        Object obj2 = esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = esiaBindStoreFactory$ExecutorImpl$executeActionSafe$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Uri uri, EsiaBindingReporter$EsiaWay esiaBindingReporter$EsiaWay, ContinuationImpl continuationImpl) {
        EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1 esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1;
        int i;
        Uid uid;
        Throwable th;
        String queryParameter;
        String queryParameter2;
        try {
            if (continuationImpl instanceof EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1) {
                esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1 = (EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1) continuationImpl;
                int i2 = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1.label = i2 - Integer.MIN_VALUE;
                    EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1 esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12 = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1;
                    Object obj = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a(new v(false));
                        EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) g();
                        EsiaInternalBindProperties esiaInternalBindProperties = esiaBindViewModel$InternalState.getEsiaInternalBindProperties();
                        EsiaInternalBindProperties.UserAwareRequest userAwareRequest = esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest ? (EsiaInternalBindProperties.UserAwareRequest) esiaInternalBindProperties : null;
                        uid = userAwareRequest != null ? userAwareRequest.getUid() : null;
                        if (uri != null) {
                            try {
                                queryParameter = uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE);
                            } catch (Throwable th2) {
                                th = th2;
                                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "An error occurred while processing url from esia.", th);
                                }
                                com.yandex.passport.internal.report.reporters.y yVar = this.f;
                                yVar.getClass();
                                ListBuilder a = rcc.a();
                                if (uid != null) {
                                    a.add(new yd(uid));
                                }
                                if (esiaBindingReporter$EsiaWay != null) {
                                    a.add(new com.yandex.passport.internal.report.i(esiaBindingReporter$EsiaWay.getValue(), 0, false));
                                }
                                a.add(new yd(th));
                                yVar.e(x6.w, a.j());
                                throw th;
                            }
                        } else {
                            queryParameter = null;
                        }
                        String queryParameter3 = uri != null ? uri.getQueryParameter(ClidProvider.STATE) : null;
                        com.yandex.passport.internal.report.reporters.y yVar2 = this.f;
                        if (queryParameter == null || queryParameter3 == null) {
                            String queryParameter4 = uri != null ? uri.getQueryParameter("error") : null;
                            String v = (uri == null || (queryParameter2 = uri.getQueryParameter("error_description")) == null) ? null : cvu0.v(queryParameter2, "+", " ", false);
                            if (queryParameter4 != null) {
                                yVar2.k(uid, queryParameter4, v == null ? "" : v, esiaBindingReporter$EsiaWay);
                                a(new u(new EsiaException(queryParameter4, v)));
                            } else {
                                yVar2.j(uid, esiaBindingReporter$EsiaWay);
                                a(new w(EsiaBindViewModel$Result.Canceled.INSTANCE));
                            }
                            return zy11.a;
                        }
                        yVar2.l(uid, esiaBindingReporter$EsiaWay);
                        l0 l0Var = this.e;
                        Environment environment = esiaInternalBindProperties.getEnvironment();
                        SocialismUrlProvider$ActualTheme actualTheme = esiaBindViewModel$InternalState.getActualTheme();
                        esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$0 = this;
                        esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$1 = esiaBindingReporter$EsiaWay;
                        esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$2 = uid;
                        esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.label = 1;
                        obj = l0Var.c(queryParameter, queryParameter3, environment, actualTheme, esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Uid uid2 = (Uid) esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$2;
                        esiaBindingReporter$EsiaWay = (EsiaBindingReporter$EsiaWay) esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$1;
                        q qVar = (q) esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$12.L$0;
                        try {
                            kotlin.b.b(obj);
                            this = qVar;
                        } catch (Throwable th3) {
                            th = th3;
                            uid = uid2;
                            this = qVar;
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            com.yandex.passport.internal.report.reporters.y yVar3 = this.f;
                            yVar3.getClass();
                            ListBuilder a2 = rcc.a();
                            if (uid != null) {
                            }
                            if (esiaBindingReporter$EsiaWay != null) {
                            }
                            a2.add(new yd(th));
                            yVar3.e(x6.w, a2.j());
                            throw th;
                        }
                    }
                    this.a(new r((String) obj));
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            this.a(new r((String) obj));
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1 = new EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1(this, continuationImpl);
        EsiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1 esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$122 = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$1;
        Object obj2 = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = esiaBindStoreFactory$ExecutorImpl$onEsiaCallback$122.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if (r1 == r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        EsiaBindStoreFactory$ExecutorImpl$onInit$1 esiaBindStoreFactory$ExecutorImpl$onInit$1;
        int i;
        EsiaInternalBindProperties esiaInternalBindProperties;
        String str;
        q qVar;
        EsiaInternalBindProperties esiaInternalBindProperties2;
        Uid uid;
        String application;
        String consumer;
        String scope;
        Object obj;
        q qVar2 = this;
        if (continuationImpl instanceof EsiaBindStoreFactory$ExecutorImpl$onInit$1) {
            esiaBindStoreFactory$ExecutorImpl$onInit$1 = (EsiaBindStoreFactory$ExecutorImpl$onInit$1) continuationImpl;
            int i2 = esiaBindStoreFactory$ExecutorImpl$onInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esiaBindStoreFactory$ExecutorImpl$onInit$1.label = i2 - Integer.MIN_VALUE;
                EsiaBindStoreFactory$ExecutorImpl$onInit$1 esiaBindStoreFactory$ExecutorImpl$onInit$12 = esiaBindStoreFactory$ExecutorImpl$onInit$1;
                Object obj2 = esiaBindStoreFactory$ExecutorImpl$onInit$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = esiaBindStoreFactory$ExecutorImpl$onInit$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) qVar2.g();
                    esiaInternalBindProperties = esiaBindViewModel$InternalState.getEsiaInternalBindProperties();
                    SocialismUrlProvider$ActualTheme actualTheme = esiaBindViewModel$InternalState.getActualTheme();
                    String concat = esiaBindViewModel$InternalState.getUiState().isEsiaBindingAppToApp() ? (qVar2.g.a.getPackageName() + ".passport").concat("://esia") : null;
                    esiaBindStoreFactory$ExecutorImpl$onInit$12.L$0 = qVar2;
                    esiaBindStoreFactory$ExecutorImpl$onInit$12.L$1 = esiaInternalBindProperties;
                    esiaBindStoreFactory$ExecutorImpl$onInit$12.label = 1;
                    l0 l0Var = qVar2.e;
                    l0Var.getClass();
                    if (esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest) {
                        EsiaInternalBindProperties.UserAwareRequest userAwareRequest = (EsiaInternalBindProperties.UserAwareRequest) esiaInternalBindProperties;
                        obj2 = l0Var.d(userAwareRequest.getEnvironment(), userAwareRequest.getApplication(), userAwareRequest.getConsumer(), userAwareRequest.getScope(), actualTheme, concat, esiaBindStoreFactory$ExecutorImpl$onInit$12);
                    } else {
                        if (!(esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserUnknownRequest)) {
                            w511.b();
                            return null;
                        }
                        EsiaInternalBindProperties.UserUnknownRequest userUnknownRequest = (EsiaInternalBindProperties.UserUnknownRequest) esiaInternalBindProperties;
                        Environment environment = userUnknownRequest.getEnvironment();
                        String socialUrl = userUnknownRequest.getSocialUrl();
                        String str2 = environment == Environment.PRODUCTION ? "social.yandex.ru" : "social-test.yandex.ru";
                        jwu jwuVar = new jwu();
                        jwuVar.i(null, socialUrl);
                        jwu g = jwuVar.e().g();
                        g.h(str2);
                        if (concat != null) {
                            g.d("app_to_app_return_url", concat);
                        }
                        g.d("retpath", "https://passport.yandex.ru/closewebview");
                        g.d(DivkitThemeChangeListener.THEME_VARIABLE_NAME, actualTheme.name().toLowerCase(Locale.ROOT));
                        String str3 = g.e().i;
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        obj2 = str3;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Socialism binding flow start url: ".concat(str3), 8);
                            obj2 = str3;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        esiaInternalBindProperties2 = (EsiaInternalBindProperties) esiaBindStoreFactory$ExecutorImpl$onInit$12.L$1;
                        qVar = (q) esiaBindStoreFactory$ExecutorImpl$onInit$12.L$0;
                        kotlin.b.b(obj2);
                        obj = obj2;
                        Object value = ((Result) obj).getValue();
                        kotlin.b.b(value);
                        str = ((com.yandex.passport.common.url.b) value).a;
                        esiaInternalBindProperties = esiaInternalBindProperties2;
                        qVar2 = qVar;
                        EsiaInternalBindProperties.UserAwareRequest userAwareRequest2 = esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest ? (EsiaInternalBindProperties.UserAwareRequest) esiaInternalBindProperties : null;
                        com.yandex.passport.internal.report.reporters.y yVar = qVar2.f;
                        uid = userAwareRequest2 != null ? userAwareRequest2.getUid() : null;
                        application = userAwareRequest2 != null ? userAwareRequest2.getApplication() : null;
                        consumer = userAwareRequest2 != null ? userAwareRequest2.getConsumer() : null;
                        scope = userAwareRequest2 != null ? userAwareRequest2.getScope() : null;
                        yVar.getClass();
                        d7 d7Var = d7.w;
                        ListBuilder a = rcc.a();
                        if (uid != null) {
                            a.add(new yd(uid));
                        }
                        if (application != null) {
                            a.add(new md(application, 26, false));
                        }
                        if (consumer != null) {
                            a.add(new md(consumer, 27, false));
                        }
                        if (scope != null) {
                            a.add(new md(scope, 29, false));
                        }
                        yVar.e(d7Var, a.j());
                        qVar2.a(new r(str));
                        return zy11.a;
                    }
                    EsiaInternalBindProperties esiaInternalBindProperties3 = (EsiaInternalBindProperties) esiaBindStoreFactory$ExecutorImpl$onInit$12.L$1;
                    q qVar3 = (q) esiaBindStoreFactory$ExecutorImpl$onInit$12.L$0;
                    kotlin.b.b(obj2);
                    esiaInternalBindProperties = esiaInternalBindProperties3;
                    qVar2 = qVar3;
                }
                String str4 = (String) obj2;
                if (esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest) {
                    str = str4;
                    if (esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest) {
                    }
                    com.yandex.passport.internal.report.reporters.y yVar2 = qVar2.f;
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    yVar2.getClass();
                    d7 d7Var2 = d7.w;
                    ListBuilder a2 = rcc.a();
                    if (uid != null) {
                    }
                    if (application != null) {
                    }
                    if (consumer != null) {
                    }
                    if (scope != null) {
                    }
                    yVar2.e(d7Var2, a2.j());
                    qVar2.a(new r(str));
                    return zy11.a;
                }
                com.yandex.passport.internal.usecase.y yVar3 = qVar2.c;
                com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(((EsiaInternalBindProperties.UserAwareRequest) esiaInternalBindProperties).getUid(), ((com.yandex.passport.internal.ui.lang.a) qVar2.d).b(), str4, ClearCryptoProPrefs.COUNTRY, kotlin.collections.b.f(), (FrontendUrlType) null, 80);
                esiaBindStoreFactory$ExecutorImpl$onInit$12.L$0 = qVar2;
                esiaBindStoreFactory$ExecutorImpl$onInit$12.L$1 = esiaInternalBindProperties;
                esiaBindStoreFactory$ExecutorImpl$onInit$12.label = 2;
                Object a3 = yVar3.a(wVar, esiaBindStoreFactory$ExecutorImpl$onInit$12);
                if (a3 != coroutineSingletons) {
                    qVar = qVar2;
                    esiaInternalBindProperties2 = esiaInternalBindProperties;
                    obj = a3;
                    Object value2 = ((Result) obj).getValue();
                    kotlin.b.b(value2);
                    str = ((com.yandex.passport.common.url.b) value2).a;
                    esiaInternalBindProperties = esiaInternalBindProperties2;
                    qVar2 = qVar;
                    if (esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest) {
                    }
                    com.yandex.passport.internal.report.reporters.y yVar22 = qVar2.f;
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    if (userAwareRequest2 != null) {
                    }
                    yVar22.getClass();
                    d7 d7Var22 = d7.w;
                    ListBuilder a22 = rcc.a();
                    if (uid != null) {
                    }
                    if (application != null) {
                    }
                    if (consumer != null) {
                    }
                    if (scope != null) {
                    }
                    yVar22.e(d7Var22, a22.j());
                    qVar2.a(new r(str));
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        esiaBindStoreFactory$ExecutorImpl$onInit$1 = new EsiaBindStoreFactory$ExecutorImpl$onInit$1(qVar2, continuationImpl);
        EsiaBindStoreFactory$ExecutorImpl$onInit$1 esiaBindStoreFactory$ExecutorImpl$onInit$122 = esiaBindStoreFactory$ExecutorImpl$onInit$1;
        Object obj22 = esiaBindStoreFactory$ExecutorImpl$onInit$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = esiaBindStoreFactory$ExecutorImpl$onInit$122.label;
        if (i != 0) {
        }
        String str42 = (String) obj22;
        if (esiaInternalBindProperties instanceof EsiaInternalBindProperties.UserAwareRequest) {
        }
    }
}
