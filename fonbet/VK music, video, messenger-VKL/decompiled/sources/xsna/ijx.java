package xsna;

import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;

/* compiled from: InternalNpsAction.kt */
/* loaded from: classes16.dex */
public abstract class ijx implements kj50 {

    /* compiled from: InternalNpsAction.kt */
    public static final class a extends ijx {
        public static final a b = new a();
    }

    /* compiled from: InternalNpsAction.kt */
    public static final class b extends ijx {
        public final NpsFeatureModel b;

        public b(NpsFeatureModel npsFeatureModel) {
            this.b = npsFeatureModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "InitLoad(npsModel=" + this.b + ')';
        }
    }

    /* compiled from: InternalNpsAction.kt */
    public static final class c extends ijx {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SelectValue(value="), this.b, ')');
        }
    }
}
