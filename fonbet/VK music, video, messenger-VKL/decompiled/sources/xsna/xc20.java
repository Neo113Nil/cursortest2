package xsna;

import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MessageViewsUseCase.kt */
/* loaded from: classes2.dex */
public final class xc20 {
    public final rc20 a;

    public xc20(rc20 rc20Var) {
        this.a = rc20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, long j, ContinuationImpl continuationImpl) {
        vc20 vc20Var;
        int i2;
        if (continuationImpl instanceof vc20) {
            vc20Var = (vc20) continuationImpl;
            int i3 = vc20Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vc20Var.label = i3 - Integer.MIN_VALUE;
                vc20 vc20Var2 = vc20Var;
                Object obj = vc20Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = vc20Var2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    vc20Var2.I$0 = i;
                    vc20Var2.J$0 = j;
                    vc20Var2.label = 1;
                    obj = this.a.b(i, j, 0, 0, vc20Var2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return new Integer(((jc20) obj).a);
            }
        }
        vc20Var = new vc20(this, continuationImpl);
        vc20 vc20Var22 = vc20Var;
        Object obj2 = vc20Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = vc20Var22.label;
        if (i2 != 0) {
        }
        return new Integer(((jc20) obj2).a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, long j, int i2, ContinuationImpl continuationImpl) {
        wc20 wc20Var;
        CoroutineSingletons coroutineSingletons;
        int i3;
        int i4;
        long j2;
        int i5;
        Serializable a;
        jc20 jc20Var;
        if (continuationImpl instanceof wc20) {
            wc20Var = (wc20) continuationImpl;
            int i6 = wc20Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                wc20Var.label = i6 - Integer.MIN_VALUE;
                wc20 wc20Var2 = wc20Var;
                Object obj = wc20Var2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = wc20Var2.label;
                rc20 rc20Var = this.a;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    wc20Var2.I$0 = i;
                    wc20Var2.J$0 = j;
                    wc20Var2.I$1 = i2;
                    wc20Var2.label = 1;
                    obj = rc20Var.b(i, j, 50, i2, wc20Var2);
                    if (obj != coroutineSingletons) {
                        i4 = i;
                        j2 = j;
                        i5 = i2;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jc20Var = (jc20) wc20Var2.L$0;
                    kotlin.a.a(obj);
                    return new nc20(jc20Var.a, (List) obj);
                }
                i5 = wc20Var2.I$1;
                j2 = wc20Var2.J$0;
                i4 = wc20Var2.I$0;
                kotlin.a.a(obj);
                jc20 jc20Var2 = (jc20) obj;
                List<Long> list = jc20Var2.b;
                wc20Var2.L$0 = jc20Var2;
                wc20Var2.I$0 = i4;
                wc20Var2.J$0 = j2;
                wc20Var2.I$1 = i5;
                wc20Var2.label = 2;
                a = rc20Var.a(list, wc20Var2);
                if (a != coroutineSingletons) {
                    obj = a;
                    jc20Var = jc20Var2;
                    return new nc20(jc20Var.a, (List) obj);
                }
                return coroutineSingletons;
            }
        }
        wc20Var = new wc20(this, continuationImpl);
        wc20 wc20Var22 = wc20Var;
        Object obj2 = wc20Var22.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = wc20Var22.label;
        rc20 rc20Var2 = this.a;
        if (i3 != 0) {
        }
        jc20 jc20Var22 = (jc20) obj2;
        List<Long> list2 = jc20Var22.b;
        wc20Var22.L$0 = jc20Var22;
        wc20Var22.I$0 = i4;
        wc20Var22.J$0 = j2;
        wc20Var22.I$1 = i5;
        wc20Var22.label = 2;
        a = rc20Var2.a(list2, wc20Var22);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
