package sg.bigo.ads.bi;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class d {
    private final Context a;
    private final long b;

    private d(Context context, long j) {
        this.a = context;
        this.b = j;
    }

    @Nullable
    private synchronized sg.bigo.ads.an.a a() {
        f a;
        e a2 = a(this.a);
        if (a2 == null) {
            throw new b();
        }
        a = a2.a(this.b, TimeUnit.MILLISECONDS);
        if (a == null) {
            a2.a();
            throw new b();
        }
        return new sg.bigo.ads.an.a(a.a(), a.b());
    }

    @Nullable
    public static sg.bigo.ads.an.a a(Context context, long j) {
        try {
            return new d(context, j).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private static e a(Context context) {
        boolean bindService;
        e a = e.a(context);
        if (a.a.isEmpty()) {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            try {
                a.b = true;
                bindService = context.bindService(intent, a, 1);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.a();
                throw th;
            }
            if (!bindService) {
                if (bindService) {
                    return null;
                }
                a.a();
                return null;
            }
            if (!bindService) {
                a.a();
            }
        }
        return a;
    }
}
