package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;

/* compiled from: CatalogLegacyBlockAction.kt */
/* loaded from: classes16.dex */
public interface f8a extends lj50 {

    /* compiled from: CatalogLegacyBlockAction.kt */
    public static final class a implements f8a {
        public final q1a b;

        public a(q1a q1aVar) {
            this.b = q1aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BlockAction(action=" + this.b + ')';
        }
    }

    /* compiled from: CatalogLegacyBlockAction.kt */
    public static final class b implements f8a {
        public final CatalogBlockState b;

        public b(CatalogBlockState catalogBlockState) {
            this.b = catalogBlockState;
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
            return "BlockBind(newState=" + this.b + ')';
        }
    }
}
