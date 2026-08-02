package xsna;

import com.vk.api.sdk.exceptions.RateLimitReachedException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: RateLimitReachedChainCall.kt */
/* loaded from: classes.dex */
public final class bxe0<T> extends ara<T> {
    public final String b;
    public final z1p0 c;
    public final ara<T> d;

    public bxe0(l7r0 l7r0Var, String str, z1p0 z1p0Var, n2p0 n2p0Var) {
        super(l7r0Var);
        this.b = str;
        this.c = z1p0Var;
        this.d = n2p0Var;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        z1p0 z1p0Var = this.c;
        String str = this.b;
        if (z1p0Var.b(str).i().longValue() > 0) {
            throw new RateLimitReachedException(str);
        }
        try {
            T a = this.d.a(zqaVar);
            vx5 vx5Var = z1p0Var.a;
            if (!vx5Var.a.containsKey(str)) {
                return a;
            }
            vx5Var.a.remove(str);
            return a;
        } catch (VKApiExecutionException e) {
            if (e.b0()) {
                z1p0Var.a(str, "RateLimitReached");
                b(e, "Rate limit reached.");
            }
            throw e;
        }
    }
}
