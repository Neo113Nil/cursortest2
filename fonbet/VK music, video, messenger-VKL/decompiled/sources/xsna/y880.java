package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.data.PostInteract;

/* compiled from: OnMediaTrackUiDto.kt */
/* loaded from: classes4.dex */
public final class y880 extends ol60 {
    public final MusicTrack h;
    public final String i;
    public final Thumb j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final String p;
    public final PostInteract q;

    public y880(MusicTrack musicTrack, String str, Thumb thumb, boolean z, boolean z2, boolean z3, boolean z4, int i, String str2, PostInteract postInteract) {
        super(342, 0, i, 0, null);
        this.h = musicTrack;
        this.i = str;
        this.j = thumb;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
        this.o = i;
        this.p = str2;
        this.q = postInteract;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y880)) {
            return false;
        }
        y880 y880Var = (y880) obj;
        return epx.f(this.h, y880Var.h) && epx.f(this.i, y880Var.i) && epx.f(this.j, y880Var.j) && this.k == y880Var.k && this.l == y880Var.l && this.m == y880Var.m && this.n == y880Var.n && this.o == y880Var.o && epx.f(this.p, y880Var.p) && epx.f(this.q, y880Var.q);
    }

    @Override // xsna.ol60
    public final int f() {
        return this.o;
    }

    public final int hashCode() {
        int a = urd0.a(this.h.hashCode() * 31, 31, this.i);
        Thumb thumb = this.j;
        int a2 = shy.a(this.o, qoy.b(qoy.b(qoy.b(qoy.b(shy.a(0, shy.a(0, (a + (thumb == null ? 0 : thumb.hashCode())) * 31, 31), 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31);
        String str = this.p;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        PostInteract postInteract = this.q;
        return hashCode + (postInteract != null ? postInteract.hashCode() : 0);
    }

    public final boolean i() {
        return this.m;
    }

    public final String toString() {
        return "OnMediaTrackUiDto(track=" + this.h + ", title=" + this.i + ", image=" + this.j + ", horizontalPaddings=0, marginBottom=0, isRestricted=" + this.k + ", isExplicit=" + this.l + ", isCarousel=" + this.m + ", isSnippet=" + this.n + ", seqId=" + this.o + ", refer=" + this.p + ", postInteract=" + this.q + ')';
    }
}
