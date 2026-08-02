package com.yandex.go.lottie_loader.data.repositories;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.eyj;
import defpackage.jst;
import defpackage.mvg;
import defpackage.mxj;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.data.repositories.LottieAnimationCachedContentRepository$downloadAndSave$2", f = "LottieAnimationCachedContentRepository.kt", l = {60, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LottieAnimationCachedContentRepository$downloadAndSave$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $animationId;
    final /* synthetic */ InputStream $inputStream;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationCachedContentRepository$downloadAndSave$2(InputStream inputStream, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$inputStream = inputStream;
        this.this$0 = aVar;
        this.$animationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LottieAnimationCachedContentRepository$downloadAndSave$2(this.$inputStream, this.this$0, this.$animationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LottieAnimationCachedContentRepository$downloadAndSave$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:(6:6|7|8|9|10|11)(2:20|21))(4:22|23|24|25))(4:57|58|59|(2:61|43)(1:62))|36|37|38|39|(1:41)|(4:44|9|10|11)|43) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        r9 = r0;
        r13 = r1;
        r1 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        a aVar;
        String str;
        ?? r6;
        mxj e;
        CancellationException cancellationException;
        Closeable closeable3;
        mxj mxjVar;
        File d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    closeable2 = this.$inputStream;
                    a aVar2 = this.this$0;
                    String str2 = this.$animationId;
                    try {
                        this.L$0 = closeable2;
                        this.L$1 = aVar2;
                        this.L$2 = str2;
                        this.L$3 = closeable2;
                        this.label = 1;
                        obj = aVar2.f(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = aVar2;
                        str = str2;
                        r6 = closeable2;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = closeable2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            ooc.g(closeable, th);
                            throw th3;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mxjVar = (mxj) this.L$2;
                        closeable3 = (Closeable) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            eyj.a(mxjVar.d, mxjVar, true);
                            mxjVar.c = true;
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            mxjVar.a();
                            xby.l(jst.e, "LOTTIE_LOADER_ERROR", null, th5, "LOTTIE_LOADER_SAVE_TO_FILE_ERROR", 2);
                            ooc.g(closeable3, null);
                            return zy11Var;
                        }
                        ooc.g(closeable3, null);
                        return zy11Var;
                    }
                    InputStream inputStream = (InputStream) this.L$3;
                    String str3 = (String) this.L$2;
                    a aVar3 = (a) this.L$1;
                    closeable = (Closeable) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        r6 = inputStream;
                        closeable2 = closeable;
                        aVar = aVar3;
                        str = str3;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                aVar.getClass();
                Object n = bvf0.n(new LottieAnimationCachedContentRepository$saveToFile$2(d, r6, null), this);
                if (n != coroutineSingletons) {
                    n = zy11Var;
                }
                if (n != coroutineSingletons) {
                    closeable3 = closeable2;
                    mxjVar = e;
                    eyj.a(mxjVar.d, mxjVar, true);
                    mxjVar.c = true;
                    ooc.g(closeable3, null);
                    return zy11Var;
                }
                return coroutineSingletons;
            } catch (CancellationException e3) {
                cancellationException = e3;
                throw cancellationException;
            }
            d = e.d();
            this.L$0 = closeable2;
            this.L$1 = null;
            this.L$2 = e;
            this.L$3 = null;
            this.label = 2;
        } catch (CancellationException e4) {
            cancellationException = e4;
        }
        e = ((eyj) obj).e(str);
    }
}
