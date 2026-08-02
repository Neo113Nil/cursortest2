package defpackage;

import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes9.dex */
public final class nip {
    public static void a(Throwable th, String str) {
        String concat = "FAVORITES_ERROR_TOKEN_V1:".concat(str);
        if (th instanceof GoApiOtherException) {
            th = ((GoApiOtherException) th).getOriginal();
        }
        jst.e.g("FAVORITES_ERROR_TOKEN_V1", "FavoritesLoggerTag", concat, th);
    }
}
