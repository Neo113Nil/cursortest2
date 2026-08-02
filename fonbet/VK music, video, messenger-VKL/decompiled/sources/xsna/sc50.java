package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: MusicTrackMenuHeader.kt */
/* loaded from: classes3.dex */
public final class sc50 {
    public static final long a = l2l0.l(16);

    public static final void a(sb50 sb50Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        int i3;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        boolean z = sb50Var.d;
        androidx.compose.runtime.a M = aVar.M(975912313);
        if ((i & 6) == 0) {
            i2 = i | (M.J(sb50Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(975912313, i4, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MusicTrackMenuHeader (MusicTrackMenuHeader.kt:47)");
            }
            q630Var2 = q630.a.a;
            q630 f = txj0.f(q630Var2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                long j = a;
                x = on00.f(new Pair("illegal_notice_type", new r0x(new esa0(j, j, 6), xa4.f)));
                M.R(x);
            }
            Map map = (Map) x;
            q630 f2 = txj0.f(q630Var2, 1.0f);
            com.vk.core.compose.component.cell.content.j0 a3 = Cell$Left.Main.a.C0731a.a(kai.c(-1252904024, new qc50(sb50Var, 0), M), M);
            frv0 frv0Var = wlb0.l(M).N;
            long j2 = wlb0.h(M).getText().m;
            int i5 = i4 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1955933776, i5, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.getTitleAnnotatedString (MusicTrackMenuHeader.kt:129)");
            }
            us2.b bVar = new us2.b();
            bVar.h(zs2.a(sb50Var.b, hik0.a(frv0Var.a.a, j2, 65534)));
            if (z) {
                s0x.a(bVar, "illegal_notice_type", "�");
            }
            us2 n = bVar.n();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new l8k(25);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(n, map, null, null, 1, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, null, M, 221184, 6, 908);
            String str = sb50Var.c;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new com(22);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(str, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 12583344, 88);
            if (z) {
                M.K(-283310159);
                i3 = 0;
                com.vk.core.compose.component.cell.content.h1 a4 = Cell$Middle.b.a.a(d370.N(R.string.music_track_age_restriction, 0, M), 1, null, M, 25008, 8);
                M.j();
                h1Var = a4;
            } else {
                i3 = 0;
                M.K(-283024153);
                M.j();
                h1Var = null;
            }
            wiu0.b(f2, false, a3, Cell$Middle.a.a(b, b2, h1Var, null, M, 196608, 24), null, null, null, M, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            M = M;
            if (sb50Var.e) {
                M.K(-282904803);
                yqv0.c(d370.N(R.string.music_track_foreign_agent, i3, M), s200.E(q630Var2, 16, 8), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, M, 100663344, 48, 5880);
                M = M;
            } else {
                M.K(-287506381);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rc50(sb50Var, q630Var2, i, 0);
        }
    }
}
