package xsna;

import com.vk.mentions.MentionProfileVO;
import java.util.List;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class xjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final List<MentionProfileVO> b;
    public final boolean c;

    public xjc0(List<MentionProfileVO> list, boolean z) {
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjc0)) {
            return false;
        }
        xjc0 xjc0Var = (xjc0) obj;
        return epx.f(this.b, xjc0Var.b) && this.c == xjc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionsReceived(mentions=");
        sb.append(this.b);
        sb.append(", querySource=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
