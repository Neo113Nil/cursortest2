package sg.bigo.ads.bo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.bo.b;

/* loaded from: classes9.dex */
public final class g {
    public static d a;
    public static d b;
    public static sg.bigo.ads.an.g c;

    @NonNull
    public static c<sg.bigo.ads.bt.a> a(@NonNull sg.bigo.ads.bs.c cVar) {
        b.a aVar = new b.a();
        (a() ? b : a).c(cVar, aVar);
        return new c<>(aVar.b, aVar.c);
    }

    public static void a(@NonNull sg.bigo.ads.bs.a aVar, @Nullable b bVar) {
        if (bVar == null) {
            bVar = b.d;
        }
        (a() ? b : a).b(aVar, bVar);
    }

    public static boolean a() {
        sg.bigo.ads.an.g gVar;
        boolean z = Build.VERSION.SDK_INT >= 34 && (gVar = c) != null && gVar.aG();
        if (z) {
            try {
                if (b == null) {
                    b = new sg.bigo.ads.bq.a(c.af(), c);
                    return z;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return z;
    }
}
