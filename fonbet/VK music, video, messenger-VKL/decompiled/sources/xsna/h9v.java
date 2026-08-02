package xsna;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.a1n0;
import xsna.fi20;
import xsna.r9v;

/* compiled from: HlsMediaChunk.java */
/* loaded from: classes12.dex */
public final class h9v extends aq10 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public i9v C;
    public r9v D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public ImmutableList<Integer> I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;

    @Nullable
    public final androidx.media3.datasource.a p;

    @Nullable
    public final evk q;

    @Nullable
    public final i9v r;
    public final boolean s;
    public final boolean t;
    public final txo0 u;
    public final e9v v;

    @Nullable
    public final List<androidx.media3.common.a> w;

    @Nullable
    public final DrmInitData x;
    public final zrv y;
    public final xi90 z;

    public h9v(e9v e9vVar, androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, boolean z, @Nullable androidx.media3.datasource.a aVar3, @Nullable evk evkVar2, boolean z2, Uri uri, @Nullable List list, int i, @Nullable Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, txo0 txo0Var, @Nullable DrmInitData drmInitData, @Nullable i9v i9vVar, zrv zrvVar, xi90 xi90Var, boolean z6, boolean z7, x1b0 x1b0Var) {
        super(aVar, evkVar, aVar2, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : C.TIME_UNSET;
        this.l = i3;
        this.q = evkVar2;
        this.p = aVar3;
        this.F = evkVar2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = txo0Var;
        this.t = z4;
        this.v = e9vVar;
        this.w = list;
        this.x = drmInitData;
        this.r = i9vVar;
        this.y = zrvVar;
        this.z = xi90Var;
        this.L = z6;
        this.n = z7;
        ImmutableList.b bVar = ImmutableList.c;
        this.I = com.google.common.collect.g.f;
        this.k = M.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (o19.u(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // xsna.aq10
    public final boolean c() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
        this.G = true;
    }

    public final void d(androidx.media3.datasource.a aVar, evk evkVar, boolean z, boolean z2) throws IOException {
        evk d;
        boolean z3;
        long j;
        long j2;
        if (z) {
            z3 = this.E != 0;
            d = evkVar;
        } else {
            d = evkVar.d(this.E);
            z3 = false;
        }
        try {
            tel h = h(aVar, d, z2);
            if (z3) {
                h.skipFully(this.E, false);
            }
            do {
                try {
                    try {
                        if (this.G) {
                            break;
                        }
                    } catch (Throwable th) {
                        this.E = (int) (h.d - evkVar.g);
                        throw th;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) == 0) {
                        throw e;
                    }
                    ((eo8) this.C).a.seek(0L, 0L);
                    j = h.d;
                    j2 = evkVar.g;
                }
            } while (((eo8) this.C).a.b(h, eo8.f) == 0);
            j = h.d;
            j2 = evkVar.g;
            this.E = (int) (j - j2);
        } finally {
            cvk.k(aVar);
        }
    }

    public final int f(int i) {
        fxc0.z(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return this.I.get(i).intValue();
    }

    public final boolean g() {
        return this.K != C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x02bc, code lost:
    
        if (((xsna.u9v) r4).c.isEmpty() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00a8, code lost:
    
        if (((xsna.kcd0) r13).b.equals("com.apple.streaming.transportStreamTimestamp") != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02df  */
    /* JADX WARN: Type inference failed for: r4v19, types: [xsna.a1n0$a] */
    /* JADX WARN: Type inference failed for: r4v39, types: [xsna.a1n0$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tel h(androidx.media3.datasource.a aVar, evk evkVar, boolean z) throws IOException {
        int i;
        long j;
        long j2;
        long j3;
        eo8 eo8Var;
        txo0 txo0Var;
        ArrayList arrayList;
        pgq liVar;
        boolean z2;
        a1n0.a.C2516a c2516a;
        boolean z3;
        fi20.a aVar2;
        int i2;
        a1n0.a.C2516a c2516a2;
        pgq mesVar;
        List<androidx.media3.common.a> singletonList;
        int i3;
        pgq pf30Var;
        fi20.a aVar3;
        long open = aVar.open(evkVar);
        long j4 = this.g;
        txo0 txo0Var2 = this.u;
        if (z) {
            try {
                txo0Var2.g(j4, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        tel telVar = new tel(aVar, evkVar.g, open);
        if (this.C == null) {
            xi90 xi90Var = this.z;
            telVar.f = 0;
            try {
                xi90Var.M(10);
                telVar.peekFully(xi90Var.a, 0, 10, false);
            } catch (EOFException unused2) {
                j = C.TIME_UNSET;
            }
            if (xi90Var.F() != 4801587) {
                j2 = C.TIME_UNSET;
                j = C.TIME_UNSET;
            } else {
                xi90Var.Q(3);
                int B = xi90Var.B();
                int i4 = B + 10;
                byte[] bArr = xi90Var.a;
                j = C.TIME_UNSET;
                if (i4 > bArr.length) {
                    xi90Var.M(i4);
                    System.arraycopy(bArr, 0, xi90Var.a, 0, 10);
                }
                telVar.peekFully(xi90Var.a, 10, B, false);
                fi20 q = this.y.q(B, xi90Var.a);
                if (q != null) {
                    fi20.a[] aVarArr = q.a;
                    int length = aVarArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            aVar3 = null;
                            break;
                        }
                        fi20.a aVar4 = aVarArr[i5];
                        if (kcd0.class.isAssignableFrom(aVar4.getClass())) {
                            aVar3 = (fi20.a) kcd0.class.cast(aVar4);
                        }
                        aVar3 = null;
                        if (aVar3 != null) {
                            break;
                        }
                        i5++;
                    }
                    kcd0 kcd0Var = (kcd0) aVar3;
                    if (kcd0Var != null) {
                        System.arraycopy(kcd0Var.c, 0, xi90Var.a, 0, 8);
                        xi90Var.P(0);
                        xi90Var.O(8);
                        j2 = xi90Var.w() & 8589934591L;
                    }
                }
                j2 = j;
            }
            telVar.f = 0;
            i9v i9vVar = this.r;
            if (i9vVar == null) {
                Uri uri = evkVar.a;
                Map<String, List<String>> responseHeaders = aVar.getResponseHeaders();
                rfl rflVar = (rfl) this.v;
                rflVar.getClass();
                androidx.media3.common.a aVar5 = this.d;
                int z4 = xa4.z(aVar5.n);
                List<String> list = responseHeaders.get("Content-Type");
                int z5 = xa4.z((list == null || list.isEmpty()) ? null : list.get(0));
                int A = xa4.A(uri);
                ArrayList arrayList2 = new ArrayList(7);
                rfl.a(z4, arrayList2);
                rfl.a(z5, arrayList2);
                rfl.a(A, arrayList2);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    rfl.a(rfl.c[i6], arrayList2);
                    i6++;
                }
                telVar.f = 0;
                int i8 = 0;
                pgq pgqVar = null;
                while (true) {
                    int size = arrayList2.size();
                    pgq pgqVar2 = pgqVar;
                    txo0 txo0Var3 = this.u;
                    if (i8 >= size) {
                        j3 = j4;
                        i = 0;
                        pgqVar2.getClass();
                        eo8Var = new eo8(pgqVar2, aVar5, txo0Var3, rflVar.a, rflVar.b);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i8)).intValue();
                    int i9 = i8;
                    if (intValue == 0) {
                        txo0Var = txo0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        liVar = new li();
                    } else if (intValue == 1) {
                        txo0Var = txo0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        liVar = new pi();
                    } else if (intValue == 2) {
                        txo0Var = txo0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        liVar = new u21(0);
                    } else if (intValue != 7) {
                        List<androidx.media3.common.a> list2 = this.w;
                        a1n0.a.C2516a c2516a3 = a1n0.a.a;
                        if (intValue == 8) {
                            j3 = j4;
                            arrayList = arrayList2;
                            ?? r4 = rflVar.a;
                            boolean z6 = rflVar.b;
                            fi20 fi20Var = aVar5.l;
                            if (fi20Var == null) {
                                c2516a = r4;
                                z3 = z6;
                            } else {
                                fi20.a[] aVarArr2 = fi20Var.a;
                                int length2 = aVarArr2.length;
                                int i10 = 0;
                                a1n0.a.C2516a c2516a4 = r4;
                                while (true) {
                                    if (i10 >= length2) {
                                        c2516a = c2516a4;
                                        z3 = z6;
                                        aVar2 = null;
                                        break;
                                    }
                                    c2516a = c2516a4;
                                    fi20.a aVar6 = aVarArr2[i10];
                                    z3 = z6;
                                    fi20.a[] aVarArr3 = aVarArr2;
                                    if (u9v.class.isAssignableFrom(aVar6.getClass())) {
                                        aVar2 = (fi20.a) u9v.class.cast(aVar6);
                                    }
                                    aVar2 = null;
                                    if (aVar2 != null) {
                                        break;
                                    }
                                    i10++;
                                    c2516a4 = c2516a;
                                    z6 = z3;
                                    aVarArr2 = aVarArr3;
                                }
                                if (aVar2 != null) {
                                    i2 = 4;
                                    if (z3) {
                                        i2 |= 32;
                                        c2516a2 = c2516a3;
                                    } else {
                                        c2516a2 = c2516a;
                                    }
                                    mesVar = new mes(c2516a2, i2, txo0Var3, list2 == null ? list2 : com.google.common.collect.g.f, null);
                                    txo0Var = txo0Var3;
                                }
                            }
                            i2 = 0;
                            if (z3) {
                            }
                            mesVar = new mes(c2516a2, i2, txo0Var3, list2 == null ? list2 : com.google.common.collect.g.f, null);
                            txo0Var = txo0Var3;
                        } else if (intValue == 11) {
                            j3 = j4;
                            arrayList = arrayList2;
                            ?? r42 = rflVar.a;
                            boolean z7 = rflVar.b;
                            if (list2 != null) {
                                i3 = 48;
                                singletonList = list2;
                            } else {
                                a.C0043a c0043a = new a.C0043a();
                                c0043a.m = io20.q(MimeTypes.APPLICATION_CEA608);
                                singletonList = Collections.singletonList(new androidx.media3.common.a(c0043a));
                                i3 = 16;
                            }
                            String str = aVar5.k;
                            txo0Var = txo0Var3;
                            if (!TextUtils.isEmpty(str)) {
                                if (io20.c(str, "audio/mp4a-latm") == null) {
                                    i3 |= 2;
                                }
                                if (io20.c(str, "video/avc") == null) {
                                    i3 |= 4;
                                }
                            }
                            mesVar = new ssp0(2, !z7 ? 1 : 0, !z7 ? c2516a3 : r42, txo0Var, new bql(i3, singletonList));
                        } else if (intValue != 13) {
                            txo0Var = txo0Var3;
                            j3 = j4;
                            arrayList = arrayList2;
                            liVar = null;
                        } else {
                            j3 = j4;
                            arrayList = arrayList2;
                            liVar = new akx0(aVar5.d, txo0Var3, rflVar.a, rflVar.b);
                            txo0Var = txo0Var3;
                        }
                        liVar = mesVar;
                    } else {
                        txo0Var = txo0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        liVar = new pf30(0L);
                    }
                    liVar.getClass();
                    pgq pgqVar3 = liVar;
                    try {
                        z2 = pgqVar3.d(telVar);
                        i = 0;
                        telVar.f = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        telVar.f = 0;
                        z2 = false;
                    } catch (Throwable th) {
                        telVar.f = 0;
                        throw th;
                    }
                    if (z2) {
                        eo8Var = new eo8(pgqVar3, aVar5, txo0Var, rflVar.a, rflVar.b);
                        break;
                    }
                    androidx.media3.common.a aVar7 = aVar5;
                    pgqVar = (pgqVar2 == null && (intValue == z4 || intValue == z5 || intValue == A || intValue == 11)) ? pgqVar3 : pgqVar2;
                    i8 = i9 + 1;
                    aVar5 = aVar7;
                    arrayList2 = arrayList;
                    j4 = j3;
                }
            } else {
                eo8 eo8Var2 = (eo8) i9vVar;
                pgq pgqVar4 = eo8Var2.a;
                pgq c = pgqVar4.c();
                fxc0.z(!((c instanceof ssp0) || (c instanceof mes)));
                fxc0.y(pgqVar4.getClass(), "Can't recreate wrapped extractors. Outer type: %s", pgqVar4.c() == pgqVar4);
                if (pgqVar4 instanceof akx0) {
                    pf30Var = new akx0(eo8Var2.b.d, eo8Var2.c, eo8Var2.d, eo8Var2.e);
                } else if (pgqVar4 instanceof u21) {
                    pf30Var = new u21(0);
                } else if (pgqVar4 instanceof li) {
                    pf30Var = new li();
                } else if (pgqVar4 instanceof pi) {
                    pf30Var = new pi();
                } else {
                    if (!(pgqVar4 instanceof pf30)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(pgqVar4.getClass().getSimpleName()));
                    }
                    pf30Var = new pf30();
                }
                eo8Var = new eo8(pf30Var, eo8Var2.b, eo8Var2.c, eo8Var2.d, eo8Var2.e);
                j3 = j4;
                i = 0;
            }
            eo8 eo8Var3 = eo8Var;
            this.C = eo8Var3;
            pgq c2 = eo8Var3.a.c();
            if ((((c2 instanceof u21) || (c2 instanceof li) || (c2 instanceof pi) || (c2 instanceof pf30)) ? 1 : i) != 0) {
                r9v r9vVar = this.D;
                long b = j2 != j ? txo0Var2.b(j2) : j3;
                if (r9vVar.W != b) {
                    r9vVar.W = b;
                    r9v.b[] bVarArr = r9vVar.w;
                    int length3 = bVarArr.length;
                    for (int i11 = i; i11 < length3; i11++) {
                        r9v.b bVar = bVarArr[i11];
                        if (bVar.F != b) {
                            bVar.F = b;
                            bVar.z = true;
                        }
                    }
                }
            } else {
                r9v r9vVar2 = this.D;
                if (r9vVar2.W != 0) {
                    r9vVar2.W = 0L;
                    r9v.b[] bVarArr2 = r9vVar2.w;
                    int length4 = bVarArr2.length;
                    for (int i12 = i; i12 < length4; i12++) {
                        r9v.b bVar2 = bVarArr2[i12];
                        if (bVar2.F != 0) {
                            bVar2.F = 0L;
                            bVar2.z = true;
                        }
                    }
                }
            }
            this.D.y.clear();
            ((eo8) this.C).a.e(this.D);
        } else {
            i = 0;
        }
        r9v r9vVar3 = this.D;
        DrmInitData drmInitData = r9vVar3.X;
        DrmInitData drmInitData2 = this.x;
        if (!Objects.equals(drmInitData, drmInitData2)) {
            r9vVar3.X = drmInitData2;
            int i13 = i;
            while (true) {
                r9v.b[] bVarArr3 = r9vVar3.w;
                if (i13 >= bVarArr3.length) {
                    break;
                }
                if (r9vVar3.P[i13]) {
                    r9v.b bVar3 = bVarArr3[i13];
                    bVar3.I = drmInitData2;
                    bVar3.z = true;
                }
                i13++;
            }
        }
        return telVar;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        i9v i9vVar;
        this.D.getClass();
        if (this.C == null && (i9vVar = this.r) != null) {
            pgq c = ((eo8) i9vVar).a.c();
            if ((c instanceof ssp0) || (c instanceof mes)) {
                this.C = this.r;
                this.F = false;
            }
        }
        evk evkVar = this.q;
        androidx.media3.datasource.a aVar = this.p;
        if (this.F) {
            aVar.getClass();
            evkVar.getClass();
            d(aVar, evkVar, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            d(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }
}
