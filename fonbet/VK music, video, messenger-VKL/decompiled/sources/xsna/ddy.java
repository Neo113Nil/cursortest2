package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import xsna.w0u0;

/* compiled from: KeyAttributes.java */
/* loaded from: classes11.dex */
public final class ddy extends zcy {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;

    /* compiled from: KeyAttributes.java */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public ddy() {
        this.d = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x009c, code lost:
    
        if (r1.equals("scaleY") == false) goto L15;
     */
    @Override // xsna.zcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap<String, w0u0> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            w0u0 w0u0Var = hashMap.get(next);
            if (w0u0Var != null) {
                char c = 7;
                if (!next.startsWith("CUSTOM")) {
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.i)) {
                                w0u0Var.b(this.i, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!Float.isNaN(this.j)) {
                                w0u0Var.b(this.j, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!Float.isNaN(this.p)) {
                                w0u0Var.b(this.p, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!Float.isNaN(this.q)) {
                                w0u0Var.b(this.q, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!Float.isNaN(this.r)) {
                                w0u0Var.b(this.r, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!Float.isNaN(this.s)) {
                                w0u0Var.b(this.s, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!Float.isNaN(this.n)) {
                                w0u0Var.b(this.n, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!Float.isNaN(this.o)) {
                                w0u0Var.b(this.o, this.a);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!Float.isNaN(this.i)) {
                                w0u0Var.b(this.k, this.a);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!Float.isNaN(this.j)) {
                                w0u0Var.b(this.l, this.a);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!Float.isNaN(this.h)) {
                                w0u0Var.b(this.h, this.a);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!Float.isNaN(this.g)) {
                                w0u0Var.b(this.g, this.a);
                                break;
                            } else {
                                break;
                            }
                        case '\f':
                            if (!Float.isNaN(this.m)) {
                                w0u0Var.b(this.m, this.a);
                                break;
                            } else {
                                break;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f)) {
                                w0u0Var.b(this.f, this.a);
                                break;
                            } else {
                                break;
                            }
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.d.get(next.substring(7));
                    if (constraintAttribute != null) {
                        ((w0u0.b) w0u0Var).f.append(this.a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // xsna.zcy
    /* renamed from: b */
    public final zcy clone() {
        ddy ddyVar = new ddy();
        super.c(this);
        ddyVar.e = this.e;
        ddyVar.f = this.f;
        ddyVar.g = this.g;
        ddyVar.h = this.h;
        ddyVar.i = this.i;
        ddyVar.j = this.j;
        ddyVar.k = this.k;
        ddyVar.l = this.l;
        ddyVar.m = this.m;
        ddyVar.n = this.n;
        ddyVar.o = this.o;
        ddyVar.p = this.p;
        ddyVar.q = this.q;
        ddyVar.r = this.r;
        ddyVar.s = this.s;
        return ddyVar;
    }

    @Override // xsna.zcy
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // xsna.zcy
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.H0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 12:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = obtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 20:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
            }
        }
    }

    @Override // xsna.zcy
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            hashMap.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            hashMap.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            hashMap.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.r)) {
            hashMap.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            hashMap.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.s)) {
            hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(go9.b("CUSTOM,", it.next()), Integer.valueOf(this.e));
            }
        }
    }

    public final void i(String str, Number number) {
        switch (str) {
            case "motionProgress":
                this.s = zcy.g(number);
                break;
            case "transitionEasing":
                number.toString();
                break;
            case "rotationX":
                this.i = zcy.g(number);
                break;
            case "rotationY":
                this.j = zcy.g(number);
                break;
            case "translationX":
                this.p = zcy.g(number);
                break;
            case "translationY":
                this.q = zcy.g(number);
                break;
            case "translationZ":
                this.r = zcy.g(number);
                break;
            case "scaleX":
                this.n = zcy.g(number);
                break;
            case "scaleY":
                this.o = zcy.g(number);
                break;
            case "transformPivotX":
                this.k = zcy.g(number);
                break;
            case "transformPivotY":
                this.l = zcy.g(number);
                break;
            case "rotation":
                this.h = zcy.g(number);
                break;
            case "elevation":
                this.g = zcy.g(number);
                break;
            case "transitionPathRotate":
                this.m = zcy.g(number);
                break;
            case "alpha":
                this.f = zcy.g(number);
                break;
            case "curveFit":
                this.e = zcy.h(number);
                break;
            case "visibility":
                Boolean.parseBoolean(number.toString());
                break;
        }
    }
}
