package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* loaded from: classes12.dex */
public final class d6j0 extends com.airbnb.lottie.model.layer.a {
    public final igj D;
    public final com.airbnb.lottie.model.layer.b E;

    @Nullable
    public final lmo F;

    public d6j0(k800 k800Var, Layer layer, com.airbnb.lottie.model.layer.b bVar, i700 i700Var) {
        super(k800Var, layer);
        this.E = bVar;
        igj igjVar = new igj(k800Var, this, new a6j0("__container", layer.a, false), i700Var);
        this.D = igjVar;
        List<gfj> list = Collections.EMPTY_LIST;
        igjVar.b(list, list);
        m22 m22Var = this.p.x;
        if (m22Var != null) {
            this.F = new lmo(this, this, m22Var);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        PointF pointF = t800.a;
        lmo lmoVar = this.F;
        if (t == 5 && lmoVar != null) {
            lmoVar.c.k(a900Var);
            return;
        }
        if (t == t800.E && lmoVar != null) {
            lmoVar.b(a900Var);
            return;
        }
        if (t == t800.F && lmoVar != null) {
            lmoVar.e.k(a900Var);
            return;
        }
        if (t == t800.G && lmoVar != null) {
            lmoVar.f.k(a900Var);
        } else {
            if (t != t800.H || lmoVar == null) {
                return;
            }
            lmoVar.g.k(a900Var);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        this.D.g(rectF, this.n, z);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(@NonNull Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        lmo lmoVar = this.F;
        if (lmoVar != null) {
            aVar = lmoVar.a(matrix, i);
        }
        this.D.e(canvas, matrix, i, aVar);
    }

    @Override // com.airbnb.lottie.model.layer.a
    @Nullable
    public final qus l() {
        qus qusVar = this.p.w;
        return qusVar != null ? qusVar : this.E.p.w;
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void p(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        this.D.d(udyVar, i, arrayList, udyVar2);
    }
}
