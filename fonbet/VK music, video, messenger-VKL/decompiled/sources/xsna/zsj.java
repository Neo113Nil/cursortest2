package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import java.util.List;

/* compiled from: CoownersInviteBannerDto.kt */
/* loaded from: classes4.dex */
public final class zsj {
    public final Post a;
    public final CoownershipStatusUiDto b;
    public final List<NewsfeedCoowners.CoownerRequest> c;

    public zsj(Post post, CoownershipStatusUiDto coownershipStatusUiDto, List<NewsfeedCoowners.CoownerRequest> list) {
        this.a = post;
        this.b = coownershipStatusUiDto;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsj)) {
            return false;
        }
        zsj zsjVar = (zsj) obj;
        return epx.f(this.a, zsjVar.a) && this.b == zsjVar.b && epx.f(this.c, zsjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoownersInviteBannerDto(entry=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", requests=");
        return ms9.a(')', sb, this.c);
    }
}
