package xsna;

import com.vk.dto.music.Playlist;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vkontakte.android.data.PostInteract;

/* compiled from: OnMediaAudioState.kt */
/* loaded from: classes4.dex */
public final class s880 implements v780 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Long e;
    public final String f;
    public final String g;
    public final PostInteract h;
    public final boolean i;
    public final Playlist j;
    public final MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType k;

    public s880() {
        this(0);
    }

    public static s880 c(s880 s880Var, boolean z, boolean z2, boolean z3, Integer num, Long l, String str, String str2, PostInteract postInteract, boolean z4, Playlist playlist, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType, int i) {
        if ((i & 1) != 0) {
            z = s880Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = s880Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = s880Var.c;
        }
        boolean z7 = z3;
        Integer num2 = (i & 8) != 0 ? s880Var.d : num;
        Long l2 = (i & 16) != 0 ? s880Var.e : l;
        String str3 = (i & 32) != 0 ? s880Var.f : str;
        s880Var.getClass();
        String str4 = (i & 128) != 0 ? s880Var.g : str2;
        PostInteract postInteract2 = (i & 256) != 0 ? s880Var.h : postInteract;
        boolean z8 = (i & 512) != 0 ? s880Var.i : z4;
        Playlist playlist2 = (i & 1024) != 0 ? s880Var.j : playlist;
        MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType2 = (i & 2048) != 0 ? s880Var.k : itemType;
        s880Var.getClass();
        return new s880(z5, z6, z7, num2, l2, str3, str4, postInteract2, z8, playlist2, itemType2);
    }

    @Override // xsna.v780
    public final boolean B() {
        return this.b;
    }

    @Override // xsna.v780
    public final Integer a() {
        return this.d;
    }

    @Override // xsna.v780
    public final Long b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s880)) {
            return false;
        }
        s880 s880Var = (s880) obj;
        return this.a == s880Var.a && this.b == s880Var.b && this.c == s880Var.c && epx.f(this.d, s880Var.d) && epx.f(this.e, s880Var.e) && epx.f(this.f, s880Var.f) && epx.f(this.g, s880Var.g) && epx.f(this.h, s880Var.h) && this.i == s880Var.i && epx.f(this.j, s880Var.j) && this.k == s880Var.k;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PostInteract postInteract = this.h;
        int b2 = qoy.b((hashCode4 + (postInteract == null ? 0 : postInteract.hashCode())) * 31, 31, this.i);
        Playlist playlist = this.j;
        return this.k.hashCode() + ((b2 + (playlist != null ? playlist.hashCode() : 0)) * 31);
    }

    @Override // xsna.v780
    public final String i() {
        return this.f;
    }

    public final String toString() {
        return "OnMediaPlaylistState(isOnForeground=" + this.a + ", isRestricted=" + this.b + ", isExplicit=" + this.c + ", audioId=" + this.d + ", audioOwnerId=" + this.e + ", postTrackCode=" + this.f + ", musicTrackCode=null, refer=" + this.g + ", postInteract=" + this.h + ", isCurrentUserAudio=" + this.i + ", playlist=" + this.j + ", playlistType=" + this.k + ')';
    }

    public s880(boolean z, boolean z2, boolean z3, Integer num, Long l, String str, String str2, PostInteract postInteract, boolean z4, Playlist playlist, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = postInteract;
        this.i = z4;
        this.j = playlist;
        this.k = itemType;
    }

    public /* synthetic */ s880(int i) {
        this(false, false, false, null, null, null, null, null, false, null, MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.PLAYLIST);
    }
}
