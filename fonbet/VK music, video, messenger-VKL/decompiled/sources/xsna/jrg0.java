package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.rustore.sdk.pushclient.a.h;
import xsna.d5o0;

/* compiled from: RuStorePushInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class jrg0 implements grg0 {
    public final crg0 a;
    public final k100 b;

    public jrg0(crg0 crg0Var, k100 k100Var) {
        this.a = crg0Var;
        this.b = k100Var;
    }

    @Override // xsna.grg0
    public final void a() {
        h.b bVar = ru.rustore.sdk.pushclient.a.h.t;
        d5o0 d5o0Var = new d5o0();
        Pair pair = new Pair(d5o0Var, new d5o0.a());
        d5o0 d5o0Var2 = (d5o0) pair.d();
        myc0.h(ru.rustore.sdk.pushclient.a.h.v, wgl.c, null, new ru.rustore.sdk.pushclient.a.f((d5o0.a) pair.g(), null), 2);
        d5o0Var2.b(new c8(this, 28), null);
    }

    @Override // xsna.grg0
    public final void b(y310 y310Var) {
        d5o0 d5o0Var = new d5o0();
        Pair pair = new Pair(d5o0Var, new d5o0.a());
        d5o0 d5o0Var2 = (d5o0) pair.d();
        d5o0.a aVar = (d5o0.a) pair.g();
        h.b bVar = ru.rustore.sdk.pushclient.a.h.t;
        d5o0 d5o0Var3 = new d5o0();
        Pair pair2 = new Pair(d5o0Var3, new d5o0.a());
        d5o0 d5o0Var4 = (d5o0) pair2.d();
        myc0.h(ru.rustore.sdk.pushclient.a.h.v, wgl.c, null, new ru.rustore.sdk.pushclient.a.e((d5o0.a) pair2.g(), null), 2);
        d5o0Var4.b(new gs00(aVar, 8), null);
        d5o0Var4.b(null, new ac20(aVar, 14));
        d5o0Var2.b(new irg0(this, y310Var), null);
        d5o0Var2.b(null, new lh10(this, y310Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // xsna.grg0
    public final String getToken() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this.a.getToken();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        h.b bVar = ru.rustore.sdk.pushclient.a.h.t;
        d5o0 d5o0Var = new d5o0();
        Pair pair = new Pair(d5o0Var, new d5o0.a());
        d5o0 d5o0Var2 = (d5o0) pair.d();
        myc0.h(ru.rustore.sdk.pushclient.a.h.v, wgl.c, null, new ru.rustore.sdk.pushclient.a.g((d5o0.a) pair.g(), null), 2);
        d5o0Var2.b(new bc80() { // from class: xsna.hrg0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
            @Override // xsna.bc80
            public final void onSuccess(Object obj) {
                ?? r6 = (String) obj;
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                ref$ObjectRef2.element = r6;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{i5s.a(new StringBuilder("Fetching Rustore registration token="), (String) ref$ObjectRef2.element, " successful received!")});
                }
                this.a.b(r6);
                countDownLatch.countDown();
            }
        }, null);
        d5o0Var2.b(null, new ga40(countDownLatch, 8));
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"Fetching Rustore registration token failed " + th + '!'});
            }
        }
        return (String) ref$ObjectRef.element;
    }
}
