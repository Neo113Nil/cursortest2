package xsna;

import com.vk.core.store.entity.models.StoriesEventsStack;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: StoriesPreviewEventsCache.kt */
/* loaded from: classes6.dex */
public final class cul0 implements w8i {
    public static final cul0 b = new cul0();
    public static final ArrayList c = new ArrayList();
    public static final bpn0 d = new bpn0(new kk1(27));
    public static final io.reactivex.rxjava3.subjects.f<StoriesEventsStack> e;

    static {
        io.reactivex.rxjava3.subjects.f<StoriesEventsStack> fVar = new io.reactivex.rxjava3.subjects.f<>();
        io.reactivex.rxjava3.subjects.h M0 = fVar.M0();
        w250 w250Var = new w250(new z410(24), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = M0.E(w250Var, lVar, kVar, kVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new io.reactivex.rxjava3.internal.operators.observable.t2(E, 1000L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true);
        itg0.j(new io.reactivex.rxjava3.internal.operators.observable.l0(fVar, new hl30(new pyz(29), 12)), null, 3);
        e = fVar;
    }
}
