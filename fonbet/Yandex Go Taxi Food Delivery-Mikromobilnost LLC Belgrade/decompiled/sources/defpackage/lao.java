package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class lao {
    public final Text.Constant a;
    public final String b;
    public final Themes c;
    public final Themes d;

    public lao(Text.Constant constant, String str, Themes themes, Themes themes2) {
        this.a = constant;
        this.b = str;
        this.c = themes;
        this.d = themes2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lao)) {
            return false;
        }
        lao laoVar = (lao) obj;
        return this.a.equals(laoVar.a) && jl40.l(this.b, laoVar.b) && jl40.l(this.c, laoVar.c) && jl40.l(this.d, laoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nnm.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "ErrorViewButtonsEntity(text=" + this.a + ", action=" + this.b + ", textColor=" + this.c + ", backgroundColor=" + this.d + Extension.C_BRAKE;
    }
}
