package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.sdk.exceptions.RefreshFailCause;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: AccessTokenRefreshChainCall.kt */
/* loaded from: classes.dex */
public final class xj<T> extends dfg0<T> {
    public final l7r0 c;
    public final ara<T> d;

    public xj(int i, ara araVar, l7r0 l7r0Var) {
        super(l7r0Var, i);
        this.c = l7r0Var;
        this.d = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) {
        List<VKApiExecutionException> v;
        ara<T> araVar = this.d;
        l7r0 l7r0Var = this.c;
        int i = this.b;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                try {
                    return (l7r0Var.i().k() || !l7r0Var.i().l()) ? araVar.a(zqaVar) : (T) ((wj) l7r0Var.h.getValue()).b(araVar, zqaVar);
                } catch (VKWebAuthException e) {
                    if (!e.j()) {
                        throw e;
                    }
                    ((wj) l7r0Var.h.getValue()).a();
                    return (T) ((wj) l7r0Var.h.getValue()).b(araVar, zqaVar);
                } catch (RefreshFailCause.EmptyTokenLoggedUser e2) {
                    throw e2;
                } catch (RefreshFailCause.EmptyTokenUnloggedUser unused) {
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                } catch (VKApiExecutionException e3) {
                    if (!e3.K()) {
                        if (e3.W() && (v = e3.v()) != null) {
                            List<VKApiExecutionException> list = v;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    if (((VKApiExecutionException) it.next()).K()) {
                                    }
                                }
                            }
                        }
                        throw e3;
                    }
                    ((wj) l7r0Var.h.getValue()).a();
                    return (T) ((wj) l7r0Var.h.getValue()).b(araVar, zqaVar);
                }
            }
        }
        throw new VKApiException(lhg.a(i, "Can't refresh token due to retry limit. Limit = "));
    }
}
