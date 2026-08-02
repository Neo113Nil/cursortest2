package androidx.datastore.core;

import defpackage.g050;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.wls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ g050 a;
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ f d;

    public c(g050 g050Var, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, f fVar) {
        this.a = g050Var;
        this.b = ref$BooleanRef;
        this.c = ref$ObjectRef;
        this.d = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r10.a(r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00ac, B:30:0x00b4), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d3, B:46:0x00da), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wls wlsVar, ContinuationImpl continuationImpl) {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        int i;
        g050 g050Var;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        f fVar;
        g050 g050Var2;
        g050 g050Var3;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        try {
            if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuationImpl;
                int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = wlsVar;
                        g050Var = this.a;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = g050Var;
                        ref$BooleanRef = this.b;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = ref$BooleanRef;
                        ref$ObjectRef = this.c;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = ref$ObjectRef;
                        fVar = this.d;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = fVar;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                                ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                                g050Var2 = (g050) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    t = obj2;
                                    ref$ObjectRef2.element = t;
                                    T t2 = ref$ObjectRef2.element;
                                    g050Var2.d(null);
                                    return t2;
                                } catch (Throwable th) {
                                    th = th;
                                    g050Var2.d(null);
                                    throw th;
                                }
                            }
                            fVar = (f) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                            ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                            g050Var3 = (g050) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                if (!jl40.l(obj, ref$ObjectRef2.element)) {
                                    g050Var2 = g050Var3;
                                    T t22 = ref$ObjectRef2.element;
                                    g050Var2.d(null);
                                    return t22;
                                }
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = g050Var3;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef2;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                                if (fVar.j(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutineSingletons) {
                                    t = obj;
                                    g050Var2 = g050Var3;
                                    ref$ObjectRef2.element = t;
                                    T t222 = ref$ObjectRef2.element;
                                    g050Var2.d(null);
                                    return t222;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var2 = g050Var3;
                                g050Var2.d(null);
                                throw th;
                            }
                        }
                        fVar = (f) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
                        Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
                        ref$BooleanRef = (Ref$BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                        g050 g050Var4 = (g050) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                        wls wlsVar2 = (wls) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                        kotlin.b.b(obj);
                        ref$ObjectRef = ref$ObjectRef3;
                        wlsVar = wlsVar2;
                        g050Var = g050Var4;
                    }
                    if (!ref$BooleanRef.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj3 = ref$ObjectRef.element;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = g050Var;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = fVar;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
                    Object invoke = wlsVar.invoke(obj3, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
                    if (invoke != coroutineSingletons) {
                        g050Var3 = g050Var;
                        obj = invoke;
                        ref$ObjectRef2 = ref$ObjectRef;
                        if (!jl40.l(obj, ref$ObjectRef2.element)) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (!ref$BooleanRef.element) {
            }
        } catch (Throwable th3) {
            th = th3;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuationImpl);
        Object obj4 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        if (i != 0) {
        }
    }
}
