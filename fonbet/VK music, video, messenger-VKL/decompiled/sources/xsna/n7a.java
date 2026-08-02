package xsna;

import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;

/* compiled from: CatalogInternalNpsAction.kt */
/* loaded from: classes16.dex */
public abstract class n7a implements kj50 {

    /* compiled from: CatalogInternalNpsAction.kt */
    public static final class a extends n7a {
        public static final a b = new a();
    }

    /* compiled from: CatalogInternalNpsAction.kt */
    public static final class b extends n7a {
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
            return "InitLoad(featureModel=" + this.b + ", questionsTexts=" + this.c + ')';
        }
    }

    /* compiled from: CatalogInternalNpsAction.kt */
    public static final class c extends n7a {
        public static final c b = new c();
    }

    /* compiled from: CatalogInternalNpsAction.kt */
    public static final class d extends n7a {
        public static final d b = new d();
    }
}
