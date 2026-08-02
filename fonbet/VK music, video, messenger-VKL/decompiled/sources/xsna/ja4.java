package xsna;

import android.os.SystemClock;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AudienceResearchInteractorImpl.kt */
/* loaded from: classes.dex */
public final class ja4 implements ia4 {
    public final ra4 a;
    public final na4 b;

    public ja4(ha4 ha4Var, ra4 ra4Var) {
        this.a = ra4Var;
        this.b = new na4(ha4Var, ra4Var);
    }

    @Override // xsna.ia4
    public final void a(UserId userId, String str) {
        new io.reactivex.rxjava3.internal.operators.completable.v(this.a.a(userId, str), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
    }

    @Override // xsna.ia4
    public final void b(ArrayList arrayList) {
        new io.reactivex.rxjava3.internal.operators.completable.v(d(arrayList), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
    }

    @Override // xsna.ia4
    public final io.reactivex.rxjava3.core.a c(UserId userId, String str) {
        return this.a.a(userId, str);
    }

    @Override // xsna.ia4
    public final io.reactivex.rxjava3.core.a d(List<String> list) {
        io.reactivex.rxjava3.core.x e;
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (String str : list2) {
            ha4 ha4Var = this.b.a;
            ConcurrentHashMap<String, x94> concurrentHashMap = ha4Var.c;
            x94 x94Var = concurrentHashMap.get(str);
            if (x94Var != null) {
                if (!ha4Var.b.containsKey(Long.valueOf(x94Var.c())) && SystemClock.elapsedRealtime() - x94Var.b() >= 1000) {
                    concurrentHashMap.remove(str);
                } else {
                    e = sn.b("Url was previously added to the queue less than 1000 ms ago");
                    arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.p(e.q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.schedulers.a.b())));
                }
            }
            e = ha4Var.a().e(new io.reactivex.rxjava3.internal.operators.single.v(new aa4(0, ha4Var, str)));
            arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.p(e.q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.schedulers.a.b())));
        }
        return new io.reactivex.rxjava3.internal.operators.completable.d(arrayList);
    }

    @Override // xsna.ia4
    public final void e() {
        na4 na4Var = this.b;
        synchronized (na4Var) {
            if (na4Var.c == null) {
                na4Var.c = na4Var.a.a().c(na4Var.a()).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.schedulers.a.b()).subscribe();
            }
        }
    }
}
