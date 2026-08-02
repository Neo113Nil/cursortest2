package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: EditCommentParams.kt */
/* loaded from: classes4.dex */
public final class rzo {
    public final UserId a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public rzo(UserId userId, int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzo)) {
            return false;
        }
        rzo rzoVar = (rzo) obj;
        return epx.f(this.a, rzoVar.a) && this.b == rzoVar.b && this.c == rzoVar.c && this.d == rzoVar.d && epx.f(this.e, rzoVar.e) && epx.f(this.f, rzoVar.f) && epx.f(this.g, rzoVar.g) && epx.f(this.h, rzoVar.h);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(shy.a(this.d, shy.a(this.c, shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCommentParams(ownerId=");
        sb.append(this.a);
        sb.append(", commentId=");
        sb.append(this.b);
        sb.append(", itemType=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.e);
        sb.append(", attachments=");
        sb.append(this.f);
        sb.append(", accessKey=");
        sb.append(this.g);
        sb.append(", ref=");
        return ho8.a(sb, this.h, ')');
    }
}
