package xsna;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalFetchProducer.java */
/* loaded from: classes12.dex */
public abstract class luz implements thd0<rip> {
    public final Executor a;
    public final b320 b;

    /* compiled from: LocalFetchProducer.java */
    public class a extends zuk0<rip> {
        public final /* synthetic */ ImageRequest g;
        public final /* synthetic */ yhd0 h;
        public final /* synthetic */ uhd0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l7j l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, String str, ImageRequest imageRequest, yhd0 yhd0Var2, uhd0 uhd0Var2) {
            super(l7jVar, yhd0Var, uhd0Var, str);
            this.g = imageRequest;
            this.h = yhd0Var2;
            this.i = uhd0Var2;
        }

        @Override // xsna.zuk0
        public final void b(Object obj) {
            rip.c((rip) obj);
        }

        @Override // xsna.zuk0
        public final Object d() throws Exception {
            ImageRequest imageRequest = this.g;
            luz luzVar = luz.this;
            rip d = luzVar.d(imageRequest);
            yhd0 yhd0Var = this.h;
            uhd0 uhd0Var = this.i;
            if (d == null) {
                yhd0Var.e(uhd0Var, luzVar.e(), false);
                uhd0Var.s("local", "fetch");
                return null;
            }
            d.s();
            yhd0Var.e(uhd0Var, luzVar.e(), true);
            uhd0Var.s("local", "fetch");
            d.y();
            uhd0Var.h(d.j, "image_color_space");
            return d;
        }
    }

    /* compiled from: LocalFetchProducer.java */
    public class b extends uk6 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            this.a.a();
        }
    }

    public luz(Executor executor, b320 b320Var) {
        this.a = executor;
        this.b = b320Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        yhd0 q = uhd0Var.q();
        ImageRequest r = uhd0Var.r();
        uhd0Var.s("local", "fetch");
        a aVar = new a(l7jVar, q, uhd0Var, e(), r, q, uhd0Var);
        uhd0Var.p(new b(aVar));
        this.a.execute(aVar);
    }

    public final rip c(InputStream inputStream, int i) throws IOException {
        kcl v;
        b320 b320Var = this.b;
        try {
            if (i <= 0) {
                b320Var.getClass();
                MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(b320Var.a);
                try {
                    b320Var.b.a(inputStream, memoryPooledByteBufferOutputStream);
                    a320 p = memoryPooledByteBufferOutputStream.p();
                    memoryPooledByteBufferOutputStream.close();
                    v = uvf.v(p);
                } catch (Throwable th) {
                    memoryPooledByteBufferOutputStream.close();
                    throw th;
                }
            } else {
                v = uvf.v(b320Var.a(inputStream, i));
            }
            kcl kclVar = v;
            rip ripVar = new rip(kclVar);
            yvf.b(inputStream);
            kclVar.close();
            return ripVar;
        } catch (Throwable th2) {
            yvf.b(inputStream);
            uvf.q(null);
            throw th2;
        }
    }

    public abstract rip d(ImageRequest imageRequest) throws IOException;

    public abstract String e();
}
