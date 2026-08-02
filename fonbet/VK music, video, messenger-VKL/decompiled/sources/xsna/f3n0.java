package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.users.User;

/* compiled from: SuggestItem.kt */
/* loaded from: classes16.dex */
public final class f3n0 implements hfz {
    public final long b;
    public final ImageList c;
    public final CharSequence d;
    public final CharSequence e;
    public final ImStoryState f;
    public final boolean g;
    public final User h;

    public f3n0(long j, ImageList imageList, String str, CharSequence charSequence, ImStoryState imStoryState, boolean z, User user) {
        this.b = j;
        this.c = imageList;
        this.d = str;
        this.e = charSequence;
        this.f = imStoryState;
        this.g = z;
        this.h = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3n0)) {
            return false;
        }
        f3n0 f3n0Var = (f3n0) obj;
        return this.b == f3n0Var.b && epx.f(this.c, f3n0Var.c) && epx.f(this.d, f3n0Var.d) && epx.f(this.e, f3n0Var.e) && this.f == f3n0Var.f && this.g == f3n0Var.g && epx.f(this.h, f3n0Var.h);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int b = qoy.b((this.f.hashCode() + u11.c(u11.c(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e)) * 31, 31, this.g);
        User user = this.h;
        return b + (user == null ? 0 : user.hashCode());
    }

    public final String toString() {
        return "SuggestItem(id=" + this.b + ", avatar=" + this.c + ", name=" + ((Object) this.d) + ", body=" + ((Object) this.e) + ", storyState=" + this.f + ", verified=" + this.g + ", inviter=" + this.h + ')';
    }
}
