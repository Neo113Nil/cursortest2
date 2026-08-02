package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.ise;
import xsna.jqe;
import xsna.q630;
import xsna.wkj;

/* compiled from: CoverContent.kt */
/* loaded from: classes16.dex */
public final class q1k {
    public static final void a(ise.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        jqe jqeVar = bVar.d;
        androidx.compose.runtime.a M = aVar.M(-342103336);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-342103336, i2, -1, "com.vk.clips.playlists.folders.list.ui.FolderPlaylistItem (CoverContent.kt:125)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            List list = bVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-934878862, 0, -1, "com.vk.clips.playlists.folders.list.ui.rememberFolderCover (CoverContent.kt:89)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new gyr(list);
                M.R(x);
            }
            gyr gyrVar = (gyr) x;
            ((zak0) gyrVar.a).setValue(new wow(list));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            boolean z = true;
            com.vk.core.compose.component.cell.content.z a = com.vk.core.compose.component.cell.content.g.a(gyrVar, Cell$Left.Main.Size.Medium, null, PictureRadius.Large, null, M, 12607536, 108);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(bVar.c.a(context).toString(), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            zzr zzrVar = new zzr(jqeVar);
            M.K(1951200758);
            q630 E = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, q630Var), "PlaylistsListItem");
            if (jqeVar instanceof jqe.b) {
                boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object x2 = M.x();
                c0012a = c0012a2;
                if (z2 || x2 == c0012a) {
                    x2 = new ew3(6, izsVar, bVar);
                    M.R(x2);
                }
                E = E.g(xa4.J(q630.a.a, true, (gzs) x2));
            } else {
                c0012a = c0012a2;
            }
            M.j();
            if ((i3 & 14) != 4) {
                z = false;
            }
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new m1k(bVar, 0);
                M.R(x3);
            }
            wiu0.b(com.vk.core.compose.component.semantics.b.b(E, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3)), false, a, a2, zzrVar, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n1k(i, 0, (Object) bVar, (Object) izsVar, (Object) q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, List list, q630 q630Var) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> o1kVar;
        androidx.compose.runtime.a M = aVar.M(-1759123221);
        int i2 = (M.J(list) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1759123221, i2, -1, "com.vk.clips.playlists.folders.list.ui.StackCover (CoverContent.kt:160)");
            }
            boolean isEmpty = list.isEmpty();
            q630Var = q630.a.a;
            if (isEmpty) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    o1kVar = new mq1(list, q630Var, i, 3);
                    s.d = o1kVar;
                }
                return;
            }
            q630 q = txj0.q(q630Var, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            float f = 8;
            q630 m = hr80.m(q, j, vog0.b(f));
            float f2 = 2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d = rte0.d(r18.a(f2, ylu0Var2.getBackground().g, m, vog0.b(f)), vog0.b(f));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String str = (String) j5g.b0(0, new wow(list));
            if (str == null) {
                M.K(930098893);
            } else {
                M.K(930098894);
                c(str, dt1.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 4);
            }
            M.j();
            String str2 = (String) j5g.b0(2, new wow(list));
            if (str2 == null) {
                M.K(930210679);
            } else {
                M.K(930210680);
                c(str2, dt1.a.c, 0.5f, M, 3462, 0);
            }
            M.j();
            String str3 = (String) j5g.b0(1, new wow(list));
            if (str3 == null) {
                M.K(930405421);
            } else {
                M.K(930405422);
                c(str3, lc.c, 0.55f, M, 3078, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            o1kVar = new o1k(list, q630Var, i, 0);
            s.d = o1kVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final dt1 dt1Var, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        float f2;
        final float f3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1716611101);
        int i3 = (M.J(str) ? 32 : 16) | i;
        if ((i & 384) == 0) {
            i3 |= M.J(dt1Var) ? 256 : 128;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= M.n(f2) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                f3 = f2;
            } else {
                float f4 = i4 != 0 ? 1.0f : f2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1716611101, i3, -1, "com.vk.clips.playlists.folders.list.ui.StackImage (CoverContent.kt:202)");
                }
                lg90 s2 = xus.s(str, 0L, M, (i3 >> 3) & 14, 2);
                q630 f5 = txj0.f(txj0.c(ra8.a.b(q630.a.a, dt1Var), 1.0f), f4);
                float f6 = 2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vjw.a(s2, null, r18.a(f6, ylu0Var.getBackground().g, f5, vog0.b(8)), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f3 = f4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.p1k
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q1k.c(str, dt1Var, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
