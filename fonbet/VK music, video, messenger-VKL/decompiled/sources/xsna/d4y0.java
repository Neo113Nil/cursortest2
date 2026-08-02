package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: XRetryCountChainCall.kt */
/* loaded from: classes.dex */
public final class d4y0<T> extends ara<T> {
    public final ara<T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d4y0(l7r0 l7r0Var, ara<? extends T> araVar) {
        super(l7r0Var);
        this.b = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        try {
            return this.b.a(zqaVar);
        } catch (VKApiExecutionException e) {
            zqaVar.l++;
            throw e;
        }
    }
}
