package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WaveAnimationHelper.kt */
/* loaded from: classes3.dex */
public final class jdx0 {
    public final List<kg50> a;

    /* JADX WARN: Multi-variable type inference failed */
    public jdx0(List<? extends kg50> list) {
        this.a = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (xsna.qsl.b(100, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (xsna.qsl.b(200, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (xsna.qsl.b(30, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0086 -> B:18:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        idx0 idx0Var;
        int i;
        int i2;
        int size;
        if (continuationImpl instanceof idx0) {
            idx0Var = (idx0) continuationImpl;
            int i3 = idx0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                idx0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = idx0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = idx0Var.label;
                List<kg50> list = this.a;
                if (i != 0) {
                    kotlin.a.a(obj);
                    idx0Var.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return s3q0.a;
                        }
                        size = idx0Var.I$1;
                        i2 = idx0Var.I$0;
                        kotlin.a.a(obj);
                        i2++;
                        if (i2 < size) {
                            int i4 = i2 - 2;
                            kg50 kg50Var = (kg50) j5g.b0(i4, list);
                            if (kg50Var != null) {
                                kg50Var.g(1.0f);
                            }
                            kg50 kg50Var2 = (kg50) j5g.b0(i2, list);
                            if (kg50Var2 != null) {
                                kg50Var2.g(0.8f);
                            }
                            idx0Var.I$0 = i2;
                            idx0Var.I$1 = size;
                            idx0Var.I$2 = i4;
                            idx0Var.label = 2;
                        } else {
                            idx0Var.label = 3;
                        }
                        return coroutineSingletons;
                    }
                    kotlin.a.a(obj);
                }
                i2 = 0;
                size = list.size() + 2;
                if (i2 < size) {
                }
                return coroutineSingletons;
            }
        }
        idx0Var = new idx0(this, continuationImpl);
        Object obj2 = idx0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = idx0Var.label;
        List<kg50> list2 = this.a;
        if (i != 0) {
        }
        i2 = 0;
        size = list2.size() + 2;
        if (i2 < size) {
        }
        return coroutineSingletons2;
    }
}
