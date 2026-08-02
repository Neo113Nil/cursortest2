package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.w3;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.data.network.z c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    public d(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.data.network.z zVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = zVar;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(2:30|(1:32))(2:33|34))|12|(3:14|(1:16)|17)|18|19|(1:21)|22|23))|45|6|7|(0)(0)|12|(0)|18|19|(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[Catch: all -> 0x0031, TimeoutCancellationException -> 0x0035, CancellationException -> 0x00be, TryCatch #2 {TimeoutCancellationException -> 0x0035, CancellationException -> 0x00be, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x008c, B:14:0x0096, B:16:0x00a3, B:17:0x00a8, B:18:0x00ab, B:28:0x0042, B:30:0x005d, B:33:0x00b1, B:34:0x00b6), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(c cVar, ContinuationImpl continuationImpl) {
        BiometricTrackInitUseCase$run$1 biometricTrackInitUseCase$run$1;
        int i;
        Throwable a;
        Object value;
        if (continuationImpl instanceof BiometricTrackInitUseCase$run$1) {
            biometricTrackInitUseCase$run$1 = (BiometricTrackInitUseCase$run$1) continuationImpl;
            int i2 = biometricTrackInitUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricTrackInitUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricTrackInitUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricTrackInitUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.report.reporters.v vVar = this.e;
                    Uid uid = cVar.a;
                    vVar.o(cVar.e, uid, cVar.d, cVar.b, cVar.c);
                    ModernAccount e = this.b.a().e(uid);
                    if (e == null) {
                        throw new PassportAccountNotFoundException(uid);
                    }
                    com.yandex.passport.data.network.z zVar = this.c;
                    MasterToken masterToken = e.getMasterToken();
                    String str = cVar.b;
                    String str2 = cVar.c;
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    Environment environment = e.getUid().getEnvironment();
                    bVar.getClass();
                    com.yandex.passport.data.network.t tVar = new com.yandex.passport.data.network.t(masterToken, str, str2, com.yandex.passport.internal.network.mappers.b.a(environment), cVar.d);
                    biometricTrackInitUseCase$run$1.L$0 = this;
                    biometricTrackInitUseCase$run$1.L$1 = cVar;
                    biometricTrackInitUseCase$run$1.label = 1;
                    obj = zVar.a(tVar, biometricTrackInitUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) biometricTrackInitUseCase$run$1.L$1;
                    this = (d) biometricTrackInitUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.common.ebs.n nVar = (com.yandex.passport.common.ebs.n) value;
                    this.e.n(cVar.a, cVar.d, nVar instanceof com.yandex.passport.common.ebs.l ? ((com.yandex.passport.common.ebs.l) nVar).a : null, nVar);
                }
                kotlin.b.b(value);
                Object obj2 = (com.yandex.passport.common.ebs.n) value;
                a = Result.a(obj2);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
                    Uid uid2 = cVar.a;
                    String str3 = cVar.d;
                    String message = a.getMessage();
                    vVar2.getClass();
                    vVar2.f(w3.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.a(str3, 6, false), new com.yandex.passport.internal.report.a(message, 25));
                }
                return new Result(obj2);
            }
        }
        biometricTrackInitUseCase$run$1 = new BiometricTrackInitUseCase$run$1(this, continuationImpl);
        Object obj3 = biometricTrackInitUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricTrackInitUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj3).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        kotlin.b.b(value);
        Object obj22 = (com.yandex.passport.common.ebs.n) value;
        a = Result.a(obj22);
        if (a != null) {
        }
        return new Result(obj22);
    }
}
