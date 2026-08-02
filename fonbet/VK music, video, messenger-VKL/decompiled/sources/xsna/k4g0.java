package xsna;

import com.vk.dto.common.Attachment;
import java.util.List;

/* compiled from: ReplyModel.kt */
/* loaded from: classes18.dex */
public final class k4g0 {
    public final int a;
    public final int b;
    public final big0 c;
    public final int d;
    public final boolean e;
    public final CharSequence f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List<Attachment> j;
    public final int k;
    public final boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    public k4g0(int i, int i2, big0 big0Var, int i3, boolean z, CharSequence charSequence, boolean z2, boolean z3, boolean z4, List<? extends Attachment> list, int i4, boolean z5) {
        this.a = i;
        this.b = i2;
        this.c = big0Var;
        this.d = i3;
        this.e = z;
        this.f = charSequence;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = list;
        this.k = i4;
        this.l = z5;
    }

    public static k4g0 a(k4g0 k4g0Var, boolean z, boolean z2, int i) {
        int i2 = k4g0Var.a;
        int i3 = k4g0Var.b;
        big0 big0Var = k4g0Var.c;
        int i4 = k4g0Var.d;
        boolean z3 = k4g0Var.e;
        CharSequence charSequence = k4g0Var.f;
        boolean z4 = k4g0Var.g;
        if ((i & 128) != 0) {
            z = k4g0Var.h;
        }
        boolean z5 = z;
        boolean z6 = k4g0Var.i;
        List<Attachment> list = k4g0Var.j;
        int i5 = k4g0Var.k;
        boolean z7 = (i & 2048) != 0 ? k4g0Var.l : z2;
        k4g0Var.getClass();
        return new k4g0(i2, i3, big0Var, i4, z3, charSequence, z4, z5, z6, list, i5, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4g0)) {
            return false;
        }
        k4g0 k4g0Var = (k4g0) obj;
        return this.a == k4g0Var.a && this.b == k4g0Var.b && epx.f(this.c, k4g0Var.c) && this.d == k4g0Var.d && this.e == k4g0Var.e && epx.f(this.f, k4g0Var.f) && this.g == k4g0Var.g && this.h == k4g0Var.h && this.i == k4g0Var.i && epx.f(this.j, k4g0Var.j) && this.k == k4g0Var.k && this.l == k4g0Var.l;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        big0 big0Var = this.c;
        return Boolean.hashCode(this.l) + shy.a(this.k, fw3.a(qoy.b(qoy.b(qoy.b(u11.c(qoy.b(shy.a(this.d, (a + (big0Var == null ? 0 : big0Var.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyModel(id=");
        sb.append(this.a);
        sb.append(", reviewId=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", date=");
        sb.append(this.d);
        sb.append(", isAnswerButtonVisible=");
        sb.append(this.e);
        sb.append(", text=");
        sb.append((Object) this.f);
        sb.append(", canDelete=");
        sb.append(this.g);
        sb.append(", isDeleted=");
        sb.append(this.h);
        sb.append(", canEdit=");
        sb.append(this.i);
        sb.append(", attachments=");
        sb.append(this.j);
        sb.append(", itemId=");
        sb.append(this.k);
        sb.append(", isTextExpanded=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
