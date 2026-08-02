package xsna;

import com.vk.dto.common.Source;
import java.util.List;

/* compiled from: DialogThemedAppearanceGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class jlm extends le6<List<? extends p9m>> {
    public final Source b;
    public final boolean c = true;

    public jlm(Source source) {
        this.b = source;
    }

    @Override // xsna.le6
    public final List<? extends p9m> e(w2w w2wVar) {
        w2wVar.L0(this, new s9m(this.b, this.c));
        return w2wVar.I0().t().g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlm)) {
            return false;
        }
        jlm jlmVar = (jlm) obj;
        return this.b == jlmVar.b && this.c == jlmVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemedAppearanceGetAllCmd(source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
