package androidx.compose.ui.text.font;

import defpackage.cmm0;
import defpackage.hb3;
import defpackage.hz40;
import defpackage.i1x0;
import defpackage.ib3;
import defpackage.mzz;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yxr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final mzz a = new mzz(16);
    public final hz40 b = cmm0.b();
    public final i1x0 c = new i1x0();

    public static void a(c cVar, yxr yxrVar, a aVar, Object obj) {
        cVar.getClass();
        aVar.getClass();
        ib3 ib3Var = new ib3(yxrVar);
        synchronized (cVar.c) {
            try {
                if (obj == null) {
                    cVar.b.o(ib3Var, new hb3(null));
                } else {
                    cVar.a.d(ib3Var, new hb3(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(yxr yxrVar, a aVar, tls tlsVar, ContinuationImpl continuationImpl) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        int i;
        boolean z;
        ib3 ib3Var;
        if (continuationImpl instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) continuationImpl;
            int i2 = asyncTypefaceCache$runCached$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.label = i2 - Integer.MIN_VALUE;
                Object obj = asyncTypefaceCache$runCached$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = asyncTypefaceCache$runCached$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.getClass();
                    ib3 ib3Var2 = new ib3(yxrVar);
                    synchronized (this.c) {
                        try {
                            hb3 hb3Var = (hb3) this.a.c(ib3Var2);
                            if (hb3Var == null) {
                                hb3Var = (hb3) this.b.d(ib3Var2);
                            }
                            if (hb3Var != null) {
                                return hb3Var.a;
                            }
                            asyncTypefaceCache$runCached$1.L$0 = ib3Var2;
                            z = false;
                            asyncTypefaceCache$runCached$1.Z$0 = false;
                            asyncTypefaceCache$runCached$1.label = 1;
                            Object invoke = ((AsyncFontListLoader$load$2$typeface$1) tlsVar).invoke(asyncTypefaceCache$runCached$1);
                            if (invoke == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = invoke;
                            ib3Var = ib3Var2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = asyncTypefaceCache$runCached$1.Z$0;
                    ib3Var = (ib3) asyncTypefaceCache$runCached$1.L$0;
                    kotlin.b.b(obj);
                }
                synchronized (this.c) {
                    try {
                        if (obj == null) {
                            this.b.o(ib3Var, new hb3(obj2));
                        } else if (z) {
                            this.b.o(ib3Var, new hb3(obj));
                        } else {
                            this.a.d(ib3Var, new hb3(obj));
                        }
                    } finally {
                    }
                }
                return obj;
            }
        }
        asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, continuationImpl);
        Object obj3 = asyncTypefaceCache$runCached$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncTypefaceCache$runCached$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        synchronized (this.c) {
        }
    }
}
