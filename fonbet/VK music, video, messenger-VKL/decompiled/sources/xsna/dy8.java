package xsna;

import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.Cache;
import java.io.IOException;
import java.io.InterruptedIOException;
import xsna.evk;

/* compiled from: CacheWriter.java */
/* loaded from: classes12.dex */
public final class dy8 {
    public final androidx.media3.datasource.cache.a a;
    public final Cache b;
    public final evk c;
    public final String d;
    public final byte[] e;

    @Nullable
    public final a f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    /* compiled from: CacheWriter.java */
    public interface a {
        void a(long j, long j2, long j3);
    }

    public dy8(androidx.media3.datasource.cache.a aVar, evk evkVar, @Nullable byte[] bArr, @Nullable a aVar2) {
        this.a = aVar;
        this.b = aVar.a;
        this.c = evkVar;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = aVar2;
        this.d = aVar.e.k(evkVar);
        this.g = evkVar.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0158 A[Catch: Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:62:0x00ed, B:65:0x00f4, B:70:0x0106, B:71:0x0100, B:79:0x0113, B:81:0x0117, B:84:0x0120, B:86:0x012c, B:89:0x0141, B:90:0x0147, B:93:0x0138, B:97:0x014e, B:98:0x0153, B:103:0x0158, B:106:0x0161, B:111:0x0174, B:112:0x016e), top: B:61:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4 A[Catch: Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:62:0x00ed, B:65:0x00f4, B:70:0x0106, B:71:0x0100, B:79:0x0113, B:81:0x0117, B:84:0x0120, B:86:0x012c, B:89:0x0141, B:90:0x0147, B:93:0x0138, B:97:0x014e, B:98:0x0153, B:103:0x0158, B:106:0x0161, B:111:0x0174, B:112:0x016e), top: B:61:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113 A[Catch: Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:62:0x00ed, B:65:0x00f4, B:70:0x0106, B:71:0x0100, B:79:0x0113, B:81:0x0117, B:84:0x0120, B:86:0x012c, B:89:0x0141, B:90:0x0147, B:93:0x0138, B:97:0x014e, B:98:0x0153, B:103:0x0158, B:106:0x0161, B:111:0x0174, B:112:0x016e), top: B:61:0x00ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws IOException {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (this.j) {
            throw new InterruptedIOException();
        }
        Cache cache = this.b;
        String str = this.d;
        evk evkVar = this.c;
        this.i = cache.b(evkVar.g, evkVar.h, str);
        long j7 = evkVar.h;
        long j8 = -1;
        if (j7 != -1) {
            this.h = evkVar.g + j7;
        } else {
            long j9 = this.b.getContentMetadata(this.d).get("exo_len");
            if (j9 == -1) {
                j9 = -1;
            }
            this.h = j9;
        }
        a aVar = this.f;
        if (aVar != null) {
            long j10 = this.h;
            aVar.a(j10 == -1 ? -1L : j10 - this.c.g, this.i, 0L);
        }
        while (true) {
            long j11 = this.h;
            if (j11 != j8 && this.g >= j11) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j12 = this.h;
            long cachedLength = this.b.getCachedLength(this.d, this.g, j12 == j8 ? Long.MAX_VALUE : j12 - this.g);
            if (cachedLength > 0) {
                this.g += cachedLength;
                j2 = j8;
            } else {
                long j13 = -cachedLength;
                if (j13 == Long.MAX_VALUE) {
                    j13 = j8;
                }
                long j14 = this.g;
                androidx.media3.datasource.cache.a aVar2 = this.a;
                boolean z = true;
                int i2 = 0;
                boolean z2 = j14 + j13 == this.h || j13 == j8;
                if (j13 != j8) {
                    evk.a a2 = evkVar.a();
                    a2.f = j14;
                    a2.g = j13;
                    try {
                        j = aVar2.open(a2.a());
                    } catch (Exception unused) {
                        cvk.k(aVar2);
                    }
                    if (!z) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        evk.a a3 = evkVar.a();
                        a3.f = j14;
                        a3.g = j8;
                        try {
                            j = aVar2.open(a3.a());
                        } catch (Exception e) {
                            cvk.k(aVar2);
                            throw e;
                        }
                    }
                    if (z2 && j != j8) {
                        j6 = j + j14;
                        try {
                            if (this.h == j6) {
                                this.h = j6;
                                a aVar3 = this.f;
                                if (aVar3 != null) {
                                    aVar3.a(j6 == j8 ? j8 : j6 - this.c.g, this.i, 0L);
                                }
                            }
                        } catch (Exception e2) {
                            cvk.k(aVar2);
                            throw e2;
                        }
                    }
                    i = 0;
                    int i3 = 0;
                    while (i != -1) {
                        if (this.j) {
                            throw new InterruptedIOException();
                        }
                        byte[] bArr = this.e;
                        i = aVar2.read(bArr, i2, bArr.length);
                        if (i != -1) {
                            long j15 = i;
                            long j16 = this.i + j15;
                            this.i = j16;
                            a aVar4 = this.f;
                            if (aVar4 != null) {
                                j3 = j8;
                                long j17 = this.h;
                                if (j17 == j3) {
                                    j4 = j16;
                                    j5 = j3;
                                } else {
                                    aVar4 = aVar4;
                                    j4 = j16;
                                    j5 = j17 - this.c.g;
                                }
                                aVar4.a(j5, j4, j15);
                            } else {
                                j3 = j8;
                            }
                            i3 += i;
                            j8 = j3;
                            i2 = 0;
                        }
                    }
                    j2 = j8;
                    if (z2) {
                        long j18 = i3 + j14;
                        if (this.h != j18) {
                            this.h = j18;
                            a aVar5 = this.f;
                            if (aVar5 != null) {
                                aVar5.a(j18 == j2 ? j2 : j18 - this.c.g, this.i, 0L);
                            }
                        }
                    }
                    aVar2.close();
                    this.g = j14 + i3;
                }
                j = j8;
                z = false;
                if (!z) {
                }
                if (z2) {
                    j6 = j + j14;
                    if (this.h == j6) {
                    }
                }
                i = 0;
                int i32 = 0;
                while (i != -1) {
                }
                j2 = j8;
                if (z2) {
                }
                aVar2.close();
                this.g = j14 + i32;
            }
            j8 = j2;
        }
    }
}
