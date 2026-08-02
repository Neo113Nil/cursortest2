package defpackage;

import ru.yandex.taxi.logistics.sdk.logger.Logger$Severity;

/* loaded from: classes9.dex */
public final class kst extends bez {
    @Override // defpackage.bez, defpackage.yfz
    public final void a(Logger$Severity logger$Severity, String str, String str2, Throwable th) {
        int i;
        hst hstVar = jst.e;
        int i2 = lst.a[logger$Severity.ordinal()];
        if (i2 != 1) {
            i = 5;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 && i2 != 5) {
                        w511.b();
                        return;
                    }
                    i = 15;
                }
            }
            hstVar.a(i, str, th, str2);
        }
        i = 10;
        hstVar.a(i, str, th, str2);
    }
}
