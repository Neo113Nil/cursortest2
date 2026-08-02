package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class ecl0 extends xij {
    public final List a;
    public final List b;
    public final boolean c;

    public ecl0(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        boolean z2;
        this.a = arrayList;
        this.b = arrayList2;
        boolean z3 = true;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((zfu0) it.next()).c()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((zfu0) it2.next()).c()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z4 = z != z2;
        if (arrayList.size() == arrayList2.size() && !z4) {
            z3 = false;
        }
        this.c = z3;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        if (this.c) {
            return false;
        }
        return jl40.l(this.a.get(i), this.b.get(i2));
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        return this.a.get(i) == this.b.get(i2);
    }

    @Override // defpackage.xij
    public final int d() {
        return this.b.size();
    }

    @Override // defpackage.xij
    public final int e() {
        return this.a.size();
    }
}
