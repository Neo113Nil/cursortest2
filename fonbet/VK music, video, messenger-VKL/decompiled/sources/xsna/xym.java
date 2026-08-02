package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Dimension.java */
/* loaded from: classes11.dex */
public final class xym {
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");
    public static final String m = new String("RATIO_DIMENSION");
    public String f;
    public int a = 0;
    public int b = Integer.MAX_VALUE;
    public float c = 1.0f;
    public int d = 0;
    public String e = null;
    public boolean g = false;

    public xym(String str) {
        this.f = str;
    }

    public static xym b(int i2) {
        xym xymVar = new xym(h);
        xymVar.f = null;
        xymVar.d = i2;
        return xymVar;
    }

    public static xym c(String str) {
        xym xymVar = new xym();
        xymVar.a = 0;
        xymVar.b = Integer.MAX_VALUE;
        xymVar.c = 1.0f;
        xymVar.d = 0;
        xymVar.e = null;
        xymVar.f = str;
        xymVar.g = true;
        return xymVar;
    }

    public final void a(ConstraintWidget constraintWidget, int i2) {
        String str = this.e;
        if (str != null) {
            constraintWidget.O(str);
        }
        String str2 = k;
        int i3 = 2;
        String str3 = l;
        String str4 = i;
        if (i2 == 0) {
            if (this.g) {
                constraintWidget.S(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                String str5 = this.f;
                if (str5 == str4) {
                    i3 = 1;
                } else if (str5 != str3) {
                    i3 = 0;
                }
                constraintWidget.T(this.c, i3, this.a, this.b);
                return;
            }
            int i4 = this.a;
            if (i4 > 0) {
                if (i4 < 0) {
                    constraintWidget.e0 = 0;
                } else {
                    constraintWidget.e0 = i4;
                }
            }
            int i5 = this.b;
            if (i5 < Integer.MAX_VALUE) {
                constraintWidget.D[0] = i5;
            }
            String str6 = this.f;
            if (str6 == str4) {
                constraintWidget.S(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (str6 == str2) {
                constraintWidget.S(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (str6 == null) {
                    constraintWidget.S(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.W(this.d);
                    return;
                }
                return;
            }
        }
        if (this.g) {
            constraintWidget.U(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            String str7 = this.f;
            if (str7 == str4) {
                i3 = 1;
            } else if (str7 != str3) {
                i3 = 0;
            }
            constraintWidget.V(this.c, i3, this.a, this.b);
            return;
        }
        int i6 = this.a;
        if (i6 > 0) {
            if (i6 < 0) {
                constraintWidget.f0 = 0;
            } else {
                constraintWidget.f0 = i6;
            }
        }
        int i7 = this.b;
        if (i7 < Integer.MAX_VALUE) {
            constraintWidget.D[1] = i7;
        }
        String str8 = this.f;
        if (str8 == str4) {
            constraintWidget.U(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (str8 == str2) {
            constraintWidget.U(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (str8 == null) {
            constraintWidget.U(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.R(this.d);
        }
    }
}
