package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import java.util.List;

/* compiled from: CommentItem.kt */
/* loaded from: classes16.dex */
public final class xbg implements hfz {
    public final int b;
    public final ImageList c;
    public final String d;
    public final UserId e;
    public final String f;
    public final CharSequence g;
    public final List<hfz> h;
    public final String i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final boolean o;

    public xbg(int i, ImageList imageList, String str, UserId userId, String str2, CharSequence charSequence, List list, String str3, boolean z, int i2, boolean z2, int i3, boolean z3, boolean z4) {
        this.b = i;
        this.c = imageList;
        this.d = str;
        this.e = userId;
        this.f = str2;
        this.g = charSequence;
        this.h = list;
        this.i = str3;
        this.j = z;
        this.k = i2;
        this.l = z2;
        this.m = i3;
        this.n = z3;
        this.o = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbg)) {
            return false;
        }
        xbg xbgVar = (xbg) obj;
        return this.b == xbgVar.b && epx.f(this.c, xbgVar.c) && epx.f(this.d, xbgVar.d) && epx.f(this.e, xbgVar.e) && this.f.equals(xbgVar.f) && epx.f(this.g, xbgVar.g) && epx.f(this.h, xbgVar.h) && epx.f(this.i, xbgVar.i) && this.j == xbgVar.j && this.k == xbgVar.k && this.l == xbgVar.l && this.m == xbgVar.m && this.n == xbgVar.n && this.o == xbgVar.o;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + qoy.b(qoy.b(shy.a(this.m, qoy.b(shy.a(this.k, qoy.b(urd0.a(fw3.a(u11.c(urd0.a(bh10.a(urd0.a(fw3.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d), 31, this.e.b), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31), 31, this.n), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentItem(id=");
        sb.append(this.b);
        sb.append(", authorAvatar=");
        sb.append(this.c);
        sb.append(", authorName=");
        sb.append(this.d);
        sb.append(", authorId=");
        sb.append(this.e);
        sb.append(", replyToUserName=");
        sb.append(this.f);
        sb.append(", commentText=");
        sb.append((Object) this.g);
        sb.append(", attachments=");
        sb.append(this.h);
        sb.append(", commentDate=");
        sb.append(this.i);
        sb.append(", isReplyVisible=");
        sb.append(this.j);
        sb.append(", level=");
        sb.append(this.k);
        sb.append(", isHighlighted=");
        sb.append(this.l);
        sb.append(", reactionsCount=");
        sb.append(this.m);
        sb.append(", isUserReacted=");
        sb.append(this.n);
        sb.append(", isReactionEnabled=true, isEdited=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
