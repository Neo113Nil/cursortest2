package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import java.util.Map;

/* compiled from: VideoListData.kt */
/* loaded from: classes18.dex */
public final class mss0 {
    public final List<VideoFile> a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public mss0(List<? extends VideoFile> list, String str, long j, long j2, long j3, Map<UserId, Owner> map) {
        this.a = list;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mss0)) {
            return false;
        }
        mss0 mss0Var = (mss0) obj;
        return epx.f(this.a, mss0Var.a) && epx.f(this.b, mss0Var.b) && this.c == mss0Var.c && this.d == mss0Var.d && this.e == mss0Var.e && this.f.equals(mss0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + bh10.a(bh10.a(bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoListData(videos=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        sb.append(this.b);
        sb.append(", videosCount=");
        sb.append(this.c);
        sb.append(", viewsCount=");
        sb.append(this.d);
        sb.append(", likesCount=");
        sb.append(this.e);
        sb.append(", owners=");
        return k73.c(sb, this.f, ')');
    }
}
