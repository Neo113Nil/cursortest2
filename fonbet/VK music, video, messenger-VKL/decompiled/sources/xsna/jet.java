package xsna;

import com.vk.games.model.GamesCatalogScreenTab;

/* compiled from: GamesCatalogState.kt */
/* loaded from: classes17.dex */
public final class jet implements km50 {
    public final tet b;
    public final boolean c;
    public final GamesCatalogScreenTab d;
    public final v7t e;
    public final v7t f;

    public jet() {
        this(0);
    }

    public static jet a(jet jetVar, tet tetVar, boolean z, GamesCatalogScreenTab gamesCatalogScreenTab, v7t v7tVar, v7t v7tVar2, int i) {
        if ((i & 1) != 0) {
            tetVar = jetVar.b;
        }
        tet tetVar2 = tetVar;
        jetVar.getClass();
        if ((i & 4) != 0) {
            z = jetVar.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            gamesCatalogScreenTab = jetVar.d;
        }
        GamesCatalogScreenTab gamesCatalogScreenTab2 = gamesCatalogScreenTab;
        if ((i & 16) != 0) {
            v7tVar = jetVar.e;
        }
        v7t v7tVar3 = v7tVar;
        if ((i & 32) != 0) {
            v7tVar2 = jetVar.f;
        }
        jetVar.getClass();
        return new jet(tetVar2, z2, gamesCatalogScreenTab2, v7tVar3, v7tVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jet)) {
            return false;
        }
        jet jetVar = (jet) obj;
        return epx.f(this.b, jetVar.b) && this.c == jetVar.c && this.d == jetVar.d && epx.f(this.e, jetVar.e) && epx.f(this.f, jetVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(this.b.hashCode() * 961, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "GamesCatalogState(topBarState=" + this.b + ", error=null, hasNotification=" + this.c + ", activeTab=" + this.d + ", catalogPageData=" + this.e + ", categoryPageData=" + this.f + ')';
    }

    public jet(tet tetVar, boolean z, GamesCatalogScreenTab gamesCatalogScreenTab, v7t v7tVar, v7t v7tVar2) {
        this.b = tetVar;
        this.c = z;
        this.d = gamesCatalogScreenTab;
        this.e = v7tVar;
        this.f = v7tVar2;
    }

    public /* synthetic */ jet(int i) {
        this(new tet((String) null, false, false, 15), false, GamesCatalogScreenTab.CATALOG, new v7t(null, null, false, 0, 255), new v7t(null, null, false, 0, 255));
    }
}
