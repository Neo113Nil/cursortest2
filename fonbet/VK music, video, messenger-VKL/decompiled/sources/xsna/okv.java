package xsna;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: HttpResponseBody.kt */
/* loaded from: classes2.dex */
public final class okv implements Closeable {
    public final InputStream b;
    public final p8v c;
    public final Long d;
    public final String e;
    public byte[] f;
    public boolean g;
    public boolean h;

    public okv(InputStream inputStream, p8v p8vVar, Long l, String str) {
        this.b = inputStream;
        this.c = p8vVar;
        this.d = l;
        this.e = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.h = true;
        this.f = null;
        this.b.close();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final byte[] m() {
        p8v p8vVar = this.c;
        ?? r1 = p8vVar.d;
        InputStream inputStream = this.b;
        boolean z = this.g;
        if (z) {
            throw new IOException("Body is closed");
        }
        byte[] bArr = this.f;
        if (bArr != null && !z) {
            return bArr;
        }
        long q = q();
        ByteArrayOutputStream byteArrayOutputStream = q > 0 ? new ByteArrayOutputStream((int) q) : new ByteArrayOutputStream();
        try {
            if (p8vVar.b == 0 && r1.isInitialized()) {
                throw new IllegalStateException("Array has already dealloc!");
            }
            p8vVar.b++;
            byte[] bArr2 = (byte[]) r1.getValue();
            try {
                for (int read = inputStream.read(bArr2, 0, bArr2.length); read >= 0; read = inputStream.read(bArr2, 0, bArr2.length)) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                s3q0 s3q0Var = s3q0.a;
                inputStream.close();
                p8vVar.c();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.f = byteArray;
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public final InputStream n() {
        if (this.g) {
            throw new IOException("Body is closed");
        }
        byte[] bArr = this.f;
        return (bArr == null || !this.h) ? this.b : new ByteArrayInputStream(bArr);
    }

    public final String o() {
        return brm0.u(m());
    }

    public final okv p(InputStream inputStream) {
        return new okv(inputStream, new p8v((rt8) this.c.c), this.d, this.e);
    }

    public final long q() {
        Long l = this.d;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }
}
