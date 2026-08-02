package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CacheUploadInfo.kt */
/* loaded from: classes2.dex */
public final class wx8 {
    public final String a;
    public final String b;
    public final UserId c;
    public final long d;
    public final String e;

    public wx8(long j, UserId userId, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = userId;
        this.d = j;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx8)) {
            return false;
        }
        wx8 wx8Var = (wx8) obj;
        return epx.f(this.a, wx8Var.a) && epx.f(this.b, wx8Var.b) && epx.f(this.c, wx8Var.c) && this.d == wx8Var.d && epx.f(this.e, wx8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c.b), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheUploadInfo(fileHash=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", mediaId=");
        sb.append(this.d);
        sb.append(", accessKey=");
        return ho8.a(sb, this.e, ')');
    }
}
