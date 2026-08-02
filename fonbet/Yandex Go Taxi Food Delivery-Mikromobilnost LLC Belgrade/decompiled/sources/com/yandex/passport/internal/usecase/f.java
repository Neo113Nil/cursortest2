package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.o3;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.data.network.i0 c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.data.network.i0 i0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = i0Var;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(2:27|(1:29))(2:30|31))|12|(1:14)|15|16|(1:18)|19|20))|42|6|7|(0)(0)|12|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: all -> 0x0030, TimeoutCancellationException -> 0x0034, CancellationException -> 0x00b3, TryCatch #2 {TimeoutCancellationException -> 0x0034, CancellationException -> 0x00b3, all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0084, B:14:0x008e, B:15:0x00a0, B:25:0x0042, B:27:0x005b, B:30:0x00a6, B:31:0x00ab), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(e eVar, ContinuationImpl continuationImpl) {
        CheckAgeByTrackIdUseCase$run$1 checkAgeByTrackIdUseCase$run$1;
        int i;
        Throwable a;
        Object value;
        if (continuationImpl instanceof CheckAgeByTrackIdUseCase$run$1) {
            checkAgeByTrackIdUseCase$run$1 = (CheckAgeByTrackIdUseCase$run$1) continuationImpl;
            int i2 = checkAgeByTrackIdUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkAgeByTrackIdUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkAgeByTrackIdUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkAgeByTrackIdUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.report.reporters.v vVar = this.e;
                    Uid uid = eVar.a;
                    String str = eVar.d;
                    String str2 = eVar.c;
                    vVar.j(uid, eVar.b, str2, str);
                    ModernAccount e = this.b.a().e(uid);
                    if (e == null) {
                        throw new PassportAccountNotFoundException(uid);
                    }
                    com.yandex.passport.data.network.i0 i0Var = this.c;
                    MasterToken masterToken = e.getMasterToken();
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    Environment environment = e.getUid().getEnvironment();
                    bVar.getClass();
                    com.yandex.passport.data.network.c0 c0Var = new com.yandex.passport.data.network.c0(masterToken, str2, str, com.yandex.passport.internal.network.mappers.b.a(environment));
                    checkAgeByTrackIdUseCase$run$1.L$0 = this;
                    checkAgeByTrackIdUseCase$run$1.L$1 = eVar;
                    checkAgeByTrackIdUseCase$run$1.label = 1;
                    obj = i0Var.a(c0Var, checkAgeByTrackIdUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (e) checkAgeByTrackIdUseCase$run$1.L$1;
                    this = (f) checkAgeByTrackIdUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.ebs.h hVar = (com.yandex.passport.common.ebs.h) value;
                    this.e.k(eVar.a, eVar.b, eVar.c, hVar.a, hVar.b);
                }
                kotlin.b.b(value);
                Object obj2 = (com.yandex.passport.common.ebs.h) value;
                a = Result.a(obj2);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
                    Uid uid2 = eVar.a;
                    String str3 = eVar.b;
                    String str4 = eVar.c;
                    String message = a.getMessage();
                    vVar2.getClass();
                    vVar2.f(o3.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.a(str3, 6, false), new yd(str4, 11), new com.yandex.passport.internal.report.a(message, 25));
                }
                return new Result(obj2);
            }
        }
        checkAgeByTrackIdUseCase$run$1 = new CheckAgeByTrackIdUseCase$run$1(this, continuationImpl);
        Object obj3 = checkAgeByTrackIdUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkAgeByTrackIdUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj3).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        kotlin.b.b(value);
        Object obj22 = (com.yandex.passport.common.ebs.h) value;
        a = Result.a(obj22);
        if (a != null) {
        }
        return new Result(obj22);
    }
}
