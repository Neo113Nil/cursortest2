package xsna;

import android.os.SystemClock;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: NetworkFetchProducer.java */
/* loaded from: classes12.dex */
public final class i360 implements thd0<rip> {
    public final b320 a;
    public final ut8 b;
    public final oi6 c;

    /* compiled from: NetworkFetchProducer.java */
    public class a {
        public final /* synthetic */ u6r a;

        public a(u6r u6rVar) {
            this.a = u6rVar;
        }

        public final void a() {
            u6r u6rVar = this.a;
            u6rVar.b.q().g(u6rVar.b, "NetworkFetchProducer");
            u6rVar.a.a();
        }

        public final void b(Throwable th) {
            u6r u6rVar = this.a;
            yhd0 q = u6rVar.b.q();
            uhd0 uhd0Var = u6rVar.b;
            q.b(uhd0Var, "NetworkFetchProducer", th, null);
            uhd0Var.q().e(uhd0Var, "NetworkFetchProducer", false);
            uhd0Var.t("network");
            u6rVar.a.onFailure(th);
        }

        public final void c(InputStream inputStream, int i) throws IOException {
            MemoryPooledByteBufferOutputStream b;
            u6r u6rVar;
            if (lhs.d()) {
                lhs.a("NetworkFetcher->onResponse");
            }
            i360 i360Var = i360.this;
            oi6 oi6Var = i360Var.c;
            b320 b320Var = i360Var.a;
            ut8 ut8Var = i360Var.b;
            if (i > 0) {
                b320Var.getClass();
                b = new MemoryPooledByteBufferOutputStream(b320Var.a, i);
            } else {
                b = b320Var.b();
            }
            byte[] bArr = ut8Var.get(16384);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    u6rVar = this.a;
                    if (read < 0) {
                        break;
                    }
                    if (read > 0) {
                        b.write(bArr, 0, read);
                        uhd0 uhd0Var = u6rVar.b;
                        l7j<rip> l7jVar = u6rVar.a;
                        if (uhd0Var.n().b() != null && uhd0Var.o()) {
                            oi6Var.getClass();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (uptimeMillis - u6rVar.c >= 100) {
                                u6rVar.c = uptimeMillis;
                                uhd0Var.q().j(uhd0Var);
                                i360.d(b, 0, l7jVar);
                            }
                        }
                        l7jVar.c(i > 0 ? b.e / i : 1.0f - ((float) Math.exp((-r8) / 50000.0d)));
                    }
                } catch (Throwable th) {
                    ut8Var.a(bArr);
                    b.close();
                    throw th;
                }
            }
            oi6Var.d(u6rVar);
            i360Var.c(b, u6rVar);
            ut8Var.a(bArr);
            b.close();
            if (lhs.d()) {
                lhs.b();
            }
        }
    }

    public i360(b320 b320Var, ut8 ut8Var, oi6 oi6Var) {
        this.a = b320Var;
        this.b = ut8Var;
        this.c = oi6Var;
    }

    public static void d(lvb0 lvb0Var, int i, l7j l7jVar) {
        kcl v = uvf.v(lvb0Var.p());
        rip ripVar = null;
        try {
            rip ripVar2 = new rip(v);
            try {
                ripVar2.s();
                l7jVar.b(i, ripVar2);
                ripVar2.close();
                v.close();
            } catch (Throwable th) {
                th = th;
                ripVar = ripVar2;
                rip.c(ripVar);
                uvf.q(v);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        uhd0Var.q().k(uhd0Var, "NetworkFetchProducer");
        oi6 oi6Var = this.c;
        u6r a2 = oi6Var.a(l7jVar, uhd0Var);
        oi6Var.b(a2, new a(a2));
    }

    public final void c(lvb0 lvb0Var, u6r u6rVar) {
        int size = lvb0Var.size();
        yhd0 q = u6rVar.b.q();
        uhd0 uhd0Var = u6rVar.b;
        Map c = !q.i(uhd0Var, "NetworkFetchProducer") ? null : this.c.c(u6rVar, size);
        yhd0 q2 = uhd0Var.q();
        q2.f(uhd0Var, "NetworkFetchProducer", c);
        q2.e(uhd0Var, "NetworkFetchProducer", true);
        uhd0Var.t("network");
        d(lvb0Var, 1, u6rVar.a);
    }
}
