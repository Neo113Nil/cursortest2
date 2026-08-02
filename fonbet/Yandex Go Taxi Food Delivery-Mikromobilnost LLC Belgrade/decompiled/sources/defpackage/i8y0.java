package defpackage;

import kotlin.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes6.dex */
public final class i8y0 {
    public final i3y a = a.a(new oew0(13, this));

    public static void a(Throwable th, String str) {
        String concat = "PANORAMA_ERROR_TOKEN_V1:".concat(str);
        if (th instanceof GoApiOtherException) {
            th = ((GoApiOtherException) th).getOriginal();
        }
        jst.e.g("PANORAMA_ERROR_TOKEN_V1", "PanoramaLoggerTag", concat, th);
    }
}
