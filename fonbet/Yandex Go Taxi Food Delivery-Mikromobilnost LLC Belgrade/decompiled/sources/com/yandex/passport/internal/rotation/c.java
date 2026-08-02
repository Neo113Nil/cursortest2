package com.yandex.passport.internal.rotation;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.j;
import com.yandex.passport.internal.report.i;
import com.yandex.passport.internal.report.i8;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.r8;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.report.reporters.i0;
import com.yandex.passport.internal.usecase.c1;
import com.yandex.passport.internal.usecase.e1;
import com.yandex.passport.internal.usecase.f1;
import com.yandex.passport.internal.usecase.m0;
import com.yandex.passport.internal.usecase.n0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.w511;
import java.io.Serializable;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c extends com.yandex.passport.common.domain.a {
    public final n0 b;
    public final f1 c;
    public final i0 d;
    public final g e;
    public final com.yandex.passport.internal.credentials.d f;

    public c(com.yandex.passport.common.coroutine.a aVar, n0 n0Var, f1 f1Var, i0 i0Var, g gVar, com.yandex.passport.internal.credentials.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = n0Var;
        this.c = f1Var;
        this.d = i0Var;
        this.e = gVar;
        this.f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(c cVar, a aVar, ContinuationImpl continuationImpl) {
        MasterTokenRotationUseCase$run$1 masterTokenRotationUseCase$run$1;
        int i;
        j jVar;
        a aVar2;
        Object value;
        MasterToken masterToken;
        a aVar3;
        j jVar2;
        c cVar2;
        f fVar;
        Throwable a;
        Object value2;
        c cVar3 = cVar;
        if (continuationImpl instanceof MasterTokenRotationUseCase$run$1) {
            masterTokenRotationUseCase$run$1 = (MasterTokenRotationUseCase$run$1) continuationImpl;
            int i2 = masterTokenRotationUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masterTokenRotationUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masterTokenRotationUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masterTokenRotationUseCase$run$1.label;
                b bVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i0 i0Var = cVar3.d;
                    long value3 = aVar.f().getValue();
                    String rawValue = aVar.a().getRawValue();
                    i0Var.getClass();
                    i0Var.f(r8.w, new jd(Long.valueOf(value3)), new i(rawValue, 26));
                    com.yandex.passport.internal.credentials.d dVar = cVar3.f;
                    String b = aVar.b();
                    Environment c = aVar.c();
                    dVar.getClass();
                    i3y i3yVar = com.yandex.passport.internal.credentials.d.b;
                    int i3 = com.yandex.passport.internal.credentials.c.a[c.ordinal()];
                    if (i3 == 1) {
                        for (j jVar3 : (List) com.yandex.passport.internal.credentials.d.b.getValue()) {
                            if (!jl40.l(jVar3.getDecryptedId(), b)) {
                            }
                        }
                        w511.i("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (i3 == 2) {
                        for (j jVar32 : (List) com.yandex.passport.internal.credentials.d.c.getValue()) {
                            if (!jl40.l(jVar32.getDecryptedId(), b)) {
                            }
                        }
                        w511.i("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (i3 != 3) {
                        kbs.f(c, "Unsupported environment ");
                        return null;
                    }
                    for (j jVar322 : (List) com.yandex.passport.internal.credentials.d.b.getValue()) {
                        if (!jl40.l(jVar322.getDecryptedId(), b)) {
                        }
                    }
                    w511.i("Collection contains no element matching the predicate.");
                    return null;
                    jVar = jVar322;
                    n0 n0Var = cVar3.b;
                    MasterToken a2 = aVar.a();
                    Environment c2 = aVar.c();
                    long d = aVar.d();
                    AnalyticsFromValue.Companion.getClass();
                    m0 m0Var = new m0(a2, jVar, c2, d, com.yandex.passport.internal.analytics.a.c());
                    masterTokenRotationUseCase$run$1.L$0 = cVar3;
                    masterTokenRotationUseCase$run$1.L$1 = aVar;
                    masterTokenRotationUseCase$run$1.L$2 = jVar;
                    masterTokenRotationUseCase$run$1.label = 1;
                    obj = n0Var.a(m0Var, masterTokenRotationUseCase$run$1);
                    if (obj != coroutineSingletons) {
                        aVar2 = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = (f) masterTokenRotationUseCase$run$1.L$4;
                    masterToken = (MasterToken) masterTokenRotationUseCase$run$1.L$3;
                    jVar2 = (j) masterTokenRotationUseCase$run$1.L$2;
                    aVar3 = (a) masterTokenRotationUseCase$run$1.L$1;
                    cVar2 = (c) masterTokenRotationUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    value2 = ((Result) obj).getValue();
                    if (!(value2 instanceof Result.Failure)) {
                        cVar2.e.b(fVar);
                    }
                    bVar = new b(masterToken, jVar2);
                    cVar3 = cVar2;
                    aVar2 = aVar3;
                    value = bVar;
                    a = Result.a(value);
                    if (a != null) {
                        cVar3.d.k(aVar2.f().getValue(), aVar2.a().getRawValue(), null, false, a.getMessage());
                    }
                    return new Result(value);
                }
                j jVar4 = (j) masterTokenRotationUseCase$run$1.L$2;
                aVar2 = (a) masterTokenRotationUseCase$run$1.L$1;
                c cVar4 = (c) masterTokenRotationUseCase$run$1.L$0;
                kotlin.b.b(obj);
                jVar = jVar4;
                cVar3 = cVar4;
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    MasterToken masterToken2 = (MasterToken) value;
                    if (!jl40.l(aVar2.a(), masterToken2)) {
                        cVar3.d.k(aVar2.f().getValue(), aVar2.a().getRawValue(), masterToken2.getRawValue(), true, null);
                        f fVar2 = new f(aVar2.a().getRawValue(), aVar2.f(), aVar2.b());
                        g gVar = cVar3.e;
                        gVar.c(kotlin.collections.a.o0(gVar.a(), fVar2));
                        i0 i0Var2 = gVar.a;
                        i0Var2.getClass();
                        i0Var2.f(i8.w, new jd(Long.valueOf(fVar2.c().getValue())), new i(fVar2.b(), 26));
                        f1 f1Var = cVar3.c;
                        c1 c1Var = new c1(aVar2.e(), aVar2.a(), new e1(aVar2.b()), aVar2.f(), RevokePlace.Rotation, false);
                        masterTokenRotationUseCase$run$1.L$0 = cVar3;
                        masterTokenRotationUseCase$run$1.L$1 = aVar2;
                        masterTokenRotationUseCase$run$1.L$2 = jVar;
                        masterTokenRotationUseCase$run$1.L$3 = masterToken2;
                        masterTokenRotationUseCase$run$1.L$4 = fVar2;
                        masterTokenRotationUseCase$run$1.label = 2;
                        Object a3 = f1Var.a(c1Var, masterTokenRotationUseCase$run$1);
                        if (a3 != coroutineSingletons) {
                            masterToken = masterToken2;
                            obj = a3;
                            aVar3 = aVar2;
                            jVar2 = jVar;
                            cVar2 = cVar3;
                            fVar = fVar2;
                            value2 = ((Result) obj).getValue();
                            if (!(value2 instanceof Result.Failure)) {
                            }
                            bVar = new b(masterToken, jVar2);
                            cVar3 = cVar2;
                            aVar2 = aVar3;
                            value = bVar;
                        }
                        return coroutineSingletons;
                    }
                    cVar3.d.k(aVar2.f().getValue(), aVar2.a().getRawValue(), masterToken2.getRawValue(), false, "Same tokens");
                    value = bVar;
                }
                a = Result.a(value);
                if (a != null) {
                }
                return new Result(value);
            }
        }
        masterTokenRotationUseCase$run$1 = new MasterTokenRotationUseCase$run$1(cVar3, continuationImpl);
        Object obj2 = masterTokenRotationUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masterTokenRotationUseCase$run$1.label;
        b bVar2 = null;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (a) obj, (ContinuationImpl) continuation);
    }
}
