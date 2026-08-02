package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.rmw;

/* compiled from: TopshelfCardBackground.kt */
/* loaded from: classes2.dex */
public final class eap0 {
    public static final void a(final gap0 gap0Var, final v9p0 v9p0Var, final jap0 jap0Var, final Float f, final abp0 abp0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        Pair[] pairArr;
        boolean z = abp0Var.a;
        yzs<q630, androidx.compose.runtime.a, Integer, s3q0> yzsVar = abp0Var.b;
        androidx.compose.runtime.a M = aVar.M(628072777);
        int i2 = i | (M.J(gap0Var) ? 4 : 2) | (M.J(v9p0Var) ? 32 : 16) | (M.J(jap0Var) ? 256 : 128) | (M.J(f) ? 2048 : 1024) | (M.J(abp0Var) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(628072777, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfBackground (TopshelfCardBackground.kt:32)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            fbp0 fbp0Var = jap0Var.c.b;
            long j = fbp0Var.b;
            rmw.d dVar = gap0Var.a;
            q630.a aVar3 = q630.a.a;
            c(dVar, v9p0Var, null, true, null, txj0.d(aVar3, 1.0f), M, (i2 & 112) | 196608);
            M.K(27002931);
            M.j();
            q630 d2 = txj0.d(aVar3, 1.0f);
            List list = fbp0Var.c;
            if (list.isEmpty()) {
                pairArr = new Pair[]{new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(j)), new Pair(Float.valueOf(1.0f), new l5g(j))};
            } else {
                int size = list.size();
                Pair[] pairArr2 = new Pair[size];
                for (int i3 = 0; i3 < size; i3++) {
                    ebp0 ebp0Var = (ebp0) list.get(i3);
                    pairArr2[i3] = new Pair(Float.valueOf(ebp0Var.a), new l5g(l5g.c(14, j, ebp0Var.b)));
                }
                pairArr = pairArr2;
            }
            ja8.a(bu00.e(d2, new f1p0(1, pairArr, fbp0Var)), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(v9p0Var, jap0Var, f, abp0Var, q630Var, i) { // from class: xsna.y9p0
                public final /* synthetic */ v9p0 c;
                public final /* synthetic */ jap0 d;
                public final /* synthetic */ Float e;
                public final /* synthetic */ abp0 f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    eap0.a(gap0.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(lg90 lg90Var, wkj wkjVar, dt1 dt1Var, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-130864856);
        int i4 = i | (M.y(lg90Var) ? 4 : 2) | (M.J(wkjVar) ? 32 : 16) | (M.J(dt1Var) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i4 | (M.J(q630Var2) ? 2048 : 1024);
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            q630 q630Var4 = i5 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-130864856, i3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfBackgroundImage (TopshelfCardBackground.kt:178)");
            }
            r0v0.a(lg90Var, txj0.d(q630Var4, 1.0f), dt1Var, wkjVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, (i3 & 14) | 8 | (i3 & 896) | ((i3 << 6) & 7168), PsExtractor.VIDEO_STREAM_MASK);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var4;
        } else {
            M.h();
            q630Var3 = q630Var2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gv1(lg90Var, wkjVar, dt1Var, q630Var3, i, i2);
        }
    }

    public static final void c(final rmw rmwVar, final v9p0 v9p0Var, final yzs yzsVar, final boolean z, final w9p0 w9p0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        v9p0 v9p0Var2;
        androidx.compose.runtime.a M = aVar.M(-1187730253);
        if ((i & 6) == 0) {
            i2 = (M.J(rmwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            v9p0Var2 = v9p0Var;
            i2 |= M.J(v9p0Var2) ? 32 : 16;
        } else {
            v9p0Var2 = v9p0Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(yzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(w9p0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1187730253, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfBackgroundLayer (TopshelfCardBackground.kt:121)");
            }
            final v9p0 v9p0Var3 = v9p0Var2;
            ua8.a(q630Var, null, true, kai.c(-1056909411, new yzs() { // from class: xsna.z9p0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    lg90 lg90Var;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1056909411, intValue, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfBackgroundLayer.<anonymous> (TopshelfCardBackground.kt:126)");
                        }
                        rmw rmwVar2 = rmw.this;
                        w9p0 w9p0Var2 = null;
                        if (rmwVar2 == null) {
                            aVar2.K(17020983);
                            aVar2.j();
                            lg90Var = null;
                        } else {
                            aVar2.K(-2077660918);
                            lg90 a = rmw.b.a(new uco(byc0.b(va8Var.j(), va8Var.g())), rmwVar2, aVar2, 0, 2);
                            aVar2.j();
                            lg90Var = a;
                        }
                        yzs yzsVar2 = yzsVar;
                        if (yzsVar2 == null) {
                            aVar2.K(17095383);
                        } else {
                            aVar2.K(-2077658518);
                            yzsVar2.invoke(rte0.e(txj0.d(q630.a.a, 1.0f)), aVar2, 6);
                        }
                        aVar2.j();
                        if (lg90Var == null) {
                            aVar2.K(17187577);
                        } else {
                            aVar2.K(17187578);
                            boolean z2 = yzsVar2 != null;
                            v9p0 v9p0Var4 = v9p0Var3;
                            jai c = kai.c(555767694, new d6(11, lg90Var, v9p0Var4), aVar2);
                            boolean z3 = z;
                            eap0.d(z2, z3, c, aVar2, 384);
                            w9p0 w9p0Var3 = w9p0Var;
                            if (w9p0Var3 != null && z3) {
                                w9p0Var2 = w9p0Var3;
                            }
                            if (w9p0Var2 == null) {
                                aVar2.K(-497169816);
                            } else {
                                aVar2.K(-497169815);
                                eap0.b(lg90Var, v9p0Var4.b, v9p0Var4.a, eap0.f(w9p0Var2), aVar2, 8, 0);
                            }
                            aVar2.j();
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 15) & 14) | 3456, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.aap0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eap0.c(rmw.this, v9p0Var, yzsVar, z, w9p0Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final boolean z, boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        final boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1698538760);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.l(z2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1698538760, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfFadeVisibility (TopshelfCardBackground.kt:158)");
            }
            if (z) {
                M.K(2136636384);
                z3 = z2;
                mm2.f(z3, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(-161210139, new t0r(jaiVar, 3), M), M, ((i2 >> 3) & 14) | 200064, 18);
                M.j();
            } else {
                z3 = z2;
                M.K(2136806481);
                jaiVar.invoke(M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z3 = z2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z3, jaiVar, i) { // from class: xsna.dap0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ jai d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    eap0.d(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(boolean z, rmw rmwVar, v9p0 v9p0Var, w9p0 w9p0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z2;
        final rmw rmwVar2;
        final v9p0 v9p0Var2;
        final w9p0 w9p0Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1208247291);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rmwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(v9p0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(w9p0Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1208247291, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfMediaCoverBlurOverlay (TopshelfCardBackground.kt:193)");
            }
            if (rmwVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new bzf(z, rmwVar, v9p0Var, w9p0Var, i);
                    return;
                }
                return;
            }
            z2 = z;
            rmwVar2 = rmwVar;
            v9p0Var2 = v9p0Var;
            w9p0Var2 = w9p0Var;
            i3 = i;
            mm2.f(z2, null, qpp.a, anp.f(null, 3), null, kai.c(546936019, new yzs() { // from class: xsna.bap0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(546936019, intValue, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfMediaCoverBlurOverlay.<anonymous> (TopshelfCardBackground.kt:202)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    final rmw rmwVar3 = rmw.this;
                    final v9p0 v9p0Var3 = v9p0Var2;
                    final w9p0 w9p0Var3 = w9p0Var2;
                    ua8.a(d, null, false, kai.c(-1070241751, new yzs() { // from class: xsna.cap0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            va8 va8Var = (va8) obj4;
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= aVar3.J(va8Var) ? 4 : 2;
                            }
                            if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1070241751, intValue2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.background.TopshelfMediaCoverBlurOverlay.<anonymous>.<anonymous> (TopshelfCardBackground.kt:203)");
                                }
                                lg90 a = rmw.b.a(new uco(byc0.b(va8Var.j(), va8Var.g())), rmw.this, aVar3, 0, 2);
                                v9p0 v9p0Var4 = v9p0Var3;
                                eap0.b(a, v9p0Var4.b, v9p0Var4.a, eap0.f(w9p0Var3), aVar3, 8, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), aVar2, 3078, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 199680, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            rmwVar2 = rmwVar;
            v9p0Var2 = v9p0Var;
            w9p0Var2 = w9p0Var;
            i3 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new dvn0(z2, rmwVar2, v9p0Var2, w9p0Var2, i3);
        }
    }

    public static final q630 f(w9p0 w9p0Var) {
        l5g.c(14, w9p0Var.b, 0.4f);
        txj0.d(q630.a.a, 1.0f);
        throw null;
    }
}
