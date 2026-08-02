package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ffw0;
import xsna.qd8;
import xsna.rd8;

/* compiled from: BroadcastConfigFeature.kt */
/* loaded from: classes7.dex */
public final class pd8 {
    public final se8 a;
    public final qas b;
    public final te0 c;
    public final eqt d;
    public final io.reactivex.rxjava3.subjects.d<rd8> e = io.reactivex.rxjava3.subjects.d.O0(rd8.c.a);
    public final io.reactivex.rxjava3.core.w f;
    public final io.reactivex.rxjava3.core.w g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final boolean i;

    public pd8(se8 se8Var, qas qasVar, te0 te0Var, eqt eqtVar) {
        this.a = se8Var;
        this.b = qasVar;
        this.c = te0Var;
        this.d = eqtVar;
        asu0 asu0Var = asu0.a;
        this.f = asu0Var.c();
        this.g = asu0Var.d();
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.i = true;
    }

    public final synchronized void a(qd8 qd8Var) {
        if (!this.i) {
            throw new IllegalStateException("Instance is destroyed");
        }
        e(qd8Var);
    }

    public final synchronized void b(rd8 rd8Var) {
        if (this.i) {
            this.e.onNext(rd8Var);
        }
    }

    public final rd8.a c(qvw0 qvw0Var, Collection<? extends qvw0> collection, Collection<dfw0> collection2, String str) {
        Object obj;
        Object obj2;
        Collection<? extends qvw0> collection3 = collection;
        Iterator<T> it = collection3.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((qvw0) obj2) instanceof svw0) {
                break;
            }
        }
        qvw0 qvw0Var2 = (qvw0) obj2;
        Iterator<T> it2 = collection3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((qvw0) next) instanceof rvw0) {
                obj = next;
                break;
            }
        }
        qvw0 qvw0Var3 = (qvw0) obj;
        if (qvw0Var != null) {
            qvw0Var2 = qvw0Var;
        } else if (qvw0Var2 == null) {
            qvw0Var2 = qvw0Var3;
        }
        if (qvw0Var2 == null) {
            throw new IllegalStateException("No possible owners");
        }
        eqt eqtVar = this.d;
        List<ffw0> b = eqtVar.b(qvw0Var2);
        eqtVar.getClass();
        return new rd8.a(qvw0Var, collection, collection2, b, qvw0Var2.getId(), str, eqt.a(qvw0Var2));
    }

    public final synchronized rd8 d() {
        if (!this.i) {
            throw new IllegalStateException("Instance is destroyed");
        }
        return this.e.P0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ea, code lost:
    
        if (r0 == null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(qd8 qd8Var) {
        Object obj;
        boolean z;
        Object obj2;
        if (qd8Var instanceof qd8.d) {
            io.reactivex.rxjava3.disposables.b bVar = this.h;
            bVar.e();
            bVar.b(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(xa4.I(io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.k(Boolean.valueOf(((qd8.d) qd8Var).a)), new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new hd(this, 10), 3)), new com.vk.movika.sdk.base.flow.binding.c(new md8((byte) 0, 0), 6)).q(this.f).m(this.g), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), new cw(new w5(this, 9), 7)), new od8(1, this, pd8.class, "onLoadInitialConfigError", "onLoadInitialConfigError(Ljava/lang/Throwable;)V", 0), new nd8(1, this, pd8.class, "onLoadInitialConfigSuccess", "onLoadInitialConfigSuccess(Lcom/vk/voip/ui/broadcast/features/config/BroadcastConfigFeatureState$Configuration;)V", 0)));
            return;
        }
        boolean z2 = qd8Var instanceof qd8.a;
        qas qasVar = this.b;
        Object obj3 = null;
        if (z2) {
            qd8.a aVar = (qd8.a) qd8Var;
            rd8 d = d();
            if (d instanceof rd8.a) {
                rd8.a aVar2 = (rd8.a) d;
                Iterator<T> it = aVar2.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (epx.f(((qvw0) obj2).getId(), aVar2.e)) {
                            break;
                        }
                    }
                }
                qvw0 qvw0Var = (qvw0) obj2;
                Iterator<T> it2 = aVar2.b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (epx.f(((qvw0) next).getId(), aVar.a)) {
                        obj3 = next;
                        break;
                    }
                }
                qvw0 qvw0Var2 = (qvw0) obj3;
                String a = qasVar.a();
                if (epx.f(qvw0Var, qvw0Var2) || qvw0Var2 == null) {
                    return;
                }
                eqt eqtVar = this.d;
                List<ffw0> b = eqtVar.b(qvw0Var2);
                String id = qvw0Var2.getId();
                if (aVar2.f == null) {
                    a = aVar2.g;
                }
                eqtVar.getClass();
                b(rd8.a.a(aVar2, b, id, null, a, eqt.a(qvw0Var2), false, 263));
                return;
            }
            return;
        }
        if (qd8Var instanceof qd8.c) {
            qd8.c cVar = (qd8.c) qd8Var;
            rd8 d2 = d();
            if (d2 instanceof rd8.a) {
                rd8.a aVar3 = (rd8.a) d2;
                z = aVar3.f == null;
                String str = aVar3.g;
                String str2 = cVar.a;
                if (!z || epx.f(str, str2)) {
                    return;
                }
                b(rd8.a.a(aVar3, null, null, null, str2, null, false, 447));
                return;
            }
            return;
        }
        if (qd8Var instanceof qd8.b) {
            qd8.b bVar2 = (qd8.b) qd8Var;
            rd8 d3 = d();
            if (d3 instanceof rd8.a) {
                rd8.a aVar4 = (rd8.a) d3;
                ffw0 ffw0Var = aVar4.h;
                ffw0 ffw0Var2 = bVar2.a;
                z = aVar4.f == null;
                boolean f = epx.f(ffw0Var, ffw0Var2);
                boolean contains = aVar4.d.contains(ffw0Var2);
                if (z && !f && contains) {
                    b(rd8.a.a(aVar4, null, null, null, null, ffw0Var2, false, 383));
                    return;
                }
                return;
            }
            return;
        }
        if (!(qd8Var instanceof qd8.e)) {
            throw new NoWhenBranchMatchedException();
        }
        qd8.e eVar = (qd8.e) qd8Var;
        rd8 d4 = d();
        if (d4 instanceof rd8.a) {
            String a2 = qasVar.a();
            if (eVar.a == null) {
                rd8.a aVar5 = (rd8.a) d4;
                if (aVar5.f != null) {
                    b(c(aVar5.a, aVar5.b, aVar5.c, a2));
                    return;
                }
                return;
            }
            rd8.a aVar6 = (rd8.a) d4;
            Iterator<T> it3 = aVar6.c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it3.next();
                    if (((dfw0) obj).a.equals(eVar.a)) {
                        break;
                    }
                }
            }
            dfw0 dfw0Var = (dfw0) obj;
            qvw0 qvw0Var3 = aVar6.a;
            if (qvw0Var3 != null) {
                if (!epx.f(qvw0Var3.getId(), dfw0Var != null ? dfw0Var.b : null)) {
                    qvw0Var3 = null;
                }
            }
            Iterator<T> it4 = aVar6.b.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                if (epx.f(((qvw0) next2).getId(), dfw0Var != null ? dfw0Var.b : null)) {
                    obj3 = next2;
                    break;
                }
            }
            qvw0Var3 = (qvw0) obj3;
            if (dfw0Var == null || qvw0Var3 == null) {
                return;
            }
            b(rd8.a.a(aVar6, EmptyList.b, qvw0Var3.getId(), dfw0Var.a, a2, ffw0.a.a, false, 263));
        }
    }
}
