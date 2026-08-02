package xsna;

import com.vk.translate.impl.models.LanguageModel;

/* compiled from: SelectableLanguageModel.kt */
/* loaded from: classes6.dex */
public final class mai0 {
    public final LanguageModel a;
    public final boolean b;

    public mai0(LanguageModel languageModel, boolean z) {
        this.a = languageModel;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mai0)) {
            return false;
        }
        mai0 mai0Var = (mai0) obj;
        return epx.f(this.a, mai0Var.a) && this.b == mai0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableLanguageModel(languageModel=");
        sb.append(this.a);
        sb.append(", canSelect=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
