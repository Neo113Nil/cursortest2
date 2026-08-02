package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Iterator;
import xsna.mzl;

/* compiled from: HelperReferences.java */
/* loaded from: classes11.dex */
public final class c2v extends pnx0 {
    public c2v(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // xsna.pnx0, xsna.hzl
    public final void a(hzl hzlVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.b;
        int i = aVar.x0;
        mzl mzlVar = this.h;
        Iterator it = mzlVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((mzl) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            mzlVar.d(i3 + aVar.z0);
        } else {
            mzlVar.d(i2 + aVar.z0);
        }
    }

    @Override // xsna.pnx0
    public final void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            mzl mzlVar = this.h;
            mzlVar.b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int i = aVar.x0;
            boolean z = aVar.y0;
            int i2 = 0;
            if (i == 0) {
                mzlVar.e = mzl.a.LEFT;
                while (i2 < aVar.w0) {
                    ConstraintWidget constraintWidget2 = aVar.v0[i2];
                    if (z || constraintWidget2.j0 != 8) {
                        mzl mzlVar2 = constraintWidget2.d.h;
                        mzlVar2.k.add(mzlVar);
                        mzlVar.l.add(mzlVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                mzlVar.e = mzl.a.RIGHT;
                while (i2 < aVar.w0) {
                    ConstraintWidget constraintWidget3 = aVar.v0[i2];
                    if (z || constraintWidget3.j0 != 8) {
                        mzl mzlVar3 = constraintWidget3.d.i;
                        mzlVar3.k.add(mzlVar);
                        mzlVar.l.add(mzlVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                mzlVar.e = mzl.a.TOP;
                while (i2 < aVar.w0) {
                    ConstraintWidget constraintWidget4 = aVar.v0[i2];
                    if (z || constraintWidget4.j0 != 8) {
                        mzl mzlVar4 = constraintWidget4.e.h;
                        mzlVar4.k.add(mzlVar);
                        mzlVar.l.add(mzlVar4);
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
            mzlVar.e = mzl.a.BOTTOM;
            while (i2 < aVar.w0) {
                ConstraintWidget constraintWidget5 = aVar.v0[i2];
                if (z || constraintWidget5.j0 != 8) {
                    mzl mzlVar5 = constraintWidget5.e.i;
                    mzlVar5.k.add(mzlVar);
                    mzlVar.l.add(mzlVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // xsna.pnx0
    public final void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int i = ((androidx.constraintlayout.core.widgets.a) constraintWidget).x0;
            mzl mzlVar = this.h;
            if (i == 0 || i == 1) {
                constraintWidget.b0 = mzlVar.g;
            } else {
                constraintWidget.c0 = mzlVar.g;
            }
        }
    }

    @Override // xsna.pnx0
    public final void f() {
        this.c = null;
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
