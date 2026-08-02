package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.entities.GetApplicationStatusEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c3t {
    public final GetApplicationStatusEntity$Status a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final Text d;
    public final Text e;
    public final String f;
    public final String g;

    public c3t(GetApplicationStatusEntity$Status getApplicationStatusEntity$Status, Text.Constant constant, Text.Constant constant2, Text.Constant constant3, Text.Constant constant4, String str, String str2) {
        this.a = getApplicationStatusEntity$Status;
        this.b = constant;
        this.c = constant2;
        this.d = constant3;
        this.e = constant4;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3t)) {
            return false;
        }
        c3t c3tVar = (c3t) obj;
        return this.a == c3tVar.a && this.b.equals(c3tVar.b) && this.c.equals(c3tVar.c) && jl40.l(this.d, c3tVar.d) && jl40.l(this.e, c3tVar.e) && jl40.l(this.f, c3tVar.f) && jl40.l(this.g, c3tVar.g);
    }

    public final int hashCode() {
        int d = xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        Text text = this.d;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.e;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetApplicationStatusEntity(status=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", titleTimeout=");
        sb.append(this.d);
        sb.append(", descriptionTimeout=");
        sb.append(this.e);
        sb.append(", cardId=");
        sb.append(this.f);
        sb.append(", supportUrl=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
