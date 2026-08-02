package xsna;

import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SubscribersSlotContentState.kt */
/* loaded from: classes5.dex */
public final class exm0 {
    public final us2 a;
    public final lg90 b;
    public final AuthorHeaderEvent.Info.SubscribersClick c;
    public final boolean d;
    public final List<String> e;

    public exm0(us2 us2Var, lg90 lg90Var, AuthorHeaderEvent.Info.SubscribersClick subscribersClick, boolean z, List<String> list) {
        this.a = us2Var;
        this.b = lg90Var;
        this.c = subscribersClick;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exm0)) {
            return false;
        }
        exm0 exm0Var = (exm0) obj;
        return epx.f(this.a, exm0Var.a) && epx.f(this.b, exm0Var.b) && epx.f(this.c, exm0Var.c) && this.d == exm0Var.d && epx.f(this.e, exm0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lg90 lg90Var = this.b;
        return this.e.hashCode() + qoy.b((this.c.hashCode() + ((hashCode + (lg90Var == null ? 0 : lg90Var.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribersSlotContentState(middleText=");
        sb.append((Object) this.a);
        sb.append(", leadingIcon=");
        sb.append(this.b);
        sb.append(", cellClickEvent=");
        sb.append(this.c);
        sb.append(", showUserStack=");
        sb.append(this.d);
        sb.append(", stackAvatarUrls=");
        return ms9.a(')', sb, this.e);
    }

    public exm0(us2 us2Var, lg90 lg90Var, AuthorHeaderEvent.Info.SubscribersClick subscribersClick) {
        this(us2Var, lg90Var, subscribersClick, false, EmptyList.b);
    }
}
