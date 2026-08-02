package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.models.videotracker.PlayerType;

/* compiled from: AdAnalyticsData.kt */
/* loaded from: classes18.dex */
public final class jc0 {
    public final String a;
    public final String b;
    public final UserId c;
    public final String d;
    public final PlayerType e;
    public final String f;

    public jc0(String str, String str2, UserId userId, String str3, PlayerType playerType, String str4) {
        this.a = str;
        this.b = str2;
        this.c = userId;
        this.d = str3;
        this.e = playerType;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        return epx.f(this.a, jc0Var.a) && epx.f(this.b, jc0Var.b) && epx.f(this.c, jc0Var.c) && epx.f(this.d, jc0Var.d) && this.e == jc0Var.e && epx.f(this.f, jc0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.e.hashCode() + urd0.a(bh10.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c.b), 31, this.d)) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdAnalyticsData(ref=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", userId=");
        sb.append(this.c);
        sb.append(", videoId=");
        sb.append(this.d);
        sb.append(", playerType=");
        sb.append(this.e);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.f, ')');
    }
}
