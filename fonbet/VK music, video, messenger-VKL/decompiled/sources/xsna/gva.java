package xsna;

import com.vk.api.generated.channels.dto.ChannelsMessageCommentDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import xsna.eva;

/* compiled from: ChannelCommentCreateCmd.kt */
/* loaded from: classes2.dex */
public final class gva extends le6<a> {
    public final long b;
    public final int c;
    public final Integer d;
    public final String e;

    /* compiled from: ChannelCommentCreateCmd.kt */
    public static final class a {
        public final int a;
        public final hag b;
        public final ProfilesSimpleInfo c;

        public a(int i, hag hagVar, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = i;
            this.b = hagVar;
            this.c = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            hag hagVar = this.b;
            return this.c.hashCode() + ((hashCode + (hagVar == null ? 0 : hagVar.hashCode())) * 31);
        }

        public final String toString() {
            return "Result(commentId=" + this.a + ", comment=" + this.b + ", profiles=" + this.c + ')';
        }
    }

    public gva(long j, int i, Integer num, String str) {
        this.b = j;
        this.c = i;
        this.d = num;
        this.e = str;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        eva.a aVar;
        Long l;
        AdminLevel adminLevel;
        bdb c = w2wVar.I0().a().c(this.b);
        boolean z = false;
        if (c != null && (c.o || (adminLevel = c.E) == AdminLevel.ADMIN || adminLevel == AdminLevel.EDITOR)) {
            z = true;
        }
        UserId userId = ((c != null ? c.v : null) == ChannelType.COMMUNITY_CHANNEL && z && (l = c.w) != null) ? new UserId(-l.longValue()) : null;
        try {
            aVar = (eva.a) fo50.v(new eva(this.b, this.c, this.d, this.e, userId), w2wVar, null, 6);
        } catch (VKApiExecutionException e) {
            if (userId == null || e.s() != 15) {
                throw e;
            }
            aVar = (eva.a) fo50.v(new eva(this.b, this.c, this.d, this.e, null), w2wVar, null, 6);
        }
        ChannelsMessageCommentDto channelsMessageCommentDto = aVar.b;
        return new a(aVar.a, channelsMessageCommentDto != null ? xdg.a(channelsMessageCommentDto) : null, aVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gvaVar = (gva) obj;
        return this.b == gvaVar.b && this.c == gvaVar.c && epx.f(this.d, gvaVar.d) && epx.f(this.e, gvaVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        Integer num = this.d;
        return this.e.hashCode() + ((a2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelCommentCreateCmd(channelId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", replyToCommentId=");
        sb.append(this.d);
        sb.append(", text=");
        return ho8.a(sb, this.e, ')');
    }
}
