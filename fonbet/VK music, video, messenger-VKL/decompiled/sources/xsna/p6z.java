package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: LikeScaleAnimator.kt */
/* loaded from: classes18.dex */
public final class p6z {
    public final if2<Float, sq2> a;
    public final wh50 b;

    public p6z() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        if (r14 != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        n6z n6zVar;
        n6z n6zVar2;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f;
        if2<Float, sq2> if2Var;
        Float f2;
        dtp0 d;
        float f3;
        try {
            if (continuationImpl instanceof n6z) {
                n6zVar = (n6z) continuationImpl;
                int i2 = n6zVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    n6zVar.label = i2 - Integer.MIN_VALUE;
                    n6zVar2 = n6zVar;
                    Object obj = n6zVar2.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = n6zVar2.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                            return s3q0.a;
                        }
                        c(true);
                        if2<Float, sq2> if2Var2 = this.a;
                        Float f4 = new Float(1.0f);
                        n6zVar2.L$0 = null;
                        n6zVar2.F$0 = 1.0f;
                        n6zVar2.label = 1;
                        if (if2Var2.e(f4, n6zVar2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f = 1.0f;
                    } else if (i == 1) {
                        float f5 = n6zVar2.F$0;
                        kotlin.a.a(obj);
                        f = f5;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            c(false);
                            return s3q0.a;
                        }
                        f3 = n6zVar2.F$0;
                        kotlin.a.a(obj);
                        if2<Float, sq2> if2Var3 = this.a;
                        Float f6 = new Float(1.0f);
                        dtp0 d2 = jq2.d((int) (170 * f3), 0, null, 6);
                        n6zVar2.L$0 = null;
                        n6zVar2.F$0 = f3;
                        n6zVar2.label = 3;
                        obj = if2.c(if2Var3, f6, d2, null, n6zVar2, 12);
                    }
                    if2Var = this.a;
                    f2 = new Float(0.8f);
                    d = jq2.d((int) (170 * f), 0, null, 6);
                    n6zVar2.L$0 = null;
                    n6zVar2.F$0 = f;
                    n6zVar2.label = 2;
                    if (if2.c(if2Var, f2, d, null, n6zVar2, 12) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f3 = f;
                    if2<Float, sq2> if2Var32 = this.a;
                    Float f62 = new Float(1.0f);
                    dtp0 d22 = jq2.d((int) (170 * f3), 0, null, 6);
                    n6zVar2.L$0 = null;
                    n6zVar2.F$0 = f3;
                    n6zVar2.label = 3;
                    obj = if2.c(if2Var32, f62, d22, null, n6zVar2, 12);
                }
            }
            if (i != 0) {
            }
            if2Var = this.a;
            f2 = new Float(0.8f);
            d = jq2.d((int) (170 * f), 0, null, 6);
            n6zVar2.L$0 = null;
            n6zVar2.F$0 = f;
            n6zVar2.label = 2;
            if (if2.c(if2Var, f2, d, null, n6zVar2, 12) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            c(false);
            throw th;
        }
        n6zVar = new n6z(this, continuationImpl);
        n6zVar2 = n6zVar;
        Object obj2 = n6zVar2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = n6zVar2.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
    
        if (r0 != r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(float f, ContinuationImpl continuationImpl) {
        o6z o6zVar;
        o6z o6zVar2;
        CoroutineSingletons coroutineSingletons;
        int i;
        float f2;
        float f3;
        if2<Float, sq2> if2Var;
        Float f4;
        dtp0 d;
        float f5;
        float f6;
        if2<Float, sq2> if2Var2;
        Float f7;
        dtp0 d2;
        float f8;
        if2<Float, sq2> if2Var3;
        Float f9;
        dtp0 d3;
        float f10;
        float f11;
        try {
            if (continuationImpl instanceof o6z) {
                o6zVar = (o6z) continuationImpl;
                int i2 = o6zVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o6zVar.label = i2 - Integer.MIN_VALUE;
                    o6zVar2 = o6zVar;
                    Object obj = o6zVar2.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = o6zVar2.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                            return s3q0.a;
                        }
                        c(true);
                        if2<Float, sq2> if2Var4 = this.a;
                        Float f12 = new Float(1.0f);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f;
                        o6zVar2.F$1 = 1.0f;
                        o6zVar2.label = 1;
                        if (if2Var4.e(f12, o6zVar2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f2 = f;
                        f3 = 1.0f;
                    } else if (i == 1) {
                        f3 = o6zVar2.F$1;
                        float f13 = o6zVar2.F$0;
                        kotlin.a.a(obj);
                        f2 = f13;
                    } else if (i == 2) {
                        float f14 = o6zVar2.F$1;
                        float f15 = o6zVar2.F$0;
                        kotlin.a.a(obj);
                        f6 = f14;
                        f5 = f15;
                        if2Var2 = this.a;
                        f7 = new Float(0.91f);
                        d2 = jq2.d((int) (VersionConstants.PRODUCT_MAJOR_VERSION * f6), 0, null, 6);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f5;
                        o6zVar2.F$1 = f6;
                        o6zVar2.label = 3;
                        f8 = f5;
                        if (if2.c(if2Var2, f7, d2, null, o6zVar2, 12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if2Var3 = this.a;
                        f9 = new Float(1.03f);
                        d3 = jq2.d((int) (165 * f6), 0, null, 6);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f8;
                        o6zVar2.F$1 = f6;
                        o6zVar2.label = 4;
                        if (if2.c(if2Var3, f9, d3, null, o6zVar2, 12) == coroutineSingletons) {
                        }
                    } else if (i == 3) {
                        float f16 = o6zVar2.F$1;
                        float f17 = o6zVar2.F$0;
                        kotlin.a.a(obj);
                        f6 = f16;
                        f8 = f17;
                        if2Var3 = this.a;
                        f9 = new Float(1.03f);
                        d3 = jq2.d((int) (165 * f6), 0, null, 6);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f8;
                        o6zVar2.F$1 = f6;
                        o6zVar2.label = 4;
                        if (if2.c(if2Var3, f9, d3, null, o6zVar2, 12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        f10 = f6;
                        f11 = f8;
                        if2<Float, sq2> if2Var5 = this.a;
                        Float f18 = new Float(1.0f);
                        dtp0 d4 = jq2.d((int) (100 * f10), 0, null, 6);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f11;
                        o6zVar2.F$1 = f10;
                        o6zVar2.label = 5;
                        obj = if2.c(if2Var5, f18, d4, null, o6zVar2, 12);
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            c(false);
                            return s3q0.a;
                        }
                        f10 = o6zVar2.F$1;
                        f11 = o6zVar2.F$0;
                        kotlin.a.a(obj);
                        if2<Float, sq2> if2Var52 = this.a;
                        Float f182 = new Float(1.0f);
                        dtp0 d42 = jq2.d((int) (100 * f10), 0, null, 6);
                        o6zVar2.L$0 = null;
                        o6zVar2.F$0 = f11;
                        o6zVar2.F$1 = f10;
                        o6zVar2.label = 5;
                        obj = if2.c(if2Var52, f182, d42, null, o6zVar2, 12);
                    }
                    if2Var = this.a;
                    f4 = new Float(f2);
                    d = jq2.d((int) (75 * f3), 0, null, 6);
                    o6zVar2.L$0 = null;
                    o6zVar2.F$0 = f2;
                    o6zVar2.F$1 = f3;
                    o6zVar2.label = 2;
                    float f19 = f3;
                    if (if2.c(if2Var, f4, d, null, o6zVar2, 12) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f5 = f2;
                    f6 = f19;
                    if2Var2 = this.a;
                    f7 = new Float(0.91f);
                    d2 = jq2.d((int) (VersionConstants.PRODUCT_MAJOR_VERSION * f6), 0, null, 6);
                    o6zVar2.L$0 = null;
                    o6zVar2.F$0 = f5;
                    o6zVar2.F$1 = f6;
                    o6zVar2.label = 3;
                    f8 = f5;
                    if (if2.c(if2Var2, f7, d2, null, o6zVar2, 12) == coroutineSingletons) {
                    }
                    if2Var3 = this.a;
                    f9 = new Float(1.03f);
                    d3 = jq2.d((int) (165 * f6), 0, null, 6);
                    o6zVar2.L$0 = null;
                    o6zVar2.F$0 = f8;
                    o6zVar2.F$1 = f6;
                    o6zVar2.label = 4;
                    if (if2.c(if2Var3, f9, d3, null, o6zVar2, 12) == coroutineSingletons) {
                    }
                }
            }
            if (i != 0) {
            }
            if2Var = this.a;
            f4 = new Float(f2);
            d = jq2.d((int) (75 * f3), 0, null, 6);
            o6zVar2.L$0 = null;
            o6zVar2.F$0 = f2;
            o6zVar2.F$1 = f3;
            o6zVar2.label = 2;
            float f192 = f3;
            if (if2.c(if2Var, f4, d, null, o6zVar2, 12) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            c(false);
            throw th;
        }
        o6zVar = new o6z(this, continuationImpl);
        o6zVar2 = o6zVar;
        Object obj2 = o6zVar2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o6zVar2.label;
    }

    public final void c(boolean z) {
        ((zak0) this.b).setValue(Boolean.valueOf(z));
    }

    public p6z(int i) {
        this.a = qf2.a(1.0f);
        this.b = androidx.compose.runtime.k.b(Boolean.FALSE);
    }
}
