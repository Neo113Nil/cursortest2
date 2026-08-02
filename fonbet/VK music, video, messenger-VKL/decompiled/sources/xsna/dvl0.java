package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.dto.common.id.UserId;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import xsna.egg0;
import xsna.usi0;

/* compiled from: StoriesSessionInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class dvl0 implements bvl0, w8i, rv8 {
    public final mui0 b;
    public final lrl0 c;
    public final uvl0 d;
    public final rul0 e;
    public final evl0 f;
    public final bpn0 g = new bpn0(new x9l0(this, 1));
    public final io.reactivex.rxjava3.subjects.h h = new io.reactivex.rxjava3.subjects.f().M0();
    public StoryEditorExtDepsComponentImpl.c i;

    public dvl0(gx8 gx8Var, mui0 mui0Var, lrl0 lrl0Var, uvl0 uvl0Var, rul0 rul0Var, evl0 evl0Var) {
        this.b = mui0Var;
        this.c = lrl0Var;
        this.d = uvl0Var;
        this.e = rul0Var;
        this.f = evl0Var;
        gx8Var.c(new tv8(this));
    }

    @Override // xsna.rv8
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    @Override // xsna.rv8
    public final void b(boolean z) {
        if (!z) {
            this.d.clear();
            StoryEditorExtDepsComponentImpl.c cVar = this.i;
            if (cVar != null) {
                ArrayList arrayList = cVar.a;
                Iterator it = new egg0(arrayList).iterator();
                while (true) {
                    ListIterator<T> listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    izs izsVar = (izs) listIterator.previous();
                    izsVar.invoke(Boolean.valueOf(z));
                    arrayList.remove(izsVar);
                }
            }
        }
        this.c.clear();
        ((i070) this.g.getValue()).getClass();
        this.e.i(false);
        this.f.clear();
        i4m0.e.a();
        xee.e.a();
    }

    @Override // xsna.bvl0
    public final void c() {
        this.b.f(new ayi0() { // from class: xsna.cvl0
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            
                if (xsna.epx.f(r6, r5) != false) goto L52;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // xsna.ayi0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(uxi0 uxi0Var) {
                boolean z;
                boolean z2;
                dvl0 dvl0Var;
                usi0.a aVar;
                fhq0 c;
                UserId userId;
                usi0.a aVar2;
                fhq0 c2;
                fhq0 c3;
                fhq0 c4;
                fhq0 c5;
                ArrayList E = g5g.E(uxi0Var.a, usi0.a.class);
                ArrayList E2 = g5g.E(uxi0Var.b, usi0.a.class);
                boolean z3 = true;
                UserId userId2 = null;
                if (E.size() - 1 == E2.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = E.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!E2.contains((usi0.a) next)) {
                            arrayList.add(next);
                        }
                    }
                    usi0.a aVar3 = (usi0.a) j5g.a0(arrayList);
                    if (((aVar3 == null || (c5 = aVar3.c()) == null) ? null : c5.a) != null) {
                        z = true;
                        if (E2.size() > E.size()) {
                            usi0.a aVar4 = (usi0.a) j5g.a0(E2);
                            if (((aVar4 == null || (c4 = aVar4.c()) == null) ? null : c4.a) != null) {
                                z2 = true;
                                if (!E.isEmpty() && !E2.isEmpty() && E.size() == E2.size() && !epx.f(E2.get(0), E.get(0))) {
                                    usi0.a aVar5 = (usi0.a) j5g.a0(E2);
                                    UserId userId3 = (aVar5 != null || (c3 = aVar5.c()) == null) ? null : c3.a;
                                    aVar2 = (usi0.a) j5g.a0(E);
                                    if (aVar2 != null && (c2 = aVar2.c()) != null) {
                                        userId2 = c2.a;
                                    }
                                }
                                z3 = false;
                                dvl0Var = dvl0.this;
                                if (!z || z2 || z3) {
                                    lrl0 lrl0Var = dvl0Var.c;
                                    lrl0Var.clear();
                                    lrl0Var.b(new ArrayList(), false);
                                    dvl0Var.d.init();
                                }
                                aVar = (usi0.a) j5g.a0(E2);
                                if (aVar == null || (c = aVar.c()) == null || (userId = c.a) == null) {
                                    return;
                                }
                                dvl0Var.h.onNext(userId);
                                return;
                            }
                        }
                        z2 = false;
                        if (!E.isEmpty()) {
                            usi0.a aVar52 = (usi0.a) j5g.a0(E2);
                            if (aVar52 != null) {
                            }
                            aVar2 = (usi0.a) j5g.a0(E);
                            if (aVar2 != null) {
                                userId2 = c2.a;
                            }
                        }
                        z3 = false;
                        dvl0Var = dvl0.this;
                        if (!z) {
                        }
                        lrl0 lrl0Var2 = dvl0Var.c;
                        lrl0Var2.clear();
                        lrl0Var2.b(new ArrayList(), false);
                        dvl0Var.d.init();
                        aVar = (usi0.a) j5g.a0(E2);
                        if (aVar == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                z = false;
                if (E2.size() > E.size()) {
                }
                z2 = false;
                if (!E.isEmpty()) {
                }
                z3 = false;
                dvl0Var = dvl0.this;
                if (!z) {
                }
                lrl0 lrl0Var22 = dvl0Var.c;
                lrl0Var22.clear();
                lrl0Var22.b(new ArrayList(), false);
                dvl0Var.d.init();
                aVar = (usi0.a) j5g.a0(E2);
                if (aVar == null) {
                }
            }
        });
    }

    @Override // xsna.bvl0
    public final void d(StoryEditorExtDepsComponentImpl.c cVar) {
        this.i = cVar;
    }

    @Override // xsna.rv8
    public final long e() {
        return this.c.l();
    }

    @Override // xsna.rv8
    public final String getDescription() {
        return "StoriesController";
    }
}
