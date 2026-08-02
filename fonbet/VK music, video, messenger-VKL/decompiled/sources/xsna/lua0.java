package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;

/* compiled from: PlatformTextInputModifierNode.kt */
/* loaded from: classes11.dex */
public final class lua0 {
    public static final iyk0 a = new iyk0(a.i);

    /* compiled from: PlatformTextInputModifierNode.kt */
    public static final class a extends Lambda implements gzs<kra> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ kra invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(kua0 kua0Var, wzs wzsVar, ContinuationImpl continuationImpl) {
        mua0 mua0Var;
        int i;
        if (continuationImpl instanceof mua0) {
            mua0Var = (mua0) continuationImpl;
            int i2 = mua0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mua0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = mua0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mua0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!kua0Var.z().o) {
                        throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                    }
                    androidx.compose.ui.node.p g = itl.g(kua0Var);
                    kra kraVar = (kra) itl.f(kua0Var).C.a(a);
                    mua0Var.label = 1;
                    if (b(g, kraVar, wzsVar, mua0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        mua0Var = new mua0(continuationImpl);
        Object obj2 = mua0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mua0Var.label;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.u(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r6.a(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons b(androidx.compose.ui.node.p pVar, kra kraVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        nua0 nua0Var;
        int i;
        if (continuationImpl instanceof nua0) {
            nua0Var = (nua0) continuationImpl;
            int i2 = nua0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nua0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nua0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nua0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (kraVar == null) {
                        nua0Var.label = 1;
                    } else {
                        nua0Var.label = 2;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.a.a(obj);
                    throw new KotlinNothingValueException();
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                throw new KotlinNothingValueException();
            }
        }
        nua0Var = new nua0(continuationImpl);
        Object obj2 = nua0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nua0Var.label;
        if (i != 0) {
        }
    }
}
