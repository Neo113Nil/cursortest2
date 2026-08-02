package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.api.exception.PassportChallengeType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.BackendErrorException;
import defpackage.ny61;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class i1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.helper.d b;

    public i1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.helper.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|8|(1:(1:11)(2:30|31))(3:32|33|(1:35))|12|(3:18|19|(2:21|(2:23|24)(1:25))(1:26))|14|15|16))|44|6|7|8|(0)(0)|12|(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r8 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        r8 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(h1 h1Var, ContinuationImpl continuationImpl) {
        SelectPushPictureUseCase$run$1 selectPushPictureUseCase$run$1;
        int i;
        Object b;
        Throwable a;
        if (continuationImpl instanceof SelectPushPictureUseCase$run$1) {
            selectPushPictureUseCase$run$1 = (SelectPushPictureUseCase$run$1) continuationImpl;
            int i2 = selectPushPictureUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectPushPictureUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                SelectPushPictureUseCase$run$1 selectPushPictureUseCase$run$12 = selectPushPictureUseCase$run$1;
                Object obj = selectPushPictureUseCase$run$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectPushPictureUseCase$run$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.helper.d dVar = this.b;
                    Uid uid = h1Var.b;
                    String str = h1Var.c;
                    String valueOf = String.valueOf(h1Var.a);
                    selectPushPictureUseCase$run$12.label = 1;
                    b = dVar.b(uid, str, valueOf, "selected_2fa_picture", selectPushPictureUseCase$run$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    try {
                        if (!(a instanceof BackendErrorException)) {
                            throw a;
                        }
                        if (((BackendErrorException) a).getBackendError() == BackendError.NUMBER_FOR_PICTURE_CHALLENGE_NEEDED) {
                            throw new PassportChallengeRequiredException(PassportChallengeType.NUMBER);
                        }
                        throw a;
                    } catch (Throwable th) {
                        b = new Result.Failure(th);
                    }
                }
                kotlin.b.b(b);
                Object obj2 = zy11.a;
                return new Result(obj2);
            }
        }
        selectPushPictureUseCase$run$1 = new SelectPushPictureUseCase$run$1(this, continuationImpl);
        SelectPushPictureUseCase$run$1 selectPushPictureUseCase$run$122 = selectPushPictureUseCase$run$1;
        Object obj3 = selectPushPictureUseCase$run$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectPushPictureUseCase$run$122.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        kotlin.b.b(b);
        Object obj22 = zy11.a;
        return new Result(obj22);
    }
}
