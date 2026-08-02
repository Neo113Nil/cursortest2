package com.yandex.go.lottie_loader.data.repositories;

import defpackage.csz;
import defpackage.d170;
import defpackage.eci0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.hit;
import defpackage.hnr0;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zy11;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class d implements d170 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final kotlinx.coroutines.sync.a f = gtq0.a();
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public final i3y h;

    public d(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, hit hitVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.h = kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(0, hitVar));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        defpackage.ehb1.e(r9);
        r0.L$0 = r7;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r6.f(r7, r8, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, String str, String str2, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$downloadAnimationAndSaveToCache$1 lottieAnimationRepository$downloadAnimationAndSaveToCache$1;
        Object obj;
        int i;
        a aVar;
        dVar.getClass();
        try {
            try {
                if (continuationImpl instanceof LottieAnimationRepository$downloadAnimationAndSaveToCache$1) {
                    lottieAnimationRepository$downloadAnimationAndSaveToCache$1 = (LottieAnimationRepository$downloadAnimationAndSaveToCache$1) continuationImpl;
                    int i2 = lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = lottieAnimationRepository$downloadAnimationAndSaveToCache$1.result;
                        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label;
                        zy11 zy11Var = zy11.a;
                        switch (i) {
                            case 0:
                                kotlin.b.b(obj2);
                                com.yandex.go.lottie_loader.data.api.a aVar2 = (com.yandex.go.lottie_loader.data.api.a) dVar.a.get();
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = str;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = str2;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 1;
                                obj2 = aVar2.a(str2, lottieAnimationRepository$downloadAnimationAndSaveToCache$1);
                                if (obj2 == obj) {
                                    return obj;
                                }
                                aVar = (a) dVar.b.get();
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = str;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = str2;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 2;
                                if (aVar.c(str, (InputStream) obj2, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                    return obj;
                                }
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = zy11Var;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 3;
                                if (dVar.l(str, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                    return obj;
                                }
                                return zy11Var;
                            case 1:
                                str2 = (String) lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1;
                                str = (String) lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0;
                                kotlin.b.b(obj2);
                                aVar = (a) dVar.b.get();
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = str;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = str2;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 2;
                                if (aVar.c(str, (InputStream) obj2, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                }
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = zy11Var;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 3;
                                if (dVar.l(str, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                }
                                return zy11Var;
                            case 2:
                                str = (String) lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0;
                                kotlin.b.b(obj2);
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = zy11Var;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 3;
                                if (dVar.l(str, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                }
                                return zy11Var;
                            case 3:
                            case 5:
                                kotlin.b.b(obj2);
                                return zy11Var;
                            case 4:
                                str = (String) lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0;
                                kotlin.b.b(obj2);
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = zy11Var;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$3 = null;
                                lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 5;
                                if (dVar.l(str, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                                    return obj;
                                }
                                return zy11Var;
                            case 6:
                                Throwable th = (Throwable) lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2;
                                kotlin.b.b(obj2);
                                throw th;
                            default:
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (i) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$0 = null;
            lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$1 = null;
            lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$2 = th2;
            lottieAnimationRepository$downloadAnimationAndSaveToCache$1.L$3 = null;
            lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label = 6;
            if (dVar.l(str, lottieAnimationRepository$downloadAnimationAndSaveToCache$1) == obj) {
                return obj;
            }
            throw th2;
        }
        lottieAnimationRepository$downloadAnimationAndSaveToCache$1 = new LottieAnimationRepository$downloadAnimationAndSaveToCache$1(dVar, continuationImpl);
        Object obj22 = lottieAnimationRepository$downloadAnimationAndSaveToCache$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$downloadAnimationAndSaveToCache$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    @Override // defpackage.d170
    public final Object a(Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v3, types: [hnr0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, eci0 eci0Var, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$addAnimationDownloadingFlow$1 lottieAnimationRepository$addAnimationDownloadingFlow$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        eci0 eci0Var2;
        try {
            if (continuationImpl instanceof LottieAnimationRepository$addAnimationDownloadingFlow$1) {
                lottieAnimationRepository$addAnimationDownloadingFlow$1 = (LottieAnimationRepository$addAnimationDownloadingFlow$1) continuationImpl;
                int i2 = lottieAnimationRepository$addAnimationDownloadingFlow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationRepository$addAnimationDownloadingFlow$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationRepository$addAnimationDownloadingFlow$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationRepository$addAnimationDownloadingFlow$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationRepository$addAnimationDownloadingFlow$1.L$0 = str;
                        lottieAnimationRepository$addAnimationDownloadingFlow$1.L$1 = eci0Var;
                        aVar = this.f;
                        lottieAnimationRepository$addAnimationDownloadingFlow$1.L$2 = aVar;
                        lottieAnimationRepository$addAnimationDownloadingFlow$1.label = 1;
                        eci0Var2 = eci0Var;
                        if (aVar.a(lottieAnimationRepository$addAnimationDownloadingFlow$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationRepository$addAnimationDownloadingFlow$1.L$2;
                        ?? r7 = (hnr0) lottieAnimationRepository$addAnimationDownloadingFlow$1.L$1;
                        String str2 = (String) lottieAnimationRepository$addAnimationDownloadingFlow$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                        eci0Var2 = r7;
                    }
                    this.e.put(str, eci0Var2);
                    aVar.d(null);
                    return zy11.a;
                }
            }
            this.e.put(str, eci0Var2);
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        lottieAnimationRepository$addAnimationDownloadingFlow$1 = new LottieAnimationRepository$addAnimationDownloadingFlow$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$addAnimationDownloadingFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$addAnimationDownloadingFlow$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(4:23|24|(2:26|22)|20))(1:27))(3:31|32|(2:34|22))|28|(2:30|22)|24|(0)|20))|39|6|7|(0)(0)|28|(0)|24|(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r7.a(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        defpackage.ehb1.d(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LottieAnimationRepository$clear$1 lottieAnimationRepository$clear$1;
        Object obj;
        int i;
        c cVar;
        a aVar;
        if (continuationImpl instanceof LottieAnimationRepository$clear$1) {
            lottieAnimationRepository$clear$1 = (LottieAnimationRepository$clear$1) continuationImpl;
            int i2 = lottieAnimationRepository$clear$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationRepository$clear$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lottieAnimationRepository$clear$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationRepository$clear$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lottieAnimationRepository$clear$1.label = 1;
                    if (e(lottieAnimationRepository$clear$1) == obj) {
                        return obj;
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj2);
                } else if (i == 2) {
                    kotlin.b.b(obj2);
                    aVar = (a) this.b.get();
                    lottieAnimationRepository$clear$1.label = 3;
                    if (aVar.b(lottieAnimationRepository$clear$1) == obj) {
                        return obj;
                    }
                    b bVar = (b) this.d.get();
                    lottieAnimationRepository$clear$1.label = 4;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    b bVar2 = (b) this.d.get();
                    lottieAnimationRepository$clear$1.label = 4;
                }
                cVar = (c) this.c.get();
                lottieAnimationRepository$clear$1.label = 2;
                if (cVar.a(lottieAnimationRepository$clear$1) == obj) {
                    return obj;
                }
                aVar = (a) this.b.get();
                lottieAnimationRepository$clear$1.label = 3;
                if (aVar.b(lottieAnimationRepository$clear$1) == obj) {
                }
                b bVar22 = (b) this.d.get();
                lottieAnimationRepository$clear$1.label = 4;
            }
        }
        lottieAnimationRepository$clear$1 = new LottieAnimationRepository$clear$1(this, continuationImpl);
        Object obj22 = lottieAnimationRepository$clear$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$clear$1.label;
        if (i != 0) {
        }
        cVar = (c) this.c.get();
        lottieAnimationRepository$clear$1.label = 2;
        if (cVar.a(lottieAnimationRepository$clear$1) == obj) {
        }
        aVar = (a) this.b.get();
        lottieAnimationRepository$clear$1.label = 3;
        if (aVar.b(lottieAnimationRepository$clear$1) == obj) {
        }
        b bVar222 = (b) this.d.get();
        lottieAnimationRepository$clear$1.label = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        LottieAnimationRepository$clearAnimationDownloadingMap$1 lottieAnimationRepository$clearAnimationDownloadingMap$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof LottieAnimationRepository$clearAnimationDownloadingMap$1) {
                lottieAnimationRepository$clearAnimationDownloadingMap$1 = (LottieAnimationRepository$clearAnimationDownloadingMap$1) continuationImpl;
                int i2 = lottieAnimationRepository$clearAnimationDownloadingMap$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationRepository$clearAnimationDownloadingMap$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationRepository$clearAnimationDownloadingMap$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationRepository$clearAnimationDownloadingMap$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.f;
                        lottieAnimationRepository$clearAnimationDownloadingMap$1.L$0 = aVar;
                        lottieAnimationRepository$clearAnimationDownloadingMap$1.label = 1;
                        if (aVar.a(lottieAnimationRepository$clearAnimationDownloadingMap$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) lottieAnimationRepository$clearAnimationDownloadingMap$1.L$0;
                        kotlin.b.b(obj);
                    }
                    this.e.clear();
                    kotlinx.coroutines.a.g(((tse) this.h.getValue()).getCoroutineContext(), null);
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            this.e.clear();
            kotlinx.coroutines.a.g(((tse) this.h.getValue()).getCoroutineContext(), null);
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        lottieAnimationRepository$clearAnimationDownloadingMap$1 = new LottieAnimationRepository$clearAnimationDownloadingMap$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$clearAnimationDownloadingMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$clearAnimationDownloadingMap$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$deleteAnimationFromCache$1 lottieAnimationRepository$deleteAnimationFromCache$1;
        int i;
        if (continuationImpl instanceof LottieAnimationRepository$deleteAnimationFromCache$1) {
            lottieAnimationRepository$deleteAnimationFromCache$1 = (LottieAnimationRepository$deleteAnimationFromCache$1) continuationImpl;
            int i2 = lottieAnimationRepository$deleteAnimationFromCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationRepository$deleteAnimationFromCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lottieAnimationRepository$deleteAnimationFromCache$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationRepository$deleteAnimationFromCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = (a) this.b.get();
                    lottieAnimationRepository$deleteAnimationFromCache$1.L$0 = null;
                    lottieAnimationRepository$deleteAnimationFromCache$1.L$1 = str2;
                    lottieAnimationRepository$deleteAnimationFromCache$1.label = 1;
                    aVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$delete$2(aVar, str, null), lottieAnimationRepository$deleteAnimationFromCache$1);
                    if (k0 != obj2) {
                        k0 = zy11.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str2 = (String) lottieAnimationRepository$deleteAnimationFromCache$1.L$1;
                    kotlin.b.b(obj);
                }
                c cVar = (c) this.c.get();
                lottieAnimationRepository$deleteAnimationFromCache$1.L$0 = null;
                lottieAnimationRepository$deleteAnimationFromCache$1.L$1 = null;
                lottieAnimationRepository$deleteAnimationFromCache$1.label = 2;
                Object b = cVar.b(str2, lottieAnimationRepository$deleteAnimationFromCache$1);
                return b != obj2 ? obj2 : b;
            }
        }
        lottieAnimationRepository$deleteAnimationFromCache$1 = new LottieAnimationRepository$deleteAnimationFromCache$1(this, continuationImpl);
        Object obj3 = lottieAnimationRepository$deleteAnimationFromCache$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$deleteAnimationFromCache$1.label;
        if (i != 0) {
        }
        c cVar2 = (c) this.c.get();
        lottieAnimationRepository$deleteAnimationFromCache$1.L$0 = null;
        lottieAnimationRepository$deleteAnimationFromCache$1.L$1 = null;
        lottieAnimationRepository$deleteAnimationFromCache$1.label = 2;
        Object b2 = cVar2.b(str2, lottieAnimationRepository$deleteAnimationFromCache$1);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$getAnimationDownloadingFlow$1 lottieAnimationRepository$getAnimationDownloadingFlow$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LottieAnimationRepository$getAnimationDownloadingFlow$1) {
                lottieAnimationRepository$getAnimationDownloadingFlow$1 = (LottieAnimationRepository$getAnimationDownloadingFlow$1) continuationImpl;
                int i2 = lottieAnimationRepository$getAnimationDownloadingFlow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationRepository$getAnimationDownloadingFlow$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationRepository$getAnimationDownloadingFlow$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationRepository$getAnimationDownloadingFlow$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationRepository$getAnimationDownloadingFlow$1.L$0 = str;
                        aVar = this.f;
                        lottieAnimationRepository$getAnimationDownloadingFlow$1.L$1 = aVar;
                        lottieAnimationRepository$getAnimationDownloadingFlow$1.label = 1;
                        if (aVar.a(lottieAnimationRepository$getAnimationDownloadingFlow$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationRepository$getAnimationDownloadingFlow$1.L$1;
                        String str2 = (String) lottieAnimationRepository$getAnimationDownloadingFlow$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    return this.e.get(str);
                }
            }
            return this.e.get(str);
        } finally {
            aVar.d(null);
        }
        lottieAnimationRepository$getAnimationDownloadingFlow$1 = new LottieAnimationRepository$getAnimationDownloadingFlow$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$getAnimationDownloadingFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$getAnimationDownloadingFlow$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$getAnimationFromCache$1 lottieAnimationRepository$getAnimationFromCache$1;
        Object obj;
        int i;
        hnr0 hnr0Var;
        if (continuationImpl instanceof LottieAnimationRepository$getAnimationFromCache$1) {
            lottieAnimationRepository$getAnimationFromCache$1 = (LottieAnimationRepository$getAnimationFromCache$1) continuationImpl;
            int i2 = lottieAnimationRepository$getAnimationFromCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationRepository$getAnimationFromCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lottieAnimationRepository$getAnimationFromCache$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationRepository$getAnimationFromCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lottieAnimationRepository$getAnimationFromCache$1.L$0 = str;
                    lottieAnimationRepository$getAnimationFromCache$1.label = 1;
                    obj2 = g(str, lottieAnimationRepository$getAnimationFromCache$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        str = (String) lottieAnimationRepository$getAnimationFromCache$1.L$0;
                        kotlin.b.b(obj2);
                        a aVar = (a) this.b.get();
                        lottieAnimationRepository$getAnimationFromCache$1.L$0 = null;
                        lottieAnimationRepository$getAnimationFromCache$1.label = 3;
                        aVar.b.getClass();
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$getAnimation$2(aVar, str, null), lottieAnimationRepository$getAnimationFromCache$1);
                        return k0 == obj ? obj : k0;
                    }
                    str = (String) lottieAnimationRepository$getAnimationFromCache$1.L$0;
                    kotlin.b.b(obj2);
                }
                hnr0Var = (hnr0) obj2;
                if (hnr0Var != null) {
                    lottieAnimationRepository$getAnimationFromCache$1.L$0 = str;
                    lottieAnimationRepository$getAnimationFromCache$1.label = 2;
                }
                a aVar2 = (a) this.b.get();
                lottieAnimationRepository$getAnimationFromCache$1.L$0 = null;
                lottieAnimationRepository$getAnimationFromCache$1.label = 3;
                aVar2.b.getClass();
                sjh sjhVar2 = uyj.a;
                Object k02 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$getAnimation$2(aVar2, str, null), lottieAnimationRepository$getAnimationFromCache$1);
                if (k02 == obj) {
                }
            }
        }
        lottieAnimationRepository$getAnimationFromCache$1 = new LottieAnimationRepository$getAnimationFromCache$1(this, continuationImpl);
        Object obj22 = lottieAnimationRepository$getAnimationFromCache$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$getAnimationFromCache$1.label;
        if (i != 0) {
        }
        hnr0Var = (hnr0) obj22;
        if (hnr0Var != null) {
        }
        a aVar22 = (a) this.b.get();
        lottieAnimationRepository$getAnimationFromCache$1.L$0 = null;
        lottieAnimationRepository$getAnimationFromCache$1.label = 3;
        aVar22.b.getClass();
        sjh sjhVar22 = uyj.a;
        Object k022 = tje.k0(mdh.b, new LottieAnimationCachedContentRepository$getAnimation$2(aVar22, str, null), lottieAnimationRepository$getAnimationFromCache$1);
        if (k022 == obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$isAnimationCacheValid$1 lottieAnimationRepository$isAnimationCacheValid$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LottieAnimationRepository$isAnimationCacheValid$1) {
            lottieAnimationRepository$isAnimationCacheValid$1 = (LottieAnimationRepository$isAnimationCacheValid$1) continuationImpl;
            int i2 = lottieAnimationRepository$isAnimationCacheValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationRepository$isAnimationCacheValid$1.label = i2 - Integer.MIN_VALUE;
                obj = lottieAnimationRepository$isAnimationCacheValid$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationRepository$isAnimationCacheValid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lottieAnimationRepository$isAnimationCacheValid$1.L$0 = str;
                    lottieAnimationRepository$isAnimationCacheValid$1.label = 1;
                    obj = g(str, lottieAnimationRepository$isAnimationCacheValid$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) lottieAnimationRepository$isAnimationCacheValid$1.L$0;
                    kotlin.b.b(obj);
                }
                if (obj == null) {
                    return Boolean.TRUE;
                }
                a aVar = (a) this.b.get();
                lottieAnimationRepository$isAnimationCacheValid$1.L$0 = null;
                lottieAnimationRepository$isAnimationCacheValid$1.label = 2;
                Object d = aVar.d(str, lottieAnimationRepository$isAnimationCacheValid$1);
                return d == obj2 ? obj2 : d;
            }
        }
        lottieAnimationRepository$isAnimationCacheValid$1 = new LottieAnimationRepository$isAnimationCacheValid$1(this, continuationImpl);
        obj = lottieAnimationRepository$isAnimationCacheValid$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$isAnimationCacheValid$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006d, code lost:
    
        if (r10.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x00a0, B:27:0x004c, B:28:0x0088, B:30:0x008e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.lottie_loader.data.repositories.d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$isAnimationCached$1 lottieAnimationRepository$isAnimationCached$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        String str2;
        Object d;
        kotlinx.coroutines.sync.a aVar2;
        String str3;
        String str4;
        kotlinx.coroutines.sync.a aVar3;
        kotlinx.coroutines.sync.a aVar4;
        try {
            try {
                if (continuationImpl instanceof LottieAnimationRepository$isAnimationCached$1) {
                    lottieAnimationRepository$isAnimationCached$1 = (LottieAnimationRepository$isAnimationCached$1) continuationImpl;
                    int i2 = lottieAnimationRepository$isAnimationCached$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lottieAnimationRepository$isAnimationCached$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = lottieAnimationRepository$isAnimationCached$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = lottieAnimationRepository$isAnimationCached$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            lottieAnimationRepository$isAnimationCached$1.L$0 = str;
                            aVar = this.g;
                            lottieAnimationRepository$isAnimationCached$1.L$1 = aVar;
                            lottieAnimationRepository$isAnimationCached$1.label = 1;
                            str2 = str;
                        } else if (i == 1) {
                            ?? r9 = (g050) lottieAnimationRepository$isAnimationCached$1.L$1;
                            String str5 = (String) lottieAnimationRepository$isAnimationCached$1.L$0;
                            kotlin.b.b(obj);
                            aVar = r9;
                            str2 = str5;
                        } else {
                            if (i == 2) {
                                ?? r92 = (g050) lottieAnimationRepository$isAnimationCached$1.L$1;
                                kotlin.b.b(obj);
                                aVar2 = r92;
                                str3 = (String) obj;
                                aVar4 = aVar2;
                                if (str3 != null) {
                                    lottieAnimationRepository$isAnimationCached$1.L$0 = null;
                                    lottieAnimationRepository$isAnimationCached$1.L$1 = aVar2;
                                    lottieAnimationRepository$isAnimationCached$1.L$2 = str3;
                                    lottieAnimationRepository$isAnimationCached$1.label = 3;
                                    Object i3 = i(str3, lottieAnimationRepository$isAnimationCached$1);
                                    if (i3 != coroutineSingletons) {
                                        obj = i3;
                                        str4 = str3;
                                        str = aVar2;
                                        aVar4 = str;
                                        aVar3 = str;
                                    }
                                    return coroutineSingletons;
                                }
                                str4 = null;
                                aVar3 = aVar4;
                                aVar3.d(null);
                                return Boolean.valueOf(str4 != null);
                            }
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str4 = (String) lottieAnimationRepository$isAnimationCached$1.L$2;
                            g050 g050Var = (g050) lottieAnimationRepository$isAnimationCached$1.L$1;
                            kotlin.b.b(obj);
                            str = g050Var;
                            aVar4 = str;
                            aVar3 = str;
                        }
                        lottieAnimationRepository$isAnimationCached$1.L$0 = null;
                        lottieAnimationRepository$isAnimationCached$1.L$1 = aVar;
                        lottieAnimationRepository$isAnimationCached$1.label = 2;
                        d = ((c) this.c.get()).d(str2, lottieAnimationRepository$isAnimationCached$1);
                        if (d != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar5 = aVar;
                            obj = d;
                            aVar2 = aVar5;
                            str3 = (String) obj;
                            aVar4 = aVar2;
                            if (str3 != null) {
                            }
                            str4 = null;
                            aVar3 = aVar4;
                            aVar3.d(null);
                            return Boolean.valueOf(str4 != null);
                        }
                        return coroutineSingletons;
                    }
                }
                lottieAnimationRepository$isAnimationCached$1.L$0 = null;
                lottieAnimationRepository$isAnimationCached$1.L$1 = aVar;
                lottieAnimationRepository$isAnimationCached$1.label = 2;
                d = ((c) this.c.get()).d(str2, lottieAnimationRepository$isAnimationCached$1);
                if (d != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                th = th;
                str = aVar;
                str.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        lottieAnimationRepository$isAnimationCached$1 = new LottieAnimationRepository$isAnimationCached$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$isAnimationCached$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$isAnimationCached$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        if (m(r7, r4, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        if (r8.a(r0) == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0054, B:25:0x0069, B:26:0x00ce, B:29:0x00d7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:16:0x00f7, B:32:0x0076, B:34:0x00b6, B:36:0x00ba, B:39:0x00e7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #1 {all -> 0x0045, blocks: (B:15:0x0040, B:16:0x00f7, B:32:0x0076, B:34:0x00b6, B:36:0x00ba, B:39:0x00e7), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.lottie_loader.data.repositories.d] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$loadAnimation$1 lottieAnimationRepository$loadAnimation$1;
        ?? r2;
        kotlinx.coroutines.sync.a aVar;
        String str2;
        String str3;
        g050 g050Var;
        String str4;
        g050 g050Var2;
        String str5;
        Object h;
        try {
            try {
                if (continuationImpl instanceof LottieAnimationRepository$loadAnimation$1) {
                    lottieAnimationRepository$loadAnimation$1 = (LottieAnimationRepository$loadAnimation$1) continuationImpl;
                    int i = lottieAnimationRepository$loadAnimation$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lottieAnimationRepository$loadAnimation$1.label = i - Integer.MIN_VALUE;
                        Object obj = lottieAnimationRepository$loadAnimation$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        r2 = lottieAnimationRepository$loadAnimation$1.label;
                        switch (r2) {
                            case 0:
                                kotlin.b.b(obj);
                                lottieAnimationRepository$loadAnimation$1.L$0 = str;
                                aVar = this.g;
                                lottieAnimationRepository$loadAnimation$1.L$1 = aVar;
                                lottieAnimationRepository$loadAnimation$1.label = 1;
                                str2 = str;
                                break;
                            case 1:
                                ?? r7 = (g050) lottieAnimationRepository$loadAnimation$1.L$1;
                                String str6 = (String) lottieAnimationRepository$loadAnimation$1.L$0;
                                kotlin.b.b(obj);
                                aVar = r7;
                                str2 = str6;
                                try {
                                    lottieAnimationRepository$loadAnimation$1.L$0 = str2;
                                    lottieAnimationRepository$loadAnimation$1.L$1 = aVar;
                                    lottieAnimationRepository$loadAnimation$1.label = 2;
                                    Object d = ((c) this.c.get()).d(str2, lottieAnimationRepository$loadAnimation$1);
                                    if (d != coroutineSingletons) {
                                        str3 = str2;
                                        g050Var = aVar;
                                        obj = d;
                                        str4 = (String) obj;
                                        if (str4 == null) {
                                            lottieAnimationRepository$loadAnimation$1.L$0 = str3;
                                            lottieAnimationRepository$loadAnimation$1.L$1 = g050Var;
                                            lottieAnimationRepository$loadAnimation$1.L$2 = str4;
                                            lottieAnimationRepository$loadAnimation$1.label = 3;
                                            Object i2 = i(str4, lottieAnimationRepository$loadAnimation$1);
                                            if (i2 != coroutineSingletons) {
                                                g050Var2 = g050Var;
                                                str5 = str4;
                                                obj = i2;
                                                if (((Boolean) obj).booleanValue()) {
                                                    lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                                    lottieAnimationRepository$loadAnimation$1.L$1 = g050Var2;
                                                    lottieAnimationRepository$loadAnimation$1.L$2 = str5;
                                                    lottieAnimationRepository$loadAnimation$1.label = 4;
                                                    break;
                                                }
                                                g050Var2.d(null);
                                                lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                                lottieAnimationRepository$loadAnimation$1.L$1 = null;
                                                lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                                lottieAnimationRepository$loadAnimation$1.label = 6;
                                                h = h(str5, lottieAnimationRepository$loadAnimation$1);
                                                if (h != coroutineSingletons) {
                                                    return h;
                                                }
                                            }
                                        } else {
                                            lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                            lottieAnimationRepository$loadAnimation$1.L$1 = g050Var;
                                            lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                            lottieAnimationRepository$loadAnimation$1.label = 5;
                                            obj = n(str3, lottieAnimationRepository$loadAnimation$1);
                                            if (obj == coroutineSingletons) {
                                            }
                                            g050Var2 = g050Var;
                                            str5 = (String) obj;
                                            g050Var2.d(null);
                                            lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                            lottieAnimationRepository$loadAnimation$1.L$1 = null;
                                            lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                            lottieAnimationRepository$loadAnimation$1.label = 6;
                                            h = h(str5, lottieAnimationRepository$loadAnimation$1);
                                            if (h != coroutineSingletons) {
                                            }
                                        }
                                    }
                                    return coroutineSingletons;
                                } catch (Throwable th) {
                                    th = th;
                                    str = aVar;
                                    str.d(null);
                                    throw th;
                                }
                            case 2:
                                g050Var = (g050) lottieAnimationRepository$loadAnimation$1.L$1;
                                String str7 = (String) lottieAnimationRepository$loadAnimation$1.L$0;
                                kotlin.b.b(obj);
                                str3 = str7;
                                str4 = (String) obj;
                                if (str4 == null) {
                                }
                                return coroutineSingletons;
                            case 3:
                                str5 = (String) lottieAnimationRepository$loadAnimation$1.L$2;
                                g050Var2 = (g050) lottieAnimationRepository$loadAnimation$1.L$1;
                                str3 = (String) lottieAnimationRepository$loadAnimation$1.L$0;
                                kotlin.b.b(obj);
                                if (((Boolean) obj).booleanValue()) {
                                }
                                g050Var2.d(null);
                                lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                lottieAnimationRepository$loadAnimation$1.L$1 = null;
                                lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                lottieAnimationRepository$loadAnimation$1.label = 6;
                                h = h(str5, lottieAnimationRepository$loadAnimation$1);
                                if (h != coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                break;
                            case 4:
                                str5 = (String) lottieAnimationRepository$loadAnimation$1.L$2;
                                g050Var2 = (g050) lottieAnimationRepository$loadAnimation$1.L$1;
                                kotlin.b.b(obj);
                                g050Var2.d(null);
                                lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                lottieAnimationRepository$loadAnimation$1.L$1 = null;
                                lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                lottieAnimationRepository$loadAnimation$1.label = 6;
                                h = h(str5, lottieAnimationRepository$loadAnimation$1);
                                if (h != coroutineSingletons) {
                                }
                                break;
                            case 5:
                                g050Var = (g050) lottieAnimationRepository$loadAnimation$1.L$1;
                                kotlin.b.b(obj);
                                g050Var2 = g050Var;
                                str5 = (String) obj;
                                g050Var2.d(null);
                                lottieAnimationRepository$loadAnimation$1.L$0 = null;
                                lottieAnimationRepository$loadAnimation$1.L$1 = null;
                                lottieAnimationRepository$loadAnimation$1.L$2 = null;
                                lottieAnimationRepository$loadAnimation$1.label = 6;
                                h = h(str5, lottieAnimationRepository$loadAnimation$1);
                                if (h != coroutineSingletons) {
                                }
                                break;
                            case 6:
                                kotlin.b.b(obj);
                                return obj;
                            default:
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (r2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = r2;
        }
        lottieAnimationRepository$loadAnimation$1 = new LottieAnimationRepository$loadAnimation$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$loadAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = lottieAnimationRepository$loadAnimation$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$removeAnimationDownloadingFlow$1 lottieAnimationRepository$removeAnimationDownloadingFlow$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof LottieAnimationRepository$removeAnimationDownloadingFlow$1) {
                lottieAnimationRepository$removeAnimationDownloadingFlow$1 = (LottieAnimationRepository$removeAnimationDownloadingFlow$1) continuationImpl;
                int i2 = lottieAnimationRepository$removeAnimationDownloadingFlow$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationRepository$removeAnimationDownloadingFlow$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lottieAnimationRepository$removeAnimationDownloadingFlow$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationRepository$removeAnimationDownloadingFlow$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationRepository$removeAnimationDownloadingFlow$1.L$0 = str;
                        aVar = this.f;
                        lottieAnimationRepository$removeAnimationDownloadingFlow$1.L$1 = aVar;
                        lottieAnimationRepository$removeAnimationDownloadingFlow$1.label = 1;
                        if (aVar.a(lottieAnimationRepository$removeAnimationDownloadingFlow$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) lottieAnimationRepository$removeAnimationDownloadingFlow$1.L$1;
                        String str2 = (String) lottieAnimationRepository$removeAnimationDownloadingFlow$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    aVar.d(null);
                    return zy11.a;
                }
            }
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        lottieAnimationRepository$removeAnimationDownloadingFlow$1 = new LottieAnimationRepository$removeAnimationDownloadingFlow$1(this, continuationImpl);
        Object obj2 = lottieAnimationRepository$removeAnimationDownloadingFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$removeAnimationDownloadingFlow$1.label;
        if (i != 0) {
        }
    }

    public final Object m(String str, String str2, ContinuationImpl continuationImpl) {
        return c(str, e.O(new rol0(new LottieAnimationRepository$startAnimationDownloading$downloadingSharedFlow$1(this, str, str2, null)), (tse) this.h.getValue(), wsr0.a(xsr0.a, 2), 0), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, ContinuationImpl continuationImpl) {
        LottieAnimationRepository$startNewAnimationDownloading$1 lottieAnimationRepository$startNewAnimationDownloading$1;
        Object obj;
        int i;
        String str2;
        c cVar;
        String str3;
        String str4;
        if (continuationImpl instanceof LottieAnimationRepository$startNewAnimationDownloading$1) {
            lottieAnimationRepository$startNewAnimationDownloading$1 = (LottieAnimationRepository$startNewAnimationDownloading$1) continuationImpl;
            int i2 = lottieAnimationRepository$startNewAnimationDownloading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lottieAnimationRepository$startNewAnimationDownloading$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lottieAnimationRepository$startNewAnimationDownloading$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lottieAnimationRepository$startNewAnimationDownloading$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b bVar = (b) this.d.get();
                    lottieAnimationRepository$startNewAnimationDownloading$1.L$0 = str;
                    lottieAnimationRepository$startNewAnimationDownloading$1.label = 1;
                    obj2 = bVar.b(lottieAnimationRepository$startNewAnimationDownloading$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str5 = (String) lottieAnimationRepository$startNewAnimationDownloading$1.L$1;
                            kotlin.b.b(obj2);
                            return str5;
                        }
                        str4 = (String) lottieAnimationRepository$startNewAnimationDownloading$1.L$1;
                        str3 = (String) lottieAnimationRepository$startNewAnimationDownloading$1.L$0;
                        kotlin.b.b(obj2);
                        lottieAnimationRepository$startNewAnimationDownloading$1.L$0 = null;
                        lottieAnimationRepository$startNewAnimationDownloading$1.L$1 = str4;
                        lottieAnimationRepository$startNewAnimationDownloading$1.label = 3;
                        return m(str4, str3, lottieAnimationRepository$startNewAnimationDownloading$1) != obj ? obj : str4;
                    }
                    str = (String) lottieAnimationRepository$startNewAnimationDownloading$1.L$0;
                    kotlin.b.b(obj2);
                }
                str2 = (String) obj2;
                cVar = (c) this.c.get();
                lottieAnimationRepository$startNewAnimationDownloading$1.L$0 = str;
                lottieAnimationRepository$startNewAnimationDownloading$1.L$1 = str2;
                lottieAnimationRepository$startNewAnimationDownloading$1.label = 2;
                if (cVar.c(str, str2, lottieAnimationRepository$startNewAnimationDownloading$1) != obj) {
                    str3 = str;
                    str4 = str2;
                    lottieAnimationRepository$startNewAnimationDownloading$1.L$0 = null;
                    lottieAnimationRepository$startNewAnimationDownloading$1.L$1 = str4;
                    lottieAnimationRepository$startNewAnimationDownloading$1.label = 3;
                    if (m(str4, str3, lottieAnimationRepository$startNewAnimationDownloading$1) != obj) {
                    }
                }
            }
        }
        lottieAnimationRepository$startNewAnimationDownloading$1 = new LottieAnimationRepository$startNewAnimationDownloading$1(this, continuationImpl);
        Object obj22 = lottieAnimationRepository$startNewAnimationDownloading$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationRepository$startNewAnimationDownloading$1.label;
        if (i != 0) {
        }
        str2 = (String) obj22;
        cVar = (c) this.c.get();
        lottieAnimationRepository$startNewAnimationDownloading$1.L$0 = str;
        lottieAnimationRepository$startNewAnimationDownloading$1.L$1 = str2;
        lottieAnimationRepository$startNewAnimationDownloading$1.label = 2;
        if (cVar.c(str, str2, lottieAnimationRepository$startNewAnimationDownloading$1) != obj) {
        }
    }
}
