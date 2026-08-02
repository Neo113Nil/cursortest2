package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import java.util.Objects;

/* compiled from: OnMediaCommentUiComponentData.kt */
/* loaded from: classes4.dex */
public final class b880 extends qyp0 {
    public final UserId b;
    public final int c;
    public final CharSequence d;
    public final Comment e;
    public final Owner f;
    public final boolean g;

    public b880(UserId userId, int i, CharSequence charSequence, Comment comment, Owner owner, boolean z) {
        super(1);
        this.b = userId;
        this.c = i;
        this.d = charSequence;
        this.e = comment;
        this.f = owner;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b880) {
            b880 b880Var = (b880) obj;
            if (this.c == b880Var.c && epx.f(this.b, b880Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnMediaCommentUiComponentData(ownerId=");
        sb.append(this.b);
        sb.append(", postId=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append((Object) this.d);
        sb.append(", comment=");
        sb.append(this.e);
        sb.append(", commentOwner=");
        sb.append(this.f);
        sb.append(", isNeedAppearAnimation=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
