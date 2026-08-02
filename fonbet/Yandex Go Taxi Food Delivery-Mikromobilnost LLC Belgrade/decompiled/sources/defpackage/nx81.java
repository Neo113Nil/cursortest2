package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.ya0;

/* loaded from: classes7.dex */
public final class nx81 implements io71 {
    public final k371 a;

    public nx81(k371 k371Var) {
        this.a = k371Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.io71
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(View view, wr81 wr81Var, ContinuationImpl continuationImpl) {
        ya0 ya0Var;
        int i;
        if (continuationImpl instanceof ya0) {
            ya0Var = (ya0) continuationImpl;
            int i2 = ya0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ya0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = ya0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ya0Var.d;
                if (i != 0) {
                    b.b(obj);
                    Context context = view.getContext();
                    ya0Var.d = 1;
                    obj = this.a.a(context, wr81Var, ya0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new b391(true, (bk61) obj);
            }
        }
        ya0Var = new ya0(this, continuationImpl);
        Object obj2 = ya0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ya0Var.d;
        if (i != 0) {
        }
        return new b391(true, (bk61) obj2);
    }
}
