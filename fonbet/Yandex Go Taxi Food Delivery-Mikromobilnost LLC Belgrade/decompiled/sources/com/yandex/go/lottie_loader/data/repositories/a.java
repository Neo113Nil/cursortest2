package com.yandex.go.lottie_loader.data.repositories;

import android.content.Context;
import defpackage.eyj;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ow21;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zch;
import defpackage.zy11;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public volatile eyj e;
    public volatile File f;

    public a(Context context, tt2 tt2Var) {
        this.a = context;
        this.b = tt2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        LottieAnimationCachedContentRepository$deleteCacheSafely$1 lottieAnimationCachedContentRepository$deleteCacheSafely$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof LottieAnimationCachedContentRepository$deleteCacheSafely$1) {
            lottieAnimationCachedContentRepository$deleteCacheSafely$1 = (LottieAnimationCachedContentRepository$deleteCacheSafely$1) continuationImpl;
            int i2 = lottieAnimationCachedContentRepository$deleteCacheSafely$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationCachedContentRepository$deleteCacheSafely$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lottieAnimationCachedContentRepository$deleteCacheSafely$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationCachedContentRepository$deleteCacheSafely$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lottieAnimationCachedContentRepository$deleteCacheSafely$1.label = 1;
                    obj = aVar.f(lottieAnimationCachedContentRepository$deleteCacheSafely$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                eyj eyjVar = (eyj) obj;
                eyjVar.close();
                eyjVar.close();
                ow21.a(eyjVar.a);
                return zy11.a;
            }
        }
        lottieAnimationCachedContentRepository$deleteCacheSafely$1 = new LottieAnimationCachedContentRepository$deleteCacheSafely$1(aVar, continuationImpl);
        Object obj3 = lottieAnimationCachedContentRepository$deleteCacheSafely$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedContentRepository$deleteCacheSafely$1.label;
        if (i != 0) {
        }
        eyj eyjVar2 = (eyj) obj3;
        eyjVar2.close();
        eyjVar2.close();
        ow21.a(eyjVar2.a);
        return zy11.a;
    }

    public final Object b(Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$clear$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object c(String str, InputStream inputStream, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$downloadAndSave$2(inputStream, this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x0056, CancellationException -> 0x0059, TryCatch #2 {CancellationException -> 0x0059, all -> 0x0056, blocks: (B:11:0x0029, B:12:0x0041, B:14:0x0049, B:17:0x0051, B:25:0x0036), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        LottieAnimationCachedContentRepository$exist$1 lottieAnimationCachedContentRepository$exist$1;
        int i;
        zch n;
        try {
            if (continuationImpl instanceof LottieAnimationCachedContentRepository$exist$1) {
                lottieAnimationCachedContentRepository$exist$1 = (LottieAnimationCachedContentRepository$exist$1) continuationImpl;
                int i2 = lottieAnimationCachedContentRepository$exist$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedContentRepository$exist$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedContentRepository$exist$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedContentRepository$exist$1.label;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationCachedContentRepository$exist$1.L$0 = str;
                        lottieAnimationCachedContentRepository$exist$1.label = 1;
                        obj = f(lottieAnimationCachedContentRepository$exist$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) lottieAnimationCachedContentRepository$exist$1.L$0;
                        kotlin.b.b(obj);
                    }
                    n = ((eyj) obj).n(str);
                    if ((n != null ? n.f() : null) != null) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
            if (i != 0) {
            }
            n = ((eyj) obj).n(str);
            if ((n != null ? n.f() : null) != null) {
            }
            return Boolean.valueOf(z);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
        lottieAnimationCachedContentRepository$exist$1 = new LottieAnimationCachedContentRepository$exist$1(this, continuationImpl);
        Object obj3 = lottieAnimationCachedContentRepository$exist$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedContentRepository$exist$1.label;
        boolean z2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:11:0x0047, B:13:0x004b, B:15:0x005e, B:16:0x0064), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        LottieAnimationCachedContentRepository$getAnimationFolder$1 lottieAnimationCachedContentRepository$getAnimationFolder$1;
        int i;
        g050 g050Var;
        File file;
        try {
            if (continuationImpl instanceof LottieAnimationCachedContentRepository$getAnimationFolder$1) {
                lottieAnimationCachedContentRepository$getAnimationFolder$1 = (LottieAnimationCachedContentRepository$getAnimationFolder$1) continuationImpl;
                int i2 = lottieAnimationCachedContentRepository$getAnimationFolder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedContentRepository$getAnimationFolder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedContentRepository$getAnimationFolder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedContentRepository$getAnimationFolder$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        File file2 = this.f;
                        if (file2 != null) {
                            return file2;
                        }
                        kotlinx.coroutines.sync.a aVar = this.c;
                        lottieAnimationCachedContentRepository$getAnimationFolder$1.L$0 = aVar;
                        lottieAnimationCachedContentRepository$getAnimationFolder$1.label = 1;
                        if (aVar.a(lottieAnimationCachedContentRepository$getAnimationFolder$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) lottieAnimationCachedContentRepository$getAnimationFolder$1.L$0;
                        kotlin.b.b(obj);
                    }
                    file = this.f;
                    if (file == null) {
                        file = new File(this.a.getCacheDir(), "lottie_animations");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        this.f = file;
                    }
                    g050Var.d(null);
                    return file;
                }
            }
            file = this.f;
            if (file == null) {
            }
            g050Var.d(null);
            return file;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        lottieAnimationCachedContentRepository$getAnimationFolder$1 = new LottieAnimationCachedContentRepository$getAnimationFolder$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedContentRepository$getAnimationFolder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedContentRepository$getAnimationFolder$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0051, code lost:
    
        if (r8.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:26:0x0054, B:28:0x0058), top: B:25:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.lottie_loader.data.repositories.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        LottieAnimationCachedContentRepository$getDiskLruCache$1 lottieAnimationCachedContentRepository$getDiskLruCache$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r0;
        eyj eyjVar;
        try {
            if (continuationImpl instanceof LottieAnimationCachedContentRepository$getDiskLruCache$1) {
                lottieAnimationCachedContentRepository$getDiskLruCache$1 = (LottieAnimationCachedContentRepository$getDiskLruCache$1) continuationImpl;
                int i2 = lottieAnimationCachedContentRepository$getDiskLruCache$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationCachedContentRepository$getDiskLruCache$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationCachedContentRepository$getDiskLruCache$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationCachedContentRepository$getDiskLruCache$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        eyj eyjVar2 = this.e;
                        if (eyjVar2 != null) {
                            return eyjVar2;
                        }
                        aVar = this.d;
                        lottieAnimationCachedContentRepository$getDiskLruCache$1.L$0 = aVar;
                        lottieAnimationCachedContentRepository$getDiskLruCache$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = (g050) lottieAnimationCachedContentRepository$getDiskLruCache$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                r0 = r0;
                                eyjVar = eyj.v((File) obj, 41650, 52428800L);
                                this.e = eyjVar;
                                aVar = r0;
                                aVar.d(null);
                                return eyjVar;
                            } catch (Throwable th) {
                                th = th;
                                r0.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) lottieAnimationCachedContentRepository$getDiskLruCache$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    eyjVar = this.e;
                    if (eyjVar == null) {
                        lottieAnimationCachedContentRepository$getDiskLruCache$1.L$0 = aVar;
                        lottieAnimationCachedContentRepository$getDiskLruCache$1.label = 2;
                        Object e = e(lottieAnimationCachedContentRepository$getDiskLruCache$1);
                        if (e != coroutineSingletons) {
                            r0 = aVar;
                            obj = e;
                            eyjVar = eyj.v((File) obj, 41650, 52428800L);
                            this.e = eyjVar;
                            aVar = r0;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return eyjVar;
                }
            }
            eyjVar = this.e;
            if (eyjVar == null) {
            }
            aVar.d(null);
            return eyjVar;
        } catch (Throwable th2) {
            th = th2;
            r0 = aVar;
            r0.d(null);
            throw th;
        }
        lottieAnimationCachedContentRepository$getDiskLruCache$1 = new LottieAnimationCachedContentRepository$getDiskLruCache$1(this, continuationImpl);
        Object obj2 = lottieAnimationCachedContentRepository$getDiskLruCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationCachedContentRepository$getDiskLruCache$1.label;
        if (i != 0) {
        }
    }
}
