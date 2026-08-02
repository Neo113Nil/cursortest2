package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.common.core.JwtToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.ebs.BiometricAuthSdkProperties;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.data.exceptions.EbsBackendErrorsException;
import com.yandex.passport.internal.report.a3;
import com.yandex.passport.internal.report.d3;
import com.yandex.passport.internal.report.e3;
import com.yandex.passport.internal.report.f4;
import com.yandex.passport.internal.report.g4;
import com.yandex.passport.internal.report.h3;
import com.yandex.passport.internal.report.i3;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.l3;
import com.yandex.passport.internal.report.m3;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.n2;
import com.yandex.passport.internal.report.n3;
import com.yandex.passport.internal.report.o2;
import com.yandex.passport.internal.report.p2;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.q2;
import com.yandex.passport.internal.report.r2;
import com.yandex.passport.internal.report.u2;
import com.yandex.passport.internal.report.v2;
import com.yandex.passport.internal.report.y2;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z2;
import com.yandex.passport.internal.ui.sloth.ebs.EbsProcessState;
import com.yandex.passport.internal.usecase.k1;
import com.yandex.passport.internal.usecase.l1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothVariant$BiometricVerification;
import defpackage.cvu0;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.scc;
import defpackage.spb1;
import defpackage.unr0;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes2.dex */
public final class v extends com.yandex.passport.common.mvi.g {
    public final Context c;
    public final BiometricVerificationProperties d;
    public final com.yandex.passport.common.ebs.t e;
    public final com.yandex.passport.internal.usecase.d f;
    public final com.yandex.passport.internal.usecase.y0 g;
    public final l1 h;
    public final com.yandex.passport.internal.usecase.l i;
    public final com.yandex.passport.internal.usecase.f j;
    public final com.yandex.passport.internal.report.reporters.v k;
    public final SlothParams l;

    public v(Context context, BiometricVerificationProperties biometricVerificationProperties, com.yandex.passport.common.ebs.t tVar, com.yandex.passport.internal.usecase.d dVar, com.yandex.passport.internal.usecase.y0 y0Var, l1 l1Var, com.yandex.passport.internal.usecase.l lVar, com.yandex.passport.internal.usecase.f fVar, com.yandex.passport.internal.report.reporters.v vVar) {
        this.c = context;
        this.d = biometricVerificationProperties;
        this.e = tVar;
        this.f = dVar;
        this.g = y0Var;
        this.h = l1Var;
        this.i = lVar;
        this.j = fVar;
        this.k = vVar;
        this.l = new SlothParams(new SlothVariant$BiometricVerification(biometricVerificationProperties.getUid(), com.yandex.passport.internal.properties.u.X(biometricVerificationProperties.getTheme()), biometricVerificationProperties.getBiometricSessionId(), biometricVerificationProperties.getServiceId(), context.getPackageName() + ".passport"), biometricVerificationProperties.getUid().getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null);
    }

    public static void k(v vVar, EbsState ebsState) {
        BiometricVerificationStoreFactory$Companion$Trigger biometricVerificationStoreFactory$Companion$Trigger = BiometricVerificationStoreFactory$Companion$Trigger.AM;
        vVar.getClass();
        vVar.l(new EbsProcessState.Common(ebsState), biometricVerificationStoreFactory$Companion$Trigger);
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object h(Object obj, Continuation continuation) {
        t tVar = (t) obj;
        boolean z = tVar instanceof n;
        zy11 zy11Var = zy11.a;
        if (!z) {
            boolean l = jl40.l(tVar, r.a);
            m mVar = m.a;
            if (l) {
                BiometricVerificationProperties biometricVerificationProperties = this.d;
                Uid uid = biometricVerificationProperties.getUid();
                String biometricSessionId = biometricVerificationProperties.getBiometricSessionId();
                String flowId = biometricVerificationProperties.getFlowId();
                String serviceId = biometricVerificationProperties.getServiceId();
                com.yandex.passport.internal.report.reporters.v vVar = this.k;
                vVar.getClass();
                vVar.f(f4.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new com.yandex.passport.internal.report.i(flowId, 2), new md(serviceId, 19));
                e(mVar);
                return zy11Var;
            }
            boolean l2 = jl40.l(tVar, mVar);
            p pVar = p.a;
            if (l2) {
                if (this.e.a()) {
                    k(this, EbsState.SESSION_INIT);
                    e(pVar);
                    return zy11Var;
                }
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Biometric module not implementation", 8);
                }
                p(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR);
                a(new a0(601));
                return zy11Var;
            }
            if (jl40.l(tVar, pVar)) {
                Object r = r((ContinuationImpl) continuation);
                if (r == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return r;
                }
            } else if (jl40.l(tVar, o.a)) {
                Object q = q((ContinuationImpl) continuation);
                if (q == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return q;
                }
            } else if (jl40.l(tVar, s.a)) {
                Object t = t((ContinuationImpl) continuation);
                if (t == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return t;
                }
            } else {
                if (!jl40.l(tVar, q.a)) {
                    w511.b();
                    return null;
                }
                Object u = u((ContinuationImpl) continuation);
                if (u == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return u;
                }
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final Object i(Object obj, Continuation continuation) {
        String uuid;
        EbsState ebsState;
        Uri uri;
        Uri parse;
        EbsState ebsState2;
        z0 z0Var = (z0) obj;
        boolean z = z0Var instanceof w0;
        zy11 zy11Var = zy11.a;
        Uri uri2 = null;
        if (z) {
            com.yandex.passport.sloth.i0 i0Var = ((w0) z0Var).a;
            if (i0Var instanceof com.yandex.passport.sloth.a0) {
                Throwable th = ((com.yandex.passport.sloth.a0) i0Var).a;
                if (th instanceof InvalidTokenException) {
                    p(null);
                    a(new a0(401));
                } else {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "SlothExternalRequest.Failed " + th, 8);
                    }
                    EbsState ebsState3 = EbsState.UNEXPECTED_AM_ERROR;
                    EbsReasonFailed.Companion.getClass();
                    s(ebsState3, c1.a(th));
                }
            } else if (i0Var instanceof com.yandex.passport.sloth.e0) {
                com.yandex.passport.sloth.e0 e0Var = (com.yandex.passport.sloth.e0) i0Var;
                String str = e0Var.a;
                EbsProcessState ebsProcessState = ((BiometricVerificationViewModel$State) g()).getEbsProcessState();
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, unr0.r(new StringBuilder("Request change EBS process state, current state = "), (ebsProcessState == null || (ebsState2 = ebsProcessState.getEbsState()) == null) ? null : ebsState2.name(), ", newState = ", str), 8);
                }
                try {
                    ebsState = EbsState.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    ebsState = EbsState.UNKNOWN_STATE_FOR_AM;
                }
                int i = u.a[ebsState.ordinal()];
                if (i == 1) {
                    String str2 = e0Var.b;
                    String str3 = e0Var.c;
                    String str4 = e0Var.d;
                    if (str2 == null) {
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.ESIA_CONSENT_APPLICATION_IS_NULL);
                    } else if (str3 == null) {
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.ESIA_CONSENT_CONSUMER_NULL);
                    } else if (str4 == null) {
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.ESIA_CONSENT_SCOPE_IS_NULL);
                    } else {
                        l(new EbsProcessState.EsiaConsent(str2, str3, cvu0.v(str4, " ", "%20", false)), BiometricVerificationStoreFactory$Companion$Trigger.WEBAM);
                    }
                } else if (i != 2) {
                    l(new EbsProcessState.Common(ebsState), BiometricVerificationStoreFactory$Companion$Trigger.WEBAM);
                } else {
                    String str5 = e0Var.e;
                    String str6 = e0Var.f;
                    if (str5 != null) {
                        try {
                            parse = Uri.parse(str5);
                        } catch (Exception e) {
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, "[EBS]", "Parse deeplinkUrl to Uri, error = " + e, 8);
                            }
                            uri = null;
                        }
                    } else {
                        parse = null;
                    }
                    uri = parse;
                    if (str6 != null) {
                        try {
                            uri2 = Uri.parse(str6);
                        } catch (Exception e2) {
                            com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, "[EBS]", "Parse fallbackUrl to Uri, error = " + e2, 8);
                            }
                        }
                    }
                    l(new EbsProcessState.EsiaBioCreation(uri, uri2), BiometricVerificationStoreFactory$Companion$Trigger.WEBAM);
                }
            } else if (i0Var instanceof com.yandex.passport.sloth.b0) {
                EbsProcessState ebsProcessState2 = ((BiometricVerificationViewModel$State) g()).getEbsProcessState();
                if (ebsProcessState2 == null) {
                    ebsProcessState2 = new EbsProcessState.Common(EbsState.SESSION_INIT);
                }
                EbsState ebsState4 = ebsProcessState2.getEbsState();
                if ((ebsProcessState2 instanceof EbsProcessState.EsiaBioCreation) || (ebsProcessState2 instanceof EbsProcessState.Common)) {
                    ((com.yandex.passport.sloth.b0) i0Var).a.invoke(gw00.e(new Pair("type", ebsState4.name())));
                } else if (ebsProcessState2 instanceof EbsProcessState.Failed) {
                    ((com.yandex.passport.sloth.b0) i0Var).a.invoke(kotlin.collections.b.i(new Pair("type", ebsState4.name()), new Pair(CRLReasonCodeExtension.REASON, ((EbsProcessState.Failed) ebsProcessState2).getReason())));
                } else {
                    if (!(ebsProcessState2 instanceof EbsProcessState.EsiaConsent)) {
                        w511.b();
                        return null;
                    }
                    EbsProcessState.EsiaConsent esiaConsent = (EbsProcessState.EsiaConsent) ebsProcessState2;
                    ((com.yandex.passport.sloth.b0) i0Var).a.invoke(kotlin.collections.b.i(new Pair("type", ebsState4.name()), new Pair(ClidProvider.APPLICATION, esiaConsent.getApplication()), new Pair("consumer", esiaConsent.getConsumer()), new Pair("scope", esiaConsent.getScope())));
                }
            } else if (i0Var instanceof com.yandex.passport.sloth.c0) {
                p("invalid_token");
                a(new a0(401));
            }
        } else {
            boolean z2 = z0Var instanceof x0;
            com.yandex.passport.internal.report.reporters.v vVar = this.k;
            BiometricVerificationProperties biometricVerificationProperties = this.d;
            if (z2) {
                int i2 = u.b[((x0) z0Var).a.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    Uid uid = biometricVerificationProperties.getUid();
                    String biometricSessionId = biometricVerificationProperties.getBiometricSessionId();
                    String n = n();
                    EbsProcessState ebsProcessState3 = ((BiometricVerificationViewModel$State) g()).getEbsProcessState();
                    EbsState ebsState5 = ebsProcessState3 != null ? ebsProcessState3.getEbsState() : null;
                    String serviceId = biometricVerificationProperties.getServiceId();
                    vVar.getClass();
                    vVar.f(n2.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n, 11), new md(ebsState5 != null ? ebsState5.name() : null, 6), new md(serviceId, 19));
                    f(h0.a);
                    return zy11Var;
                }
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
            } else {
                if (z0Var instanceof t0) {
                    Uid uid2 = biometricVerificationProperties.getUid();
                    String biometricSessionId2 = biometricVerificationProperties.getBiometricSessionId();
                    vVar.getClass();
                    vVar.f(a3.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId2, 6, false));
                    k(this, EbsState.SESSION_INIT);
                    e(p.a);
                    return zy11Var;
                }
                if (z0Var instanceof s0) {
                    Uid uid3 = biometricVerificationProperties.getUid();
                    String biometricSessionId3 = biometricVerificationProperties.getBiometricSessionId();
                    PassportException passportException = ((s0) z0Var).a;
                    String message = passportException != null ? passportException.getMessage() : null;
                    vVar.getClass();
                    vVar.f(y2.w, new jd(Long.valueOf(uid3.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId3, 6, false), new com.yandex.passport.internal.report.a(message, 25));
                    k(this, EbsState.ESIA_CONSENT_NEEDED);
                    return zy11Var;
                }
                if (z0Var instanceof p0) {
                    Uid uid4 = biometricVerificationProperties.getUid();
                    String biometricSessionId4 = biometricVerificationProperties.getBiometricSessionId();
                    String n2 = n();
                    vVar.getClass();
                    vVar.f(r2.w, new jd(Long.valueOf(uid4.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId4, 6, false), new yd(n2, 11));
                    Context context = this.c;
                    try {
                        uuid = Settings.Secure.getString(context.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
                    } catch (Exception unused2) {
                        uuid = AppMetricaYandex.getUuid(context);
                    }
                    if (uuid != null) {
                        SharedPreferences.Editor edit = ((SharedPreferences) this.i.b.getValue()).edit();
                        edit.putString("install_id", uuid);
                        edit.commit();
                    }
                    if (((BiometricVerificationViewModel$State) g()).getAgainInitEbs()) {
                        k(this, EbsState.EBS_SDK_BIO_PHOTO_CHECK_PENDING);
                    } else {
                        k(this, EbsState.EBS_SDK_BIO_PHOTO_CHECK_ALERT);
                    }
                } else {
                    if (z0Var instanceof v0) {
                        k(this, EbsState.EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED);
                        return zy11Var;
                    }
                    if (z0Var instanceof o0) {
                        Uid uid5 = biometricVerificationProperties.getUid();
                        String biometricSessionId5 = biometricVerificationProperties.getBiometricSessionId();
                        String n3 = n();
                        String str7 = ((o0) z0Var).a;
                        vVar.getClass();
                        vVar.f(p2.w, new jd(Long.valueOf(uid5.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId5, 6, false), new yd(n3, 11), new com.yandex.passport.internal.report.a(str7, 25));
                        k(this, EbsState.EBS_SDK_INSTALLING_ERROR_ALERT);
                        return zy11Var;
                    }
                    if (z0Var instanceof n0) {
                        vVar.p(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), n(), "NotInitializedSdkEbsException");
                        a(y.a);
                        e(s.a);
                        return zy11Var;
                    }
                    if (z0Var instanceof q0) {
                        vVar.p(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), n(), ((q0) z0Var).a);
                        k(this, EbsState.EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT);
                        return zy11Var;
                    }
                    if (z0Var instanceof y0) {
                        k(this, EbsState.EBS_SDK_BIO_PHOTO_CHECK_PENDING);
                        return zy11Var;
                    }
                    if (!(z0Var instanceof r0)) {
                        if (!jl40.l(z0Var, u0.a)) {
                            w511.b();
                            return null;
                        }
                        Uid uid6 = biometricVerificationProperties.getUid();
                        String biometricSessionId6 = biometricVerificationProperties.getBiometricSessionId();
                        EbsProcessState ebsProcessState4 = ((BiometricVerificationViewModel$State) g()).getEbsProcessState();
                        EbsState ebsState6 = ebsProcessState4 != null ? ebsProcessState4.getEbsState() : null;
                        vVar.getClass();
                        vVar.f(n3.w, new jd(Long.valueOf(uid6.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId6, 6, false), new md(ebsState6 != null ? ebsState6.name() : null, 5));
                        l(new EbsProcessState.Common(EbsState.RETRYING_SESSION), BiometricVerificationStoreFactory$Companion$Trigger.AM);
                        return zy11Var;
                    }
                    Uid uid7 = biometricVerificationProperties.getUid();
                    String biometricSessionId7 = biometricVerificationProperties.getBiometricSessionId();
                    String n4 = n();
                    vVar.getClass();
                    vVar.f(v2.w, new jd(Long.valueOf(uid7.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId7, 6, false), new yd(n4, 11));
                    Object m = m((ContinuationImpl) continuation);
                    if (m == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return m;
                    }
                }
            }
        }
        return zy11Var;
    }

    @Override // com.yandex.passport.common.mvi.g
    public final void j(Throwable th) {
        p(th.getMessage());
        a(new a0(((th instanceof InvalidTokenException) || (th instanceof PassportAccountNotFoundException)) ? 401 : 1112));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(EbsProcessState ebsProcessState, BiometricVerificationStoreFactory$Companion$Trigger biometricVerificationStoreFactory$Companion$Trigger) {
        char c;
        Uri fallbackUri;
        boolean z = ebsProcessState instanceof EbsProcessState.Failed;
        EbsProcessState.Failed failed = z ? (EbsProcessState.Failed) ebsProcessState : null;
        String reason = failed != null ? failed.getReason() : null;
        BiometricVerificationProperties biometricVerificationProperties = this.d;
        Uid uid = biometricVerificationProperties.getUid();
        String biometricSessionId = biometricVerificationProperties.getBiometricSessionId();
        String n = n();
        EbsProcessState ebsProcessState2 = ((BiometricVerificationViewModel$State) g()).getEbsProcessState();
        EbsState ebsState = ebsProcessState2 != null ? ebsProcessState2.getEbsState() : null;
        EbsState ebsState2 = ebsProcessState.getEbsState();
        com.yandex.passport.internal.report.reporters.v vVar = this.k;
        vVar.getClass();
        boolean z2 = false;
        ArrayList i = scc.i(new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n, 11), new md(ebsState != null ? ebsState.name() : null, 5), new md(ebsState2.name(), 3, false), new yd(biometricVerificationStoreFactory$Companion$Trigger.getValue(), 13, false));
        if (reason != null) {
            i.add(new md(reason, 12, false));
        }
        vVar.e(o2.w, i);
        a(new z(ebsProcessState, this.l));
        if (ebsProcessState instanceof EbsProcessState.EsiaConsent) {
            EbsProcessState.EsiaConsent esiaConsent = (EbsProcessState.EsiaConsent) ebsProcessState;
            vVar.f(z2.w, new jd(Long.valueOf(biometricVerificationProperties.getUid().getValue())), new com.yandex.passport.internal.report.a(biometricVerificationProperties.getBiometricSessionId(), 6, false), new com.yandex.passport.internal.report.a(esiaConsent.getApplication(), 2, false), new com.yandex.passport.internal.report.a(esiaConsent.getConsumer(), 17, false), new md(esiaConsent.getScope(), 17, false));
            f(new g0(biometricVerificationProperties.getUid(), esiaConsent.getApplication(), esiaConsent.getConsumer(), esiaConsent.getScope(), biometricVerificationProperties.getTheme()));
            return;
        }
        if (!(ebsProcessState instanceof EbsProcessState.EsiaBioCreation)) {
            if (!(ebsProcessState instanceof EbsProcessState.Common)) {
                if (z) {
                    return;
                }
                w511.b();
                return;
            }
            int i2 = u.a[((EbsProcessState.Common) ebsProcessState).getEbsState().ordinal()];
            if (i2 == 3) {
                a(w.a);
                e(p.a);
                return;
            }
            if (i2 == 4) {
                e(q.a);
                return;
            }
            if (i2 == 5) {
                e(s.a);
                return;
            } else if (i2 == 6) {
                f(i0.a);
                return;
            } else {
                if (i2 != 7) {
                    return;
                }
                e(o.a);
                return;
            }
        }
        EbsProcessState.EsiaBioCreation esiaBioCreation = (EbsProcessState.EsiaBioCreation) ebsProcessState;
        Context context = this.c;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "Starting attempts to open urls: deeplink = " + esiaBioCreation.getDeeplinkUri() + ", fallbackUrl = " + esiaBioCreation.getFallbackUri(), 8);
        }
        Uri deeplinkUri = esiaBioCreation.getDeeplinkUri();
        try {
            c = 2;
        } catch (Exception e) {
            e = e;
            c = 2;
        }
        try {
            vVar.f(e3.w, new jd(Long.valueOf(biometricVerificationProperties.getUid().getValue())), new com.yandex.passport.internal.report.a(biometricVerificationProperties.getBiometricSessionId(), 6, false), new yd(String.valueOf(deeplinkUri), 21));
        } catch (Exception e2) {
            e = e2;
            vVar.s(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), deeplinkUri, String.valueOf(e.getMessage()));
            fallbackUri = esiaBioCreation.getFallbackUri();
            Uid uid2 = biometricVerificationProperties.getUid();
            String biometricSessionId2 = biometricVerificationProperties.getBiometricSessionId();
            i3 i3Var = i3.w;
            jd jdVar = new jd(Long.valueOf(uid2.getValue()));
            com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(biometricSessionId2, 6, false);
            yd ydVar = new yd(String.valueOf(fallbackUri), 21);
            pd[] pdVarArr = new pd[3];
            pdVarArr[0] = jdVar;
            pdVarArr[1] = aVar;
            pdVarArr[c] = ydVar;
            vVar.f(i3Var, pdVarArr);
            if (fallbackUri != null) {
            }
            if (z2) {
            }
        }
        if (deeplinkUri != null) {
            context.startActivity(new Intent("android.intent.action.VIEW", deeplinkUri).setPackage("ru.rostel").addFlags(SelfTester_JCP.IMITA));
            vVar.f(d3.w, new jd(Long.valueOf(biometricVerificationProperties.getUid().getValue())), new com.yandex.passport.internal.report.a(biometricVerificationProperties.getBiometricSessionId(), 6, false), new yd(String.valueOf(deeplinkUri), 21));
            return;
        }
        vVar.s(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), deeplinkUri, "deeplinkUri is null");
        fallbackUri = esiaBioCreation.getFallbackUri();
        Uid uid22 = biometricVerificationProperties.getUid();
        String biometricSessionId22 = biometricVerificationProperties.getBiometricSessionId();
        i3 i3Var2 = i3.w;
        jd jdVar2 = new jd(Long.valueOf(uid22.getValue()));
        com.yandex.passport.internal.report.a aVar2 = new com.yandex.passport.internal.report.a(biometricSessionId22, 6, false);
        yd ydVar2 = new yd(String.valueOf(fallbackUri), 21);
        pd[] pdVarArr2 = new pd[3];
        pdVarArr2[0] = jdVar2;
        pdVarArr2[1] = aVar2;
        pdVarArr2[c] = ydVar2;
        vVar.f(i3Var2, pdVarArr2);
        if (fallbackUri != null) {
            vVar.t(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), fallbackUri, "fallbackUri is null");
        } else {
            Uri uri = com.yandex.passport.common.browser.c.a;
            Serializable d = com.yandex.passport.common.browser.c.d(context, fallbackUri.toString());
            boolean z3 = d instanceof Result.Failure;
            boolean z4 = !z3;
            if (!z3) {
                Uid uid3 = biometricVerificationProperties.getUid();
                String biometricSessionId3 = biometricVerificationProperties.getBiometricSessionId();
                h3 h3Var = h3.w;
                jd jdVar3 = new jd(Long.valueOf(uid3.getValue()));
                com.yandex.passport.internal.report.a aVar3 = new com.yandex.passport.internal.report.a(biometricSessionId3, 6, false);
                yd ydVar3 = new yd(String.valueOf(fallbackUri), 21);
                pd[] pdVarArr3 = new pd[3];
                pdVarArr3[0] = jdVar3;
                pdVarArr3[1] = aVar3;
                pdVarArr3[c] = ydVar3;
                vVar.f(h3Var, pdVarArr3);
            }
            Throwable a = Result.a(d);
            if (a != null) {
                vVar.t(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), fallbackUri, String.valueOf(a.getMessage()));
            }
            z2 = z4;
        }
        if (z2) {
            s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.ERROR_OPENING_URLS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        BiometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1 biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof BiometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1) {
            biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1 = (BiometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1) continuationImpl;
            int i2 = biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String n = n();
                    if (n == null) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Track id is null when check track_id", 8);
                        }
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.TRACK_ID_IS_NULL);
                        return zy11.a;
                    }
                    BiometricVerificationProperties biometricVerificationProperties = this.d;
                    com.yandex.passport.internal.usecase.e eVar = new com.yandex.passport.internal.usecase.e(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), n, biometricVerificationProperties.getFlowId());
                    biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.L$0 = this;
                    biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.label = 1;
                    obj = this.j.a(eVar, biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (v) biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.ebs.h hVar = (com.yandex.passport.common.ebs.h) value;
                    boolean z = hVar.a;
                    boolean z2 = hVar.b;
                    if (z && z2) {
                        com.yandex.passport.internal.report.reporters.v vVar = this.k;
                        BiometricVerificationProperties biometricVerificationProperties2 = this.d;
                        Uid uid = biometricVerificationProperties2.getUid();
                        String biometricSessionId = biometricVerificationProperties2.getBiometricSessionId();
                        String n2 = this.n();
                        String serviceId = biometricVerificationProperties2.getServiceId();
                        vVar.getClass();
                        vVar.f(g4.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n2, 11), new md(serviceId, 19));
                        this.a(new a0(-1));
                    } else if (z && !z2) {
                        k(this, EbsState.LOW_AGE_ALERT);
                    } else if (z || !z2) {
                        this.s(EbsState.CHECK_TRACK_ID_REQUEST_FAILED, EbsReasonFailed.FACE_RECOGNIZED_AND_FLOW_SUCCESSFUL_IS_FALSE);
                    } else {
                        this.s(EbsState.CHECK_TRACK_ID_REQUEST_FAILED, EbsReasonFailed.FACE_RECOGNIZED_IS_FALSE);
                    }
                }
                a = Result.a(value);
                if (a != null) {
                    this.o(EbsState.CHECK_TRACK_ID_REQUEST_FAILED, a);
                }
                return zy11.a;
            }
        }
        biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1 = new BiometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1(this, continuationImpl);
        Object obj2 = biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationStoreFactory$ExecutorImpl$checkAgeByTrackId$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }

    public final String n() {
        return ((BiometricVerificationViewModel$State) g()).getTrackId();
    }

    public final void o(EbsState ebsState, Throwable th) {
        String name;
        if (th instanceof InvalidTokenException) {
            p(null);
            a(new a0(401));
            return;
        }
        if (th instanceof EbsBackendErrorsException) {
            List errors = ((EbsBackendErrorsException) th).getErrors();
            Set set = com.yandex.passport.data.exceptions.a.a;
            name = kotlin.collections.a.X(errors, ",", null, null, null, 62);
        } else {
            EbsReasonFailed.Companion.getClass();
            name = c1.a(th).name();
        }
        l(new EbsProcessState.Failed(ebsState, name), BiometricVerificationStoreFactory$Companion$Trigger.AM);
    }

    public final void p(String str) {
        BiometricVerificationProperties biometricVerificationProperties = this.d;
        Uid uid = biometricVerificationProperties.getUid();
        String biometricSessionId = biometricVerificationProperties.getBiometricSessionId();
        String n = n();
        String serviceId = biometricVerificationProperties.getServiceId();
        com.yandex.passport.internal.report.reporters.v vVar = this.k;
        vVar.getClass();
        vVar.f(l3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n, 11), new com.yandex.passport.internal.report.a(str, 25), new md(serviceId, 19));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:23|24|(3:26|13|14)(2:27|(2:29|22)))|20))|31|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r7.r(r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        s(com.yandex.passport.internal.ui.sloth.ebs.EbsState.UNEXPECTED_AM_ERROR, com.yandex.passport.internal.ui.sloth.ebs.EbsReasonFailed.RETRYING_TRACK_ID_INIT_REQUEST_FAILED);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ContinuationImpl continuationImpl) {
        BiometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1 biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1;
        int i;
        if (continuationImpl instanceof BiometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1) {
            biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1 = (BiometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1) continuationImpl;
            int i2 = biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int countRetryingTrackIdRequests = ((BiometricVerificationViewModel$State) g()).getCountRetryingTrackIdRequests();
                    List list = e0.k;
                    if (countRetryingTrackIdRequests >= list.size()) {
                        k(this, EbsState.EBS_REGISTRATION_TIMEOUT_V2);
                        return zy11.a;
                    }
                    long g = spb1.g(((Number) list.get(countRetryingTrackIdRequests)).intValue(), 0);
                    biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.L$0 = this;
                    biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label = 1;
                    if (kotlinx.coroutines.a.i(g, biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    this = (v) biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.L$0;
                    kotlin.b.b(obj);
                }
                this.a(x.a);
                biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.L$0 = this;
                biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label = 2;
            }
        }
        biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1 = new BiometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1(this, continuationImpl);
        Object obj2 = biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label;
        if (i != 0) {
        }
        this.a(x.a);
        biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.L$0 = this;
        biometricVerificationStoreFactory$ExecutorImpl$retryingSessionInit$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(ContinuationImpl continuationImpl) {
        BiometricVerificationStoreFactory$ExecutorImpl$sessionInit$1 biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1;
        int i;
        Object value;
        Throwable a;
        String uuid;
        if (continuationImpl instanceof BiometricVerificationStoreFactory$ExecutorImpl$sessionInit$1) {
            biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1 = (BiometricVerificationStoreFactory$ExecutorImpl$sessionInit$1) continuationImpl;
            int i2 = biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BiometricVerificationProperties biometricVerificationProperties = this.d;
                    com.yandex.passport.internal.usecase.c cVar = new com.yandex.passport.internal.usecase.c(((BiometricVerificationViewModel$State) g()).getCountRetryingTrackIdRequests(), biometricVerificationProperties.getUid(), biometricVerificationProperties.getFlowId(), biometricVerificationProperties.getServiceId(), biometricVerificationProperties.getBiometricSessionId());
                    biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.L$0 = this;
                    biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.label = 1;
                    obj = this.f.a(cVar, biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (v) biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.ebs.n nVar = (com.yandex.passport.common.ebs.n) value;
                    if (nVar instanceof com.yandex.passport.common.ebs.l) {
                        this.a(new b0(((com.yandex.passport.common.ebs.l) nVar).a));
                        BiometricVerificationProperties biometricVerificationProperties2 = this.d;
                        Context context = this.c;
                        try {
                            uuid = Settings.Secure.getString(context.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
                        } catch (Exception unused) {
                            uuid = AppMetricaYandex.getUuid(context);
                        }
                        if (uuid != null) {
                            String string = ((SharedPreferences) this.i.b.getValue()).getString("install_id", null);
                            boolean l = jl40.l(string, uuid);
                            com.yandex.passport.internal.report.reporters.v vVar = this.k;
                            Uid uid = biometricVerificationProperties2.getUid();
                            String n = this.n();
                            String biometricSessionId = biometricVerificationProperties2.getBiometricSessionId();
                            vVar.getClass();
                            vVar.f(m3.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n, 11), new com.yandex.passport.internal.report.i(!l, 14), new com.yandex.passport.internal.report.a(string, 13), new com.yandex.passport.internal.report.a(uuid, 19, false));
                            if (l) {
                                this.e(s.a);
                            } else {
                                k(this, EbsState.EBS_SDK_CHECK_NEEDED_ALERT);
                            }
                        } else {
                            this.s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.INSTALL_ID_IS_NULL);
                        }
                    } else if (jl40.l(nVar, com.yandex.passport.common.ebs.m.a)) {
                        k(this, EbsState.LOW_AGE_ALERT);
                    } else if (jl40.l(nVar, com.yandex.passport.common.ebs.j.a)) {
                        k(this, EbsState.ESIA_CONSENT_NEEDED);
                    } else if (jl40.l(nVar, com.yandex.passport.common.ebs.i.a)) {
                        k(this, EbsState.ESIA_BIO_MISSING_ALERT_V2);
                    } else {
                        if (!jl40.l(nVar, com.yandex.passport.common.ebs.k.a)) {
                            w511.b();
                            return null;
                        }
                        k(this, EbsState.EBS_REGISTRATION_PENDING);
                    }
                }
                a = Result.a(value);
                if (a != null) {
                    this.o(EbsState.CREATE_TRACK_ID_REQUEST_FAILED, a);
                }
                return zy11.a;
            }
        }
        biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1 = new BiometricVerificationStoreFactory$ExecutorImpl$sessionInit$1(this, continuationImpl);
        Object obj2 = biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationStoreFactory$ExecutorImpl$sessionInit$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }

    public final void s(EbsState ebsState, EbsReasonFailed ebsReasonFailed) {
        l(new EbsProcessState.Failed(ebsState, ebsReasonFailed.name()), BiometricVerificationStoreFactory$Companion$Trigger.AM);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        BiometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1 biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1;
        int i;
        String uuid;
        Object value;
        Throwable a;
        if (continuationImpl instanceof BiometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1) {
            biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1 = (BiometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1) continuationImpl;
            int i2 = biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context context = this.c;
                    try {
                        uuid = Settings.Secure.getString(context.getContentResolver(), StartupRequest.PARAM_ANDROID_ID);
                    } catch (Exception unused) {
                        uuid = AppMetricaYandex.getUuid(context);
                    }
                    if (uuid == null) {
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.INSTALL_ID_IS_NULL);
                        return zy11.a;
                    }
                    BiometricVerificationProperties biometricVerificationProperties = this.d;
                    com.yandex.passport.internal.usecase.x0 x0Var = new com.yandex.passport.internal.usecase.x0(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), n(), uuid);
                    biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.L$0 = this;
                    biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.label = 1;
                    obj = this.g.a(x0Var, biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (v) biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.internal.report.reporters.v vVar = this.k;
                    BiometricVerificationProperties biometricVerificationProperties2 = this.d;
                    Uid uid = biometricVerificationProperties2.getUid();
                    String biometricSessionId = biometricVerificationProperties2.getBiometricSessionId();
                    String n = this.n();
                    vVar.getClass();
                    vVar.f(q2.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n, 11));
                    this.f(new k0((JwtToken) value));
                }
                a = Result.a(value);
                if (a != null) {
                    this.o(EbsState.CREATE_JWT_REQUEST_FAILED, a);
                }
                return zy11.a;
            }
        }
        biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1 = new BiometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1(this, continuationImpl);
        Object obj2 = biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationStoreFactory$ExecutorImpl$startBiometricInitialization$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(ContinuationImpl continuationImpl) {
        BiometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1 biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof BiometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1) {
            biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1 = (BiometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1) continuationImpl;
            int i2 = biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (qke.h(this.c, "android.permission.CAMERA") != 0) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Camera permission request for Biometric Verification", 8);
                        }
                        f(f0.a);
                        return zy11Var;
                    }
                    String n = n();
                    if (n == null) {
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Track id is null when start biometric session", 8);
                        }
                        s(EbsState.UNEXPECTED_AM_ERROR, EbsReasonFailed.TRACK_ID_IS_NULL);
                        return zy11Var;
                    }
                    BiometricVerificationProperties biometricVerificationProperties = this.d;
                    k1 k1Var = new k1(biometricVerificationProperties.getUid(), biometricVerificationProperties.getBiometricSessionId(), n, biometricVerificationProperties.getFlowId());
                    biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.L$0 = this;
                    biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.label = 1;
                    obj = this.h.a(k1Var, biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (v) biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.ebs.w wVar = (com.yandex.passport.common.ebs.w) value;
                    if (jl40.l(wVar, com.yandex.passport.common.ebs.u.a)) {
                        k(this, EbsState.ESIA_BIO_MISSING_ALERT_V2);
                    } else {
                        if (!(wVar instanceof com.yandex.passport.common.ebs.v)) {
                            w511.b();
                            return null;
                        }
                        BiometricAuthSdkProperties biometricAuthSdkProperties = ((com.yandex.passport.common.ebs.v) wVar).a;
                        com.yandex.passport.internal.report.reporters.v vVar = this.k;
                        BiometricVerificationProperties biometricVerificationProperties2 = this.d;
                        Uid uid = biometricVerificationProperties2.getUid();
                        String biometricSessionId = biometricVerificationProperties2.getBiometricSessionId();
                        String n2 = this.n();
                        String esiaSessionId = biometricAuthSdkProperties.getEsiaSessionId();
                        String sid = biometricAuthSdkProperties.getSid();
                        vVar.getClass();
                        vVar.f(u2.w, new jd(Long.valueOf(uid.getValue())), new com.yandex.passport.internal.report.a(biometricSessionId, 6, false), new yd(n2, 11), new com.yandex.passport.internal.report.a(esiaSessionId, 29, false), new md(sid, 23, false));
                        this.f(new j0(biometricAuthSdkProperties));
                    }
                }
                a = Result.a(value);
                if (a != null) {
                    this.o(EbsState.START_SESSION_REQUEST_FAILED_V2, a);
                }
                return zy11Var;
            }
        }
        biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1 = new BiometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1(this, continuationImpl);
        Object obj2 = biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationStoreFactory$ExecutorImpl$startBiometricVerification$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11Var2;
    }
}
