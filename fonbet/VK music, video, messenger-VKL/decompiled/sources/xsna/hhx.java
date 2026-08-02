package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InternalImage.kt */
/* loaded from: classes17.dex */
public final class hhx {

    /* compiled from: InternalImage.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeAlignment.values().length];
            try {
                iArr[BadgeAlignment.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeAlignment.TopRight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeAlignment.BottomLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeAlignment.BottomRight.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final efj efjVar, final r5j0 r5j0Var, final r5j0 r5j0Var2, final float f, final List list, final k18 k18Var, final z190 z190Var, final boolean z, final wzs wzsVar, final q630 q630Var, boolean z2, gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        r5j0 r5j0Var3;
        r5j0 r5j0Var4;
        List list2;
        k18 k18Var2;
        z190 z190Var2;
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(1438188352);
        if ((i & 6) == 0) {
            i4 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            r5j0Var3 = r5j0Var;
            i4 |= M.J(r5j0Var3) ? 32 : 16;
        } else {
            r5j0Var3 = r5j0Var;
        }
        if ((i & 384) == 0) {
            r5j0Var4 = r5j0Var2;
            i4 |= M.J(r5j0Var4) ? 256 : 128;
        } else {
            r5j0Var4 = r5j0Var2;
        }
        if ((i & 3072) == 0) {
            i4 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            list2 = list;
            i4 |= M.J(list2) ? 16384 : 8192;
        } else {
            list2 = list;
        }
        if ((196608 & i) == 0) {
            k18Var2 = k18Var;
            i4 |= M.J(k18Var2) ? 131072 : 65536;
        } else {
            k18Var2 = k18Var;
        }
        if ((1572864 & i) == 0) {
            z190Var2 = z190Var;
            i4 |= M.J(z190Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z190Var2 = z190Var;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.l(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= M.y(wzsVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= M.J(q630Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i7 = i3 & 1024;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (M.l(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2048;
        if (i8 != 0) {
            i5 |= 48;
            i6 = i8;
        } else if ((i2 & 48) == 0) {
            i6 = i8;
            i5 |= M.y(gzsVar) ? 32 : 16;
        } else {
            i6 = i8;
        }
        int i9 = i5;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i9 & 19) == 18) ? false : true)) {
            boolean z4 = i7 != 0 ? true : z2;
            gzs gzsVar3 = i6 != 0 ? null : gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1438188352, i4, i9, "com.vk.core.compose.component.internal.InternalImage (InternalImage.kt:51)");
            }
            aVar2 = M;
            b(efjVar, r5j0Var3, r5j0Var4, byc0.b(f, f), list2, k18Var2, z190Var2, z, wzsVar, q630Var, z4, gzsVar3, aVar2, i4 & 2147476478, i9 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z3 = z4;
            gzsVar2 = gzsVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            z3 = z2;
            gzsVar2 = gzsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fhx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    hhx.a(efj.this, r5j0Var, r5j0Var2, f, list, k18Var, z190Var, z, wzsVar, q630Var, z3, gzsVar2, (androidx.compose.runtime.a) obj, I, I2, i3);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0302, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final efj efjVar, final r5j0 r5j0Var, final r5j0 r5j0Var2, long j, final List list, final k18 k18Var, final z190 z190Var, final boolean z, final wzs wzsVar, final q630 q630Var, boolean z2, gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        final boolean z4;
        final gzs gzsVar2;
        androidx.compose.runtime.f s;
        q630.a aVar2;
        q630 q630Var2;
        q630 a2;
        ty6 ty6Var;
        q630 g;
        final long j2 = j;
        androidx.compose.runtime.a M = aVar.M(-973737567);
        if ((i & 6) == 0) {
            i4 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.J(r5j0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.p(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.J(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= M.J(k18Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= M.J(z190Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.l(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= M.y(wzsVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= M.J(q630Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            i6 = i2 | 6;
            i5 = i8;
        } else if ((i2 & 6) == 0) {
            i5 = i8;
            i6 = i2 | (M.l(z2) ? 4 : 2);
        } else {
            i5 = i8;
            i6 = i2;
        }
        int i9 = i3 & 2048;
        if (i9 != 0) {
            i6 |= 48;
            i7 = i9;
        } else if ((i2 & 48) == 0) {
            i7 = i9;
            i6 |= M.y(gzsVar) ? 32 : 16;
        } else {
            i7 = i9;
        }
        int i10 = i6;
        if ((i4 & 306783379) == 306783378 && (i10 & 19) == 18) {
            z3 = false;
            if (M.t(i4 & 1, z3)) {
                M.h();
                z4 = z2;
                gzsVar2 = gzsVar;
            } else {
                boolean z5 = i5 != 0 ? true : z2;
                gzs gzsVar3 = i7 != 0 ? null : gzsVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-973737567, i4, i10, "com.vk.core.compose.component.internal.InternalImage (InternalImage.kt:83)");
                }
                int i11 = (i4 >> 9) & 14;
                int i12 = i4 >> 12;
                float b = k18Var.b(i11 | (i12 & 112), j2, M) * 2;
                long floatToRawIntBits = (Float.floatToRawIntBits(uco.c(j2) + b) << 32) | (Float.floatToRawIntBits(uco.b(j2) + b) & 4294967295L);
                float f = 0;
                long j3 = z5 ? floatToRawIntBits : j;
                dt1.a.getClass();
                ty6 ty6Var2 = dt1.a.f;
                cp10 d = ja8.d(ty6Var2, false);
                int hashCode = Long.hashCode(n34.n(M));
                long j4 = floatToRawIntBits;
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                int i13 = i4;
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                wzsVar.invoke(M, Integer.valueOf((i13 >> 24) & 14));
                q630.a aVar4 = q630.a.a;
                q630 r = txj0.r(j3, aVar4);
                cp10 d2 = ja8.d(ty6Var2, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                q630.a aVar5 = aVar4;
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, r);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                Iterator a3 = yu50.a(M, c2, dVar, -1622017415, list);
                q630.a aVar6 = aVar5;
                while (a3.hasNext()) {
                    long j5 = j4;
                    q630.a aVar7 = aVar5;
                    int i14 = i13;
                    r5j0 b2 = ((m2k0) a3.next()).b(j, z, M, i11 | ((i13 >> 18) & 112));
                    if (b2 != null && (g = aVar6.g(rte0.d(aVar7, b2))) != null) {
                        aVar6 = g;
                    }
                    aVar5 = aVar7;
                    i13 = i14;
                    j4 = j5;
                }
                long j6 = j4;
                q630.a aVar8 = aVar5;
                int i15 = i13;
                M.j();
                q630 d3 = rte0.d(aVar8, r5j0Var);
                q630 D3 = s200.D(txj0.r(j, aVar8), f);
                f870.A().getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 a4 = r18.a(0.5f, ylu0Var.getImage().a, aVar8, r5j0Var);
                M.K(-1622000793);
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (gzsVar3 != null) {
                    Object x = M.x();
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    q630Var2 = ojc.b(aVar8, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(5), gzsVar3, 8);
                    aVar2 = aVar8;
                } else {
                    aVar2 = aVar8;
                }
                q630Var2 = aVar2;
                M.j();
                efjVar.a(i11 | ((i15 << 6) & 896), j, M, D3.g(d3).g(aVar6).g(a4).g(q630Var2));
                z190Var.a(i11 | (i12 & 896), j, M, D3.g(d3).g(aVar6).g(q630Var2));
                j2 = j;
                k18Var.a(j2, r5j0Var2, (z5 ? txj0.r(j6, aVar2) : txj0.n(aVar2, uco.c(j6), uco.b(j6))).g(aVar6), M, i11 | ((i15 >> 3) & 112) | ((i15 >> 6) & 7168));
                M = M;
                M.G();
                q630 r2 = txj0.r(j2, aVar2);
                dt1.a.getClass();
                cp10 d4 = ja8.d(dt1.a.f, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c3 = qri.c(M, r2);
                cri.h7.getClass();
                LayoutNode.a aVar9 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar9);
                } else {
                    M.f();
                }
                k9q0.w(M, d4, cri.a.f);
                k9q0.w(M, D4, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                M.K(802374232);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m2k0 m2k0Var = (m2k0) it.next();
                    long a5 = m2k0Var.a(j2, z, M, i11 | ((i15 >> 18) & 112));
                    long d5 = m2k0Var.d(j2);
                    q630 r3 = !uco.a(d5, 9205357640488583168L) ? txj0.r(d5, aVar2) : aVar2;
                    if (a5 == 9205357640488583168L) {
                        M.K(1207954908);
                        M.j();
                        int i16 = a.$EnumSwitchMapping$0[m2k0Var.getAlignment().ordinal()];
                        if (i16 == 1) {
                            dt1.a.getClass();
                            ty6Var = dt1.a.b;
                        } else if (i16 == 2) {
                            dt1.a.getClass();
                            ty6Var = dt1.a.d;
                        } else if (i16 == 3) {
                            dt1.a.getClass();
                            ty6Var = dt1.a.h;
                        } else {
                            if (i16 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dt1.a.getClass();
                            ty6Var = dt1.a.j;
                        }
                        a2 = ra8.a.b(aVar2, ty6Var);
                    } else {
                        M.K(1208072956);
                        boolean p = M.p(a5);
                        Object x2 = M.x();
                        if (p || x2 == c0012a) {
                            x2 = new n4b(a5, 3);
                            M.R(x2);
                        }
                        a2 = rdu.a(aVar2, (izs) x2);
                        M.j();
                    }
                    m2k0Var.c(r3.g(a2), M, 0);
                }
                M.j();
                M.G();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z4 = z5;
                gzsVar2 = gzsVar3;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ghx
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        int I2 = ne7.I(i2);
                        hhx.b(efj.this, r5j0Var, r5j0Var2, j2, list, k18Var, z190Var, z, wzsVar, q630Var, z4, gzsVar2, (androidx.compose.runtime.a) obj, I, I2, i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = true;
        if (M.t(i4 & 1, z3)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
