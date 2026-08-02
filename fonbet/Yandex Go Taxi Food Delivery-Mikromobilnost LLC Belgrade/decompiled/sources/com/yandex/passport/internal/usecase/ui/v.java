package com.yandex.passport.internal.usecase.ui;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.pc;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class v extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.usecase.j0 b;
    public final i1 c;

    public v(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.j0 j0Var, i1 i1Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = j0Var;
        this.c = i1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r0 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r0 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(u uVar, ContinuationImpl continuationImpl) {
        FetchAuthCookieUseCase$run$1 fetchAuthCookieUseCase$run$1;
        int i;
        Throwable a;
        Object c;
        if (continuationImpl instanceof FetchAuthCookieUseCase$run$1) {
            fetchAuthCookieUseCase$run$1 = (FetchAuthCookieUseCase$run$1) continuationImpl;
            int i2 = fetchAuthCookieUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchAuthCookieUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchAuthCookieUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchAuthCookieUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.usecase.j0 j0Var = this.b;
                    Uid b = uVar.b();
                    String a2 = uVar.a();
                    fetchAuthCookieUseCase$run$1.L$0 = this;
                    fetchAuthCookieUseCase$run$1.L$1 = uVar;
                    fetchAuthCookieUseCase$run$1.label = 1;
                    c = j0Var.c(b, a2, fetchAuthCookieUseCase$run$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uVar = (u) fetchAuthCookieUseCase$run$1.L$1;
                    this = (v) fetchAuthCookieUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                kotlin.b.b(c);
                Object obj2 = (AuthCookie) c;
                a = Result.a(obj2);
                if (a != null) {
                    i1 i1Var = this.c;
                    Uid b2 = uVar.b();
                    String a3 = uVar.a();
                    i1Var.getClass();
                    i1Var.f(pc.w, new yd(a), new yd(b2), new com.yandex.passport.internal.report.f(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, a3));
                }
                return new Result(obj2);
            }
        }
        fetchAuthCookieUseCase$run$1 = new FetchAuthCookieUseCase$run$1(this, continuationImpl);
        Object obj3 = fetchAuthCookieUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchAuthCookieUseCase$run$1.label;
        if (i != 0) {
        }
        kotlin.b.b(c);
        Object obj22 = (AuthCookie) c;
        a = Result.a(obj22);
        if (a != null) {
        }
        return new Result(obj22);
    }
}
