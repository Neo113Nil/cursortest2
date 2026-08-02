package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public final class kt6 {
    public final ArrayList<ConstraintWidget> a = new ArrayList<>();
    public final a b = new a();
    public final androidx.constraintlayout.core.widgets.d c;

    /* compiled from: BasicMeasure.java */
    public static class a {
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* compiled from: BasicMeasure.java */
    public interface b {
        void a(ConstraintWidget constraintWidget, a aVar);

        void b();
    }

    public kt6(androidx.constraintlayout.core.widgets.d dVar) {
        this.c = dVar;
    }

    public final boolean a(int i, ConstraintWidget constraintWidget, b bVar) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        int[] iArr = constraintWidget.u;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.b;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviourArr[1];
        aVar.c = constraintWidget.v();
        aVar.d = constraintWidget.p();
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z2 = aVar.b == dimensionBehaviour3;
        boolean z3 = z && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.Z > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z3 && iArr[0] == 4) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.a(constraintWidget, aVar);
        constraintWidget.W(aVar.e);
        constraintWidget.R(aVar.f);
        constraintWidget.F = aVar.h;
        constraintWidget.N(aVar.g);
        aVar.j = 0;
        return aVar.i;
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3) {
        int i4 = dVar.e0;
        int i5 = dVar.f0;
        dVar.e0 = 0;
        dVar.f0 = 0;
        dVar.W(i2);
        dVar.R(i3);
        if (i4 < 0) {
            dVar.e0 = 0;
        } else {
            dVar.e0 = i4;
        }
        if (i5 < 0) {
            dVar.f0 = 0;
        } else {
            dVar.f0 = i5;
        }
        androidx.constraintlayout.core.widgets.d dVar2 = this.c;
        dVar2.y0 = i;
        dVar2.Z();
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar) {
        ArrayList<ConstraintWidget> arrayList = this.a;
        arrayList.clear();
        int size = dVar.v0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.v0.get(i);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        dVar.x0.b = true;
    }
}
