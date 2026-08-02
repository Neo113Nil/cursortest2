package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PromotedStickersRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class r6e0 {
    public final ArrayList a = new ArrayList();

    public static i6e0 b() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        return StickersDatabase.a.b().D();
    }

    public final void a() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl clearMemoryCache"});
        }
        synchronized (this.a) {
            this.a.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final io.reactivex.rxjava3.core.q c(ArrayList arrayList) {
        io.reactivex.rxjava3.internal.operators.observable.l2 r0;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl getPromotedStickersObservable ids[" + arrayList.size() + "]=" + arrayList});
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (this.a.contains(Integer.valueOf(intValue))) {
                arrayList2.add(Integer.valueOf(intValue));
            } else {
                arrayList3.add(Integer.valueOf(intValue));
            }
        }
        final long currentTimeMillis = System.currentTimeMillis();
        L l2 = L.a;
        l2.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l2, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl getStickersFromDbObservable ids[" + arrayList2.size() + "]=" + arrayList2});
        }
        if (arrayList2.isEmpty()) {
            r0 = null;
        } else {
            int size = arrayList2.size();
            final ArrayList arrayList4 = arrayList2;
            if (size > 999) {
                arrayList4 = arrayList2.subList(0, 999);
            }
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            asu0.n().execute(new Runnable() { // from class: xsna.n6e0
                @Override // java.lang.Runnable
                public final void run() {
                    j5g.V0(arrayList4, 500, 500, true, new izs(currentTimeMillis, this) { // from class: xsna.m6e0
                        public final /* synthetic */ long b;

                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            r6e0.b().e(this.b, (List) obj);
                            return s3q0.a;
                        }
                    });
                }
            });
            r0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new gb0(this, arrayList4)).r0(asu0Var.c());
        }
        if (!L.m(loggerOutputTarget)) {
            L.u(l2, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl getStickersFromApiObservable ids[" + arrayList3.size() + "]=" + arrayList3});
        }
        io.reactivex.rxjava3.core.q L = arrayList3.isEmpty() ? null : rsg0.T(yfb.x(new zq70().H(null, arrayList3))).L(new r2v(new o6e0(currentTimeMillis, this), 13), false);
        if (r0 != null && L != null) {
            return io.reactivex.rxjava3.core.q.I0(r0, L, new qw80(new zpb((byte) 0, 7), 4));
        }
        if (r0 != null) {
            return r0;
        }
        if (L == null) {
            return null;
        }
        return L;
    }

    public final void d() {
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"PromotedStickersRepositoryImpl init"});
        }
        if (this.a.isEmpty()) {
            int count = b().count();
            if (count / 18000 > 1.5f) {
                l.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder b = ji.b(count, "PromotedStickersRepositoryImpl delete old stickers (itemsCount=", ", itemsToDeleteCount=");
                    b.append(count - 18000);
                    b.append(')');
                    L.u(l, logType, new Object[]{b.toString()});
                }
                j5g.V0(b().d(count - 18000), 999, 999, true, new p6e0(this, 0));
            }
            synchronized (this.a) {
                this.a.clear();
                this.a.addAll(b().getIds());
            }
        }
    }
}
