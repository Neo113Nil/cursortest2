package xsna;

import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: PlaybackTrackId.kt */
/* loaded from: classes3.dex */
public final class gza0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final PlaybackLaunchMeta e;

    public gza0(String str, String str2, String str3, String str4, PlaybackLaunchMeta playbackLaunchMeta) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = playbackLaunchMeta;
    }

    public static gza0 a(gza0 gza0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = gza0Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = gza0Var.b;
        }
        String str4 = gza0Var.c;
        String str5 = gza0Var.d;
        PlaybackLaunchMeta playbackLaunchMeta = gza0Var.e;
        gza0Var.getClass();
        return new gza0(str3, str2, str4, str5, playbackLaunchMeta);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza0)) {
            return false;
        }
        gza0 gza0Var = (gza0) obj;
        return epx.f(this.a, gza0Var.a) && epx.f(this.b, gza0Var.b) && epx.f(this.c, gza0Var.c) && epx.f(this.d, gza0Var.d) && epx.f(this.e, gza0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaybackTrackId(mid=" + this.a + ", uuid=" + this.b + ", accessKey=" + this.c + ", trackCode=" + this.d + ", launchMeta=" + this.e + ')';
    }
}
