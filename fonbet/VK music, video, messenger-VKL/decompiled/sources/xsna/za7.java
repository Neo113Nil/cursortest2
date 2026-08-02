package xsna;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.db7;
import xsna.ntf0;
import xsna.of90;
import xsna.p4g;
import xsna.ta7;

/* compiled from: BirthdaysListReducer.kt */
/* loaded from: classes15.dex */
public final class za7 extends dm50<kb7, ta7, db7> {
    public final oa7 d;

    public za7() {
        super(db7.d.b);
        this.d = new oa7();
    }

    @Override // xsna.dm50
    public final db7 c(db7 db7Var, ta7 ta7Var) {
        db7 db7Var2 = db7Var;
        ta7 ta7Var2 = ta7Var;
        if (!(ta7Var2 instanceof ta7.b)) {
            if (ta7Var2 instanceof ta7.c) {
                ta7.c cVar = (ta7.c) ta7Var2;
                if (db7Var2 instanceof db7.a) {
                    if (cVar instanceof ta7.c.C3734c) {
                        return db7.a.a((db7.a) db7Var2, null, ntf0.b.a, null, 5);
                    }
                    if (!(cVar instanceof ta7.c.b)) {
                        if (cVar instanceof ta7.c.a) {
                            return db7.a.a((db7.a) db7Var2, null, ntf0.a.a, null, 5);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    la7 la7Var = ((ta7.c.b) cVar).b;
                    if (!la7Var.a.isEmpty()) {
                        return new db7.a(la7Var, ntf0.a.a, of90.b.a);
                    }
                }
            } else {
                if (!(ta7Var2 instanceof ta7.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ta7.a aVar = (ta7.a) ta7Var2;
                if (!(aVar instanceof ta7.a.b)) {
                    if (aVar instanceof ta7.a.C3732a) {
                        return new db7.c(((ta7.a.C3732a) aVar).b);
                    }
                    if (epx.f(aVar, ta7.a.c.b)) {
                        return db7.d.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                la7 la7Var2 = ((ta7.a.b) aVar).b;
                if (!la7Var2.a.isEmpty()) {
                    return new db7.a(la7Var2, ntf0.a.a, of90.b.a);
                }
            }
            return db7.b.b;
        }
        ta7.b bVar = (ta7.b) ta7Var2;
        if (bVar instanceof ta7.b.a) {
            ta7.b.a aVar2 = (ta7.b.a) bVar;
            if (db7Var2 instanceof db7.a) {
                return db7.a.a((db7.a) db7Var2, null, null, new of90.a(aVar2.b), 3);
            }
        } else if (bVar instanceof ta7.b.C3733b) {
            qa7 qa7Var = ((ta7.b.C3733b) bVar).b;
            if (db7Var2 instanceof db7.a) {
                db7.a aVar3 = (db7.a) db7Var2;
                List<ab7> list = aVar3.b.a;
                wa7 wa7Var = wa7.b;
                p4g.a aVar4 = p4g.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
                for (ab7 ab7Var : list) {
                    linkedHashMap.put(wa7Var.invoke(ab7Var), ab7Var);
                }
                for (ab7 ab7Var2 : qa7Var.a) {
                    String str = ab7Var2.a;
                    ab7 ab7Var3 = (ab7) linkedHashMap.get(str);
                    if (ab7Var3 != null) {
                        linkedHashMap.put(str, new ab7(ab7Var3.a, j5g.u0(ab7Var2.b, ab7Var3.b)));
                    } else {
                        linkedHashMap.put(str, ab7Var2);
                    }
                }
                return db7.a.a(aVar3, new la7(j5g.O0(linkedHashMap.values()), qa7Var.b), null, of90.b.a, 2);
            }
        } else {
            if (!(bVar instanceof ta7.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (db7Var2 instanceof db7.a) {
                return db7.a.a((db7.a) db7Var2, null, null, of90.c.a, 3);
            }
        }
        return db7Var2;
    }

    @Override // xsna.dm50
    public final kb7 d() {
        return new kb7(e(new z90(6)), e(new lt0(9)), e(new com.vk.voip.ui.menu.feature.a(this, 6)), e(new am0(11)));
    }

    @Override // xsna.dm50
    public final void h(db7 db7Var, kb7 kb7Var) {
        db7 db7Var2 = db7Var;
        kb7 kb7Var2 = kb7Var;
        if (db7Var2 instanceof db7.a) {
            f(kb7Var2.c, db7Var2);
            return;
        }
        if (db7Var2 instanceof db7.c) {
            f(kb7Var2.b, db7Var2);
        } else if (db7Var2 instanceof db7.d) {
            f(kb7Var2.a, db7Var2);
        } else if (db7Var2 instanceof db7.b) {
            f(kb7Var2.d, db7Var2);
        }
    }
}
