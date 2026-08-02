package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.model.FavoritesCategoryModel$Category;

/* loaded from: classes6.dex */
public final class eip {
    public final FavoritesCategoryModel$Category a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public eip(FavoritesCategoryModel$Category favoritesCategoryModel$Category, String str, Integer num, boolean z) {
        this.a = favoritesCategoryModel$Category;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eip)) {
            return false;
        }
        eip eipVar = (eip) obj;
        return this.a == eipVar.a && jl40.l(this.b, eipVar.b) && jl40.l(this.c, eipVar.c) && this.d == eipVar.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "FavoritesCategoryModel(category=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", isSelected=" + this.d + Extension.C_BRAKE;
    }
}
