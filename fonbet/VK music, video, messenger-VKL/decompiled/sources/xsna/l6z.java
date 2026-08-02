package xsna;

import com.vk.dto.reactions.ReactionMeta;

/* compiled from: PostInteractor.kt */
/* loaded from: classes4.dex */
public final class l6z {
    public final c6z a;
    public final boolean b;
    public final ReactionMeta c;
    public final String d;
    public final String e;
    public final String f;

    public l6z(c6z c6zVar, boolean z, ReactionMeta reactionMeta, String str, String str2, String str3) {
        this.a = c6zVar;
        this.b = z;
        this.c = reactionMeta;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6z)) {
            return false;
        }
        l6z l6zVar = (l6z) obj;
        return epx.f(this.a, l6zVar.a) && this.b == l6zVar.b && epx.f(this.c, l6zVar.c) && epx.f(this.d, l6zVar.d) && epx.f(this.e, l6zVar.e) && epx.f(this.f, l6zVar.f);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        ReactionMeta reactionMeta = this.c;
        int hashCode = (b + (reactionMeta == null ? 0 : reactionMeta.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikeRequestData(likable=");
        sb.append(this.a);
        sb.append(", isAdd=");
        sb.append(this.b);
        sb.append(", reaction=");
        sb.append(this.c);
        sb.append(", referer=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", actionTrigger=");
        return ho8.a(sb, this.f, ')');
    }
}
