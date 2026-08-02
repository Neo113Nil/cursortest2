package xsna;

import kotlin.Result;
import org.json.JSONObject;

/* compiled from: MaxAdBannerConfigParser.kt */
/* loaded from: classes2.dex */
public final class zn10 {
    public static final zn10 a = new zn10();

    public static yn10 a(String str) {
        Object failure;
        try {
            failure = drm0.N(str) ? new yn10(true, null) : new yn10(true, f370.A("pixel_url", new JSONObject(str)));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            bVar.a(a2);
        }
        if (Result.a(failure) != null) {
            failure = yn10.c;
        }
        return (yn10) failure;
    }
}
