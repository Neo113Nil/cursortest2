package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.sessionmanagment.api.domain.utils.exceptions.MasterSessionNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.EmptyList;
import xsna.mui0;
import xsna.usi0;

/* compiled from: SessionRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class uui0 implements mui0, sxi0 {
    public final cti0 a;
    public final CopyOnWriteArrayList<ayi0> b = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<ayi0> c = new CopyOnWriteArrayList<>();
    public final bpn0 d = new bpn0(new a68(12));

    public uui0(cti0 cti0Var) {
        this.a = cti0Var;
    }

    public static void m(usi0.a.b bVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof usi0.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((usi0.a) next) instanceof usi0.a.b)) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (bVar.e().b == ((usi0.a) it2.next()).c().b().b) {
                    return;
                }
            }
        }
        throw new MasterSessionNotFoundException(bVar.e());
    }

    public static boolean o(usi0 usi0Var, usi0 usi0Var2) {
        fhq0 c;
        fhq0 c2;
        UserId userId = null;
        usi0.a aVar = usi0Var instanceof usi0.a ? (usi0.a) usi0Var : null;
        UserId b = (aVar == null || (c2 = aVar.c()) == null) ? null : c2.b();
        usi0.a aVar2 = usi0Var2 instanceof usi0.a ? (usi0.a) usi0Var2 : null;
        if (aVar2 != null && (c = aVar2.c()) != null) {
            userId = c.b();
        }
        return epx.f(b, userId) || epx.f(usi0Var.a().e(), usi0Var2.a().e());
    }

    @Override // xsna.mui0
    public final UserId a() {
        fhq0 c;
        UserId b;
        usi0.a i = i();
        return (i == null || (c = i.c()) == null || (b = c.b()) == null) ? UserId.d : b;
    }

    @Override // xsna.mui0
    public final boolean b() {
        return fkq0.c(a());
    }

    @Override // xsna.mui0
    public final void c() {
        final cti0 cti0Var = this.a;
        cti0Var.a.invoke().execute(new Runnable() { // from class: xsna.bti0
            @Override // java.lang.Runnable
            public final void run() {
                cti0 cti0Var2 = cti0.this;
                CountDownLatch countDownLatch = cti0Var2.k;
                try {
                    cti0Var2.e();
                    if (countDownLatch.getCount() == 0) {
                        return;
                    }
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    if (countDownLatch.getCount() != 0) {
                        countDownLatch.countDown();
                    }
                    throw th;
                }
            }
        });
    }

    @Override // xsna.mui0
    public final ArrayList d() {
        return mui0.a.b(this);
    }

    @Override // xsna.mui0
    public final ArrayList e() {
        return mui0.a.a(this);
    }

    @Override // xsna.mui0
    public final void f(ayi0 ayi0Var) {
        if (ayi0Var instanceof fcd0) {
            this.b.add(ayi0Var);
        } else {
            this.c.add(ayi0Var);
        }
    }

    @Override // xsna.mui0
    public final List<usi0> g() {
        return this.a.a();
    }

    @Override // xsna.sxi0
    public final synchronized void h(usi0.a aVar) {
        try {
            String str = "[Sessions] Remove session: " + aVar;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{((p2i0) this.d.getValue()).a(str)});
            }
            List O0 = j5g.O0(this.a.a());
            Iterator it = (((aVar instanceof usi0.a.b) || aVar == null) ? EmptyList.b : n(aVar)).iterator();
            while (it.hasNext()) {
                this.a.c((usi0.a.b) it.next());
            }
            if (this.a.c(aVar)) {
                p(new uxi0(O0, this.a.a()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.mui0
    public final usi0.a i() {
        return (usi0.a) j5g.a0(mui0.a.a(this));
    }

    @Override // xsna.sxi0
    public final synchronized void j(usi0.a aVar, usi0.a aVar2) {
        try {
            String str = "[Sessions] Update Session, from " + aVar + " to " + aVar2;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{((p2i0) this.d.getValue()).a(str)});
            }
            if (aVar2 instanceof usi0.a.b) {
                m((usi0.a.b) aVar2, this.a.a());
            }
            ArrayList arrayList = new ArrayList(this.a.a());
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (o(aVar, (usi0) it.next())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                arrayList.set(i, aVar2);
            } else if (arrayList.contains(aVar2)) {
                return;
            } else {
                arrayList.add(0, aVar2);
            }
            List O0 = j5g.O0(this.a.a());
            this.a.d(arrayList);
            p(new uxi0(O0, arrayList));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.mui0
    public final void k(ayi0 ayi0Var) {
        if (ayi0Var instanceof fcd0) {
            this.b.remove(ayi0Var);
        } else {
            this.c.remove(ayi0Var);
        }
    }

    @Override // xsna.sxi0
    public final synchronized void l(usi0 usi0Var) {
        try {
            String str = "[Sessions] Add session: " + usi0Var + " addToEnd: false";
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{((p2i0) this.d.getValue()).a(str)});
            }
            if (usi0Var instanceof usi0.a.b) {
                m((usi0.a.b) usi0Var, this.a.a());
            }
            List O0 = j5g.O0(this.a.a());
            ArrayList arrayList = new ArrayList(this.a.a());
            Iterator it = O0.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (o((usi0) it.next(), usi0Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                arrayList.remove(i);
            }
            arrayList.add(0, usi0Var);
            this.a.d(arrayList);
            p(new uxi0(O0, arrayList));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList n(usi0.a aVar) {
        List<usi0> a = this.a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (obj instanceof usi0.a.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (aVar.c().b().b == ((usi0.a.b) next).e().b) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public final void p(uxi0 uxi0Var) {
        Iterator<ayi0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(uxi0Var);
        }
        Iterator<ayi0> it2 = this.c.iterator();
        while (it2.hasNext()) {
            it2.next().a(uxi0Var);
        }
    }
}
