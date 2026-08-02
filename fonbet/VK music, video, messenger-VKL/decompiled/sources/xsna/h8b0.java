package xsna;

import xsna.chs;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: MusicPlaylistLargeSlider.kt */
/* loaded from: classes3.dex */
public final class h8b0 implements efj {
    public final String a;

    public h8b0(String str) {
        this.a = str;
    }

    @Override // xsna.efj
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar, final q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1403664637);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1403664637, i2, -1, "com.vk.music.playlist.framework.presentation.catalog.PlaylistCoverContent.invoke (MusicPlaylistLargeSlider.kt:94)");
            }
            fwu0.c(ahn.E(txj0.d(q630Var, 1.0f), "musicSliderItemImage"), null, this.a, null, null, null, null, kai.c(538169170, new a0t() { // from class: xsna.f8b0
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    efj a;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        i3 = (aVar2.J(chsVar) ? 32 : 16) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1169) != 1168)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(538169170, i3, -1, "com.vk.music.playlist.framework.presentation.catalog.PlaylistCoverContent.invoke.<anonymous> (MusicPlaylistLargeSlider.kt:101)");
                        }
                        if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                            aVar2.K(-515033306);
                            qzu0.a.getClass();
                            lg90 g1 = qzu0.g1(aVar2);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            a = xpv.a.a(g1, ylu0Var.getIcon().l, null, aVar2, 24584, 12);
                            aVar2.j();
                        } else {
                            aVar2.K(-514811253);
                            a = phw.a.a(lg90Var, null, null, null, null, aVar2, 196616 | ((i3 >> 6) & 14), 30);
                            aVar2.j();
                        }
                        a.a(48, j, aVar2, txj0.d(q630.a.a, 1.0f));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.g8b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    h8b0.this.a(I, j, (androidx.compose.runtime.a) obj, q630Var);
                    return s3q0.a;
                }
            };
        }
    }
}
