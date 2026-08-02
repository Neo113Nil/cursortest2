package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a750;
import xsna.w650;

/* compiled from: MusicSnippetsReducer.kt */
/* loaded from: classes3.dex */
public final class z650 extends dm50<b750, w650, a750> {
    @Override // xsna.dm50
    public final a750 c(a750 a750Var, w650 w650Var) {
        a750.a aVar;
        Object obj;
        nck0 a;
        MusicTrack musicTrack;
        a750.a aVar2;
        a750 a750Var2 = a750Var;
        w650 w650Var2 = w650Var;
        a750.a aVar3 = a750Var2.b;
        if (w650Var2 instanceof w650.c) {
            return a750.a(a750Var2, aVar3 != null ? new a750.a(j5g.u0(((w650.c) w650Var2).b, aVar3.a)) : new a750.a(((w650.c) w650Var2).b), false, null, 4);
        }
        if (w650Var2 instanceof w650.e) {
            if (aVar3 != null) {
                List<nck0> list = aVar3.a;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (nck0 nck0Var : list) {
                    List<nbk0> list2 = nck0Var.g;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it = list2.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                    arrayList.add(nck0.a(nck0Var, arrayList2, 63));
                }
                aVar2 = new a750.a(arrayList);
            } else {
                aVar2 = null;
            }
            return a750.a(a750Var2, aVar2, false, null, 4);
        }
        if (!(w650Var2 instanceof w650.d)) {
            if (w650Var2 instanceof w650.b) {
                return a750.a(a750Var2, null, true, null, 1);
            }
            if (w650Var2 instanceof w650.a) {
                return a750.a(a750Var2, null, false, ((w650.a) w650Var2).b, 1);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (aVar3 != null) {
            List<nck0> list3 = aVar3.a;
            ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
            for (nck0 nck0Var2 : list3) {
                List<nbk0> list4 = nck0Var2.g;
                Iterator<T> it2 = list4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    nbk0 nbk0Var = (nbk0) obj;
                    int i = nbk0Var.b.b;
                    int i2 = ((w650.d) w650Var2).b.b;
                    if (i == i2 || ((musicTrack = nbk0Var.c) != null && musicTrack.b == i2)) {
                        break;
                    }
                }
                nbk0 nbk0Var2 = (nbk0) obj;
                if (nbk0Var2 != null) {
                    int indexOf = list4.indexOf(nbk0Var2);
                    MusicTrack musicTrack2 = ((w650.d) w650Var2).c;
                    a = nck0.a(nck0Var2, rdi.I(indexOf, new nbk0(nbk0Var2.a, nbk0Var2.b, musicTrack2, musicTrack2.l), list4), 63);
                } else {
                    a = nck0.a(nck0Var2, null, 127);
                }
                arrayList3.add(a);
            }
            aVar = new a750.a(arrayList3);
        } else {
            aVar = null;
        }
        return a750.a(a750Var2, aVar, false, null, 4);
    }

    @Override // xsna.dm50
    public final b750 d() {
        return new b750(e(new y510(6)), e(new n9w(9)), e(new vd1(29)));
    }

    @Override // xsna.dm50
    public final void h(a750 a750Var, b750 b750Var) {
        a750 a750Var2 = a750Var;
        b750 b750Var2 = b750Var;
        if (a750Var2.c) {
            f(b750Var2.a, a750Var2);
        } else if (a750Var2.d != null) {
            f(b750Var2.b, a750Var2);
        } else {
            f(b750Var2.c, a750Var2);
        }
    }
}
