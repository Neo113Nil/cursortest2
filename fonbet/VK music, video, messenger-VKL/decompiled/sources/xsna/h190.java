package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.fgo0;
import xsna.kgo0;
import xsna.q630;

/* compiled from: OutlinedTextField.kt */
/* loaded from: classes11.dex */
public final class h190 {
    public static final float a = 4;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final tho0 tho0Var, final izs izsVar, final q630 q630Var, boolean z, nmo0 nmo0Var, final wzs wzsVar, final wzs wzsVar2, final wzs wzsVar3, final boolean z2, final b6u0 b6u0Var, final rgy rgyVar, uey ueyVar, final boolean z3, int i, int i2, r5j0 r5j0Var, final mfo0 mfo0Var, androidx.compose.runtime.a aVar, final int i3) {
        tho0 tho0Var2;
        int i4;
        izs izsVar2;
        q630 q630Var2;
        wzs wzsVar4;
        final boolean z4;
        final nmo0 nmo0Var2;
        final uey ueyVar2;
        final int i5;
        final int i6;
        final r5j0 r5j0Var2;
        int i7;
        uey ueyVar3;
        int i8;
        int i9;
        r5j0 r5j0Var3;
        nmo0 nmo0Var3;
        int i10;
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(2057288437);
        if ((i3 & 6) == 0) {
            tho0Var2 = tho0Var;
            i4 = (M.J(tho0Var2) ? 4 : 2) | i3;
        } else {
            tho0Var2 = tho0Var;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            izsVar2 = izsVar;
            i4 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        if ((i3 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        int i11 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i11 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            wzsVar4 = wzsVar;
            i11 |= M.y(wzsVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            wzsVar4 = wzsVar;
        }
        if ((12582912 & i3) == 0) {
            i11 |= M.y(wzsVar2) ? 8388608 : 4194304;
        }
        int i12 = i11 | 905969664;
        int i13 = (M.l(z2) ? 2048 : 1024) | 12779958 | (M.J(b6u0Var) ? 16384 : 8192) | 840433664;
        boolean z5 = true;
        if (M.t(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (((M.J(mfo0Var) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                nmo0 nmo0Var4 = (nmo0) M.r(cjo0.a);
                int i14 = i12 & (-458753);
                uey ueyVar4 = uey.d;
                int i15 = z3 ? 1 : Integer.MAX_VALUE;
                int i16 = (-234881025) & i13;
                a190 a190Var = a190.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1066756961, 6, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:887)");
                }
                r5j0 a2 = p6j0.a(k190.b, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i7 = i16;
                ueyVar3 = ueyVar4;
                i8 = 1;
                i9 = i15;
                r5j0Var3 = a2;
                nmo0Var3 = nmo0Var4;
                i10 = i14;
            } else {
                M.h();
                i10 = i12 & (-458753);
                int i17 = (-234881025) & i13;
                z5 = z;
                nmo0Var3 = nmo0Var;
                i9 = i;
                i8 = i2;
                r5j0Var3 = r5j0Var;
                i7 = i17;
                ueyVar3 = ueyVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2057288437, i10, i7, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:560)");
            }
            M.K(-502250010);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.j();
            M.K(1369277167);
            long b = nmo0Var3.b();
            if (b != 16) {
                aVar2 = M;
            } else {
                boolean booleanValue = ((Boolean) sa30.j(sg50Var, M, 0).getValue()).booleanValue();
                if (z5) {
                    aVar2 = M;
                    j = z2 ? mfo0Var.d : booleanValue ? mfo0Var.a : mfo0Var.b;
                } else {
                    aVar2 = M;
                    j = mfo0Var.c;
                }
                b = j;
            }
            long j2 = b;
            aVar2.j();
            nmo0 d = nmo0Var3.d(new nmo0(j2, 0L, null, null, 0L, null, null, 0, 0L, null, null, 0, 16777214));
            c9e0 b2 = rlo0.a.b(mfo0Var.k);
            nmo0 nmo0Var5 = nmo0Var3;
            wzs wzsVar5 = wzsVar4;
            izs izsVar3 = izsVar2;
            boolean z6 = z5;
            g190 g190Var = new g190(q630Var2, wzsVar5, z2, mfo0Var, tho0Var2, izsVar3, z6, d, rgyVar, ueyVar3, z3, i9, i8, b6u0Var, sg50Var, wzsVar2, wzsVar3, r5j0Var3);
            M = aVar2;
            rvi.a(b2, kai.c(-2094276683, g190Var, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z4 = z6;
            i5 = i9;
            i6 = i8;
            r5j0Var2 = r5j0Var3;
            nmo0Var2 = nmo0Var5;
            ueyVar2 = ueyVar3;
        } else {
            M.h();
            z4 = z;
            nmo0Var2 = nmo0Var;
            ueyVar2 = ueyVar;
            i5 = i;
            i6 = i2;
            r5j0Var2 = r5j0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.c190
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    h190.a(tho0.this, izsVar, q630Var, z4, nmo0Var2, wzsVar, wzsVar2, wzsVar3, z2, b6u0Var, rgyVar, ueyVar2, z3, i5, i6, r5j0Var2, mfo0Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0590, code lost:
    
        if (r3.y(r0) != false) goto L275;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0627  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final wzs wzsVar, final yzs yzsVar, wzs wzsVar2, final wzs wzsVar3, final wzs wzsVar4, final wzs wzsVar5, wzs wzsVar6, final boolean z, final kgo0.b bVar, final fgo0.b bVar2, final izs izsVar, final jai jaiVar, wzs wzsVar7, final s890 s890Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        wzs wzsVar8;
        wzs wzsVar9;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        int i5;
        q630.a aVar3;
        int i6;
        int i7;
        dt1.c cVar;
        int i8;
        float f;
        Object obj;
        boolean z2;
        Object x;
        final wzs wzsVar10 = wzsVar6;
        androidx.compose.runtime.a M = aVar.M(753699262);
        int i9 = i & 6;
        q630.a aVar4 = q630.a.a;
        if (i9 == 0) {
            i3 = i | (M.J(aVar4) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(yzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(wzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(wzsVar3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.y(wzsVar4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.y(wzsVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.y(wzsVar10) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(bVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? M.J(bVar2) : M.y(bVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.y(wzsVar7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(s890Var) ? 16384 : 8192;
        }
        int i11 = i4;
        if (M.t(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 9363) == 9362) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(753699262, i10, i11, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:659)");
            }
            float f2 = fgo0.f(M);
            int i12 = i11 & 14;
            boolean n = ((i11 & 57344) == 16384) | ((i11 & 112) == 32) | ((234881024 & i10) == 67108864) | ((1879048192 & i10) == 536870912) | (i12 == 4 || ((i11 & 8) != 0 && M.J(bVar2))) | M.n(f2);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (n || x2 == c0012a2) {
                c0012a = c0012a2;
                i5 = i12;
                aVar3 = aVar4;
                i6 = i11;
                aVar2 = M;
                j190 j190Var = new j190(izsVar, z, bVar, bVar2, s890Var, f2);
                aVar2.R(j190Var);
                x2 = j190Var;
            } else {
                c0012a = c0012a2;
                aVar2 = M;
                i5 = i12;
                aVar3 = aVar4;
                i6 = i11;
            }
            j190 j190Var2 = (j190) x2;
            LayoutDirection layoutDirection = (LayoutDirection) aVar2.r(uvi.n);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(aVar2, j190Var2, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar2, D, eVar);
            cri.a.b bVar3 = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar3);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar2, c, dVar);
            jaiVar.invoke(aVar2, Integer.valueOf((i6 >> 6) & 14));
            if (wzsVar3 != null) {
                aVar2.K(2145628269);
                q630 g = vua0.u(aVar3, "Leading").g(zr20.a);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int m2 = n34.m(aVar2);
                sy90 D2 = aVar2.D();
                q630 c2 = qri.c(aVar2, g);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d, cVar2);
                k9q0.w(aVar2, D2, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m2))) {
                    kr.a(m2, aVar2, m2, bVar3);
                }
                k9q0.w(aVar2, c2, dVar);
                wzsVar3.invoke(aVar2, Integer.valueOf((i10 >> 12) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(2145874285);
                aVar2.j();
            }
            if (wzsVar4 != null) {
                aVar2.K(2145917003);
                q630 g2 = vua0.u(aVar3, "Trailing").g(zr20.a);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int m3 = n34.m(aVar2);
                sy90 D3 = aVar2.D();
                q630 c3 = qri.c(aVar2, g2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d2, cVar2);
                k9q0.w(aVar2, D3, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m3))) {
                    kr.a(m3, aVar2, m3, bVar3);
                }
                k9q0.w(aVar2, c3, dVar);
                wzsVar4.invoke(aVar2, Integer.valueOf((i10 >> 15) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(2146164941);
                aVar2.j();
            }
            float s = s200.s(s890Var, layoutDirection);
            float r = s200.r(s890Var, layoutDirection);
            if (wzsVar3 != null) {
                s -= f2;
                i7 = 0;
                float f3 = 0;
                if (s < f3) {
                    s = f3;
                }
            } else {
                i7 = 0;
            }
            float f4 = s;
            if (wzsVar4 != null) {
                r -= f2;
                float f5 = i7;
                if (r < f5) {
                    r = f5;
                }
            }
            float f6 = r;
            if (wzsVar5 != null) {
                aVar2.K(2146868920);
                q630 H = s200.H(txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Prefix")), null, 3), f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fgo0.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                dt1.a.getClass();
                cp10 d3 = ja8.d(dt1.a.b, false);
                int m4 = n34.m(aVar2);
                sy90 D4 = aVar2.D();
                q630 c4 = qri.c(aVar2, H);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d3, cVar2);
                k9q0.w(aVar2, D4, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m4))) {
                    kr.a(m4, aVar2, m4, bVar3);
                }
                k9q0.w(aVar2, c4, dVar);
                wzsVar5.invoke(aVar2, Integer.valueOf((i10 >> 18) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                aVar2.K(2147196621);
                aVar2.j();
            }
            if (wzsVar6 != null) {
                aVar2.K(2147239866);
                q630 H2 = s200.H(txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Suffix")), null, 3), fgo0.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                dt1.a.getClass();
                cp10 d4 = ja8.d(dt1.a.b, false);
                int m5 = n34.m(aVar2);
                sy90 D5 = aVar2.D();
                q630 c5 = qri.c(aVar2, H2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d4, cVar2);
                k9q0.w(aVar2, D5, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m5))) {
                    kr.a(m5, aVar2, m5, bVar3);
                }
                k9q0.w(aVar2, c5, dVar);
                wzsVar10 = wzsVar6;
                wzsVar10.invoke(aVar2, Integer.valueOf((i10 >> 21) & 14));
                aVar2.G();
                aVar2.j();
                cVar = null;
            } else {
                wzsVar10 = wzsVar6;
                cVar = null;
                aVar2.K(-2147401651);
                aVar2.j();
            }
            q630 z3 = txj0.z(txj0.j(fgo0.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), cVar, 3);
            if (wzsVar5 == null) {
                f = f4;
                i8 = 0;
            } else {
                i8 = 0;
                f = 0;
            }
            q630 H3 = s200.H(z3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wzsVar10 == null ? f6 : i8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (yzsVar != null) {
                aVar2.K(-2147031666);
                yzsVar.invoke(vua0.u(aVar3, "Hint").g(H3), aVar2, Integer.valueOf((i10 >> 3) & 112));
                aVar2.j();
            } else {
                aVar2.K(-2146940371);
                aVar2.j();
            }
            q630 g3 = vua0.u(aVar3, "TextField").g(H3);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d5 = ja8.d(ty6Var, true);
            int m6 = n34.m(aVar2);
            sy90 D6 = aVar2.D();
            q630 c6 = qri.c(aVar2, g3);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d5, cVar2);
            k9q0.w(aVar2, D6, eVar);
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m6))) {
                kr.a(m6, aVar2, m6, bVar3);
            }
            k9q0.w(aVar2, c6, dVar);
            wzsVar.invoke(aVar2, Integer.valueOf((i10 >> 3) & 14));
            aVar2.G();
            if (wzsVar2 != null) {
                aVar2.K(-2146287790);
                if (i5 != 4) {
                    if ((i6 & 8) != 0) {
                        obj = bVar2;
                    } else {
                        obj = bVar2;
                    }
                    z2 = false;
                    x = aVar2.x();
                    if (!z2 || x == c0012a) {
                        x = new k7z(obj, 16);
                        aVar2.R(x);
                    }
                    q630 g4 = vua0.u(txj0.z(dd80.i(aVar3, new he30((gzs) x, 2)), null, 3), "Label").g(aVar3);
                    cp10 d6 = ja8.d(ty6Var, false);
                    int m7 = n34.m(aVar2);
                    sy90 D7 = aVar2.D();
                    q630 c7 = qri.c(aVar2, g4);
                    if (aVar2.N() != null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d6, cVar2);
                    k9q0.w(aVar2, D7, eVar);
                    if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m7))) {
                        kr.a(m7, aVar2, m7, bVar3);
                    }
                    k9q0.w(aVar2, c7, dVar);
                    wzsVar8 = wzsVar2;
                    wzsVar8.invoke(aVar2, Integer.valueOf((i10 >> 9) & 14));
                    aVar2.G();
                    aVar2.j();
                } else {
                    obj = bVar2;
                }
                z2 = true;
                x = aVar2.x();
                if (!z2) {
                }
                x = new k7z(obj, 16);
                aVar2.R(x);
                q630 g42 = vua0.u(txj0.z(dd80.i(aVar3, new he30((gzs) x, 2)), null, 3), "Label").g(aVar3);
                cp10 d62 = ja8.d(ty6Var, false);
                int m72 = n34.m(aVar2);
                sy90 D72 = aVar2.D();
                q630 c72 = qri.c(aVar2, g42);
                if (aVar2.N() != null) {
                }
            } else {
                wzsVar8 = wzsVar2;
                aVar2.K(-2145892819);
                aVar2.j();
            }
            if (wzsVar7 != null) {
                aVar2.K(-2145844304);
                q630 C = s200.C(txj0.z(txj0.j(fgo0.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, vua0.u(aVar3, "Supporting")), null, 3), qfo0.a());
                cp10 d7 = ja8.d(ty6Var, false);
                int m8 = n34.m(aVar2);
                sy90 D8 = aVar2.D();
                q630 c8 = qri.c(aVar2, C);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar5);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d7, cVar2);
                k9q0.w(aVar2, D8, eVar);
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m8))) {
                    kr.a(m8, aVar2, m8, bVar3);
                }
                k9q0.w(aVar2, c8, dVar);
                wzsVar9 = wzsVar7;
                wzsVar9.invoke(aVar2, Integer.valueOf((i6 >> 9) & 14));
                aVar2.G();
                aVar2.j();
            } else {
                wzsVar9 = wzsVar7;
                aVar2.K(-2145508915);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wzsVar8 = wzsVar2;
            wzsVar9 = wzsVar7;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            final wzs wzsVar11 = wzsVar8;
            final wzs wzsVar12 = wzsVar9;
            s2.d = new wzs() { // from class: xsna.d190
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    h190.b(wzs.this, yzsVar, wzsVar11, wzsVar3, wzsVar4, wzsVar5, wzsVar10, z, bVar, bVar2, izsVar, jaiVar, wzsVar12, s890Var, (androidx.compose.runtime.a) obj2, I, I2);
                    return s3q0.a;
                }
            };
        }
    }
}
