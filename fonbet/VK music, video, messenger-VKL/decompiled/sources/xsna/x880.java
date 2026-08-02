package xsna;

import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.data.PostInteract;

/* compiled from: OnMediaAudioState.kt */
/* loaded from: classes4.dex */
public final class x880 implements v780 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final PostInteract i;
    public final MusicTrack j;

    public x880() {
        this(0);
    }

    public static x880 c(x880 x880Var, boolean z, boolean z2, boolean z3, Integer num, Long l, String str, String str2, String str3, PostInteract postInteract, MusicTrack musicTrack, int i) {
        if ((i & 1) != 0) {
            z = x880Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = x880Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = x880Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            num = x880Var.d;
        }
        Integer num2 = num;
        Long l2 = (i & 16) != 0 ? x880Var.e : l;
        String str4 = (i & 32) != 0 ? x880Var.f : str;
        String str5 = (i & 64) != 0 ? x880Var.g : str2;
        String str6 = (i & 128) != 0 ? x880Var.h : str3;
        PostInteract postInteract2 = (i & 256) != 0 ? x880Var.i : postInteract;
        MusicTrack musicTrack2 = (i & 512) != 0 ? x880Var.j : musicTrack;
        x880Var.getClass();
        return new x880(z4, z5, z6, num2, l2, str4, str5, str6, postInteract2, musicTrack2);
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
        if (!(obj instanceof x880)) {
            return false;
        }
        x880 x880Var = (x880) obj;
        return this.a == x880Var.a && this.b == x880Var.b && this.c == x880Var.c && epx.f(this.d, x880Var.d) && epx.f(this.e, x880Var.e) && epx.f(this.f, x880Var.f) && epx.f(this.g, x880Var.g) && epx.f(this.h, x880Var.h) && epx.f(this.i, x880Var.i) && epx.f(this.j, x880Var.j);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PostInteract postInteract = this.i;
        int hashCode6 = (hashCode5 + (postInteract == null ? 0 : postInteract.hashCode())) * 31;
        MusicTrack musicTrack = this.j;
        return hashCode6 + (musicTrack != null ? musicTrack.hashCode() : 0);
    }

    @Override // xsna.v780
    public final String i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaTrackState(isOnForeground=");
        sb.append(this.a);
        sb.append(", isRestricted=");
        sb.append(this.b);
        sb.append(", isExplicit=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", audioOwnerId=");
        sb.append(this.e);
        sb.append(", postTrackCode=");
        sb.append(this.f);
        sb.append(", musicTrackCode=");
        sb.append(this.g);
        sb.append(", refer=");
        sb.append(this.h);
        sb.append(", postInteract=");
        sb.append(this.i);
        sb.append(", track=");
        return rq.c(sb, this.j, ')');
    }

    public /* synthetic */ x880(int i) {
        this(false, false, false, null, null, null, null, null, null, null);
    }

    public x880(boolean z, boolean z2, boolean z3, Integer num, Long l, String str, String str2, String str3, PostInteract postInteract, MusicTrack musicTrack) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = postInteract;
        this.j = musicTrack;
    }
}
