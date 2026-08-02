package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.os.Build;
import defpackage.ka10;
import defpackage.la10;
import defpackage.p6u;
import defpackage.t60;
import defpackage.tls;
import defpackage.u60;

/* loaded from: classes10.dex */
public abstract class a {
    public static ka10 a(final Context context) {
        int i = Build.VERSION.SDK_INT;
        u60 u60Var = u60.a;
        if (i >= 33) {
            u60Var.a();
        }
        if ((i >= 33 ? u60Var.a() : 0) >= 5) {
            return new la10(p6u.f(context.getSystemService(p6u.o())));
        }
        t60 t60Var = t60.a;
        Object obj = null;
        if (((i == 31 || i == 32) ? t60Var.a() : 0) < 9) {
            return null;
        }
        try {
            obj = new tls() { // from class: androidx.privacysandbox.ads.adservices.measurement.MeasurementManager$Companion$obtain$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    MeasurementManager measurementManager;
                    measurementManager = MeasurementManager.get(context);
                    return new la10(measurementManager);
                }
            }.invoke(context);
        } catch (NoClassDefFoundError unused) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 31 || i2 == 32) {
                t60Var.a();
            }
        }
        return (ka10) obj;
    }
}
