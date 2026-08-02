package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ReplyItem.kt */
/* loaded from: classes18.dex */
public final class i4g0 implements hfz {
    public final int b;
    public final int c;
    public final UserId d;
    public final String e;
    public final String f;
    public final boolean g;
    public final CharSequence h;
    public final boolean i;
    public final String j;
    public final int k;
    public final List<Attachment> l;
    public final b2g0 m;
    public final boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public i4g0(int i, int i2, UserId userId, String str, String str2, boolean z, CharSequence charSequence, boolean z2, String str3, int i3, List<? extends Attachment> list, b2g0 b2g0Var, boolean z3) {
        this.b = i;
        this.c = i2;
        this.d = userId;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = charSequence;
        this.i = z2;
        this.j = str3;
        this.k = i3;
        this.l = list;
        this.m = b2g0Var;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4g0)) {
            return false;
        }
        i4g0 i4g0Var = (i4g0) obj;
        return this.b == i4g0Var.b && this.c == i4g0Var.c && epx.f(this.d, i4g0Var.d) && epx.f(this.e, i4g0Var.e) && epx.f(this.f, i4g0Var.f) && this.g == i4g0Var.g && epx.f(this.h, i4g0Var.h) && this.i == i4g0Var.i && epx.f(this.j, i4g0Var.j) && this.k == i4g0Var.k && epx.f(this.l, i4g0Var.l) && epx.f(this.m, i4g0Var.m) && this.n == i4g0Var.n;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.k);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int a2 = fw3.a(shy.a(this.k, urd0.a(qoy.b(u11.c(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l);
        b2g0 b2g0Var = this.m;
        return Boolean.hashCode(this.n) + ((a2 + (b2g0Var != null ? b2g0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyItem(id=");
        sb.append(this.b);
        sb.append(", reviewId=");
        sb.append(this.c);
        sb.append(", authorId=");
        sb.append(this.d);
        sb.append(", authorImg=");
        sb.append(this.e);
        sb.append(", authorName=");
        sb.append(this.f);
        sb.append(", isAnswerButtonVisible=");
        sb.append(this.g);
        sb.append(", text=");
        sb.append((Object) this.h);
        sb.append(", isTextExpanded=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", itemId=");
        sb.append(this.k);
        sb.append(", attachments=");
        sb.append(this.l);
        sb.append(", additionalInfo=");
        sb.append(this.m);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.n, ')');
    }
}
