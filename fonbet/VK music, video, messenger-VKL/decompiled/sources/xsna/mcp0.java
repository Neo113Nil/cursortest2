package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.jbp0;
import xsna.q630;

/* compiled from: TopshelfPager.kt */
/* loaded from: classes2.dex */
public final class mcp0 {
    public static final float a = 36;
    public static final float b = 15;
    public static final float c = 3;

    public static final void a(final ArrayList arrayList, final mc90 mc90Var, final izs izsVar, final izs izsVar2, final izs izsVar3, final q630 q630Var, final gzs gzsVar, izs izsVar4, izs izsVar5, izs izsVar6, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar7;
        androidx.compose.runtime.a aVar2;
        final izs izsVar8;
        final izs izsVar9;
        final izs izsVar10;
        char c2;
        izs izsVar11;
        final izs izsVar12;
        final izs izsVar13;
        androidx.compose.runtime.a M = aVar.M(2026917872);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mc90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            izsVar7 = izsVar3;
            i2 |= M.y(izsVar7) ? 16384 : 8192;
        } else {
            izsVar7 = izsVar3;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2 | 918552576;
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            M.V();
            int i4 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i4 == 0 || M.i()) {
                Object x = M.x();
                if (x == c0012a) {
                    c2 = ' ';
                    x = new kul0(3);
                    M.R(x);
                } else {
                    c2 = ' ';
                }
                izsVar11 = (izs) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new bws(22);
                    M.R(x2);
                }
                izs izsVar14 = (izs) x2;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new q520(25);
                    M.R(x3);
                }
                izsVar12 = (izs) x3;
                izsVar13 = izsVar14;
            } else {
                M.h();
                izsVar11 = izsVar4;
                izsVar13 = izsVar5;
                izsVar12 = izsVar6;
                c2 = ' ';
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2026917872, i3, 1600950, "com.vk.libvideo.design.compose.video.topshelf.pager.TopshelfPager (TopshelfPager.kt:54)");
            }
            boolean z = arrayList.size() > 1;
            q630 f = txj0.f(q630Var, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1474064202, 0, -1, "com.vk.libvideo.design.compose.video.topshelf.pager.cardHeight (TopshelfPager.kt:118)");
            }
            M.K(-763508023);
            azl azlVar = (azl) M.r(uvi.h);
            long c3 = ((spx0) M.r(uvi.u)).c();
            final boolean z2 = z;
            float j1 = azlVar.j1(c2f0.c((int) (c3 >> c2), (int) (c3 & 4294967295L), (Context) M.r(AndroidCompositionLocals_androidKt.b)));
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 h = txj0.h(f, j1);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c4 = qri.c(M, h);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c4, cri.a.d);
            q630.a aVar4 = q630.a.a;
            q630 d2 = txj0.d(aVar4, 1.0f);
            boolean z3 = (29360128 & i3) == 8388608;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new rzl0(izsVar11, 9);
                M.R(x4);
            }
            izs izsVar15 = (izs) x4;
            final int i5 = -1;
            final izs izsVar16 = izsVar7;
            izs izsVar17 = izsVar12;
            izs izsVar18 = izsVar13;
            izs izsVar19 = izsVar11;
            aVar2 = M;
            nb90.a(mc90Var, d2, null, null, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, izsVar15, null, null, null, kai.c(-2013956023, new zzs(i5, arrayList, izsVar12, izsVar, izsVar2, izsVar16, z2, izsVar13) { // from class: xsna.jcp0
                public final /* synthetic */ ArrayList b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ izs h;

                {
                    this.b = arrayList;
                    this.c = izsVar12;
                    this.d = izsVar;
                    this.e = izsVar2;
                    this.f = izsVar16;
                    this.g = z2;
                    this.h = izsVar13;
                }

                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Integer num = (Integer) obj2;
                    final int intValue = num.intValue();
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2013956023, intValue2, -1, "com.vk.libvideo.design.compose.video.topshelf.pager.TopshelfPager.<anonymous>.<anonymous> (TopshelfPager.kt:74)");
                    }
                    jbp0 jbp0Var = (jbp0) j5g.b0(intValue, new wow(this.b));
                    if (jbp0Var == null) {
                        jbp0Var = jbp0.b.a;
                    }
                    if (((Boolean) this.c.invoke(num)).booleanValue()) {
                        aVar5.K(-1365293366);
                        gbp0.a(jbp0Var, txj0.d(q630.a.a, 1.0f), aVar5, 48);
                        aVar5.j();
                    } else {
                        aVar5.K(-1365094470);
                        izs izsVar20 = this.d;
                        int i6 = (intValue2 & 112) ^ 48;
                        boolean J = aVar5.J(izsVar20) | ((i6 > 32 && aVar5.o(intValue)) || (intValue2 & 48) == 32);
                        Object x5 = aVar5.x();
                        Object obj5 = a.C0011a.a;
                        if (J || x5 == obj5) {
                            x5 = new ufa(intValue, 2, izsVar20);
                            aVar5.R(x5);
                        }
                        gzs gzsVar2 = (gzs) x5;
                        final izs izsVar21 = this.e;
                        boolean J2 = aVar5.J(izsVar21) | ((i6 > 32 && aVar5.o(intValue)) || (intValue2 & 48) == 32);
                        Object x6 = aVar5.x();
                        if (J2 || x6 == obj5) {
                            x6 = new gzs() { // from class: xsna.lcp0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(Integer.valueOf(intValue));
                                    return s3q0.a;
                                }
                            };
                            aVar5.R(x6);
                        }
                        gzs gzsVar3 = (gzs) x6;
                        Object obj6 = this.f;
                        boolean J3 = aVar5.J(obj6) | ((i6 > 32 && aVar5.o(intValue)) || (intValue2 & 48) == 32);
                        Object x7 = aVar5.x();
                        if (J3 || x7 == obj5) {
                            x7 = new tx30(obj6, intValue, 1);
                            aVar5.R(x7);
                        }
                        zap0.a(jbp0Var, gzsVar2, gzsVar3, (gzs) x7, null, this.g, ((Boolean) this.h.invoke(num)).booleanValue(), null, null, null, aVar5, 0);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 3) & 14) | 24624, 24576, 15340);
            if (z2) {
                aVar2.K(1355840115);
                int size = arrayList.size();
                boolean z4 = (i3 & 112) == 32;
                Object x5 = aVar2.x();
                if (z4 || x5 == c0012a) {
                    x5 = new f880(mc90Var, 25);
                    aVar2.R(x5);
                }
                scp0.a(size, (gzs) x5, gzsVar, s200.H(txj0.h(txj0.f(ra8.a.b(aVar4, dt1.a.i), 1.0f), a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c, 5), aVar2, (i3 >> 12) & 896);
            } else {
                aVar2.K(1351045624);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            izsVar9 = izsVar18;
            izsVar10 = izsVar17;
            izsVar8 = izsVar19;
        } else {
            aVar2 = M;
            aVar2.h();
            izsVar8 = izsVar4;
            izsVar9 = izsVar5;
            izsVar10 = izsVar6;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kcp0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mcp0.a(arrayList, mc90Var, izsVar, izsVar2, izsVar3, q630Var, gzsVar, izsVar8, izsVar9, izsVar10, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
