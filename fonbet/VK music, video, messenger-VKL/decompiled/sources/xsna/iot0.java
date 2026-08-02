package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoUploadModels.kt */
/* loaded from: classes2.dex */
public final class iot0 {
    public final long a;
    public final UserId b;
    public final String c;
    public final String d;
    public final ocq0 e;
    public final String f;
    public final String g;

    public iot0(long j, UserId userId, String str, String str2, ocq0 ocq0Var, String str3, String str4) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = ocq0Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iot0)) {
            return false;
        }
        iot0 iot0Var = (iot0) obj;
        return this.a == iot0Var.a && epx.f(this.b, iot0Var.b) && epx.f(this.c, iot0Var.c) && epx.f(this.d, iot0Var.d) && epx.f(this.e, iot0Var.e) && epx.f(this.f, iot0Var.f) && epx.f(this.g, iot0Var.g);
    }

    public final int hashCode() {
        int a = urd0.a((this.e.hashCode() + urd0.a(urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUploadInfo(videoId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", uploadServer=");
        sb.append(this.e);
        sb.append(", accessKey=");
        sb.append(this.f);
        sb.append(", directLink=");
        return ho8.a(sb, this.g, ')');
    }
}
