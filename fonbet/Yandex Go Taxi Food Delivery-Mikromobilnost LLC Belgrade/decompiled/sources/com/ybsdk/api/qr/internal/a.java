package com.ybsdk.api.qr.internal;

import android.net.Uri;
import com.ybsdk.api.YBSdkScreenIntent$Deeplink;
import com.ybsdk.api.qr.YBQRResolveError;
import com.ybsdk.api.qr.YBQRRulesLoadError;
import com.ybsdk.common.SdkUserAuthRequirement;
import com.ybsdk.common.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.ResultCommon;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.qr.api.domain.QrResolvingRulesSource;
import defpackage.a3h;
import defpackage.dtj0;
import defpackage.evu0;
import defpackage.hg51;
import defpackage.jl40;
import defpackage.kdg0;
import defpackage.ldg0;
import defpackage.mdg0;
import defpackage.ndg0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.w691;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements hg51 {
    public final com.ybsdk.feature.qr.api.domain.a a;
    public final com.ybsdk.qr.a b;
    public final a3h c;
    public final AppAnalyticsReporter d;
    public final e e;
    public volatile dtj0 f;

    public a(com.ybsdk.feature.qr.api.domain.a aVar, com.ybsdk.qr.a aVar2, a3h a3hVar, AppAnalyticsReporter appAnalyticsReporter, e eVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = a3hVar;
        this.d = appAnalyticsReporter;
        this.e = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r6.getErrorResponse().getCode() != 429) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r6.getLastException().getErrorResponse().getCode() != 429) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YBQRScanningResolverImpl$loadRules$1 yBQRScanningResolverImpl$loadRules$1;
        int i;
        Object a;
        Throwable a2;
        Object a3;
        Throwable network;
        if (continuationImpl instanceof YBQRScanningResolverImpl$loadRules$1) {
            yBQRScanningResolverImpl$loadRules$1 = (YBQRScanningResolverImpl$loadRules$1) continuationImpl;
            int i2 = yBQRScanningResolverImpl$loadRules$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBQRScanningResolverImpl$loadRules$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBQRScanningResolverImpl$loadRules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBQRScanningResolverImpl$loadRules$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.d.Z.a.a("qr_resolver.load_rules.initiated", null);
                    e eVar = this.e;
                    yBQRScanningResolverImpl$loadRules$1.label = 1;
                    a = eVar.a("makeQRScanningResolver.loadRules", SdkUserAuthRequirement.IS_NORMAL, yBQRScanningResolverImpl$loadRules$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        a3 = ((Result) obj).getValue();
                        Throwable a4 = Result.a(a3);
                        if (a4 == null) {
                            this.f = (dtj0) a3;
                            this.d.Z.j(ResultCommon.OK, null);
                            return zy11.a;
                        }
                        this.d.Z.j(ResultCommon.ERROR, a4.getMessage());
                        if (a4 instanceof FailDataException) {
                            network = new YBQRRulesLoadError.Server(((FailDataException) a4).getError(), a4);
                        } else {
                            if (a4 instanceof ErrorResponseException) {
                                ErrorResponseException errorResponseException = (ErrorResponseException) a4;
                                if (errorResponseException.getErrorResponse().getCode() < 500) {
                                }
                                String message = a4.getMessage();
                                network = new YBQRRulesLoadError.Server(message != null ? message : "", a4);
                            }
                            if (a4 instanceof RetryTimeoutException.ServiceUnresponsive) {
                                RetryTimeoutException.ServiceUnresponsive serviceUnresponsive = (RetryTimeoutException.ServiceUnresponsive) a4;
                                if (serviceUnresponsive.getLastException().getErrorResponse().getCode() < 500) {
                                }
                                String message2 = a4.getMessage();
                                network = new YBQRRulesLoadError.Server(message2 != null ? message2 : "", a4);
                            }
                            String message3 = a4.getMessage();
                            network = new YBQRRulesLoadError.Network(message3 != null ? message3 : "", a4);
                        }
                        return new Result.Failure(network);
                    }
                    b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new Result.Failure(a2);
                }
                com.ybsdk.feature.qr.api.domain.a aVar = this.a;
                QrResolvingRulesSource qrResolvingRulesSource = QrResolvingRulesSource.EXTERNAL;
                yBQRScanningResolverImpl$loadRules$1.label = 2;
                a3 = aVar.a(qrResolvingRulesSource, yBQRScanningResolverImpl$loadRules$1);
            }
        }
        yBQRScanningResolverImpl$loadRules$1 = new YBQRScanningResolverImpl$loadRules$1(this, continuationImpl);
        Object obj2 = yBQRScanningResolverImpl$loadRules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBQRScanningResolverImpl$loadRules$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        YBQRScanningResolverImpl$resolve$1 yBQRScanningResolverImpl$resolve$1;
        int i;
        String str2;
        String str3;
        kdg0 kdg0Var;
        Deeplink e;
        if (continuationImpl instanceof YBQRScanningResolverImpl$resolve$1) {
            yBQRScanningResolverImpl$resolve$1 = (YBQRScanningResolverImpl$resolve$1) continuationImpl;
            int i2 = yBQRScanningResolverImpl$resolve$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBQRScanningResolverImpl$resolve$1.label = i2 - Integer.MIN_VALUE;
                YBQRScanningResolverImpl$resolve$1 yBQRScanningResolverImpl$resolve$12 = yBQRScanningResolverImpl$resolve$1;
                Object obj = yBQRScanningResolverImpl$resolve$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBQRScanningResolverImpl$resolve$12.label;
                if (i != 0) {
                    b.b(obj);
                    String obj2 = evu0.k0(str).toString();
                    String host = Uri.parse(obj2).getHost();
                    dtj0 dtj0Var = this.f;
                    if (dtj0Var == null) {
                        YBQRResolveError.RulesNotLoaded rulesNotLoaded = new YBQRResolveError.RulesNotLoaded();
                        this.d.Z.k(host, ResultCommon.ERROR, rulesNotLoaded.getMessage());
                        return new Result.Failure(rulesNotLoaded);
                    }
                    com.ybsdk.qr.a aVar = this.b;
                    yBQRScanningResolverImpl$resolve$12.L$0 = obj2;
                    yBQRScanningResolverImpl$resolve$12.L$1 = host;
                    yBQRScanningResolverImpl$resolve$12.label = 1;
                    Object b = aVar.b(obj2, "", dtj0Var, null, null, false, false, yBQRScanningResolverImpl$resolve$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    str2 = host;
                    str3 = obj2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) yBQRScanningResolverImpl$resolve$12.L$1;
                    str3 = (String) yBQRScanningResolverImpl$resolve$12.L$0;
                    b.b(obj);
                }
                kdg0Var = (kdg0) obj;
                ndg0 ndg0Var = kdg0Var.c;
                if (str2 == null) {
                    str2 = jl40.l(kdg0Var.b, StringUtils.UNDEFINED) ? str3 : null;
                }
                if (kdg0Var.a || ndg0Var == null) {
                    YBQRResolveError.NoMatchingRule noMatchingRule = new YBQRResolveError.NoMatchingRule();
                    this.d.Z.k(str2, ResultCommon.ERROR, noMatchingRule.getMessage());
                    return new Result.Failure(noMatchingRule);
                }
                if (ndg0Var instanceof ldg0) {
                    e = (Deeplink) kotlin.collections.a.R(((ldg0) ndg0Var).a);
                } else {
                    if (!(ndg0Var instanceof mdg0)) {
                        w511.b();
                        return null;
                    }
                    e = w691.e(this.c, ((mdg0) ndg0Var).a, true, null, true, 4);
                }
                if (e != null) {
                    this.d.Z.k(str2, ResultCommon.OK, null);
                    return new YBSdkScreenIntent$Deeplink(e);
                }
                YBQRResolveError.NoMatchingRule noMatchingRule2 = new YBQRResolveError.NoMatchingRule();
                this.d.Z.k(str2, ResultCommon.ERROR, noMatchingRule2.getMessage());
                return new Result.Failure(noMatchingRule2);
            }
        }
        yBQRScanningResolverImpl$resolve$1 = new YBQRScanningResolverImpl$resolve$1(this, continuationImpl);
        YBQRScanningResolverImpl$resolve$1 yBQRScanningResolverImpl$resolve$122 = yBQRScanningResolverImpl$resolve$1;
        Object obj3 = yBQRScanningResolverImpl$resolve$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBQRScanningResolverImpl$resolve$122.label;
        if (i != 0) {
        }
        kdg0Var = (kdg0) obj3;
        ndg0 ndg0Var2 = kdg0Var.c;
        if (str2 == null) {
        }
        if (kdg0Var.a) {
        }
        YBQRResolveError.NoMatchingRule noMatchingRule3 = new YBQRResolveError.NoMatchingRule();
        this.d.Z.k(str2, ResultCommon.ERROR, noMatchingRule3.getMessage());
        return new Result.Failure(noMatchingRule3);
    }
}
