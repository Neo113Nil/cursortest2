package xsna;

import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.data.PostInteract;

/* compiled from: OnMediaPlaylistUiDto.kt */
/* loaded from: classes4.dex */
public final class t880 extends ol60 {
    public final Playlist h;
    public final String i;
    public final String j;
    public final Thumb k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final PostInteract q;

    public t880(Playlist playlist, String str, String str2, Thumb thumb, boolean z, boolean z2, boolean z3, boolean z4, String str3, PostInteract postInteract) {
        super(342, 0, 0, 0, null);
        this.h = playlist;
        this.i = str;
        this.j = str2;
        this.k = thumb;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = str3;
        this.q = postInteract;
    }

    public static t880 i(t880 t880Var, Playlist playlist, int i) {
        if ((i & 1) != 0) {
            playlist = t880Var.h;
        }
        String str = t880Var.i;
        String str2 = t880Var.j;
        Thumb thumb = t880Var.k;
        t880Var.getClass();
        t880Var.getClass();
        boolean z = t880Var.l;
        boolean z2 = t880Var.m;
        boolean z3 = t880Var.n;
        t880Var.getClass();
        String str3 = t880Var.p;
        PostInteract postInteract = t880Var.q;
        t880Var.getClass();
        return new t880(playlist, str, str2, thumb, z, z2, z3, true, str3, postInteract);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t880)) {
            return false;
        }
        t880 t880Var = (t880) obj;
        return epx.f(this.h, t880Var.h) && epx.f(this.i, t880Var.i) && epx.f(this.j, t880Var.j) && epx.f(this.k, t880Var.k) && this.l == t880Var.l && this.m == t880Var.m && this.n == t880Var.n && this.o == t880Var.o && epx.f(this.p, t880Var.p) && epx.f(this.q, t880Var.q);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.h.hashCode() * 31, 31, this.i), 31, this.j);
        Thumb thumb = this.k;
        int a2 = shy.a(0, qoy.b(qoy.b(qoy.b(qoy.b(shy.a(0, shy.a(0, (a + (thumb == null ? 0 : thumb.hashCode())) * 31, 31), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31);
        String str = this.p;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        PostInteract postInteract = this.q;
        return hashCode + (postInteract != null ? postInteract.hashCode() : 0);
    }

    public final String toString() {
        return "OnMediaPlaylistUiDto(playlist=" + this.h + ", title=" + this.i + ", subtitle=" + this.j + ", image=" + this.k + ", horizontalPaddings=0, marginBottom=0, isRestricted=" + this.l + ", isExplicit=" + this.m + ", isCarousel=" + this.n + ", isUpdated=" + this.o + ", seqId=0, refer=" + this.p + ", postInteract=" + this.q + ')';
    }
}
