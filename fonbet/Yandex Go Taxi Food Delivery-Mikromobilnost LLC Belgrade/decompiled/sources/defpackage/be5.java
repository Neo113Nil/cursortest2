package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class be5 {
    public final ArrayList a = new ArrayList();
    public final zd5 b = new zd5();
    public final d c;

    public be5(d dVar) {
        this.c = dVar;
    }

    public final boolean a(int i, ae5 ae5Var, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        int[] iArr = constraintWidget.t;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        zd5 zd5Var = this.b;
        zd5Var.a = dimensionBehaviour;
        zd5Var.b = dimensionBehaviourArr[1];
        zd5Var.c = constraintWidget.s();
        zd5Var.d = constraintWidget.m();
        zd5Var.i = false;
        zd5Var.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = zd5Var.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = zd5Var.b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.Y > 0.0f;
        boolean z4 = z2 && constraintWidget.Y > 0.0f;
        if (z3 && iArr[0] == 4) {
            zd5Var.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            zd5Var.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((b) ae5Var).b(constraintWidget, zd5Var);
        constraintWidget.Q(zd5Var.e);
        constraintWidget.N(zd5Var.f);
        constraintWidget.E = zd5Var.h;
        constraintWidget.K(zd5Var.g);
        zd5Var.j = 0;
        return zd5Var.i;
    }

    public final void b(d dVar, int i, int i2, int i3) {
        if (dVar.A0 != null) {
            System.nanoTime();
        }
        int i4 = dVar.d0;
        int i5 = dVar.e0;
        dVar.d0 = 0;
        dVar.e0 = 0;
        dVar.Q(i2);
        dVar.N(i3);
        if (i4 < 0) {
            dVar.d0 = 0;
        } else {
            dVar.d0 = i4;
        }
        if (i5 < 0) {
            dVar.e0 = 0;
        } else {
            dVar.e0 = i5;
        }
        d dVar2 = this.c;
        dVar2.x0 = i;
        dVar2.T();
        if (dVar.A0 != null) {
            System.nanoTime();
            dVar.A0.getClass();
        }
    }

    public final void c(d dVar) {
        ArrayList arrayList = this.a;
        arrayList.clear();
        int size = dVar.u0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) dVar.u0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.w0.b = true;
    }
}
