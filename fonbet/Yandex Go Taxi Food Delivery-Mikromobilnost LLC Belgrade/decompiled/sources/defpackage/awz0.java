package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButton$Alignment;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class awz0 {
    public final String a;
    public final ThemedImageUrlEntity b;
    public final TopButtonTag c;
    public final Text d;
    public final TopButton$Alignment e;

    public awz0(String str, ThemedImageUrlEntity themedImageUrlEntity, TopButtonTag topButtonTag, Text.Resource resource, TopButton$Alignment topButton$Alignment) {
        this.a = str;
        this.b = themedImageUrlEntity;
        this.c = topButtonTag;
        this.d = resource;
        this.e = topButton$Alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awz0)) {
            return false;
        }
        awz0 awz0Var = (awz0) obj;
        return jl40.l(this.a, awz0Var.a) && this.b.equals(awz0Var.b) && this.c == awz0Var.c && jl40.l(this.d, awz0Var.d) && this.e == awz0Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + xvz.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        Text text = this.d;
        return this.e.hashCode() + ((hashCode + (text == null ? 0 : text.hashCode())) * 31);
    }

    public final String toString() {
        return "TopButton(action=" + this.a + ", image=" + this.b + ", tag=" + this.c + ", descriptionText=" + this.d + ", alignment=" + this.e + Extension.C_BRAKE;
    }
}
