package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import xsna.tf6;

/* compiled from: RepeaterContent.java */
/* loaded from: classes12.dex */
public final class r0g0 implements plo, gq90, keu, tf6.a, wdy {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final k800 c;
    public final com.airbnb.lottie.model.layer.a d;
    public final String e;
    public final boolean f;
    public final hqr g;
    public final hqr h;
    public final ikp0 i;
    public igj j;

    public r0g0(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, q0g0 q0g0Var) {
        this.c = k800Var;
        this.d = aVar;
        this.e = q0g0Var.a;
        this.f = q0g0Var.e;
        hqr j = q0g0Var.b.j();
        this.g = j;
        aVar.h(j);
        j.a(this);
        hqr j2 = q0g0Var.c.j();
        this.h = j2;
        aVar.h(j2);
        j2.a(this);
        dg2 dg2Var = q0g0Var.d;
        dg2Var.getClass();
        ikp0 ikp0Var = new ikp0(dg2Var);
        this.i = ikp0Var;
        ikp0Var.a(aVar);
        ikp0Var.b(this);
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        this.j.b(list, list2);
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        ls20.g(udyVar, i, arrayList, udyVar2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            gfj gfjVar = (gfj) this.j.i.get(i2);
            if (gfjVar instanceof wdy) {
                ls20.g(udyVar, i, arrayList, udyVar2, (wdy) gfjVar);
            }
        }
    }

    @Override // xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        ikp0 ikp0Var = this.i;
        float floatValue3 = ikp0Var.v.f().floatValue() / 100.0f;
        float floatValue4 = ikp0Var.w.f().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(ikp0Var.f(f + floatValue2));
            this.j.e(canvas, matrix2, (int) (ls20.f(floatValue3, floatValue4, f / floatValue) * i), aVar);
        }
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        if (this.i.c(t, a900Var)) {
            return;
        }
        if (t == t800.s) {
            this.g.k(a900Var);
        } else if (t == t800.t) {
            this.h.k(a900Var);
        }
    }

    @Override // xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        this.j.g(rectF, matrix, z);
    }

    @Override // xsna.gfj
    public final String getName() {
        return this.e;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            Matrix f = this.i.f(i + floatValue2);
            Matrix matrix = this.a;
            matrix.set(f);
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // xsna.keu
    public final void h(ListIterator<gfj> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new igj(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.c.invalidateSelf();
    }
}
