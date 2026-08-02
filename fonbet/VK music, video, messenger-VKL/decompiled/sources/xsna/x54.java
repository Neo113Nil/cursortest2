package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AttachedClipsNetworkApiImpl.kt */
/* loaded from: classes7.dex */
public final class x54 implements q54 {
    public final uft0 a;
    public final ngj0 b;

    public x54(uft0 uft0Var, ngj0 ngj0Var) {
        this.a = uft0Var;
        this.b = ngj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.q54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        r54 r54Var;
        int i2;
        if (continuationImpl instanceof r54) {
            r54Var = (r54) continuationImpl;
            int i3 = r54Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r54Var.label = i3 - Integer.MIN_VALUE;
                Object obj = r54Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = r54Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    s54 s54Var = new s54(this, userId, i, str, null);
                    r54Var.L$0 = null;
                    r54Var.L$1 = null;
                    r54Var.I$0 = i;
                    r54Var.label = 1;
                    obj = myc0.k(b, s54Var, r54Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        r54Var = new r54(this, continuationImpl);
        Object obj2 = r54Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = r54Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.q54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, UserId userId, ArrayList arrayList, ContinuationImpl continuationImpl) {
        v54 v54Var;
        int i2;
        if (continuationImpl instanceof v54) {
            v54Var = (v54) continuationImpl;
            int i3 = v54Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v54Var.label = i3 - Integer.MIN_VALUE;
                Object obj = v54Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = v54Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    w54 w54Var = new w54(this, i, userId, arrayList, null);
                    v54Var.L$0 = null;
                    v54Var.L$1 = null;
                    v54Var.I$0 = i;
                    v54Var.label = 1;
                    obj = myc0.k(b, w54Var, v54Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        v54Var = new v54(this, continuationImpl);
        Object obj2 = v54Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = v54Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.q54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        t54 t54Var;
        int i;
        if (continuationImpl instanceof t54) {
            t54Var = (t54) continuationImpl;
            int i2 = t54Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t54Var.label = i2 - Integer.MIN_VALUE;
                Object obj = t54Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = t54Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    u54 u54Var = new u54(this, str, null);
                    t54Var.L$0 = null;
                    t54Var.label = 1;
                    obj = myc0.k(b, u54Var, t54Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        t54Var = new t54(this, continuationImpl);
        Object obj2 = t54Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = t54Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
