package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;
import xsna.zzc;

/* compiled from: PlaylistCell.kt */
/* loaded from: classes16.dex */
public final class a8b0 {
    public static final void a(zzc.a aVar, boolean z, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        String obj;
        String obj2;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar2.M(-1912134219);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1912134219, i2, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.PlaylistCell (PlaylistCell.kt:20)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i3 = (i2 & 14) | 384;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(646908188, i3, -1, "com.vk.clips.playlists.playlist_ui.ui.playlist_cell.PlaylistImage.Companion.invoke (PlaylistImage.kt:43)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new gab0(aVar);
                M.R(x);
            }
            gab0 gab0Var = (gab0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(gab0Var, null, M, 2);
            boolean z2 = aVar instanceof zzc.a.C4211a;
            if (z2) {
                obj = ((zzc.a.C4211a) aVar).a.a().a(context).toString();
            } else {
                if (!(aVar instanceof zzc.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((zzc.a.b) aVar).a.a().a(context).toString();
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(obj, null, null, 2, null, null, M, 12610560, 102);
            if (z2) {
                zzc.a.C4211a c4211a = (zzc.a.C4211a) aVar;
                obj2 = String.format("%s · %s", Arrays.copyOf(new Object[]{tlo0.b.a(c4211a.c, context).toString(), c4211a.d.a(context).toString()}, 2));
            } else {
                if (!(aVar instanceof zzc.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = tlo0.b.a(((zzc.a.b) aVar).b, context).toString();
            }
            String str = obj2;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new irt(11);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, Cell$Middle.c.b.b(str, 1, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), M, 12583344, 88), null, null, M, 196608, 28);
            if (z) {
                M.K(-237820827);
                com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(null, null, null, null, o.f.a.a(d370.N(R.string.clips_playlists_accessibility_reorder, 0, M), M, 3), M, 47);
                M.j();
                y0Var = a4;
            } else {
                M.K(-237591055);
                M.j();
                y0Var = null;
            }
            wiu0.b(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 7), false, a, a3, y0Var, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cjw(aVar, z, q630Var, i);
        }
    }
}
