package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: VideoCommentsRepository.kt */
/* loaded from: classes4.dex */
public final class x1p {
    public final int a;
    public final UserId b;
    public final String c;
    public final List<Attachment> d;
    public final String e;

    public x1p(String str, String str2, UserId userId, int i, List list) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1p)) {
            return false;
        }
        x1p x1pVar = (x1p) obj;
        return this.a == x1pVar.a && epx.f(this.b, x1pVar.b) && epx.f(this.c, x1pVar.c) && epx.f(this.d, x1pVar.d) && epx.f(this.e, x1pVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        UserId userId = this.b;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.c;
        int a = fw3.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditVideoCommentParams(commentId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(", attachments=");
        sb.append(this.d);
        sb.append(", screenMode=");
        return ho8.a(sb, this.e, ')');
    }
}
