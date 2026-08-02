package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class fry extends gry {
    @Override // defpackage.gry
    public final void a(long j, Object obj) {
        ((o9) ((nqw) y321.c.i(j, obj))).a = false;
    }

    @Override // defpackage.gry
    public final void b(long j, Object obj, Object obj2) {
        v321 v321Var = y321.c;
        nqw nqwVar = (nqw) v321Var.i(j, obj);
        nqw nqwVar2 = (nqw) v321Var.i(j, obj2);
        int size = nqwVar.size();
        int size2 = nqwVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((o9) nqwVar).a) {
                nqwVar = nqwVar.w(size2 + size);
            }
            nqwVar.addAll(nqwVar2);
        }
        if (size > 0) {
            nqwVar2 = nqwVar;
        }
        y321.p(j, obj, nqwVar2);
    }

    @Override // defpackage.gry
    public final List c(long j, Object obj) {
        nqw nqwVar = (nqw) y321.c.i(j, obj);
        if (((o9) nqwVar).a) {
            return nqwVar;
        }
        int size = nqwVar.size();
        nqw w = nqwVar.w(size == 0 ? 10 : size * 2);
        y321.p(j, obj, w);
        return w;
    }
}
