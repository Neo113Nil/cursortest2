package xsna;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.oup0;
import xsna.pvj;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes11.dex */
public final class hy3 implements mtk0<Object> {
    public final List<n4s> b;
    public final nup0 c;
    public final rz3 d;
    public final izs<oup0.b, s3q0> e;
    public final v82 f;
    public final wh50 g;
    public boolean h = true;

    public hy3(List list, Object obj, nup0 nup0Var, rz3 rz3Var, izs izsVar, v82 v82Var) {
        this.b = list;
        this.c = nup0Var;
        this.d = rz3Var;
        this.e = izsVar;
        this.f = v82Var;
        this.g = androidx.compose.runtime.k.b(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (xsna.n5y0.a(r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:16:0x006c, B:18:0x0078, B:25:0x009a, B:29:0x00c7, B:36:0x0054, B:39:0x0060), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:16:0x006c, B:18:0x0078, B:25:0x009a, B:29:0x00c7, B:36:0x0054, B:39:0x0060), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:16:0x006c, B:18:0x0078, B:25:0x009a, B:29:0x00c7, B:36:0x0054, B:39:0x0060), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:14:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d5 -> B:13:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        dy3 dy3Var;
        int i;
        izs<oup0.b, s3q0> izsVar;
        wh50 wh50Var;
        List<n4s> list;
        int size;
        int i2;
        n4s n4sVar;
        List<n4s> list2;
        try {
            if (continuationImpl instanceof dy3) {
                dy3Var = (dy3) continuationImpl;
                int i3 = dy3Var.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dy3Var.label = i3 - Integer.MIN_VALUE;
                    Object obj = dy3Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dy3Var.label;
                    izsVar = this.e;
                    wh50Var = this.g;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        list = this.b;
                        size = list.size();
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } else if (i == 1) {
                        size = dy3Var.I$1;
                        i2 = dy3Var.I$0;
                        n4s n4sVar2 = (n4s) dy3Var.L$1;
                        List<n4s> list3 = (List) dy3Var.L$0;
                        kotlin.a.a(obj);
                        n4sVar = n4sVar2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        size = dy3Var.I$1;
                        i2 = dy3Var.I$0;
                        list2 = (List) dy3Var.L$0;
                        kotlin.a.a(obj);
                        list = list2;
                        i2++;
                        if (i2 < size) {
                            n4s n4sVar3 = list.get(i2);
                            if (n4sVar3.a() == 2) {
                                rz3 rz3Var = this.d;
                                v82 v82Var = this.f;
                                ey3 ey3Var = new ey3(this, n4sVar3, null);
                                dy3Var.L$0 = list;
                                dy3Var.L$1 = n4sVar3;
                                dy3Var.I$0 = i2;
                                dy3Var.I$1 = size;
                                dy3Var.label = 1;
                                Object b = rz3Var.b(n4sVar3, v82Var, ey3Var, dy3Var);
                                if (b == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                list2 = list;
                                obj = b;
                                n4sVar = n4sVar3;
                                if (obj == null) {
                                    nup0 nup0Var = this.c;
                                    ((zak0) wh50Var).setValue(w5s.a(nup0Var.d, obj, n4sVar, nup0Var.b, nup0Var.c));
                                    return s3q0.a;
                                }
                                dy3Var.L$0 = list2;
                                dy3Var.L$1 = null;
                                dy3Var.I$0 = i2;
                                dy3Var.I$1 = size;
                                dy3Var.label = 2;
                            }
                            i2++;
                            if (i2 < size) {
                                boolean h = iyx.h(dy3Var.getContext());
                                this.h = false;
                                izsVar.invoke(new oup0.b(((zak0) wh50Var).getValue(), h));
                                return s3q0.a;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
            boolean h2 = iyx.h(dy3Var.getContext());
            this.h = false;
            izsVar.invoke(new oup0.b(((zak0) wh50Var).getValue(), h2));
        }
        dy3Var = new dy3(this, continuationImpl);
        Object obj2 = dy3Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dy3Var.label;
        izsVar = this.e;
        wh50Var = this.g;
    }

    @Override // xsna.mtk0
    public final Object getValue() {
        return ((zak0) this.g).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(n4s n4sVar, ContinuationImpl continuationImpl) {
        fy3 fy3Var;
        int i;
        try {
            if (continuationImpl instanceof fy3) {
                fy3Var = (fy3) continuationImpl;
                int i2 = fy3Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fy3Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = fy3Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fy3Var.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    kotlin.a.a(obj);
                    gy3 gy3Var = new gy3(this, n4sVar, null);
                    fy3Var.L$0 = n4sVar;
                    fy3Var.label = 1;
                    Object c = oxo0.c(15000L, gy3Var, fy3Var);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            if (!iyx.h(fy3Var.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            pvj pvjVar = (pvj) fy3Var.getContext().get(pvj.a.b);
            if (pvjVar != null) {
                pvjVar.handleException(fy3Var.getContext(), new IllegalStateException("Unable to load font " + n4sVar, e2));
            }
            return null;
        }
        fy3Var = new fy3(this, continuationImpl);
        Object obj2 = fy3Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fy3Var.label;
    }
}
