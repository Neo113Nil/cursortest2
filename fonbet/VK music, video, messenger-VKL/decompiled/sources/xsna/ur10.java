package xsna;

import android.content.Context;
import android.net.Uri;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MediaLoadingRepository.kt */
/* loaded from: classes4.dex */
public final class ur10 {
    public final Object a;
    public final Object b;

    public ur10() {
        d14 d14Var = new d14(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, d14Var);
        this.b = msy.a(lazyThreadSafetyMode, new d2(21));
    }

    public static io.reactivex.rxjava3.internal.operators.maybe.u a(Uri uri) {
        bpn0 bpn0Var = iz10.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        io.reactivex.rxjava3.internal.operators.maybe.p pVar = new io.reactivex.rxjava3.internal.operators.maybe.p(new sz10(iz10.a(context), uri));
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.maybe.u(pVar.n(asu0Var.c()).k(asu0Var.d()), new np1(new c4r(14), 27));
    }
}
