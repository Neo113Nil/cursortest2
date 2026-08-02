package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hm8 implements km8 {
    public final Text a;
    public final Text b;
    public final ThemedImageUrlEntity c;

    public hm8(Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = text;
        this.b = text2;
        this.c = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm8)) {
            return false;
        }
        hm8 hm8Var = (hm8) obj;
        return jl40.l(this.a, hm8Var.a) && jl40.l(this.b, hm8Var.b) && jl40.l(this.c, hm8Var.c);
    }

    @Override // defpackage.km8
    public final Text getMessage() {
        return this.b;
    }

    @Override // defpackage.km8
    public final Text getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = n.p("ReissueRequestLoading(title=", this.a, ", message=", this.b, ", image=");
        p.append(this.c);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
