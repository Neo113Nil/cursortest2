package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkStyledTextItemModel$TextStyle;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class i160 implements n160 {
    public static final h160 Companion = new h160();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(16)), null};
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final NetworkStyledTextItemModel$TextStyle e;
    public final String f;

    public /* synthetic */ i160(int i, String str, String str2, int i2, int i3, NetworkStyledTextItemModel$TextStyle networkStyledTextItemModel$TextStyle, String str3) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, g160.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = networkStyledTextItemModel$TextStyle;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i160)) {
            return false;
        }
        i160 i160Var = (i160) obj;
        return jl40.l(this.a, i160Var.a) && jl40.l(this.b, i160Var.b) && this.c == i160Var.c && this.d == i160Var.d && this.e == i160Var.e && jl40.l(this.f, i160Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStyledTextItemModel(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", textSize=");
        sb.append(this.c);
        sb.append(", textWeight=");
        sb.append(this.d);
        sb.append(", textStyle=");
        sb.append(this.e);
        sb.append(", textColor=");
        return b64.p(sb, this.f, ')');
    }
}
