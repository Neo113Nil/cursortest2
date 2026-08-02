package xsna;

import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.stories.ImStoryState;

/* compiled from: ChannelItem.kt */
/* loaded from: classes16.dex */
public final class j0b implements hfz {
    public final long b;
    public final ImageList c;
    public final CharSequence d;
    public final CharSequence e;
    public final String f;
    public final CharSequence g;
    public final int h;
    public final boolean i;
    public final ImStoryState j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public j0b(long j, ImageList imageList, CharSequence charSequence, CharSequence charSequence2, String str, String str2, int i, boolean z, ImStoryState imStoryState, boolean z2, boolean z3, boolean z4) {
        this.b = j;
        this.c = imageList;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = z;
        this.j = imStoryState;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0b)) {
            return false;
        }
        j0b j0bVar = (j0b) obj;
        return this.b == j0bVar.b && epx.f(this.c, j0bVar.c) && epx.f(this.d, j0bVar.d) && epx.f(this.e, j0bVar.e) && this.f.equals(j0bVar.f) && epx.f(this.g, j0bVar.g) && this.h == j0bVar.h && this.i == j0bVar.i && this.j == j0bVar.j && this.k == j0bVar.k && this.l == j0bVar.l && this.m == j0bVar.m;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + u11.c(u11.c(fw3.a(Long.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e)) * 31;
        CharSequence charSequence = this.g;
        return Boolean.hashCode(this.m) + qoy.b(qoy.b((this.j.hashCode() + qoy.b(shy.a(this.h, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31, this.i)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelItem(id=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", body=");
        sb.append((Object) this.e);
        sb.append(", timeText=");
        sb.append((Object) this.f);
        sb.append(", timeDescription=");
        sb.append((Object) this.g);
        sb.append(", unreadCount=");
        sb.append(this.h);
        sb.append(", muted=");
        sb.append(this.i);
        sb.append(", storyState=");
        sb.append(this.j);
        sb.append(", verified=");
        sb.append(this.k);
        sb.append(", isPinned=");
        sb.append(this.l);
        sb.append(", isHiddenInAllFolder=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
