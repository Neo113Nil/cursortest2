package defpackage;

import com.yandex.plus.core.data.common.PlusThemedImage;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class o7f0 {
    public final String a;
    public final PlusThemedImage b;
    public final String c;
    public final String d;
    public final List e;
    public final Boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o7f0(String str, PlusThemedImage plusThemedImage, String str2, String str3, String str4) {
        this(str, plusThemedImage, str2, r0.toString(), EmptyList.a, null, false);
        StringBuilder sb = new StringBuilder();
        boolean z = str3 == null || evu0.J(str3);
        boolean z2 = str4 == null || evu0.J(str4);
        sb.append(str3);
        if (!z && !z2) {
            sb.append(Extension.FIX_SPACE);
        }
        sb.append(str4);
    }

    public static o7f0 a(o7f0 o7f0Var, Boolean bool, boolean z, int i) {
        String str = o7f0Var.a;
        PlusThemedImage plusThemedImage = o7f0Var.b;
        String str2 = o7f0Var.c;
        String str3 = o7f0Var.d;
        List list = o7f0Var.e;
        if ((i & 32) != 0) {
            bool = o7f0Var.f;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            z = o7f0Var.g;
        }
        return new o7f0(str, plusThemedImage, str2, str3, list, bool2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7f0)) {
            return false;
        }
        o7f0 o7f0Var = (o7f0) obj;
        return jl40.l(this.a, o7f0Var.a) && jl40.l(this.b, o7f0Var.b) && jl40.l(this.c, o7f0Var.c) && jl40.l(this.d, o7f0Var.d) && jl40.l(this.e, o7f0Var.e) && jl40.l(this.f, o7f0Var.f) && this.g == o7f0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int c = unr0.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        Boolean bool = this.f;
        return Boolean.hashCode(this.g) + ((c + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductContent(id=");
        sb.append(this.a);
        sb.append(", logo=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", benefits=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", isReplaced=");
        return unr0.u(sb, this.g, ')');
    }

    public o7f0(String str, PlusThemedImage plusThemedImage, String str2, String str3, List list, Boolean bool, boolean z) {
        this.a = str;
        this.b = plusThemedImage;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = bool;
        this.g = z;
    }
}
