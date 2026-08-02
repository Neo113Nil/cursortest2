package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.xwi;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class c extends h {
    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // defpackage.xwi
    public final void a(xwi xwiVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.b;
        int i = aVar.w0;
        a aVar2 = this.h;
        Iterator it = aVar2.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((a) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            aVar2.d(i3 + aVar.y0);
        } else {
            aVar2.d(i2 + aVar.y0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            a aVar = this.h;
            aVar.b = true;
            ArrayList arrayList = aVar.l;
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i = aVar2.w0;
            boolean z = aVar2.x0;
            int i2 = 0;
            if (i == 0) {
                aVar.e = DependencyNode$Type.LEFT;
                while (i2 < aVar2.v0) {
                    ConstraintWidget constraintWidget2 = aVar2.u0[i2];
                    if (z || constraintWidget2.i0 != 8) {
                        a aVar3 = constraintWidget2.d.h;
                        aVar3.k.add(aVar);
                        arrayList.add(aVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                aVar.e = DependencyNode$Type.RIGHT;
                while (i2 < aVar2.v0) {
                    ConstraintWidget constraintWidget3 = aVar2.u0[i2];
                    if (z || constraintWidget3.i0 != 8) {
                        a aVar4 = constraintWidget3.d.i;
                        aVar4.k.add(aVar);
                        arrayList.add(aVar4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                aVar.e = DependencyNode$Type.TOP;
                while (i2 < aVar2.v0) {
                    ConstraintWidget constraintWidget4 = aVar2.u0[i2];
                    if (z || constraintWidget4.i0 != 8) {
                        a aVar5 = constraintWidget4.e.h;
                        aVar5.k.add(aVar);
                        arrayList.add(aVar5);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            aVar.e = DependencyNode$Type.BOTTOM;
            while (i2 < aVar2.v0) {
                ConstraintWidget constraintWidget5 = aVar2.u0[i2];
                if (z || constraintWidget5.i0 != 8) {
                    a aVar6 = constraintWidget5.e.i;
                    aVar6.k.add(aVar);
                    arrayList.add(aVar6);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i = ((androidx.constraintlayout.core.widgets.a) constraintWidget).w0;
            a aVar = this.h;
            if (i == 0 || i == 1) {
                constraintWidget.a0 = aVar.g;
            } else {
                constraintWidget.b0 = aVar.g;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final boolean k() {
        return false;
    }

    public final void m(a aVar) {
        a aVar2 = this.h;
        aVar2.k.add(aVar);
        aVar.l.add(aVar2);
    }
}
