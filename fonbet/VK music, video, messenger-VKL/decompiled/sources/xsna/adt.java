package xsna;

import com.vk.games.model.GamesCatalogSection;
import java.util.List;

/* compiled from: GamesCatalogPage.kt */
/* loaded from: classes17.dex */
public final class adt {
    public final tct a;
    public final i9t b;
    public final List<GamesCatalogSection> c;
    public final int d;
    public final int e;
    public final boolean f;
    public final zbt g;

    /* JADX WARN: Multi-variable type inference failed */
    public adt(tct tctVar, i9t i9tVar, List<? extends GamesCatalogSection> list, int i, int i2, boolean z, zbt zbtVar) {
        this.a = tctVar;
        this.b = i9tVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = zbtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adt)) {
            return false;
        }
        adt adtVar = (adt) obj;
        return epx.f(this.a, adtVar.a) && epx.f(this.b, adtVar.b) && epx.f(this.c, adtVar.c) && this.d == adtVar.d && this.e == adtVar.e && this.f == adtVar.f && epx.f(this.g, adtVar.g);
    }

    public final int hashCode() {
        tct tctVar = this.a;
        int hashCode = (tctVar == null ? 0 : tctVar.hashCode()) * 31;
        i9t i9tVar = this.b;
        int b = qoy.b(shy.a(this.e, shy.a(this.d, fw3.a((hashCode + (i9tVar == null ? 0 : i9tVar.hashCode())) * 31, 31, this.c), 31), 31), 31, this.f);
        zbt zbtVar = this.g;
        return b + (zbtVar != null ? zbtVar.hashCode() : 0);
    }

    public final String toString() {
        return "GamesCatalogPage(pwaModalBottomSheet=" + this.a + ", achievementsModalBottomSheet=" + this.b + ", sections=" + this.c + ", allCount=" + this.d + ", loaded=" + this.e + ", hasNotifications=" + this.f + ", giftIcon=" + this.g + ')';
    }
}
