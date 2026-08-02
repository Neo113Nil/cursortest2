package xsna;

import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class ykj extends wof0 {
    public final ReefContentType a;
    public final String b;
    public final String c;
    public final Long d;
    public final Integer e;
    public final ReefContentQuality f;
    public final Long g;

    public ykj(ReefContentType reefContentType, String str, String str2, Long l, Integer num, ReefContentQuality reefContentQuality, Long l2) {
        this.a = reefContentType;
        this.b = str;
        this.c = str2;
        this.d = l;
        this.e = num;
        this.f = reefContentQuality;
        this.g = l2;
    }

    public static ykj a(ykj ykjVar, ReefContentType reefContentType, String str, String str2, Long l, Integer num, ReefContentQuality reefContentQuality, Long l2, int i) {
        if ((i & 1) != 0) {
            reefContentType = ykjVar.a;
        }
        ReefContentType reefContentType2 = reefContentType;
        if ((i & 2) != 0) {
            str = ykjVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = ykjVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            l = ykjVar.d;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            num = ykjVar.e;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            reefContentQuality = ykjVar.f;
        }
        ReefContentQuality reefContentQuality2 = reefContentQuality;
        if ((i & 64) != 0) {
            l2 = ykjVar.g;
        }
        ykjVar.getClass();
        return new ykj(reefContentType2, str3, str4, l3, num2, reefContentQuality2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykj)) {
            return false;
        }
        ykj ykjVar = (ykj) obj;
        return this.a == ykjVar.a && epx.f(this.b, ykjVar.b) && epx.f(this.c, ykjVar.c) && epx.f(this.d, ykjVar.d) && epx.f(this.e, ykjVar.e) && this.f == ykjVar.f && epx.f(this.g, ykjVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Long l2 = this.g;
        return hashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "ContentState(type=" + this.a + ", id=" + this.b + ", host=" + this.c + ", duration=" + this.d + ", height=" + this.e + ", quality=" + this.f + ", prevSessionPauseTime=" + this.g + ")";
    }
}
