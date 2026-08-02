package xsna;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.tsp0;

/* compiled from: H262Reader.java */
/* loaded from: classes12.dex */
public final class fsu implements zap {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public rgp0 b;

    @Nullable
    public final hhq0 c;
    public final String d;

    @Nullable
    public final xi90 e;

    @Nullable
    public final qt50 f;
    public final boolean[] g = new boolean[4];
    public final a h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    /* compiled from: H262Reader.java */
    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public final void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b + i3;
                if (length < i4) {
                    this.d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }
    }

    public fsu(@Nullable hhq0 hhq0Var, String str) {
        this.c = hhq0Var;
        this.d = str;
        a aVar = new a();
        aVar.d = new byte[128];
        this.h = aVar;
        if (hhq0Var != null) {
            this.f = new qt50(178);
            this.e = new xi90();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    @Override // xsna.zap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xi90 xi90Var) {
        a aVar;
        qt50 qt50Var;
        int i;
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j4;
        this.b.getClass();
        int i5 = xi90Var.b;
        int i6 = xi90Var.c;
        byte[] bArr = xi90Var.a;
        this.i += xi90Var.a();
        this.b.d(xi90Var.a(), xi90Var);
        while (true) {
            int b = rt50.b(bArr, i5, i6, this.g);
            aVar = this.h;
            qt50Var = this.f;
            if (b == i6) {
                break;
            }
            int i7 = b + 3;
            int i8 = xi90Var.a[i7] & 255;
            int i9 = b - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    aVar.a(bArr, i5, b);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (aVar.a) {
                    int i11 = aVar.b - i10;
                    aVar.b = i11;
                    if (aVar.c == 0 && i8 == 181) {
                        aVar.c = i11;
                        i = i6;
                    } else {
                        aVar.a = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(aVar.d, aVar.b);
                        int i12 = copyOf[4] & 255;
                        byte b2 = copyOf[5];
                        i = i6;
                        int i13 = ((b2 & 255) >> 4) | (i12 << 4);
                        int i14 = (copyOf[6] & 255) | ((b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER) << 8);
                        int i15 = (copyOf[7] & 240) >> 4;
                        if (i15 == 2) {
                            f = i14 * 4;
                            i3 = i13 * 3;
                        } else if (i15 == 3) {
                            f = i14 * 16;
                            i3 = i13 * 9;
                        } else if (i15 != 4) {
                            f2 = 1.0f;
                            a.C0043a c0043a = new a.C0043a();
                            c0043a.a = str;
                            c0043a.l = io20.q(this.d);
                            c0043a.m = io20.q(MimeTypes.VIDEO_MPEG2);
                            c0043a.t = i13;
                            c0043a.u = i14;
                            c0043a.z = f2;
                            c0043a.p = Collections.singletonList(copyOf);
                            androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a);
                            i4 = (copyOf[7] & AmfConstants.TYPE_XML_DOCUMENT_MARKER) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = r[i4];
                                byte b3 = copyOf[aVar.c + 9];
                                int i16 = (b3 & 96) >> 5;
                                if (i16 != (b3 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(aVar2, Long.valueOf(j4));
                            this.b.c((androidx.media3.common.a) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i14 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        a.C0043a c0043a2 = new a.C0043a();
                        c0043a2.a = str;
                        c0043a2.l = io20.q(this.d);
                        c0043a2.m = io20.q(MimeTypes.VIDEO_MPEG2);
                        c0043a2.t = i13;
                        c0043a2.u = i14;
                        c0043a2.z = f2;
                        c0043a2.p = Collections.singletonList(copyOf);
                        androidx.media3.common.a aVar22 = new androidx.media3.common.a(c0043a2);
                        i4 = (copyOf[7] & AmfConstants.TYPE_XML_DOCUMENT_MARKER) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(aVar22, Long.valueOf(j4));
                        this.b.c((androidx.media3.common.a) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        aVar.a = true;
                    }
                }
                aVar.a(a.e, 0, 3);
            }
            if (qt50Var != null) {
                if (i9 > 0) {
                    qt50Var.a(bArr, i5, b);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (qt50Var.b(i2)) {
                    int m = rt50.m(qt50Var.d, qt50Var.e);
                    String str2 = y2r0.a;
                    byte[] bArr2 = qt50Var.d;
                    xi90 xi90Var2 = this.e;
                    xi90Var2.N(bArr2, m);
                    this.c.a(this.o, xi90Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (xi90Var.a[b + 2] == 1) {
                        qt50Var.d(i8);
                    }
                    if (i8 != 0 || i8 == 179) {
                        int i17 = i - b;
                        if (this.q && this.k) {
                            j3 = this.o;
                            if (j3 != C.TIME_UNSET) {
                                j = -9223372036854775807L;
                                this.b.a(j3, this.p ? 1 : 0, ((int) (this.i - this.n)) - i17, i17, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i17;
                                    j2 = this.m;
                                    if (j2 == j) {
                                        long j5 = this.o;
                                        j2 = j5 != j ? j5 + this.l : j;
                                    }
                                    this.o = j2;
                                    z2 = false;
                                    this.p = false;
                                    this.m = j;
                                    z3 = true;
                                    this.j = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.q = i8 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i17;
                        j2 = this.m;
                        if (j2 == j) {
                        }
                        this.o = j2;
                        z2 = false;
                        this.p = false;
                        this.m = j;
                        z3 = true;
                        this.j = true;
                        this.q = i8 == 0 ? z3 : z2;
                    } else if (i8 == 184) {
                        this.p = z;
                    }
                    i5 = i7;
                    i6 = i;
                }
            }
            z = true;
            if (i8 != 0) {
            }
            int i172 = i - b;
            if (this.q) {
                j3 = this.o;
                if (j3 != C.TIME_UNSET) {
                }
            }
            j = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i172;
            j2 = this.m;
            if (j2 == j) {
            }
            this.o = j2;
            z2 = false;
            this.p = false;
            this.m = j;
            z3 = true;
            this.j = true;
            this.q = i8 == 0 ? z3 : z2;
            i5 = i7;
            i6 = i;
        }
        if (!this.k) {
            aVar.a(bArr, i5, i6);
        }
        if (qt50Var != null) {
            qt50Var.a(bArr, i5, i6);
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        this.a = cVar.e;
        cVar.b();
        this.b = rgqVar.track(cVar.d, 2);
        hhq0 hhq0Var = this.c;
        if (hhq0Var != null) {
            hhq0Var.b(rgqVar, cVar);
        }
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        this.m = j;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        this.b.getClass();
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // xsna.zap
    public final void seek() {
        rt50.a(this.g);
        a aVar = this.h;
        aVar.a = false;
        aVar.b = 0;
        aVar.c = 0;
        qt50 qt50Var = this.f;
        if (qt50Var != null) {
            qt50Var.c();
        }
        this.i = 0L;
        this.j = false;
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }
}
