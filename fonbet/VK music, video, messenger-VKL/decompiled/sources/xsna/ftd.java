package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsDraftMusicTrack.kt */
/* loaded from: classes17.dex */
public final class ftd {
    public final int a;
    public final UserId b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final Uri h;
    public final boolean i;
    public final String j;

    public ftd(int i, UserId userId, String str, int i2, String str2, String str3, String str4, Uri uri, boolean z, String str5) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = uri;
        this.i = z;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftd)) {
            return false;
        }
        ftd ftdVar = (ftd) obj;
        return this.a == ftdVar.a && epx.f(this.b, ftdVar.b) && epx.f(this.c, ftdVar.c) && this.d == ftdVar.d && epx.f(this.e, ftdVar.e) && epx.f(this.f, ftdVar.f) && epx.f(this.g, ftdVar.g) && epx.f(this.h, ftdVar.h) && this.i == ftdVar.i && epx.f(this.j, ftdVar.j);
    }

    public final int hashCode() {
        int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
        String str = this.c;
        int a2 = shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.h;
        int b = qoy.b((hashCode3 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.i);
        String str5 = this.j;
        return b + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftMusicTrack(audioId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", artistNameFallback=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", thumb=");
        sb.append(this.h);
        sb.append(", canDownload=");
        sb.append(this.i);
        sb.append(", originalSoundVideoId=");
        return ho8.a(sb, this.j, ')');
    }

    public ftd() {
        this(0, UserId.d, null, 0, null, null, null, null, false, null);
    }
}
