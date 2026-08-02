package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.JwtToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.ia;
import com.yandex.passport.data.network.oa;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.s3;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class y0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final oa c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.v e;

    public y0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, oa oaVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = dVar;
        this.c = oaVar;
        this.d = bVar;
        this.e = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(2:27|(1:29))(2:30|31))|12|(1:14)|15|16|(1:18)|19|20))|39|6|7|(0)(0)|12|(0)|15|16|(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r0 = new kotlin.Result.Failure(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0030, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        r0 = new kotlin.Result.Failure(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b A[Catch: all -> 0x0030, TimeoutCancellationException -> 0x0032, CancellationException -> 0x00ae, TryCatch #2 {TimeoutCancellationException -> 0x0032, CancellationException -> 0x00ae, all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0081, B:14:0x008b, B:15:0x009b, B:25:0x003f, B:27:0x0058, B:30:0x00a1, B:31:0x00a6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(x0 x0Var, ContinuationImpl continuationImpl) {
        MakeJwtTokenUseCase$run$1 makeJwtTokenUseCase$run$1;
        int i;
        Throwable a;
        Object value;
        if (continuationImpl instanceof MakeJwtTokenUseCase$run$1) {
            makeJwtTokenUseCase$run$1 = (MakeJwtTokenUseCase$run$1) continuationImpl;
            int i2 = makeJwtTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeJwtTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeJwtTokenUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeJwtTokenUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.report.reporters.v vVar = this.e;
                    Uid uid = x0Var.a;
                    String str = x0Var.d;
                    vVar.l(uid, x0Var.b, x0Var.c, str);
                    ModernAccount e = this.b.a().e(uid);
                    if (e == null) {
                        throw new PassportAccountNotFoundException(uid);
                    }
                    oa oaVar = this.c;
                    MasterToken masterToken = e.getMasterToken();
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    Environment environment = e.getUid().getEnvironment();
                    bVar.getClass();
                    ia iaVar = new ia(masterToken, str, com.yandex.passport.internal.network.mappers.b.a(environment));
                    makeJwtTokenUseCase$run$1.L$0 = this;
                    makeJwtTokenUseCase$run$1.L$1 = x0Var;
                    makeJwtTokenUseCase$run$1.label = 1;
                    obj = oaVar.a(iaVar, makeJwtTokenUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x0Var = (x0) makeJwtTokenUseCase$run$1.L$1;
                    this = (y0) makeJwtTokenUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    this.e.m(x0Var.a, x0Var.b, x0Var.c, x0Var.d);
                }
                kotlin.b.b(value);
                Object obj2 = (JwtToken) value;
                a = Result.a(obj2);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.v vVar2 = this.e;
                    Uid uid2 = x0Var.a;
                    String str2 = x0Var.b;
                    String str3 = x0Var.c;
                    String str4 = x0Var.d;
                    String message = a.getMessage();
                    vVar2.getClass();
                    boolean z = false;
                    vVar2.f(s3.w, new jd(Long.valueOf(uid2.getValue())), new com.yandex.passport.internal.report.a(str2, 6, z), new yd(str3, 11), new com.yandex.passport.internal.report.a(str4, 19, z), new com.yandex.passport.internal.report.a(message, 25));
                }
                return new Result(obj2);
            }
        }
        makeJwtTokenUseCase$run$1 = new MakeJwtTokenUseCase$run$1(this, continuationImpl);
        Object obj3 = makeJwtTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeJwtTokenUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj3).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        kotlin.b.b(value);
        Object obj22 = (JwtToken) value;
        a = Result.a(obj22);
        if (a != null) {
        }
        return new Result(obj22);
    }
}
