package com.yandex.go.scooters.driver_license;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyFlowDto;
import defpackage.cjn0;
import defpackage.dgn0;
import defpackage.dzg0;
import defpackage.e2e0;
import defpackage.ejn0;
import defpackage.f1h0;
import defpackage.fjn0;
import defpackage.fqm0;
import defpackage.g8e;
import defpackage.gjn0;
import defpackage.h55;
import defpackage.iqm0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.q8p0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.w8p0;
import defpackage.xpm0;
import defpackage.yvf0;
import defpackage.zin0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a extends h55 {
    public final e2e0 D;
    public final e E;
    public final yvf0 F;
    public final com.yandex.go.scooters.driver_license.domain.a G;
    public final yvf0 H;
    public final yvf0 I;

    public a(e2e0 e2e0Var, e eVar, yvf0 yvf0Var, com.yandex.go.scooters.driver_license.domain.a aVar, yvf0 yvf0Var2, yvf0 yvf0Var3) {
        super(null);
        this.D = e2e0Var;
        this.E = eVar;
        this.F = yvf0Var;
        this.G = aVar;
        this.H = yvf0Var2;
        this.I = yvf0Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        if (r10 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r10 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, String str, ContinuationImpl continuationImpl) {
        ScootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1 scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1;
        int i;
        gjn0 gjn0Var;
        com.yandex.go.scooters.driver_license.domain.a aVar2 = aVar.G;
        if (continuationImpl instanceof ScootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1) {
            scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1 = (ScootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1) continuationImpl;
            int i2 = scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label;
                if (i != 0) {
                    b.b(obj);
                    aVar2.getClass();
                    ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto = ScootersDriverLicenseVerifyFlowDto.EDOCUMENT;
                    if (!jl40.l(str, scootersDriverLicenseVerifyFlowDto.getFlow())) {
                        ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto2 = ScootersDriverLicenseVerifyFlowDto.NO_IIN;
                        if (jl40.l(str, scootersDriverLicenseVerifyFlowDto2.getFlow())) {
                            scootersDriverLicenseVerifyFlowDto = scootersDriverLicenseVerifyFlowDto2;
                        }
                    }
                    scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$0 = null;
                    scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$1 = null;
                    scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label = 1;
                    obj = aVar2.c.b(scootersDriverLicenseVerifyFlowDto, scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        aVar.A((m950) aVar.F.get(), (w8p0) obj, sy60.Q2);
                        return zy11.a;
                    }
                    b.b(obj);
                }
                gjn0Var = (gjn0) obj;
                if (gjn0Var instanceof fjn0) {
                    if (jl40.l(gjn0Var, ejn0.a)) {
                        aVar2.b(ScootersDriverLicenseVerificationStatus.FAILED);
                        aVar.Q(true);
                    } else {
                        aVar2.b(ScootersDriverLicenseVerificationStatus.FAILED);
                        aVar.r(new qu(9));
                    }
                    return zy11.a;
                }
                String str2 = ((fjn0) gjn0Var).a;
                aVar2.a.getClass();
                String uri = new Uri.Builder().scheme(Constants.SCHEME).authority("remote.biometric.kz").appendPath("flow").appendPath(str2).appendQueryParameter("web_view", "true").build().toString();
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$0 = null;
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$1 = null;
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$2 = null;
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.L$3 = null;
                scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label = 2;
                obj = aVar.R(uri, scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1);
            }
        }
        scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1 = new ScootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1(aVar, continuationImpl);
        Object obj3 = scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseRouterImpl$launchDriverLicenseVerification$1.label;
        if (i != 0) {
        }
        gjn0Var = (gjn0) obj3;
        if (gjn0Var instanceof fjn0) {
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, CoroutineStart.UNDISPATCHED, new ScootersDriverLicenseRouterImpl$onAttach$1(this, (zin0) obj, null), 1);
    }

    public final void Q(boolean z) {
        iqm0 iqm0Var;
        e eVar = this.E;
        if (z) {
            fqm0 fqm0Var = new fqm0(f1h0.ic_exclamation);
            ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
            int i = kyh0.scooters_driver_license_verification_failure_title;
            Context context = eVar.a;
            iqm0Var = new iqm0(fqm0Var, null, ru.yandex.taxi.common_models.net.b.b(bVar, context.getString(i), null, null, null, FormattedText.FontWeight.BOLD, 30), bVar.c(context.getString(kyh0.scooters_driver_license_verification_failure_message)), new xpm0(ru.yandex.taxi.common_models.net.b.b(bVar, context.getString(kyh0.scooters_driver_license_verification_result_primary_action), null, null, null, FormattedText.FontWeight.MEDIUM, 30), null), null, MSException.ERROR_BUSY);
        } else {
            fqm0 fqm0Var2 = new fqm0(dzg0.ic_check);
            ru.yandex.taxi.common_models.net.b bVar2 = FormattedText.Companion;
            iqm0Var = new iqm0(fqm0Var2, null, ru.yandex.taxi.common_models.net.b.b(bVar2, eVar.a.getString(kyh0.scooters_driver_license_verification_success_title), null, null, null, FormattedText.FontWeight.BOLD, 30), null, new xpm0(ru.yandex.taxi.common_models.net.b.b(bVar2, eVar.a.getString(kyh0.scooters_driver_license_verification_result_primary_action), null, null, null, FormattedText.FontWeight.MEDIUM, 30), null), null, 186);
        }
        A((m950) this.H.get(), iqm0Var, new dgn0(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(String str, ContinuationImpl continuationImpl) {
        ScootersDriverLicenseRouterImpl$prepareWebRouterPayload$1 scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1;
        int i;
        ArrayList arrayList;
        if (continuationImpl instanceof ScootersDriverLicenseRouterImpl$prepareWebRouterPayload$1) {
            scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1 = (ScootersDriverLicenseRouterImpl$prepareWebRouterPayload$1) continuationImpl;
            int i2 = scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.L$0 = null;
                    scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.L$1 = t;
                    scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.label = 1;
                    Object a = this.G.a(str, scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    arrayList = t;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (ArrayList) scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.L$1;
                    b.b(obj);
                }
                return new w8p0(new q8p0((String) obj, false), new cjn0(arrayList, this), Boolean.TRUE);
            }
        }
        scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1 = new ScootersDriverLicenseRouterImpl$prepareWebRouterPayload$1(this, continuationImpl);
        Object obj2 = scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseRouterImpl$prepareWebRouterPayload$1.label;
        if (i != 0) {
        }
        return new w8p0(new q8p0((String) obj2, false), new cjn0(arrayList, this), Boolean.TRUE);
    }
}
