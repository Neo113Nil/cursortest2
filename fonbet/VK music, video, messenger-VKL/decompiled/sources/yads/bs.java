package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import xsna.pft0;

/* loaded from: classes10.dex */
public final class bs {
    public final rr a;
    public final nr b;
    public final u30 c;
    public final String d;
    public final byte[] e;
    public final as f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public bs(rr rrVar, u30 u30Var, byte[] bArr, as asVar) {
        this.a = rrVar;
        this.b = rrVar.e();
        this.c = u30Var;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = asVar;
        ((pft0) rrVar.f()).getClass();
        this.d = yr.b(u30Var);
        this.g = u30Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b0 A[Catch: IOException -> 0x016b, TryCatch #1 {IOException -> 0x016b, blocks: (B:61:0x014a, B:64:0x0151, B:69:0x0163, B:70:0x015d, B:78:0x0173, B:80:0x0177, B:87:0x0182, B:89:0x018d, B:92:0x019c, B:93:0x01a1, B:95:0x0196, B:98:0x01a7, B:99:0x01ac, B:104:0x01b0, B:107:0x01ba, B:112:0x01ce, B:113:0x01c7), top: B:60:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151 A[Catch: IOException -> 0x016b, TryCatch #1 {IOException -> 0x016b, blocks: (B:61:0x014a, B:64:0x0151, B:69:0x0163, B:70:0x015d, B:78:0x0173, B:80:0x0177, B:87:0x0182, B:89:0x018d, B:92:0x019c, B:93:0x01a1, B:95:0x0196, B:98:0x01a7, B:99:0x01ac, B:104:0x01b0, B:107:0x01ba, B:112:0x01ce, B:113:0x01c7), top: B:60:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[Catch: IOException -> 0x016b, TryCatch #1 {IOException -> 0x016b, blocks: (B:61:0x014a, B:64:0x0151, B:69:0x0163, B:70:0x015d, B:78:0x0173, B:80:0x0177, B:87:0x0182, B:89:0x018d, B:92:0x019c, B:93:0x01a1, B:95:0x0196, B:98:0x01a7, B:99:0x01ac, B:104:0x01b0, B:107:0x01ba, B:112:0x01ce, B:113:0x01c7), top: B:60:0x014a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        String str;
        long j;
        boolean z;
        long j2;
        int i;
        long j3;
        long j4;
        long j5;
        if (this.j) {
            throw new InterruptedIOException();
        }
        nr nrVar = this.b;
        String str2 = this.d;
        u30 u30Var = this.c;
        this.i = ((zz2) nrVar).a(str2, u30Var.f, u30Var.g);
        u30 u30Var2 = this.c;
        long j6 = u30Var2.g;
        long j7 = -1;
        if (j6 != -1) {
            this.h = u30Var2.f + j6;
        } else {
            long a = qz.a(((zz2) this.b).b(this.d));
            if (a == -1) {
                a = -1;
            }
            this.h = a;
        }
        as asVar = this.f;
        if (asVar != null) {
            long j8 = this.h;
            asVar.a(j8 == -1 ? -1L : j8 - this.c.f, this.i, 0L);
        }
        while (true) {
            long j9 = this.h;
            if (j9 != j7 && this.g >= j9) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j10 = this.h;
            long b = ((zz2) this.b).b(this.d, this.g, j10 == j7 ? Long.MAX_VALUE : j10 - this.g);
            if (b > 0) {
                this.g += b;
            } else {
                long j11 = -b;
                long j12 = j11 == Long.MAX_VALUE ? j7 : j11;
                long j13 = this.g;
                int i2 = 0;
                boolean z2 = j13 + j12 == this.h || j12 == j7;
                if (j12 != j7) {
                    u30 u30Var3 = this.c;
                    u30Var3.getClass();
                    Uri uri = u30Var3.a;
                    long j14 = u30Var3.b;
                    int i3 = u30Var3.c;
                    byte[] bArr = u30Var3.d;
                    Map map = u30Var3.e;
                    String str3 = u30Var3.h;
                    int i4 = u30Var3.i;
                    Object obj = u30Var3.j;
                    ni.a(uri, "The uri must be set.");
                    str = "The uri must be set.";
                    j = j13;
                    try {
                        j2 = this.a.a(new u30(uri, j14, i3, bArr, map, j13, j12, str3, i4, obj));
                        z = true;
                    } catch (IOException unused) {
                        s30.a(this.a);
                    }
                    if (!z) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        u30 u30Var4 = this.c;
                        u30Var4.getClass();
                        Uri uri2 = u30Var4.a;
                        long j15 = u30Var4.b;
                        int i5 = u30Var4.c;
                        byte[] bArr2 = u30Var4.d;
                        Map map2 = u30Var4.e;
                        String str4 = u30Var4.h;
                        int i6 = u30Var4.i;
                        Object obj2 = u30Var4.j;
                        ni.a(uri2, str);
                        try {
                            j2 = this.a.a(new u30(uri2, j15, i5, bArr2, map2, j, -1L, str4, i6, obj2));
                        } catch (IOException e) {
                            s30.a(this.a);
                            throw e;
                        }
                    }
                    if (z2 && j2 != j7) {
                        j5 = j + j2;
                        try {
                            if (this.h == j5) {
                                this.h = j5;
                                as asVar2 = this.f;
                                if (asVar2 != null) {
                                    asVar2.a(j5 == j7 ? j7 : j5 - this.c.f, this.i, 0L);
                                }
                            }
                        } catch (IOException e2) {
                            s30.a(this.a);
                            throw e2;
                        }
                    }
                    i = 0;
                    int i7 = 0;
                    while (i != -1) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        rr rrVar = this.a;
                        byte[] bArr3 = this.e;
                        i = rrVar.read(bArr3, i2, bArr3.length);
                        if (i != -1) {
                            long j16 = i;
                            long j17 = this.i + j16;
                            this.i = j17;
                            as asVar3 = this.f;
                            if (asVar3 != null) {
                                long j18 = this.h;
                                if (j18 == j7) {
                                    j4 = j7;
                                    j3 = j4;
                                } else {
                                    j3 = j7;
                                    j4 = j18 - this.c.f;
                                }
                                asVar3.a(j4, j17, j16);
                            } else {
                                j3 = j7;
                            }
                            i7 += i;
                            j7 = j3;
                            i2 = 0;
                        }
                    }
                    long j19 = j7;
                    if (z2) {
                        long j20 = j + i7;
                        if (this.h != j20) {
                            this.h = j20;
                            as asVar4 = this.f;
                            if (asVar4 != null) {
                                asVar4.a(j20 == j19 ? j19 : j20 - this.c.f, this.i, 0L);
                            }
                        }
                    }
                    this.a.close();
                    this.g = j + i7;
                    j7 = j19;
                } else {
                    str = "The uri must be set.";
                    j = j13;
                }
                z = false;
                j2 = j7;
                if (!z) {
                }
                if (z2) {
                    j5 = j + j2;
                    if (this.h == j5) {
                    }
                }
                i = 0;
                int i72 = 0;
                while (i != -1) {
                }
                long j192 = j7;
                if (z2) {
                }
                this.a.close();
                this.g = j + i72;
                j7 = j192;
            }
        }
    }
}
