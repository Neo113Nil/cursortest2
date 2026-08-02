package xsna;

import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CropViewModel.kt */
/* loaded from: classes4.dex */
public final class oik extends vy1 {
    public cc0 c;
    public a d;

    /* compiled from: CropViewModel.kt */
    public static final class a {
        public final CropAspectRatioFormat a;
        public final Set<ghk> b;
        public final ArrayList c;
        public final syp0 d;
        public final utk0 e;
        public final b8f0 f;

        public a(CropAspectRatioFormat cropAspectRatioFormat, Set<ghk> set) {
            this.a = cropAspectRatioFormat;
            this.b = set;
            Set<ghk> set2 = set;
            ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
            Iterator<T> it = set2.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                ghk ghkVar = (ghk) it.next();
                if (ghkVar.c == this.a) {
                    z = true;
                }
                arrayList.add(new typ0(ghkVar, z));
            }
            this.c = arrayList;
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (((typ0) it2.next()).a.c == this.a) {
                    break;
                } else {
                    i++;
                }
            }
            syp0 syp0Var = new syp0(new uyp0(arrayList, i), false);
            this.d = syp0Var;
            utk0 a = vtk0.a(syp0Var);
            this.e = a;
            this.f = rsr.f(a);
        }

        public final void a(CropAspectRatioFormat cropAspectRatioFormat, boolean z) {
            Iterator<T> it = this.b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (((ghk) next).c == cropAspectRatioFormat) {
                    break;
                } else {
                    i++;
                }
            }
            ArrayList arrayList = new ArrayList(this.c);
            typ0 typ0Var = (typ0) j5g.b0(i, arrayList);
            typ0 typ0Var2 = typ0Var != null ? new typ0(typ0Var.a, true) : null;
            if (typ0Var2 != null) {
            }
            syp0 syp0Var = new syp0(new uyp0(arrayList, i), z);
            utk0 utk0Var = this.e;
            utk0Var.getClass();
            utk0Var.i(null, syp0Var);
        }
    }
}
