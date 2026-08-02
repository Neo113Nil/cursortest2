package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wjy;

/* compiled from: KnetInitializer.kt */
/* loaded from: classes.dex */
public final class dky implements gzs<s3q0> {
    public final Context b;
    public final m7y0 c;
    public final py70 d;
    public final s73 e;
    public final t260 f;
    public final ejv g;

    /* compiled from: KnetInitializer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<KnetExecutorType> {
        @Override // xsna.gzs
        public final KnetExecutorType invoke() {
            KnetExecutorType invoke;
            KnetExecutorType[] knetExecutorTypeArr;
            com.vk.httpexecutor.core.knet.a aVar = (com.vk.httpexecutor.core.knet.a) this.receiver;
            KnetExecutorType knetExecutorType = aVar.b;
            if (knetExecutorType != null) {
                return knetExecutorType;
            }
            synchronized (aVar) {
                invoke = aVar.a.invoke();
                if (invoke == null) {
                    b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_NET_PROTOCOL_TYPE);
                    String obj = i != null ? i.c.toString() : null;
                    KnetExecutorType.Companion.getClass();
                    knetExecutorTypeArr = KnetExecutorType.VALUES;
                    int length = knetExecutorTypeArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            invoke = null;
                            break;
                        }
                        KnetExecutorType knetExecutorType2 = knetExecutorTypeArr[i2];
                        if (epx.f(knetExecutorType2.getId(), obj)) {
                            invoke = knetExecutorType2;
                            break;
                        }
                        i2++;
                    }
                    if (invoke == null) {
                        invoke = KnetExecutorType.OKHTTP;
                    }
                }
                aVar.b = invoke;
            }
            return invoke;
        }
    }

    /* compiled from: KnetInitializer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<String> {
        @Override // xsna.gzs
        public final String invoke() {
            return ((tdp) this.receiver).getPrefix();
        }
    }

    public dky(Context context, m7y0 m7y0Var, py70 py70Var, s73 s73Var, t260 t260Var, ejv ejvVar) {
        this.b = context;
        this.c = m7y0Var;
        this.d = py70Var;
        this.e = s73Var;
        this.f = t260Var;
        this.g = ejvVar;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public final void a() {
        File file = new File(this.b.getFilesDir() + "/network_internal");
        File file2 = new File(this.b.getFilesDir() + "/network_netlog");
        com.vk.httpexecutor.core.knet.a aVar = new com.vk.httpexecutor.core.knet.a(new rxv(this, 1));
        tdp tdpVar = new tdp();
        Context context = this.b;
        aky akyVar = this.f.a;
        ikv ikvVar = new ikv(context, akyVar.a, akyVar.b);
        Context context2 = this.b;
        boolean z = !BuildInfo.m();
        NetworkClient.a.C1087a c1087a = this.f.b.d;
        wjy.a.C3937a c3937a = new wjy.a.C3937a(c1087a.c, new zkv(c1087a, 2));
        fky fkyVar = new fky(this.e.a());
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        String a2 = o260Var.l.a();
        q360 q360Var = this.f.w;
        a aVar2 = new a(0, aVar, com.vk.httpexecutor.core.knet.a.class, "provide", "provide()Lcom/vk/httpexecutor/core/knet/KnetExecutorType;", 0);
        boolean z2 = this.f.d.k;
        asu0.a.getClass();
        ExecutorService q = asu0.q();
        wrk0 wrk0Var = new wrk0(this.d);
        t260 t260Var = this.f;
        aky akyVar2 = t260Var.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        wjy.a.c cVar = new wjy.a.c(timeUnit.toMillis(t260Var.d.f), timeUnit.toMillis(this.f.d.g), timeUnit.toMillis(this.f.d.g));
        m7y0 m7y0Var = this.c;
        t260 t260Var2 = this.f;
        boolean z3 = t260Var2.b.a;
        Set<String> value = t260Var2.e.e.getValue();
        Set<String> value2 = this.f.e.f.getValue();
        izs<String, s3q0> izsVar = this.f.e.g;
        b bVar = new b(0, tdpVar, tdp.class, "getPrefix", "getPrefix()Ljava/lang/String;", 0);
        ejv ejvVar = this.g;
        int intValue = this.f.e.c.invoke().intValue();
        t260 t260Var3 = this.f;
        v62 v62Var = t260Var3.n;
        wjy.a.b bVar2 = t260Var3.o;
        boolean z4 = t260Var3.q;
        Executor executor = t260Var3.r;
        xb3 xb3Var = t260Var3.u;
        bpn0 bpn0Var = t260Var3.v;
        bpn0 bpn0Var2 = t260Var3.e.h;
        kek kekVar = t260Var3.x;
        int i = 0;
        wjy.a aVar3 = new wjy.a(context2, z, c3937a, file, file2, a2, q360Var, aVar2, new jb3(this, 2), new bky(this, i), z2, q, fkyVar, wrk0Var, ikvVar, akyVar2, bVar, cVar, m7y0Var, z3, intValue, value, value2, izsVar, ejvVar, v62Var, bVar2, z4, executor, xb3Var, bpn0Var2, bpn0Var, kekVar.a, kekVar.b);
        asu0.n().execute(new cky(i, file2, this));
        wjy wjyVar = wjy.a;
        synchronized (wjyVar) {
            wjy.c = aVar3;
            if (wjy.b == null) {
                wjy.b = wjyVar.a(aVar3);
            }
        }
        je5 je5Var = new je5(this, 1);
        ap apVar = yjy.a;
        ap apVar2 = new ap(this, 2);
        eky ekyVar = new eky(0, wjyVar, wjy.class, "get", "get()Lcom/vk/knet/core/Knet;", 0);
        ox4 ox4Var = new ox4(4);
        ReentrantLock reentrantLock = yjy.e;
        reentrantLock.lockInterruptibly();
        try {
            yjy.a = apVar2;
            yjy.b = ekyVar;
            yjy.c = je5Var;
            yjy.d = ox4Var;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ s3q0 invoke() {
        a();
        return s3q0.a;
    }
}
