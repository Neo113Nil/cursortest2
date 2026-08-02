package defpackage;

import com.yandex.plus.pay.data.mb.dto.RichTextDto$Item$Type;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class p3k0 {
    public static final n3k0 Companion = new n3k0();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(17)), null, null};
    public final String a;
    public final RichTextDto$Item$Type b;
    public final String c;
    public final String d;

    public /* synthetic */ p3k0(int i, String str, RichTextDto$Item$Type richTextDto$Item$Type, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, m3k0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = richTextDto$Item$Type;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3k0)) {
            return false;
        }
        p3k0 p3k0Var = (p3k0) obj;
        return jl40.l(this.a, p3k0Var.a) && this.b == p3k0Var.b && jl40.l(this.c, p3k0Var.c) && jl40.l(this.d, p3k0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(key=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", link=");
        return b64.p(sb, this.d, ')');
    }
}
