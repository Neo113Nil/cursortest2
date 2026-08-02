package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bwz0 {
    public final String a;
    public final rbv b;
    public final TopButtonTag c;
    public final Text d;

    public bwz0(String str, rbv rbvVar, TopButtonTag topButtonTag, Text text) {
        this.a = str;
        this.b = rbvVar;
        this.c = topButtonTag;
        this.d = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwz0)) {
            return false;
        }
        bwz0 bwz0Var = (bwz0) obj;
        return jl40.l(this.a, bwz0Var.a) && this.b.equals(bwz0Var.b) && this.c == bwz0Var.c && jl40.l(this.d, bwz0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ly3.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        Text text = this.d;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "TopButton(action=" + this.a + ", image=" + this.b + ", tag=" + this.c + ", descriptionText=" + this.d + Extension.C_BRAKE;
    }
}
