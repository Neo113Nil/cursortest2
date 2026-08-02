package xsna;

import android.location.Location;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: StartStreamingParams.kt */
/* loaded from: classes3.dex */
public final class wqk0 {
    public final String a;
    public final Integer b;
    public final UserId c;
    public final boolean d;
    public final boolean e;
    public final Location f;
    public final boolean g;
    public final List<String> h;

    public wqk0(String str, Integer num, UserId userId, boolean z, boolean z2, Location location, boolean z3, List<String> list) {
        this.a = str;
        this.b = num;
        this.c = userId;
        this.d = z;
        this.e = z2;
        this.f = location;
        this.g = z3;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqk0)) {
            return false;
        }
        wqk0 wqk0Var = (wqk0) obj;
        return epx.f(this.a, wqk0Var.a) && epx.f(this.b, wqk0Var.b) && epx.f(this.c, wqk0Var.c) && this.d == wqk0Var.d && this.e == wqk0Var.e && epx.f(this.f, wqk0Var.f) && this.g == wqk0Var.g && epx.f(this.h, wqk0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = qoy.b(qoy.b(bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c.b), 31, this.d), 31, this.e);
        Location location = this.f;
        return this.h.hashCode() + qoy.b((b + (location != null ? location.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartStreamingParams(name=");
        sb.append(this.a);
        sb.append(", videoId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", wallPost=");
        sb.append(this.d);
        sb.append(", storyPost=");
        sb.append(this.e);
        sb.append(", location=");
        sb.append(this.f);
        sb.append(", canComment=");
        sb.append(this.g);
        sb.append(", privacyView=");
        return ms9.a(')', sb, this.h);
    }
}
