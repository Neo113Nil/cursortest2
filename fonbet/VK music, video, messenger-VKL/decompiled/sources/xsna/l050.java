package xsna;

import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import xsna.bi40;

/* compiled from: MusicPlaylistHeaderButtonsState.kt */
/* loaded from: classes3.dex */
public final class l050 {
    public final MusicTrackPlayState a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final bi40 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public l050() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l050)) {
            return false;
        }
        l050 l050Var = (l050) obj;
        return this.a == l050Var.a && this.b == l050Var.b && this.c == l050Var.c && this.d == l050Var.d && this.e == l050Var.e && this.f == l050Var.f && this.g == l050Var.g && this.h == l050Var.h && epx.f(this.i, l050Var.i) && this.j == l050Var.j && this.k == l050Var.k && this.l == l050Var.l && this.m == l050Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + qoy.b(qoy.b(qoy.b((this.i.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlaylistHeaderButtonsState(playState=");
        sb.append(this.a);
        sb.append(", isShuffleOn=");
        sb.append(this.b);
        sb.append(", canPlay=");
        sb.append(this.c);
        sb.append(", canEdit=");
        sb.append(this.d);
        sb.append(", isAdded=");
        sb.append(this.e);
        sb.append(", canAdd=");
        sb.append(this.f);
        sb.append(", canSaveAsCopy=");
        sb.append(this.g);
        sb.append(", canDownload=");
        sb.append(this.h);
        sb.append(", downloadingState=");
        sb.append(this.i);
        sb.append(", isAlbum=");
        sb.append(this.j);
        sb.append(", isKidsModeEnabled=");
        sb.append(this.k);
        sb.append(", hasKidsContext=");
        sb.append(this.l);
        sb.append(", canPlayMix=");
        return defpackage.q0.a(sb, this.m, ')');
    }

    public l050(MusicTrackPlayState musicTrackPlayState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bi40 bi40Var, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = musicTrackPlayState;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = bi40Var;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    public /* synthetic */ l050(int i) {
        this(MusicTrackPlayState.NONE, false, true, false, false, false, false, true, bi40.c.a, false, false, false, false);
    }
}
