package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: FetchMarkerIconUseCase.kt */
/* loaded from: classes2.dex */
public final class s6r {
    public static final a a = new a();
    public static final x500<w9g0> b = new x500<>(3);
    public static final wi50 c = bay.a();

    /* compiled from: FetchMarkerIconUseCase.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0050, B:15:0x006d, B:20:0x0065), top: B:11:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(int i, int i2, ContinuationImpl continuationImpl) {
            r6r r6rVar;
            int i3;
            ui50 ui50Var;
            w9g0 w9g0Var;
            try {
                if (continuationImpl instanceof r6r) {
                    r6rVar = (r6r) continuationImpl;
                    int i4 = r6rVar.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        r6rVar.label = i4 - Integer.MIN_VALUE;
                        Object obj = r6rVar.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = r6rVar.label;
                        if (i3 != 0) {
                            kotlin.a.a(obj);
                            wi50 wi50Var = s6r.c;
                            r6rVar.L$0 = wi50Var;
                            r6rVar.I$0 = i;
                            r6rVar.I$1 = i2;
                            r6rVar.I$2 = 0;
                            r6rVar.label = 1;
                            if (wi50Var.b(r6rVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ui50Var = wi50Var;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = r6rVar.I$1;
                            i = r6rVar.I$0;
                            ui50Var = (ui50) r6rVar.L$0;
                            kotlin.a.a(obj);
                        }
                        x500<w9g0> x500Var = s6r.b;
                        long j = (i << 32) | (i2 & 4294967295L);
                        w9g0Var = x500Var.get(j);
                        if (w9g0Var != null) {
                            w9g0Var = new w9g0(i, i2);
                            x500Var.put(j, w9g0Var);
                        }
                        return w9g0Var;
                    }
                }
                x500<w9g0> x500Var2 = s6r.b;
                long j2 = (i << 32) | (i2 & 4294967295L);
                w9g0Var = x500Var2.get(j2);
                if (w9g0Var != null) {
                }
                return w9g0Var;
            } finally {
                ui50Var.c(null);
            }
            r6rVar = new r6r(this, continuationImpl);
            Object obj2 = r6rVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = r6rVar.label;
            if (i3 != 0) {
            }
        }
    }

    public static Object a(int i, int i2, String str, boolean z, ContinuationImpl continuationImpl) {
        return myc0.k(hqu0.b(), new t6r(str, z, i, i2, null), continuationImpl);
    }
}
