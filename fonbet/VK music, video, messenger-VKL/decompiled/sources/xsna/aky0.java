package xsna;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

/* compiled from: ReceiveBufferImpl.java */
/* loaded from: classes8.dex */
public final class aky0 {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = -1;
    public final int f = 5120;
    public volatile boolean g;

    /* compiled from: ReceiveBufferImpl.java */
    public static class a implements cky0 {
        public final long b;
        public final byte[] c;
        public final boolean d;

        public a(long j, byte[] bArr, boolean z) {
            this.b = j;
            this.c = bArr;
            this.d = z;
        }

        @Override // xsna.cky0
        public final byte[] b() {
            return this.c;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(cky0 cky0Var) {
            cky0 cky0Var2 = cky0Var;
            long d = cky0Var2.d();
            long j = this.b;
            return j != d ? Long.compare(j, cky0Var2.d()) : Integer.compare(this.c.length, cky0Var2.e());
        }

        @Override // xsna.cky0
        public final long d() {
            return this.b;
        }

        @Override // xsna.cky0
        public final int e() {
            return this.c.length;
        }

        @Override // xsna.cky0
        public final long f() {
            return this.b + this.c.length;
        }

        @Override // xsna.cky0
        public final boolean g() {
            return this.d;
        }

        public final String toString() {
            long length = this.c.length;
            long j = this.b;
            return j + ".." + ((length + j) - 1);
        }
    }

    public static cky0 b(cky0 cky0Var, long j, long j2) {
        int i = (int) (j2 - j);
        if (i == cky0Var.e()) {
            return cky0Var;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(cky0Var.b(), (int) (j - cky0Var.d()), bArr, 0, i);
        return new a(j, bArr, cky0Var.g());
    }

    public static cky0 d(cky0 cky0Var, cky0 cky0Var2) {
        if (cky0Var.d() <= cky0Var2.d() && cky0Var.f() >= cky0Var2.f()) {
            return cky0Var;
        }
        if (cky0Var2.d() <= cky0Var.d() && cky0Var2.f() >= cky0Var.f()) {
            return cky0Var2;
        }
        int f = (int) (cky0Var.f() - cky0Var2.d());
        byte[] bArr = new byte[(cky0Var2.e() + cky0Var.e()) - f];
        System.arraycopy(cky0Var.b(), 0, bArr, 0, cky0Var.e());
        System.arraycopy(cky0Var2.b(), f, bArr, cky0Var.e(), cky0Var2.e() - f);
        return new a(cky0Var.d(), bArr, cky0Var.g() || cky0Var2.g());
    }

    public final int a(ByteBuffer byteBuffer) {
        if (this.e >= 0 && this.d == this.e) {
            return -1;
        }
        cky0 cky0Var = (cky0) this.b.peek();
        int i = 0;
        while (cky0Var != null && byteBuffer.hasRemaining()) {
            int min = (int) Long.min(byteBuffer.remaining(), cky0Var.f() - this.d);
            byteBuffer.put(cky0Var.b(), (int) (this.d - cky0Var.d()), min);
            this.d += min;
            i += min;
            if (this.d == cky0Var.f()) {
                this.b.remove();
                cky0Var = (cky0) this.b.peek();
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0012, B:11:0x0023, B:13:0x0043, B:14:0x007d, B:16:0x0087, B:20:0x0098, B:22:0x00b8, B:24:0x00d2, B:25:0x00c5, B:28:0x00db, B:30:0x00e3, B:33:0x0053, B:35:0x0067, B:38:0x00e6, B:40:0x00ec, B:41:0x00f2, B:42:0x00f4, B:44:0x00fc, B:46:0x010e, B:49:0x0120, B:51:0x012a, B:52:0x0134, B:57:0x0143), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0012, B:11:0x0023, B:13:0x0043, B:14:0x007d, B:16:0x0087, B:20:0x0098, B:22:0x00b8, B:24:0x00d2, B:25:0x00c5, B:28:0x00db, B:30:0x00e3, B:33:0x0053, B:35:0x0067, B:38:0x00e6, B:40:0x00ec, B:41:0x00f2, B:42:0x00f4, B:44:0x00fc, B:46:0x010e, B:49:0x0120, B:51:0x012a, B:52:0x0134, B:57:0x0143), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(cky0 cky0Var) {
        long j;
        cky0 cky0Var2;
        cky0 cky0Var3;
        try {
            if (cky0Var.e() > 0) {
                cky0 cky0Var4 = (cky0) this.a.lower(cky0Var);
                if (cky0Var4 != null) {
                    if (cky0Var4.f() > cky0Var.d()) {
                        if (Long.max(cky0Var4.f(), cky0Var.f()) - Long.min(cky0Var4.d(), cky0Var.d()) <= this.f) {
                            cky0Var2 = d(cky0Var4, cky0Var);
                            this.a.remove(cky0Var4);
                            cky0Var4.e();
                        } else {
                            cky0Var2 = b(cky0Var, cky0Var4.f(), cky0Var.f());
                            if (this.a.lower(cky0Var2) != cky0Var4) {
                                cky0 cky0Var5 = (cky0) this.a.lower(cky0Var2);
                                cky0Var2 = d(cky0Var5, cky0Var2);
                                this.a.remove(cky0Var5);
                                cky0Var5.e();
                            }
                        }
                        cky0Var3 = (cky0) this.a.higher(cky0Var2);
                        while (cky0Var3 != null) {
                            if (!(cky0Var2.f() > cky0Var3.d())) {
                                break;
                            }
                            if (Long.max(cky0Var2.f(), cky0Var3.f()) - Long.min(cky0Var2.d(), cky0Var3.d()) <= this.f) {
                                cky0Var2 = d(cky0Var2, cky0Var3);
                                this.a.remove(cky0Var3);
                                cky0Var3.e();
                            } else {
                                cky0Var2 = b(cky0Var2, cky0Var2.d(), cky0Var3.d());
                            }
                            cky0Var3 = (cky0) this.a.higher(cky0Var2);
                        }
                        if (this.a.add(cky0Var2)) {
                            cky0Var2.e();
                        }
                    }
                }
                cky0Var2 = cky0Var;
                cky0Var3 = (cky0) this.a.higher(cky0Var2);
                while (cky0Var3 != null) {
                }
                if (this.a.add(cky0Var2)) {
                }
            }
            if (cky0Var.g()) {
                this.e = cky0Var.f();
            }
            j = this.c;
            while (!this.a.isEmpty() && ((cky0) this.a.first()).d() <= this.c) {
                cky0 cky0Var6 = (cky0) this.a.pollFirst();
                if (cky0Var6.f() > this.c) {
                    if (cky0Var6.d() < this.c) {
                        cky0Var6 = b(cky0Var6, this.c, cky0Var6.f());
                    }
                    this.b.add(cky0Var6);
                    this.c = cky0Var6.f();
                    cky0Var6.e();
                }
            }
        } catch (Exception e) {
            if (!this.g) {
                throw e;
            }
        }
        return this.c > j;
    }
}
