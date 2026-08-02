package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: CommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public final class l7k {
    public final String a;
    public final int b;
    public final List<Attachment> c;
    public final UserId d;
    public final long e;
    public final boolean f;
    public final phi0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public l7k(String str, int i, List<? extends Attachment> list, UserId userId, long j, boolean z, phi0 phi0Var) {
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = userId;
        this.e = j;
        this.f = z;
        this.g = phi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7k)) {
            return false;
        }
        l7k l7kVar = (l7k) obj;
        return epx.f(this.a, l7kVar.a) && this.b == l7kVar.b && epx.f(this.c, l7kVar.c) && epx.f(this.d, l7kVar.d) && this.e == l7kVar.e && this.f == l7kVar.f && epx.f(this.g, l7kVar.g);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        UserId userId = this.d;
        return this.g.hashCode() + qoy.b(bh10.a((a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "CreateCommentParams(txt=" + this.a + ", replyTo=" + this.b + ", attrs=" + this.c + ", replyFromGroupId=" + this.d + ", sessionId=" + this.e + ", isFirstCheck=" + this.f + ", entryPoint=" + this.g + ')';
    }
}
