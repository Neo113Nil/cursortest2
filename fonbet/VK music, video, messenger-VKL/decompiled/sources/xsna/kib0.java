package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;
import xsna.epx;
import xsna.sx40;

/* compiled from: PodcastPlaybackQueueItem.kt */
/* loaded from: classes3.dex */
public final class kib0 extends eya0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    /* compiled from: PodcastPlaybackQueueItem.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ izs<sx40, s3q0> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super sx40, s3q0> izsVar) {
            super(0, epx.a.class, "onIconClick", "Content$onIconClick(Lcom/vk/music/stickyplayer/presentation/components/podcast/PodcastPlaybackQueueItem;Lkotlin/jvm/functions/Function1;)V", 0);
            this.$onAction = izsVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            kib0 kib0Var = kib0.this;
            this.$onAction.invoke(((Boolean) ((zak0) kib0Var.b).getValue()).booleanValue() ? sx40.p0.b : new sx40.l(kib0Var.c().a));
            return s3q0.a;
        }
    }

    public kib0(dz40.o.c cVar, boolean z, boolean z2, boolean z3) {
        this.a = androidx.compose.runtime.k.b(cVar);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.eya0
    public final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        efj efjVar;
        float f;
        fcy fcyVar;
        int i3;
        tgp tgpVar;
        com.vk.core.compose.component.cell.content.x xVar;
        us2 b;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i4;
        androidx.compose.runtime.a M = aVar.M(845440108);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(845440108, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.Content (PodcastPlaybackQueueItem.kt:49)");
            }
            float f2 = 48;
            efj c = z3r0.c(z3r0.f(c().b, f2, M, 48), new a9b(this, 6), new eei(3), M);
            PictureRadius pictureRadius = PictureRadius.Small;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new xht(19);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            int i5 = i2 & 896;
            int i6 = i2 & 14;
            boolean z = (i5 == 256) | (i6 == 4);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new a(izsVar);
                M.R(x2);
            }
            fcy fcyVar2 = (fcy) x2;
            wh50 wh50Var = this.d;
            if (!((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                fcyVar2 = null;
            }
            int i7 = (i2 >> 6) & 14;
            if (androidx.compose.runtime.b.d()) {
                efjVar = c;
                androidx.compose.runtime.b.f(1532151630, i7, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.coverOverlay (PodcastPlaybackQueueItem.kt:141)");
            } else {
                efjVar = c;
            }
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                M.K(-776064105);
                u5b0 u5b0Var = p6b0.a;
                Boolean bool = (Boolean) ((zak0) this.c).getValue();
                boolean booleanValue = bool.booleanValue();
                if (androidx.compose.runtime.b.d()) {
                    f = f2;
                    fcyVar = fcyVar2;
                    i3 = -1;
                    androidx.compose.runtime.b.f(-1824171213, 390, -1, "com.vk.music.stickyplayer.presentation.components.PlayingIndicationOverlay.Companion.invoke (PlayingIndication.kt:73)");
                } else {
                    f = f2;
                    fcyVar = fcyVar2;
                    i3 = -1;
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new s6b0(u5b0Var, booleanValue);
                    M.R(x3);
                }
                s6b0 s6b0Var = (s6b0) x3;
                ((zak0) s6b0Var.a).setValue(u5b0Var);
                ((zak0) s6b0Var.b).setValue(bool);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                tgpVar = s6b0Var;
            } else {
                f = f2;
                fcyVar = fcyVar2;
                i3 = -1;
                M.K(-776060646);
                M.j();
                tgpVar = tgp.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i8 = i3;
            com.vk.core.compose.component.cell.content.z b2 = com.vk.core.compose.component.cell.content.g.b(efjVar, f, tgpVar, pictureRadius, (gzs) fcyVar, a2, M, 4);
            String str = c().c;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new ye40(8);
                M.R(x4);
            }
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str, null, null, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, M, 12610560, 70);
            us2 b3 = eya0.b(i5, wlb0.h(M).getText().q, c().d);
            if (c().f) {
                M.K(819667944);
                qzu0.a.getClass();
                com.vk.core.compose.component.cell.content.x a4 = com.vk.core.compose.component.cell.content.h.a(qzu0.O(M), 0L, M, 24584, 14);
                M.j();
                xVar = a4;
            } else {
                M.K(819841233);
                M.j();
                xVar = null;
            }
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new t3v(12);
                M.R(x5);
            }
            com.vk.core.compose.component.cell.content.h1 a5 = Cell$Middle.c.b.a(b3, null, 1, 2, xVar, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), null, M, 805309824, 418);
            androidx.compose.runtime.a aVar2 = M;
            String str2 = c().e;
            if (str2 == null) {
                aVar2.K(820196772);
                aVar2.j();
                b = null;
            } else {
                b = eya0.b(i5, gub0.a(aVar2, 719194621, aVar2).q, str2);
                aVar2.j();
            }
            if (b == null) {
                aVar2.K(820253037);
                aVar2.j();
                h1Var = null;
            } else {
                aVar2.K(820253038);
                com.vk.core.compose.component.cell.content.h1 b4 = Cell$Middle.b.a.b(b, 1, 2, null, aVar2, 200064, 18);
                aVar2 = aVar2;
                aVar2.j();
                h1Var = b4;
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(a3, a5, h1Var, null, aVar3, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                i4 = 0;
                androidx.compose.runtime.b.f(1416148378, 0, i8, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Reorder24> (VkSdkIcons.kt:2948)");
            } else {
                i4 = 0;
            }
            lg90 b5 = or.b(aVar3, -987250162, R.drawable.vk_icon_reorder_24, aVar3, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = 24;
            com.vk.core.compose.component.cell.content.x a7 = com.vk.core.compose.component.cell.content.p.a(b5, wlb0.h(aVar3).getIcon().m, byc0.b(f3, f3), null, null, null, aVar3, 1573256, 56);
            String N = d370.N(R.string.music_talkback_player_more, 0, aVar3);
            boolean z2 = (i6 == 4) | (i5 == 256);
            Object x6 = aVar3.x();
            if (z2 || x6 == c0012a) {
                x6 = new ni0(12, izsVar, this);
                aVar3.R(x6);
            }
            gzs gzsVar = (gzs) x6;
            long j = wlb0.h(aVar3).getIcon().m;
            Object x7 = aVar3.x();
            if (x7 == c0012a) {
                x7 = new irt(13);
                aVar3.R(x7);
            }
            com.vk.core.compose.component.cell.content.y0 a8 = o.c.a(null, a7, com.vk.core.compose.component.cell.content.r.a(N, gzsVar, j, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3), aVar3, 24576, 0), null, null, aVar3, 57);
            boolean booleanValue2 = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            boolean z3 = (i6 == 4) | (i5 == 256);
            Object x8 = aVar3.x();
            if (z3 || x8 == c0012a) {
                x8 = new d5(19, izsVar, this);
                aVar3.R(x8);
            }
            wiu0.b(ojc.c(q630Var, booleanValue2, null, null, (gzs) x8, 14), false, b2, a6, a8, null, null, aVar3, 0, 98);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q37(i, 2, this, izsVar, q630Var);
        }
    }

    public final dz40.o.c c() {
        return (dz40.o.c) ((zak0) this.a).getValue();
    }
}
