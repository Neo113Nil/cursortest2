package xsna;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PooledByteStreams.java */
/* loaded from: classes.dex */
public final class mvb0 {
    public final int a;
    public final ut8 b;

    public mvb0(ut8 ut8Var) {
        sex0.a(true);
        this.a = 16384;
        this.b = ut8Var;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        ut8 ut8Var = this.b;
        int i = this.a;
        byte[] bArr = ut8Var.get(i);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            } finally {
                ut8Var.a(bArr);
            }
        }
    }
}
