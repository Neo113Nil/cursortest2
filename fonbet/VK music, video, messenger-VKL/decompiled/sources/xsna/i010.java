package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: GoodCommentsHolder.kt */
/* loaded from: classes18.dex */
public final class i010 extends c8u {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final ArrayList e;
    public final boolean f;

    public i010(int i, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        super(R.string.good_comments_block_title);
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = arrayList;
        this.f = z3;
    }

    @Override // xsna.c8u
    public final boolean a(c8u c8uVar) {
        return c8uVar.equals(this);
    }

    @Override // xsna.c8u
    public final boolean b(c8u c8uVar) {
        return c8uVar instanceof i010;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj != null && (obj instanceof i010)) {
            i010 i010Var = (i010) obj;
            if (this.a == i010Var.a && this.b == i010Var.b && this.c == i010Var.c && this.d == i010Var.d && this.f == i010Var.f) {
                ArrayList arrayList = i010Var.e;
                ArrayList arrayList2 = this.e;
                if (arrayList2.size() == arrayList.size()) {
                    int size = arrayList2.size();
                    for (0; i < size; i + 1) {
                        i = (epx.f(arrayList2.get(i), arrayList.get(i)) && epx.f(((iag) arrayList2.get(i)).getText(), ((iag) arrayList.get(i)).getText()) && ((iag) arrayList2.get(i)).J() == ((iag) arrayList.get(i)).J()) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qr.a(this.e, shy.a(this.d, qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentItem(isTitleVisible=");
        sb.append(this.b);
        sb.append(", canWriteComment=");
        sb.append(this.c);
        sb.append(", commentsCount=");
        sb.append(this.d);
        sb.append(", comments=");
        sb.append(this.e);
        sb.append(", showEmptyView=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
