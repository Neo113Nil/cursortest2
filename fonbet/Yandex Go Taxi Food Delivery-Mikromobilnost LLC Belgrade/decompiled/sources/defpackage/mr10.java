package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class mr10 implements vq90, q0u {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final kr10 e;

    public mr10(kr10 kr10Var) {
        this.e = kr10Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            vq90 vq90Var = (vq90) arrayList.get(size);
            if (vq90Var instanceof fge) {
                fge fgeVar = (fge) vq90Var;
                ArrayList arrayList2 = (ArrayList) fgeVar.c();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((vq90) arrayList2.get(size2)).getPath();
                    Matrix matrix = fgeVar.d;
                    iw01 iw01Var = fgeVar.l;
                    if (iw01Var != null) {
                        matrix = iw01Var.e();
                    } else {
                        matrix.reset();
                    }
                    path3.transform(matrix);
                    path.addPath(path3);
                }
            } else {
                path.addPath(vq90Var.getPath());
            }
        }
        int i = 0;
        vq90 vq90Var2 = (vq90) arrayList.get(0);
        if (vq90Var2 instanceof fge) {
            fge fgeVar2 = (fge) vq90Var2;
            List c = fgeVar2.c();
            while (true) {
                ArrayList arrayList3 = (ArrayList) c;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((vq90) arrayList3.get(i)).getPath();
                Matrix matrix2 = fgeVar2.d;
                iw01 iw01Var2 = fgeVar2.l;
                if (iw01Var2 != null) {
                    matrix2 = iw01Var2.e();
                } else {
                    matrix2.reset();
                }
                path4.transform(matrix2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(vq90Var2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.q0u
    public final void c(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            uee ueeVar = (uee) listIterator.previous();
            if (ueeVar instanceof vq90) {
                this.d.add((vq90) ueeVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((vq90) arrayList.get(i)).e(list, list2);
            i++;
        }
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        kr10 kr10Var = this.e;
        if (!kr10Var.b) {
            int i = lr10.a[kr10Var.a.ordinal()];
            if (i == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((vq90) arrayList.get(i2)).getPath());
                    i2++;
                }
            } else {
                if (i == 2) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
