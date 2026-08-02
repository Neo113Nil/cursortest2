package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.uv31;
import defpackage.ws31;
import defpackage.wu31;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class ia30 {
    public qjx[] A;
    public final View b;
    public final int c;
    public mif[] j;
    public z33 k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final ta30 f = new ta30();
    public final ta30 g = new ta30();
    public final ha30 h = new ha30();
    public final ha30 i = new ha30();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public ia30(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public static void h(int i, int i2, int i3, Rect rect, Rect rect2) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(jhx jhxVar) {
        this.w.add(jhxVar);
    }

    public final float b(float[] fArr, float f) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        qbn qbnVar = this.f.a;
        Iterator it = this.u.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            ta30 ta30Var = (ta30) it.next();
            qbn qbnVar2 = ta30Var.a;
            if (qbnVar2 != null) {
                float f6 = ta30Var.c;
                if (f6 < f) {
                    qbnVar = qbnVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = ta30Var.c;
                }
            }
        }
        if (qbnVar == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float a = (((float) qbnVar.a(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) qbnVar.b(d);
        }
        return a;
    }

    public final void c(double d, float[] fArr, float[] fArr2) {
        float f;
        char c;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].c(d, dArr);
        this.j[0].f(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.o;
        ta30 ta30Var = this.f;
        float f3 = ta30Var.x;
        float f4 = ta30Var.y;
        float f5 = ta30Var.z;
        float f6 = ta30Var.A;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i = 0;
        while (i < iArr.length) {
            double[] dArr3 = dArr;
            float f10 = (float) dArr3[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                c = 4;
                f3 = f10;
                f7 = f11;
            } else if (i2 == 2) {
                c = 4;
                f4 = f10;
                f2 = f11;
            } else if (i2 != 3) {
                c = 4;
                if (i2 == 4) {
                    f6 = f10;
                    f9 = f11;
                }
            } else {
                c = 4;
                f5 = f10;
                f8 = f11;
            }
            i++;
            dArr = dArr3;
        }
        float f12 = (f8 / 2.0f) + f7;
        float f13 = (f9 / 2.0f) + f2;
        ia30 ia30Var = ta30Var.F;
        if (ia30Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            ia30Var.c(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float sin = (float) (((Math.sin(d3) * d2) + f14) - (f5 / 2.0f));
            float cos = (float) ((f15 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f7;
            f = 2.0f;
            double d5 = f2;
            float cos2 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f16);
            float sin2 = (float) ((Math.sin(d3) * d5) + (f17 - (Math.cos(d3) * d4)));
            f3 = sin;
            f4 = cos;
            f12 = cos2;
            f13 = sin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final void d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.v;
        float b = b(fArr2, f);
        mif[] mifVarArr = this.j;
        ta30 ta30Var = this.f;
        int i = 0;
        if (mifVarArr == null) {
            ta30 ta30Var2 = this.g;
            float f4 = ta30Var2.x - ta30Var.x;
            float f5 = ta30Var2.y - ta30Var.y;
            float f6 = ta30Var2.z - ta30Var.z;
            float f7 = (ta30Var2.A - ta30Var.A) + f5;
            fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
            fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
            return;
        }
        double d = b;
        mifVarArr[0].f(d, this.q);
        this.j[0].c(d, this.p);
        float f8 = fArr2[0];
        while (true) {
            dArr = this.q;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * f8;
            i++;
        }
        z33 z33Var = this.k;
        if (z33Var == null) {
            int[] iArr = this.o;
            double[] dArr2 = this.p;
            ta30Var.getClass();
            ta30.e(f2, f3, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.p;
        if (dArr3.length > 0) {
            z33Var.c(d, dArr3);
            this.k.f(d, this.q);
            int[] iArr2 = this.o;
            double[] dArr4 = this.q;
            double[] dArr5 = this.p;
            ta30Var.getClass();
            ta30.e(f2, f3, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f2 = i * 0.01010101f;
            double d3 = f2;
            qbn qbnVar = this.f.a;
            Iterator it = this.u.iterator();
            float f3 = Float.NaN;
            float f4 = 0.0f;
            while (it.hasNext()) {
                ta30 ta30Var = (ta30) it.next();
                qbn qbnVar2 = ta30Var.a;
                float f5 = f2;
                if (qbnVar2 != null) {
                    float f6 = ta30Var.c;
                    if (f6 < f5) {
                        f4 = f6;
                        qbnVar = qbnVar2;
                    } else if (Float.isNaN(f3)) {
                        f3 = ta30Var.c;
                    }
                }
                f2 = f5;
            }
            float f7 = f2;
            if (qbnVar != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                d3 = (((float) qbnVar.a((f7 - f4) / r8)) * (f3 - f4)) + f4;
            }
            this.j[0].c(d3, this.p);
            this.f.c(d3, this.o, this.p, fArr, 0);
            if (i > 0) {
                f += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f;
    }

    public final boolean f(float f, long j, thx thxVar, View view) {
        boolean z;
        View view2;
        boolean z2;
        float f2;
        uv31.a aVar;
        float f3;
        boolean z3;
        float f4;
        float f5;
        float f6;
        boolean z4;
        View view3 = view;
        uv31.a aVar2 = null;
        float b = b(null, f);
        int i = this.E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float floor = ((float) Math.floor(b / f7)) * f7;
            float f8 = (b % f7) / f7;
            if (!Float.isNaN(this.F)) {
                f8 = (f8 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            b = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + floor;
        }
        HashMap hashMap = this.y;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((wu31) it.next()).d(b, view3);
            }
        }
        HashMap hashMap2 = this.x;
        if (hashMap2 != null) {
            uv31.a aVar3 = null;
            z = false;
            for (uv31 uv31Var : hashMap2.values()) {
                if (uv31Var instanceof uv31.a) {
                    aVar3 = (uv31.a) uv31Var;
                } else {
                    z |= uv31Var.e(b, j, thxVar, view3);
                    view3 = view;
                }
            }
            aVar2 = aVar3;
        } else {
            z = false;
        }
        mif[] mifVarArr = this.j;
        ta30 ta30Var = this.f;
        if (mifVarArr != null) {
            double d = b;
            mifVarArr[0].c(d, this.p);
            this.j[0].f(d, this.q);
            z33 z33Var = this.k;
            if (z33Var != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    z33Var.c(d, dArr);
                    this.k.f(d, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                view2 = view;
                aVar = aVar2;
                f3 = 1.0f;
                z3 = z;
                f4 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z5 = this.d;
                float f9 = ta30Var.x;
                float f10 = ta30Var.y;
                float f11 = ta30Var.z;
                int i2 = 1;
                float f12 = ta30Var.A;
                aVar = aVar2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (ta30Var.I.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        ta30Var.I = new double[i3];
                        ta30Var.J = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                Arrays.fill(ta30Var.I, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = ta30Var.I;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    ta30Var.J[i5] = dArr3[i4];
                }
                float f13 = Float.NaN;
                float f14 = f2;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                float f17 = f5;
                float f18 = f16;
                while (true) {
                    double[] dArr5 = ta30Var.I;
                    f6 = f12;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z4 = z;
                    } else {
                        float f19 = (float) (Double.isNaN(ta30Var.I[i6]) ? 0.0d : ta30Var.I[i6] + 0.0d);
                        z4 = z;
                        float f20 = (float) ta30Var.J[i6];
                        if (i6 == i2) {
                            f9 = f19;
                            f14 = f20;
                        } else if (i6 == 2) {
                            f10 = f19;
                            f15 = f20;
                        } else if (i6 == 3) {
                            f17 = f19;
                            f18 = f20;
                        } else if (i6 == 4) {
                            f12 = f19;
                            f16 = f20;
                            i6++;
                            z = z4;
                            i2 = 1;
                        } else if (i6 == 5) {
                            f13 = f19;
                        }
                    }
                    f12 = f6;
                    i6++;
                    z = z4;
                    i2 = 1;
                }
                z3 = z;
                ia30 ia30Var = ta30Var.F;
                if (ia30Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    ia30Var.c(d, fArr, fArr2);
                    float f21 = fArr[0];
                    float f22 = fArr[1];
                    float f23 = fArr2[0];
                    float f24 = fArr2[1];
                    double d2 = f9;
                    double d3 = f10;
                    float sin = (float) (((Math.sin(d3) * d2) + f21) - (f17 / 2.0f));
                    float cos = (float) ((f22 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
                    double d4 = f14;
                    double d5 = f15;
                    float cos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + f23);
                    float sin2 = (float) ((Math.sin(d3) * d2 * d5) + (f24 - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin2;
                    }
                    if (Float.isNaN(f13)) {
                        view2 = view;
                    } else {
                        double degrees = Math.toDegrees(Math.atan2(sin2, cos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + f13));
                    }
                    f9 = sin;
                    f10 = cos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f13)) {
                        view2.setRotation(f13 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f15, (f18 / 2.0f) + f14))) + f2);
                    }
                }
                if (view2 instanceof lor) {
                    ((lor) view2).layout(f9, f10, f9 + f17, f10 + f6);
                } else {
                    float f25 = f9 + 0.5f;
                    int i7 = (int) f25;
                    float f26 = f10 + 0.5f;
                    int i8 = (int) f26;
                    int i9 = (int) (f25 + f17);
                    int i10 = (int) (f26 + f6);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z5) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view2.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.y;
            if (hashMap3 != null) {
                for (jst0 jst0Var : hashMap3.values()) {
                    if (jst0Var instanceof wu31.a) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((wu31.a) jst0Var).a(b) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr7 = this.q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                uv31.a aVar4 = aVar;
                view2.setRotation(aVar4.d(b, j, thxVar, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z2 = z3 | aVar4.h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                mif[] mifVarArr2 = this.j;
                if (i13 >= mifVarArr2.length) {
                    break;
                }
                mif mifVar = mifVarArr2[i13];
                float[] fArr3 = this.t;
                mifVar.d(d, fArr3);
                klf.b((c7e) ta30Var.G.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            ha30 ha30Var = this.h;
            if (ha30Var.b == 0) {
                if (b <= f2) {
                    view2.setVisibility(ha30Var.c);
                } else {
                    ha30 ha30Var2 = this.i;
                    if (b >= f3) {
                        view2.setVisibility(ha30Var2.c);
                    } else if (ha30Var2.c != ha30Var.c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    qjx[] qjxVarArr = this.A;
                    if (i14 >= qjxVarArr.length) {
                        break;
                    }
                    qjxVarArr[i14].h(b, view2);
                    i14++;
                }
            }
        } else {
            view2 = view;
            boolean z6 = z;
            float f27 = ta30Var.x;
            ta30 ta30Var2 = this.g;
            float b2 = g8e.b(ta30Var2.x, f27, b, f27);
            float f28 = ta30Var.y;
            float b3 = g8e.b(ta30Var2.y, f28, b, f28);
            float f29 = ta30Var.z;
            float f30 = ta30Var2.z;
            float b4 = g8e.b(f30, f29, b, f29);
            float f31 = ta30Var.A;
            float f32 = ta30Var2.A;
            float f33 = b2 + 0.5f;
            int i15 = (int) f33;
            float f34 = b3 + 0.5f;
            int i16 = (int) f34;
            int i17 = (int) (f33 + b4);
            int b5 = (int) (f34 + g8e.b(f32, f31, b, f31));
            int i18 = i17 - i15;
            int i19 = b5 - i16;
            if (f30 != f29 || f32 != f31 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view2.layout(i15, i16, i17, b5);
            z2 = z6;
        }
        HashMap hashMap4 = this.z;
        if (hashMap4 != null) {
            for (ws31 ws31Var : hashMap4.values()) {
                if (ws31Var instanceof ws31.a) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((ws31.a) ws31Var).a(b) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    ws31Var.f(b, view2);
                }
            }
        }
        return z2;
    }

    public final void g(ta30 ta30Var) {
        ta30Var.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:399:0x0ca6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0d23  */
    /* JADX WARN: Type inference failed for: r1v92, types: [vu31, wu31] */
    /* JADX WARN: Type inference failed for: r4v67, types: [tv31, uv31] */
    /* JADX WARN: Type inference failed for: r6v104, types: [wu31, xu31] */
    /* JADX WARN: Type inference failed for: r6v112, types: [wu31$a] */
    /* JADX WARN: Type inference failed for: r9v41, types: [uv31, vv31] */
    /* JADX WARN: Type inference failed for: r9v46, types: [uv31$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, int i2, long j) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet2;
        HashSet hashSet3;
        ta30 ta30Var;
        Object obj2;
        String str7;
        ArrayList arrayList2;
        ta30 ta30Var2;
        Object obj3;
        String str8;
        int i3;
        String str9;
        int i4;
        c7e c7eVar;
        HashSet hashSet4;
        String str10;
        HashMap hashMap;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        char c;
        char c2;
        sv31 sv31Var;
        String str12;
        Object obj6;
        sv31 sv31Var2;
        sv31 sv31Var3;
        c7e c7eVar2;
        Integer num;
        HashSet hashSet5;
        String str13;
        String str14;
        String str15;
        String str16;
        HashSet hashSet6;
        String str17;
        ArrayList arrayList3;
        Object obj7;
        Iterator it2;
        String str18;
        HashSet hashSet7;
        Object obj8;
        ta30 ta30Var3;
        Object obj9;
        ta30 ta30Var4;
        Object obj10;
        char c3;
        char c4;
        char c5;
        Object obj11;
        uu31 uu31Var;
        uu31 uu31Var2;
        c7e c7eVar3;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        float min;
        float f;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap hashMap2 = new HashMap();
        int i5 = this.B;
        ta30 ta30Var5 = this.f;
        if (i5 != -1) {
            ta30Var5.C = i5;
        }
        ha30 ha30Var = this.h;
        float f2 = ha30Var.x;
        ha30 ha30Var2 = this.i;
        if (ha30.c(f2, ha30Var2.x)) {
            hashSet9.add(CaretView.ALPHA_PROPERTY);
        }
        String str24 = "elevation";
        if (ha30.c(ha30Var.y, ha30Var2.y)) {
            hashSet9.add("elevation");
        }
        int i6 = ha30Var.c;
        int i7 = ha30Var2.c;
        if (i6 != i7 && ha30Var.b == 0 && (i6 == 0 || i7 == 0)) {
            hashSet9.add(CaretView.ALPHA_PROPERTY);
        }
        String str25 = "rotation";
        if (ha30.c(ha30Var.z, ha30Var2.z)) {
            hashSet9.add("rotation");
        }
        String str26 = "transitionPathRotate";
        if (!Float.isNaN(ha30Var.I) || !Float.isNaN(ha30Var2.I)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(ha30Var.J) || !Float.isNaN(ha30Var2.J)) {
            hashSet9.add("progress");
        }
        if (ha30.c(ha30Var.A, ha30Var2.A)) {
            hashSet9.add("rotationX");
        }
        if (ha30.c(ha30Var.a, ha30Var2.a)) {
            hashSet9.add("rotationY");
        }
        Object obj12 = "rotationX";
        if (ha30.c(ha30Var.D, ha30Var2.D)) {
            hashSet9.add("transformPivotX");
        }
        if (ha30.c(ha30Var.E, ha30Var2.E)) {
            hashSet9.add("transformPivotY");
        }
        String str27 = "scaleX";
        if (ha30.c(ha30Var.B, ha30Var2.B)) {
            hashSet9.add("scaleX");
        }
        Object obj13 = "rotationY";
        String str28 = "scaleY";
        if (ha30.c(ha30Var.C, ha30Var2.C)) {
            hashSet9.add("scaleY");
        }
        Object obj14 = "progress";
        if (ha30.c(ha30Var.F, ha30Var2.F)) {
            hashSet9.add("translationX");
        }
        Object obj15 = "translationX";
        String str29 = "translationY";
        if (ha30.c(ha30Var.G, ha30Var2.G)) {
            hashSet9.add("translationY");
        }
        if (ha30.c(ha30Var.H, ha30Var2.H)) {
            hashSet9.add("translationZ");
        }
        ta30 ta30Var6 = this.g;
        ArrayList arrayList4 = this.u;
        ArrayList arrayList5 = this.w;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it3.hasNext()) {
                jhx jhxVar = (jhx) it3.next();
                String str30 = str29;
                if (jhxVar instanceof ajx) {
                    ajx ajxVar = (ajx) jhxVar;
                    ta30 ta30Var7 = new ta30();
                    str23 = str27;
                    ta30Var7.b = 0;
                    ta30Var7.B = Float.NaN;
                    ta30Var7.C = -1;
                    ta30Var7.D = -1;
                    ta30Var7.E = Float.NaN;
                    ta30Var7.F = null;
                    ta30Var7.G = new LinkedHashMap();
                    ta30Var7.H = 0;
                    str19 = str28;
                    ta30Var7.I = new double[18];
                    ta30Var7.J = new double[18];
                    if (ta30Var5.D != -1) {
                        float f3 = ajxVar.a / 100.0f;
                        ta30Var7.c = f3;
                        ta30Var7.b = ajxVar.h;
                        ta30Var7.H = ajxVar.o;
                        float f4 = Float.isNaN(ajxVar.i) ? f3 : ajxVar.i;
                        str21 = str25;
                        float f5 = Float.isNaN(ajxVar.j) ? f3 : ajxVar.j;
                        str20 = str24;
                        float f6 = ta30Var6.z - ta30Var5.z;
                        float f7 = ta30Var6.A;
                        float f8 = ta30Var5.A;
                        ta30Var7.w = ta30Var7.c;
                        ta30Var7.z = (int) ((f6 * f4) + r11);
                        ta30Var7.A = (int) (((f7 - f8) * f5) + f8);
                        int i8 = ajxVar.o;
                        str22 = str26;
                        float f9 = ajxVar.k;
                        if (i8 != 2) {
                            float f10 = Float.isNaN(f9) ? f3 : ajxVar.k;
                            float f11 = ta30Var6.x;
                            float f12 = ta30Var5.x;
                            ta30Var7.x = g8e.b(f11, f12, f10, f12);
                            if (!Float.isNaN(ajxVar.l)) {
                                f3 = ajxVar.l;
                            }
                            float f13 = ta30Var6.y;
                            float f14 = ta30Var5.y;
                            ta30Var7.y = g8e.b(f13, f14, f3, f14);
                        } else {
                            if (Float.isNaN(f9)) {
                                float f15 = ta30Var6.x;
                                float f16 = ta30Var5.x;
                                min = g8e.b(f15, f16, f3, f16);
                            } else {
                                min = ajxVar.k * Math.min(f5, f4);
                            }
                            ta30Var7.x = min;
                            if (Float.isNaN(ajxVar.l)) {
                                float f17 = ta30Var6.y;
                                float f18 = ta30Var5.y;
                                f = g8e.b(f17, f18, f3, f18);
                            } else {
                                f = ajxVar.l;
                            }
                            ta30Var7.y = f;
                        }
                        ta30Var7.D = ta30Var5.D;
                        ta30Var7.a = qbn.c(ajxVar.f);
                        ta30Var7.C = ajxVar.g;
                    } else {
                        str20 = str24;
                        str21 = str25;
                        str22 = str26;
                        int i9 = ajxVar.o;
                        int i10 = ajxVar.a;
                        if (i9 == 1) {
                            float f19 = i10 / 100.0f;
                            ta30Var7.c = f19;
                            ta30Var7.b = ajxVar.h;
                            float f20 = Float.isNaN(ajxVar.i) ? f19 : ajxVar.i;
                            float f21 = Float.isNaN(ajxVar.j) ? f19 : ajxVar.j;
                            float f22 = ta30Var6.z - ta30Var5.z;
                            float f23 = f19;
                            float f24 = ta30Var6.A - ta30Var5.A;
                            ta30Var7.w = ta30Var7.c;
                            if (!Float.isNaN(ajxVar.k)) {
                                f23 = ajxVar.k;
                            }
                            float f25 = (ta30Var5.z / 2.0f) + ta30Var5.x;
                            float f26 = ta30Var5.y;
                            float f27 = ta30Var5.A;
                            float f28 = ((ta30Var6.z / 2.0f) + ta30Var6.x) - f25;
                            float f29 = ((ta30Var6.A / 2.0f) + ta30Var6.y) - ((f27 / 2.0f) + f26);
                            float f30 = f28 * f23;
                            float f31 = (f22 * f20) / 2.0f;
                            ta30Var7.x = (int) ((r8 + f30) - f31);
                            float f32 = f23 * f29;
                            float f33 = (f24 * f21) / 2.0f;
                            ta30Var7.y = (int) ((f26 + f32) - f33);
                            ta30Var7.z = (int) (r8 + r13);
                            ta30Var7.A = (int) (f27 + r15);
                            float f34 = Float.isNaN(ajxVar.l) ? 0.0f : ajxVar.l;
                            float f35 = (-f29) * f34;
                            float f36 = f28 * f34;
                            ta30Var7.H = 1;
                            float f37 = (int) ((ta30Var5.x + f30) - f31);
                            float f38 = (int) ((ta30Var5.y + f32) - f33);
                            ta30Var7.x = f37 + f35;
                            ta30Var7.y = f38 + f36;
                            ta30Var7.D = ta30Var7.D;
                            ta30Var7.a = qbn.c(ajxVar.f);
                            ta30Var7.C = ajxVar.g;
                        } else if (i9 == 2) {
                            float f39 = i10 / 100.0f;
                            ta30Var7.c = f39;
                            ta30Var7.b = ajxVar.h;
                            float f40 = Float.isNaN(ajxVar.i) ? f39 : ajxVar.i;
                            float f41 = Float.isNaN(ajxVar.j) ? f39 : ajxVar.j;
                            float f42 = ta30Var6.z;
                            float f43 = ta30Var5.z;
                            float f44 = f42 - f43;
                            float f45 = ta30Var6.A;
                            float f46 = ta30Var5.A;
                            float f47 = f45 - f46;
                            ta30Var7.w = ta30Var7.c;
                            float f48 = (f43 / 2.0f) + ta30Var5.x;
                            float f49 = ta30Var5.y;
                            float f50 = (f42 / 2.0f) + ta30Var6.x;
                            float f51 = ((f45 / 2.0f) + ta30Var6.y) - ((f46 / 2.0f) + f49);
                            float f52 = f44 * f40;
                            ta30Var7.x = (int) ((((f50 - f48) * f39) + r8) - (f52 / 2.0f));
                            float f53 = f47 * f41;
                            ta30Var7.y = (int) (((f51 * f39) + f49) - (f53 / 2.0f));
                            ta30Var7.z = (int) (f43 + f52);
                            ta30Var7.A = (int) (f46 + f53);
                            ta30Var7.H = 2;
                            if (!Float.isNaN(ajxVar.k)) {
                                ta30Var7.x = (int) (ajxVar.k * (i - ((int) ta30Var7.z)));
                            }
                            if (!Float.isNaN(ajxVar.l)) {
                                ta30Var7.y = (int) (ajxVar.l * (i2 - ((int) ta30Var7.A)));
                            }
                            ta30Var7.D = ta30Var7.D;
                            ta30Var7.a = qbn.c(ajxVar.f);
                            ta30Var7.C = ajxVar.g;
                        } else if (i9 != 3) {
                            float f54 = i10 / 100.0f;
                            ta30Var7.c = f54;
                            ta30Var7.b = ajxVar.h;
                            float f55 = Float.isNaN(ajxVar.i) ? f54 : ajxVar.i;
                            float f56 = Float.isNaN(ajxVar.j) ? f54 : ajxVar.j;
                            float f57 = ta30Var6.z;
                            float f58 = ta30Var5.z;
                            float f59 = f57 - f58;
                            float f60 = ta30Var6.A;
                            float f61 = ta30Var5.A;
                            float f62 = f60 - f61;
                            ta30Var7.w = ta30Var7.c;
                            float f63 = (f58 / 2.0f) + ta30Var5.x;
                            float f64 = ta30Var5.y;
                            float f65 = ((f57 / 2.0f) + ta30Var6.x) - f63;
                            float f66 = ((f60 / 2.0f) + ta30Var6.y) - ((f61 / 2.0f) + f64);
                            float f67 = (f59 * f55) / 2.0f;
                            ta30Var7.x = (int) (((f65 * f54) + r8) - f67);
                            float f68 = (f62 * f56) / 2.0f;
                            ta30Var7.y = (int) (((f66 * f54) + f64) - f68);
                            ta30Var7.z = (int) (f58 + r33);
                            ta30Var7.A = (int) (f61 + r41);
                            float f69 = Float.isNaN(ajxVar.k) ? f54 : ajxVar.k;
                            float f70 = Float.isNaN(ajxVar.n) ? 0.0f : ajxVar.n;
                            float f71 = f69;
                            float f72 = Float.isNaN(ajxVar.l) ? f54 : ajxVar.l;
                            float f73 = Float.isNaN(ajxVar.m) ? 0.0f : ajxVar.m;
                            ta30Var7.H = 0;
                            ta30Var7.x = (int) (((f73 * f66) + ((f71 * f65) + ta30Var5.x)) - f67);
                            ta30Var7.y = (int) (((f66 * f72) + ((f65 * f70) + ta30Var5.y)) - f68);
                            ta30Var7.a = qbn.c(ajxVar.f);
                            ta30Var7.C = ajxVar.g;
                        } else {
                            float f74 = i10 / 100.0f;
                            ta30Var7.c = f74;
                            ta30Var7.b = ajxVar.h;
                            float f75 = Float.isNaN(ajxVar.i) ? f74 : ajxVar.i;
                            float f76 = Float.isNaN(ajxVar.j) ? f74 : ajxVar.j;
                            float f77 = ta30Var6.z;
                            float f78 = ta30Var5.z;
                            float f79 = f77 - f78;
                            float f80 = ta30Var6.A;
                            float f81 = ta30Var5.A;
                            float f82 = f80 - f81;
                            ta30Var7.w = ta30Var7.c;
                            float f83 = (f78 / 2.0f) + ta30Var5.x;
                            float f84 = (f81 / 2.0f) + ta30Var5.y;
                            float f85 = (f77 / 2.0f) + ta30Var6.x;
                            float f86 = (f80 / 2.0f) + ta30Var6.y;
                            if (f83 > f85) {
                                f83 = f85;
                                f85 = f83;
                            }
                            if (f84 <= f86) {
                                f84 = f86;
                                f86 = f84;
                            }
                            float f87 = f85 - f83;
                            float f88 = f84 - f86;
                            float f89 = (f79 * f75) / 2.0f;
                            ta30Var7.x = (int) (((f87 * f74) + r8) - f89);
                            float f90 = (f82 * f76) / 2.0f;
                            ta30Var7.y = (int) (((f88 * f74) + r8) - f90);
                            ta30Var7.z = (int) (f78 + r33);
                            ta30Var7.A = (int) (f81 + r41);
                            float f91 = Float.isNaN(ajxVar.k) ? f74 : ajxVar.k;
                            float f92 = Float.isNaN(ajxVar.n) ? 0.0f : ajxVar.n;
                            float f93 = f91;
                            float f94 = Float.isNaN(ajxVar.l) ? f74 : ajxVar.l;
                            float f95 = Float.isNaN(ajxVar.m) ? 0.0f : ajxVar.m;
                            ta30Var7.H = 0;
                            ta30Var7.x = (int) (((f95 * f88) + ((f93 * f87) + ta30Var5.x)) - f89);
                            ta30Var7.y = (int) (((f88 * f94) + ((f87 * f92) + ta30Var5.y)) - f90);
                            ta30Var7.a = qbn.c(ajxVar.f);
                            ta30Var7.C = ajxVar.g;
                        }
                    }
                    if (Collections.binarySearch(arrayList4, ta30Var7) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + ta30Var7.w + "\" outside of range");
                    }
                    arrayList4.add((-r8) - 1, ta30Var7);
                    int i11 = ajxVar.e;
                    if (i11 != -1) {
                        this.e = i11;
                    }
                } else {
                    str19 = str28;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    str23 = str27;
                    if (jhxVar instanceof whx) {
                        jhxVar.d(hashSet10);
                    } else if (jhxVar instanceof ljx) {
                        jhxVar.d(hashSet8);
                    } else if (jhxVar instanceof qjx) {
                        ArrayList arrayList7 = arrayList6 == null ? new ArrayList() : arrayList6;
                        arrayList7.add((qjx) jhxVar);
                        arrayList6 = arrayList7;
                    } else {
                        jhxVar.f(hashMap2);
                        jhxVar.d(hashSet9);
                    }
                }
                str29 = str30;
                str27 = str23;
                str28 = str19;
                str25 = str21;
                str24 = str20;
                str26 = str22;
            }
            str = str28;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str31 = str24;
        String str32 = str25;
        String str33 = str26;
        String str34 = str29;
        String str35 = str27;
        if (arrayList != null) {
            this.A = (qjx[]) arrayList.toArray(new qjx[0]);
        }
        String str36 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            ta30Var = ta30Var6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            ta30Var2 = ta30Var5;
            obj3 = obj14;
        } else {
            this.y = new HashMap();
            Iterator it4 = hashSet9.iterator();
            while (it4.hasNext()) {
                String str37 = (String) it4.next();
                if (!str37.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str37.hashCode()) {
                        case -1249320806:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            if (str37.equals(obj10)) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1249320805:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            if (str37.equals(obj9)) {
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 1;
                                break;
                            }
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497657:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            if (str37.equals(obj8)) {
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 2;
                                break;
                            }
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497656:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            if (str37.equals(str18)) {
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 3;
                                break;
                            }
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1225497655:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            if (str37.equals("translationZ")) {
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 4;
                                break;
                            }
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -1001078227:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            if (str37.equals(obj7)) {
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 5;
                                break;
                            }
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189618:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            if (str37.equals(str17)) {
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 6;
                                break;
                            }
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -908189617:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str13)) {
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 7;
                                break;
                            }
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -797520672:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("waveVariesBy")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = '\b';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884510:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotX")) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = '\t';
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -760884509:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals("transformPivotY")) {
                                c4 = '\n';
                                String str38 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str38;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -40300674:
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str14)) {
                                c4 = 11;
                                String str382 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = c4;
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str382;
                                break;
                            }
                            str13 = str;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case -4379043:
                            str15 = str31;
                            str16 = str33;
                            if (str37.equals(str15)) {
                                str13 = str;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = '\f';
                                str14 = str32;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 37232917:
                            str16 = str33;
                            if (str37.equals(str16)) {
                                str13 = str;
                                str14 = str32;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = '\r';
                                str15 = str31;
                                break;
                            } else {
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = 65535;
                                break;
                            }
                        case 92909918:
                            if (str37.equals(CaretView.ALPHA_PROPERTY)) {
                                c5 = 14;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        case 156108012:
                            if (str37.equals("waveOffset")) {
                                c5 = 15;
                                str13 = str;
                                str14 = str32;
                                str15 = str31;
                                hashSet6 = hashSet10;
                                str17 = str35;
                                arrayList3 = arrayList4;
                                obj7 = obj14;
                                it2 = it4;
                                str18 = str34;
                                hashSet7 = hashSet9;
                                obj8 = obj15;
                                ta30Var3 = ta30Var5;
                                obj9 = obj13;
                                ta30Var4 = ta30Var6;
                                obj10 = obj12;
                                c3 = c5;
                                str16 = str33;
                                break;
                            }
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                        default:
                            str13 = str;
                            str14 = str32;
                            str15 = str31;
                            str16 = str33;
                            hashSet6 = hashSet10;
                            str17 = str35;
                            arrayList3 = arrayList4;
                            obj7 = obj14;
                            it2 = it4;
                            str18 = str34;
                            hashSet7 = hashSet9;
                            obj8 = obj15;
                            ta30Var3 = ta30Var5;
                            obj9 = obj13;
                            ta30Var4 = ta30Var6;
                            obj10 = obj12;
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(5);
                            break;
                        case 1:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(6);
                            break;
                        case 2:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(9);
                            break;
                        case 3:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(10);
                            break;
                        case 4:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(11);
                            break;
                        case 5:
                            obj11 = obj9;
                            obj12 = obj10;
                            ?? xu31Var = new xu31();
                            xu31Var.f = false;
                            uu31Var2 = xu31Var;
                            break;
                        case 6:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(7);
                            break;
                        case 7:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(8);
                            break;
                        case '\b':
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(0);
                            break;
                        case '\t':
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(2);
                            break;
                        case '\n':
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(3);
                            break;
                        case 11:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(4);
                            break;
                        case '\f':
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new uu31(1);
                            break;
                        case '\r':
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = new wu31.a();
                            break;
                        case 14:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var = new uu31(0);
                            uu31Var2 = uu31Var;
                            break;
                        case 15:
                            obj12 = obj10;
                            obj11 = obj9;
                            uu31Var = new uu31(0);
                            uu31Var2 = uu31Var;
                            break;
                        default:
                            obj11 = obj9;
                            obj12 = obj10;
                            uu31Var2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str37.split(",")[1];
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        jhx jhxVar2 = (jhx) it5.next();
                        HashSet hashSet11 = hashSet8;
                        HashMap hashMap3 = jhxVar2.d;
                        if (hashMap3 != null && (c7eVar3 = (c7e) hashMap3.get(str39)) != null) {
                            sparseArray.append(jhxVar2.a, c7eVar3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    ?? vu31Var = new vu31();
                    String str40 = str37.split(",")[1];
                    vu31Var.f = sparseArray;
                    obj11 = obj13;
                    str13 = str;
                    str14 = str32;
                    str15 = str31;
                    hashSet6 = hashSet10;
                    ta30Var4 = ta30Var6;
                    str17 = str35;
                    arrayList3 = arrayList4;
                    obj7 = obj14;
                    it2 = it4;
                    str18 = str34;
                    hashSet7 = hashSet9;
                    obj8 = obj15;
                    ta30Var3 = ta30Var5;
                    uu31Var2 = vu31Var;
                    str16 = str33;
                }
                if (uu31Var2 != null) {
                    uu31Var2.e = str37;
                    this.y.put(str37, uu31Var2);
                }
                str33 = str16;
                str31 = str15;
                str32 = str14;
                ta30Var6 = ta30Var4;
                ta30Var5 = ta30Var3;
                obj13 = obj11;
                hashSet8 = hashSet5;
                obj15 = obj8;
                hashSet9 = hashSet7;
                str34 = str18;
                it4 = it2;
                obj14 = obj7;
                arrayList4 = arrayList3;
                str35 = str17;
                hashSet10 = hashSet6;
                str = str13;
            }
            hashSet = hashSet8;
            obj = obj13;
            str2 = str34;
            str3 = str;
            str4 = str32;
            str5 = str31;
            str6 = str33;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            ta30Var = ta30Var6;
            obj2 = obj15;
            str7 = str35;
            arrayList2 = arrayList4;
            ta30Var2 = ta30Var5;
            obj3 = obj14;
            if (arrayList5 != null) {
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    jhx jhxVar3 = (jhx) it6.next();
                    if (jhxVar3 instanceof shx) {
                        jhxVar3.a(this.y);
                    }
                }
            }
            ha30Var.a(0, this.y);
            ha30Var2.a(100, this.y);
            Iterator it7 = this.y.keySet().iterator();
            while (it7.hasNext()) {
                String str41 = (String) it7.next();
                int intValue = (!hashMap2.containsKey(str41) || (num = (Integer) hashMap2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it8 = it7;
                jst0 jst0Var = (jst0) this.y.get(str41);
                if (jst0Var != null) {
                    jst0Var.c(intValue);
                }
                it7 = it8;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                String str42 = (String) it9.next();
                if (!this.x.containsKey(str42)) {
                    if (str42.startsWith(str36)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it9;
                        String str43 = str42.split(",")[1];
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            String str44 = str36;
                            jhx jhxVar4 = (jhx) it10.next();
                            HashMap hashMap4 = hashMap2;
                            HashMap hashMap5 = jhxVar4.d;
                            if (hashMap5 != null && (c7eVar2 = (c7e) hashMap5.get(str43)) != null) {
                                sparseArray2.append(jhxVar4.a, c7eVar2);
                            }
                            hashMap2 = hashMap4;
                            str36 = str44;
                        }
                        hashMap = hashMap2;
                        str11 = str36;
                        ?? tv31Var = new tv31();
                        tv31Var.m = new SparseArray();
                        tv31Var.k = str42.split(",")[1];
                        tv31Var.l = sparseArray2;
                        str12 = str6;
                        obj6 = obj2;
                        sv31Var2 = tv31Var;
                        obj4 = obj12;
                        obj5 = obj;
                    } else {
                        hashMap = hashMap2;
                        it = it9;
                        str11 = str36;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj12;
                                obj5 = obj;
                                if (str42.equals(obj4)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj12;
                                    c = 1;
                                    break;
                                } else {
                                    obj4 = obj12;
                                    c = 65535;
                                    break;
                                }
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 2;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497656:
                                if (str42.equals(str2)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 3;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 4;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 5;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189618:
                                if (str42.equals(str7)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 6;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -908189617:
                                if (str42.equals(str3)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = 7;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -40300674:
                                if (str42.equals(str4)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\b';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case -4379043:
                                if (str42.equals(str5)) {
                                    obj4 = obj12;
                                    obj5 = obj;
                                    c = '\t';
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 37232917:
                                if (str42.equals(str6)) {
                                    c2 = '\n';
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            case 92909918:
                                if (str42.equals(CaretView.ALPHA_PROPERTY)) {
                                    c2 = 11;
                                    c = c2;
                                    obj4 = obj12;
                                    obj5 = obj;
                                    break;
                                }
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                            default:
                                obj4 = obj12;
                                obj5 = obj;
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                sv31Var = new sv31(3);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 1:
                                sv31Var = new sv31(4);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 2:
                                sv31Var = new sv31(7);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 3:
                                sv31Var = new sv31(8);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 4:
                                sv31Var = new sv31(9);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 5:
                                ?? vv31Var = new vv31();
                                vv31Var.k = false;
                                sv31Var = vv31Var;
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 6:
                                sv31Var = new sv31(5);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 7:
                                sv31Var = new sv31(6);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case '\b':
                                sv31Var = new sv31(2);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case '\t':
                                sv31Var = new sv31(1);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case '\n':
                                sv31Var = new uv31.a();
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            case 11:
                                sv31Var = new sv31(0);
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var.i = j;
                                sv31Var3 = sv31Var;
                                break;
                            default:
                                str12 = str6;
                                obj6 = obj2;
                                sv31Var2 = null;
                                break;
                        }
                        if (sv31Var3 != null) {
                            sv31Var3.f = str42;
                            this.x.put(str42, sv31Var3);
                        }
                        obj12 = obj4;
                        obj = obj5;
                        obj2 = obj6;
                        it9 = it;
                        hashMap2 = hashMap;
                        str36 = str11;
                        str6 = str12;
                    }
                    sv31Var3 = sv31Var2;
                    if (sv31Var3 != null) {
                    }
                    obj12 = obj4;
                    obj = obj5;
                    obj2 = obj6;
                    it9 = it;
                    hashMap2 = hashMap;
                    str36 = str11;
                    str6 = str12;
                }
            }
            HashMap hashMap6 = hashMap2;
            str8 = str36;
            if (arrayList5 != null) {
                Iterator it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    jhx jhxVar5 = (jhx) it11.next();
                    if (jhxVar5 instanceof ljx) {
                        ((ljx) jhxVar5).h(this.x);
                    }
                }
            }
            for (String str45 : this.x.keySet()) {
                HashMap hashMap7 = hashMap6;
                ((uv31) this.x.get(str45)).c(hashMap7.containsKey(str45) ? ((Integer) hashMap7.get(str45)).intValue() : 0);
                hashMap6 = hashMap7;
            }
        }
        int size = arrayList2.size();
        int i12 = size + 2;
        ta30[] ta30VarArr = new ta30[i12];
        ta30VarArr[0] = ta30Var2;
        ta30VarArr[size + 1] = ta30Var;
        if (arrayList2.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator it12 = arrayList2.iterator();
        int i13 = 1;
        while (it12.hasNext()) {
            ta30VarArr[i13] = (ta30) it12.next();
            i13++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : ta30Var.G.keySet()) {
            ta30 ta30Var8 = ta30Var2;
            if (ta30Var8.G.containsKey(str46)) {
                str10 = str8;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str10 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str10 = str8;
            }
            ta30Var2 = ta30Var8;
            str8 = str10;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i14 < strArr2.length) {
                String str47 = strArr2[i14];
                this.s[i14] = 0;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        break;
                    }
                    if (!ta30VarArr[i15].G.containsKey(str47) || (c7eVar = (c7e) ta30VarArr[i15].G.get(str47)) == null) {
                        i15++;
                    } else {
                        int[] iArr = this.s;
                        iArr[i14] = c7eVar.d() + iArr[i14];
                    }
                }
                i14++;
            } else {
                boolean z = ta30VarArr[0].C != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i16 = 1; i16 < i12; i16++) {
                    ta30 ta30Var9 = ta30VarArr[i16];
                    ta30 ta30Var10 = ta30VarArr[i16 - 1];
                    boolean b = ta30.b(ta30Var9.x, ta30Var10.x);
                    boolean b2 = ta30.b(ta30Var9.y, ta30Var10.y);
                    zArr[0] = zArr[0] | ta30.b(ta30Var9.w, ta30Var10.w);
                    boolean z2 = b | b2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | ta30.b(ta30Var9.z, ta30Var10.z);
                    zArr[4] = ta30.b(ta30Var9.A, ta30Var10.A) | zArr[4];
                }
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        i17++;
                    }
                }
                this.o = new int[i17];
                int max = Math.max(2, i17);
                this.p = new double[max];
                this.q = new double[max];
                int i19 = 0;
                for (int i20 = 1; i20 < length; i20++) {
                    if (zArr[i20]) {
                        this.o[i19] = i20;
                        i19++;
                    }
                }
                int[] iArr2 = {i12, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i12];
                int i21 = 0;
                while (i21 < i12) {
                    ta30 ta30Var11 = ta30VarArr[i21];
                    double[] dArr3 = dArr[i21];
                    int[] iArr3 = this.o;
                    ta30[] ta30VarArr2 = ta30VarArr;
                    int i22 = 6;
                    float[] fArr = {ta30Var11.w, ta30Var11.x, ta30Var11.y, ta30Var11.z, ta30Var11.A, ta30Var11.B};
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr3.length) {
                        if (iArr3[i23] < i22) {
                            dArr3[i24] = fArr[r11];
                            i24++;
                        }
                        i23++;
                        i22 = 6;
                    }
                    dArr2[i21] = ta30VarArr2[i21].c;
                    i21++;
                    ta30VarArr = ta30VarArr2;
                }
                ta30[] ta30VarArr3 = ta30VarArr;
                int i25 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i25 < iArr4.length) {
                        if (iArr4[i25] < 6) {
                            String t = oyr.t(new StringBuilder(), ta30.K[this.o[i25]], " [");
                            for (int i26 = 0; i26 < i12; i26++) {
                                StringBuilder t2 = qv10.t(t);
                                t2.append(dArr[i26][i25]);
                                t = t2.toString();
                            }
                        }
                        i25++;
                    } else {
                        this.j = new mif[this.r.length + 1];
                        int i27 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i27 >= strArr3.length) {
                                this.j[0] = mif.a(this.e, dArr2, dArr);
                                if (ta30VarArr3[0].C != -1) {
                                    int[] iArr5 = new int[i12];
                                    double[] dArr4 = new double[i12];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                    for (int i28 = 0; i28 < i12; i28++) {
                                        iArr5[i28] = ta30VarArr3[i28].C;
                                        dArr4[i28] = r5.c;
                                        double[] dArr6 = dArr5[i28];
                                        dArr6[0] = r5.x;
                                        dArr6[1] = r5.y;
                                    }
                                    this.k = new z33(iArr5, dArr4, dArr5);
                                }
                                this.z = new HashMap();
                                if (arrayList5 != null) {
                                    Iterator it13 = hashSet3.iterator();
                                    float f96 = Float.NaN;
                                    while (it13.hasNext()) {
                                        String str48 = (String) it13.next();
                                        ws31 e = ws31.e(str48);
                                        if (e != null) {
                                            if (e.e == 1 && Float.isNaN(f96)) {
                                                f96 = e();
                                            }
                                            e.b = str48;
                                            this.z.put(str48, e);
                                        }
                                    }
                                    Iterator it14 = arrayList5.iterator();
                                    while (it14.hasNext()) {
                                        jhx jhxVar6 = (jhx) it14.next();
                                        if (jhxVar6 instanceof whx) {
                                            ((whx) jhxVar6).h(this.z);
                                        }
                                    }
                                    Iterator it15 = this.z.values().iterator();
                                    while (it15.hasNext()) {
                                        ((ws31) it15.next()).d();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str49 = strArr3[i27];
                            int i29 = 0;
                            int i30 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i29 < i12) {
                                if (ta30VarArr3[i29].G.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i12];
                                        c7e c7eVar4 = (c7e) ta30VarArr3[i29].G.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, c7eVar4 == null ? 0 : c7eVar4.d());
                                    }
                                    ta30 ta30Var12 = ta30VarArr3[i29];
                                    dArr7[i30] = ta30Var12.c;
                                    double[] dArr9 = dArr8[i30];
                                    c7e c7eVar5 = (c7e) ta30Var12.G.get(str49);
                                    if (c7eVar5 != null) {
                                        if (c7eVar5.d() == 1) {
                                            dArr9[0] = c7eVar5.b();
                                        } else {
                                            int d = c7eVar5.d();
                                            c7eVar5.c(new float[d]);
                                            int i31 = 0;
                                            int i32 = 0;
                                            while (i31 < d) {
                                                dArr9[i32] = r14[i31];
                                                i31++;
                                                str49 = str49;
                                                i32++;
                                                i27 = i27;
                                                i29 = i29;
                                            }
                                        }
                                    }
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                    i30++;
                                } else {
                                    i3 = i27;
                                    str9 = str49;
                                    i4 = i29;
                                }
                                i29 = i4 + 1;
                                str49 = str9;
                                i27 = i3;
                            }
                            int i33 = i27;
                            double[] copyOf = Arrays.copyOf(dArr7, i30);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i30);
                            int i34 = i33 + 1;
                            this.j[i34] = mif.a(this.e, copyOf, dArr10);
                            i27 = i34;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        ta30 ta30Var = this.f;
        sb.append(ta30Var.x);
        sb.append(" y: ");
        sb.append(ta30Var.y);
        sb.append(" end: x: ");
        ta30 ta30Var2 = this.g;
        sb.append(ta30Var2.x);
        sb.append(" y: ");
        sb.append(ta30Var2.y);
        return sb.toString();
    }
}
