package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;
import xsna.xpv;
import xsna.zzc;

/* compiled from: PlaylistImage.kt */
/* loaded from: classes16.dex */
public final class hab0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(zzc.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        Throwable th;
        xpv xpvVar;
        androidx.compose.runtime.a M = aVar2.M(321985592);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(321985592, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.ImageCellContent (PlaylistImage.kt:56)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            if (aVar instanceof zzc.a.C4211a) {
                M.K(1611029512);
                zzc.a.C4211a c4211a = (zzc.a.C4211a) aVar;
                ImageSize Cb = ((Image) c4211a.b).Cb(azlVar.r0(70), true, false);
                String str = Cb != null ? Cb.d.d : null;
                lg90 s = xus.s(str == null ? "" : str, 0L, M, 0, 2);
                boolean z = c4211a.e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(337013969, 3464, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.LockableImageContent.Companion.invoke (LockableImageContent.kt:67)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                wkj.a.C3940a c3940a = wkj.a.a;
                if (x == c0012a) {
                    x = new wzz(s, z, c3940a);
                    M.R(x);
                }
                wzz wzzVar = (wzz) x;
                ((zak0) wzzVar.a).setValue(s);
                ((zak0) wzzVar.b).setValue(Boolean.valueOf(z));
                ((zak0) wzzVar.c).setValue(c3940a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                th = null;
                xpvVar = wzzVar;
            } else {
                if (!(aVar instanceof zzc.a.b)) {
                    throw alb0.c(190514803, M);
                }
                M.K(1611396955);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rek0 rek0Var = new rek0(ylu0Var.getImage().c);
                ImageSize Cb2 = ((Image) ((zzc.a.b) aVar).c).Cb(azlVar.r0(28), true, false);
                String str2 = Cb2 != null ? Cb2.d.d : null;
                th = null;
                lg90 s2 = xus.s(str2 != null ? str2 : "", 0L, M, 0, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                xpv a = xpv.a.a(s2, ylu0Var2.getIcon().l, rek0Var, M, 24584, 8);
                M = M;
                M.j();
                xpvVar = a;
            }
            xpv xpvVar2 = xpvVar;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 70;
            androidx.compose.runtime.a aVar4 = M;
            xpvVar2.a(6, byc0.b(f, f), aVar4, rte0.d(txj0.s(q630.a.a, f, 86), vog0.b(6)).g(new gor0(dt1.a.l)));
            M = aVar4;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s3 = M.s();
        if (s3 != null) {
            s3.d = new a8d(aVar, q630Var, i, 3);
        }
    }
}
