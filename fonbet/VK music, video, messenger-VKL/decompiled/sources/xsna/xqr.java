package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.o2d0;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes11.dex */
public final class xqr {
    public float a;
    public float b;
    public float c;
    public float d;
    public final if2<pco, sq2> e;
    public vax f;
    public vax g;

    public xqr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new if2<>(new pco(f), rte0.g, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, xsna.vax] */
    /* JADX WARN: Type inference failed for: r6v1, types: [xsna.vax] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, xsna.s3q0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vax vaxVar, ContinuationImpl continuationImpl) {
        vqr vqrVar;
        int i;
        vax vaxVar2;
        if2<pco, sq2> if2Var = this.e;
        try {
            if (continuationImpl instanceof vqr) {
                vqrVar = (vqr) continuationImpl;
                int i2 = vqrVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vqrVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = vqrVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = vqrVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        float f = vaxVar instanceof o2d0.b ? this.b : vaxVar instanceof lgv ? this.c : vaxVar instanceof pvr ? this.d : this.a;
                        this.g = vaxVar;
                        vaxVar2 = vaxVar;
                        if (!pco.b(((pco) ((zak0) if2Var.e).getValue()).b, f)) {
                            vax vaxVar3 = this.f;
                            vqrVar.L$0 = vaxVar;
                            vqrVar.label = 1;
                            Object a = ebp.a(if2Var, f, vaxVar3, vaxVar, vqrVar);
                            vaxVar2 = vaxVar;
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vax vaxVar4 = (vax) vqrVar.L$0;
                        kotlin.a.a(obj);
                        vaxVar2 = vaxVar4;
                    }
                    this.f = vaxVar2;
                    vaxVar = s3q0.a;
                    return vaxVar;
                }
            }
            if (i != 0) {
            }
            this.f = vaxVar2;
            vaxVar = s3q0.a;
            return vaxVar;
        } catch (Throwable th) {
            this.f = vaxVar;
            throw th;
        }
        vqrVar = new vqr(this, continuationImpl);
        Object obj2 = vqrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vqrVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        wqr wqrVar;
        int i;
        try {
            if (continuationImpl instanceof wqr) {
                wqrVar = (wqr) continuationImpl;
                int i2 = wqrVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wqrVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = wqrVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = wqrVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        vax vaxVar = this.g;
                        float f = vaxVar instanceof o2d0.b ? this.b : vaxVar instanceof lgv ? this.c : vaxVar instanceof pvr ? this.d : this.a;
                        if2<pco, sq2> if2Var = this.e;
                        if (!pco.b(((pco) ((zak0) if2Var.e).getValue()).b, f)) {
                            pco pcoVar = new pco(f);
                            wqrVar.label = 1;
                            if (if2Var.e(pcoVar, wqrVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return s3q0.a;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            return s3q0.a;
        } finally {
            this.f = this.g;
        }
        wqrVar = new wqr(this, continuationImpl);
        Object obj2 = wqrVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wqrVar.label;
    }
}
