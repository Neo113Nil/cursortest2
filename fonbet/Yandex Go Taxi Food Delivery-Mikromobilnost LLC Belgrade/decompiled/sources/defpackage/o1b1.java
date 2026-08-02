package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_common.a;
import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public abstract class o1b1 {
    public static j1b1 a;

    public static final boolean a(ScootersComeFrom scootersComeFrom) {
        return scootersComeFrom == ScootersComeFrom.QR;
    }

    public static final void b(ilu iluVar, String str, long j) {
        iluVar.e(str, SystemClock.uptimeMillis() - j, TimeUnit.MILLISECONDS);
    }

    public static synchronized a d() {
        a aVar;
        synchronized (o1b1.class) {
            jxa1 jxa1Var = new jxa1();
            jxa1Var.a = "vision-common";
            jxa1Var.b = true;
            byte b = (byte) (jxa1Var.d | 1);
            jxa1Var.c = 1;
            jxa1Var.d = (byte) (b | 2);
            bya1 a2 = jxa1Var.a();
            synchronized (o1b1.class) {
                try {
                    if (a == null) {
                        a = new j1b1(0);
                    }
                    aVar = (a) a.b(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }
        return aVar;
    }
}
