package xsna;

import com.vk.reefton.dto.ReefContentQuality;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class uya0 extends wof0 {
    public final String a;
    public final boolean b;
    public final Integer c;
    public final ReefContentQuality d;
    public final ReefContentQuality e;
    public final Long f;
    public final Long g;
    public final Float h;
    public final Integer i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Integer n;
    public final zmf0 o;
    public final boolean p;
    public final long q;
    public final long r;
    public final ReefContentQuality s;

    public uya0(String str, boolean z, Integer num, ReefContentQuality reefContentQuality, ReefContentQuality reefContentQuality2, Long l, Long l2, Float f, Integer num2, Long l3, Long l4, Long l5, Long l6, Integer num3, zmf0 zmf0Var, boolean z2, long j, long j2, ReefContentQuality reefContentQuality3) {
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = reefContentQuality;
        this.e = reefContentQuality2;
        this.f = l;
        this.g = l2;
        this.h = f;
        this.i = num2;
        this.j = l3;
        this.k = l4;
        this.l = l5;
        this.m = l6;
        this.n = num3;
        this.o = zmf0Var;
        this.p = z2;
        this.q = j;
        this.r = j2;
        this.s = reefContentQuality3;
    }

    public static uya0 a(uya0 uya0Var, String str, boolean z, Integer num, ReefContentQuality reefContentQuality, ReefContentQuality reefContentQuality2, Long l, Long l2, Float f, Integer num2, Long l3, Long l4, Long l5, Long l6, Integer num3, zmf0 zmf0Var, boolean z2, long j, long j2, ReefContentQuality reefContentQuality3, int i) {
        String str2 = (i & 1) != 0 ? uya0Var.a : str;
        boolean z3 = (i & 2) != 0 ? uya0Var.b : z;
        Integer num4 = (i & 4) != 0 ? uya0Var.c : num;
        ReefContentQuality reefContentQuality4 = (i & 8) != 0 ? uya0Var.d : reefContentQuality;
        ReefContentQuality reefContentQuality5 = (i & 16) != 0 ? uya0Var.e : reefContentQuality2;
        Long l7 = (i & 32) != 0 ? uya0Var.f : l;
        Long l8 = (i & 64) != 0 ? uya0Var.g : l2;
        Float f2 = (i & 128) != 0 ? uya0Var.h : f;
        Integer num5 = (i & 256) != 0 ? uya0Var.i : num2;
        Long l9 = (i & 512) != 0 ? uya0Var.j : l3;
        Long l10 = (i & 1024) != 0 ? uya0Var.k : l4;
        Long l11 = (i & 2048) != 0 ? uya0Var.l : l5;
        Long l12 = (i & 4096) != 0 ? uya0Var.m : l6;
        Integer num6 = (i & 8192) != 0 ? uya0Var.n : num3;
        String str3 = str2;
        zmf0 zmf0Var2 = (i & 16384) != 0 ? uya0Var.o : zmf0Var;
        boolean z4 = (i & 32768) != 0 ? uya0Var.p : z2;
        zmf0 zmf0Var3 = zmf0Var2;
        long j3 = (i & 65536) != 0 ? uya0Var.q : j;
        long j4 = (i & 131072) != 0 ? uya0Var.r : j2;
        ReefContentQuality reefContentQuality6 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? uya0Var.s : reefContentQuality3;
        uya0Var.getClass();
        return new uya0(str3, z3, num4, reefContentQuality4, reefContentQuality5, l7, l8, f2, num5, l9, l10, l11, l12, num6, zmf0Var3, z4, j3, j4, reefContentQuality6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uya0)) {
            return false;
        }
        uya0 uya0Var = (uya0) obj;
        return epx.f(this.a, uya0Var.a) && this.b == uya0Var.b && epx.f(this.c, uya0Var.c) && this.d == uya0Var.d && this.e == uya0Var.e && epx.f(this.f, uya0Var.f) && epx.f(this.g, uya0Var.g) && epx.f(this.h, uya0Var.h) && epx.f(this.i, uya0Var.i) && epx.f(this.j, uya0Var.j) && epx.f(this.k, uya0Var.k) && epx.f(this.l, uya0Var.l) && epx.f(this.m, uya0Var.m) && epx.f(this.n, uya0Var.n) && epx.f(this.o, uya0Var.o) && this.p == uya0Var.p && this.q == uya0Var.q && this.r == uya0Var.r && this.s == uya0Var.s;
    }

    public final int hashCode() {
        String str = this.a;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        ReefContentQuality reefContentQuality = this.d;
        int hashCode2 = (hashCode + (reefContentQuality == null ? 0 : reefContentQuality.hashCode())) * 31;
        ReefContentQuality reefContentQuality2 = this.e;
        int hashCode3 = (hashCode2 + (reefContentQuality2 == null ? 0 : reefContentQuality2.hashCode())) * 31;
        Long l = this.f;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.h;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.i;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.j;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.k;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.l;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.m;
        int hashCode11 = (hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num3 = this.n;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        zmf0 zmf0Var = this.o;
        int a = bh10.a(bh10.a(qoy.b((hashCode12 + (zmf0Var == null ? 0 : zmf0Var.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
        ReefContentQuality reefContentQuality3 = this.s;
        return a + (reefContentQuality3 != null ? reefContentQuality3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState(id=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", quality=");
        sb.append(this.d);
        sb.append(", prevQuality=");
        sb.append(this.e);
        sb.append(", position=");
        sb.append(this.f);
        sb.append(", sessionElapsedTime=");
        sb.append(this.g);
        sb.append(", bufferPercent=");
        sb.append(this.h);
        sb.append(", bufferingIndex=");
        sb.append(this.i);
        sb.append(", bufferingStartedTime=");
        sb.append(this.j);
        sb.append(", bufferingStartedTime2=");
        sb.append(this.k);
        sb.append(", bufferingElapsedTime=");
        sb.append(this.l);
        sb.append(", bufferingElapsedTime2=");
        sb.append(this.m);
        sb.append(", playbackSessionSequenceId=");
        sb.append(this.n);
        sb.append(", lastBandwidthEstimate=");
        sb.append(this.o);
        sb.append(", isAdv=");
        sb.append(this.p);
        sb.append(", sessionTotalWatchTime=");
        sb.append(this.q);
        tj0.d(sb, ", sessionPurgedWatchTime=", this.r, ", maxQuality=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
