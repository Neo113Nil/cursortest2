package com.yandex.passport.internal.usecase.ui;

import android.net.Uri;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class j extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.network.r b;
    public final com.yandex.passport.internal.core.tokens.b c;
    public final com.yandex.passport.internal.usecase.y d;
    public final com.yandex.passport.common.ui.lang.b e;

    public j(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.r rVar, com.yandex.passport.internal.core.tokens.b bVar, com.yandex.passport.internal.usecase.y yVar, com.yandex.passport.common.ui.lang.b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = rVar;
        this.c = bVar;
        this.d = yVar;
        this.e = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h hVar, ContinuationImpl continuationImpl) {
        AuthQrUseCase$run$1 authQrUseCase$run$1;
        int i;
        Result.Failure failure;
        Throwable a;
        ModernAccount e;
        try {
            if (continuationImpl instanceof AuthQrUseCase$run$1) {
                authQrUseCase$run$1 = (AuthQrUseCase$run$1) continuationImpl;
                int i2 = authQrUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    authQrUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = authQrUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = authQrUseCase$run$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    Uri b = this.b.b(hVar.b.getValue(), hVar.a);
                    com.yandex.passport.internal.usecase.y yVar = this.d;
                    com.yandex.passport.internal.usecase.w wVar = new com.yandex.passport.internal.usecase.w(hVar.b, ((com.yandex.passport.internal.ui.lang.a) this.e).b(), b.toString(), (String) null, (Map) null, (FrontendUrlType) null, 96);
                    authQrUseCase$run$1.L$0 = this;
                    authQrUseCase$run$1.L$1 = hVar;
                    authQrUseCase$run$1.label = 1;
                    Object a2 = yVar.a(wVar, authQrUseCase$run$1);
                    return a2 == coroutineSingletons ? coroutineSingletons : a2;
                }
            }
            if (i == 0) {
            }
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
            a = Result.a(failure);
            if (a != null && (a instanceof InvalidTokenException)) {
                com.yandex.passport.internal.core.tokens.b bVar = this.c;
                e = bVar.b.a().e(hVar.b);
                if (e != null) {
                    bVar.c.a(e);
                }
            }
            return new Result(failure);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            a = Result.a(failure);
            if (a != null) {
                com.yandex.passport.internal.core.tokens.b bVar2 = this.c;
                e = bVar2.b.a().e(hVar.b);
                if (e != null) {
                }
            }
            return new Result(failure);
        }
        authQrUseCase$run$1 = new AuthQrUseCase$run$1(this, continuationImpl);
        Object obj2 = authQrUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authQrUseCase$run$1.label;
    }
}
