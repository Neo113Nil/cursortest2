package xsna;

import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;

/* compiled from: CatalogInternalNpsState.kt */
/* loaded from: classes16.dex */
public interface r7a extends km50 {

    /* compiled from: CatalogInternalNpsState.kt */
    public static final class a implements r7a {
        public final NpsFeatureModel b;
        public final QuestionsTexts c;

        public a(NpsFeatureModel npsFeatureModel, QuestionsTexts questionsTexts) {
            this.b = npsFeatureModel;
            this.c = questionsTexts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Content(npsModel=" + this.b + ", questionsTexts=" + this.c + ')';
        }
    }

    /* compiled from: CatalogInternalNpsState.kt */
    public static final class b implements r7a {
        public static final b b = new b();
    }

    /* compiled from: CatalogInternalNpsState.kt */
    public static final class c implements r7a {
        public static final c b = new c();
    }
}
