package xsna;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class pnx0 implements hzl {
    public int a;
    public ConstraintWidget b;
    public xrg0 c;
    public ConstraintWidget.DimensionBehaviour d;
    public final azm e = new azm(this);
    public int f = 0;
    public boolean g = false;
    public final mzl h = new mzl(this);
    public final mzl i = new mzl(this);
    public b j = b.NONE;

    /* compiled from: WidgetRun.java */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetRun.java */
    /* loaded from: classes11.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CENTER;
        public static final b END;
        public static final b NONE;
        public static final b START;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("START", 1);
            START = bVar2;
            b bVar3 = new b("END", 2);
            END = bVar3;
            b bVar4 = new b("CENTER", 3);
            CENTER = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public pnx0(ConstraintWidget constraintWidget) {
        this.b = constraintWidget;
    }

    public static void b(mzl mzlVar, mzl mzlVar2, int i) {
        mzlVar.l.add(mzlVar2);
        mzlVar.f = i;
        mzlVar2.k.add(mzlVar);
    }

    public static mzl h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        int i = a.a[constraintAnchor2.e.ordinal()];
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

    public static mzl i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.d;
        pnx0 pnx0Var = i == 0 ? constraintWidget.d : constraintWidget.e;
        int i2 = a.a[constraintAnchor2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pnx0Var.i;
        }
        return pnx0Var.h;
    }

    public final void c(mzl mzlVar, mzl mzlVar2, int i, azm azmVar) {
        mzlVar.l.add(mzlVar2);
        mzlVar.l.add(this.e);
        mzlVar.h = i;
        mzlVar.i = azmVar;
        mzlVar2.k.add(mzlVar);
        azmVar.k.add(mzlVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.b;
            int i3 = constraintWidget.w;
            int max = Math.max(constraintWidget.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.b;
            int i4 = constraintWidget2.z;
            int max2 = Math.max(constraintWidget2.y, i);
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
            return r0.g;
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
    public final void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        mzl h = h(constraintAnchor);
        mzl h2 = h(constraintAnchor2);
        if (h.j && h2.j) {
            int e = constraintAnchor.e() + h.g;
            int e2 = h2.g - constraintAnchor2.e();
            int i2 = e2 - e;
            azm azmVar = this.e;
            if (!azmVar.j) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i3 = this.a;
                    if (i3 == 0) {
                        azmVar.d(g(i2, i));
                    } else if (i3 == 1) {
                        azmVar.d(Math.min(g(azmVar.m, i), i2));
                    } else if (i3 == 2) {
                        ConstraintWidget constraintWidget = this.b;
                        ConstraintWidget constraintWidget2 = constraintWidget.W;
                        if (constraintWidget2 != null) {
                            if ((i == 0 ? constraintWidget2.d : constraintWidget2.e).e.j) {
                                azmVar.d(g((int) ((r6.g * (i == 0 ? constraintWidget.x : constraintWidget.A)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        ConstraintWidget constraintWidget3 = this.b;
                        pnx0 pnx0Var = constraintWidget3.d;
                        if (pnx0Var.d == dimensionBehaviour2 && pnx0Var.a == 3) {
                            fpr0 fpr0Var = constraintWidget3.e;
                            if (fpr0Var.d == dimensionBehaviour2) {
                            }
                        }
                        if (i == 0) {
                            pnx0Var = constraintWidget3.e;
                        }
                        if (pnx0Var.e.j) {
                            float f = constraintWidget3.Z;
                            azmVar.d(i == 1 ? (int) ((r6.g / f) + 0.5f) : (int) ((f * r6.g) + 0.5f));
                        }
                    }
                }
            }
            if (azmVar.j) {
                int i4 = azmVar.g;
                mzl mzlVar = this.i;
                mzl mzlVar2 = this.h;
                if (i4 == i2) {
                    mzlVar2.d(e);
                    mzlVar.d(e2);
                    return;
                }
                float f2 = i == 0 ? this.b.g0 : this.b.h0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                mzlVar2.d((int) ((((e2 - e) - i4) * f2) + e + 0.5f));
                mzlVar.d(mzlVar2.g + azmVar.g);
            }
        }
    }

    @Override // xsna.hzl
    public void a(hzl hzlVar) {
    }
}
