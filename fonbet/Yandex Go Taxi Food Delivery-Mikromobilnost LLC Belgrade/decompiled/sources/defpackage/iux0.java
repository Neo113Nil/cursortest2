package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public class iux0 implements ltc {
    public final String a(String str, String... strArr) {
        ListBuilder a = rcc.a();
        a.add("COMMUNICATIONS_BANNER_ERROR_TOKEN");
        for (String str2 : strArr) {
            a.add(str2);
        }
        a.add(str);
        return a.X(a.j(), ":", null, null, null, 62);
    }

    public final void b(String str, Throwable th) {
        c("Error to start activity with deeplink", th, g8e.o("Error to start activity with deeplink ", str), new String[0]);
    }

    public final void c(String str, Throwable th, String str2, String... strArr) {
        jst.e.g(a(str, (String[]) Arrays.copyOf(strArr, strArr.length)), null, str2, th);
    }

    public final void d(BannerWidgets.ActionType actionType) {
        c("Unknown banner action type", new IllegalStateException(), "Unknown banner action type " + actionType, "WTF");
    }
}
