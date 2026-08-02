package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@gsq0(with = b3y.class)
/* loaded from: classes9.dex */
public final class a3y extends pyp0 implements rr10, h621 {
    public static final z2y Companion = new z2y();
    public final String a;
    public final boolean b;
    public final String c;
    public final d1u d;
    public final List e;

    public a3y(String str, boolean z, String str2, d1u d1uVar, List list) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = d1uVar;
        this.e = list;
    }

    public static a3y e(a3y a3yVar, boolean z, String str, d1u d1uVar, ArrayList arrayList, int i) {
        boolean z2 = z;
        String str2 = a3yVar.a;
        if ((i & 2) != 0) {
            z2 = a3yVar.b;
        }
        if ((i & 4) != 0) {
            str = a3yVar.c;
        }
        if ((i & 8) != 0) {
            d1uVar = a3yVar.d;
        }
        d1u d1uVar2 = d1uVar;
        return new a3y(str2, z2, str, d1uVar2, arrayList);
    }

    @Override // defpackage.h621
    public final pyp0 a(pyp0 pyp0Var) {
        if (!(pyp0Var instanceof a3y)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(this.e);
        List<pyp0> list = ((a3y) pyp0Var).e;
        if (!list.isEmpty()) {
            for (pyp0 pyp0Var2 : list) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (jl40.l(((pyp0) it.next()).getA(), pyp0Var2.getA())) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    Object obj = (pyp0) arrayList.get(i);
                    if (obj instanceof h621) {
                        arrayList.set(i, ((h621) obj).a(pyp0Var2));
                    }
                }
            }
        }
        return e(this, false, null, null, arrayList, 15);
    }

    @Override // defpackage.rr10
    public final pyp0 b(pyp0 pyp0Var) {
        if (!(pyp0Var instanceof a3y)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(this.e);
        a3y a3yVar = (a3y) pyp0Var;
        List<pyp0> list = a3yVar.e;
        if (!list.isEmpty()) {
            for (pyp0 pyp0Var2 : list) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (jl40.l(((pyp0) it.next()).getA(), pyp0Var2.getA())) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    Object obj = (pyp0) arrayList.get(i);
                    if (obj instanceof rr10) {
                        arrayList.set(i, ((rr10) obj).b(pyp0Var2));
                    }
                }
            }
        }
        return e(this, a3yVar.b, a3yVar.c, a3yVar.d, arrayList, 1);
    }

    @Override // defpackage.pyp0
    /* renamed from: c */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d */
    public final boolean getB() {
        return this.b;
    }
}
