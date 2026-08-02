package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.presentation.catalog.model.ListNextState;
import java.util.List;

/* compiled from: GamesCatalogDetailRender.kt */
/* loaded from: classes17.dex */
public interface bbt extends fm50<hbt> {

    /* compiled from: GamesCatalogDetailRender.kt */
    public static final class a implements bbt {
        public final yzt0<d> a;
        public final yzt0<b> b;
        public final yzt0<String> c;
        public final yzt0<GamesHeaderSectionInfo> d;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(loadingStatus=");
            sb.append(this.a);
            sb.append(", contentState=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", headerContent=");
            return tr.c(sb, this.d, ')');
        }
    }

    /* compiled from: GamesCatalogDetailRender.kt */
    public static final class b {
        public final boolean a;
        public final List b;

        public b(boolean z, List list) {
            this.a = z;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentState(hasNext=");
            sb.append(this.a);
            sb.append(", items=");
            return jr.a(')', sb, this.b);
        }
    }

    /* compiled from: GamesCatalogDetailRender.kt */
    public static final class c implements bbt {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1205369211;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: GamesCatalogDetailRender.kt */
    public static final class d {
        public final boolean a;
        public final kbt b;
        public final boolean c;
        public final int d;
        public final ListNextState e;

        public d(boolean z, kbt kbtVar, boolean z2, int i, ListNextState listNextState) {
            this.a = z;
            this.b = kbtVar;
            this.c = z2;
            this.d = i;
            this.e = listNextState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            kbt kbtVar = this.b;
            int a = shy.a(this.d, qoy.b((hashCode + (kbtVar == null ? 0 : kbtVar.hashCode())) * 31, 31, this.c), 31);
            ListNextState listNextState = this.e;
            return a + (listNextState != null ? listNextState.hashCode() : 0);
        }

        public final String toString() {
            return "LoadingStatusState(isLoading=" + this.a + ", errorState=" + this.b + ", hasNext=" + this.c + ", loadedElements=" + this.d + ", nextState=" + this.e + ')';
        }
    }
}
