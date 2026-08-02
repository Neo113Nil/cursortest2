package xsna;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* compiled from: ZstdDataCompressor.kt */
/* loaded from: classes.dex */
public final class q7y0 {
    public final bpn0 a = new bpn0(new fr6(26));

    public final byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d8f0 d8f0Var = new d8f0(mq9.b(x1o0.i(byteArrayOutputStream, (m3w0) this.a.getValue())));
        try {
            d8f0Var.write(bArr);
            d8f0Var.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    public final byte[] b(byte[] bArr) {
        e8f0 e8f0Var = new e8f0(mq9.d(x1o0.g(new ByteArrayInputStream(bArr), (m3w0) this.a.getValue())));
        try {
            byte[] V2 = e8f0Var.V2();
            e8f0Var.close();
            return V2;
        } finally {
        }
    }
}
