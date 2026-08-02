package defpackage;

import com.yandex.go.navigator.favorites.data.FavoritePlaceType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class i4c0 {
    public final FavoritePlaceType a;
    public final ArrayList b;

    public i4c0(FavoritePlaceType favoritePlaceType, ArrayList arrayList) {
        this.a = favoritePlaceType;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4c0)) {
            return false;
        }
        i4c0 i4c0Var = (i4c0) obj;
        return this.a == i4c0Var.a && this.b.equals(i4c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlacemarkVariant(placeType=" + this.a + ", zoomAppearanceList=" + this.b + Extension.C_BRAKE;
    }
}
