package xsna;

import androidx.compose.runtime.a;
import com.vk.music.player.LoopMode;
import com.vkontakte.android.R;
import xsna.dz40;
import xsna.q630;

/* compiled from: MusicBigPlayerControls.kt */
/* loaded from: classes3.dex */
public final class lb40 {
    public final izs<sx40, s3q0> a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;

    /* compiled from: MusicBigPlayerControls.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoopMode.values().length];
            try {
                iArr[LoopMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoopMode.TRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lb40() {
        throw null;
    }

    public lb40(dz40.k kVar, izs izsVar) {
        this.a = izsVar;
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.a));
        this.c = androidx.compose.runtime.k.b(kVar.b);
        this.d = androidx.compose.runtime.k.b(kVar.c);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.d));
        this.f = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.e));
        this.g = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.f));
        this.h = androidx.compose.runtime.k.b(kVar.g);
        this.i = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.h));
        this.j = androidx.compose.runtime.k.b(Boolean.valueOf(kVar.i));
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-149976421);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-149976421, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content (MusicBigPlayerControls.kt:39)");
            }
            j07.a(kai.c(1901973085, new th3(this, 6), M), kai.c(1217742780, new oac(this, 11), M), kai.c(533512475, new bh5(this, 8), M), kai.c(-150717830, new u70(this, 8), M), kai.c(-834948135, new aza(this, 7), M), M, 224694);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new z85(this, q630Var, i, 6);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(381940974);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(381940974, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.PlayNextButton (MusicBigPlayerControls.kt:84)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.f).getValue()).booleanValue();
            float f = ((Boolean) ((zak0) this.i).getValue()).booleanValue() ? 48 : 36;
            int i3 = g() ? R.string.music_kids_talkback_player_go_forward : R.string.music_talkback_player_go_forward;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new t440(this, 1);
                M.R(x);
            }
            eva0.a(booleanValue, i3, (izs) x, null, f, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yde(this, i, 3);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1687459859);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1687459859, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.PlayPauseButton (MusicBigPlayerControls.kt:51)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            float f = ((Boolean) ((zak0) this.i).getValue()).booleanValue() ? 64 : 48;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new f0z(this, 9);
                M.R(x);
            }
            iva0.a(booleanValue, (izs) x, this.a, null, f, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bt3(this, i, 11);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(15588398);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(15588398, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.PlayPrevButton (MusicBigPlayerControls.kt:67)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.e).getValue()).booleanValue();
            float f = ((Boolean) ((zak0) this.i).getValue()).booleanValue() ? 48 : 36;
            int i3 = g() ? R.string.music_kids_talkback_player_go_back : R.string.music_talkback_player_go_back;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new kb40(this, 0);
                M.R(x);
            }
            nva0.a(booleanValue, i3, (izs) x, null, f, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w5h(this, i, 3);
        }
    }

    public final void e(LoopMode loopMode, androidx.compose.runtime.a aVar, int i) {
        LoopMode loopMode2;
        androidx.compose.runtime.a M = aVar.M(2125229403);
        int i2 = (M.o(loopMode.ordinal()) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2125229403, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.RepeatButton (MusicBigPlayerControls.kt:121)");
            }
            boolean z = !((Boolean) ((zak0) this.g).getValue()).booleanValue();
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new rmg(this, 29);
                M.R(x);
            }
            loopMode2 = loopMode;
            h0g0.a(loopMode2, z, (izs) x, this.a, null, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            loopMode2 = loopMode;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o9d(this, loopMode2, i, 6);
        }
    }

    public final void f(boolean z, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(299110514);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(299110514, i2, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.ShuffleButton (MusicBigPlayerControls.kt:101)");
            }
            boolean z3 = !((Boolean) ((zak0) this.g).getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean z4 = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                x = new o440(this, 1);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z5 = i3 == 32;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new lw20(this, 3);
                M.R(x2);
            }
            z2 = z;
            fkj0.a(i2 & 14, M, izsVar, (izs) x2, null, z2, z3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jb40(this, z2, i);
        }
    }

    public final boolean g() {
        return ((Boolean) ((zak0) this.j).getValue()).booleanValue();
    }
}
