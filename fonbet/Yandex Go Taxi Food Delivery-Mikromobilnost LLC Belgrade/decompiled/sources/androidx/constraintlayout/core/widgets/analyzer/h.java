package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import defpackage.b7e;
import defpackage.rkl0;
import defpackage.xwi;
import defpackage.z351;

/* loaded from: classes.dex */
public abstract class h implements xwi {
    public int a;
    public ConstraintWidget b;
    public rkl0 c;
    public ConstraintWidget.DimensionBehaviour d;
    public final b e = new b(this);
    public int f = 0;
    public boolean g = false;
    public final a h = new a(this);
    public final a i = new a(this);
    public WidgetRun$RunType j = WidgetRun$RunType.NONE;

    public h(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    public static void b(a aVar, a aVar2, int i) {
        aVar.l.add(aVar2);
        aVar.f = i;
        aVar2.k.add(aVar);
    }

    public static a h(b7e b7eVar) {
        b7e b7eVar2 = b7eVar.f;
        if (b7eVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = b7eVar2.d;
        int i = z351.a[b7eVar2.e.ordinal()];
        if (i == 1) {
            return constraintWidget.d.h;
        }
        if (i == 2) {
            return constraintWidget.d.i;
        }
        if (i == 3) {
            return constraintWidget.e.h;
        }
        if (i == 4) {
            return constraintWidget.e.k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.e.i;
    }

    public static a i(b7e b7eVar, int i) {
        b7e b7eVar2 = b7eVar.f;
        if (b7eVar2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = b7eVar2.d;
        h hVar = i == 0 ? constraintWidget.d : constraintWidget.e;
        int i2 = z351.a[b7eVar2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return hVar.i;
        }
        return hVar.h;
    }

    public final void c(a aVar, a aVar2, int i, b bVar) {
        aVar.l.add(aVar2);
        aVar.l.add(this.e);
        aVar.h = i;
        aVar.i = bVar;
        aVar2.k.add(aVar);
        bVar.k.add(aVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        ConstraintWidget constraintWidget = this.b;
        if (i2 == 0) {
            int i3 = constraintWidget.v;
            int max = Math.max(constraintWidget.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = constraintWidget.y;
            int max2 = Math.max(constraintWidget.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(b7e b7eVar, b7e b7eVar2, int i) {
        a h = h(b7eVar);
        a h2 = h(b7eVar2);
        if (h.j && h2.j) {
            int e = b7eVar.e() + h.g;
            int e2 = h2.g - b7eVar2.e();
            int i2 = e2 - e;
            b bVar = this.e;
            if (!bVar.j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i3 = this.a;
                    if (i3 == 0) {
                        bVar.d(g(i2, i));
                    } else if (i3 == 1) {
                        bVar.d(Math.min(g(bVar.m, i), i2));
                    } else if (i3 == 2) {
                        ConstraintWidget constraintWidget = this.b;
                        ConstraintWidget constraintWidget2 = constraintWidget.V;
                        if (constraintWidget2 != null) {
                            if ((i == 0 ? constraintWidget2.d : constraintWidget2.e).e.j) {
                                bVar.d(g((int) ((r6.g * (i == 0 ? constraintWidget.w : constraintWidget.z)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        ConstraintWidget constraintWidget3 = this.b;
                        h hVar = constraintWidget3.d;
                        if (hVar.d == dimensionBehaviour2 && hVar.a == 3) {
                            g gVar = constraintWidget3.e;
                            if (gVar.d == dimensionBehaviour2) {
                            }
                        }
                        if (i == 0) {
                            hVar = constraintWidget3.e;
                        }
                        b bVar2 = hVar.e;
                        if (bVar2.j) {
                            float f = constraintWidget3.Y;
                            int i4 = bVar2.g;
                            bVar.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                        }
                    }
                }
            }
            if (bVar.j) {
                int i5 = bVar.g;
                a aVar = this.i;
                a aVar2 = this.h;
                if (i5 == i2) {
                    aVar2.d(e);
                    aVar.d(e2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.b;
                float f2 = i == 0 ? constraintWidget4.f0 : constraintWidget4.g0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                aVar2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                aVar.d(aVar2.g + bVar.g);
            }
        }
    }
}
