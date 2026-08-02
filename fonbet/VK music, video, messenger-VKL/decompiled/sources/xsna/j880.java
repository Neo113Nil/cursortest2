package xsna;

import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.data.PostInteract;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: OnMediaAudioState.kt */
/* loaded from: classes4.dex */
public final class j880 implements v780 {
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final String f;
    public final PostInteract g;
    public final MusicTrack h;
    public final int i;
    public final List<MusicTrack> j;

    public j880() {
        this(0);
    }

    public static j880 c(j880 j880Var, boolean z, boolean z2, Integer num, Long l, String str, String str2, PostInteract postInteract, MusicTrack musicTrack, int i, List list, int i2) {
        if ((i2 & 1) != 0) {
            z = j880Var.a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = j880Var.b;
        }
        boolean z4 = z2;
        j880Var.getClass();
        if ((i2 & 8) != 0) {
            num = j880Var.c;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            l = j880Var.d;
        }
        Long l2 = l;
        String str3 = (i2 & 32) != 0 ? j880Var.e : str;
        j880Var.getClass();
        String str4 = (i2 & 128) != 0 ? j880Var.f : str2;
        PostInteract postInteract2 = (i2 & 256) != 0 ? j880Var.g : postInteract;
        MusicTrack musicTrack2 = (i2 & 512) != 0 ? j880Var.h : musicTrack;
        int i3 = (i2 & 1024) != 0 ? j880Var.i : i;
        List list2 = (i2 & 2048) != 0 ? j880Var.j : list;
        j880Var.getClass();
        return new j880(z3, z4, num2, l2, str3, str4, postInteract2, musicTrack2, i3, list2);
    }

    @Override // xsna.v780
    public final boolean B() {
        return this.b;
    }

    @Override // xsna.v780
    public final Integer a() {
        return this.c;
    }

    @Override // xsna.v780
    public final Long b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j880)) {
            return false;
        }
        j880 j880Var = (j880) obj;
        return this.a == j880Var.a && this.b == j880Var.b && epx.f(this.c, j880Var.c) && epx.f(this.d, j880Var.d) && epx.f(this.e, j880Var.e) && epx.f(this.f, j880Var.f) && epx.f(this.g, j880Var.g) && epx.f(this.h, j880Var.h) && this.i == j880Var.i && epx.f(this.j, j880Var.j);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PostInteract postInteract = this.g;
        int hashCode5 = (hashCode4 + (postInteract == null ? 0 : postInteract.hashCode())) * 31;
        MusicTrack musicTrack = this.h;
        return this.j.hashCode() + shy.a(this.i, (hashCode5 + (musicTrack != null ? musicTrack.hashCode() : 0)) * 31, 31);
    }

    @Override // xsna.v780
    public final String i() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaMultiTrackState(isOnForeground=");
        sb.append(this.a);
        sb.append(", isRestricted=");
        sb.append(this.b);
        sb.append(", isExplicit=false, audioId=");
        sb.append(this.c);
        sb.append(", audioOwnerId=");
        sb.append(this.d);
        sb.append(", postTrackCode=");
        sb.append(this.e);
        sb.append(", musicTrackCode=null, refer=");
        sb.append(this.f);
        sb.append(", postInteract=");
        sb.append(this.g);
        sb.append(", currentTrack=");
        sb.append(this.h);
        sb.append(", tracksCount=");
        sb.append(this.i);
        sb.append(", tracks=");
        return ms9.a(')', sb, this.j);
    }

    public j880(boolean z, boolean z2, Integer num, Long l, String str, String str2, PostInteract postInteract, MusicTrack musicTrack, int i, List list) {
        this.a = z;
        this.b = z2;
        this.c = num;
        this.d = l;
        this.e = str;
        this.f = str2;
        this.g = postInteract;
        this.h = musicTrack;
        this.i = i;
        this.j = list;
    }

    public j880(int i) {
        this(false, false, null, null, null, null, null, null, 0, EmptyList.b);
    }
}
