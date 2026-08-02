package xsna;

import com.vk.reefton.literx.sbjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReefBufferedErrorReporter.kt */
/* loaded from: classes5.dex */
public final class bnf0 {
    public final fnf0 a;
    public final bof0 b;
    public final PublishSubject<jnf0> c = new PublishSubject<>();
    public final AtomicInteger d = new AtomicInteger(0);

    public bnf0(fnf0 fnf0Var, bof0 bof0Var, b8h0 b8h0Var) {
        this.a = fnf0Var;
        this.b = bof0Var;
    }

    public final void a(Throwable th) {
        AtomicInteger atomicInteger = this.d;
        int i = atomicInteger.get();
        fnf0 fnf0Var = this.a;
        fnf0Var.getClass();
        if (i >= 100) {
            return;
        }
        atomicInteger.incrementAndGet();
        String th2 = th.toString();
        if (th.getStackTrace().length != 0) {
            th2 = pzl.b(th2, "\n\n", rl3.Z(th.getStackTrace(), "\n", null, null, null, 62));
        }
        String substring = th2.substring(0, 1024);
        long currentTimeMillis = System.currentTimeMillis();
        onf0 onf0Var = onf0.a;
        String clientId = fnf0Var.getClientId();
        onf0Var.getClass();
        this.c.onNext(new jnf0(substring, currentTimeMillis, onf0.a(clientId), fnf0Var.h(), fnf0Var.a(), fnf0Var.getAppId(), "8.188.1", fnf0Var.d(), fnf0Var.e().toString()));
    }
}
