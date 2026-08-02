package com.ybsdk.common.repositiories.agreements;

import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.network.Api;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import defpackage.ny61;
import defpackage.wlp;
import defpackage.xj1;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Api a;
    public final b b;
    public final f c;
    public final com.ybsdk.core.common.data.a d = new com.ybsdk.core.common.data.a();

    public a(Api api, b bVar, f fVar) {
        this.a = api;
        this.b = bVar;
        this.c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        AgreementsRepository$getAgreements$1 agreementsRepository$getAgreements$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        if (continuationImpl instanceof AgreementsRepository$getAgreements$1) {
            agreementsRepository$getAgreements$1 = (AgreementsRepository$getAgreements$1) continuationImpl;
            int i2 = agreementsRepository$getAgreements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementsRepository$getAgreements$1.label = i2 - Integer.MIN_VALUE;
                obj = agreementsRepository$getAgreements$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementsRepository$getAgreements$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = this.b;
                    bVar.getClass();
                    if (((CommonFeatureFlag) bVar.d(wlp.F).getData()).isEnabled()) {
                        agreementsRepository$getAgreements$1.Z$0 = z;
                        agreementsRepository$getAgreements$1.label = 1;
                        obj = this.c.a(agreementsRepository$getAgreements$1);
                    }
                    AgreementsRepository$getAgreements$2 agreementsRepository$getAgreements$2 = new AgreementsRepository$getAgreements$2(this, null);
                    agreementsRepository$getAgreements$1.label = 2;
                    Object a = this.d.a(z, agreementsRepository$getAgreements$2, agreementsRepository$getAgreements$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = agreementsRepository$getAgreements$1.Z$0;
                kotlin.b.b(obj);
                if (obj == null) {
                    return new Result.Failure(new IllegalStateException("Attempt to fetch agreements for unauthorized user. No puid found"));
                }
                AgreementsRepository$getAgreements$2 agreementsRepository$getAgreements$22 = new AgreementsRepository$getAgreements$2(this, null);
                agreementsRepository$getAgreements$1.label = 2;
                Object a2 = this.d.a(z, agreementsRepository$getAgreements$22, agreementsRepository$getAgreements$1);
                if (a2 == coroutineSingletons) {
                }
            }
        }
        agreementsRepository$getAgreements$1 = new AgreementsRepository$getAgreements$1(this, continuationImpl);
        obj = agreementsRepository$getAgreements$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementsRepository$getAgreements$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
        AgreementsRepository$getAgreements$2 agreementsRepository$getAgreements$222 = new AgreementsRepository$getAgreements$2(this, null);
        agreementsRepository$getAgreements$1.label = 2;
        Object a22 = this.d.a(z, agreementsRepository$getAgreements$222, agreementsRepository$getAgreements$1);
        if (a22 == coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AgreementsRepository$getDefault$1 agreementsRepository$getDefault$1;
        int i;
        Object a;
        if (continuationImpl instanceof AgreementsRepository$getDefault$1) {
            agreementsRepository$getDefault$1 = (AgreementsRepository$getDefault$1) continuationImpl;
            int i2 = agreementsRepository$getDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementsRepository$getDefault$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementsRepository$getDefault$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementsRepository$getDefault$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    agreementsRepository$getDefault$1.label = 1;
                    a = a(true, agreementsRepository$getDefault$1);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                try {
                    Object obj3 = (xj1) kotlin.collections.a.R((List) a);
                    if (obj3 == null) {
                        obj3 = new Result.Failure(new Exception("Agreements list empty"));
                    }
                    kotlin.b.b(obj3);
                    return obj3;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        agreementsRepository$getDefault$1 = new AgreementsRepository$getDefault$1(this, continuationImpl);
        Object obj4 = agreementsRepository$getDefault$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementsRepository$getDefault$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
