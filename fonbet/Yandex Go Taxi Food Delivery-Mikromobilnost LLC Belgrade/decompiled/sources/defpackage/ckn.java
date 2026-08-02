package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ckn extends ByteArrayOutputStream {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckn() {
        super(8193);
        this.a = 1;
    }

    public byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public byte[] c() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public synchronized boolean d(mum mumVar, byte[] bArr) {
        if (64 != bArr.length) {
            reset();
            return false;
        }
        boolean b = bkn.b(bArr, (yzh) mumVar.a, (byte) 0, ((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
        reset();
        return b;
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized void reset() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                    Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
                    ((ByteArrayOutputStream) this).count = 0;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    public /* synthetic */ ckn(int i) {
        this.a = i;
    }
}
