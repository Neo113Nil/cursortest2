package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import xsna.dz40;

/* compiled from: AudioBookPlaybackQueueItem.kt */
/* loaded from: classes3.dex */
public final class aj4 extends eya0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public aj4(dz40.o.a aVar, boolean z, boolean z2, boolean z3) {
        this.a = androidx.compose.runtime.k.b(aVar);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.eya0
    public final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        int i2;
        efj efjVar;
        float f;
        int i3;
        tgp tgpVar;
        boolean z;
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(245371271);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(245371271, i4, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.Content (AudioBookPlaybackQueueItem.kt:46)");
            }
            float f2 = 48;
            wh50 wh50Var = this.a;
            efj c = z3r0.c(z3r0.f(((dz40.o.a) ((zak0) wh50Var).getValue()).b, f2, M, 48), new i60(this), new yi4(0), M);
            PictureRadius pictureRadius = PictureRadius.Small;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bz(4);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            int i5 = (i4 >> 6) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(587023081, i5, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.coverOverlay (AudioBookPlaybackQueueItem.kt:109)");
            }
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                M.K(1488467058);
                u5b0 u5b0Var = p6b0.a;
                Boolean bool = (Boolean) ((zak0) this.c).getValue();
                boolean booleanValue = bool.booleanValue();
                if (androidx.compose.runtime.b.d()) {
                    efjVar = c;
                    f = f2;
                    i3 = -1;
                    androidx.compose.runtime.b.f(-1824171213, 390, -1, "com.vk.music.stickyplayer.presentation.components.PlayingIndicationOverlay.Companion.invoke (PlayingIndication.kt:73)");
                } else {
                    efjVar = c;
                    f = f2;
                    i3 = -1;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new s6b0(u5b0Var, booleanValue);
                    M.R(x2);
                }
                s6b0 s6b0Var = (s6b0) x2;
                ((zak0) s6b0Var.a).setValue(u5b0Var);
                ((zak0) s6b0Var.b).setValue(bool);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                tgpVar = s6b0Var;
            } else {
                efjVar = c;
                f = f2;
                i3 = -1;
                M.K(1488470517);
                M.j();
                tgpVar = tgp.a;
            }
            tgp tgpVar2 = tgpVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i6 = i3;
            com.vk.core.compose.component.cell.content.z b = com.vk.core.compose.component.cell.content.g.b(efjVar, f, tgpVar2, pictureRadius, null, a, M, 36);
            String str = ((dz40.o.a) ((zak0) wh50Var).getValue()).c;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new g8(2);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.h1 a2 = Cell$Middle.d.b.a(str, null, null, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, M, 12610560, 70);
            String str2 = ((dz40.o.a) ((zak0) wh50Var).getValue()).d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i7 = i4 & 896;
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(a2, Cell$Middle.c.b.a(eya0.b(i7, ylu0Var.getText().q, str2), null, 0, 0, null, null, null, null, M, 805306368, 510), null, null, M, 196608, 28);
            String N = d370.N(R.string.music_talkback_player_more, 0, M);
            int i8 = i4 & 14;
            boolean z2 = (i7 == 256) | (i8 == 4);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new v43(2, izsVar, this);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            if (androidx.compose.runtime.b.d()) {
                z = false;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                z = false;
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().m;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new i8(6);
                M.R(x5);
            }
            com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(null, null, com.vk.core.compose.component.cell.content.r.a(N, gzsVar, j, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), M, 24576, 0), null, null, M, 59);
            boolean booleanValue2 = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            boolean z3 = (i7 == 256 ? true : z) | (i8 != 4 ? z : true);
            Object x6 = M.x();
            if (z3 || x6 == c0012a) {
                x6 = new com.vk.movika.sdk.android.defaultplayer.container.e(3, this, izsVar);
                M.R(x6);
            }
            q630Var2 = q630Var;
            wiu0.b(ojc.c(q630Var2, booleanValue2, null, null, (gzs) x6, 14), false, b, a3, a4, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zi4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    aj4.this.a(I, (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }
}
