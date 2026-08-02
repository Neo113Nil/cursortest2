package com.yandex.passport.internal.usecase;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import defpackage.ny61;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.config.m b;
    public final com.yandex.passport.internal.config.h c;

    public h(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.config.m mVar, com.yandex.passport.internal.config.h hVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = mVar;
        this.c = hVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(3:10|11|12)(2:27|28))(7:29|30|31|32|(2:34|(2:36|(1:38)))|40|(0))|13|14|15|(1:17)|(3:20|21|22)(2:24|25)))|49|6|7|(0)(0)|13|14|15|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        r8 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[Catch: Exception -> 0x0093, all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0030, B:13:0x007a, B:15:0x0083, B:17:0x008b, B:20:0x0095, B:24:0x0098, B:25:0x009f, B:30:0x003f, B:32:0x0051, B:34:0x0059, B:36:0x0065), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[Catch: all -> 0x00a0, CancellationException -> 0x00a8, TimeoutCancellationException -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0030, B:13:0x007a, B:15:0x0083, B:17:0x008b, B:20:0x0095, B:24:0x0098, B:25:0x009f, B:30:0x003f, B:32:0x0051, B:34:0x0059, B:36:0x0065), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[Catch: all -> 0x00a0, CancellationException -> 0x00a8, TimeoutCancellationException -> 0x00aa, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0030, B:13:0x007a, B:15:0x0083, B:17:0x008b, B:20:0x0095, B:24:0x0098, B:25:0x009f, B:30:0x003f, B:32:0x0051, B:34:0x0059, B:36:0x0065), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[Catch: all -> 0x00a0, CancellationException -> 0x00a8, TimeoutCancellationException -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0030, B:13:0x007a, B:15:0x0083, B:17:0x008b, B:20:0x0095, B:24:0x0098, B:25:0x009f, B:30:0x003f, B:32:0x0051, B:34:0x0059, B:36:0x0065), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(g gVar, ContinuationImpl continuationImpl) {
        CheckLocationIdUseCase$run$1 checkLocationIdUseCase$run$1;
        int i;
        String str;
        com.yandex.passport.internal.config.g gVar2;
        String str2;
        SharedPreferences b;
        SharedPreferences b2;
        if (continuationImpl instanceof CheckLocationIdUseCase$run$1) {
            checkLocationIdUseCase$run$1 = (CheckLocationIdUseCase$run$1) continuationImpl;
            int i2 = checkLocationIdUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkLocationIdUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = checkLocationIdUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkLocationIdUseCase$run$1.label;
                str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gVar2 = new com.yandex.passport.internal.config.g(gVar.b());
                    com.yandex.passport.internal.config.h hVar = this.c;
                    Environment a = gVar.a();
                    hVar.getClass();
                    try {
                        b = hVar.a.b(a);
                    } catch (Exception unused) {
                    }
                    if (b != null) {
                        str2 = b.getString(gVar2.a(), null);
                        if (str2 == null) {
                            com.yandex.passport.internal.config.m mVar = this.b;
                            Environment a2 = gVar.a();
                            checkLocationIdUseCase$run$1.L$0 = this;
                            checkLocationIdUseCase$run$1.L$1 = gVar;
                            checkLocationIdUseCase$run$1.L$2 = gVar2;
                            checkLocationIdUseCase$run$1.label = 1;
                            if (mVar.a(a2, checkLocationIdUseCase$run$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.config.g gVar3 = (com.yandex.passport.internal.config.g) checkLocationIdUseCase$run$1.L$2;
                    gVar = (g) checkLocationIdUseCase$run$1.L$1;
                    h hVar2 = (h) checkLocationIdUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    gVar2 = gVar3;
                    this = hVar2;
                }
                com.yandex.passport.internal.config.h hVar3 = this.c;
                Environment a3 = gVar.a();
                hVar3.getClass();
                b2 = hVar3.a.b(a3);
                if (b2 != null) {
                    str = b2.getString(gVar2.a(), null);
                }
                if (str != null) {
                    throw new IllegalStateException("location id for query not found");
                }
                Object obj2 = zy11.a;
                return new Result(obj2);
            }
        }
        checkLocationIdUseCase$run$1 = new CheckLocationIdUseCase$run$1(this, continuationImpl);
        Object obj3 = checkLocationIdUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkLocationIdUseCase$run$1.label;
        str = null;
        if (i != 0) {
        }
        com.yandex.passport.internal.config.h hVar32 = this.c;
        Environment a32 = gVar.a();
        hVar32.getClass();
        b2 = hVar32.a.b(a32);
        if (b2 != null) {
        }
        if (str != null) {
        }
    }
}
