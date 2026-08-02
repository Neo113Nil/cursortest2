package xsna;

import androidx.compose.runtime.a;
import xsna.dz40;
import xsna.q630;

/* compiled from: PlaybackQueueItem.kt */
/* loaded from: classes3.dex */
public final class gya0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final dz40.o oVar, final boolean z, final boolean z2, final boolean z3, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        bue0 bue0Var;
        androidx.compose.runtime.a M = aVar.M(-1247076337);
        if ((i & 6) == 0) {
            i2 = (M.J(oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1247076337, i2, -1, "com.vk.music.stickyplayer.presentation.components.queue.PlaybackQueueItem (PlaybackQueueItem.kt:28)");
            }
            boolean z4 = oVar instanceof dz40.o.b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4) {
                M.K(-144473991);
                dz40.o.b bVar = (dz40.o.b) oVar;
                int i3 = (i2 & 112) | 24576 | (i2 & 896) | (i2 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(716738757, i3, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.Companion.invoke (MusicPlaybackQueueItem.kt:190)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new lv40(bVar, z, z2, z3);
                    M.R(x);
                }
                lv40 lv40Var = (lv40) x;
                ((zak0) lv40Var.a).setValue(bVar);
                ((zak0) lv40Var.b).setValue(Boolean.valueOf(z));
                ((zak0) lv40Var.c).setValue(Boolean.valueOf(z2));
                ((zak0) lv40Var.d).setValue(Boolean.valueOf(z3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bue0Var = lv40Var;
            } else if (oVar instanceof dz40.o.c) {
                M.K(-144467077);
                dz40.o.c cVar = (dz40.o.c) oVar;
                int i4 = (i2 & 112) | 24576 | (i2 & 896) | (i2 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1536250298, i4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueueItem.Companion.invoke (PodcastPlaybackQueueItem.kt:153)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new kib0(cVar, z, z2, z3);
                    M.R(x2);
                }
                kib0 kib0Var = (kib0) x2;
                ((zak0) kib0Var.a).setValue(cVar);
                ((zak0) kib0Var.b).setValue(Boolean.valueOf(z));
                ((zak0) kib0Var.c).setValue(Boolean.valueOf(z2));
                ((zak0) kib0Var.d).setValue(Boolean.valueOf(z3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bue0Var = kib0Var;
            } else if (oVar instanceof dz40.o.a) {
                M.K(-144460035);
                dz40.o.a aVar2 = (dz40.o.a) oVar;
                int i5 = (i2 & 112) | 24576 | (i2 & 896) | (i2 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-677997205, i5, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueueItem.Companion.invoke (AudioBookPlaybackQueueItem.kt:121)");
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new aj4(aVar2, z, z2, z3);
                    M.R(x3);
                }
                aj4 aj4Var = (aj4) x3;
                ((zak0) aj4Var.a).setValue(aVar2);
                ((zak0) aj4Var.b).setValue(Boolean.valueOf(z));
                ((zak0) aj4Var.c).setValue(Boolean.valueOf(z2));
                ((zak0) aj4Var.d).setValue(Boolean.valueOf(z3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bue0Var = aj4Var;
            } else {
                if (!(oVar instanceof dz40.o.d)) {
                    throw alb0.c(-144475222, M);
                }
                M.K(-144453063);
                dz40.o.d dVar = (dz40.o.d) oVar;
                int i6 = (i2 & 112) | 24576 | (i2 & 896) | (i2 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1202443311, i6, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlaybackQueueItem.Companion.invoke (RadioPlaybackQueueItem.kt:173)");
                }
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new bue0(dVar, z, z2, z3);
                    M.R(x4);
                }
                bue0 bue0Var2 = (bue0) x4;
                ((zak0) bue0Var2.a).setValue(dVar);
                ((zak0) bue0Var2.b).setValue(Boolean.valueOf(z));
                ((zak0) bue0Var2.c).setValue(Boolean.valueOf(z2));
                ((zak0) bue0Var2.d).setValue(Boolean.valueOf(z3));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                bue0Var = bue0Var2;
            }
            q630 f = txj0.f(q630Var, 1.0f);
            if (z) {
                f = f.g(hr80.m(q630.a.a, l5g.c(14, l5g.d, 0.04f), vog0.b(10)));
            }
            bue0Var.a((i2 >> 12) & 14, M, izsVar, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fya0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gya0.a(dz40.o.this, z, z2, z3, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
