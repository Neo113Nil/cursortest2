package xsna;

import com.vk.catalog.mvi.block.BlockId;
import xsna.sga;

/* compiled from: CatalogSectionAction.kt */
/* loaded from: classes16.dex */
public interface yda extends lj50 {

    /* compiled from: CatalogSectionAction.kt */
    @vby
    public static final class a implements yda {
        public final q1a b;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BlockAction(action=" + this.b + ')';
        }
    }

    /* compiled from: CatalogSectionAction.kt */
    public static final class b implements yda {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -835651032;
        }

        public final String toString() {
            return "NearEndTrigger";
        }
    }

    /* compiled from: CatalogSectionAction.kt */
    public static final class c implements yda {
        public final sga.c b;

        public c(sga.c cVar) {
            this.b = cVar;
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
            return "OnErrorViewRetry(error=" + this.b + ')';
        }
    }

    /* compiled from: CatalogSectionAction.kt */
    public interface d extends yda {

        /* compiled from: CatalogSectionAction.kt */
        public static final class a implements d {
            public final int b;
            public final BlockId c;
            public final int d;
            public final BlockId e;

            public a(int i, BlockId blockId, int i2, BlockId blockId2) {
                this.b = i;
                this.c = blockId;
                this.d = i2;
                this.e = blockId2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31);
            }

            public final String toString() {
                return "Reorder(fromIndex=" + this.b + ", fromBlockId=" + this.c + ", toIndex=" + this.d + ", toBlockId=" + this.e + ')';
            }
        }

        /* compiled from: CatalogSectionAction.kt */
        public static final class b implements d {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -752385914;
            }

            public final String toString() {
                return "ReorderFinish";
            }
        }
    }

    /* compiled from: CatalogSectionAction.kt */
    public static final class e implements yda {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1262407321;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    /* compiled from: CatalogSectionAction.kt */
    public static final class f implements yda {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1909735144;
        }

        public final String toString() {
            return "UiContentDrawn";
        }
    }
}
