package xsna;

/* compiled from: ContactItem.kt */
/* loaded from: classes2.dex */
public final class t8j implements b8j {
    public final qtd0 b;
    public final int c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final CharSequence i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final Integer n;
    public final String o;

    /* compiled from: ContactItem.kt */
    public static final class a {
    }

    public t8j(qtd0 qtd0Var, int i, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, CharSequence charSequence2, long j, boolean z5, boolean z6, a aVar, String str, Integer num, String str2) {
        this.b = qtd0Var;
        this.c = i;
        this.d = charSequence;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = charSequence2;
        this.j = j;
        this.k = z5;
        this.l = z6;
        this.m = str;
        this.n = num;
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8j)) {
            return false;
        }
        t8j t8jVar = (t8j) obj;
        return epx.f(this.b, t8jVar.b) && this.c == t8jVar.c && epx.f(this.d, t8jVar.d) && this.e == t8jVar.e && this.f == t8jVar.f && this.g == t8jVar.g && this.h == t8jVar.h && epx.f(this.i, t8jVar.i) && this.j == t8jVar.j && this.k == t8jVar.k && this.l == t8jVar.l && epx.f(null, null) && epx.f(this.m, t8jVar.m) && epx.f(this.n, t8jVar.n) && epx.f(this.o, t8jVar.o);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        qtd0 qtd0Var = this.b;
        return Integer.valueOf(((Long.hashCode(qtd0Var.id()) + (Long.hashCode(qtd0Var.G3()) * 31)) * 31) + this.c);
    }

    @Override // xsna.b8j
    public final CharSequence getName() {
        return this.d;
    }

    @Override // xsna.etx0
    public final int getType() {
        return this.c;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(bh10.a(u11.c(qoy.b(qoy.b(qoy.b(qoy.b(u11.c(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 961, this.l);
        String str = this.m;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.n;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.o;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactItem(profile=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append((Object) this.d);
        sb.append(", isSelected=");
        sb.append(this.e);
        sb.append(", isAvailableForSelection=");
        sb.append(this.f);
        sb.append(", isAlreadyInChat=");
        sb.append(this.g);
        sb.append(", disableContactsWithForbiddenWrite=");
        sb.append(this.h);
        sb.append(", formattedPhone=");
        sb.append((Object) this.i);
        sb.append(", id=");
        sb.append(this.j);
        sb.append(", showPhoneNumber=");
        sb.append(this.k);
        sb.append(", showBirthdayCake=");
        sb.append(this.l);
        sb.append(", title=");
        sb.append((Object) null);
        sb.append(", subtitle=");
        sb.append(this.m);
        sb.append(", backgroundColor=");
        sb.append(this.n);
        sb.append(", trackCode=");
        return ho8.a(sb, this.o, ')');
    }

    public /* synthetic */ t8j(qtd0 qtd0Var, int i, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, int i2) {
        this(qtd0Var, i, charSequence, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, "", qtd0Var.getId().longValue(), (i2 & 512) != 0 ? false : z5, z6, null, null, null, (i2 & 16384) != 0 ? null : str);
    }
}
