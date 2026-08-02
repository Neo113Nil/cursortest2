package xsna;

import com.vk.music.playlist.PlaylistCarouselItemStyle;

/* compiled from: PlaylistInFeedParams.kt */
/* loaded from: classes3.dex */
public final class iab0 {
    public final PlaylistCarouselItemStyle a;
    public final boolean b;
    public final String c;
    public final String d;

    public iab0(PlaylistCarouselItemStyle playlistCarouselItemStyle, boolean z, String str, String str2) {
        this.a = playlistCarouselItemStyle;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iab0)) {
            return false;
        }
        iab0 iab0Var = (iab0) obj;
        return this.a == iab0Var.a && this.b == iab0Var.b && epx.f(this.c, iab0Var.c) && epx.f(this.d, iab0Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistInFeedParams(blockType=");
        sb.append(this.a);
        sb.append(", isRecommendedPlaylist=");
        sb.append(this.b);
        sb.append(", sessionId=");
        sb.append(this.c);
        sb.append(", trackCode=");
        return ho8.a(sb, this.d, ')');
    }
}
