package xsna;

import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: CatalogSectionViewState.kt */
/* loaded from: classes16.dex */
public interface sga extends lm50 {

    /* compiled from: CatalogSectionViewState.kt */
    public static final class a implements sga {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final List<ttk0<r2a>> e;
        public final xvy f;
        public final boolean g;
        public final e h;
        public final ScrollScreenType i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, boolean z2, boolean z3, List<? extends ttk0<? extends r2a>> list, xvy xvyVar, boolean z4, e eVar, ScrollScreenType scrollScreenType) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = list;
            this.f = xvyVar;
            this.g = z4;
            this.h = eVar;
            this.i = scrollScreenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && epx.f(this.h, aVar.h) && this.i == aVar.i;
        }

        public final int hashCode() {
            int b = qoy.b((this.f.hashCode() + fw3.a(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
            e eVar = this.h;
            int hashCode = (b + (eVar == null ? 0 : eVar.hashCode())) * 31;
            ScrollScreenType scrollScreenType = this.i;
            return hashCode + (scrollScreenType != null ? scrollScreenType.hashCode() : 0);
        }

        public final String toString() {
            return "Content(isPTREnabled=" + this.b + ", isRefreshing=" + this.c + ", isReorderEnabled=" + this.d + ", blockList=" + this.e + ", lazyListState=" + this.f + ", isNearEndTriggerEnabled=" + this.g + ", nextSectionState=" + this.h + ", scrollScreenType=" + this.i + ')';
        }
    }

    /* compiled from: CatalogSectionViewState.kt */
    public static final class b implements sga {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final ArrayList e;
        public final dsy f;
        public final boolean g;
        public final e h;
        public final ScrollScreenType i;

        public b(boolean z, boolean z2, boolean z3, ArrayList arrayList, dsy dsyVar, boolean z4, e eVar, ScrollScreenType scrollScreenType) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = arrayList;
            this.f = dsyVar;
            this.g = z4;
            this.h = eVar;
            this.i = scrollScreenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.g == bVar.g && epx.f(this.h, bVar.h) && this.i == bVar.i;
        }

        public final int hashCode() {
            int b = qoy.b((this.f.hashCode() + qr.a(this.e, qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31)) * 31, 31, this.g);
            e eVar = this.h;
            int hashCode = (b + (eVar == null ? 0 : eVar.hashCode())) * 31;
            ScrollScreenType scrollScreenType = this.i;
            return hashCode + (scrollScreenType != null ? scrollScreenType.hashCode() : 0);
        }

        public final String toString() {
            return "ContentGrid(isPTREnabled=" + this.b + ", isRefreshing=" + this.c + ", isReorderEnabled=" + this.d + ", blockList=" + this.e + ", lazyGridState=" + this.f + ", isNearEndTriggerEnabled=" + this.g + ", nextSectionState=" + this.h + ", scrollScreenType=" + this.i + ')';
        }
    }

    /* compiled from: CatalogSectionViewState.kt */
    public static final class c implements sga, e {
        public final tlo0 b;
        public final tlo0.f c;

        public c(tlo0.f fVar, tlo0 tlo0Var) {
            this.b = tlo0Var;
            this.c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return Integer.hashCode(this.c.a) + (this.b.hashCode() * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(title=");
            sb.append(this.b);
            sb.append(", description=null, buttonText=");
            return pr.b(sb, this.c, ')');
        }
    }

    /* compiled from: CatalogSectionViewState.kt */
    public static final class d implements sga, e {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1008390213;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CatalogSectionViewState.kt */
    public interface e {
    }
}
