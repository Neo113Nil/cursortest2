package ru.rustore.sdk.pushclient.q;

import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.c;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import ru.rustore.sdk.pushclient.a.h;
import ru.rustore.sdk.pushclient.internal.work.DeletePushTokenIfNoHostsWorker;
import xsna.aaz0;
import xsna.b560;
import xsna.b6l;
import xsna.dwx0;
import xsna.j5g;
import xsna.jay0;
import xsna.kay0;
import xsna.p6j;
import xsna.piy0;
import xsna.s101;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.domain.interactor.ScheduleDeletePushTokenInteractor$invoke$1", f = "ScheduleDeletePushTokenInteractor.kt", l = {26, 32, 44}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ piy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(piy0 piy0Var, spj<? super b> spjVar) {
        super(2, spjVar);
        this.c = piy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b(this.c, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return new b(this.c, spjVar).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0146, code lost:
    
        if (r4.a(r2, r24) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0063, code lost:
    
        if (r6 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0044, code lost:
    
        if (r2 == r1) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        String str;
        Object featureValue;
        dwx0 dwx0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            a.a(obj);
            jay0 jay0Var = this.c.b;
            this.b = 1;
            a = jay0Var.a(this);
        } else if (i == 1) {
            a.a(obj);
            a = ((kay0) obj).a;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                ((Result) obj).getClass();
                return s3q0.a;
            }
            str = this.a;
            a.a(obj);
            featureValue = obj;
            int intValue = ((Number) featureValue).intValue();
            if (intValue == 0) {
                return s3q0.a;
            }
            long j = intValue;
            if (SdkInitAwaiter.awaitInitialization$default(h.w, 0L, 1, null)) {
                aaz0 aaz0Var = s101.f;
                if (aaz0Var == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                try {
                    dwx0Var = dwx0.h(aaz0Var.a.getApplicationContext());
                } catch (Throwable unused) {
                    dwx0Var = null;
                }
                Data.a aVar = new Data.a();
                aVar.a.put("push_token_key", str);
                c.a g = new c.a(DeletePushTokenIfNoHostsWorker.class).h(aVar.a()).f(new p6j(new b560(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, j5g.S0(new LinkedHashSet()))).g(j, TimeUnit.MINUTES);
                BackoffPolicy backoffPolicy = BackoffPolicy.EXPONENTIAL;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c b = ((c.a) g.e(backoffPolicy, ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS)).b();
                if (dwx0Var != null && dwx0Var.f("VKPNS_DeletePushTokenWorker", ExistingWorkPolicy.REPLACE, Collections.singletonList(b)) != null) {
                    Logger.DefaultImpls.info$default(this.c.e, "If the host app does not install then push token " + StringExtensionsKt.hideSensitive(str) + " will be deleted", null, 2, null);
                    return s3q0.a;
                }
            }
            Logger.DefaultImpls.info$default(this.c.e, "If the host app does not install then push token " + StringExtensionsKt.hideSensitive(str) + " will be deleted immediately", null, 2, null);
            ru.rustore.sdk.pushclient.s.c cVar = this.c.a;
            this.a = null;
            this.b = 3;
        }
        str = (String) a;
        if (str.length() == 0) {
            return s3q0.a;
        }
        FeatureManager featureManager = this.c.c;
        Feature.IntFeature pushTokenTtlWithoutHostMinutes = CommonFeaturesKt.getPushTokenTtlWithoutHostMinutes();
        this.a = str;
        this.b = 2;
        featureValue = featureManager.getFeatureValue(pushTokenTtlWithoutHostMinutes, this);
    }
}
