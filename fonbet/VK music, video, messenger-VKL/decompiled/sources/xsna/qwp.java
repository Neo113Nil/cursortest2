package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.api.sdk.utils.log.Logger;

/* compiled from: ErrorRetryChainCall.kt */
/* loaded from: classes.dex */
public final class qwp<T> extends dfg0<T> {
    public final ara<T> c;
    public final laq d;

    public qwp(int i, ara araVar, l7r0 l7r0Var) {
        super(l7r0Var, i);
        this.c = araVar;
        this.d = new laq(24, 1000L, 1.5f, 60000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.api.sdk.exceptions.VKInternalServerErrorException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.vk.api.sdk.exceptions.VKApiIllegalResponseException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.vk.api.sdk.exceptions.VKApiExecutionException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [xsna.d13] */
    /* JADX WARN: Type inference failed for: r2v19, types: [xsna.d13] */
    /* JADX WARN: Type inference failed for: r2v9, types: [xsna.d13] */
    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        ?? e = 0;
        while (true) {
            if (this.b >= 0 && this.d.h > this.b) {
                if (e == 0) {
                    throw new VKApiException("api-call failed due to retry limits, but no exception has tracked");
                }
                throw e;
            }
            if (this.d.d()) {
                Thread.sleep(this.d.g);
            }
            try {
                return this.c.a(zqaVar);
            } catch (VKApiExecutionException e2) {
                e = e2;
                if (!e.U() || e.B()) {
                    throw e;
                }
                this.a.a.i.a(Logger.LogLevel.WARNING, "", e);
                this.d.b();
            } catch (VKApiIllegalResponseException e3) {
                e = e3;
                this.a.a.i.a(Logger.LogLevel.WARNING, "", e);
                this.d.b();
            } catch (VKInternalServerErrorException e4) {
                e = e4;
                if (((Boolean) this.a.a.A.invoke()).booleanValue()) {
                    throw e;
                }
                this.a.a.i.a(Logger.LogLevel.WARNING, "", e);
                this.d.b();
            }
        }
        throw e;
    }
}
