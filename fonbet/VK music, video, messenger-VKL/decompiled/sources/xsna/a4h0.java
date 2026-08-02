package xsna;

import androidx.compose.material.DrawerValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.NetError;
import xsna.q630;
import xsna.tra0;

/* compiled from: Scaffold.kt */
/* loaded from: classes11.dex */
public final class a4h0 {
    public static final iyk0 a = new iyk0(new l63(27));
    public static final float b = 16;

    public static final void a(q630 q630Var, e4h0 e4h0Var, wzs wzsVar, final jai jaiVar, yzs yzsVar, wzs wzsVar2, int i, boolean z, r5j0 r5j0Var, float f, long j, long j2, long j3, final long j4, long j5, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final e4h0 e4h0Var2;
        final wzs wzsVar3;
        final yzs yzsVar2;
        final wzs wzsVar4;
        final int i3;
        final boolean z2;
        final r5j0 r5j0Var2;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        e4h0 e4h0Var3;
        wzs wzsVar5;
        int i4;
        long c;
        long a2;
        int i5;
        q630 q630Var3;
        androidx.compose.runtime.a aVar3;
        int i6;
        long j10;
        long j11;
        int i7;
        androidx.compose.runtime.a M = aVar.M(1135600301);
        int i8 = i2 | 920347030;
        int i9 = (M.p(j4) ? 131072 : 65536) | 13116594;
        if (M.t(i8 & 1, ((306783379 & i8) == 306783378 && (4793491 & i9) == 4793490) ? false : true)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                klo a3 = jlo.a(DrawerValue.Closed, M);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new e8k0();
                    M.R(x);
                }
                e8k0 e8k0Var = (e8k0) x;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1569641925, 0, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new e4h0(a3, e8k0Var);
                    M.R(x2);
                }
                e4h0Var3 = (e4h0) x2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i10 = i8 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                jai jaiVar3 = sua.c;
                jai jaiVar4 = sua.d;
                wzsVar5 = sua.e;
                if (androidx.compose.runtime.b.d()) {
                    i4 = -3735439;
                    androidx.compose.runtime.b.f(-1586253541, 6, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:109)");
                } else {
                    i4 = -3735439;
                }
                o6j0 o6j0Var = (o6j0) M.r(q6j0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                uog0 uog0Var = o6j0Var.c;
                float f3 = ilo.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                }
                k9g k9gVar = (k9g) M.r(l9g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = k9gVar.c();
                a2 = l9g.a(0, c, M);
                if (androidx.compose.runtime.b.d()) {
                    i5 = i10;
                    androidx.compose.runtime.b.f(617225966, 6, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:715)");
                } else {
                    i5 = i10;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
                }
                k9g k9gVar2 = (k9g) M.r(l9g.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long c2 = l5g.c(14, k9gVar2.a(), 0.32f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long a4 = l9g.a((((-65423) & i9) >> 15) & 14, j4, M);
                q630Var3 = q630.a.a;
                aVar3 = M;
                wzsVar3 = jaiVar3;
                f2 = f3;
                i6 = i9 & i4;
                yzsVar2 = jaiVar4;
                j10 = a4;
                j11 = c2;
                z2 = true;
                r5j0Var2 = uog0Var;
                i3 = 2;
                i7 = i5;
            } else {
                M.h();
                i7 = i8 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                q630Var3 = q630Var;
                e4h0Var3 = e4h0Var;
                wzsVar5 = wzsVar2;
                i3 = i;
                z2 = z;
                r5j0Var2 = r5j0Var;
                f2 = f;
                c = j;
                a2 = j2;
                j11 = j3;
                j10 = j5;
                aVar3 = M;
                i6 = i9 & (-3735439);
                wzsVar3 = wzsVar;
                yzsVar2 = yzsVar;
            }
            aVar3.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1135600301, i7, i6, "androidx.compose.material.Scaffold (Scaffold.kt:323)");
            }
            float f4 = 0;
            umr umrVar = new umr(f4, f4, f4, f4);
            int i11 = ((i6 << 3) & 3670016) | 100663686;
            q630Var2 = q630Var3;
            e4h0Var2 = e4h0Var3;
            wzsVar4 = wzsVar5;
            j6 = c;
            j8 = j11;
            aVar2 = aVar3;
            j7 = a2;
            j9 = j10;
            b(umrVar, q630Var2, e4h0Var2, wzsVar3, jaiVar, yzsVar2, wzsVar4, i3, z2, r5j0Var2, f2, j6, j7, j8, j4, j9, jaiVar2, aVar2, 920349744, i11);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            e4h0Var2 = e4h0Var;
            wzsVar3 = wzsVar;
            yzsVar2 = yzsVar;
            wzsVar4 = wzsVar2;
            i3 = i;
            z2 = z;
            r5j0Var2 = r5j0Var;
            f2 = f;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j5;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(e4h0Var2, wzsVar3, jaiVar, yzsVar2, wzsVar4, i3, z2, r5j0Var2, f2, j6, j7, j8, j4, j9, jaiVar2, i2) { // from class: xsna.j3h0
                public final /* synthetic */ e4h0 c;
                public final /* synthetic */ wzs d;
                public final /* synthetic */ jai e;
                public final /* synthetic */ yzs f;
                public final /* synthetic */ wzs g;
                public final /* synthetic */ int h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ r5j0 j;
                public final /* synthetic */ float k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;
                public final /* synthetic */ jai q;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    a4h0.a(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final umr umrVar, q630 q630Var, final e4h0 e4h0Var, final wzs wzsVar, final jai jaiVar, final yzs yzsVar, final wzs wzsVar2, final int i, final boolean z, final r5j0 r5j0Var, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        wzs wzsVar3;
        int i5;
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(50073903);
        if ((i2 & 6) == 0) {
            i4 = (M.J(umrVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.J(e4h0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wzsVar3 = wzsVar;
            i4 |= M.y(wzsVar3) ? 2048 : 1024;
        } else {
            wzsVar3 = wzsVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= M.y(yzsVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= M.y(wzsVar2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= M.o(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= M.l(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= M.y(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (M.l(z) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= M.n(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= M.p(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= M.p(j2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= M.p(j3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= M.p(j4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= M.p(j5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= M.y(jaiVar2) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (38347923 & i6) == 38347922) ? false : true)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(50073903, i4, i6, "androidx.compose.material.Scaffold (Scaffold.kt:197)");
            }
            boolean z2 = (i4 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new ii50(umrVar);
                M.R(x);
            }
            final ii50 ii50Var = (ii50) x;
            aVar2 = M;
            final wzs wzsVar4 = wzsVar3;
            jai c = kai.c(-1236753028, new yzs() { // from class: xsna.l3h0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var3 = (q630) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var3) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1236753028, intValue, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
                        }
                        final ii50 ii50Var2 = ii50.this;
                        boolean J = aVar3.J(ii50Var2);
                        umr umrVar2 = umrVar;
                        boolean J2 = J | aVar3.J(umrVar2);
                        Object x2 = aVar3.x();
                        if (J2 || x2 == a.C0011a.a) {
                            x2 = new d50(22, ii50Var2, umrVar2);
                            aVar3.R(x2);
                        }
                        q630 m = tci.m(q630Var3, (izs) x2);
                        final int i7 = i;
                        final wzs wzsVar5 = wzsVar4;
                        final jai jaiVar3 = jaiVar2;
                        final wzs wzsVar6 = wzsVar2;
                        final jai jaiVar4 = jaiVar;
                        final yzs yzsVar2 = yzsVar;
                        final e4h0 e4h0Var2 = e4h0Var;
                        yjn0.a(m, null, j4, j5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1761194824, new wzs() { // from class: xsna.p3h0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1761194824, intValue2, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                                    }
                                    a4h0.c(i7, wzsVar5, jaiVar3, kai.c(545329543, new q2(7, yzsVar2, e4h0Var2), aVar4), wzsVar6, ii50Var2, jaiVar4, aVar4, 24576);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 1572864, 50);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, aVar2);
            aVar2.K(1400739380);
            q630Var2 = q630Var;
            c.invoke(q630Var2, aVar2, Integer.valueOf(((i4 >> 3) & 14) | 48));
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n3h0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    int I2 = ne7.I(i3);
                    a4h0.b(umr.this, q630Var2, e4h0Var, wzsVar, jaiVar, yzsVar, wzsVar2, i, z, r5j0Var, f, j, j2, j3, j4, j5, jaiVar2, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, final wzs wzsVar, final jai jaiVar, final jai jaiVar2, final wzs wzsVar2, final zpx0 zpx0Var, final jai jaiVar3, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(675142332);
        int i3 = i2 | (M.l(false) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128) | (M.y(jaiVar) ? 2048 : 1024) | (M.y(wzsVar2) ? 131072 : 65536) | (M.J(zpx0Var) ? 1048576 : 524288) | (M.y(jaiVar3) ? 8388608 : 4194304);
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(675142332, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:379)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new v3h0();
                M.R(x);
            }
            final v3h0 v3h0Var = (v3h0) x;
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                wzs wzsVar3 = new wzs() { // from class: xsna.q3h0
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0259 A[LOOP:3: B:50:0x0257->B:51:0x0259, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0279  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x02a5  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x02af  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x02d1  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x02f2  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x035d A[LOOP:4: B:76:0x035b->B:77:0x035d, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x02e6  */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce  */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x02ac  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x027b  */
                    @Override // xsna.wzs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        zpx0 zpx0Var2;
                        Object obj4;
                        ghq ghqVar;
                        final ArrayList arrayList;
                        int size;
                        int i4;
                        Object obj5;
                        Integer num;
                        int size2;
                        int i5;
                        Object obj6;
                        Object obj7;
                        int i6;
                        int i7;
                        int r0;
                        ztm0 ztm0Var = (ztm0) obj;
                        o6j o6jVar = (o6j) obj2;
                        float f = a4h0.b;
                        int i8 = o6j.i(o6jVar.a);
                        final int h = o6j.h(o6jVar.a);
                        long b2 = o6j.b(0, o6jVar.a, 0, 0, 0, 10);
                        List<zo10> t1 = ztm0Var.t1(d4h0.TopBar, wzs.this);
                        ArrayList arrayList2 = new ArrayList(t1.size());
                        for (int i9 = 0; i9 < t1.size(); i9 = rf3.a(t1.get(i9), b2, arrayList2, i9, 1)) {
                        }
                        int i10 = 1;
                        if (arrayList2.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList2.get(0);
                            int i11 = ((tra0) obj3).c;
                            int h2 = e43.h(arrayList2);
                            if (1 <= h2) {
                                int i12 = 1;
                                while (true) {
                                    Object obj8 = arrayList2.get(i12);
                                    int i13 = ((tra0) obj8).c;
                                    if (i11 < i13) {
                                        i11 = i13;
                                        obj3 = obj8;
                                    }
                                    if (i12 == h2) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        }
                        tra0 tra0Var = (tra0) obj3;
                        final int i14 = tra0Var != null ? tra0Var.c : 0;
                        List<zo10> t12 = ztm0Var.t1(d4h0.Snackbar, jaiVar2);
                        ArrayList arrayList3 = new ArrayList(t12.size());
                        int size3 = t12.size();
                        int i15 = 0;
                        while (true) {
                            zpx0Var2 = zpx0Var;
                            if (i15 >= size3) {
                                break;
                            }
                            ArrayList arrayList4 = arrayList3;
                            i15 = rf3.a(t12.get(i15), s6j.i((-zpx0Var2.d(ztm0Var, ztm0Var.getLayoutDirection())) - zpx0Var2.b(ztm0Var, ztm0Var.getLayoutDirection()), -zpx0Var2.a(ztm0Var), b2), arrayList4, i15, 1);
                            arrayList3 = arrayList4;
                            i10 = 1;
                        }
                        final ArrayList arrayList5 = arrayList3;
                        ArrayList arrayList6 = arrayList2;
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int i16 = ((tra0) obj4).c;
                            int h3 = e43.h(arrayList5);
                            if (i10 <= h3) {
                                int i17 = i10;
                                while (true) {
                                    Object obj9 = arrayList5.get(i17);
                                    int i18 = ((tra0) obj9).c;
                                    if (i16 < i18) {
                                        i16 = i18;
                                        obj4 = obj9;
                                    }
                                    if (i17 == h3) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        }
                        tra0 tra0Var2 = (tra0) obj4;
                        int i19 = tra0Var2 != null ? tra0Var2.c : 0;
                        List<zo10> t13 = ztm0Var.t1(d4h0.Fab, wzsVar2);
                        final ArrayList arrayList7 = new ArrayList(t13.size());
                        int size4 = t13.size();
                        int i20 = 0;
                        while (i20 < size4) {
                            i20 = rf3.a(t13.get(i20), s6j.i((-zpx0Var2.d(ztm0Var, ztm0Var.getLayoutDirection())) - zpx0Var2.b(ztm0Var, ztm0Var.getLayoutDirection()), -zpx0Var2.a(ztm0Var), b2), arrayList7, i20, 1);
                            i19 = i19;
                            arrayList6 = arrayList6;
                        }
                        int i21 = i19;
                        final ArrayList arrayList8 = arrayList6;
                        if (!arrayList7.isEmpty()) {
                            if (arrayList7.isEmpty()) {
                                obj6 = null;
                            } else {
                                obj6 = arrayList7.get(0);
                                int i22 = ((tra0) obj6).b;
                                int h4 = e43.h(arrayList7);
                                if (1 <= h4) {
                                    int i23 = 1;
                                    while (true) {
                                        Object obj10 = arrayList7.get(i23);
                                        int i24 = ((tra0) obj10).b;
                                        if (i22 < i24) {
                                            i22 = i24;
                                            obj6 = obj10;
                                        }
                                        if (i23 == h4) {
                                            break;
                                        }
                                        i23++;
                                    }
                                }
                            }
                            tra0 tra0Var3 = (tra0) obj6;
                            int i25 = tra0Var3 != null ? tra0Var3.b : 0;
                            if (arrayList7.isEmpty()) {
                                i6 = i25;
                                obj7 = null;
                            } else {
                                obj7 = arrayList7.get(0);
                                int i26 = ((tra0) obj7).c;
                                int h5 = e43.h(arrayList7);
                                if (1 <= h5) {
                                    int i27 = 1;
                                    while (true) {
                                        Object obj11 = arrayList7.get(i27);
                                        i6 = i25;
                                        int i28 = ((tra0) obj11).c;
                                        if (i26 < i28) {
                                            i26 = i28;
                                            obj7 = obj11;
                                        }
                                        if (i27 == h5) {
                                            break;
                                        }
                                        i27++;
                                        i25 = i6;
                                    }
                                } else {
                                    i6 = i25;
                                }
                            }
                            tra0 tra0Var4 = (tra0) obj7;
                            int i29 = tra0Var4 != null ? tra0Var4.c : 0;
                            if (i6 != 0 && i29 != 0) {
                                int i30 = i;
                                if (i30 != 0) {
                                    if (i30 != 2) {
                                        i7 = (i8 - i6) / 2;
                                    } else if (ztm0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                        r0 = ztm0Var.r0(f);
                                        i7 = (i8 - r0) - i6;
                                    } else {
                                        i7 = ztm0Var.r0(f);
                                    }
                                    ghqVar = new ghq(i7, i29);
                                } else if (ztm0Var.getLayoutDirection() == LayoutDirection.Ltr) {
                                    i7 = ztm0Var.r0(f);
                                    ghqVar = new ghq(i7, i29);
                                } else {
                                    r0 = ztm0Var.r0(f);
                                    i7 = (i8 - r0) - i6;
                                    ghqVar = new ghq(i7, i29);
                                }
                                int i31 = 1;
                                List<zo10> t14 = ztm0Var.t1(d4h0.BottomBar, new jai(-502652347, new y61(10, ghqVar, jaiVar3), true));
                                arrayList = new ArrayList(t14.size());
                                size = t14.size();
                                i4 = 0;
                                while (i4 < size) {
                                    int i32 = i31;
                                    zpx0Var2 = zpx0Var2;
                                    i4 = rf3.a(t14.get(i4), b2, arrayList, i4, i32);
                                    i31 = i32;
                                }
                                zpx0 zpx0Var3 = zpx0Var2;
                                int i33 = i31;
                                if (arrayList.isEmpty()) {
                                    obj5 = arrayList.get(0);
                                    int i34 = ((tra0) obj5).c;
                                    int h6 = e43.h(arrayList);
                                    if (i33 <= h6) {
                                        int i35 = i33;
                                        while (true) {
                                            Object obj12 = arrayList.get(i35);
                                            int i36 = ((tra0) obj12).c;
                                            if (i34 < i36) {
                                                i34 = i36;
                                                obj5 = obj12;
                                            }
                                            if (i35 == h6) {
                                                break;
                                            }
                                            i35++;
                                        }
                                    }
                                } else {
                                    obj5 = null;
                                }
                                tra0 tra0Var5 = (tra0) obj5;
                                Integer valueOf = tra0Var5 == null ? Integer.valueOf(tra0Var5.c) : null;
                                if (ghqVar == null) {
                                    int i37 = ghqVar.b;
                                    num = Integer.valueOf(valueOf == null ? zpx0Var3.a(ztm0Var) + ztm0Var.r0(f) + i37 : ztm0Var.r0(f) + valueOf.intValue() + i37);
                                } else {
                                    num = null;
                                }
                                int intValue = i21 == 0 ? i21 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : zpx0Var3.a(ztm0Var)) : 0;
                                r4x r4xVar = new r4x(zpx0Var3, ztm0Var);
                                final Integer num2 = valueOf;
                                u890 u890Var = new u890(s200.s(r4xVar, ztm0Var.getLayoutDirection()), !arrayList8.isEmpty() ? r4xVar.d() : 0, s200.r(r4xVar, ztm0Var.getLayoutDirection()), (!arrayList.isEmpty() || valueOf == null) ? r4xVar.b() : ztm0Var.j1(valueOf.intValue()));
                                v3h0 v3h0Var2 = v3h0Var;
                                ((zak0) v3h0Var2.a).setValue(u890Var);
                                int i38 = h - i14;
                                int i39 = 1;
                                List<zo10> t15 = ztm0Var.t1(d4h0.MainContent, new jai(-574531306, new ys0(5, jaiVar, v3h0Var2), true));
                                final ArrayList arrayList9 = new ArrayList(t15.size());
                                size2 = t15.size();
                                i5 = 0;
                                while (i5 < size2) {
                                    int i40 = i39;
                                    ArrayList arrayList10 = arrayList9;
                                    i5 = rf3.a(t15.get(i5), o6j.b(0, b2, 0, 0, i38, 7), arrayList10, i5, i40);
                                    i38 = i38;
                                    arrayList9 = arrayList10;
                                    i39 = i40;
                                }
                                final int i41 = intValue;
                                final Integer num3 = num;
                                final ghq ghqVar2 = ghqVar;
                                return ztm0Var.Q(i8, h, jgp.b, new izs() { // from class: xsna.h3h0
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj13) {
                                        int i42;
                                        tra0.a aVar2 = (tra0.a) obj13;
                                        ArrayList arrayList11 = arrayList9;
                                        int size5 = arrayList11.size();
                                        for (int i43 = 0; i43 < size5; i43++) {
                                            aVar2.q((tra0) arrayList11.get(i43), 0, i14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        ArrayList arrayList12 = arrayList8;
                                        int size6 = arrayList12.size();
                                        for (int i44 = 0; i44 < size6; i44++) {
                                            aVar2.q((tra0) arrayList12.get(i44), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        ArrayList arrayList13 = arrayList5;
                                        int size7 = arrayList13.size();
                                        int i45 = 0;
                                        while (true) {
                                            i42 = h;
                                            if (i45 >= size7) {
                                                break;
                                            }
                                            aVar2.q((tra0) arrayList13.get(i45), 0, i42 - i41, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            i45++;
                                        }
                                        ArrayList arrayList14 = arrayList;
                                        int size8 = arrayList14.size();
                                        for (int i46 = 0; i46 < size8; i46++) {
                                            tra0 tra0Var6 = (tra0) arrayList14.get(i46);
                                            Integer num4 = num2;
                                            aVar2.q(tra0Var6, 0, i42 - (num4 != null ? num4.intValue() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        ArrayList arrayList15 = arrayList7;
                                        int size9 = arrayList15.size();
                                        for (int i47 = 0; i47 < size9; i47++) {
                                            tra0 tra0Var7 = (tra0) arrayList15.get(i47);
                                            ghq ghqVar3 = ghqVar2;
                                            int i48 = ghqVar3 != null ? ghqVar3.a : 0;
                                            Integer num5 = num3;
                                            aVar2.q(tra0Var7, i48, i42 - (num5 != null ? num5.intValue() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        }
                                        return s3q0.a;
                                    }
                                });
                            }
                        }
                        ghqVar = null;
                        int i312 = 1;
                        List<zo10> t142 = ztm0Var.t1(d4h0.BottomBar, new jai(-502652347, new y61(10, ghqVar, jaiVar3), true));
                        arrayList = new ArrayList(t142.size());
                        size = t142.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                        zpx0 zpx0Var32 = zpx0Var2;
                        int i332 = i312;
                        if (arrayList.isEmpty()) {
                        }
                        tra0 tra0Var52 = (tra0) obj5;
                        if (tra0Var52 == null) {
                        }
                        if (ghqVar == null) {
                        }
                        if (i21 == 0) {
                        }
                        r4x r4xVar2 = new r4x(zpx0Var32, ztm0Var);
                        final Integer num22 = valueOf;
                        u890 u890Var2 = new u890(s200.s(r4xVar2, ztm0Var.getLayoutDirection()), !arrayList8.isEmpty() ? r4xVar2.d() : 0, s200.r(r4xVar2, ztm0Var.getLayoutDirection()), (!arrayList.isEmpty() || valueOf == null) ? r4xVar2.b() : ztm0Var.j1(valueOf.intValue()));
                        v3h0 v3h0Var22 = v3h0Var;
                        ((zak0) v3h0Var22.a).setValue(u890Var2);
                        int i382 = h - i14;
                        int i392 = 1;
                        List<zo10> t152 = ztm0Var.t1(d4h0.MainContent, new jai(-574531306, new ys0(5, jaiVar, v3h0Var22), true));
                        final ArrayList arrayList92 = new ArrayList(t152.size());
                        size2 = t152.size();
                        i5 = 0;
                        while (i5 < size2) {
                        }
                        final int i412 = intValue;
                        final Integer num32 = num;
                        final ghq ghqVar22 = ghqVar;
                        return ztm0Var.Q(i8, h, jgp.b, new izs() { // from class: xsna.h3h0
                            @Override // xsna.izs
                            public final Object invoke(Object obj13) {
                                int i42;
                                tra0.a aVar2 = (tra0.a) obj13;
                                ArrayList arrayList11 = arrayList92;
                                int size5 = arrayList11.size();
                                for (int i43 = 0; i43 < size5; i43++) {
                                    aVar2.q((tra0) arrayList11.get(i43), 0, i14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                ArrayList arrayList12 = arrayList8;
                                int size6 = arrayList12.size();
                                for (int i44 = 0; i44 < size6; i44++) {
                                    aVar2.q((tra0) arrayList12.get(i44), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                ArrayList arrayList13 = arrayList5;
                                int size7 = arrayList13.size();
                                int i45 = 0;
                                while (true) {
                                    i42 = h;
                                    if (i45 >= size7) {
                                        break;
                                    }
                                    aVar2.q((tra0) arrayList13.get(i45), 0, i42 - i412, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    i45++;
                                }
                                ArrayList arrayList14 = arrayList;
                                int size8 = arrayList14.size();
                                for (int i46 = 0; i46 < size8; i46++) {
                                    tra0 tra0Var6 = (tra0) arrayList14.get(i46);
                                    Integer num4 = num22;
                                    aVar2.q(tra0Var6, 0, i42 - (num4 != null ? num4.intValue() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                ArrayList arrayList15 = arrayList7;
                                int size9 = arrayList15.size();
                                for (int i47 = 0; i47 < size9; i47++) {
                                    tra0 tra0Var7 = (tra0) arrayList15.get(i47);
                                    ghq ghqVar3 = ghqVar22;
                                    int i48 = ghqVar3 != null ? ghqVar3.a : 0;
                                    Integer num5 = num32;
                                    aVar2.q(tra0Var7, i48, i42 - (num5 != null ? num5.intValue() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(wzsVar3);
                x2 = wzsVar3;
            }
            xtm0.a(null, (wzs) x2, M, 0, 1);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j7d(i, wzsVar, jaiVar, jaiVar2, wzsVar2, zpx0Var, jaiVar3, i2);
        }
    }
}
