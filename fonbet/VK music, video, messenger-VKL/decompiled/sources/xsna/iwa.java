package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.channels.api.CommentsHistory;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import xsna.gwa;

/* compiled from: ChannelCommentsGetCmd.kt */
/* loaded from: classes2.dex */
public final class iwa extends le6<a> {
    public final long b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final int g;
    public final CommentsHistory.Order h;
    public final boolean i;

    /* compiled from: ChannelCommentsGetCmd.kt */
    public static final class a {
        public final CommentsHistory a;
        public final ProfilesSimpleInfo b;

        public a(CommentsHistory commentsHistory, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = commentsHistory;
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
            return "Result(history=" + this.a + ", profiles=" + this.b + ')';
        }
    }

    public iwa(long j, int i, Integer num, String str, CommentsHistory.Order order, int i2) {
        num = (i2 & 4) != 0 ? null : num;
        str = (i2 & 16) != 0 ? null : str;
        int i3 = (i2 & 128) != 0 ? 20 : 10;
        boolean z = (i2 & 512) == 0;
        this.b = j;
        this.c = i;
        this.d = num;
        this.e = null;
        this.f = str;
        this.g = i3;
        this.h = order;
        this.i = z;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        gwa.a aVar = (gwa.a) fo50.v(new gwa(this.b, this.c, this.d, null, this.e, this.f, this.g, this.h, this.i, IronSourceError.ERROR_NO_INTERNET_CONNECTION), w2wVar, null, 6);
        return new a(xdg.b(aVar.a), aVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        iwa iwaVar = (iwa) obj;
        return this.b == iwaVar.b && this.c == iwaVar.c && epx.f(this.d, iwaVar.d) && epx.f(this.e, iwaVar.e) && epx.f(this.f, iwaVar.f) && this.g == iwaVar.g && this.h == iwaVar.h && this.i == iwaVar.i;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + shy.a(this.g, (hashCode2 + (str != null ? str.hashCode() : 0)) * 29791, 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentsGetCmd(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", commentId=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.e);
        sb.append(", nextFrom=");
        sb.append(this.f);
        sb.append(", prevFrom=null, tail=null, count=");
        sb.append(this.g);
        sb.append(", order=");
        sb.append(this.h);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
