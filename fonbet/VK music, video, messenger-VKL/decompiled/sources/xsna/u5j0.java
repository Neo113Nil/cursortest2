package xsna;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: ShapeContent.java */
/* loaded from: classes12.dex */
public final class u5j0 implements gq90, tf6.a, wdy {
    public final String b;
    public final boolean c;
    public final k800 d;
    public final c6j0 e;
    public boolean f;
    public final Path a = new Path();
    public final op5 g = new op5(1, false);

    public u5j0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, f6j0 f6j0Var) {
        this.b = f6j0Var.a;
        this.c = f6j0Var.d;
        this.d = k800Var;
        c6j0 c6j0Var = new c6j0((List) f6j0Var.c.c);
        this.e = c6j0Var;
        aVar.h(c6j0Var);
        c6j0Var.a(this);
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            gfj gfjVar = (gfj) arrayList2.get(i);
            if (gfjVar instanceof arp0) {
                arp0 arp0Var = (arp0) gfjVar;
                if (arp0Var.c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    ((ArrayList) this.g.b).add(arp0Var);
                    arp0Var.d(this);
                    i++;
                }
            }
            if (gfjVar instanceof e6j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                e6j0 e6j0Var = (e6j0) gfjVar;
                e6j0Var.c(this);
                arrayList.add(e6j0Var);
            }
            i++;
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        if (t == t800.N) {
            this.e.k(a900Var);
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.b;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        boolean z = this.f;
        c6j0 c6j0Var = this.e;
        Path path = this.a;
        if (z && c6j0Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path f = c6j0Var.f();
        if (f == null) {
            return path;
        }
        path.set(f);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.c(path);
        this.f = true;
        return path;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.f = false;
        this.d.invalidateSelf();
    }
}
