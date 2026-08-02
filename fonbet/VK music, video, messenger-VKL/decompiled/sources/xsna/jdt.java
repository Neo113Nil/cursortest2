package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.games.presentation.catalog.model.ListNextState;
import java.util.List;

/* compiled from: GamesCatalogRender.kt */
/* loaded from: classes17.dex */
public interface jdt extends fm50<jet> {

    /* compiled from: GamesCatalogRender.kt */
    public static final class a implements jdt {
        public final yzt0<e> a;
        public final yzt0<Boolean> b;
        public final yzt0<GamesCatalogScreenTab> c;
        public final yzt0<e> d;
        public final yzt0<tet> e;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(catalogViewState=");
            sb.append(this.a);
            sb.append(", hasNotification=");
            sb.append(this.b);
            sb.append(", activeTab=");
            sb.append(this.c);
            sb.append(", categoryViewState=");
            sb.append(this.d);
            sb.append(", topBarState=");
            return tr.c(sb, this.e, ')');
        }
    }

    /* compiled from: GamesCatalogRender.kt */
    public static final class b {
        public final List a;

        public b(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("ContentState(items="), this.a);
        }
    }

    /* compiled from: GamesCatalogRender.kt */
    public static final class c implements jdt {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1391092476;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: GamesCatalogRender.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final kbt c;
        public final ListNextState d;
        public final boolean e;
        public final int f;

        public d(boolean z, boolean z2, kbt kbtVar, ListNextState listNextState, boolean z3, int i) {
            this.a = z;
            this.b = z2;
            this.c = kbtVar;
            this.d = listNextState;
            this.e = z3;
            this.f = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
            kbt kbtVar = this.c;
            int hashCode = (b + (kbtVar == null ? 0 : kbtVar.hashCode())) * 31;
            ListNextState listNextState = this.d;
            return Integer.hashCode(this.f) + qoy.b((hashCode + (listNextState != null ? listNextState.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingStatusState(isLoading=");
            sb.append(this.a);
            sb.append(", isRefreshing=");
            sb.append(this.b);
            sb.append(", errorState=");
            sb.append(this.c);
            sb.append(", nextState=");
            sb.append(this.d);
            sb.append(", hasNext=");
            sb.append(this.e);
            sb.append(", loadedElements=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: GamesCatalogRender.kt */
    public static final class e implements jdt {
        public final d a;
        public final b b;

        public e(d dVar, b bVar) {
            this.a = dVar;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.a.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ViewState(loadingStatus=" + this.a + ", contentState=" + this.b + ')';
        }
    }
}
