package xsna;

import com.github.luben.zstd.ZstdDictDecompress;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ZstdContextImpl.kt */
/* loaded from: classes3.dex */
public final class o7y0 implements m7y0 {
    public final s7y0 a;
    public final bpn0 b = new bpn0(new i8c0(this));
    public final AtomicInteger c = new AtomicInteger();

    public o7y0(s7y0 s7y0Var) {
        this.a = s7y0Var;
    }

    @Override // xsna.m7y0
    public final eoi0 a() {
        return this.a.d;
    }

    @Override // xsna.m7y0
    public final void b(String str, String str2) {
        if (str2 == null || epx.f(str, str2)) {
            return;
        }
        this.a.e();
        this.c.incrementAndGet();
        throw new IOException("Invalid dict version. resp:" + str2 + " curr:" + str);
    }

    @Override // xsna.m7y0
    public final boolean c() {
        return this.c.get() < 8;
    }

    @Override // xsna.m7y0
    public final InputStream d(InputStream inputStream, String str, eoi0 eoi0Var, wzs<? super Throwable, ? super String, s3q0> wzsVar) {
        n3w0 n3w0Var = new n3w0(inputStream, new n7y0(this, wzsVar), new pvn((m3w0) this.b.getValue(), false));
        if (eoi0Var != null) {
            String str2 = eoi0Var.b;
            if (str2.equals(str)) {
                try {
                    n3w0Var.b.setDict((ZstdDictDecompress) eoi0Var.c);
                    return n3w0Var;
                } catch (IOException e) {
                    this.a.e();
                    this.c.incrementAndGet();
                    wzsVar.invoke(e, "invalid_dict:".concat(str2));
                    throw e;
                }
            }
        }
        return n3w0Var;
    }
}
