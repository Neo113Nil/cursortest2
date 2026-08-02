package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class lnu extends ib10 {
    public static final AtomicInteger g0 = new AtomicInteger();
    public final int D;
    public final int E;
    public final Uri F;
    public final boolean G;
    public final int H;
    public final kpg I;
    public final npg J;
    public final wu6 K;
    public final boolean L;
    public final boolean M;
    public final sez0 N;
    public final jch O;
    public final List P;
    public final DrmInitData Q;
    public final w5v R;
    public final ef90 S;
    public final boolean T;
    public final boolean U;
    public wu6 V;
    public hou W;
    public int Z;
    public boolean a0;
    public volatile boolean b0;
    public boolean c0;
    public ImmutableList d0;
    public boolean e0;
    public boolean f0;

    public lnu(jch jchVar, kpg kpgVar, npg npgVar, a aVar, boolean z, kpg kpgVar2, npg npgVar2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, sez0 sez0Var, DrmInitData drmInitData, wu6 wu6Var, w5v w5vVar, ef90 ef90Var, boolean z6, vyc0 vyc0Var) {
        super(kpgVar, npgVar, aVar, i, obj, j, j2, j3);
        this.T = z;
        this.H = i2;
        this.f0 = z3;
        this.E = i3;
        this.J = npgVar2;
        this.I = kpgVar2;
        this.a0 = npgVar2 != null;
        this.U = z2;
        this.F = uri;
        this.L = z5;
        this.N = sez0Var;
        this.M = z4;
        this.O = jchVar;
        this.P = list;
        this.Q = drmInitData;
        this.K = wu6Var;
        this.R = w5vVar;
        this.S = ef90Var;
        this.G = z6;
        this.d0 = ImmutableList.p();
        this.D = g0.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (f0b1.g(str).startsWith(HexString.STR_0x)) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.ib10
    public final boolean b() {
        throw null;
    }

    public final void c(kpg kpgVar, npg npgVar, boolean z, boolean z2) {
        npg d;
        long j;
        int i = this.Z;
        if (z) {
            r1 = i != 0;
            d = npgVar;
        } else {
            d = npgVar.d(i);
        }
        try {
            kbh g = g(kpgVar, d, z2);
            if (r1) {
                g.O(this.Z);
            }
            do {
                try {
                    try {
                        if (this.b0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.w.f & 16384) == 0) {
                            throw e;
                        }
                        this.V.a.a(0L, 0L);
                        j = g.w;
                    }
                } catch (Throwable th) {
                    this.Z = (int) (g.w - npgVar.f);
                    throw th;
                }
            } while (this.V.a.g(g, wu6.f) == 0);
            j = g.w;
            this.Z = (int) (j - npgVar.f);
        } finally {
            yri0.b(kpgVar);
        }
    }

    @Override // defpackage.pyy
    public final void d() {
        this.b0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f(int i) {
        d6z.x(!this.G);
        if (i >= this.d0.size()) {
            return 0;
        }
        return ((Integer) this.d0.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029e  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [b5p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r4v10, types: [b5p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kbh g(kpg kpgVar, npg npgVar, boolean z) {
        int i;
        kbh kbhVar;
        long j;
        long j2;
        long j3;
        wu6 wu6Var;
        sez0 sez0Var;
        ArrayList arrayList;
        b5p b5pVar;
        boolean z2;
        o2v0 o2v0Var;
        boolean z3;
        o2v0 o2v0Var2;
        Object obj;
        List list;
        List list2;
        int i2;
        int i3;
        b5p rb30Var;
        long open = kpgVar.open(npgVar);
        kbh kbhVar2 = null;
        long j4 = this.z;
        sez0 sez0Var2 = this.N;
        if (z) {
            try {
                sez0Var2.g(j4, this.L);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                kbs.r(e);
                return null;
            }
        }
        kbh kbhVar3 = new kbh(kpgVar, npgVar.f, open);
        if (this.V == null) {
            ef90 ef90Var = this.S;
            kbhVar3.y = 0;
            try {
                ef90Var.H(10);
                kbhVar3.H(ef90Var.a, 0, 10, false);
            } catch (EOFException unused2) {
                kbhVar = null;
                j = -9223372036854775807L;
            }
            if (ef90Var.B() != 4801587) {
                kbhVar = null;
                j2 = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                ef90Var.L(3);
                int x = ef90Var.x();
                int i4 = x + 10;
                j = -9223372036854775807L;
                byte[] bArr = ef90Var.a;
                if (i4 > bArr.length) {
                    ef90Var.H(i4);
                    System.arraycopy(bArr, 0, ef90Var.a, 0, 10);
                }
                kbhVar3.H(ef90Var.a, 10, x, false);
                w820 c = this.R.c(x, ef90Var.a);
                if (c != null) {
                    s820[] s820VarArr = c.a;
                    int length = s820VarArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        s820 s820Var = s820VarArr[i5];
                        if (s820Var instanceof o3f0) {
                            o3f0 o3f0Var = (o3f0) s820Var;
                            kbhVar = kbhVar2;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(o3f0Var.b)) {
                                System.arraycopy(o3f0Var.c, 0, ef90Var.a, 0, 8);
                                ef90Var.K(0);
                                ef90Var.J(8);
                                j2 = ef90Var.s() & 8589934591L;
                                break;
                            }
                        } else {
                            kbhVar = kbhVar2;
                        }
                        i5++;
                        kbhVar2 = kbhVar;
                    }
                }
                kbhVar = kbhVar2;
                j2 = j;
            }
            kbhVar3.y = 0;
            wu6 wu6Var2 = this.K;
            if (wu6Var2 == null) {
                Uri uri = npgVar.a;
                Map responseHeaders = kpgVar.getResponseHeaders();
                jch jchVar = this.O;
                jchVar.getClass();
                a aVar = this.w;
                int d = yma1.d(aVar.n);
                List list3 = (List) responseHeaders.get("Content-Type");
                int d2 = yma1.d((list3 == null || list3.isEmpty()) ? kbhVar : (String) list3.get(0));
                int e2 = yma1.e(uri);
                ArrayList arrayList2 = new ArrayList(7);
                jch.a(d, arrayList2);
                jch.a(d2, arrayList2);
                jch.a(e2, arrayList2);
                int i6 = 0;
                for (int i7 = 7; i6 < i7; i7 = 7) {
                    jch.a(jch.d[i6], arrayList2);
                    i6++;
                }
                kbhVar3.y = 0;
                int i8 = 0;
                ?? r20 = kbhVar;
                while (true) {
                    int size = arrayList2.size();
                    sez0 sez0Var3 = this.N;
                    if (i8 >= size) {
                        j3 = j4;
                        i = 0;
                        r20.getClass();
                        wu6Var = new wu6(r20, aVar, sez0Var3, jchVar.a, jchVar.b);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i8)).intValue();
                    int i9 = i8;
                    if (intValue == 0) {
                        sez0Var = sez0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        b5pVar = new fb();
                    } else if (intValue == 1) {
                        sez0Var = sez0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        b5pVar = new ib();
                    } else if (intValue == 2) {
                        sez0Var = sez0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        b5pVar = new ed1();
                    } else if (intValue != 7) {
                        List list4 = this.P;
                        o2v0 o2v0Var3 = o2v0.d4;
                        if (intValue == 8) {
                            j3 = j4;
                            arrayList = arrayList2;
                            o2v0 o2v0Var4 = jchVar.a;
                            boolean z4 = jchVar.b;
                            w820 w820Var = aVar.l;
                            if (w820Var == null) {
                                o2v0Var = o2v0Var4;
                            } else {
                                int i10 = 0;
                                o2v0 o2v0Var5 = o2v0Var4;
                                while (true) {
                                    s820[] s820VarArr2 = w820Var.a;
                                    o2v0Var = o2v0Var5;
                                    if (i10 >= s820VarArr2.length) {
                                        break;
                                    }
                                    s820 s820Var2 = s820VarArr2[i10];
                                    if (s820Var2 instanceof jou) {
                                        z3 = !((jou) s820Var2).c.isEmpty();
                                        break;
                                    }
                                    i10++;
                                    o2v0Var5 = o2v0Var;
                                }
                                int i11 = !z3 ? 4 : 0;
                                if (z4) {
                                    i11 |= 32;
                                    o2v0Var2 = o2v0Var3;
                                } else {
                                    o2v0Var2 = o2v0Var;
                                }
                                sez0Var = sez0Var3;
                                obj = new les(o2v0Var2, i11, sez0Var3, null, list4 == null ? list4 : ImmutableList.p(), null);
                            }
                            z3 = false;
                            if (!z3) {
                            }
                            if (z4) {
                            }
                            sez0Var = sez0Var3;
                            obj = new les(o2v0Var2, i11, sez0Var3, null, list4 == null ? list4 : ImmutableList.p(), null);
                        } else if (intValue == 11) {
                            j3 = j4;
                            arrayList = arrayList2;
                            boolean z5 = jchVar.c;
                            o2v0 o2v0Var6 = jchVar.a;
                            boolean z6 = jchVar.b;
                            if (list4 != null) {
                                list2 = list4;
                                i2 = 48;
                            } else {
                                if (z5) {
                                    f7s f7sVar = new f7s();
                                    f7sVar.m = eh20.q("application/cea-608");
                                    list = Collections.singletonList(new a(f7sVar));
                                } else {
                                    list = Collections.EMPTY_LIST;
                                }
                                list2 = list;
                                i2 = 16;
                            }
                            String str = aVar.k;
                            sez0Var = sez0Var3;
                            if (!TextUtils.isEmpty(str)) {
                                if (eh20.c(str, "audio/mp4a-latm") == null) {
                                    i2 |= 2;
                                }
                                if (eh20.c(str, "video/avc") == null) {
                                    i3 = i2 | 4;
                                    obj = new vi11(2, !z6 ? 1 : 0, z6 ? o2v0Var3 : o2v0Var6, sez0Var, new ymh(i3, list2));
                                }
                            }
                            i3 = i2;
                            obj = new vi11(2, !z6 ? 1 : 0, z6 ? o2v0Var3 : o2v0Var6, sez0Var, new ymh(i3, list2));
                        } else if (intValue != 13) {
                            sez0Var = sez0Var3;
                            j3 = j4;
                            arrayList = arrayList2;
                            b5pVar = kbhVar;
                        } else {
                            j3 = j4;
                            arrayList = arrayList2;
                            sez0Var = sez0Var3;
                            b5pVar = new ow41(aVar.d, sez0Var3, jchVar.a, jchVar.b);
                        }
                        b5pVar = obj;
                    } else {
                        sez0Var = sez0Var3;
                        j3 = j4;
                        arrayList = arrayList2;
                        b5pVar = new rb30(0L);
                    }
                    b5pVar.getClass();
                    try {
                        z2 = b5pVar.h(kbhVar3);
                        i = 0;
                        kbhVar3.y = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        kbhVar3.y = 0;
                        z2 = false;
                    } catch (Throwable th) {
                        kbhVar3.y = 0;
                        throw th;
                    }
                    if (z2) {
                        wu6Var = new wu6(b5pVar, aVar, sez0Var, jchVar.a, jchVar.b);
                        break;
                    }
                    a aVar2 = aVar;
                    if (r20 == 0 && (intValue == d || intValue == d2 || intValue == e2 || intValue == 11)) {
                        r20 = b5pVar;
                    }
                    i8 = i9 + 1;
                    aVar = aVar2;
                    arrayList2 = arrayList;
                    j4 = j3;
                    r20 = r20;
                }
            } else {
                b5p b5pVar2 = wu6Var2.a;
                d6z.x(!((b5pVar2 instanceof vi11) || (b5pVar2 instanceof les)));
                b5pVar2.getClass().toString();
                if (b5pVar2 instanceof ow41) {
                    rb30Var = new ow41(wu6Var2.b.d, wu6Var2.c, wu6Var2.d, wu6Var2.e);
                } else if (b5pVar2 instanceof ed1) {
                    rb30Var = new ed1();
                } else if (b5pVar2 instanceof fb) {
                    rb30Var = new fb();
                } else if (b5pVar2 instanceof ib) {
                    rb30Var = new ib();
                } else {
                    if (!(b5pVar2 instanceof rb30)) {
                        ny61.r("Unexpected extractor type for recreation: ".concat(b5pVar2.getClass().getSimpleName()));
                        return kbhVar;
                    }
                    rb30Var = new rb30();
                }
                wu6Var = new wu6(rb30Var, wu6Var2.b, wu6Var2.c, wu6Var2.d, wu6Var2.e);
                j3 = j4;
                i = 0;
            }
            wu6 wu6Var3 = wu6Var;
            this.V = wu6Var3;
            b5p b5pVar3 = wu6Var3.a;
            if ((b5pVar3 instanceof ed1) || (b5pVar3 instanceof fb) || (b5pVar3 instanceof ib) || (b5pVar3 instanceof rb30)) {
                hou houVar = this.W;
                long b = j2 != j ? sez0Var2.b(j2) : j3;
                if (houVar.q0 != b) {
                    houVar.q0 = b;
                    gou[] gouVarArr = houVar.O;
                    int length2 = gouVarArr.length;
                    for (int i12 = i; i12 < length2; i12++) {
                        gou gouVar = gouVarArr[i12];
                        if (gouVar.F != b) {
                            gouVar.F = b;
                            gouVar.z = true;
                        }
                    }
                }
            } else {
                hou houVar2 = this.W;
                if (houVar2.q0 != 0) {
                    houVar2.q0 = 0L;
                    gou[] gouVarArr2 = houVar2.O;
                    int length3 = gouVarArr2.length;
                    for (int i13 = i; i13 < length3; i13++) {
                        gou gouVar2 = gouVarArr2[i13];
                        if (gouVar2.F != 0) {
                            gouVar2.F = 0L;
                            gouVar2.z = true;
                        }
                    }
                }
            }
            this.W.Q.clear();
            this.V.a.e(this.W);
        } else {
            i = 0;
        }
        hou houVar3 = this.W;
        DrmInitData drmInitData = houVar3.r0;
        DrmInitData drmInitData2 = this.Q;
        if (!Objects.equals(drmInitData, drmInitData2)) {
            houVar3.r0 = drmInitData2;
            int i14 = i;
            while (true) {
                gou[] gouVarArr3 = houVar3.O;
                if (i14 >= gouVarArr3.length) {
                    break;
                }
                if (houVar3.j0[i14]) {
                    gou gouVar3 = gouVarArr3[i14];
                    gouVar3.I = drmInitData2;
                    gouVar3.z = true;
                }
                i14++;
            }
        }
        return kbhVar3;
    }

    @Override // defpackage.pyy
    public final void load() {
        wu6 wu6Var;
        this.W.getClass();
        if (this.V == null && (wu6Var = this.K) != null) {
            b5p b5pVar = wu6Var.a;
            if ((b5pVar instanceof vi11) || (b5pVar instanceof les)) {
                this.V = wu6Var;
                this.a0 = false;
            }
        }
        npg npgVar = this.J;
        kpg kpgVar = this.I;
        if (this.a0) {
            kpgVar.getClass();
            npgVar.getClass();
            c(kpgVar, npgVar, this.U, false);
            this.Z = 0;
            this.a0 = false;
        }
        if (this.b0) {
            return;
        }
        if (!this.M) {
            c(this.B, this.b, this.T, true);
        }
        this.c0 = !this.b0;
    }
}
