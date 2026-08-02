package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bf6 implements cf6 {
    public final r6q0 a;

    public bf6(r6q0 r6q0Var) {
        this.a = r6q0Var;
    }

    @Override // defpackage.cf6
    public final ArrayList a() {
        uf6 uf6Var;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (jg6 jg6Var : this.a.c) {
            List<ig6> list = jg6Var.c;
            ArrayList arrayList2 = new ArrayList();
            for (ig6 ig6Var : list) {
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
                    uf6Var = new uf6(new fdq0(e, z));
                } else {
                    uf6Var = null;
                }
                if (uf6Var != null) {
                    arrayList2.add(uf6Var);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new wf6(new fjz0(jg6Var.b)));
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.cf6
    public final rr51 c() {
        r6q0 r6q0Var = this.a;
        return r6q0Var.b().isEmpty() ? r6q0Var.a : r6q0Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf6) && jl40.l(this.a, ((bf6) obj).a);
    }

    @Override // defpackage.cf6
    public final List getItems() {
        return this.a.b();
    }

    @Override // defpackage.cf6
    public final /* bridge */ /* synthetic */ String getSubtitle() {
        return null;
    }

    @Override // defpackage.cf6
    public final /* bridge */ /* synthetic */ String getTitle() {
        return null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SectionsSheet(payload=" + this.a + Extension.C_BRAKE;
    }
}
