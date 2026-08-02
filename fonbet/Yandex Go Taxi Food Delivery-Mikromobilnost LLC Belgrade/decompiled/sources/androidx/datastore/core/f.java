package androidx.datastore.core;

import androidx.datastore.core.f;
import androidx.datastore.core.g;
import defpackage.d8;
import defpackage.d921;
import defpackage.es10;
import defpackage.eyc;
import defpackage.f3u0;
import defpackage.f8w;
import defpackage.fse;
import defpackage.fyc;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ljo;
import defpackage.n1r;
import defpackage.nbi0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qng;
import defpackage.rol0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpg;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vcs0;
import defpackage.wls;
import defpackage.wpg;
import defpackage.x4c;
import defpackage.yk;
import defpackage.zv11;
import defpackage.zve;
import defpackage.zy11;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class f implements tpg {
    public final n1r a;
    public final zve b;
    public final tse c;
    public int f;
    public pzt0 g;
    public final d i;
    public final i3y j;
    public final i3y k;
    public final vcs0 l;
    public final rol0 d = new rol0(new DataStoreImpl$data$1(this, null));
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final wpg h = new wpg();

    public f(n1r n1rVar, List list, zve zveVar, tse tseVar) {
        this.a = n1rVar;
        this.b = zveVar;
        this.c = tseVar;
        this.i = new d(this, list);
        final int i = 0;
        this.j = kotlin.a.a(new sls(this) { // from class: upg
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        n1r n1rVar2 = fVar.a;
                        File canonicalFile = ((File) n1rVar2.c.invoke()).getCanonicalFile();
                        synchronized (n1r.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = n1r.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            linkedHashSet.add(absolutePath);
                        }
                        return new g(canonicalFile, n1rVar2.a, (f8w) n1rVar2.b.invoke(canonicalFile), new sbc(27, canonicalFile));
                    default:
                        return ((g) fVar.j.getValue()).c;
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: upg
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        n1r n1rVar2 = fVar.a;
                        File canonicalFile = ((File) n1rVar2.c.invoke()).getCanonicalFile();
                        synchronized (n1r.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = n1r.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            linkedHashSet.add(absolutePath);
                        }
                        return new g(canonicalFile, n1rVar2.a, (f8w) n1rVar2.b.invoke(canonicalFile), new sbc(27, canonicalFile));
                    default:
                        return ((g) fVar.j.getValue()).c;
                }
            }
        });
        this.l = new vcs0(tseVar, new d8(13, this), new yk(8), new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0058), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, ContinuationImpl continuationImpl) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        int i;
        g050 g050Var;
        int i2;
        fVar.getClass();
        try {
            if (continuationImpl instanceof DataStoreImpl$decrementCollector$1) {
                dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) continuationImpl;
                int i3 = dataStoreImpl$decrementCollector$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$decrementCollector$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$decrementCollector$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$decrementCollector$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = fVar.e;
                        dataStoreImpl$decrementCollector$1.L$0 = aVar;
                        dataStoreImpl$decrementCollector$1.label = 1;
                        if (aVar.a(dataStoreImpl$decrementCollector$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) dataStoreImpl$decrementCollector$1.L$0;
                        kotlin.b.b(obj);
                    }
                    i2 = fVar.f - 1;
                    fVar.f = i2;
                    if (i2 == 0) {
                        pzt0 pzt0Var = fVar.g;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        fVar.g = null;
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            i2 = fVar.f - 1;
            fVar.f = i2;
            if (i2 == 0) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(fVar, continuationImpl);
        Object obj2 = dataStoreImpl$decrementCollector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$decrementCollector$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, es10 es10Var, ContinuationImpl continuationImpl) {
        DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        int i;
        eyc eycVar;
        Throwable a;
        fVar.getClass();
        if (continuationImpl instanceof DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (DataStoreImpl$handleUpdate$1) continuationImpl;
            int i2 = dataStoreImpl$handleUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$handleUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataStoreImpl$handleUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$handleUpdate$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc fycVar = es10Var.b;
                    try {
                        fse plus = es10Var.d.plus(dataStoreImpl$handleUpdate$1.get_context());
                        DataStoreImpl$handleUpdate$2$1 dataStoreImpl$handleUpdate$2$1 = new DataStoreImpl$handleUpdate$2$1(fVar, es10Var, null);
                        dataStoreImpl$handleUpdate$1.L$0 = fycVar;
                        dataStoreImpl$handleUpdate$1.label = 1;
                        Object k0 = tje.k0(plus, dataStoreImpl$handleUpdate$2$1, dataStoreImpl$handleUpdate$1);
                        if (k0 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = k0;
                        eycVar = fycVar;
                    } catch (Throwable th) {
                        th = th;
                        eycVar = fycVar;
                        obj = new Result.Failure(th);
                        a = Result.a(obj);
                        fyc fycVar2 = (fyc) eycVar;
                        if (a != null) {
                        }
                        return zy11.a;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eycVar = (eyc) dataStoreImpl$handleUpdate$1.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        obj = new Result.Failure(th);
                        a = Result.a(obj);
                        fyc fycVar22 = (fyc) eycVar;
                        if (a != null) {
                        }
                        return zy11.a;
                    }
                }
                a = Result.a(obj);
                fyc fycVar222 = (fyc) eycVar;
                if (a != null) {
                    fycVar222.T(obj);
                } else {
                    fycVar222.j0(a);
                }
                return zy11.a;
            }
        }
        dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(fVar, continuationImpl);
        Object obj2 = dataStoreImpl$handleUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$handleUpdate$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        fyc fycVar2222 = (fyc) eycVar;
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(f fVar, ContinuationImpl continuationImpl) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        int i;
        g050 g050Var;
        int i2;
        fVar.getClass();
        try {
            if (continuationImpl instanceof DataStoreImpl$incrementCollector$1) {
                dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) continuationImpl;
                int i3 = dataStoreImpl$incrementCollector$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$incrementCollector$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$incrementCollector$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$incrementCollector$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = fVar.e;
                        dataStoreImpl$incrementCollector$1.L$0 = aVar;
                        dataStoreImpl$incrementCollector$1.label = 1;
                        if (aVar.a(dataStoreImpl$incrementCollector$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) dataStoreImpl$incrementCollector$1.L$0;
                        kotlin.b.b(obj);
                    }
                    i2 = fVar.f + 1;
                    fVar.f = i2;
                    if (i2 == 1) {
                        fVar.g = tje.N(fVar.c, null, null, new DataStoreImpl$incrementCollector$2$1(fVar, null), 3);
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            i2 = fVar.f + 1;
            fVar.f = i2;
            if (i2 == 1) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(fVar, continuationImpl);
        Object obj2 = dataStoreImpl$incrementCollector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$incrementCollector$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r2.b(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(f fVar, ContinuationImpl continuationImpl) {
        DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        int intValue;
        int i2;
        Throwable th;
        fVar.getClass();
        try {
            if (continuationImpl instanceof DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuationImpl;
                int i3 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f8w h = fVar.h();
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        obj = h.b(dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0;
                            try {
                                kotlin.b.b(obj);
                                return zy11.a;
                            } catch (Throwable th2) {
                                th = th2;
                                fVar.h.b(new nbi0(i2, th));
                                throw th;
                            }
                        }
                        kotlin.b.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    d dVar = fVar.i;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
                }
            }
            d dVar2 = fVar.i;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
        } catch (Throwable th3) {
            i2 = intValue;
            th = th3;
            fVar.h.b(new nbi0(i2, th));
            throw th;
        }
        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(fVar, continuationImpl);
        Object obj2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r11 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r11 == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        if (r11 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(f fVar, boolean z, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        int i;
        f3u0 a;
        boolean z2;
        Pair pair;
        wpg wpgVar = fVar.h;
        if (continuation instanceof DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (DataStoreImpl$readDataAndUpdateCache$1) continuation;
            int i2 = dataStoreImpl$readDataAndUpdateCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataStoreImpl$readDataAndUpdateCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$readDataAndUpdateCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = wpgVar.a();
                    if (a instanceof zv11) {
                        ny61.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    f8w h = fVar.h();
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = a;
                    dataStoreImpl$readDataAndUpdateCache$1.Z$0 = z;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 1;
                    obj = h.b(dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            pair = (Pair) obj;
                            f3u0 f3u0Var = (f3u0) pair.getFirst();
                            if (((Boolean) pair.getSecond()).booleanValue()) {
                            }
                            return f3u0Var;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        pair = (Pair) obj;
                        f3u0 f3u0Var2 = (f3u0) pair.getFirst();
                        if (((Boolean) pair.getSecond()).booleanValue()) {
                            wpgVar.b(f3u0Var2);
                        }
                        return f3u0Var2;
                    }
                    z = dataStoreImpl$readDataAndUpdateCache$1.Z$0;
                    a = (f3u0) dataStoreImpl$readDataAndUpdateCache$1.L$0;
                    kotlin.b.b(obj);
                }
                int intValue = ((Number) obj).intValue();
                z2 = a instanceof qng;
                int i3 = !z2 ? ((qng) a).a : -1;
                if (!z2 && intValue == i3) {
                    return a;
                }
                if (z) {
                    f8w h2 = fVar.h();
                    DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(fVar, i3, null);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 3;
                    obj = h2.d(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
                } else {
                    f8w h3 = fVar.h();
                    DataStoreImpl$readDataAndUpdateCache$3 dataStoreImpl$readDataAndUpdateCache$3 = new DataStoreImpl$readDataAndUpdateCache$3(fVar, null);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 2;
                    obj = h3.c(dataStoreImpl$readDataAndUpdateCache$3, dataStoreImpl$readDataAndUpdateCache$1);
                }
                return coroutineSingletons;
            }
        }
        dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(fVar, continuation);
        Object obj2 = dataStoreImpl$readDataAndUpdateCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$readDataAndUpdateCache$1.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = a instanceof qng;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005d, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:27:0x010e, B:29:0x011e, B:32:0x0123), top: B:26:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #1 {all -> 0x0147, blocks: (B:27:0x010e, B:29:0x011e, B:32:0x0123), top: B:26:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[Catch: CorruptionException -> 0x005d, TryCatch #0 {CorruptionException -> 0x005d, blocks: (B:36:0x0058, B:37:0x00e8, B:40:0x0062, B:41:0x00cd, B:56:0x0077, B:58:0x008f, B:59:0x0095, B:65:0x0080, B:68:0x00bc), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(f fVar, boolean z, ContinuationImpl continuationImpl) {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        Ref$ObjectRef ref$ObjectRef;
        CorruptionException corruptionException;
        T t;
        Ref$ObjectRef ref$ObjectRef2;
        CorruptionException corruptionException2;
        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3;
        Ref$IntRef ref$IntRef;
        Ref$ObjectRef ref$ObjectRef3;
        Object obj;
        Object b;
        boolean z2;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object d;
        Object obj5;
        fVar.getClass();
        if (continuationImpl instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) continuationImpl;
            int i2 = dataStoreImpl$readDataOrHandleCorruption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.label = i2 - Integer.MIN_VALUE;
                Object obj6 = dataStoreImpl$readDataOrHandleCorruption$1.result;
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (dataStoreImpl$readDataOrHandleCorruption$1.label) {
                    case 0:
                        kotlin.b.b(obj6);
                        if (!z) {
                            f8w h = fVar.h();
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 3;
                            Object b2 = h.b(dataStoreImpl$readDataOrHandleCorruption$1);
                            obj4 = b2;
                            if (b2 == obj7) {
                            }
                            int intValue = ((Number) obj4).intValue();
                            f8w h2 = fVar.h();
                            wls dataStoreImpl$readDataOrHandleCorruption$2 = new DataStoreImpl$readDataOrHandleCorruption$2(fVar, intValue, null);
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                            d = h2.d(dataStoreImpl$readDataOrHandleCorruption$2, dataStoreImpl$readDataOrHandleCorruption$1);
                            obj5 = d;
                            if (d == obj7) {
                            }
                            return (qng) obj5;
                        }
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 1;
                        Object i3 = fVar.i(dataStoreImpl$readDataOrHandleCorruption$1);
                        obj = i3;
                        if (i3 == obj7) {
                        }
                        int hashCode = obj == null ? obj.hashCode() : 0;
                        f8w h3 = fVar.h();
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = obj;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                        b = h3.b(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (b != obj7) {
                            int i4 = hashCode;
                            z2 = z;
                            i = i4;
                            obj2 = obj;
                            obj3 = b;
                            return new qng(obj2, i, ((Number) obj3).intValue());
                        }
                        return obj7;
                    case 1:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        kotlin.b.b(obj6);
                        obj = obj6;
                        if (obj == null) {
                        }
                        f8w h32 = fVar.h();
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = obj;
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 2;
                        b = h32.b(dataStoreImpl$readDataOrHandleCorruption$1);
                        if (b != obj7) {
                        }
                        return obj7;
                    case 2:
                        i = dataStoreImpl$readDataOrHandleCorruption$1.I$0;
                        z2 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        obj2 = dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            kotlin.b.b(obj6);
                            obj3 = obj6;
                            return new qng(obj2, i, ((Number) obj3).intValue());
                        } catch (CorruptionException e) {
                            e = e;
                            z = z2;
                            ref$ObjectRef = new Ref$ObjectRef();
                            zve zveVar = fVar.b;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$0 = e;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$1 = ref$ObjectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.L$2 = ref$ObjectRef;
                            dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$1.label = 5;
                            Object b3 = zveVar.b(e);
                            if (b3 != obj7) {
                                corruptionException = e;
                                t = b3;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef2.element = t;
                                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                try {
                                    dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(ref$ObjectRef, fVar, ref$IntRef2, null);
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$1 = ref$ObjectRef;
                                    dataStoreImpl$readDataOrHandleCorruption$1.L$2 = ref$IntRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                                    if ((!z ? dataStoreImpl$readDataOrHandleCorruption$3.invoke(dataStoreImpl$readDataOrHandleCorruption$1) : fVar.h().c(new DataStoreImpl$doWithWriteFileLock$2(dataStoreImpl$readDataOrHandleCorruption$3, null), dataStoreImpl$readDataOrHandleCorruption$1)) != obj7) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    ljo.a(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return obj7;
                        }
                    case 3:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        kotlin.b.b(obj6);
                        obj4 = obj6;
                        int intValue2 = ((Number) obj4).intValue();
                        f8w h22 = fVar.h();
                        wls dataStoreImpl$readDataOrHandleCorruption$22 = new DataStoreImpl$readDataOrHandleCorruption$2(fVar, intValue2, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 4;
                        d = h22.d(dataStoreImpl$readDataOrHandleCorruption$22, dataStoreImpl$readDataOrHandleCorruption$1);
                        obj5 = d;
                        if (d == obj7) {
                        }
                        return (qng) obj5;
                    case 4:
                        boolean z3 = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        kotlin.b.b(obj6);
                        obj5 = obj6;
                        return (qng) obj5;
                    case 5:
                        z = dataStoreImpl$readDataOrHandleCorruption$1.Z$0;
                        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        kotlin.b.b(obj6);
                        ref$ObjectRef2 = ref$ObjectRef4;
                        ref$ObjectRef = ref$ObjectRef5;
                        t = obj6;
                        ref$ObjectRef2.element = t;
                        Ref$IntRef ref$IntRef22 = new Ref$IntRef();
                        dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(ref$ObjectRef, fVar, ref$IntRef22, null);
                        dataStoreImpl$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$1 = ref$ObjectRef;
                        dataStoreImpl$readDataOrHandleCorruption$1.L$2 = ref$IntRef22;
                        dataStoreImpl$readDataOrHandleCorruption$1.label = 6;
                        if ((!z ? dataStoreImpl$readDataOrHandleCorruption$3.invoke(dataStoreImpl$readDataOrHandleCorruption$1) : fVar.h().c(new DataStoreImpl$doWithWriteFileLock$2(dataStoreImpl$readDataOrHandleCorruption$3, null), dataStoreImpl$readDataOrHandleCorruption$1)) != obj7) {
                            ref$IntRef = ref$IntRef22;
                            ref$ObjectRef3 = ref$ObjectRef;
                            T t2 = ref$ObjectRef3.element;
                            obj7 = new qng(t2, t2 != 0 ? t2.hashCode() : 0, ref$IntRef.element);
                        }
                        return obj7;
                    case 6:
                        ref$IntRef = (Ref$IntRef) dataStoreImpl$readDataOrHandleCorruption$1.L$2;
                        ref$ObjectRef3 = (Ref$ObjectRef) dataStoreImpl$readDataOrHandleCorruption$1.L$1;
                        corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$1.L$0;
                        try {
                            kotlin.b.b(obj6);
                            T t22 = ref$ObjectRef3.element;
                            obj7 = new qng(t22, t22 != 0 ? t22.hashCode() : 0, ref$IntRef.element);
                            return obj7;
                        } catch (Throwable th2) {
                            th = th2;
                            ljo.a(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(fVar, continuationImpl);
        Object obj62 = dataStoreImpl$readDataOrHandleCorruption$1.result;
        Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (dataStoreImpl$readDataOrHandleCorruption$1.label) {
        }
    }

    @Override // defpackage.tpg
    public final Object a(wls wlsVar, Continuation continuation) {
        d921 d921Var = (d921) continuation.get_context().get(x4c.V);
        if (d921Var != null) {
            d921Var.b(this);
        }
        return tje.k0(new d921(d921Var, this), new DataStoreImpl$updateData$2(this, wlsVar, null), continuation);
    }

    @Override // defpackage.tpg
    public final tpr getData() {
        return this.d;
    }

    public final f8w h() {
        return (f8w) this.k.getValue();
    }

    public final Object i(ContinuationImpl continuationImpl) {
        return ((g) this.j.getValue()).a(new StorageConnectionKt$readData$2(3, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, ContinuationImpl continuationImpl) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        int i;
        Ref$IntRef ref$IntRef;
        if (continuationImpl instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuationImpl;
            int i2 = dataStoreImpl$writeData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dataStoreImpl$writeData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$writeData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    g gVar = (g) this.j.getValue();
                    DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(ref$IntRef2, this, obj, z, null);
                    dataStoreImpl$writeData$1.L$0 = ref$IntRef2;
                    dataStoreImpl$writeData$1.label = 1;
                    if (gVar.b(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$IntRef = ref$IntRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$IntRef = (Ref$IntRef) dataStoreImpl$writeData$1.L$0;
                    kotlin.b.b(obj2);
                }
                return new Integer(ref$IntRef.element);
            }
        }
        dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuationImpl);
        Object obj22 = dataStoreImpl$writeData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$writeData$1.label;
        if (i != 0) {
        }
        return new Integer(ref$IntRef.element);
    }
}
