package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.jbp0;
import xsna.q630;
import xsna.wkj;

/* compiled from: TopshelfCardContent.kt */
/* loaded from: classes2.dex */
public final class rap0 {
    public static final void a(final jbp0.a aVar, final jap0 jap0Var, final gzs gzsVar, final gzs gzsVar2, final sap0 sap0Var, final rv5 rv5Var, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        cbp0 cbp0Var = jap0Var.f;
        androidx.compose.runtime.a M = aVar2.M(-1803571158);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(jap0Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.J(sap0Var) ? 16384 : 8192) | (M.J(rv5Var) ? 131072 : 65536) | (M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1803571158, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.DefaultTopshelfContent (TopshelfCardContent.kt:181)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            sbp0 sbp0Var = aVar.b;
            M.K(786005075);
            obp0.c(aVar.b, aVar.c, aVar.d, aVar.e, jap0Var, jap0Var.e.b, f, M, ((i2 << 9) & 57344) | 1572864);
            M.j();
            M.K(786506779);
            int i3 = i2 << 6;
            wap0.a(aVar.f, aVar.g, jap0Var, sap0Var.a, gzsVar, gzsVar2, f, rv5Var, M, ((i2 << 3) & 896) | 1572864 | (i3 & 57344) | (458752 & i3) | (i3 & 29360128));
            M = M;
            M.j();
            if (xga0.c(aVar4, sap0Var.b ? cbp0Var.a : cbp0Var.b, M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(jap0Var, gzsVar, gzsVar2, sap0Var, rv5Var, q630Var, i) { // from class: xsna.qap0
                public final /* synthetic */ jap0 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ sap0 f;
                public final /* synthetic */ rv5 g;
                public final /* synthetic */ q630 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    rap0.a(jbp0.a.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final jbp0.a aVar, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final jap0 jap0Var, final sap0 sap0Var, final abp0 abp0Var, final q630 q630Var, final xap0 xap0Var, androidx.compose.runtime.a aVar2, final int i) {
        final jbp0.a aVar3;
        int i2;
        final abp0 abp0Var2;
        androidx.compose.runtime.a aVar4;
        androidx.compose.runtime.a M = aVar2.M(680046274);
        if ((i & 6) == 0) {
            aVar3 = aVar;
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            aVar3 = aVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(jap0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(sap0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            abp0Var2 = abp0Var;
            i2 |= M.J(abp0Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            abp0Var2 = abp0Var;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(q630Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(xap0Var) ? 67108864 : 33554432;
        }
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(680046274, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.LoadedTopshelfCard (TopshelfCardContent.kt:117)");
            }
            final rv5 c = lv5.c(M);
            aVar4 = M;
            ua8.a(hr80.m(q630Var, jap0Var.a.a.a(0, M), androidx.compose.ui.graphics.e.a), null, false, kai.c(-1308244564, new yzs() { // from class: xsna.oap0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar5.J(va8Var) ? 4 : 2;
                    }
                    if (aVar5.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1308244564, intValue, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.LoadedTopshelfCard.<anonymous> (TopshelfCardContent.kt:124)");
                        }
                        azl azlVar = (azl) aVar5.r(uvi.h);
                        boolean n = aVar5.n(va8Var.g()) | aVar5.J(azlVar);
                        Object x = aVar5.x();
                        Object obj4 = a.C0011a.a;
                        if (n || x == obj4) {
                            x = Float.valueOf(azlVar.I0(va8Var.g()) * 0.58f);
                            aVar5.R(x);
                        }
                        float floatValue = ((Number) x).floatValue();
                        jbp0.a aVar6 = jbp0.a.this;
                        Object obj5 = aVar6.a;
                        gap0 gap0Var = aVar6.a;
                        boolean J = aVar5.J(obj5);
                        jap0 jap0Var2 = jap0Var;
                        boolean J2 = J | aVar5.J(jap0Var2);
                        Object x2 = aVar5.x();
                        if (J2 || x2 == obj4) {
                            x2 = new v9p0(jap0Var2.c.a, wkj.a.a);
                            aVar5.R(x2);
                        }
                        v9p0 v9p0Var = (v9p0) x2;
                        Float valueOf = Float.valueOf(floatValue);
                        q630.a aVar7 = q630.a.a;
                        q630 d = txj0.d(aVar7, 1.0f);
                        rv5 rv5Var = c;
                        eap0.a(gap0Var, v9p0Var, jap0Var2, valueOf, abp0Var2, lv5.b(d, rv5Var, 0L, 6), aVar5, 0);
                        xap0 xap0Var2 = xap0Var;
                        if (xap0Var2 == null) {
                            xap0Var2 = aVar6.h;
                        }
                        aVar5.K(-1379718553);
                        tbp0 tbp0Var = jap0Var2.e.e;
                        dt1.a aVar8 = dt1.a;
                        aVar8.getClass();
                        wap0.e(xap0Var2, tbp0Var, gzsVar3, va8Var.b(aVar7, dt1.a.d), aVar5, 0);
                        aVar5.j();
                        aVar8.getClass();
                        q630 f = txj0.f(va8Var.b(aVar7, dt1.a.h), 1.0f);
                        float f2 = jap0Var2.b.a;
                        rap0.a(aVar6, jap0Var2, gzsVar, gzsVar2, sap0Var, rv5Var, s200.H(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), aVar5, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar4, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar4 = M;
            aVar4.h();
        }
        androidx.compose.runtime.f s = aVar4.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pap0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rap0.b(jbp0.a.this, gzsVar, gzsVar2, gzsVar3, jap0Var, sap0Var, abp0Var, q630Var, xap0Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final jbp0 jbp0Var, final jap0 jap0Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final boolean z, final boolean z2, final xap0 xap0Var, final yzs yzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1431052442);
        if ((i & 6) == 0) {
            i2 = (M.J(jbp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar3) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.l(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(xap0Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.y(yzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (i2 & 306783379) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1431052442, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.card.TopshelfCardContent (TopshelfCardContent.kt:48)");
            }
            long c = ((spx0) M.r(uvi.u)).c();
            azl azlVar = (azl) M.r(uvi.h);
            int i4 = i2;
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i5 = (int) (c >> 32);
            int i6 = (int) (c & 4294967295L);
            boolean z3 = 1 <= i6 && i6 < i5;
            float j1 = azlVar.j1(c2f0.c(i5, i6, context));
            q630 h = pco.a(j1, (float) 0) > 0 ? txj0.h(txj0.f(aVar3, 1.0f), j1) : txj0.f(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 d2 = txj0.d(aVar3, 1.0f);
            if (jbp0Var.equals(jbp0.b.a)) {
                M.K(1933704984);
                ibp0.a(d2, M, 6);
                M.j();
                aVar2 = M;
            } else {
                if (!(jbp0Var instanceof jbp0.a)) {
                    throw alb0.c(2140586721, M);
                }
                M.K(1933889062);
                int i7 = i4 >> 3;
                b((jbp0.a) jbp0Var, gzsVar, gzsVar2, gzsVar3, jap0Var, new sap0(!z3, z), new abp0(z2, yzsVar), d2, xap0Var, M, (i7 & 7168) | (i7 & 112) | 12582912 | (i7 & 896) | ((i4 << 9) & 57344) | (i4 & 234881024));
                aVar2 = M;
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nap0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rap0.c(jbp0.this, jap0Var, gzsVar, gzsVar2, gzsVar3, z, z2, xap0Var, yzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
