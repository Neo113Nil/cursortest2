package defpackage;

import android.os.Build;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.plus.pay.ui.core.mobile.haptic.HapticType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes11.dex */
public abstract class ph91 {
    public static final zkj a = new zkj(4);
    public static final zkj b = new zkj(5);

    public static final void a(hlj hljVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1803206986);
        int i2 = (btsVar.k(hljVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new bmh(27, tlsVar, hljVar);
                btsVar.o0(Q);
            }
            ydb1.a(q791.b(c530.a, null, null, false, null, new awk0(0), (sls) Q, 12), null, wwg.S(-624837605, true, new ota(17, hljVar), btsVar), null, na01.a, null, SlotSize.L, false, btsVar, 1573248, MSException.ERROR_BUSY);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mjf(hljVar, tlsVar, i, 19);
        }
    }

    public static void b(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            ny61.j(e);
        }
    }

    public static final void c(View view, HapticType hapticType) {
        int i;
        int i2 = nq31.a[hapticType.ordinal()];
        if (i2 == 1) {
            i = Build.VERSION.SDK_INT >= 30 ? 16 : 6;
        } else if (i2 != 2) {
            i = 3;
            if (i2 != 3) {
                w511.b();
                return;
            }
        } else {
            i = Build.VERSION.SDK_INT >= 30 ? 17 : 0;
        }
        view.performHapticFeedback(i);
    }

    public static final void d(c cVar, yjv0 yjv0Var, View view) {
        if (cVar.a(yjv0Var)) {
            OneShotPreDrawListener.add(view, new lz(19, view, cVar, yjv0Var));
        }
    }
}
