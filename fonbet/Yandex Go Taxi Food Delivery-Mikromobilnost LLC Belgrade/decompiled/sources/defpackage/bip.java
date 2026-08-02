package defpackage;

import com.yandex.go.address.models.PlaceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bip {
    public final lx4 a;

    public bip(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public static String a(String str, PlaceType placeType) {
        if (placeType == null) {
            return str;
        }
        return g8e.p(str, Extension.DOT_CHAR, placeType == PlaceType.HOME ? "home" : "work");
    }
}
