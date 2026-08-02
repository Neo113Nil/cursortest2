package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class ljx extends jhx {
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
    public int r = 0;
    public float s = Float.NaN;
    public float t = 0.0f;

    public ljx() {
        this.d = new HashMap();
    }

    @Override // defpackage.jhx
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jhx
    /* renamed from: b */
    public final jhx clone() {
        ljx ljxVar = new ljx();
        super.c(this);
        ljxVar.e = this.e;
        ljxVar.r = this.r;
        ljxVar.s = this.s;
        ljxVar.t = this.t;
        ljxVar.q = this.q;
        ljxVar.f = this.f;
        ljxVar.g = this.g;
        ljxVar.h = this.h;
        ljxVar.k = this.k;
        ljxVar.i = this.i;
        ljxVar.j = this.j;
        ljxVar.l = this.l;
        ljxVar.m = this.m;
        ljxVar.n = this.n;
        ljxVar.o = this.o;
        ljxVar.p = this.p;
        return ljxVar;
    }

    @Override // defpackage.jhx
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add(CaretView.ALPHA_PROPERTY);
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
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.jhx
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.KeyTimeCycle);
        SparseIntArray sparseIntArray = kjx.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = kjx.a;
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
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
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
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
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
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 18:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    } else {
                        this.r = obtainStyledAttributes.getInt(index, this.r);
                        break;
                    }
                case 20:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 21:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.t;
                    if (i2 == 5) {
                        this.t = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.t = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
            }
        }
    }

    @Override // defpackage.jhx
    public final void f(HashMap hashMap) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            hashMap.put(CaretView.ALPHA_PROPERTY, Integer.valueOf(this.e));
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
        if (!Float.isNaN(this.n)) {
            hashMap.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            hashMap.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            hashMap.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            hashMap.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            hashMap.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(g8e.o("CUSTOM,", (String) it.next()), Integer.valueOf(this.e));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00e2, code lost:
    
        if (r1.equals("rotationY") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            uv31 uv31Var = (uv31) hashMap.get(str);
            if (uv31Var != null) {
                char c = 1;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals(CaretView.ALPHA_PROPERTY)) {
                                c = 11;
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
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                uv31Var.b(this.i, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                uv31Var.b(this.j, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                uv31Var.b(this.n, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                uv31Var.b(this.o, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                uv31Var.b(this.p, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                uv31Var.b(this.q, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                uv31Var.b(this.l, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                uv31Var.b(this.m, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                uv31Var.b(this.h, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                uv31Var.b(this.g, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                uv31Var.b(this.k, this.s, this.t, this.a, this.r);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                uv31Var.b(this.f, this.s, this.t, this.a, this.r);
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    c7e c7eVar = (c7e) this.d.get(str.substring(7));
                    if (c7eVar != null) {
                        tv31 tv31Var = (tv31) uv31Var;
                        int i = this.a;
                        float f = this.s;
                        int i2 = this.r;
                        float f2 = this.t;
                        tv31Var.l.append(i, c7eVar);
                        tv31Var.m.append(i, new float[]{f, f2});
                        tv31Var.b = Math.max(tv31Var.b, i2);
                    }
                }
            }
        }
    }
}
