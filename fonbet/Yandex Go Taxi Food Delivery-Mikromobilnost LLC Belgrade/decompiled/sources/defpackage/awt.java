package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.a;
import com.google.android.play.core.review.internal.c;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.h;
import ru.yandex.taxi.vendor_api.google.b;

/* loaded from: classes15.dex */
public final class awt implements z631 {
    public final Activity a;
    public final tst b;
    public final h c;
    public final rs2 d;
    public final jw2 e;

    public awt(Activity activity, tst tstVar, h hVar, rs2 rs2Var, jw2 jw2Var) {
        this.a = activity;
        this.b = tstVar;
        this.c = hVar;
        this.d = rs2Var;
        this.e = jw2Var;
    }

    public final boolean a() {
        return ((b) this.b).b();
    }

    public final Object b(ContinuationImpl continuationImpl) {
        zzw zzwVar;
        jst.e.getClass();
        kol0 kol0Var = new kol0(dvw.b(continuationImpl));
        zvs zvsVar = new zvs(kol0Var, 1);
        Context context = this.a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        a aVar = new a(new faa1(context));
        faa1 faa1Var = aVar.a;
        String str = faa1Var.b;
        gaa1 gaa1Var = faa1.c;
        gaa1Var.a("requestInAppReview (%s)", str);
        c cVar = faa1Var.a;
        if (cVar == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", gaa1.c(gaa1Var.a, "Play Store app is either not installed or not the official version", objArr));
            }
            Locale locale = Locale.getDefault();
            HashMap hashMap = j391.a;
            zzwVar = udq0.o(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !hashMap.containsKey(-1) ? "" : unr0.o((String) hashMap.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) j391.b.get(-1), Extension.C_BRAKE)))));
        } else {
            atx0 atx0Var = new atx0();
            cVar.a().post(new wxa1(cVar, atx0Var, atx0Var, new com.google.android.play.core.review.b(faa1Var, atx0Var, atx0Var)));
            zzwVar = atx0Var.a;
        }
        zzwVar.b(new t26(11, zvsVar, aVar, this));
        Object a = kol0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }
}
