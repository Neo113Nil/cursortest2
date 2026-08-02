package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ags extends gc5 {
    public final FrequencyType c;
    public final Text.Constant d;
    public final boolean e;

    public ags(FrequencyType frequencyType, Text.Constant constant, boolean z) {
        super(frequencyType.toString(), 2);
        this.c = frequencyType;
        this.d = constant;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ags)) {
            return false;
        }
        ags agsVar = (ags) obj;
        return this.c == agsVar.c && jl40.l(this.d, agsVar.d) && this.e == agsVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xvz.d(this.d, this.c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrequencyOption(type=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", selected=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
