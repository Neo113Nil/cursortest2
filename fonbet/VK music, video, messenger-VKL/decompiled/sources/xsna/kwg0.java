package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* compiled from: RxUtil.kt */
/* loaded from: classes.dex */
public final class kwg0 {
    public static final /* synthetic */ int a = 0;

    static {
        new Handler(Looper.getMainLooper());
    }

    public static io.reactivex.rxjava3.core.q a(ArrayList arrayList) {
        io.reactivex.rxjava3.core.q r = io.reactivex.rxjava3.core.q.r(arrayList);
        kkl kklVar = new kkl(arrayList, 1);
        as asVar = new as(new r1d(6), 28);
        r.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.w1(r, kklVar, asVar).w();
    }

    public static jwg0 b() {
        return new jwg0("VK");
    }
}
