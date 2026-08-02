package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h6 {
    public final ArrayList a;
    public final Text.Join b;
    public final Integer c;

    public h6(ArrayList arrayList, Text.Join join, Integer num) {
        this.a = arrayList;
        this.b = join;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return this.a.equals(h6Var.a) && this.b.equals(h6Var.b) && jl40.l(this.c, h6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AboutState(aboutItems=");
        sb.append(this.a);
        sb.append(", versionInfo=");
        sb.append(this.b);
        sb.append(", coinGifResId=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
