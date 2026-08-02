package xsna;

import com.vk.api.sdk.utils.log.Logger;

/* compiled from: ChainCall.kt */
/* loaded from: classes.dex */
public abstract class ara<T> {
    public final l7r0 a;

    public ara(l7r0 l7r0Var) {
        this.a = l7r0Var;
    }

    public abstract T a(zqa zqaVar) throws Exception;

    public final void b(Exception exc, String str) {
        this.a.a.i.a(Logger.LogLevel.DEBUG, str, exc);
    }
}
