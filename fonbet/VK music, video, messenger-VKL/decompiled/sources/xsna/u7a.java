package xsna;

import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;

/* compiled from: CatalogInternalNpsViewState.kt */
/* loaded from: classes16.dex */
public final class u7a implements fm50 {
    public final yzt0<NpsFeatureModel> a;
    public final yzt0<QuestionsTexts> b;

    public u7a(h0u0 h0u0Var, h0u0 h0u0Var2) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7a)) {
            return false;
        }
        u7a u7aVar = (u7a) obj;
        return epx.f(this.a, u7aVar.a) && epx.f(this.b, u7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(npsModel=");
        sb.append(this.a);
        sb.append(", questionsTexts=");
        return tr.c(sb, this.b, ')');
    }
}
