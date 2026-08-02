package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dak0;
import xsna.dt1;
import xsna.q630;
import xsna.wlp0;

/* compiled from: InternalDropdown.kt */
/* loaded from: classes17.dex */
public final class rgx {
    public static final void a(wh50 wh50Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(7536159);
        if ((i & 6) == 0) {
            i2 = (M.J(wh50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(false) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(7536159, i2, -1, "com.vk.core.compose.component.internal.CaptureDropdownBackground (InternalDropdown.kt:149)");
            }
            if (oq.h(1165141955, M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ioa(wh50Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void b(bi50 bi50Var, wh50 wh50Var, q630 q630Var, r5j0 r5j0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object B;
        wlp0 wlp0Var;
        ?? r1;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1514809225);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(bi50Var) : M.y(bi50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(wh50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(r5j0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1514809225, i2, -1, "com.vk.core.compose.component.internal.DropdownMenuContent (InternalDropdown.kt:434)");
            }
            dtp0 d = jq2.d(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0, luo.b, 2);
            dtp0 d2 = jq2.d(150, 0, luo.c, 2);
            wlp0 f = ump0.f(bi50Var, "DropDownMenu", M, (i2 & 14) | 48);
            jtp0 jtp0Var = rte0.e;
            boolean g = f.g();
            z46 z46Var = f.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (g) {
                M.K(1666827533);
                M.j();
                B = z46Var.B();
            } else {
                M.K(1666573488);
                boolean J = M.J(f);
                B = M.x();
                if (J || B == c0012a) {
                    dak0 a = dak0.a.a();
                    izs<Object, s3q0> e = a != null ? a.e() : null;
                    dak0 b = dak0.a.b(a);
                    try {
                        Object B2 = z46Var.B();
                        dak0.a.d(a, b, e);
                        M.R(B2);
                        B = B2;
                    } catch (Throwable th) {
                        dak0.a.d(a, b, e);
                        throw th;
                    }
                }
                M.j();
            }
            boolean booleanValue = ((Boolean) B).booleanValue();
            M.K(1658483856);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1658483856, 0, -1, "com.vk.core.compose.component.internal.DropdownMenuContent.<anonymous> (InternalDropdown.kt:449)");
            }
            float f2 = booleanValue ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf = Float.valueOf(f2);
            boolean J2 = M.J(f);
            Object x = M.x();
            if (J2 || x == c0012a) {
                x = bbk0.b(new j6b(f, 2));
                M.R(x);
            }
            boolean booleanValue2 = ((Boolean) ((mtk0) x).getValue()).booleanValue();
            M.K(1658483856);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1658483856, 0, -1, "com.vk.core.compose.component.internal.DropdownMenuContent.<anonymous> (InternalDropdown.kt:449)");
            }
            float f3 = booleanValue2 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Float valueOf2 = Float.valueOf(f3);
            boolean J3 = M.J(f);
            Object x2 = M.x();
            if (J3 || x2 == c0012a) {
                x2 = bbk0.b(new qgx(f));
                M.R(x2);
            }
            wlp0.b bVar = (wlp0.b) ((mtk0) x2).getValue();
            M.K(1125161003);
            if (androidx.compose.runtime.b.d()) {
                wlp0Var = f;
                r1 = 0;
                i3 = -1;
                androidx.compose.runtime.b.f(1125161003, 0, -1, "com.vk.core.compose.component.internal.DropdownMenuContent.<anonymous> (InternalDropdown.kt:447)");
            } else {
                wlp0Var = f;
                r1 = 0;
                i3 = -1;
            }
            dtp0 dtp0Var = bVar.a(Boolean.FALSE, Boolean.TRUE) ? d : d2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            final wlp0.d c = ump0.c(wlp0Var, valueOf, valueOf2, dtp0Var, jtp0Var, M, 196608);
            final float f4 = ((Boolean) wh50Var.getValue()).booleanValue() ? 4 : -4;
            boolean n = M.n(((Number) c.getValue()).floatValue());
            Object x3 = M.x();
            if (n || x3 == c0012a) {
                x3 = new f820(r5j0Var, ((Number) c.getValue()).floatValue(), ((Boolean) wh50Var.getValue()).booleanValue());
                M.R(x3);
            }
            f820 f820Var = (f820) x3;
            boolean n2 = M.n(f4) | M.J(c);
            Object x4 = M.x();
            if (n2 || x4 == c0012a) {
                x4 = new izs() { // from class: xsna.kgx
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tdu tduVar = (tdu) obj;
                        tduVar.n((1.0f - ((Number) c.getValue()).floatValue()) * tduVar.I0(f4));
                        return s3q0.a;
                    }
                };
                M.R(x4);
            }
            q630.a aVar2 = q630.a.a;
            q630 a2 = rdu.a(aVar2, (izs) x4);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, r1);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a2);
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
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 e2 = bu00.e(ra8.a.a(aVar2), new mi10(f820Var, 4));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, r1, i3, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            iyk0 iyk0Var = rrv0.b;
            squ0 squ0Var = (squ0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var.getClass();
            float f5 = tqu0.d;
            long j = udu.a;
            ja8.a(a5j0.a(e2, f5, f820Var, false, l5g.c(14, j, ((Number) c.getValue()).floatValue()), l5g.c(14, j, ((Number) c.getValue()).floatValue())), M, r1);
            pqo pqoVar = hbp.b;
            float f6 = ((pco) M.r(pqoVar)).b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, r1, i3, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            squ0 squ0Var2 = (squ0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var2.getClass();
            rvi.a(pqoVar.b(new pco(f5 + f6)), kai.c(701141437, new lgx(c, f820Var, q630Var, jaiVar, 0), M), M, 56);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q36(bi50Var, wh50Var, q630Var, r5j0Var, jaiVar, i);
        }
    }

    public static final void c(bi50 bi50Var, wh50 wh50Var, gzs gzsVar, q630 q630Var, r5j0 r5j0Var, pco pcoVar, float f, jai jaiVar, androidx.compose.runtime.a aVar, int i, int i2) {
        pco pcoVar2;
        int i3;
        float f2;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1950925271);
        int i5 = (M.J(bi50Var) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i5 |= M.y(gzsVar) ? 256 : 128;
        }
        int i6 = i5 | (M.J(q630Var) ? 2048 : 1024) | (M.J(r5j0Var) ? 16384 : 8192) | (M.l(false) ? 131072 : 65536);
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 = i6 | 1572864;
            pcoVar2 = pcoVar;
        } else {
            pcoVar2 = pcoVar;
            i3 = i6 | (M.J(pcoVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i4 = i3 | 12582912;
            f2 = f;
        } else {
            f2 = f;
            i4 = i3 | (M.n(f2) ? 8388608 : 4194304);
        }
        int i9 = i4 | (M.y(jaiVar) ? 67108864 : 33554432);
        if (M.t(i9 & 1, (38347923 & i9) != 38347922)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                pco pcoVar3 = i7 != 0 ? null : pcoVar2;
                if (i8 != 0) {
                    f2 = 0;
                }
                pcoVar2 = pcoVar3;
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1950925271, i9, -1, "com.vk.core.compose.component.internal.DropdownMenuContentDecider (InternalDropdown.kt:401)");
            }
            M.K(518232580);
            int i10 = i9 >> 3;
            b(bi50Var, wh50Var, q630Var, r5j0Var, jaiVar, M, (i9 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | ((i9 >> 9) & 458752));
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        float f3 = f2;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jgx(bi50Var, wh50Var, gzsVar, q630Var, r5j0Var, pcoVar2, f3, jaiVar, i, i2);
        }
    }

    public static final void d(boolean z, q630 q630Var, final yzs yzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1599798220);
        int i3 = i & 6;
        r9g r9gVar = r9g.a;
        if (i3 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(yzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1599798220, i2, -1, "com.vk.core.compose.component.internal.DropdownOverlayContent (InternalDropdown.kt:320)");
            }
            z2 = z;
            q630Var2 = q630Var;
            mm2.b(r9gVar, z2, q630Var2, anp.e(jq2.d(200, 0, null, 6), 2), anp.f(jq2.d(200, 0, null, 6), 2), null, kai.c(-227526668, new qyq(yzsVar, 3), M), M, (i2 & 14) | 1600512 | (i2 & 112) | (i2 & 896), 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mgx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    rgx.d(z2, q630Var2, yzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final pco pcoVar, final izs izsVar, final boolean z2, final yzs yzsVar, jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-87635883);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(false) ? 32 : 16) | (M.J(pcoVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.y(yzsVar) ? 131072 : 65536);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-87635883, i2, -1, "com.vk.core.compose.component.internal.DropdownPopupColumn (InternalDropdown.kt:264)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(8), dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (z2) {
                M.K(1580751617);
                d(z, sv1.z(aVar2, izsVar), yzsVar, M, 6 | ((i2 << 3) & 112) | ((i2 >> 6) & 7168));
            } else {
                M.K(1569750647);
            }
            M.j();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            jaiVar2 = jaiVar;
            jaiVar2.invoke(r9g.a, M, 54);
            M.G();
            if (z2) {
                M.K(1569750647);
            } else {
                M.K(1581037313);
                d(z, sv1.z(aVar2, izsVar), yzsVar, M, 6 | ((i2 << 3) & 112) | ((i2 >> 6) & 7168));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, pcoVar, izsVar, z2, yzsVar, jaiVar2, i) { // from class: xsna.igx
                public final /* synthetic */ boolean b;
                public final /* synthetic */ pco c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ yzs f;
                public final /* synthetic */ jai g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1572865);
                    rgx.e(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final int i, final long j, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, final izs izsVar, final q630 q630Var, final gxb0 gxb0Var, final uog0 uog0Var, final boolean z) {
        boolean z2;
        int i2;
        q630 q630Var2;
        gxb0 gxb0Var2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1075899110);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (M.l(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            gxb0Var2 = gxb0Var;
            i3 |= M.J(gxb0Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            gxb0Var2 = gxb0Var;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.J(uog0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.l(false) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            jaiVar2 = jaiVar;
            i3 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            jaiVar2 = jaiVar;
        }
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1075899110, i3, -1, "com.vk.core.compose.component.internal.InternalDropdown (InternalDropdown.kt:345)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bi50(Boolean.FALSE);
                M.R(x);
            }
            final bi50 bi50Var = (bi50) x;
            bi50Var.w0(Boolean.valueOf(z2));
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            final wh50 wh50Var = (wh50) x2;
            if (((Boolean) ((zak0) bi50Var.d).getValue()).booleanValue() || ((Boolean) ((zak0) bi50Var.e).getValue()).booleanValue()) {
                M.K(1231335036);
                a(wh50Var, M, ((i3 >> 21) & 112) | 6);
                azl azlVar = (azl) M.r(uvi.h);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x3);
                }
                final wh50 wh50Var2 = (wh50) x3;
                boolean J = ((i3 & 7168) == 2048) | M.J(azlVar) | M.o(0);
                Object x4 = M.x();
                if (J || x4 == c0012a) {
                    x4 = new xmo(j, azlVar, new o21(5, izsVar, wh50Var2));
                    M.R(x4);
                }
                final jai jaiVar3 = jaiVar2;
                final q630 q630Var3 = q630Var2;
                nb2.a((xmo) x4, gzsVar, gxb0Var2, kai.c(1523819027, new wzs() { // from class: xsna.ggx
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1523819027, intValue, -1, "com.vk.core.compose.component.internal.InternalDropdown.<anonymous> (InternalDropdown.kt:377)");
                            }
                            Object x5 = aVar2.x();
                            if (x5 == a.C0011a.a) {
                                x5 = new vmi(2, wh50Var);
                                aVar2.R(x5);
                            }
                            rgx.c(bi50.this, wh50Var2, (gzs) x5, q630Var3, uog0Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jaiVar3, aVar2, Tensorflow.FRAME_WIDTH, PsExtractor.AUDIO_STREAM);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, (i3 & 112) | 3072 | ((i3 >> 12) & 896), 0);
            } else {
                M.K(1218036904);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hgx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rgx.f(ne7.I(i | 1), j, (androidx.compose.runtime.a) obj, jaiVar, gzsVar, izsVar, q630Var, gxb0Var, uog0Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final boolean z, final gzs gzsVar, final q630 q630Var, final dt1 dt1Var, final long j, final gxb0 gxb0Var, final r5j0 r5j0Var, final boolean z2, final yzs yzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1311463686);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(dt1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.p(j) ? 16384 : 8192;
        }
        int i6 = i3 | 1769472;
        if ((i & 12582912) == 0) {
            i6 |= M.J(gxb0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= M.J(r5j0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= M.l(false) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.l(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(jaiVar) ? 256 : 128;
        }
        int i7 = i4;
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1311463686, i6, i7, "com.vk.core.compose.component.internal.InternalDropdown (InternalDropdown.kt:97)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                i5 = i6;
                x = new bi50(Boolean.FALSE);
                M.R(x);
            } else {
                i5 = i6;
            }
            bi50 bi50Var = (bi50) x;
            bi50Var.w0(Boolean.valueOf(z));
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            if (((Boolean) ((zak0) bi50Var.d).getValue()).booleanValue() || ((Boolean) ((zak0) bi50Var.e).getValue()).booleanValue()) {
                M.K(-1501902128);
                a(wh50Var, M, ((i5 >> 24) & 112) | 6);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new f3x(1, wh50Var);
                    M.R(x3);
                }
                h(new sgx(z, gzsVar, q630Var2, dt1Var, j, gxb0Var, r5j0Var, z2, bi50Var, (gzs) x3), yzsVar, jaiVar, M, i7 & 1008);
            } else {
                M.K(-1506765284);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ngx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rgx.g(z, gzsVar, q630Var, dt1Var, j, gxb0Var, r5j0Var, z2, yzsVar, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(final sgx sgxVar, final yzs yzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2139402292);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(sgxVar) : M.y(sgxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2139402292, i2, -1, "com.vk.core.compose.component.internal.InternalDropdownPopup (InternalDropdown.kt:166)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            iyk0 iyk0Var = uvi.h;
            final azl azlVar = (azl) M.r(iyk0Var);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(new pco(0));
                M.R(x2);
            }
            final wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(null);
                M.R(x3);
            }
            final wh50 wh50Var3 = (wh50) x3;
            dt1 dt1Var = sgxVar.d;
            long j = sgxVar.e;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new qt6(1, wh50Var3);
                M.R(x4);
            }
            izs izsVar = (izs) x4;
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && M.y(sgxVar));
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new x50(sgxVar);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-203966695, 199680, -1, "com.vk.core.compose.component.internal.rememberAlignmentPopupPositionProvider (InternalDropdown.kt:219)");
            }
            azl azlVar2 = (azl) M.r(iyk0Var);
            boolean p = M.p(j) | M.J(dt1Var) | M.o(0) | M.o(0) | M.J(azlVar2) | M.l(false);
            Object x6 = M.x();
            if (p || x6 == c0012a) {
                x6 = new lt1(dt1Var, j, 0, 0, new ya(izsVar, azlVar2, 0), new mz1(7, izsVar2, wh50Var));
                M.R(x6);
            }
            lt1 lt1Var = (lt1) x6;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nb2.a(lt1Var, sgxVar.b, sgxVar.f, kai.c(203337706, new wzs() { // from class: xsna.ogx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(203337706, intValue, -1, "com.vk.core.compose.component.internal.InternalDropdownPopup.<anonymous> (InternalDropdown.kt:186)");
                        }
                        sgx sgxVar2 = sgx.this;
                        boolean z2 = sgxVar2.a;
                        wh50 wh50Var4 = wh50Var3;
                        pco pcoVar = (pco) wh50Var4.getValue();
                        azl azlVar3 = azlVar;
                        boolean J = aVar3.J(azlVar3);
                        Object x7 = aVar3.x();
                        wh50 wh50Var5 = wh50Var2;
                        if (J || x7 == a.C0011a.a) {
                            x7 = new ab(14, azlVar3, wh50Var5);
                            aVar3.R(x7);
                        }
                        rgx.e(z2, pcoVar, (izs) x7, sgxVar2.h, yzsVar, kai.c(-281528422, new wp7(sgxVar2, wh50Var, jaiVar, wh50Var4, wh50Var5, 1), aVar3), aVar3, 1572864);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 3072, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pgx(i, 0, sgxVar, yzsVar, jaiVar);
        }
    }
}
