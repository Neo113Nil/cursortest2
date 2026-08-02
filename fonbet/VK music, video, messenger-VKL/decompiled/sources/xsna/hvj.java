package xsna;

import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$1;
import com.vk.mvi.binder.coroutines.CoroutineBinderScope$bindTo$job$2;
import java.util.ArrayList;

/* compiled from: CoroutineBinder.kt */
/* loaded from: classes3.dex */
public final class hvj {
    public final hpj a;
    public BinderLifecycleMode b = new gvj();
    public final ArrayList c = new ArrayList();

    public hvj(hpj hpjVar) {
        this.a = hpjVar;
    }

    public static void a(hvj hvjVar, nb9 nb9Var, kotlin.coroutines.d dVar, iyp iypVar) {
        BinderLifecycleMode binderLifecycleMode = hvjVar.b;
        yok0 h = myc0.h(hvjVar.a, null, null, new CoroutineBinderScope$bindTo$job$2(nb9Var, new com.vk.movika.sdk.base.observable.u(5), dVar, binderLifecycleMode, iypVar, null), 3);
        hvjVar.c.add(h);
        com.vk.mvi.binder.b.a(binderLifecycleMode, new pff(h, 12));
    }

    public static void b(hvj hvjVar, ksr ksrVar, kotlin.coroutines.d dVar, ptk0 ptk0Var) {
        BinderLifecycleMode binderLifecycleMode = hvjVar.b;
        yok0 h = myc0.h(hvjVar.a, null, null, new CoroutineBinderScope$bindTo$job$1(ksrVar, new rd1(3), dVar, binderLifecycleMode, ptk0Var, null), 3);
        hvjVar.c.add(h);
        com.vk.mvi.binder.b.a(binderLifecycleMode, new i5f(h, 12));
    }
}
