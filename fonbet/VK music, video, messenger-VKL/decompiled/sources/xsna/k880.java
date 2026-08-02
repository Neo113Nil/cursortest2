package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;

/* compiled from: OnMediaMultiTrackUiDto.kt */
/* loaded from: classes4.dex */
public final class k880 extends ol60 {
    public final List<MusicTrack> h;
    public final MusicTrack i;
    public final int j;
    public final String k;
    public final String l;
    public final Thumb m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final PostInteract r;

    public k880(List list, MusicTrack musicTrack, int i, String str, String str2, Thumb thumb, boolean z, boolean z2, boolean z3, String str3, PostInteract postInteract) {
        super(357, 0, 0, 0, null);
        this.h = list;
        this.i = musicTrack;
        this.j = i;
        this.k = str;
        this.l = str2;
        this.m = thumb;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = str3;
        this.r = postInteract;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k880 i(k880 k880Var, ArrayList arrayList, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = k880Var.h;
        }
        MusicTrack musicTrack = k880Var.i;
        int i2 = k880Var.j;
        String str = k880Var.k;
        String str2 = k880Var.l;
        Thumb thumb = k880Var.m;
        k880Var.getClass();
        k880Var.getClass();
        boolean z = k880Var.n;
        boolean z2 = k880Var.o;
        k880Var.getClass();
        String str3 = k880Var.q;
        PostInteract postInteract = k880Var.r;
        k880Var.getClass();
        return new k880(list, musicTrack, i2, str, str2, thumb, z, z2, true, str3, postInteract);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k880)) {
            return false;
        }
        k880 k880Var = (k880) obj;
        return epx.f(this.h, k880Var.h) && epx.f(this.i, k880Var.i) && this.j == k880Var.j && epx.f(this.k, k880Var.k) && epx.f(this.l, k880Var.l) && epx.f(this.m, k880Var.m) && this.n == k880Var.n && this.o == k880Var.o && this.p == k880Var.p && epx.f(this.q, k880Var.q) && epx.f(this.r, k880Var.r);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a = shy.a(this.j, (this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31);
        String str = this.k;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Thumb thumb = this.m;
        int a2 = shy.a(0, qoy.b(qoy.b(qoy.b(shy.a(0, shy.a(0, (hashCode2 + (thumb == null ? 0 : thumb.hashCode())) * 31, 31), 31), 31, this.n), 31, this.o), 31, this.p), 31);
        String str3 = this.q;
        int hashCode3 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PostInteract postInteract = this.r;
        return hashCode3 + (postInteract != null ? postInteract.hashCode() : 0);
    }

    public final List<MusicTrack> j() {
        return this.h;
    }

    public final String toString() {
        return "OnMediaMultiTrackUiDto(tracks=" + this.h + ", firstTrack=" + this.i + ", tracksCount=" + this.j + ", title=" + this.k + ", subtitle=" + this.l + ", image=" + this.m + ", horizontalPaddings=0, marginBottom=0, isRestricted=" + this.n + ", isCarousel=" + this.o + ", isUpdated=" + this.p + ", seqId=0, refer=" + this.q + ", postInteract=" + this.r + ')';
    }
}
