package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import com.yandex.passport.common.core.FrontendUrlType;
import defpackage.ny61;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class p0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.network.r b;
    public final com.yandex.passport.internal.usecase.y c;
    public final com.yandex.passport.common.ui.lang.b d;

    public p0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar, com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.common.ui.lang.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = rVar;
        this.c = yVar;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: all -> 0x0088, CancellationException -> 0x0090, TimeoutCancellationException -> 0x0093, TryCatch #2 {TimeoutCancellationException -> 0x0093, CancellationException -> 0x0090, all -> 0x0088, blocks: (B:10:0x0023, B:11:0x006a, B:13:0x0074, B:14:0x0082, B:21:0x0031), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(n0 n0Var, ContinuationImpl continuationImpl) {
        ShowAuthCodeUseCase$run$1 showAuthCodeUseCase$run$1;
        int i;
        Result.Failure failure;
        Object value;
        try {
            if (continuationImpl instanceof ShowAuthCodeUseCase$run$1) {
                showAuthCodeUseCase$run$1 = (ShowAuthCodeUseCase$run$1) continuationImpl;
                int i2 = showAuthCodeUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    showAuthCodeUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = showAuthCodeUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = showAuthCodeUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Uri a = this.b.a(n0Var.b.getValue(), Uri.parse(n0Var.a).toString());
                        com.yandex.passport.internal.usecase.y yVar = this.c;
                        com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(n0Var.b, ((com.yandex.passport.internal.ui.lang.a) this.d).b(), a.toString(), (String) null, (Map) null, (FrontendUrlType) null, 96);
                        showAuthCodeUseCase$run$1.label = 1;
                        obj = yVar.a(wVar, showAuthCodeUseCase$run$1);
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
                        value = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.k(((com.yandex.passport.common.url.b) value).a));
                    }
                    return new Result(value);
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            return new Result(value);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            return new Result(failure);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            return new Result(failure);
        }
        showAuthCodeUseCase$run$1 = new ShowAuthCodeUseCase$run$1(this, continuationImpl);
        Object obj2 = showAuthCodeUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showAuthCodeUseCase$run$1.label;
    }
}
