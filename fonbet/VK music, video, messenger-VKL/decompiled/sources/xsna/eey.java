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
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import xsna.i1u0;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes11.dex */
public final class eey extends zcy {
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
    public float t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* compiled from: KeyTimeCycle.java */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public eey() {
        this.d = new HashMap<>();
    }

    @Override // xsna.zcy
    public final void a(HashMap<String, w0u0> hashMap) {
        throw null;
    }

    @Override // xsna.zcy
    /* renamed from: b */
    public final zcy clone() {
        eey eeyVar = new eey();
        super.c(this);
        eeyVar.e = this.e;
        eeyVar.r = this.r;
        eeyVar.s = this.s;
        eeyVar.t = this.t;
        eeyVar.q = this.q;
        eeyVar.f = this.f;
        eeyVar.g = this.g;
        eeyVar.h = this.h;
        eeyVar.k = this.k;
        eeyVar.i = this.i;
        eeyVar.j = this.j;
        eeyVar.l = this.l;
        eeyVar.m = this.m;
        eeyVar.n = this.n;
        eeyVar.o = this.o;
        eeyVar.p = this.p;
        return eeyVar;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k);
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
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.t = obtainStyledAttributes.getDimension(index, this.t);
                        break;
                    } else {
                        this.t = obtainStyledAttributes.getFloat(index, this.t);
                        break;
                    }
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
            hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(go9.b("CUSTOM,", it.next()), Integer.valueOf(this.e));
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
    public final void i(HashMap<String, i1u0> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            i1u0 i1u0Var = hashMap.get(next);
            if (i1u0Var != null) {
                char c = 1;
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
                            if (next.equals("scaleY")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
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
                            if (!Float.isNaN(this.i)) {
                                i1u0Var.b(this.i, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (!Float.isNaN(this.j)) {
                                i1u0Var.b(this.j, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (!Float.isNaN(this.n)) {
                                i1u0Var.b(this.n, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (!Float.isNaN(this.o)) {
                                i1u0Var.b(this.o, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (!Float.isNaN(this.p)) {
                                i1u0Var.b(this.p, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (!Float.isNaN(this.q)) {
                                i1u0Var.b(this.q, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (!Float.isNaN(this.l)) {
                                i1u0Var.b(this.l, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (!Float.isNaN(this.m)) {
                                i1u0Var.b(this.m, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            if (!Float.isNaN(this.h)) {
                                i1u0Var.b(this.h, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case '\t':
                            if (!Float.isNaN(this.g)) {
                                i1u0Var.b(this.g, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case '\n':
                            if (!Float.isNaN(this.k)) {
                                i1u0Var.b(this.k, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (!Float.isNaN(this.f)) {
                                i1u0Var.b(this.f, this.s, this.t, this.a, this.r);
                                break;
                            } else {
                                break;
                            }
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.d.get(next.substring(7));
                    if (constraintAttribute != null) {
                        i1u0.b bVar = (i1u0.b) i1u0Var;
                        int i = this.a;
                        float f = this.s;
                        int i2 = this.r;
                        float f2 = this.t;
                        bVar.j.append(i, constraintAttribute);
                        bVar.k.append(i, new float[]{f, f2});
                        bVar.b = Math.max(bVar.b, i2);
                    }
                }
            }
        }
    }
}
