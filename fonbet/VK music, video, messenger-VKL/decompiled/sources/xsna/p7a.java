package xsna;

import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;

/* compiled from: CatalogInternalNpsPatch.kt */
/* loaded from: classes16.dex */
public abstract class p7a implements xl50 {

    /* compiled from: CatalogInternalNpsPatch.kt */
    public static final class a extends p7a {
        public static final a b = new a();
    }

    /* compiled from: CatalogInternalNpsPatch.kt */
    public static final class b extends p7a {
        public final NpsFeatureModel b;
        public final QuestionsTexts c;

        public b(NpsFeatureModel npsFeatureModel, QuestionsTexts questionsTexts) {
            this.b = npsFeatureModel;
            this.c = questionsTexts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ToContent(npsModel=" + this.b + ", questionsTexts=" + this.c + ')';
        }
    }
}
