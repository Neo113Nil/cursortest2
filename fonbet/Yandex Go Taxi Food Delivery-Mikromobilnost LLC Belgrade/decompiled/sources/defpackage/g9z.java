package defpackage;

import kotlin.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes9.dex */
public final class g9z {
    public final i3y a = a.a(new ppr(25, this));

    public static void a(Throwable th, String str) {
        String concat = "LOCATION_POLLING_ERROR_TOKEN_V2:".concat(str);
        if (th instanceof GoApiOtherException) {
            th = ((GoApiOtherException) th).getOriginal();
        }
        jst.e.g("LOCATION_POLLING_ERROR_TOKEN_V2", "locationPollingLoggerTag", concat, th);
    }
}
