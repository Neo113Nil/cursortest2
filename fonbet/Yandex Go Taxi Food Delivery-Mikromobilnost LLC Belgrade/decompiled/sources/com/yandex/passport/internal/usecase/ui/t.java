package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.t1;
import com.yandex.passport.data.network.y1;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class t extends com.yandex.passport.common.domain.a {
    public final y1 b;
    public final com.yandex.passport.internal.network.mappers.b c;

    public t(com.yandex.passport.common.coroutine.a aVar, y1 y1Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = y1Var;
        this.c = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|(1:13)|14|15|16))|32|6|7|(0)(0)|11|(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x006f, CancellationException -> 0x0077, TimeoutCancellationException -> 0x0079, TryCatch #2 {TimeoutCancellationException -> 0x0079, CancellationException -> 0x0077, all -> 0x006f, blocks: (B:10:0x0023, B:11:0x0060, B:13:0x006a, B:14:0x006c, B:22:0x0031), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(s sVar, ContinuationImpl continuationImpl) {
        DeletePhonishForeverUseCase$run$1 deletePhonishForeverUseCase$run$1;
        int i;
        Object value;
        if (continuationImpl instanceof DeletePhonishForeverUseCase$run$1) {
            deletePhonishForeverUseCase$run$1 = (DeletePhonishForeverUseCase$run$1) continuationImpl;
            int i2 = deletePhonishForeverUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deletePhonishForeverUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deletePhonishForeverUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deletePhonishForeverUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y1 y1Var = this.b;
                    com.yandex.passport.internal.network.mappers.b bVar = this.c;
                    ModernAccount modernAccount = sVar.a;
                    Environment environment = modernAccount.getUid().getEnvironment();
                    bVar.getClass();
                    t1 t1Var = new t1(com.yandex.passport.internal.network.mappers.b.a(environment), modernAccount.getLocationId(), modernAccount.getMasterToken().getNonNullValueOrThrow());
                    deletePhonishForeverUseCase$run$1.label = 1;
                    obj = y1Var.a(t1Var, deletePhonishForeverUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                }
                Object obj2 = zy11.a;
                return new Result(obj2);
            }
        }
        deletePhonishForeverUseCase$run$1 = new DeletePhonishForeverUseCase$run$1(this, continuationImpl);
        Object obj3 = deletePhonishForeverUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deletePhonishForeverUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj3).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        Object obj22 = zy11.a;
        return new Result(obj22);
    }
}
