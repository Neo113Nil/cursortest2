package sg.bigo.ads.bi;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class a {
    @Nullable
    public static sg.bigo.ads.an.a a(@NonNull final Context context, long j) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final sg.bigo.ads.an.a[] aVarArr = new sg.bigo.ads.an.a[1];
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        sg.bigo.ads.bh.d.a(0, new Runnable() { // from class: sg.bigo.ads.bi.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Object invoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                    String obj = invoke.getClass().getDeclaredMethod("getId", null).invoke(invoke, null).toString();
                    Boolean bool = (Boolean) invoke.getClass().getDeclaredMethod(X3.j.M, null).invoke(invoke, null);
                    if (obj != null && bool != null) {
                        aVarArr[0] = new sg.bigo.ads.an.a(obj, bool.booleanValue());
                    }
                } catch (Exception unused) {
                    atomicBoolean.set(false);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        if (atomicBoolean.get()) {
            return aVarArr[0];
        }
        throw new b();
    }
}
