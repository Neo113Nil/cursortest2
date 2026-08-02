package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.menu.ContextMenuHeaderLine;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.ListIterator;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkContextMenu.kt */
/* loaded from: classes17.dex */
public final class aou0 {
    public static final void a(doj dojVar, androidx.compose.runtime.a aVar, int i) {
        nnj nnjVar;
        wh50 wh50Var = dojVar.e;
        androidx.compose.runtime.a M = aVar.M(1900295835);
        int i2 = (M.J(dojVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1900295835, i2, -1, "com.vk.core.compose.component.menu.Content (VkContextMenu.kt:815)");
            }
            SnapshotStateList<nnj> snapshotStateList = dojVar.f;
            if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                ListIterator<nnj> listIterator = snapshotStateList.listIterator();
                while (true) {
                    duk0 duk0Var = (duk0) listIterator;
                    if (!duk0Var.hasNext() || ((nnjVar = (nnj) duk0Var.next()) != ((nnj) ((zak0) dojVar.d).getValue()) && nnjVar != ((nnj) ((zak0) wh50Var).getValue()))) {
                        break;
                    }
                }
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-555207183);
            M.j();
            M.K(-1956764656);
            ListIterator<nnj> listIterator2 = snapshotStateList.listIterator();
            while (true) {
                duk0 duk0Var2 = (duk0) listIterator2;
                if (duk0Var2.hasNext()) {
                    nnj nnjVar2 = (nnj) duk0Var2.next();
                    M.K(174474874);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, aVar2);
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
                    k9q0.w(M, a2, cri.a.f);
                    k9q0.w(M, D2, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c2, cri.a.d);
                    nnjVar2.a.invoke(tpg0.a, M, 6);
                    M.G();
                    M.j();
                } else if (gp.d(M)) {
                    androidx.compose.runtime.b.e();
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.l(dojVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final znj znjVar, final String str, q630 q630Var, ContextMenuHeaderLine contextMenuHeaderLine, androidx.compose.runtime.a aVar, final int i, final int i2) {
        String str2;
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final ContextMenuHeaderLine contextMenuHeaderLine2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-2074533524);
        if ((i & 48) == 0) {
            str2 = str;
            i3 = (M.J(str2) ? 32 : 16) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i5 = i3 | 3072;
            } else {
                i5 = i3 | (M.o(contextMenuHeaderLine == null ? -1 : contextMenuHeaderLine.ordinal()) ? 2048 : 1024);
            }
            if (M.t(i5 & 1, (i5 & 1169) == 1168)) {
                aVar2 = M;
                aVar2.h();
                contextMenuHeaderLine2 = contextMenuHeaderLine;
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                ContextMenuHeaderLine contextMenuHeaderLine3 = i4 != 0 ? ContextMenuHeaderLine.Oneline : contextMenuHeaderLine;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2074533524, i5, -1, "com.vk.core.compose.component.menu.ContextMenuHeader (VkContextMenu.kt:397)");
                }
                M.K(-2142930065);
                tnu0.a();
                float f = kqu0.b;
                tnu0.c();
                q630 E = s200.E(q630Var4, f, kqu0.u);
                M.j();
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.e, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
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
                k9q0.w(M, c, cri.a.d);
                M.K(1134945129);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().r;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                yqv0.c(str2, null, j, null, null, 0, 0, null, 2, false, 0, Integer.MAX_VALUE, null, wuv0Var.i0, aVar2, ((i5 >> 3) & 14) | 100663296, 48, 5882);
                if (gp.d(aVar2)) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
                contextMenuHeaderLine2 = contextMenuHeaderLine3;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ynu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        aou0.b(znj.this, str, q630Var3, contextMenuHeaderLine2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if (M.t(i5 & 1, (i5 & 1169) == 1168)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void c(final float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1655167012);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1655167012, i, -1, "com.vk.core.compose.component.menu.InternalDivider (VkContextMenu.kt:754)");
            }
            M.K(-1438268199);
            jqu0.a(txj0.z(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(q630.a.a, 16)), null, 3), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, f2, i) { // from class: xsna.unu0
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    aou0.c(this.b, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final znj znjVar, final gzs<s3q0> gzsVar, q630 q630Var, Boolean bool, boolean z, snj snjVar, final tnj tnjVar, unj unjVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        Boolean bool2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final Boolean bool3;
        final boolean z3;
        final snj snjVar2;
        final unj unjVar2;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1641387845);
        if ((i & 48) == 0) {
            i3 = (M.y(gzsVar) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                bool2 = bool;
                i3 |= M.J(bool2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= M.l(z2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i3 |= M.J(snjVar) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= M.J(tnjVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((12582912 & i) == 0) {
                            i3 |= M.J(unjVar) ? 8388608 : 4194304;
                            if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
                                aVar2 = M;
                                aVar2.h();
                                q630Var3 = q630Var2;
                                bool3 = bool2;
                                z3 = z2;
                                snjVar2 = snjVar;
                                unjVar2 = unjVar;
                            } else {
                                if (i9 != 0) {
                                    q630Var4 = q630.a.a;
                                    i8 = i6;
                                } else {
                                    i8 = i6;
                                    q630Var4 = q630Var2;
                                }
                                Boolean bool4 = i4 != 0 ? null : bool2;
                                boolean z4 = i5 != 0 ? true : z2;
                                snj snjVar3 = i8 != 0 ? null : snjVar;
                                unj unjVar3 = i7 != 0 ? null : unjVar;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1641387845, i3, -1, "com.vk.core.compose.component.menu.MenuItem (VkContextMenu.kt:526)");
                                }
                                int i10 = i3 >> 3;
                                aVar2 = M;
                                h(gzsVar, q630Var4, z4, bool4, snjVar3, tnjVar, unjVar3, aVar2, (i3 & 7168) | (i10 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 >> 6) & 896) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var4;
                                z3 = z4;
                                bool3 = bool4;
                                snjVar2 = snjVar3;
                                unjVar2 = unjVar3;
                            }
                            s = aVar2.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.wnu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        aou0.d(znj.this, gzsVar, q630Var3, bool3, z3, snjVar2, tnjVar, unjVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
                z2 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            bool2 = bool;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        bool2 = bool;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 4793489) == 4793488)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void e(umd0 umd0Var, gzs gzsVar, q630 q630Var, boolean z, snj snjVar, tnj tnjVar, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-652356196);
        int i2 = i | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 27648 | (M.J(snjVar) ? 131072 : 65536) | (M.J(tnjVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (M.t(i2 & 1, (4793489 & i2) != 4793488)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-652356196, i2, -1, "com.vk.core.compose.component.menu.MenuItem (VkContextMenu.kt:374)");
            }
            h(gzsVar, q630Var, true, null, snjVar, tnjVar, null, M, (i2 >> 3) & 4194302, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z2 = true;
        } else {
            M.h();
            z2 = z;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w7p(umd0Var, gzsVar, q630Var, z2, snjVar, tnjVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final boolean z, final gzs gzsVar, q630 q630Var, final dt1 dt1Var, final long j, gxb0 gxb0Var, r5j0 r5j0Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        long j2;
        int i4;
        gxb0 gxb0Var2;
        int i5;
        jai jaiVar2;
        androidx.compose.runtime.a aVar2;
        final gxb0 gxb0Var3;
        final r5j0 r5j0Var2;
        androidx.compose.runtime.f s;
        r5j0 a;
        int i6;
        androidx.compose.runtime.a M = aVar.M(1492868318);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.J(dt1Var) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                j2 = j;
                i3 |= M.p(j2) ? 16384 : 8192;
            } else {
                j2 = j;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                gxb0Var2 = gxb0Var;
                i3 |= M.J(gxb0Var2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i3 |= 524288;
                }
                i5 = i3 | 12582912;
                if ((100663296 & i) == 0) {
                    jaiVar2 = jaiVar;
                    i5 |= M.y(jaiVar2) ? 67108864 : 33554432;
                } else {
                    jaiVar2 = jaiVar;
                }
                if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if (i7 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if (i4 != 0) {
                            gxb0Var2 = new gxb0(false, false, 30);
                        }
                        a = lqu0.a();
                        i6 = i5 & (-3670017);
                    } else {
                        M.h();
                        i6 = i5 & (-3670017);
                        a = r5j0Var;
                    }
                    gxb0 gxb0Var4 = gxb0Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1492868318, i6, -1, "com.vk.core.compose.component.menu.VkContextMenu (VkContextMenu.kt:132)");
                    }
                    aVar2 = M;
                    oqu0.b(z, gzsVar, s200.C(q630Var2, tnu0.a), dt1Var, j2, gxb0Var4, a, false, null, jaiVar2, aVar2, i6 & 33553534, (i6 >> 24) & 14, Tensorflow.FRAME_HEIGHT);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gxb0Var3 = gxb0Var4;
                    r5j0Var2 = a;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    gxb0Var3 = gxb0Var2;
                    r5j0Var2 = r5j0Var;
                }
                final q630 q630Var3 = q630Var2;
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.vnu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            aou0.f(z, gzsVar, q630Var3, dt1Var, j, gxb0Var3, r5j0Var2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            gxb0Var2 = gxb0Var;
            if ((1572864 & i) == 0) {
            }
            i5 = i3 | 12582912;
            if ((100663296 & i) == 0) {
            }
            if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
            }
            final q630 q630Var32 = q630Var2;
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        gxb0Var2 = gxb0Var;
        if ((1572864 & i) == 0) {
        }
        i5 = i3 | 12582912;
        if ((100663296 & i) == 0) {
        }
        if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
        }
        final q630 q630Var322 = q630Var2;
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final boolean z, final gzs gzsVar, q630 q630Var, final dt1 dt1Var, long j, gxb0 gxb0Var, r5j0 r5j0Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        long j2;
        int i5;
        gxb0 gxb0Var2;
        int i6;
        int i7;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final long j3;
        final gxb0 gxb0Var3;
        final r5j0 r5j0Var2;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        long j4;
        r5j0 a;
        int i9;
        gxb0 gxb0Var4;
        long j5;
        uh50 C;
        androidx.compose.runtime.a M = aVar.M(-635369429);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.J(dt1Var) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                j2 = j;
                i3 |= M.p(j2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    gxb0Var2 = gxb0Var;
                    i3 |= M.J(gxb0Var2) ? 131072 : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= 524288;
                    }
                    i6 = i3 | 12582912;
                    if ((i & 100663296) == 0) {
                        i6 |= M.y(izsVar) ? 67108864 : 33554432;
                    }
                    i7 = i6;
                    if (M.t(i7 & 1, (i6 & 38347923) == 38347922)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var3 = q630Var2;
                        j3 = j2;
                        gxb0Var3 = gxb0Var2;
                        r5j0Var2 = r5j0Var;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            if (i10 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            if (i4 != 0) {
                                float f = 0;
                                i8 = -3670017;
                                q630Var4 = q630Var2;
                                j4 = (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                            } else {
                                i8 = -3670017;
                                q630Var4 = q630Var2;
                                j4 = j2;
                            }
                            if (i5 != 0) {
                                gxb0Var2 = new gxb0(false, false, 30);
                            }
                            a = lqu0.a();
                            i9 = i7 & i8;
                            gxb0Var4 = gxb0Var2;
                            j5 = j4;
                            q630Var2 = q630Var4;
                        } else {
                            M.h();
                            i9 = i7 & (-3670017);
                            a = r5j0Var;
                            gxb0Var4 = gxb0Var2;
                            j5 = j2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-635369429, i9, -1, "com.vk.core.compose.component.menu.VkContextMenu (VkContextMenu.kt:211)");
                        }
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new doj();
                            M.R(x);
                        }
                        doj dojVar = (doj) x;
                        dojVar.a = null;
                        dojVar.b = null;
                        dojVar.c.clear();
                        izsVar.invoke(dojVar);
                        ArrayList arrayList = dojVar.c;
                        SnapshotStateList<nnj> snapshotStateList = dojVar.f;
                        dak0 j6 = qak0.j();
                        uh50 uh50Var = j6 instanceof uh50 ? (uh50) j6 : null;
                        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            dak0 j7 = C.j();
                            try {
                                ((zak0) dojVar.d).setValue(dojVar.a);
                                ((zak0) dojVar.e).setValue(dojVar.b);
                                snapshotStateList.clear();
                                snapshotStateList.addAll(arrayList);
                                dojVar.a = null;
                                dojVar.b = null;
                                arrayList.clear();
                                s3q0 s3q0Var = s3q0.a;
                                C.w().a();
                                C.c();
                                aVar2 = M;
                                oqu0.b(z, gzsVar, s200.C(q630Var2, tnu0.a), dt1Var, j5, gxb0Var4, a, false, null, kai.c(-2352411, new p0r(dojVar, 5), M), aVar2, i9 & 33553534, 6, Tensorflow.FRAME_HEIGHT);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630Var3 = q630Var2;
                                j3 = j5;
                                gxb0Var3 = gxb0Var4;
                                r5j0Var2 = a;
                            } finally {
                                dak0.q(j7);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                C.c();
                                throw th2;
                            }
                        }
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.znu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                aou0.g(z, gzsVar, q630Var3, dt1Var, j3, gxb0Var3, r5j0Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                gxb0Var2 = gxb0Var;
                if ((i & 1572864) == 0) {
                }
                i6 = i3 | 12582912;
                if ((i & 100663296) == 0) {
                }
                i7 = i6;
                if (M.t(i7 & 1, (i6 & 38347923) == 38347922)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            j2 = j;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            gxb0Var2 = gxb0Var;
            if ((i & 1572864) == 0) {
            }
            i6 = i3 | 12582912;
            if ((i & 100663296) == 0) {
            }
            i7 = i6;
            if (M.t(i7 & 1, (i6 & 38347923) == 38347922)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        j2 = j;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        gxb0Var2 = gxb0Var;
        if ((i & 1572864) == 0) {
        }
        i6 = i3 | 12582912;
        if ((i & 100663296) == 0) {
        }
        i7 = i6;
        if (M.t(i7 & 1, (i6 & 38347923) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final gzs<s3q0> gzsVar, q630 q630Var, boolean z, Boolean bool, final snj snjVar, final tnj tnjVar, unj unjVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        boolean z2;
        int i5;
        Boolean bool2;
        int i6;
        unj unjVar2;
        final q630 q630Var3;
        final boolean z3;
        final Boolean bool3;
        final unj unjVar3;
        androidx.compose.runtime.f s;
        Throwable th;
        unj unjVar4;
        androidx.compose.runtime.a M = aVar.M(-1578649347);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= M.l(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    bool2 = bool;
                    i3 |= M.J(bool2) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= M.J(snjVar) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= M.J(tnjVar) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        unjVar2 = unjVar;
                        i3 |= M.J(unjVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                            q630.a aVar2 = q630.a.a;
                            if (i7 != 0) {
                                q630Var2 = aVar2;
                            }
                            boolean z4 = i4 != 0 ? true : z2;
                            bool3 = i5 != 0 ? null : bool2;
                            unj unjVar5 = i6 != 0 ? null : unjVar2;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1578649347, i3, -1, "com.vk.core.compose.component.menu.VkContextMenuItem (VkContextMenu.kt:308)");
                            }
                            float b = tnu0.b();
                            tnu0.a();
                            float f = kqu0.b;
                            tnu0.c();
                            float f2 = kqu0.u;
                            if (androidx.compose.runtime.b.d()) {
                                th = null;
                                androidx.compose.runtime.b.f(-1457972440, 6, -1, "com.vk.core.compose.component.defaults.VkContextMenuDefaults.resolvedItemIconGap (VkContextMenuDefaults.kt:54)");
                            } else {
                                th = null;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630 b2 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, 1, q630Var2);
                            Object x = M.x();
                            if (x == a.C0011a.a) {
                                x = ir.h(M);
                            }
                            q630 E = s200.E(ojc.b(b2, (sg50) x, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), z4, new plg0(0), gzsVar, 8), f, f2);
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, E);
                            cri.h7.getClass();
                            LayoutNode.a aVar3 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw th;
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
                            if (snjVar == null) {
                                M.K(340123944);
                            } else {
                                M.K(340123945);
                                snjVar.a(6, M);
                            }
                            M.j();
                            if (tnjVar == null) {
                                M.K(340177450);
                            } else {
                                M.K(340177451);
                                tnjVar.a(6, M);
                                if (snjVar != null && unjVar5 == null && bool3 == null) {
                                    M.K(-151390793);
                                    mq.d(aVar2, 4, M, 6);
                                } else {
                                    M.K(-162936898);
                                    M.j();
                                }
                            }
                            M.j();
                            if (bool3 != null) {
                                M.K(340402852);
                                if (bool3.booleanValue()) {
                                    M.K(340426071);
                                    q630 q = txj0.q(aVar2, 24);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(2124872764, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified20> (VkSdkIcons.kt:3656)");
                                    }
                                    lg90 a2 = pg90.a(R.drawable.vk_icon_verified_20, 0, M);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j = ylu0Var.getIcon().j;
                                    unjVar4 = unjVar5;
                                    vqv.a(a2, null, q, j, M, 440, 0);
                                    M.j();
                                } else {
                                    unjVar4 = unjVar5;
                                    M.K(340728321);
                                    mq.d(aVar2, 24, M, 6);
                                }
                                M.j();
                            } else {
                                unjVar4 = unjVar5;
                                M.K(340815338);
                                if (unjVar4 == null) {
                                    M.K(340835208);
                                    M.j();
                                } else {
                                    M.K(340835209);
                                    unjVar4.a(6, M);
                                    M.j();
                                    s3q0 s3q0Var = s3q0.a;
                                }
                                M.j();
                            }
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var2;
                            z3 = z4;
                            unjVar3 = unjVar4;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            z3 = z2;
                            bool3 = bool2;
                            unjVar3 = unjVar2;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.xnu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    aou0.h(gzs.this, q630Var3, z3, bool3, snjVar, tnjVar, unjVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    unjVar2 = unjVar;
                    if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                bool2 = bool;
                if ((i & 24576) == 0) {
                }
                if ((196608 & i) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                unjVar2 = unjVar;
                if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            bool2 = bool;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            unjVar2 = unjVar;
            if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        bool2 = bool;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        unjVar2 = unjVar;
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
