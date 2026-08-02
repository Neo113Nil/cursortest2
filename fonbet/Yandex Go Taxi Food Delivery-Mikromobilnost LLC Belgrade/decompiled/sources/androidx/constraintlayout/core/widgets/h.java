package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.ijy;
import defpackage.z7t0;

/* loaded from: classes.dex */
public class h {
    public static final boolean[] a = new boolean[3];

    public static void a(d dVar, ijy ijyVar, ConstraintWidget constraintWidget) {
        constraintWidget.o = -1;
        b7e b7eVar = constraintWidget.N;
        b7e b7eVar2 = constraintWidget.M;
        b7e b7eVar3 = constraintWidget.K;
        b7e b7eVar4 = constraintWidget.L;
        b7e b7eVar5 = constraintWidget.J;
        constraintWidget.p = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.U[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.U[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = b7eVar5.g;
            int s = dVar.s() - b7eVar4.g;
            b7eVar5.i = ijyVar.k(b7eVar5);
            b7eVar4.i = ijyVar.k(b7eVar4);
            ijyVar.d(b7eVar5.i, i);
            ijyVar.d(b7eVar4.i, s);
            constraintWidget.o = 2;
            constraintWidget.a0 = i;
            int i2 = s - i;
            constraintWidget.W = i2;
            int i3 = constraintWidget.d0;
            if (i2 < i3) {
                constraintWidget.W = i3;
            }
        }
        if (dVar.U[1] == dimensionBehaviour2 || constraintWidget.U[1] != ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i4 = b7eVar3.g;
        int m = dVar.m() - b7eVar2.g;
        b7eVar3.i = ijyVar.k(b7eVar3);
        b7eVar2.i = ijyVar.k(b7eVar2);
        ijyVar.d(b7eVar3.i, i4);
        ijyVar.d(b7eVar2.i, m);
        if (constraintWidget.c0 > 0 || constraintWidget.i0 == 8) {
            z7t0 k = ijyVar.k(b7eVar);
            b7eVar.i = k;
            ijyVar.d(k, constraintWidget.c0 + i4);
        }
        constraintWidget.p = 2;
        constraintWidget.b0 = i4;
        int i5 = m - i4;
        constraintWidget.X = i5;
        int i6 = constraintWidget.e0;
        if (i5 < i6) {
            constraintWidget.X = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
