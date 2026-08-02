package com.yandex.go.lottie_loader;

import defpackage.jst;
import defpackage.mdh;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xby;
import defpackage.ytz;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a implements ytz {
    public final com.yandex.go.lottie_loader.domain.interactors.a a;
    public final tt2 b;

    public a(com.yandex.go.lottie_loader.domain.interactors.a aVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r14 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x0037, CancellationException -> 0x008a, TryCatch #2 {CancellationException -> 0x008a, all -> 0x0037, blocks: (B:12:0x0033, B:13:0x007a, B:20:0x0045, B:21:0x0059, B:23:0x005d, B:28:0x004c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LottieLoaderImpl$loadAnimation$1 lottieLoaderImpl$loadAnimation$1;
        int i;
        InputStream inputStream;
        try {
            if (continuationImpl instanceof LottieLoaderImpl$loadAnimation$1) {
                lottieLoaderImpl$loadAnimation$1 = (LottieLoaderImpl$loadAnimation$1) continuationImpl;
                int i2 = lottieLoaderImpl$loadAnimation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieLoaderImpl$loadAnimation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieLoaderImpl$loadAnimation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieLoaderImpl$loadAnimation$1.label;
                    if (i != 0) {
                        b.b(obj);
                        com.yandex.go.lottie_loader.domain.interactors.a aVar = this.a;
                        lottieLoaderImpl$loadAnimation$1.L$0 = null;
                        lottieLoaderImpl$loadAnimation$1.label = 1;
                        obj = aVar.b(str, lottieLoaderImpl$loadAnimation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return (nsz) obj;
                        }
                        b.b(obj);
                    }
                    inputStream = (InputStream) obj;
                    if (inputStream != null) {
                        return null;
                    }
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    LottieLoaderImpl$loadAnimation$2$1$1 lottieLoaderImpl$loadAnimation$2$1$1 = new LottieLoaderImpl$loadAnimation$2$1$1(inputStream, null);
                    lottieLoaderImpl$loadAnimation$1.L$0 = null;
                    lottieLoaderImpl$loadAnimation$1.L$1 = null;
                    lottieLoaderImpl$loadAnimation$1.L$2 = null;
                    lottieLoaderImpl$loadAnimation$1.label = 2;
                    obj = tje.k0(mdhVar, lottieLoaderImpl$loadAnimation$2$1$1, lottieLoaderImpl$loadAnimation$1);
                }
            }
            if (i != 0) {
            }
            inputStream = (InputStream) obj;
            if (inputStream != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "LOTTIE_LOADER_ERROR", null, th, "LOTTIE_LOADER_LOAD_ANIMATION_ERROR", 2);
            return null;
        }
        lottieLoaderImpl$loadAnimation$1 = new LottieLoaderImpl$loadAnimation$1(this, continuationImpl);
        Object obj2 = lottieLoaderImpl$loadAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieLoaderImpl$loadAnimation$1.label;
    }
}
