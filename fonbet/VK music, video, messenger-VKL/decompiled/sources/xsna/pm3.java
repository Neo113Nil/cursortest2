package xsna;

import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.profile.Donut;

/* compiled from: ArticleAuthor.kt */
/* loaded from: classes18.dex */
public final class pm3 {
    public final Owner a;
    public final int b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public boolean h;
    public final Donut i;
    public final boolean j;
    public final GroupLeaveMode k;
    public final boolean l;

    public pm3(Owner owner, int i, String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, Donut donut, boolean z5, GroupLeaveMode groupLeaveMode, boolean z6) {
        this.a = owner;
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = donut;
        this.j = z5;
        this.k = groupLeaveMode;
        this.l = z6;
    }

    public final boolean a() {
        return this.a.i(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm3)) {
            return false;
        }
        pm3 pm3Var = (pm3) obj;
        return epx.f(this.a, pm3Var.a) && this.b == pm3Var.b && epx.f(this.c, pm3Var.c) && epx.f(this.d, pm3Var.d) && this.e == pm3Var.e && this.f == pm3Var.f && this.g == pm3Var.g && this.h == pm3Var.h && epx.f(this.i, pm3Var.i) && this.j == pm3Var.j && this.k == pm3Var.k && this.l == pm3Var.l;
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Donut donut = this.i;
        int b2 = qoy.b((b + (donut == null ? 0 : donut.hashCode())) * 31, 31, this.j);
        GroupLeaveMode groupLeaveMode = this.k;
        return Boolean.hashCode(this.l) + ((b2 + (groupLeaveMode != null ? groupLeaveMode.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleAuthor(owner=");
        sb.append(this.a);
        sb.append(", subscribersCount=");
        sb.append(this.b);
        sb.append(", domain=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", isOpen=");
        sb.append(this.e);
        sb.append(", isClosed=");
        sb.append(this.f);
        sb.append(", isPrivate=");
        sb.append(this.g);
        sb.append(", isSubscribeRequested=");
        sb.append(this.h);
        sb.append(", donut=");
        sb.append(this.i);
        sb.append(", isAdmin=");
        sb.append(this.j);
        sb.append(", leaveMode=");
        sb.append(this.k);
        sb.append(", hasPaymentCabinet=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
