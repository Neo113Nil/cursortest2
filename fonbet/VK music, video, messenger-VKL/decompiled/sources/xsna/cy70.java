package xsna;

import java.io.InputStream;
import java.util.UUID;
import okhttp3.p;
import xsna.ujv;
import xsna.zjv;

/* compiled from: OkHttpKnetInterceptor.kt */
/* loaded from: classes.dex */
public final class cy70 implements ojv {
    public final okhttp3.o a;
    public final ujv b;
    public final wjv c;

    public cy70(okhttp3.o oVar, ujv ujvVar, zx70 zx70Var) {
        this.a = oVar;
        this.b = ujvVar;
        this.c = zx70Var;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        try {
            return b(aVar.b(), aVar.a().c().o());
        } finally {
        }
    }

    public final mkv b(ckv ckvVar, rt8 rt8Var) {
        okv okvVar;
        p.a aVar = new p.a();
        aVar.i(ckvVar.j());
        wx70.b(aVar, ckvVar.e());
        wx70.a(aVar, ckvVar);
        aVar.h(String.class, UUID.randomUUID().toString());
        aVar.c(okhttp3.c.n);
        okhttp3.d a = this.a.a(aVar.b());
        wjr0 wjr0Var = new wjr0();
        if (this.c != null) {
            ujv ujvVar = this.b;
            bwg bwgVar = new bwg(wjr0Var, this, ckvVar, 3);
            synchronized (ujvVar) {
                ujvVar.b.put(a, new ujv.b(0));
                ujvVar.c.put(a, bwgVar);
            }
        }
        okhttp3.u execute = ((f8f0) a).execute();
        okhttp3.v m = execute.m();
        if (m != null) {
            InputStream byteStream = m.byteStream();
            long contentLength = m.contentLength();
            okhttp3.m contentType = m.contentType();
            String str = contentType != null ? contentType.a : null;
            rt8Var.getClass();
            okvVar = new okv(byteStream, new p8v(rt8Var), Long.valueOf(contentLength), str);
        } else {
            okvVar = null;
        }
        mkv mkvVar = new mkv(wx70.c(execute.y()), ckvVar.j(), execute.o(), execute.v(), execute.s().e(), okvVar);
        wjr0Var.a(mkvVar);
        return mkvVar;
    }
}
