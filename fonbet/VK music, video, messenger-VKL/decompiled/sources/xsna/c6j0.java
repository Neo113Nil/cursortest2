package xsna;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class c6j0 extends tf6<v5j0, Path> {
    public final v5j0 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public c6j0(List<nhy<v5j0>> list) {
        super(list);
        this.i = new v5j0();
        this.j = new Path();
    }

    @Override // xsna.tf6
    public final Path g(nhy<v5j0> nhyVar, float f) {
        v5j0 v5j0Var;
        v5j0 v5j0Var2 = nhyVar.b;
        v5j0 v5j0Var3 = nhyVar.c;
        v5j0 v5j0Var4 = v5j0Var3 == null ? v5j0Var2 : v5j0Var3;
        v5j0 v5j0Var5 = this.i;
        ArrayList arrayList = v5j0Var5.a;
        if (v5j0Var5.b == null) {
            v5j0Var5.b = new PointF();
        }
        boolean z = v5j0Var2.c;
        ArrayList arrayList2 = v5j0Var2.a;
        boolean z2 = true;
        v5j0Var5.c = z || v5j0Var4.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = v5j0Var4.a;
        if (size != arrayList3.size()) {
            n100.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < min) {
            for (int size2 = arrayList.size(); size2 < min; size2++) {
                arrayList.add(new qkk());
            }
        } else if (arrayList.size() > min) {
            for (int size3 = arrayList.size() - 1; size3 >= min; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = v5j0Var2.b;
        PointF pointF2 = v5j0Var4.b;
        v5j0Var5.a(ls20.f(pointF.x, pointF2.x, f), ls20.f(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            qkk qkkVar = (qkk) arrayList2.get(size4);
            qkk qkkVar2 = (qkk) arrayList3.get(size4);
            PointF pointF3 = qkkVar.a;
            PointF pointF4 = qkkVar.b;
            PointF pointF5 = qkkVar.c;
            PointF pointF6 = qkkVar2.a;
            boolean z3 = z2;
            PointF pointF7 = qkkVar2.b;
            PointF pointF8 = qkkVar2.c;
            ((qkk) arrayList.get(size4)).a.set(ls20.f(pointF3.x, pointF6.x, f), ls20.f(pointF3.y, pointF6.y, f));
            ((qkk) arrayList.get(size4)).b.set(ls20.f(pointF4.x, pointF7.x, f), ls20.f(pointF4.y, pointF7.y, f));
            ((qkk) arrayList.get(size4)).c.set(ls20.f(pointF5.x, pointF8.x, f), ls20.f(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            v5j0Var5 = v5j0Var5;
            arrayList3 = arrayList3;
        }
        v5j0 v5j0Var6 = v5j0Var5;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            v5j0Var = v5j0Var6;
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                v5j0Var = ((e6j0) this.m.get(size5)).a(v5j0Var);
            }
        } else {
            v5j0Var = v5j0Var6;
        }
        Path path = this.j;
        ls20.e(v5j0Var, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        ls20.e(v5j0Var2, this.k);
        if (v5j0Var3 != null) {
            ls20.e(v5j0Var3, this.l);
        }
        a900<A> a900Var = this.e;
        float f2 = nhyVar.g;
        float floatValue = nhyVar.h.floatValue();
        Path path2 = this.k;
        return (Path) a900Var.b(f2, floatValue, path2, v5j0Var3 == null ? path2 : this.l, f, e(), this.d);
    }

    @Override // xsna.tf6
    public final boolean l() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
