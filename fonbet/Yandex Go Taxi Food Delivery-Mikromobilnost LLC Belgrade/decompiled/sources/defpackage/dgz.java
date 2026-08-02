package defpackage;

import android.util.Log;
import ru.yandex.taxi.logistics.sdk.logger.Logger$Severity;

/* loaded from: classes9.dex */
public final class dgz implements yfz {
    @Override // defpackage.yfz
    public final void a(Logger$Severity logger$Severity, String str, String str2, Throwable th) {
        int i = cgz.a[logger$Severity.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Log.i(str, str2, th);
                return;
            }
            if (i == 3 || i == 4) {
                return;
            }
            if (i == 5) {
                Log.e(str, str2, th);
            } else {
                w511.b();
            }
        }
    }
}
