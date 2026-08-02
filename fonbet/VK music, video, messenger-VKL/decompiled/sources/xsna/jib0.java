package xsna;

/* compiled from: PodcastPlaybackQueue.kt */
/* loaded from: classes3.dex */
public final class jib0 extends gxa0 {
    public jib0() {
        throw null;
    }

    public final void j(int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(765779858);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(765779858, i2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueue.Content (PodcastPlaybackQueue.kt:33)");
            }
            e(h(), g(), i(), izsVar, q630Var, kai.c(54816013, new zzs() { // from class: xsna.iib0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    xvy xvyVar = (xvy) obj;
                    q630 q630Var2 = (q630) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(xvyVar) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(q630Var2) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(54816013, i3, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueue.Content.<anonymous> (PodcastPlaybackQueue.kt:41)");
                        }
                        jib0.this.c((i3 & 14) | ((i3 << 3) & 896), aVar2, izsVar, xvyVar, q630Var2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 9) & 7168) | 221184 | ((i2 << 12) & 3670016));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ar0(i, 8, (Object) this, izsVar, q630Var);
        }
    }
}
