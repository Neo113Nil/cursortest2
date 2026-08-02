package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaLikeUiComponent$Companion$Position;
import java.util.Objects;

/* compiled from: OnMediaLikeUiComponentData.kt */
/* loaded from: classes4.dex */
public final class i880 extends qyp0 {
    public final UserId b;
    public final int c;
    public final OnMediaLikeUiComponent$Companion$Position d;
    public final Owner e;
    public final boolean f;
    public final String g;

    public i880(UserId userId, int i, OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position, Owner owner, boolean z, String str) {
        super(0);
        this.b = userId;
        this.c = i;
        this.d = onMediaLikeUiComponent$Companion$Position;
        this.e = owner;
        this.f = z;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i880) {
            i880 i880Var = (i880) obj;
            if (this.c == i880Var.c && epx.f(this.b, i880Var.b) && this.d == i880Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaLikeUiComponentData(ownerId=");
        sb.append(this.b);
        sb.append(", postId=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", likeOwner=");
        sb.append(this.e);
        sb.append(", isNeedAppearAnimation=");
        sb.append(this.f);
        sb.append(", reactionUri=");
        return ho8.a(sb, this.g, ')');
    }
}
