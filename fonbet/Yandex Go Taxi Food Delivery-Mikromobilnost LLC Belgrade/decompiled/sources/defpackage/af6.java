package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class af6 implements cf6 {
    public final hg6 a;

    public af6(hg6 hg6Var) {
        this.a = hg6Var;
    }

    @Override // defpackage.cf6
    public final ArrayList a() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        hg6 hg6Var = this.a;
        List list = hg6Var.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            uf6 uf6Var = null;
            if (!it.hasNext()) {
                break;
            }
            ig6 ig6Var = (ig6) it.next();
            sl e = zk01.e(ig6Var);
            if (e != null) {
                ymq0 ymq0Var = ig6Var.b;
                if (ymq0Var != null) {
                    z = ymq0Var.d;
                } else {
                    xmq0 xmq0Var = ig6Var.c;
                    if (xmq0Var != null) {
                        z = xmq0Var.d;
                    } else {
                        yi1 yi1Var = ig6Var.k;
                        if (yi1Var != null) {
                            z = yi1Var.c;
                        } else {
                            t910 t910Var = ig6Var.j;
                            z = t910Var != null ? t910Var.c : true;
                        }
                    }
                }
                uf6Var = new uf6(new edq0(e, z));
            }
            if (uf6Var != null) {
                arrayList2.add(uf6Var);
            }
        }
        arrayList.addAll(arrayList2);
        List list2 = hg6Var.e;
        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList3.add(new vf6(i, (el0) obj));
            i = i2;
        }
        arrayList.addAll(arrayList3);
        return uab1.d(arrayList);
    }

    @Override // defpackage.cf6
    public final rr51 c() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af6) && jl40.l(this.a, ((af6) obj).a);
    }

    @Override // defpackage.cf6
    public final List getItems() {
        return this.a.d;
    }

    @Override // defpackage.cf6
    public final String getSubtitle() {
        return this.a.b;
    }

    @Override // defpackage.cf6
    public final String getTitle() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomSheet(payload=" + this.a + Extension.C_BRAKE;
    }
}
