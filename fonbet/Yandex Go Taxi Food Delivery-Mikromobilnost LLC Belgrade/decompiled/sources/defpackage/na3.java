package defpackage;

import android.os.RemoteException;
import android.view.View;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.i;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.yandex.div.core.expression.variables.d;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class na3 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public na3(j5b1 j5b1Var, qwa1 qwa1Var) {
        this.a = 15;
        this.b = qwa1Var;
        Objects.requireNonNull(j5b1Var);
        this.c = j5b1Var;
    }

    private final void a() {
        synchronized (((o3a1) this.c).c) {
            ((wx60) ((o3a1) this.c).w).onComplete((Task) this.b);
        }
    }

    private final void b() {
        synchronized (((o3a1) this.c).c) {
            iy60 iy60Var = (iy60) ((o3a1) this.c).w;
            Exception j = ((Task) this.b).j();
            cvw.l(j);
            iy60Var.onFailure(j);
        }
    }

    private final void c() {
        synchronized (((o3a1) this.c).c) {
            ((t070) ((o3a1) this.c).w).onSuccess(((Task) this.b).k());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map e0;
        rvo rvoVar;
        switch (this.a) {
            case 0:
                oa3 oa3Var = (oa3) this.c;
                c cVar = oa3Var.x;
                if (cVar.g == oa3Var.c) {
                    List list = oa3Var.b;
                    i iVar = (i) this.b;
                    Runnable runnable = oa3Var.w;
                    List list2 = cVar.f;
                    cVar.e = list;
                    cVar.f = Collections.unmodifiableList(list);
                    iVar.a(cVar.a);
                    cVar.a(list2, runnable);
                    return;
                }
                return;
            case 1:
                final bw5 a = ((a) this.b).b.a();
                try {
                    a aVar = (a) this.b;
                    try {
                        aVar.d = true;
                        com.yandex.div.core.view2.i G = ((Div2View) this.c).getDiv2Component().G();
                        synchronized (((Div2View) this.c).viewToDivBindings) {
                            e0 = tje.e0(((Div2View) this.c).viewToDivBindings);
                        }
                        for (Map.Entry entry : e0.entrySet()) {
                            View view = (View) entry.getKey();
                            m3k m3kVar = (m3k) entry.getValue();
                            aw5 v = com.yandex.div.core.view2.divs.a.v(view);
                            if (v != null && (rvoVar = v.b) != null) {
                                boolean isAttachedToWindow = view.isAttachedToWindow();
                                Div2View div2View = (Div2View) this.c;
                                if (isAttachedToWindow) {
                                    com.yandex.div.core.view2.i.l(G, div2View, rvoVar, view, m3kVar);
                                } else {
                                    com.yandex.div.core.view2.i.l(G, div2View, rvoVar, null, m3kVar);
                                }
                            }
                        }
                        zy11 zy11Var = zy11.a;
                        List J0 = kotlin.collections.a.J0(aVar.e);
                        aVar.e.clear();
                        Pair pair = new Pair(zy11Var, J0);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list3 = (List) pair.getSecond();
                        if (list3.isEmpty()) {
                            cw5.b(a);
                            return;
                        }
                        ngd0 ngd0Var = ngd0.G;
                        final a aVar2 = (a) this.b;
                        ngd0Var.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$trackChildrenVisibility$$inlined$runWithinBindingContext$1$1
                            final /* synthetic */ tls $onComplete = null;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                com.yandex.div.core.util.binding.a.this.b.d();
                                try {
                                    Iterator it = list3.iterator();
                                    while (it.hasNext()) {
                                        ((sls) it.next()).invoke();
                                    }
                                    tls tlsVar = this.$onComplete;
                                    if (tlsVar != null) {
                                        tlsVar.invoke(first);
                                    }
                                    cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    return zy11.a;
                                } catch (Throwable th) {
                                    cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                    cw5.b(a);
                                    throw th;
                                }
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        aVar.d = false;
                        throw th;
                    }
                } catch (Throwable th2) {
                    cw5.b(a);
                    throw th2;
                }
            case 2:
                com.yandex.div.core.expression.variables.a aVar3 = (com.yandex.div.core.expression.variables.a) this.b;
                c231[] c231VarArr = (c231[]) this.c;
                com.yandex.div.core.expression.variables.a.a(aVar3, (c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                return;
            case 3:
                dvw.b((Continuation) this.b).resumeWith(new Result.Failure((Throwable) this.c));
                return;
            case 4:
                break;
            case 5:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((dsq0) this.b).x) {
                        ((dsq0) this.b).a();
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (((dsq0) this.b).x) {
                        ((dsq0) this.b).a();
                        throw th3;
                    }
                }
            case 6:
                c231 c231Var = (c231) this.c;
                d dVar = (d) this.b;
                Iterator it = kotlin.collections.a.J0(dVar.A.values()).iterator();
                while (it.hasNext()) {
                    ((tls) it.next()).invoke(c231Var);
                }
                br60 br60Var = (br60) dVar.y.get(c231Var.c());
                if (br60Var != null) {
                    Iterator it2 = br60Var.iterator();
                    while (it2.hasNext()) {
                        ((tls) it2.next()).invoke(c231Var);
                    }
                    return;
                }
                return;
            case 7:
                tha1 tha1Var = (tha1) this.b;
                tha1Var.Q2();
                if (rms.k()) {
                    tha1Var.M1().Pg(this);
                    return;
                }
                u791 u791Var = (u791) this.c;
                r2 = u791Var.c != 0 ? 1 : 0;
                u791Var.c = 0L;
                if (r2 != 0) {
                    u791Var.a();
                    return;
                }
                return;
            case 8:
                Task task = (Task) this.b;
                boolean m = task.m();
                ch91 ch91Var = (ch91) this.c;
                zzw zzwVar = ch91Var.w;
                if (m) {
                    zzwVar.t();
                    return;
                }
                try {
                    zzwVar.s(ch91Var.c.h(task));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        zzwVar.r((Exception) e.getCause());
                        return;
                    } else {
                        zzwVar.r(e);
                        return;
                    }
                } catch (Exception e2) {
                    zzwVar.r(e2);
                    return;
                }
            case 9:
                ch91 ch91Var2 = (ch91) this.c;
                zzw zzwVar2 = ch91Var2.w;
                try {
                    Task task2 = (Task) ch91Var2.c.h((Task) this.b);
                    if (task2 == null) {
                        zzwVar2.r(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ykj ykjVar = dtx0.b;
                    task2.g(ykjVar, ch91Var2);
                    task2.e(ykjVar, ch91Var2);
                    task2.a(ykjVar, ch91Var2);
                    return;
                } catch (RuntimeExecutionException e3) {
                    if (e3.getCause() instanceof Exception) {
                        zzwVar2.r((Exception) e3.getCause());
                        return;
                    } else {
                        zzwVar2.r(e3);
                        return;
                    }
                } catch (Exception e4) {
                    zzwVar2.r(e4);
                    return;
                }
            case 10:
                a();
                return;
            case 11:
                zzjd zzjdVar = (zzjd) this.c;
                zzjdVar.zzL().w();
                zzjdVar.zzL().S((zzr) this.b);
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case 14:
                j5b1 j5b1Var = (j5b1) this.c;
                zzgb zzgbVar = j5b1Var.x;
                g gVar = (g) j5b1Var.b;
                if (zzgbVar == null) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    zzr zzrVar = (zzr) this.b;
                    j691 j691Var = gVar.w;
                    gw91 gw91Var = nw91.b1;
                    if (j691Var.Qg(null, gw91Var)) {
                        j5b1Var.Yg(zzgbVar, null, zzrVar);
                    }
                    zzgbVar.zzg(zzrVar);
                    gVar.i().Lg();
                    gVar.w.Qg(null, gw91Var);
                    j5b1Var.Yg(zzgbVar, null, zzrVar);
                    j5b1Var.Tg();
                    return;
                } catch (RemoteException e5) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.b(e5, "Failed to send app launch to the service");
                    return;
                }
            case 15:
                j5b1 j5b1Var2 = (j5b1) this.c;
                zzgb zzgbVar2 = j5b1Var2.x;
                g gVar2 = (g) j5b1Var2.b;
                if (zzgbVar2 == null) {
                    y1a1 y1a1Var3 = gVar2.y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.a("Failed to send current screen to service");
                    return;
                }
                try {
                    qwa1 qwa1Var = (qwa1) this.b;
                    if (qwa1Var == null) {
                        zzgbVar2.zzl(0L, null, null, gVar2.a.getPackageName());
                    } else {
                        zzgbVar2.zzl(qwa1Var.c, qwa1Var.a, qwa1Var.b, gVar2.a.getPackageName());
                    }
                    j5b1Var2.Tg();
                    return;
                } catch (RemoteException e6) {
                    y1a1 y1a1Var4 = gVar2.y;
                    g.g(y1a1Var4);
                    y1a1Var4.z.b(e6, "Failed to send current screen to the service");
                    return;
                }
            case 16:
                o3a1 o3a1Var = (o3a1) this.c;
                zzw zzwVar3 = (zzw) o3a1Var.w;
                try {
                    Task g = ((h3v0) o3a1Var.c).g(((Task) this.b).k());
                    if (g == null) {
                        zzwVar3.r(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ykj ykjVar2 = dtx0.b;
                    g.g(ykjVar2, o3a1Var);
                    g.e(ykjVar2, o3a1Var);
                    g.a(ykjVar2, o3a1Var);
                    return;
                } catch (RuntimeExecutionException e7) {
                    if (e7.getCause() instanceof Exception) {
                        o3a1Var.onFailure((Exception) e7.getCause());
                        return;
                    } else {
                        zzwVar3.r(e7);
                        return;
                    }
                } catch (CancellationException unused) {
                    o3a1Var.onCanceled();
                    return;
                } catch (Exception e8) {
                    zzwVar3.r(e8);
                    return;
                }
            default:
                zzw zzwVar4 = (zzw) this.b;
                try {
                    zzwVar4.s(((Callable) this.c).call());
                    return;
                } catch (Exception e9) {
                    zzwVar4.r(e9);
                    return;
                } catch (Throwable th4) {
                    zzwVar4.r(new RuntimeException(th4));
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th5) {
                d6z.I(EmptyCoroutineContext.a, th5);
            }
            Runnable R = ((sfy) this.c).R();
            if (R == null) {
                return;
            }
            try {
                this.b = R;
                r2++;
                if (r2 >= 16) {
                    sfy sfyVar = (sfy) this.c;
                    if (bvf0.R(sfyVar.c, sfyVar)) {
                        sfy sfyVar2 = (sfy) this.c;
                        bvf0.Q(sfyVar2, sfyVar2.c, this);
                        return;
                    }
                }
            } catch (Throwable th6) {
                sfy sfyVar3 = (sfy) this.c;
                synchronized (sfyVar3.y) {
                    sfy.z.decrementAndGet(sfyVar3);
                    throw th6;
                }
            }
        }
    }

    public /* synthetic */ na3(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ na3(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
