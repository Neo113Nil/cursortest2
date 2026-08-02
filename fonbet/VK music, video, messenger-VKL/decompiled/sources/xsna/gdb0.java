package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.sga;

/* compiled from: PlaylistScreenLoadedContentView.kt */
/* loaded from: classes6.dex */
public final class gdb0 {
    public static final void a(final bga bgaVar, final sga sgaVar, final zdb0 zdb0Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        zdb0 zdb0Var2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1378645635);
        if ((i & 6) == 0) {
            i2 = (M.J(bgaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(sgaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zdb0Var2 = zdb0Var;
            i2 |= M.J(zdb0Var2) ? 256 : 128;
        } else {
            zdb0Var2 = zdb0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(ksrVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 131072 : 65536;
        } else {
            q630Var2 = q630Var;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1378645635, i3, -1, "com.vk.video.playlist.playlistscreen.ui.view.FullContent (PlaylistScreenLoadedContentView.kt:71)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            final boolean d = fnj.d(context);
            final u890 m = s200.m(d ? 24 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new p0(izsVar, 4);
                M.R(x);
            }
            final izs izsVar2 = (izs) x;
            final q630 q630Var3 = q630Var2;
            final zdb0 zdb0Var3 = zdb0Var2;
            aVar2 = M;
            bgaVar.b(sgaVar, izsVar2, kai.c(-851270239, new zzs() { // from class: xsna.ddb0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i4;
                    xvy xvyVar = (xvy) obj;
                    tpr tprVar = (tpr) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i4 = (aVar3.J(xvyVar) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i4 |= aVar3.J(tprVar) ? 32 : 16;
                    }
                    if (aVar3.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-851270239, i4, -1, "com.vk.video.playlist.playlistscreen.ui.view.FullContent.<anonymous>.<anonymous> (PlaylistScreenLoadedContentView.kt:81)");
                        }
                        q630 E = ahn.E(q630.this, "mvi_catalog_lazy_column_test_tag");
                        final sga sgaVar2 = sgaVar;
                        boolean J = aVar3.J(sgaVar2);
                        final zdb0 zdb0Var4 = zdb0Var3;
                        boolean J2 = J | aVar3.J(zdb0Var4);
                        final boolean z = d;
                        boolean l = J2 | aVar3.l(z);
                        final bga bgaVar2 = bgaVar;
                        boolean J3 = l | aVar3.J(bgaVar2);
                        final izs izsVar3 = izsVar;
                        boolean J4 = J3 | aVar3.J(izsVar3);
                        final ksr ksrVar2 = ksrVar;
                        boolean J5 = J4 | aVar3.J(ksrVar2);
                        final bga bgaVar3 = bgaVar;
                        boolean J6 = J5 | aVar3.J(bgaVar3);
                        Object x2 = aVar3.x();
                        if (J6 || x2 == a.C0011a.a) {
                            final izs izsVar4 = izsVar2;
                            izs izsVar5 = new izs(zdb0Var4, z, bgaVar2, izsVar4, izsVar3, ksrVar2, bgaVar3) { // from class: xsna.fdb0
                                public final /* synthetic */ zdb0 c;
                                public final /* synthetic */ bga d;
                                public final /* synthetic */ izs e;
                                public final /* synthetic */ izs f;
                                public final /* synthetic */ ksr g;
                                public final /* synthetic */ bga h;

                                {
                                    this.d = bgaVar2;
                                    this.e = izsVar4;
                                    this.f = izsVar3;
                                    this.g = ksrVar2;
                                    this.h = bgaVar3;
                                }

                                @Override // xsna.izs
                                public final Object invoke(Object obj5) {
                                    nvy nvyVar = (nvy) obj5;
                                    sga sgaVar3 = sga.this;
                                    boolean z2 = sgaVar3 instanceof sga.a;
                                    izs<? super yda, s3q0> izsVar6 = this.e;
                                    bga bgaVar4 = this.h;
                                    if (z2) {
                                        this.c.getClass();
                                        bgaVar4.a(nvyVar, (sga.a) sgaVar3, izsVar6, this.g);
                                        sga.e eVar = ((sga.a) sgaVar3).h;
                                        if (eVar instanceof sga.c) {
                                            bgaVar4.d(nvyVar, (sga.c) eVar, false, izsVar6);
                                        } else if (epx.f(eVar, sga.d.b)) {
                                            bgaVar4.e(nvyVar, false);
                                        } else if (eVar != null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else if (sgaVar3 instanceof sga.c) {
                                        bgaVar4.d(nvyVar, (sga.c) sgaVar3, true, izsVar6);
                                    } else if (sgaVar3.equals(sga.d.b)) {
                                        bgaVar4.e(nvyVar, true);
                                    } else if (!(sgaVar3 instanceof sga.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(izsVar5);
                            x2 = izsVar5;
                        }
                        lqy.a(E, xvyVar, m, null, null, tprVar, false, null, (izs) x2, aVar3, ((i4 << 3) & 112) | ((i4 << 15) & 3670016), 440);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 3) & 14) | Tensorflow.FRAME_WIDTH);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.edb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gdb0.a(bga.this, sgaVar, zdb0Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(bga bgaVar, zdb0 zdb0Var, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(562597144);
        int i2 = i | (M.J(bgaVar) ? 4 : 2) | (M.J(zdb0Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(ksrVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(562597144, i2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenLoadedContentView (PlaylistScreenLoadedContentView.kt:40)");
            }
            q630 E = ahn.E(q630Var, "video_playlist_content");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            sga sgaVar = (sga) nr2.u(zdb0Var.c, M).getValue();
            if (sgaVar == null) {
                M.K(-1870191121);
            } else {
                M.K(-1870191120);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = txj0.d(q630.a.a, 1.0f);
                    M.R(x);
                }
                q630 q630Var2 = (q630) x;
                boolean z = (i2 & 7168) == 2048;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new a1q(new com.vk.catalog.mvi.section.screen.impl.ui.b(new com.vk.catalog.mvi.section.screen.impl.ui.d(new com.vk.catalog.mvi.section.screen.impl.ui.a(new com.vk.catalog.mvi.section.screen.impl.ui.c(ksrVar, 2), 1), 1), 1));
                    M.R(x2);
                }
                int i3 = (i2 & 14) | 196608;
                int i4 = i2 << 3;
                a(bgaVar, sgaVar, zdb0Var, izsVar, ((a1q) x2).a, q630Var2, M, (i4 & 7168) | i3 | (i4 & 896));
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cdb0(i, 0, bgaVar, zdb0Var, ksrVar, q630Var, izsVar);
        }
    }
}
