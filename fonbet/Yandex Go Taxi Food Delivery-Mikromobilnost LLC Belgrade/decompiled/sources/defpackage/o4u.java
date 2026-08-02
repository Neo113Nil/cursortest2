package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.h;
import androidx.constraintlayout.core.widgets.g;

/* loaded from: classes10.dex */
public final class o4u extends h {
    public o4u(g gVar) {
        super(gVar);
        gVar.d.f();
        gVar.e.f();
        this.f = gVar.y0;
    }

    @Override // defpackage.xwi
    public final void a(xwi xwiVar) {
        a aVar = this.h;
        if (aVar.c && !aVar.j) {
            aVar.d((int) ((((a) aVar.l.get(0)).g * ((g) this.b).u0) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        g gVar = (g) constraintWidget;
        int i = gVar.v0;
        int i2 = gVar.w0;
        int i3 = gVar.y0;
        a aVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                aVar.l.add(constraintWidget.V.d.h);
                this.b.V.d.h.k.add(aVar);
                aVar.f = i;
            } else if (i2 != -1) {
                aVar.l.add(constraintWidget.V.d.i);
                this.b.V.d.i.k.add(aVar);
                aVar.f = -i2;
            } else {
                aVar.b = true;
                aVar.l.add(constraintWidget.V.d.i);
                this.b.V.d.i.k.add(aVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            aVar.l.add(constraintWidget.V.e.h);
            this.b.V.e.h.k.add(aVar);
            aVar.f = i;
        } else if (i2 != -1) {
            aVar.l.add(constraintWidget.V.e.i);
            this.b.V.e.i.k.add(aVar);
            aVar.f = -i2;
        } else {
            aVar.b = true;
            aVar.l.add(constraintWidget.V.e.i);
            this.b.V.e.i.k.add(aVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        int i = ((g) constraintWidget).y0;
        a aVar = this.h;
        if (i == 1) {
            constraintWidget.a0 = aVar.g;
        } else {
            constraintWidget.b0 = aVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.h
    public final void f() {
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
