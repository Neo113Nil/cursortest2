package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: KidsAudioBookBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class giy {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final kg50 c;
    public final wh50 d;
    public final wh50 e;

    public giy() {
        throw null;
    }

    public giy(boolean z, float f, boolean z2, wh50 wh50Var, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.d.a(f);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.e = androidx.compose.runtime.k.b(wh50Var);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-581584572);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-581584572, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.Content (KidsAudioBookBigPlayerControls.kt:34)");
            }
            j07.a(qxm0.c, kai.c(-546545883, new lk1(this, 6), M), kai.c(635686852, new ncb(this, 6), M), kai.c(1817919587, new hue(this, 6), M), qxm0.d, M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wja(this, q630Var, i, 6);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-47257027);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-47257027, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.FastForwardButton (KidsAudioBookBigPlayerControls.kt:70)");
            }
            zkq.a(this.a, null, 48, M, 3078, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p0h(this, i, 2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-849431530);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-849431530, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.PlayPauseButton (KidsAudioBookBigPlayerControls.kt:55)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            float f = 64;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new tb4(29);
                M.R(x);
            }
            iva0.a(booleanValue, (izs) x, this.a, null, f, M, 24624, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new it7(this, i);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(716973515);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(716973515, i2, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.RewindButton (KidsAudioBookBigPlayerControls.kt:46)");
            }
            kjg0.a(this.a, null, 48, M, 3078, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u05(this, i, 6);
        }
    }
}
