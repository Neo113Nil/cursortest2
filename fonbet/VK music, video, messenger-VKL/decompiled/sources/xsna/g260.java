package xsna;

import android.util.MalformedJsonException;
import com.vk.api.internal.utils.NetworkBroadcastReceiver;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import java.io.IOException;
import kotlin.Pair;

/* compiled from: NetworkAwaitChainCall.kt */
/* loaded from: classes.dex */
public final class g260<T> extends ara<T> {
    public final ara<T> b;
    public final Object c;
    public final laq d;

    /* JADX WARN: Multi-variable type inference failed */
    public g260(wy2 wy2Var, ara<? extends T> araVar) {
        super(wy2Var);
        this.b = araVar;
        this.c = new Object();
        this.d = new laq(24, 500L, 1.5f, 60000L);
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        NetworkBroadcastReceiver.a(this.c);
        int i = 0;
        while (!Thread.interrupted()) {
            try {
                if (this.d.d()) {
                    b(null, "NetworkAwaitChainCall: Have to wait " + this.d.g);
                    synchronized (this.c) {
                        this.c.wait(this.d.g);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                return this.b.a(zqaVar);
            } catch (MalformedJsonException e) {
                throw e;
            } catch (VKLocalIOException e2) {
                throw e2;
            } catch (IOException e3) {
                i++;
                m63.a(m63.c(), "network.await.attempt", new Pair("network.await.number", Integer.valueOf(i)), new Pair("network.await.error", e3.getClass().getSimpleName()));
                if (Thread.interrupted()) {
                    throw new InterruptedException("request interrupted");
                }
                b(e3, "IOException during network call");
                this.d.b();
            }
        }
        throw new InterruptedException("request interrupted");
    }
}
