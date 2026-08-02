package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class o691 extends s591 {
    public final ArrayList c;
    public final ArrayList w;
    public final cr71 x;

    public o691(String str, ArrayList arrayList, List list, cr71 cr71Var) {
        super(str);
        this.c = new ArrayList();
        this.x = cr71Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((r691) it.next()).zzc());
            }
        }
        this.w = new ArrayList(list);
    }

    @Override // defpackage.s591
    public final r691 c(cr71 cr71Var, List list) {
        g791 g791Var;
        cr71 j = this.x.j();
        p791 p791Var = (p791) j.c;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            g791Var = r691.z5;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                j.p((String) arrayList.get(i), ((p791) cr71Var.c).b(cr71Var, (r691) list.get(i)));
            } else {
                j.p((String) arrayList.get(i), g791Var);
            }
            i++;
        }
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            r691 r691Var = (r691) it.next();
            r691 b = p791Var.b(j, r691Var);
            if (b instanceof s691) {
                b = p791Var.b(j, r691Var);
            }
            if (b instanceof g591) {
                return ((g591) b).a;
            }
        }
        return g791Var;
    }

    @Override // defpackage.s591, defpackage.r691
    public final r691 e() {
        return new o691(this);
    }

    public o691(o691 o691Var) {
        super(o691Var.a);
        ArrayList arrayList = new ArrayList(o691Var.c.size());
        this.c = arrayList;
        arrayList.addAll(o691Var.c);
        ArrayList arrayList2 = new ArrayList(o691Var.w.size());
        this.w = arrayList2;
        arrayList2.addAll(o691Var.w);
        this.x = o691Var.x;
    }
}
