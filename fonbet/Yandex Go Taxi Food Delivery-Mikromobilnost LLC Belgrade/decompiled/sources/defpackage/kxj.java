package defpackage;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class kxj extends FilterOutputStream {
    public final /* synthetic */ kzo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxj(kzo kzoVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.a = kzoVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }
}
