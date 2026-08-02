package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.swi0;
import xsna.wwi0;

/* compiled from: SessionRoomsReducer.kt */
/* loaded from: classes7.dex */
public final class hxi0 extends dm50<ywi0, swi0, wwi0> {
    public final fxi0 d;
    public final gxi0 e;

    public hxi0() {
        super(new wwi0(0));
        this.d = new fxi0(0);
        this.e = new gxi0(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0101, code lost:
    
        if (xsna.epx.f(r14, r6) == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, xsna.wwi0$c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, xsna.wwi0$c] */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wwi0 c(wwi0 wwi0Var, swi0 swi0Var) {
        wwi0.b bVar;
        wwi0.b bVar2;
        wwi0 wwi0Var2 = wwi0Var;
        swi0 swi0Var2 = swi0Var;
        wwi0.c cVar = wwi0Var2.b;
        boolean z = wwi0Var2.d;
        Collection<wwi0.c.C3962c> collection = wwi0Var2.c;
        boolean z2 = false;
        if (swi0Var2 instanceof swi0.b) {
            return new wwi0(0);
        }
        boolean z3 = swi0Var2 instanceof swi0.d;
        wwi0.c.a aVar = wwi0.c.a.a;
        wwi0.c cVar2 = wwi0.c.b.a;
        if (z3) {
            if (!((swi0.d) swi0Var2).b) {
                return wwi0.a(wwi0Var2, cVar2, EmptyList.b, false, null, null, null, 56);
            }
            if (!collection.isEmpty()) {
                cVar2 = aVar;
            }
            return wwi0.a(wwi0Var2, cVar2, null, true, null, null, null, 58);
        }
        if (!(swi0Var2 instanceof swi0.i)) {
            if (swi0Var2 instanceof swi0.e) {
                return wwi0.a(wwi0Var2, ((swi0.e) swi0Var2).b, null, false, null, null, null, 62);
            }
            if (swi0Var2 instanceof swi0.c) {
                swi0.c cVar3 = (swi0.c) swi0Var2;
                wwi0.c.C3962c c3962c = cVar3.b;
                if (!z) {
                    cVar = c3962c;
                }
                return wwi0.a(wwi0Var2, cVar, null, false, new wwi0.b.C3961b(c3962c, cVar3.c), null, null, 54);
            }
            if (swi0Var2 instanceof swi0.h) {
                return wwi0.a(wwi0Var2, null, null, false, wwi0.b.a.a, null, wwi0Var2.e, 23);
            }
            if (swi0Var2 instanceof swi0.g) {
                swi0.g gVar = (swi0.g) swi0Var2;
                return wwi0.a(wwi0Var2, null, null, false, new wwi0.b.c(gVar.b, gVar.c), null, null, 55);
            }
            if (swi0Var2 instanceof swi0.f) {
                ArrayList arrayList = ((swi0.f) swi0Var2).b;
                if (!arrayList.isEmpty()) {
                    cVar2 = z ? aVar : cVar;
                }
                return wwi0.a(wwi0Var2, cVar2, arrayList, false, null, null, null, 60);
            }
            if (!(swi0Var2 instanceof swi0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            wwi0.a aVar2 = ((swi0.a) swi0Var2).b;
            return wwi0.a(wwi0Var2, null, null, false, null, new wwi0.a(aVar2.a, aVar2.b, aVar2.c), null, 47);
        }
        wwi0.c.C3962c c3962c2 = ((swi0.i) swi0Var2).b;
        SessionRoomId.Room room = c3962c2.a;
        wwi0.b bVar3 = wwi0Var2.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collection) {
            if (!epx.f(((wwi0.c.C3962c) obj).a, room)) {
                arrayList2.add(obj);
            }
        }
        List D0 = j5g.D0(new drt(3), j5g.v0(c3962c2, arrayList2));
        if ((cVar instanceof wwi0.c.C3962c) && epx.f(room, ((wwi0.c.C3962c) cVar).a)) {
            cVar2 = c3962c2;
        } else if (!z || !D0.isEmpty()) {
            cVar2 = z ? aVar : cVar;
        }
        if (bVar3 instanceof wwi0.b.C3961b) {
            wwi0.b.C3961b c3961b = (wwi0.b.C3961b) bVar3;
            boolean f = epx.f(c3961b.a.a, room);
            bVar2 = c3961b;
            if (f) {
                if (c3961b.b && c3962c2.b.length() == 0) {
                    z2 = true;
                }
                bVar2 = new wwi0.b.C3961b(c3962c2, z2);
            }
        } else {
            if (!(bVar3 instanceof wwi0.b.c)) {
                bVar = bVar3;
                return (!epx.f(bVar3, bVar) && epx.f(cVar, cVar2) && epx.f(D0, collection)) ? wwi0Var2 : wwi0.a(wwi0Var2, cVar2, D0, false, bVar, null, null, 52);
            }
            wwi0.b.c cVar4 = (wwi0.b.c) bVar3;
            ?? r4 = cVar4.a;
            ?? r6 = cVar4.b;
            wwi0.c.C3962c c3962c3 = ((r4 instanceof wwi0.c.C3962c) && epx.f(room, ((wwi0.c.C3962c) r4).a)) ? c3962c2 : r4;
            if (!(r6 instanceof wwi0.c.C3962c) || !epx.f(room, ((wwi0.c.C3962c) r6).a)) {
                c3962c2 = r6;
            }
            if (epx.f(c3962c3, r4)) {
                bVar2 = cVar4;
            }
            bVar2 = new wwi0.b.c(c3962c3, c3962c2);
        }
        bVar = bVar2;
        if (!epx.f(bVar3, bVar)) {
        }
    }

    @Override // xsna.dm50
    public final ywi0 d() {
        return new ywi0(e(new qcw(26)), e(new p7x(23)), e(new c3v(23)), e(new ulz(26)), e(new k990(19)), e(new ha40(12)), e(new b140(this, 20)), e(new pqz(24)));
    }

    @Override // xsna.dm50
    public final void h(wwi0 wwi0Var, ywi0 ywi0Var) {
        wwi0 wwi0Var2 = wwi0Var;
        ywi0 ywi0Var2 = ywi0Var;
        boolean z = wwi0Var2.d;
        fi50 fi50Var = ywi0Var2.g;
        wwi0.b bVar = wwi0Var2.e;
        if (bVar instanceof wwi0.b.a) {
            if (z) {
                f(ywi0Var2.b, wwi0Var2);
                f(fi50Var, wwi0Var2);
            } else {
                f(ywi0Var2.a, wwi0Var2);
            }
        } else if (bVar instanceof wwi0.b.C3961b) {
            if (z) {
                f(ywi0Var2.f, wwi0Var2);
                f(fi50Var, wwi0Var2);
            } else {
                f(ywi0Var2.e, wwi0Var2);
            }
        } else {
            if (!(bVar instanceof wwi0.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                f(ywi0Var2.d, wwi0Var2);
            } else {
                f(ywi0Var2.c, wwi0Var2);
            }
        }
        f(ywi0Var2.h, wwi0Var2);
    }
}
