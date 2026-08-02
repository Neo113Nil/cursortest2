package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;

/* compiled from: ChannelCommentSetReactionCmd.kt */
/* loaded from: classes2.dex */
public final class ova extends le6<Boolean> {
    public final long b;
    public final int c;
    public final Integer d;

    public ova(long j, int i, Integer num) {
        this.b = j;
        this.c = i;
        this.d = num;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return Boolean.valueOf(((BaseBoolIntDto) bz2.c(new nva(this.b, this.c, this.d), null)) == BaseBoolIntDto.YES);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ova)) {
            return false;
        }
        ova ovaVar = (ova) obj;
        return this.b == ovaVar.b && this.c == ovaVar.c && epx.f(this.d, ovaVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        return a + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentSetReactionCmd(channelId=");
        sb.append(this.b);
        sb.append(", commentId=");
        sb.append(this.c);
        sb.append(", reactionId=");
        return uqi.b(sb, this.d, ')');
    }
}
