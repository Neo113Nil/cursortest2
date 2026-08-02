package defpackage;

import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.q80;
import yads.ux0;

/* loaded from: classes7.dex */
public final class jn81 {
    public final b881 a;

    public jn81(b881 b881Var) {
        this.a = b881Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ux0 ux0Var;
        int i;
        Iterator it;
        if (continuationImpl instanceof ux0) {
            ux0Var = (ux0) continuationImpl;
            int i2 = ux0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ux0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = ux0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ux0Var.e;
                if (i != 0) {
                    b.b(obj);
                    ux0Var.b = str;
                    ux0Var.e = 1;
                    b881 b881Var = this.a;
                    obj = tje.k0(b881Var.d, new q80(b881Var, null), ux0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ux0Var.b;
                    b.b(obj);
                }
                it = ((vx71) obj).d.a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (jl40.l(((sk81) next).a, str)) {
                        return next;
                    }
                }
                return null;
            }
        }
        ux0Var = new ux0(this, continuationImpl);
        Object obj2 = ux0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ux0Var.e;
        if (i != 0) {
        }
        it = ((vx71) obj2).d.a.iterator();
        while (it.hasNext()) {
        }
        return null;
    }
}
