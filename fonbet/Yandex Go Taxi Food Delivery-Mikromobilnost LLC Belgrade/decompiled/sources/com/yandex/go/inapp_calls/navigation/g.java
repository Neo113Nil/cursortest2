package com.yandex.go.inapp_calls.navigation;

import android.content.Context;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$NotReadyException;
import defpackage.h55;
import defpackage.ic90;
import defpackage.m950;
import defpackage.njv;
import defpackage.nqi0;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tje;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class g extends h55 implements m950 {
    public final Context D;
    public final com.yandex.go.inapp_calls.repository.c E;
    public final njv F;

    public g(Context context, com.yandex.go.inapp_calls.repository.c cVar, njv njvVar) {
        super(null);
        this.D = context;
        this.E = cVar;
        this.F = njvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(g gVar, ResumeInAppCallSource resumeInAppCallSource, ContinuationImpl continuationImpl) {
        ResumeInAppCallRouterImpl$resumeCall$1 resumeInAppCallRouterImpl$resumeCall$1;
        int i;
        Object j;
        Throwable a;
        njv njvVar = gVar.F;
        if (continuationImpl instanceof ResumeInAppCallRouterImpl$resumeCall$1) {
            resumeInAppCallRouterImpl$resumeCall$1 = (ResumeInAppCallRouterImpl$resumeCall$1) continuationImpl;
            int i2 = resumeInAppCallRouterImpl$resumeCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resumeInAppCallRouterImpl$resumeCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resumeInAppCallRouterImpl$resumeCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resumeInAppCallRouterImpl$resumeCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    njvVar.getClass();
                    if (resumeInAppCallSource != ResumeInAppCallSource.CALLS_ROUTER) {
                        njvVar.k("Resume", "Start", new Pair(new ic90("source"), resumeInAppCallSource.a()));
                    }
                    com.yandex.go.inapp_calls.repository.c cVar = gVar.E;
                    Context context = gVar.D;
                    resumeInAppCallRouterImpl$resumeCall$1.L$0 = resumeInAppCallSource;
                    resumeInAppCallRouterImpl$resumeCall$1.label = 1;
                    j = cVar.j(context, resumeInAppCallRouterImpl$resumeCall$1);
                    if (j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    resumeInAppCallSource = (ResumeInAppCallSource) resumeInAppCallRouterImpl$resumeCall$1.L$0;
                    kotlin.b.b(obj);
                    j = ((Result) obj).getValue();
                }
                if (!(j instanceof Result.Failure)) {
                    njvVar.getClass();
                    njvVar.k("Resume", "Succeed", new Pair(new ic90("source"), resumeInAppCallSource.a()));
                    gVar.r(new nqi0(14));
                }
                a = Result.a(j);
                if (a != null) {
                    if (a instanceof InAppCallsFeatureWrapper$NotReadyException) {
                        InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType = InAppCallsAnalytics$ErrorType.RESUME_NOT_LOADED_ERROR;
                        njvVar.getClass();
                        njv.h(inAppCallsAnalytics$ErrorType);
                    } else {
                        njvVar.getClass();
                        if (resumeInAppCallSource != ResumeInAppCallSource.CALLS_ROUTER) {
                            njv.i(a);
                        }
                    }
                    gVar.r(new qu(9));
                }
                return zy11.a;
            }
        }
        resumeInAppCallRouterImpl$resumeCall$1 = new ResumeInAppCallRouterImpl$resumeCall$1(gVar, continuationImpl);
        Object obj2 = resumeInAppCallRouterImpl$resumeCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resumeInAppCallRouterImpl$resumeCall$1.label;
        if (i != 0) {
        }
        if (!(j instanceof Result.Failure)) {
        }
        a = Result.a(j);
        if (a != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new ResumeInAppCallRouterImpl$onLaunch$1(this, (ResumeInAppCallSource) obj, null), 3);
    }
}
