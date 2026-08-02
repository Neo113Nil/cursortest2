package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;

/* compiled from: PostingStep2SwitchCell.kt */
/* loaded from: classes18.dex */
public final class woc0 {
    public static final void a(final o00 o00Var, final String str, final String str2, final boolean z, final gzs gzsVar, final q630 q630Var, final String str3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(329411766);
        int i2 = i | (M.J(o00Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(329411766, i2, -1, "com.vk.feed.tool.compose.posting.step2cell.PostingStep2SwitchVkCell (PostingStep2SwitchCell.kt:23)");
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 1, null, null, M, ((i2 >> 3) & 14) | 12610560, 102), Cell$Middle.c.b.b(str2, 1, null, null, null, M, ((i2 >> 6) & 14) | 12583344, 120), null, null, M, 196608, 28);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new jv2(str3, 2);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            int i3 = i2 >> 9;
            wiu0.b(txj0.j(48, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var), false, o00Var, a, com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, a2, M, (i3 & 14) | 24576 | (i3 & 112), 4), null, null, M, (i2 << 6) & 896, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, z, gzsVar, q630Var, str3, i) { // from class: xsna.voc0
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ String h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1572865);
                    woc0.a(o00.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
