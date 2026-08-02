package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: AnonymousTokenChainCall.kt */
/* loaded from: classes.dex */
public final class wu2<T> extends dfg0<T> {
    public final ara<T> c;

    public wu2(ydq ydqVar, int i, ara araVar) {
        super(ydqVar, i);
        this.c = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        zu2 zu2Var = new zu2(this.a);
        int i = this.b;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                try {
                    zu2Var.b();
                    return this.c.a(zqaVar);
                } catch (VKApiExecutionException e) {
                    if (e.L()) {
                        zu2Var.d(true, e);
                    } else {
                        if (!e.M()) {
                            throw e;
                        }
                        zu2Var.d(false, e);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        throw new VKApiException("Can't confirm token due to retry limit!");
    }
}
