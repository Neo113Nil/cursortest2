package xsna;

import com.vk.compression.zstd.VkZstdException;
import java.io.IOException;

/* compiled from: ZstdContextImpl.kt */
/* loaded from: classes3.dex */
public final class n7y0 implements izs {
    public final /* synthetic */ o7y0 b;
    public final /* synthetic */ wzs<Throwable, String, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public n7y0(o7y0 o7y0Var, wzs<? super Throwable, ? super String, s3q0> wzsVar) {
        this.b = o7y0Var;
        this.c = wzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String message;
        Throwable th = (Throwable) obj;
        if (th instanceof VkZstdException) {
            message = "zstd_error:" + ((VkZstdException) th).d();
        } else {
            if (!(th instanceof IOException)) {
                throw th;
            }
            String message2 = th.getMessage();
            if (message2 == null) {
                throw th;
            }
            if (!brm0.B(message2, "Decompression error", false)) {
                throw th;
            }
            message = th.getMessage();
        }
        o7y0 o7y0Var = this.b;
        o7y0Var.c.incrementAndGet();
        if (!o7y0Var.c()) {
            o7y0Var.a.e();
        }
        this.c.invoke(th, message);
        throw new IOException(message, th);
    }
}
