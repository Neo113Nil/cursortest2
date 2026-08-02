package defpackage;

import kotlin.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes9.dex */
public final class ccz {
    public final i3y a = a.a(new ppr(27, this));

    public static void a(Throwable th, String str) {
        String concat = "LOCATION_PROVIDER_ERROR_TOKEN_V2:".concat(str);
        if (th instanceof GoApiOtherException) {
            th = ((GoApiOtherException) th).getOriginal();
        }
        jst.e.g("LOCATION_PROVIDER_ERROR_TOKEN_V2", "locationProviderLoggerTag", concat, th);
    }
}
