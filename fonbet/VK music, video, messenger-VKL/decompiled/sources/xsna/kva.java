package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import xsna.gwa;

/* compiled from: ChannelCommentEditCmd.kt */
/* loaded from: classes2.dex */
public final class kva extends le6<a> {
    public final long b;
    public final int c;
    public final int d;
    public final Integer e;
    public final String f;

    /* compiled from: ChannelCommentEditCmd.kt */
    public static final class a {
        public final hag a;
        public final ProfilesSimpleInfo b;

        public a(hag hagVar, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = hagVar;
            this.b = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(comment=" + this.a + ", profiles=" + this.b + ')';
        }
    }

    public kva(long j, int i, int i2, Integer num, String str) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = str;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        if (!((Boolean) bz2.c(new jva(this.c, this.b, this.d, this.f), null)).booleanValue()) {
            throw new IllegalStateException("Comment was not edited");
        }
        gwa.a aVar = (gwa.a) fo50.v(new gwa(this.b, this.c, this.e, Integer.valueOf(this.d), null, null, 1, null, false, 3312), w2wVar, null, 6);
        return new a((hag) j5g.Y(xdg.b(aVar.a).a), aVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva)) {
            return false;
        }
        kva kvaVar = (kva) obj;
        return this.b == kvaVar.b && this.c == kvaVar.c && this.d == kvaVar.d && epx.f(this.e, kvaVar.e) && epx.f(this.f, kvaVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentEditCmd(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", commentId=");
        sb.append(this.d);
        sb.append(", rootCommentId=");
        sb.append(this.e);
        sb.append(", text=");
        return ho8.a(sb, this.f, ')');
    }
}
