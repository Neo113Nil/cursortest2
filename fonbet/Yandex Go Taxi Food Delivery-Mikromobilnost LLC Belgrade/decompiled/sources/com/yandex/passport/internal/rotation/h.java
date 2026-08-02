package com.yandex.passport.internal.rotation;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.report.reporters.i0;
import com.yandex.passport.internal.usecase.c1;
import com.yandex.passport.internal.usecase.e1;
import com.yandex.passport.internal.usecase.f1;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h extends com.yandex.passport.common.domain.d {
    public final g b;
    public final f1 c;
    public final com.yandex.passport.internal.core.accounts.d d;
    public final i0 e;

    public h(com.yandex.passport.common.coroutine.a aVar, g gVar, f1 f1Var, com.yandex.passport.internal.core.accounts.d dVar, i0 i0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = gVar;
        this.c = f1Var;
        this.d = dVar;
        this.e = i0Var;
    }

    @Override // com.yandex.passport.common.domain.d
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return c(continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(9:10|11|12|13|(1:33)|15|(8:17|(2:18|(2:20|(2:22|23)(1:28))(2:29|30))|24|(1:26)|13|(0)|15|(0))|31|32)(2:35|36))(8:37|38|(1:40)|41|15|(0)|31|32)))|46|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        r1 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.INFO, null, "Error RevokeQuarantineMasterToken with " + r0, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:11:0x003e, B:13:0x00f2, B:15:0x008b, B:17:0x0091, B:18:0x009e, B:20:0x00a4, B:24:0x00bb, B:33:0x00fc, B:38:0x0055, B:40:0x0065, B:41:0x0076), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:11:0x003e, B:13:0x00f2, B:15:0x008b, B:17:0x0091, B:18:0x009e, B:20:0x00a4, B:24:0x00bb, B:33:0x00fc, B:38:0x0055, B:40:0x0065, B:41:0x0076), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ef -> B:13:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        RevokeQuarantineMasterTokenUseCase$run$1 revokeQuarantineMasterTokenUseCase$run$1;
        int i;
        List f;
        Iterator it;
        Object obj;
        h hVar = this;
        if (continuation instanceof RevokeQuarantineMasterTokenUseCase$run$1) {
            revokeQuarantineMasterTokenUseCase$run$1 = (RevokeQuarantineMasterTokenUseCase$run$1) continuation;
            int i2 = revokeQuarantineMasterTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                revokeQuarantineMasterTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = revokeQuarantineMasterTokenUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revokeQuarantineMasterTokenUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List a = hVar.b.a();
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start RevokeQuarantineMasterToken with " + a, 8);
                    }
                    hVar.e.j(a);
                    f = hVar.d.a().f();
                    it = a.iterator();
                    if (it.hasNext()) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f fVar = (f) revokeQuarantineMasterTokenUseCase$run$1.L$3;
                it = (Iterator) revokeQuarantineMasterTokenUseCase$run$1.L$2;
                f = (List) revokeQuarantineMasterTokenUseCase$run$1.L$1;
                h hVar2 = (h) revokeQuarantineMasterTokenUseCase$run$1.L$0;
                kotlin.b.b(obj2);
                f fVar2 = fVar;
                hVar = hVar2;
                Object a2 = obj2;
                Object value = ((Result) a2).getValue();
                if (!(value instanceof Result.Failure)) {
                    hVar.b.b(fVar2);
                }
                if (it.hasNext()) {
                    fVar2 = (f) it.next();
                    Iterator it2 = f.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (jl40.l(((ModernAccount) obj).getUid(), fVar2.c())) {
                            break;
                        }
                    }
                    ModernAccount modernAccount = (ModernAccount) obj;
                    f1 f1Var = hVar.c;
                    com.yandex.passport.common.account.b bVar = MasterToken.Companion;
                    String b = fVar2.b();
                    bVar.getClass();
                    c1 c1Var = new c1(modernAccount, com.yandex.passport.common.account.b.a(b), new e1(fVar2.a()), fVar2.c(), RevokePlace.Quarantine);
                    revokeQuarantineMasterTokenUseCase$run$1.L$0 = hVar;
                    revokeQuarantineMasterTokenUseCase$run$1.L$1 = f;
                    revokeQuarantineMasterTokenUseCase$run$1.L$2 = it;
                    revokeQuarantineMasterTokenUseCase$run$1.L$3 = fVar2;
                    revokeQuarantineMasterTokenUseCase$run$1.label = 1;
                    a2 = f1Var.a(c1Var, revokeQuarantineMasterTokenUseCase$run$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Object value2 = ((Result) a2).getValue();
                    if (!(value2 instanceof Result.Failure)) {
                    }
                    if (it.hasNext()) {
                    }
                }
                return zy11.a;
            }
        }
        revokeQuarantineMasterTokenUseCase$run$1 = new RevokeQuarantineMasterTokenUseCase$run$1(hVar, (ContinuationImpl) continuation);
        Object obj22 = revokeQuarantineMasterTokenUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revokeQuarantineMasterTokenUseCase$run$1.label;
        if (i != 0) {
        }
    }
}
