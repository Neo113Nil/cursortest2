package xsna;

import android.content.Context;
import com.vk.contacts.c;
import com.vk.contacts.e;
import com.vk.permission.PermissionHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ContactManagerTask.kt */
/* loaded from: classes11.dex */
public final class b9j implements gzs<s3q0> {
    public final Object b;
    public final Object c;

    public b9j(Lazy<? extends mp> lazy, Lazy<? extends b25> lazy2) {
        this.b = lazy;
        this.c = lazy2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        apv0 apv0Var = new apv0(this.b, (b25) this.c.getValue());
        com.vk.im.engine.external.a aVar = new com.vk.im.engine.external.a(this.c, msy.a(LazyThreadSafetyMode.NONE, new q03(3)));
        asu0.a.getClass();
        ExecutorService executorService = (ExecutorService) asu0.e0.getValue();
        Context context = e43.a;
        b25 b25Var = null;
        Context context2 = context != null ? context : null;
        w12 w12Var = new w12(aVar, apv0Var, executorService, context2);
        com.vk.contacts.b.a = w12Var;
        com.vk.contacts.e eVar = com.vk.contacts.e.b;
        new r03(1);
        bay bayVar = new bay();
        PermissionHelper.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 r = PermissionHelper.r(PermissionHelper.y);
        ScheduledExecutorService o = asu0.o();
        b25 a = o25.a();
        a68 a68Var = new a68(3);
        synchronized (eVar) {
            if (!com.vk.contacts.e.n) {
                com.vk.contacts.e.m = w12Var;
                com.vk.contacts.c cVar = com.vk.contacts.c.b;
                cVar.c(new c.a(context2, a, bayVar, apv0Var, executorService, o, a68Var));
                com.vk.contacts.e.k = cVar;
                com.vk.contacts.e.j = context2;
                com.vk.contacts.e.l = a;
                kaj kajVar = new kaj(r, o);
                kajVar.b.execute(new eaj(kajVar, 0));
                com.vk.contacts.c cVar2 = com.vk.contacts.e.k;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = cVar2.a().b0(yqw.class).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                bpn0 bpn0Var = com.vk.contacts.e.g;
                a0.subscribe((e.d) bpn0Var.getValue());
                r.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe((e.d) bpn0Var.getValue());
                b25 b25Var2 = com.vk.contacts.e.l;
                if (b25Var2 != null) {
                    b25Var = b25Var2;
                }
                b25Var.b0((e.a) com.vk.contacts.e.d.getValue());
                com.vk.contacts.e.a();
                wvv wvvVar = wvv.a;
                wvv.b(wvvVar, (e.c) com.vk.contacts.e.e.getValue(), 0L, 10000L, 8);
                wvv.b(wvvVar, new gej(0), 0L, 0L, 14);
                com.vk.contacts.e.n = true;
            }
        }
        return s3q0.a;
    }
}
