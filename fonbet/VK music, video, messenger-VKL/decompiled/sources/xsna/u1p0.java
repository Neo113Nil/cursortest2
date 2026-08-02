package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import kotlin.Pair;

/* compiled from: TokenConfirmationHandlerChainCall.kt */
/* loaded from: classes.dex */
public final class u1p0<T> extends dfg0<T> {
    public final wy2 c;
    public final ara<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public u1p0(wy2 wy2Var, int i, ara<? extends T> araVar) {
        super(wy2Var, i);
        this.c = wy2Var;
        this.d = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        int i = 0;
        int i2 = this.b;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                try {
                    return this.d.a(zqaVar);
                } catch (VKApiExecutionException e) {
                    if (!e.d0()) {
                        throw e;
                    }
                    i++;
                    new v1p0(this.c).a(e);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        m63.j(m63.c(), new Pair("token.confirmation.attempts", Integer.valueOf(i)));
        throw new VKApiException("Can't confirm token due to retry limit!");
    }
}
