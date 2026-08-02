package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.phw;
import xsna.wkj;

/* compiled from: PlaylistEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class y8b0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0067  */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.vk.core.compose.component.cell.content.o] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final lg90 lg90Var, final String str, final q630 q630Var, final gzs<s3q0> gzsVar, boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final boolean z4;
        final boolean z5;
        androidx.compose.runtime.f s;
        ColorFilter porterDuffColorFilter;
        boolean z6;
        boolean z7;
        int i6;
        int i7;
        SemanticsConfiguration.Mode mode;
        int i8;
        androidx.compose.runtime.a aVar3;
        com.vk.core.compose.component.cell.content.i0 a;
        ?? r16;
        androidx.compose.runtime.a M = aVar.M(-1139537757);
        int i9 = (M.y(lg90Var) ? 4 : 2) | i | (M.J(str) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        int i10 = i2 & 16;
        if (i10 != 0) {
            i9 |= 24576;
        } else if ((i & 24576) == 0) {
            i9 |= M.l(z) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i4 = i9 | 196608;
                z3 = z2;
            } else {
                z3 = z2;
                i4 = i9 | (M.l(z3) ? 131072 : 65536);
            }
            i5 = i4;
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                aVar2 = M;
                aVar2.h();
                z4 = z;
                z5 = z3;
            } else {
                boolean z8 = i10 != 0 ? false : z;
                boolean z9 = i3 != 0 ? true : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1139537757, i5, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.PlaylistEntryPointCell (PlaylistEntryPointCell.kt:32)");
                }
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (lg90Var == null) {
                    M.K(-547532698);
                    M.j();
                    z7 = false;
                    aVar3 = M;
                    i7 = i5;
                    i8 = 2048;
                    i6 = 3;
                    a = null;
                    mode = null;
                } else {
                    M.K(-547532697);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                    }
                    oe7 oe7Var = new oe7(j, 5, porterDuffColorFilter);
                    if (androidx.compose.runtime.b.d()) {
                        z6 = false;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        z6 = false;
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z7 = z6;
                    phw a2 = phw.a.a(lg90Var, new rek0(ylu0Var2.getBackground().x), wkj.a.e, oe7Var, null, M, 197000 | (i5 & 14), 16);
                    Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new u4u(21);
                        M.R(x);
                    }
                    i6 = 3;
                    com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    i7 = i5;
                    mode = null;
                    c0012a = c0012a;
                    i8 = 2048;
                    aVar3 = M;
                    a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.g.a(a2, size, null, null, a3, M, 12582960, 60), null, aVar3, 2);
                    aVar3.j();
                }
                us2 us2Var = new us2(str);
                Object x2 = aVar3.x();
                if (x2 == c0012a) {
                    x2 = new xmz(21);
                    aVar3.R(x2);
                }
                androidx.compose.runtime.a aVar4 = aVar3;
                com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(Cell$Middle.d.b.b(us2Var, null, null, null, 1, 2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, i6), null, null, aVar4, 221184, 6, 910), null, null, null, aVar4, 196608, 30);
                if (z8) {
                    aVar4.K(120921280);
                    Object x3 = aVar4.x();
                    if (x3 == c0012a) {
                        x3 = new h2w(19);
                        aVar4.R(x3);
                    }
                    com.vk.core.compose.component.cell.content.u0 a5 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, i6), 0L, false, aVar4, 221184, 11);
                    aVar4.j();
                    r16 = a5;
                } else {
                    aVar4.K(-546173286);
                    aVar4.j();
                    r16 = mode;
                }
                q630 f = txj0.f(q630Var, 1.0f);
                boolean z10 = (i7 & 7168) != i8 ? z7 : true;
                Object x4 = aVar4.x();
                if (z10 || x4 == c0012a) {
                    x4 = new j0o(1, gzsVar);
                    aVar4.R(x4);
                }
                wiu0.b(s200.H(ahn.E(o19.a(ojc.c(f, false, null, null, (gzs) x4, 15), z9 ? 1.0f : 0.64f), "MusicPickerPlaylistsEntry"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), false, a, a4, r16, null, null, aVar4, 0, 98);
                aVar2 = aVar4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z4 = z8;
                z5 = z9;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.x8b0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y8b0.a(lg90.this, str, q630Var, gzsVar, z4, z5, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        i5 = i4;
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
