package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogScrollPositionsCache.kt */
/* loaded from: classes16.dex */
public interface pda {

    /* compiled from: CatalogScrollPositionsCache.kt */
    public static final class a {
        public final UIBlock a;
        public final btf0 b;

        public a(UIBlock uIBlock, btf0 btf0Var) {
            this.a = uIBlock;
            this.b = btf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Entry(blockState=" + this.a + ", scrollPosition=" + this.b + ')';
        }
    }

    void a(UIBlockList uIBlockList);

    a b(UIBlockList uIBlockList);

    void c(UIBlock uIBlock, btf0 btf0Var);
}
