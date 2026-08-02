package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: GuidelineReference.java */
/* loaded from: classes11.dex */
public final class wru extends pnx0 {
    public wru(androidx.constraintlayout.core.widgets.f fVar) {
        super(fVar);
        fVar.d.f();
        fVar.e.f();
        this.f = fVar.z0;
    }

    @Override // xsna.pnx0, xsna.hzl
    public final void a(hzl hzlVar) {
        mzl mzlVar = this.h;
        if (mzlVar.c && !mzlVar.j) {
            mzlVar.d((int) ((((mzl) mzlVar.l.get(0)).g * ((androidx.constraintlayout.core.widgets.f) this.b).v0) + 0.5f));
        }
    }

    @Override // xsna.pnx0
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        int i = fVar.w0;
        int i2 = fVar.x0;
        int i3 = fVar.z0;
        mzl mzlVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                mzlVar.l.add(constraintWidget.W.d.h);
                this.b.W.d.h.k.add(mzlVar);
                mzlVar.f = i;
            } else if (i2 != -1) {
                mzlVar.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(mzlVar);
                mzlVar.f = -i2;
            } else {
                mzlVar.b = true;
                mzlVar.l.add(constraintWidget.W.d.i);
                this.b.W.d.i.k.add(mzlVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            mzlVar.l.add(constraintWidget.W.e.h);
            this.b.W.e.h.k.add(mzlVar);
            mzlVar.f = i;
        } else if (i2 != -1) {
            mzlVar.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(mzlVar);
            mzlVar.f = -i2;
        } else {
            mzlVar.b = true;
            mzlVar.l.add(constraintWidget.W.e.i);
            this.b.W.e.i.k.add(mzlVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // xsna.pnx0
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        int i = ((androidx.constraintlayout.core.widgets.f) constraintWidget).z0;
        mzl mzlVar = this.h;
        if (i == 1) {
            constraintWidget.b0 = mzlVar.g;
        } else {
            constraintWidget.c0 = mzlVar.g;
        }
    }

    @Override // xsna.pnx0
    public final void f() {
        this.h.c();
    }

    @Override // xsna.pnx0
    public final boolean k() {
        return false;
    }

    public final void m(mzl mzlVar) {
        mzl mzlVar2 = this.h;
        mzlVar2.k.add(mzlVar);
        mzlVar.l.add(mzlVar2);
    }
}
