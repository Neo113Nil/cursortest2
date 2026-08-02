package xsna;

import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import java.util.List;

/* compiled from: NewsfeedCoownersListState.kt */
/* loaded from: classes17.dex */
public final class me60 implements km50 {
    public final PostInfoData b;
    public final NewsfeedCoowners c;
    public final List<Long> d;

    public me60(PostInfoData postInfoData, NewsfeedCoowners newsfeedCoowners, List<Long> list) {
        this.b = postInfoData;
        this.c = newsfeedCoowners;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me60)) {
            return false;
        }
        me60 me60Var = (me60) obj;
        return epx.f(this.b, me60Var.b) && epx.f(this.c, me60Var.c) && epx.f(this.d, me60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCoownersListState(postInfoData=");
        sb.append(this.b);
        sb.append(", coowners=");
        sb.append(this.c);
        sb.append(", notInitiallySubscribedCoownerIds=");
        return ms9.a(')', sb, this.d);
    }
}
