package xsna;

import java.util.Map;
import kotlin.Lazy;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FetchImageIconByCacheUseCase.kt */
/* loaded from: classes2.dex */
public final class q6r {
    public final Lazy a;
    public final Lazy b;
    public final bpn0 c = new bpn0(new xqf(this, 20));

    public q6r(bpn0 bpn0Var, bpn0 bpn0Var2) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
    }

    public static Object a(q6r q6rVar, do00 do00Var, ui50 ui50Var, Map map, int i, String str, SuspendLambda suspendLambda, int i2) {
        if ((i2 & 16) != 0) {
            str = null;
        }
        String str2 = str;
        boolean z = (i2 & 32) != 0;
        q6rVar.getClass();
        Object k = myc0.k(hqu0.b(), new n6r(i, do00Var, ui50Var, q6rVar, str2, z, map, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
