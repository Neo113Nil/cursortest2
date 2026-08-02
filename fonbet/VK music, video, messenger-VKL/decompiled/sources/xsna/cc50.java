package xsna;

import java.io.File;

/* compiled from: MusicTrackInfo.kt */
/* loaded from: classes3.dex */
public final class cc50 {
    public final File a;
    public final String b;
    public final String c;
    public final String d;

    public cc50(File file, String str, String str2, String str3) {
        this.a = file;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc50)) {
            return false;
        }
        cc50 cc50Var = (cc50) obj;
        return epx.f(this.a, cc50Var.a) && epx.f(this.b, cc50Var.b) && epx.f(this.c, cc50Var.c) && epx.f(this.d, cc50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackInfo(coverFile=");
        sb.append(this.a);
        sb.append(", trackMusicId=");
        sb.append(this.b);
        sb.append(", trackTitle=");
        sb.append(this.c);
        sb.append(", trackArtist=");
        return ho8.a(sb, this.d, ')');
    }
}
